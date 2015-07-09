package base64ToBlob64;
import java.io.IOException;
import sun.misc.BASE64Decoder;

public class Base64ToBlob {

	 Base64ToBlob( ){
		
		
		}	


public static byte[] toBytes(String imageString) throws IOException {
	BASE64Decoder decoder = new BASE64Decoder();
	byte[] decodedBytes = decoder.decodeBuffer(imageString);
return decodedBytes;

}
}
