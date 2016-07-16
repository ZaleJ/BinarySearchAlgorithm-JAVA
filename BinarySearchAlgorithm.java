import java.util.Scanner;

/**
 * Created by Administrator on 2016/7/12 0012.
 */
public class BinarySearchAlgorithm {
    public static void main(String []args){
        int []array={1, 2, 3, 4, 5, 7, 9, 13, 14, 18};
        System.out.println("Please input the number you want to find: ");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int index=-1;
        int start=0;
        int end=array.length-1;
        int middle;
        while (start<=end){
            // find the middle element
            middle=(start+end)/2;
            if(number==array[middle]){
                index=middle+1;
                break;
            }
            // if the one you want to find is bigger than the middle one
            // let the numbers in the left go
            if(number>array[middle]){
                start=middle+1;
            }
            // save the left and let the right ones go
            if (number<array[middle]){
                end=middle-1;
            }
        }
        if (index==-1){
            System.out.println("Can't find it.");
        }else{
            System.out.println("The number you want to find is in "+index+" position");
        }
    }
}













