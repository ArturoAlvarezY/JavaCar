import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import dev.arturo.models.CarAcelerate;
import dev.arturo.models.CarAtributes;

public class CarAcelerateTest {
    CarAtributes carAtributes = new CarAtributes(null, null, null, null, null, null, null, null, null, null, null);
    CarAcelerate carAcelerate = new CarAcelerate();

    @Test
    void testAcelerate() {

        

        assertThat(carAcelerate.acelerate(carAtributes, 50), is(50));
    }

    @Test
    void testBreakMethod() {
        carAtributes.setActualSpeed(200);

        assertThat(carAcelerate.breakMethod(carAtributes), is(0));
    }

    @Test
    void testEvaluateSpeed() {
        carAtributes.setActualSpeed(131);

        assertThat(carAcelerate.evaluateSpeed(carAtributes), is("Slow your speed Barry Allen!"));

        carAtributes.setActualSpeed(70);

        assertThat(carAcelerate.evaluateSpeed(carAtributes), is("You are on rule!"));

        carAtributes.setActualSpeed(-5);

        assertThat(carAcelerate.evaluateSpeed(carAtributes), is("You cant set a velocity minor than cero"));
    }
}
