import java.util.*;

public class ExceptionHandling {

	public static int div(int a, int b) throws MyException {
		try {
			return a/b;
		} catch (ArithmeticException e) {
			throw new MyException();
		}
		
	}

	public static void printMessage(String msg) throws VeryShortMessageException, 
			VeryPoorMessageException, FunnyException {
		if (msg.length() == 0) {
			throw new VeryShortMessageException();
		} else if (msg.length() == 1) {
			throw new VeryPoorMessageException();
		} else if (msg.length() == 2) {
			throw new FunnyException();
		} else {
			System.out.println(msg);
		}
	}
	public static void main(String ar[]){
		Scanner in = new Scanner(System.in);
		try {
			printMessage(in.nextLine());
		} catch (FunnyException e2) {
			e2.printStackTrace();
		} catch (VeryPoorMessageException e3) {
			e3.printStackTrace();
		} catch (VeryShortMessageException e4) {
			e4.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

}

class MyException extends Throwable{
}

class VeryShortMessageException extends Exception {
}

class VeryPoorMessageException extends VeryShortMessageException {

}

class FunnyException extends VeryPoorMessageException {
}
