package assignment1;

public class Sequence {

	public static void main(String[] args) {
		String s = "MyEmployerIsTechouts";
		String s1 = s.substring(12);
		String s2 = s.substring(10,12);
		String s3 = s.substring(0, 10);
		s1 = s1.concat(s2);
System.out.println(s1.concat(s3));
	

	}
}
