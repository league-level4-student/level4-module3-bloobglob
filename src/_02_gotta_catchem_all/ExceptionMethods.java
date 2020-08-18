package _02_gotta_catchem_all;

public class ExceptionMethods {
	double divide(double a, double b) throws IllegalArgumentException{
		if(b == 0.0) {
			throw new IllegalArgumentException();
		}
		return a/b;
	}
	String reverseString(String s) throws IllegalStateException{
		String str = "";
		if(s.equals("")) {
			throw new IllegalStateException();
		}
		for(int i = s.length() - 1; i >= 0; i++) {
			str += s.charAt(i);
		}
		return str;
	}
}
