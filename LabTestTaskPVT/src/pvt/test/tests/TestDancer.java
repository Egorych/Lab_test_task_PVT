package pvt.test.tests;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pvt.test.Dancer;

public class TestDancer {

	Dancer dancer;
	ArrayList<Integer> sequance;

	@Before
	public void init() {
		dancer = new Dancer();
		sequance = new ArrayList<Integer>();
	}

	@Test
	public void testDance() {
		sequance.add(2);
		sequance.add(0);
		sequance.add(7);
		dancer.setDancerSequance(sequance);
		if (dancer.dance() != 4) {
			Assert.fail();
		}

	}

	@Test
	public void testDance2() {
		sequance.add(1);
		sequance.add(2);
		sequance.add(7);
		dancer.setDancerSequance(sequance);
		if (dancer.dance() != 0) {
			Assert.fail();
		}

	}

	@Test
	public void testDance3() {
		sequance.add(4);
		sequance.add(0);
		sequance.add(7);
		dancer.setDancerSequance(sequance);
		if (dancer.dance() != 0) {
			Assert.fail();
		}

	}

	@Test
	public void testDance4() {
		sequance.add(8);
		sequance.add(3);
		sequance.add(1);
		sequance.add(4);
		sequance.add(3);
		sequance.add(2);
		sequance.add(1);
		sequance.add(0);
		dancer.setDancerSequance(sequance);
		if (dancer.dance() != 22) {
			Assert.fail();
		}

	}

	@Test
	public void testIsCanDance() {
		sequance.add(8);
		dancer.setDancerSequance(sequance);
		if (dancer.isCanDance() == true) {
			Assert.fail();
		}
	}

	@Test
	public void testIsCanDance2() {
		sequance.add(3);
		dancer.setDancerSequance(sequance);
		if (dancer.isCanDance() == true) {
			Assert.fail();
		}
	}

	@Test
	public void testIsCanDance3() {
		sequance.add(2);
		sequance.add(0);
		sequance.add(7);
		dancer.setDancerSequance(sequance);
		if (dancer.isCanDance() == true) {
			Assert.fail();
		}
	}

}
