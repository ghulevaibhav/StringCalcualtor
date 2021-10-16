import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class TestStringCalculator {

	private Calculator calculator;

	@BeforeTest
	public void init() {
		calculator = new Calculator();
	}

	public void returnsZero() throws Exception {
		assertEquals(calculator.calculator(""), 0);
	}

	public void returnsValue() throws Exception {
		assertEquals(calculator.calculator("1"), 1);
	}

	public void sumOfNumbers() throws Exception {
		assertEquals(calculator.calculator("1,2"), 3);
	}

	public void twoNumbersNewLineDelimiterReturnSum() throws Exception {
		assertEquals(calculator.calculator("1\n2"), 3);
	}
	@Test(expectedExceptions = Exception.class)
	public void negativeInputReturnsException() throws Exception {
		calculator.calculator("-1");
	}
}
