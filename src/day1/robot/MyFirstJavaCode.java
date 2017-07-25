package day1.robot;

import org.jointheleague.graphical.robot.Robot;

import sun.applet.Main;

public class MyFirstJavaCode {
	public static void main(String[] args) {
		Robot unusualapple = new Robot();
		unusualapple.setSpeed(9);
		unusualapple.setPenColor(2, 1, 255);
		unusualapple.penDown();
		for (int i = 0; i < 36; i++) {
			unusualapple.move(100);
			unusualapple.turn(360/36);
		}
		
		
	}
}
