import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Integer: ");
        int n=sc.nextInt();
        String temp = Integer.toString(n);
        int[] num = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            num[i] = temp.charAt(i) - '0';
        }  

        int length = temp.length(); 
        int j = 0;
        int k = j+1; 
        
        
        if (length % 2 == 0) {
            if (num[j] >= 0 && num[k] >= 0) {
                for (int i = 0; i < temp.length(); i++) {
                    try {
                        int l = num[j];
                        num[j] = num[k];
                        num[k] = l;  
                        j+=2;
                        k = j+1;                        
                    } catch (Exception e) {
                        //TODO: handle exception
                    }                                                                                                                    
                }                
                int answer = toint(num);
                System.out.println(answer);            
            }            
        }else{
            if (num[j] >= 0 && num[k] >= 0) {
                for (int i = 0; i < temp.length(); i++) {
                    try {
                        int l = num[j];
                        num[j] = num[k];
                        num[k] = l;  
                        j+=2;
                        k = j+1;                        
                    } catch (Exception e) {
                        //TODO: handle exception
                    }                                                                                                                    
                }                
                int answer = toint(num);
                System.out.println(answer);            
            }
        }
    }

    static int toint(int[] num) {
        int result = 0;
        int offset = 1;
        for(int i = num.length - 1; i >= 0; i--) {
            result += num[i]*offset;
            offset *= 10;
        }
        return result;
    }    
}