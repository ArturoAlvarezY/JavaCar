import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import dev.arturo.models.CarAtributes;
import dev.arturo.models.CarFines;

public class CarFinesTest {

        CarAtributes carAtributes = new CarAtributes(null, null, null, null, null, null, null, 131, null, 131, null);

        CarFines carFines = new CarFines();

    @Test
    void testHasPenals() {
        assertThat(carFines.isItLegal(carAtributes), is(1));
    }

    @Test
    void testIsItLegal() {
        assertThat(carFines.hasPenals(carAtributes), is(true));

        carAtributes.setSpeed(10);

        assertThat(carFines.hasPenals(carAtributes), is(false));
    }

    @Test
    void testMain() {

    }
}
