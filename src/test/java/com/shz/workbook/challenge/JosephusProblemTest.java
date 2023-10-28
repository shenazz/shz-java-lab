/**
 * 
 */
package com.shz.workbook.challenge;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * @author shenazz
 *
 */
public class JosephusProblemTest {

	@Test
	public void given_invalidCircleAndValidSteps_when_getSurvivor_then_exception() {

		//given
		int circleSize = 1;
		int steps = 3;

		//when
		try {
			JosephusProblem.solution1(circleSize, steps);
			fail();
		} catch (Exception e) {
			//then
			// TODO: handle exception
		}

	}

	@Test
	public void given_validCircleAndInvalidSteps_when_getSurvivor_then_exception() {

		//given
		int circleSize = 2;
		int steps = 0;

		//when
		try {
			JosephusProblem.solution1(circleSize, steps);
			fail();
		} catch (Exception e) {
			//then
			// TODO: handle exception
		}

	}

	@Test
	public void given_invalidCircleAndInvalidSteps_when_getSurvivor_then_exception() {

		//given
		int circleSize = 1;
		int steps = 0;

		//when
		try {
			JosephusProblem.solution1(circleSize, steps);
			fail();
		} catch (Exception e) {
			//then
			// TODO: handle exception
		}

	}

	@Test
	public void given_circle7AndSteps3_when_getSurvivor_then_survivor4() {

		//given
		int circleSize = 7;
		int steps = 3;

		//when
		int result = JosephusProblem.solution1(circleSize, steps);

		//then
		assertEquals(4, result);

	}

	@Test
	public void given_circle4AndSteps4_when_getSurvivor_then_survivor2() {

		//given
		int circleSize = 4;
		int steps = 4;

		//when
		int result = JosephusProblem.solution1(circleSize, steps);

		//then
		assertEquals(2, result);

	}
	
	@Test
	public void given_circle7AndSteps10_when_getSurvivor_then_survivor5() {

		//given
		int circleSize = 7;
		int steps = 10;

		//when
		int result = JosephusProblem.solution1(circleSize, steps);

		//then
		assertEquals(5, result);

	}

	

}
