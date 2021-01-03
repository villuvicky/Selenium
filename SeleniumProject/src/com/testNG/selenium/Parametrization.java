package com.testNG.selenium;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
	@Test
	@Parameters("Name") //suite level is applicable for entire suite and test level is for only the tests
public void print_name(String name) {
	System.out.println("Name from there is "+name);
}
}
