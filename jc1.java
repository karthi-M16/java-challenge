package JavaChallenge;

import java.util.Scanner;

public class jc1 {
public static void main(String[] args) {
    String s = "hello world";
    String[] split = s.split(" ");

    //complex

   for( int i = 0 ; i<=split.length-1;i++){
   if(i==split.length-1){
        System.out.println("the length of last word is"+" "+split[i].length());}
    }

    // skip forloop ==> System.out.println(split[split.length-1].length());

    String t ="fly me to the moon";
    String[] split1 = t.split(" ");
    System.out.println("the length of last word is"+" "+split1[split1.length-1].length());


    String u = "luffy is still joyboy";
    String[] split2 = u.split(" ");
    System.out.println("the length of last word is"+" "+split2[split2.length-1].length());


    Scanner x = new Scanner(System.in);
    System.out.println("enter the statement");
    String v =x.nextLine();

    String[] split3 = v.split(" ");
    System.out.println("the length of last word is"+" "+split3[split3.length-1].length());




}
}
