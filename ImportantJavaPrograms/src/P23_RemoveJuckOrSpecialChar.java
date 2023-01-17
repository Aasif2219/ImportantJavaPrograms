
public class P23_RemoveJuckOrSpecialChar {

	public static void main(String[] args) {

    String s = "$$##@&*Aasif!!~~~!##@%$Shaikh";
    s=s.replaceAll("[^a-zA-Z0-9]", "");
    System.out.println(s);

	}

}
