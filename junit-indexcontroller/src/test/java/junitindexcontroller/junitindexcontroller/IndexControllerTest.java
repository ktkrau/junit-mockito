package junitindexcontroller.junitindexcontroller;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junitindexcontroller.junitindexcontroller.controller.IndexController;




public class IndexControllerTest {
	
	@Test //este evalúa un array null
	public void welcomeTest() {
		
		IndexController indexController = new IndexController();
		String[] paramArray = null;
		String resultActual = "El array está vacío";
		String resultReal = indexController.welcome(paramArray);
		assertEquals(resultActual, resultReal);
	}

	@Test //este evalúa un array sin datos
	public void arraySinDatos() {
		
		IndexController indexController = new IndexController();
		String[] paramArray = new String[3];
		String Actual = "param[0]null\n" + "param[1]null\n" + "param[2]null\n";
		String Real = indexController.welcome(paramArray);
		assertEquals(Actual, Real);
	}
	 
	@Test //este evalúa un array con datos
	public void conDatos() {
		
		IndexController indexController = new IndexController();
		String[] paramArray = new String[] {"java", "desde", "0"};
		String resultActual = "param[0]null\n" + "param[1]null\n" + "param[2]null\n";
		String resultReal = indexController.welcome(paramArray);
		assertEquals(resultActual, resultReal);
	}
}
