
public class P32_ReverseFirstNameAndSurname {

	public static void main(String[] args) {

     String name = "Aasif Shaikh";
     
     //Approach 01
/*     int spaceIndex=name.lastIndexOf(" ");
     String lastname=name.substring(spaceIndex+1);
     String firstName=name.substring(0,spaceIndex);
     System.out.println(lastname+" "+firstName);   */
     
     //Approach 02
     String [] names =name.split(" ");
     System.out.println(names[1]+" "+names[0]);
     
	}

}
