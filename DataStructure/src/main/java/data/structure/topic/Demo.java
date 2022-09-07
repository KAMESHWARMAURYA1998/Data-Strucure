package data.structure.topic;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
	* @author Kameshwar Maurya
	*/
public class Demo {

				public static void main(String [] args) throws NoSuchAlgorithmException {

								String password = "123456";

								MessageDigest md = MessageDigest.getInstance("SHA-256");
								String str = md.digest(password.getBytes(StandardCharsets.UTF_8)).toString();

								System.out.println(str);

								String str2 = str.getBytes(StandardCharsets.UTF_8).toString();

								System.out.println();

////bytes to hex
//								StringBuilder sb = new StringBuilder();
//								for (byte b : hashInBytes) {
//												sb.append(String.format("%02x", b));
//								}
//								System.out.println(sb.toString());
}
}
