
public class P25_CountCharacterOccurance {

	public static void main(String[] args) {

    String s = "aasif Shaikh";
    
    int l1 = s.length();  // String total length
    int l2=s.replaceAll("a","").length(); //String length after removing char a
    int count = l1-l2;
    
    System.out.println("Character \"a\" occurance is "+count);
	}

}
