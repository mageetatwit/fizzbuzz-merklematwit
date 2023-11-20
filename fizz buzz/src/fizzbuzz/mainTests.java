package fizzbuzz;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;


class mainTests {

	//test sequence for maxVal=1 to maxVal=30	
	public void testFizzBuzzValue(int maxVal, String maxInput){
		InputStream stdin = System.in;
			      
		String correctInput = maxInput;
		System.setIn(new ByteArrayInputStream(correctInput.getBytes()));
			      
		StringBuilder expectedResponseBuilder = new StringBuilder();
		for(int i=0; i<=maxVal; i++) {
			expectedResponseBuilder.append("enter number or word:");
		}
		expectedResponseBuilder.append("you are eliminated\r\n");
		String expectedResponse = expectedResponseBuilder.toString();
			      
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(byteArrayOutputStream);
		PrintStream stdout = System.out;
		System.setOut(ps);
			      
		main.main(new String[0]);
			      
		System.setIn(stdin);
		System.setOut(stdout);
			
		String outputText = byteArrayOutputStream.toString();
			      
		assertEquals(expectedResponse, outputText);
	}
	
	@Test
	public void testFizzBuzzNegNinetyNine(){
		InputStream stdin = System.in;
	      
	      String correctInput = "-99\n";
	      System.setIn(new ByteArrayInputStream(correctInput.getBytes()));
	      
	      String expectedResponse = "enter number or word:you are eliminated\r\n";
	      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	      PrintStream ps = new PrintStream(byteArrayOutputStream);
	      PrintStream stdout = System.out;
	      System.setOut(ps);
	      
	      main.main(new String[0]);
	      
	      System.setIn(stdin);
	      System.setOut(stdout);
	
	      String outputText = byteArrayOutputStream.toString();
	      
	      assertEquals(expectedResponse, outputText);
	}
	
	@Test
	public void testFizzBuzzNegOne(){
		InputStream stdin = System.in;
	      
	      String correctInput = "-1\n";
	      System.setIn(new ByteArrayInputStream(correctInput.getBytes()));
	      
	      String expectedResponse = "enter number or word:you are eliminated\r\n";
	      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	      PrintStream ps = new PrintStream(byteArrayOutputStream);
	      PrintStream stdout = System.out;
	      System.setOut(ps);
	      
	      main.main(new String[0]);
	      
	      System.setIn(stdin);
	      System.setOut(stdout);
	
	      String outputText = byteArrayOutputStream.toString();
	      
	      assertEquals(expectedResponse, outputText);
	}
	
	@Test
	public void testFizzBuzzZero(){
		InputStream stdin = System.in;
	      
	      String correctInput = "0\n";
	      System.setIn(new ByteArrayInputStream(correctInput.getBytes()));
	      
	      String expectedResponse = "enter number or word:you are eliminated\r\n";
	      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	      PrintStream ps = new PrintStream(byteArrayOutputStream);
	      PrintStream stdout = System.out;
	      System.setOut(ps);
	      
	      main.main(new String[0]);
	      
	      System.setIn(stdin);
	      System.setOut(stdout);
	
	      String outputText = byteArrayOutputStream.toString();
	      
	      assertEquals(expectedResponse, outputText);
	}
	
	@Test
	public void testFizzBuzzZeroZero(){
		InputStream stdin = System.in;
	      
	      String correctInput = "00\n";
	      System.setIn(new ByteArrayInputStream(correctInput.getBytes()));
	      
	      String expectedResponse = "enter number or word:you are eliminated\r\n";
	      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	      PrintStream ps = new PrintStream(byteArrayOutputStream);
	      PrintStream stdout = System.out;
	      System.setOut(ps);
	      
	      main.main(new String[0]);
	      
	      System.setIn(stdin);
	      System.setOut(stdout);
	
	      String outputText = byteArrayOutputStream.toString();
	      
	      assertEquals(expectedResponse, outputText);
	}
	
	@Test
	public void testFizzBuzzZeroPointZero(){
		InputStream stdin = System.in;
	      
	      String correctInput = "0.0\n";
	      System.setIn(new ByteArrayInputStream(correctInput.getBytes()));
	      
	      String expectedResponse = "enter number or word:you are eliminated\r\n";
	      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	      PrintStream ps = new PrintStream(byteArrayOutputStream);
	      PrintStream stdout = System.out;
	      System.setOut(ps);
	      
	      main.main(new String[0]);
	      
	      System.setIn(stdin);
	      System.setOut(stdout);
	
	      String outputText = byteArrayOutputStream.toString();
	      
	      assertEquals(expectedResponse, outputText);
	}
	
	@Test
	public void testFizzBuzzOne() {
		String correctInput = "1\nFAILTEST\n";
		testFizzBuzzValue(1, correctInput);
	}
	
	@Test
	public void testFizzBuzzTwo() {
		String correctInput = "1\n2\nFAILTEST\n";
		testFizzBuzzValue(2, correctInput);
	}
	
	@Test
	public void testFizzBuzzThree(){
		String correctInput = "1\n2\nfizz\nFAILTEST\n";
		testFizzBuzzValue(3, correctInput);
	}
	 
	@Test
	public void testFizzBuzzFour() {
		String correctInput = "1\n2\nfizz\n4\nFAILTEST\n";
		testFizzBuzzValue(4, correctInput);
	}
	
	@Test
	public void testFizzBuzzFive() {
		String correctInput = "1\n2\nfizz\n4\nbuzz\nFAILTEST\n";
		testFizzBuzzValue(5, correctInput);
	}
	
	@Test
	public void testFizzBuzzSix() {
		String correctInput = "1\n2\nfizz\n4\nbuzz\nfizz\nFAILTEST\n";
		testFizzBuzzValue(6, correctInput);
	}
	
	@Test
	public void testFizzBuzzSeven() {
		String correctInput = "1\n2\nfizz\n4\nbuzz\nfizz\n7\nFAILTEST\n";
		testFizzBuzzValue(7, correctInput);
	}
	
	@Test
	public void testFizzBuzzNine() {
		String correctInput = "1\n2\nfizz\n4\nbuzz\nfizz\n7\n8\nfizz\nFAILTEST\n";
		testFizzBuzzValue(9, correctInput);
	}
	
	@Test
	public void testFizzBuzzTen() {
		String correctInput = "1\n2\nfizz\n4\nbuzz\nfizz\n7\n8\nfizz\nbuzz\nFAILTEST\n";
		testFizzBuzzValue(10, correctInput);
	}
	
	@Test
	public void testFizzBuzzEleven() {
		String correctInput = "1\n2\nfizz\n4\nbuzz\nfizz\n7\n8\nfizz\nbuzz\n11\nFAILTEST\n";
		testFizzBuzzValue(11, correctInput);
	}
	
	@Test
	public void testFizzBuzzFourteen() {
		String correctInput = "1\n2\nfizz\n4\nbuzz\nfizz\n7\n8\nfizz\nbuzz\n11\nfizz\n13\n14\nFAILTEST\n";
		testFizzBuzzValue(14, correctInput);
	}
	
	@Test
	public void testFizzBuzzFifteen() {
		String correctInput = "1\n2\nfizz\n4\nbuzz\nfizz\n7\n8\nfizz\nbuzz\n11\nfizz\n13\n14\nfizz buzz\nFAILTEST\n";
		testFizzBuzzValue(15, correctInput);
	}
	
	@Test
	public void testFizzBuzzSixteen() {
		String correctInput = "1\n2\nfizz\n4\nbuzz\nfizz\n7\n8\nfizz\nbuzz\n11\nfizz\n13\n14\nfizz buzz\n16\nFAILTEST\n";
		testFizzBuzzValue(16, correctInput);
	}
	
	@Test
	public void testFizzBuzzTwentyNine() {
		String correctInput = "1\n2\nfizz\n4\nbuzz\nfizz\n7\n8\nfizz\nbuzz\n11\nfizz\n13\n14\nfizz buzz\n16\n17\nfizz\n19\nbuzz\nfizz\n22\n23\nfizz\nbuzz\n26\nfizz\n28\n29\nFAILTEST\n";
		testFizzBuzzValue(29, correctInput);
	}
	
	@Test
	public void testFizzBuzzThrity() {
		String correctInput = "1\n2\nfizz\n4\nbuzz\nfizz\n7\n8\nfizz\nbuzz\n11\nfizz\n13\n14\nfizz buzz\n16\n17\nfizz\n19\nbuzz\nfizz\n22\n23\nfizz\nbuzz\n26\nfizz\n28\n29\nfizz buzz\nFAILTEST\n";
		testFizzBuzzValue(30, correctInput);
	}
	

}
