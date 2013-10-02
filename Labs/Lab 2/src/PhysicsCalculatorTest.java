import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class PhysicsCalculatorTest {

	@Test
	public void test() {
		Speed speed1 = new Speed(0);
		Speed speed2 = new Speed(10);
		Time time1 = new Time(0);
		Time time2 = new Time(1);
		Acceleration calculatedAcceleration =
		PhysicsCalculator.calcAccelerationFromSpeedsAndTimes (speed1, speed2, time1,time2);
		Assert.assertEquals(10.0, calculatedAcceleration.getValue(), 0.0);
	}
	
	@Test
	public void test2() {
		Speed speed1 = new Speed(10);
		Speed speed2 = new Speed(0);
		Time time1 = new Time(0);
		Time time2 = new Time(1);
		Acceleration calculatedAcceleration =
		PhysicsCalculator.calcAccelerationFromSpeedsAndTimes (speed1, speed2, time1,time2);
		Assert.assertEquals(-10, calculatedAcceleration.getValue(), 0.0);
	}

}
