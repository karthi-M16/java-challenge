package JavaChallenge;

import java.util.Arrays;

public class jc4 {
public static void main(String[] args) {
    
   int[] a ={2,2,1};

    Arrays.sort(a);

   for(int i = 0; i<=a.length-1;i++){

        int count = 0;

   for(int j = a.length-1;j>=0;j--){

     if (a[i]==a[j]) {
         count++;}
     }

         if (count==1) {
            
         
        System.out.println(a[i]);}

    }

    int[] num ={4,1,2,1,2};
    Arrays.sort(num);

    for(int i = 0; i<num.length;i++){

        int count = 0;

        for(int j = 0;j<num.length; j++){

            if (num[i]==num[j]) {
                count++;
            }
        }

        if (count==1) {
            System.out.println(num[i]);
            
        }
    }




}
}     
      


        