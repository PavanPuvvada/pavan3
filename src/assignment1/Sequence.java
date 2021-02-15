package assignment1;

public class Sequence {

	public static void main(String[] args) {
		String s = "MYHOMEISJEWEL";
		String s1 = s.substring(8);
		String s2 = s.substring(0,6);
		String s3 = s.substring(6, 8);
		s1 = s1.concat(s3);
System.out.println(s1.concat(s2));
	

	}
}
