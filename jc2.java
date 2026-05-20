package JavaChallenge;

public class jc2 {
public static void main(String[] args) {
    int a = 8;
    int b = 10;

     double root = (int) Math.sqrt(a);

     double root1 = Math.sqrt(b);
   
     double sqroot = Math.sqrt(b);

       System.out.println(Math.floor(sqroot));
       System.out.println(root1);
       System.out.println(root);


       int c = 8;
       
       for(int i = 1; i<=c; i++){
        if (i*i==c) {
            System.out.println(i);
        } else {
            System.out.println(Math.floor(Math.sqrt(c)));
            break;
        }
       }  
       
       

       int d = 15;
       int sqrt = 0;
       for(int i = 1; i*i<=d;i++){
        sqrt = i;}

        System.out.println(sqrt);





        int num = 8;
        int sr = 0;

        for(int i=1;i*i<=num;i++){
            sr=i;

        }
        System.out.println(sr);
 
       }
}

//LOGIC
// sqrt --> we are storing i value in sqrt [in Palindrome we declared Sum = 0]

// i*i      i<=d --> i less than or equalto 15               root(sqrt=i)
//1*1=1      yes                                                1                                                 
//2*2=4      yes                                                2
//3*3=9      yes                                                3
//4*4=16     No --> loop stops because it is greater than 15   stops
