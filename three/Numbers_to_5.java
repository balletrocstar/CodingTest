package three;

public class Numbers_to_5 {
	/**
	 * main method
	 * 
	 * Output:
	 * 	....1
	 *  ...22
	 *  ..333
	 *  .4444
	 *  55555
	 *  
	 *  modified from original version to only use one control structure
	 *  originally had nested for loops
	 *  
	 * @param args command line arguments
	 */
	public static void main(String[] args){
		for (int i = 1; i <= 5; i++) {
			//add 5-i '.'s to string
			String num = new String(new char[5-i]).replace('\0', '.');
			//add i copies of number to the string (number is i)
			String num2 = new String(new char[i]).replace("\0", Integer.toString(i));
			num += num2;
			//print string
			System.out.println(num);
		}
	}
}
