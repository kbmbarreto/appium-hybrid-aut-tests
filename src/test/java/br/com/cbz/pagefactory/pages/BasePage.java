package br.com.cbz.pagefactory.pages;

import br.com.cbz.utils.DIRECTION;
import br.com.cbz.utils.Utils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

public class BasePage extends Utils {

    /**
     *  Aguarda o elemento estar visivel
     * @param el MobileElement para aguardar estar visivel
     */
    public static void visibilityOf(MobileElement el) {
        getDriverWait().until(
                webDriver -> ExpectedConditions.visibilityOf(el).apply(webDriver)
        );
    }

    /**
     *  Aguarda o elemento ser clicavel
     * @param el MobileElement aguardar ser clicavél
     */
    public static void toBeClickable(MobileElement el) {
        getDriverWait().until(
                webDriver -> ExpectedConditions.elementToBeClickable(el).apply(webDriver)
        );
    }

    /**
     * Método aguarda o elemento ser tocavel e após realiza o toque.
     * @param el MobileElement para realizar o toque
     */
    public static void tap(MobileElement el) {
        toBeClickable(el);
        el.click();
    }

    /**
     * Método para extrair um texto de um elemento
     * @param el MobileElement para buscar o texto
     * @return o texto encontrado/buscado
     */
    public static String getText(MobileElement el) {
        visibilityOf(el);
        return el.getText();
    }

    /**
     * Aguarda o elemento estar visivel e adicionar caracteres no elemento.
     * @param el MobileElement para realizar preencher o campo
     * @param text Texto que será inserido
     */
    public static void sendKeys(MobileElement el, String text) {
        visibilityOf(el);
        el.sendKeys(text);
    }

    /**
     * Método para realizar o swipe/scroll em todas as direções
     * @param dir DIRECTION.RIGHT, DIRECTION.LEFT, DIRECTION.UP and DIRECTION.DOWN
     */
    public void swipeOnboarding(DIRECTION dir) {
        System.out.println("swipeScreen(): dir: '" + dir + "'"); // always log your actions

        // Animation default time:
        //  - Android: 300 ms
        //  - iOS: 200 ms
        // final value depends on your app and could be greater
        final int ANIMATION_TIME = 200; // ms

        final int PRESS_TIME = 500; // ms

        int edgeBorder = 50; // better avoid edges
        PointOption pointOptionStart, pointOptionEnd;

        // init screen variables
        Dimension dims = driver.manage().window().getSize();

        // init start point = center of screen
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);

        switch (dir) {
            case DOWN: // center of footer
                pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);
                break;
            case UP: // center of header
                pointOptionStart = PointOption.point(dims.width / 2, 1374);
                pointOptionEnd = PointOption.point(dims.width / 2, 520);
                break;
            case LEFT: // center of left side
                pointOptionStart = PointOption.point(336, 450);
                pointOptionEnd = PointOption.point(75, 450);
                break;
            case RIGHT: // center of right side
                pointOptionEnd = PointOption.point(dims.width - edgeBorder, 150);
                break;
            default:
                throw new IllegalArgumentException("swipeScreen(): dir: '" + dir + "' NOT supported");
        }
        // execute swipe using TouchAction
        try {
            touchAction
                    .press(pointOptionStart)
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        } catch (Exception e) {
            System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
            return;
        }

        // always allow swipe action to complete
        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
            // ignore
        }
    }

    public int actualMonth() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);
        return calendar.get(Calendar.MONTH)+1;
    }
}
