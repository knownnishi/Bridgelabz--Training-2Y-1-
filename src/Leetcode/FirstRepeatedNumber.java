package LogicalProblem;

import java.util.Scanner;

public class FirstRepeatedNumber {
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int FirstRepNumber(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];

                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]={1,2,3,4,5,2,1};
        System.out.println("This is the FirstRepNumber :- FirstDuplicate(arr");
    }
}
