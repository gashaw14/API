package com.filetest;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class sampleTest {
	
	@Test
	public void readData() throws IOException {
		readExcel r = new readExcel();
		ArrayList<String> data = r.ValidateFileformat("login");
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		
	}

}
