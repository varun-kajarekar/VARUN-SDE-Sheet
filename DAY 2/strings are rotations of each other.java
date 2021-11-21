//https://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/

public class IsRotation {

	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "cdba";
		System.out.println("is str2 a rotation of str1? " + isRotation(str1, str2));
		String str3 = "cdab";
		System.out.println("is str3 a rotation of str1? " + isRotation(str1, str3));
	}
	
	private static boolean isRotation(String str1, String str2){
		if(str1 == null or str2 == null) return false;
		if (str1.length == str2.length && (str1 + str1).indexOf(str2) > 0) return true;
		return false;
	}
}
