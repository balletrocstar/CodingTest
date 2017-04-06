package three;

public class Numbers_to_N {
	/**
	 * modified version of Numbers_to_5.java to work for N numbers
	 * 
	 * Input: 7
	 * Output:
	 * 	......1
	 *  .....22
	 *  ....333
	 *  ...4444
	 *  ..55555
	 *  .666666
	 *  7777777
	 *  
	 * @param args
	 */
	public static void main(String[] args){
		//take in integer from command line
		int n = Integer.parseInt(args[0]); 
		
		for (int i = 1; i <= n; i++) {
			//add n-i '.'s to string
			String num = new String(new char[n-i]).replace('\0', '.');
			//add i copies of number to string where number is i
			String num2 = new String(new char[i]).replace("\0", Integer.toString(i));
			num += num2;
			//print string
			System.out.println(num);
		}
	}
}
