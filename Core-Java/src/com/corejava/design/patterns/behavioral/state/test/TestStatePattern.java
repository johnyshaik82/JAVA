package com.corejava.design.patterns.behavioral.state.test;

import com.corejava.design.patterns.behavioral.state.Robot;

/**
 * @author johnybasha
 *
 */
public class TestStatePattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.walk();
		robot.cook();
		robot.off();
		robot.on();
		robot.cook();
		robot.walk();
		robot.off();
	}

}
