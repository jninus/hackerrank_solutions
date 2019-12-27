import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] outputs=s.trim().split("[ !,?\\._'@]+",0);
        if(outputs.length==1 && outputs[0].equals("")){
            System.out.println(0);
        }else{
            System.out.println(outputs.length);
            for(String output:outputs)System.out.println(output);
        }
        scan.close();
    }
}


