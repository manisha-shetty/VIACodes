package com.corejava.module12;

import java.awt.AWTException;
import java.awt.Robot;

public class VirusMouseStuck {

	public static void main(String[] args) throws AWTException {
		Robot r= new Robot();
		while(true)
			r.mouseMove(0, 0);
	}
}
