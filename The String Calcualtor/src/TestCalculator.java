import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class TestCalculator {

	private Calculator calculator;

	@BeforeTest
	public void init() {
		calculator = new Calculator();
	}

	public void emptyStringReturnZero() throws Exception {

		assertEquals(calculator.calculate(""), 0);
	}

	public void singleValueIsReplied() throws Exception {
		assertEquals(calculator.calculate("1"), 1);
	}

	public void twoNumbersComaDelimitedReturnSum() throws Exception {
		assertEquals(calculator.calculate("1,2"), 3);
	}

	public void twoNumberNewLineDelimitedReturnSum() throws Exception {
		assertEquals(calculator.calculate("1\n2"), 3);
	}

	public void threeNumbersDelimitedReturnSum() throws Exception {
		assertEquals(calculator.calculate("1,2,3"), 6);
	}

	@Test(expectedExceptions = Exception.class)
	public void negativeInputReturnsException() throws Exception {
		calculator.calculate("-1");
	}

	public void ignoresNumbersGreaterThan1000() throws Exception {
		assertEquals(calculator.calculate("10,10,1001"), 20);
	}

}
