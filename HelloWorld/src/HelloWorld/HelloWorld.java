package HelloWorld;

public class HelloWorld {
	public static void main(String args[]) {
		// creates the arrays containing the letters to form the words
	      char[] greetArray = { 'h', 'e', 'l', 'l', 'o', ',' };
	      char[] worldArray = { 'W', 'o', 'r', 'l', 'd', '!' };
	      char[] iArray = { 'I' };
	      char[] amArray = { 'a', 'm' };
	      char[] tristanArray = { 'T', 'r', 'i', 's', 't', 'a','n', '!' };
        // creates strings containing the contents of the arrays
	      String greetString = new String(greetArray);
	      String worldString = new String(worldArray);
	      String iString = new String(iArray);
	      String amString = new String(amArray);
	      String tristanString = new String(tristanArray);
	      // displays the strings 
	      System.out.println( greetString + worldString + iString + amString + tristanString );
	   }
}
