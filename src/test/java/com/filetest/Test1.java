package com.filetest;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bastest.Basetest;

public class Test1 {
	
 Basetest test1;	
	
		
	
@Test
public void ValidateFileformat() throws IOException {
	test1 = new Basetest();
    test1.getfileread();

	
}

@Test
public void ValidateTest() {
	System.out.println("hello");
}
@Test
public void ValidateTest2(){
	System.out.println("update for pull");
}
@Test
public void ValidateTest3() {
	System.out.println("test branch");
}
}
