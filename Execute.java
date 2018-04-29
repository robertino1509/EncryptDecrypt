import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

public class execute {

	private static final int SUCCESS = 0;
	private static final int FAILURE = 1;
	
	public static void main(String[] args) {

		if (args == null || args.length == 0) {
			System.err.println("No Argument Specified");
			System.exit(FAILURE);
		}
		String type  = "";
		String value = "";
		try 
		{
			type  = args[0];
			value = args[1];
			
		} catch (Exception e) {
			System.err.println("Aguments error");
			System.exit(FAILURE);
		}
		try 
		{
			if(type.equals("-e")) System.out.println(Encrypt.encrypt(value));
			if(type.equals("-d")) System.out.println(Encrypt.decrypt(value));
		
		} catch (UnsupportedEncodingException e) {
			System.err.println(e.getMessage());
			System.exit(FAILURE);
		} catch (GeneralSecurityException e) {
			System.err.println(e.getMessage());
			System.exit(FAILURE);
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.exit(FAILURE);
		}
		
		System.exit(SUCCESS);
	}

}
