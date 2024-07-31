import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import dev.arturo.models.CarAcelerate;
import dev.arturo.models.CarAtributes;

public class CarAcelerateTest {
    CarAtributes carAtributes = new CarAtributes(null, null, null, null, null, null, null, null, null, null);
    CarAcelerate carAcelerate = new CarAcelerate();
    
    

    @Test
    void testAcelerate() {
        carAtributes.setActualSpeed(25);

        assertThat(carAcelerate.acelerate(carAtributes, 50), is(75));
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
    }
}
