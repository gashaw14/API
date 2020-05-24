package com.bastest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Basetest {

 public static void getfileread() throws IOException {
	 
	 Basetest test1 = new Basetest();
	 
	 BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\Gashaw\\\\Desktop\\\\1.txt"));


	StringBuilder sb = new StringBuilder(); 
	String line = br.readLine();

	while (line != null) { 
		sb.append(line).append("\n"); 
		line = br.readLine(); 
		}
	String fileAsString = sb.toString();
System.out.println(fileAsString);
 }

}
			

 


