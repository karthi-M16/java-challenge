package JavaChallenge;

public class jc3 {
public static void main(String[] args) {
    
    String str = "A man, a plan, a canal: Panama";

    String removingNonANvalues = str.replaceAll("[^a-zA-Z0-9]", "" );

    //System.out.println(removingNonANvalues);

    String lc=removingNonANvalues.toLowerCase();
   // System.out.println(lc);
  
    char[] charArray=lc.toCharArray();

     String reversed="";

     for(int i=charArray.length-1;i>=0;i--){
       
     reversed += charArray[i];}   //reversed = reversed+charArray[i] (Addition Assignment operator)
    
      
       if (lc.equals(reversed)) {
        System.out.println("it is a palindrome");
    } else {
        System.out.println("not a palindrome");
    }



    //2nd 


    
String reverse="";
String movie =  " race a car ";

String value1 =movie.replaceAll("[^a-zA-Z0-9]","");

String value =value1.toLowerCase();

char[] cr = value.toCharArray();
 for(int i = cr.length-1; i>=0;i--){
    reverse+=cr[i];
 }
 if (value.equals(reverse)) {
    System.out.println("palindrome");
 } else {
    System.out.println("not a palindrome");
 }



//3rd empty string ==> palindrome

String emptyString ="";
char[] empty =emptyString.toCharArray();
String reversingEmptyString ="";

for(int i = empty.length-1;i>=0;i--){
    reversingEmptyString+=empty[i];}


if (reversingEmptyString.equals(emptyString)) {
    System.out.println("it is palindrome");
} else {
    System.out.println("not a palindrome");
}



}
}
