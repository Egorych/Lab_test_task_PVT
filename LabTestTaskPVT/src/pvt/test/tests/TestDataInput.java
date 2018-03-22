package pvt.test.tests;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pvt.test.DataInput;

public class TestDataInput {
	ArrayList<Integer> list;

	@Before
	public void init() {
		list = new ArrayList<Integer>();
	}

	@Test
	public void testSequenceReading() {
		ByteArrayInputStream in = new ByteArrayInputStream("1 2".getBytes());
		System.setIn(in);

		list.add(1);
		list.add(2);
		Assert.assertEquals(list, DataInput.sequenceReading());
		System.setIn(System.in);
	}

	@Test
	public void testSequenceReading2() {
		ByteArrayInputStream in = new ByteArrayInputStream("3 5 6".getBytes());
		System.setIn(in);
		list.add(3);
		list.add(5);
		list.add(6);
		Assert.assertEquals(list, DataInput.sequenceReading());
		System.setIn(System.in);
	}
}
