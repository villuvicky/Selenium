package com.testNG.selenium;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
	@Test
	@Parameters("Name")
public void print_name(String name) {
	System.out.println("Name from there is "+name);
}
}
