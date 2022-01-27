/** 
 * Created By Deepkaran Singh 
 * Dated : 27/01/2021
 * Dedicated to Late Shri Srinivasa Ramanujan 
 */
import java.util.*;


public class RamanujanNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("To check if a number is Ramanujan Number or not!");
        System.out.println("Enter the positive number you wanna check: ");
        int number = input.nextInt();
        checkRamanujan(number);
        input.close();
        
    }
    public static void checkRamanujan(int n){
        int max_no = 25;
        int count= 1;
        for(int i=0; i<max_no; i++){
            for(int j=0; j<max_no; j++){
                for(int z=0;z<max_no; z++){
                    for(int x=0; x<max_no; x++){
                        if((i!=j)&&(i!=z)&&(i!=x)&&(j!=z)&&(j!=x)&&(z!=x)){
                            int num1= i*i*i + j*j*j;
                            int num2= z*z*z + x*x*x;
                            if(num1 == num2){
                                if(n == num1){
                                    count = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        if(count == 0){
            System.out.println(n + " is Ramanujan Number");
        }
        
    }
}
