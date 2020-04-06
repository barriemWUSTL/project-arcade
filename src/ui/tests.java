import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class tests {
	
	@Test
	public void illegalInputChecker() {
		int illegalInput = 3;
		ui test = new ui();
		boolean testIllegal = test.validInput(illegalInput);
		assertFalse(testIllegal);
	}

	@Test 
	void legalInput1Checker() {
		int legalInput1 = 1;
		ui test = new ui();
		boolean testlegalInput1 = test.validInput(legalInput1);
		assertTrue(testlegalInput1);
	}
	
	@Test 
	void legalInput2Checker() {
		int legalInput2 = 2;
		ui test = new ui();
		boolean testlegalInput2 = test.validInput(legalInput2);
		assertTrue(testlegalInput2);
	}
	
	@Test
	void illegalRunFileChecker() {
		int illegalInput = 3;
		ui test = new ui();
		boolean testIllegal = test.runfile(illegalInput);
		assertFalse(testIllegal);
	}
	
	@Test 
	void runHangmanChecker() {
		int runHangman = 1;
		ui test = new ui();
		boolean testRunHangman = test.runfile(runHangman);
		assertTrue(testRunHangman);
	}
	
	@Test
	void runRockPaperScissorsChecker() {
		int runRPS = 2;
		ui test = new ui();
		boolean testRunRPS = test.runfile(runRPS);
		assertTrue(testRunRPS);
	}
}

