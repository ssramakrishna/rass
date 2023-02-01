package seleNIum;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataP {
	@DataProvider(name = "LoginData", parallel = true)
	public Object[][] testdata() {
		Object[][] data = new Object[2][2];
		data[0][0] = "Ram";
		data[0][1] = "Raj";
		data[1][0] = "HOD";
		data[1][1] = "HOD";
		return data;

	}

	@Test(dataProvider = "LoginData")
	public void loginTest(String userName, String pwd) {

	}
}
