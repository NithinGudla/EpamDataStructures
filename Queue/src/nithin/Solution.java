package nithin;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
       Stack s1 = new Stack();
       Stack s2 = new Stack();
       Scanner sc = new Scanner(System.in);
       for(int i = sc.nextInt(); i > 0; i--){

           int op = sc.nextInt();
           if(op == 3){
               while(!s1.empty())
               s2.push(s1.pop());
               System.out.println(s2.peek());
               while(!s2.empty())
                s1.push(s2.pop());

           }
           else
           if(op == 2){
               while(!s1.empty())
               s2.push(s1.pop());
               s2.pop();
               while(!s2.empty())
               s1.push(s2.pop());

           }else
           {
               int value = sc.nextInt();
               s1.push(value);
           }
         
       }
    }
    
}


