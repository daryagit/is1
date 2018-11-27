package Programm;

import static org.junit.Assert.*;

import org.junit.Test;

import Programm.VenueCalcBL;

public class VenueCalcTest {

	@Test
	public void test() {
		
		VenueCalcBL fc;
		
		//test 1
		fc = new VenueCalcBL(3,33,4);
		assertEquals(99, fc.TotalAreaOfStorage, 0);
		assertEquals(396, fc.TotalSum, 0);
		
		//test 2
		fc = new VenueCalcBL(4.3,26.5,7);
		assertEquals(113, fc.TotalAreaOfStorage, 0.95);
		assertEquals(797, fc.TotalSum, 0.65);
				
		//test 3
		fc = new VenueCalcBL(-4,37,-1);
		assertEquals(0, fc.TotalAreaOfStorage, 0);
		assertEquals(0, fc.TotalSum, 0);
	}

}
