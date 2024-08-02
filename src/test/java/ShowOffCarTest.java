import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import dev.arturo.models.CarAtributes;
import dev.arturo.models.ShowOffCar;
import dev.arturo.models.enumatributes.CarColors;
import dev.arturo.models.enumatributes.CarType;
import dev.arturo.models.enumatributes.Foul;

public class ShowOffCarTest {
     CarAtributes carAtributes = new CarAtributes("Toyota", 2025, 5.0, Foul.gasoline, CarType.city, 9, 10, 220, CarColors.purple, 0, true);

        ShowOffCar showOffCar = new ShowOffCar();
    @Test
    void testBrag() {
        assertThat(showOffCar.brag(carAtributes), is( "Car Brand: Toyota\nModel: 2025\nMotor: 5.0\nFoul kind: gasoline\nCarType: city\nDoors: 9\nSits: 10\nSpeed: 220\nColor: purple\nActual speed: 0\nAutomatic?: true\n"));
                      }
}
