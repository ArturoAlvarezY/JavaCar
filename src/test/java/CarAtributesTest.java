import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*; 

import dev.arturo.models.CarAtributes;
import dev.arturo.models.enumatributes.CarColors;
import dev.arturo.models.enumatributes.CarType;
import dev.arturo.models.enumatributes.Foul;

public class CarAtributesTest {
    CarAtributes carAtributes = new CarAtributes("Toyota", 2007, 4.5, Foul.gasoline, CarType.suv, 5, 5, 220, CarColors.purple, 180);
    @Test
    void testGetActualSpeed() {
    assertThat(carAtributes.getActualSpeed(), is(180));
    }

    @Test
    void testGetBranch() {
    assertThat(carAtributes.getBranch(), is("Toyota"));
    }

    @Test
    void testGetCarColors() {
    assertThat(carAtributes.getCarColors(), is(CarColors.purple));
    }

    @Test
    void testGetCarType() {
    assertThat(carAtributes.getCarType(), is(CarType.suv));
    }

    @Test
    void testGetDoors() {
    assertThat(carAtributes.getDoors(), is(5));
    }

    @Test
    void testGetFoul() {
    assertThat(carAtributes.getFoul(), is(Foul.gasoline));
    }

    @Test
    void testGetModel() {
    assertThat(carAtributes.getModel(), is(2007));
    }

    @Test
    void testGetMotor() {
    assertThat(carAtributes.getMotor(), is(4.5));
    }

    @Test
    void testGetSits() {
    assertThat(carAtributes.getSits(), is(5));
    }

    @Test
    void testGetSpeed() {
    assertThat(carAtributes.getSpeed(), is(220));
    }

    @Test
    void testSetActualSpeed() {
        carAtributes.setActualSpeed(200);
        assertThat(carAtributes.getActualSpeed(), is(200));
    }

    @Test
    void testSetBranch() {
    carAtributes.setBranch("Honda");
    assertThat(carAtributes.getBranch(), is("Honda"));
    }

    @Test
    void testSetCarColors() {
    carAtributes.setCarColors(CarColors.red);
    assertThat(carAtributes.getCarColors(), is(CarColors.red));
    }

    @Test
    void testSetCarType() {
    carAtributes.setCarType(CarType.city);
    assertThat(carAtributes.getCarType(), is(CarType.city));
    }

    @Test
    void testSetDoors() {
    carAtributes.setDoors(3);
    assertThat(carAtributes.getDoors(), is(3));
    }

    @Test
    void testSetFoul() {
        carAtributes.setFoul(Foul.biodiesel);
        assertThat(carAtributes.getFoul(), is(Foul.biodiesel));

    }

    @Test
    void testSetModel() {
    carAtributes.setModel(2025);
    assertThat(carAtributes.getModel(), is(2025));
    }

    @Test
    void testSetMotor() {
        carAtributes.setMotor(5.0);
        assertThat(carAtributes.getMotor(), is(5.0));
    }

    @Test
    void testSetSits() {
        carAtributes.setSits(7);
        assertThat(carAtributes.getSits(), is(7));
    }

    @Test
    void testSetSpeed() {
        carAtributes.setSpeed(200);
        assertThat(carAtributes.getSpeed(), is(200));
        
    }
}
