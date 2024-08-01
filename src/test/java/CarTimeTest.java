import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*; 
import dev.arturo.CarAtributes;
import dev.arturo.CarTime;

public class CarTimeTest {
    CarAtributes carAtributes = new CarAtributes(null, null, null, null, null, null, null, null, null, null);

    CarTime carTime = new CarTime();

    @Test
    void testArrivalTime() {
    carAtributes.setActualSpeed(150);
    assertThat(carTime.arrivalTime(carAtributes, 150.0), is(1));
    


    }
}
