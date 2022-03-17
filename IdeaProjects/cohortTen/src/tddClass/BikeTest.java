package tddClass;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

    @Test

    public void Bike (){
seunBike isOn = new seunBike();
seunBike.isOn();
assertEquals(true, seunBike.isOn());

    }


}
