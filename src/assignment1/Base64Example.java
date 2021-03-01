package assignment1;

import java.util.Base64;

public class Base64Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Getting encoder
		Base64.Encoder encoder = Base64.getUrlEncoder();
		// Encoding URL
		String eStr = encoder.encodeToString("https://mail.google.com/mail/u/0/?tab=km&pli=1#starred".getBytes());
		System.out.println("Encoded URL: " + eStr);
		// Getting decoder
		/*Base64.Decoder decoder = Base64.getUrlDecoder();
		// Decoding URl
		String dStr = new String(decoder.decode(eStr));
		System.out.println("Decoded URL: " + dStr);*/
	}

}
