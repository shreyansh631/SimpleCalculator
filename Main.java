import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of operands:");
        int operands = input.nextInt();
        System.out.print("This is a calculator\nChoose an operation:\n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\nYour choice:");
        int choice = input.nextInt();
        switch (choice)
        {
            case 1:
                addition(operands);
                break;
            case 2:
                subtraction(operands);
                break;
            case 3:
                division(operands);
                break;
            case 4:
                multiplication(operands);
                break;

        }
    }
    public static void addition(int operands){
        int result=0;
        Scanner input1 = new Scanner(System.in);
        int []arr = new int[operands];
        for(int i=0;i<operands;i++){
            System.out.println("Enter number"+ (i+1));
            arr[i] = input1.nextInt();
        }
        for(int i=0;i<operands;i++){
            result = result + arr[i];
        }
        System.out.println("Addition result : "+result);
        return;
    }
    public static void subtraction(int operands){
        int ressub = 0;
        Scanner input2 = new Scanner(System.in);
        int[] arr1 = new int[operands];
        for(int i=0;i<operands;i++){
            System.out.println("Enter number " + (i+1));
            arr1[i] = input2.nextInt();
            ressub = arr1[0] - ressub;
        }
        for(int i=1;i<operands;i++){
            ressub = ressub - arr1[i];
        }
        System.out.println("Subtraction result : " + ressub);
        return;
    }
    public static void division(int operands){
        int resdiv = 0;
        int[] arr2 = new int[operands];
        Scanner input3 = new Scanner(System.in);
        for(int i=0;i<operands;i++){
            System.out.println("Enter choice " + (i+1));
            arr2[i] = input3.nextInt();
        }
        resdiv = arr2[0];
        for(int i=1;i<operands;i++){
            resdiv = resdiv/arr2[i];
        }
        System.out.println("Division result : " + resdiv);
        return;
    }
    public static void multiplication(int operands){
        int resmult = 0;
        int[] arr3 = new int[operands];
        Scanner input3 = new Scanner(System.in);
        for (int i=0;i<operands;i++){
            System.out.println("Enter number " + (i+1));
            arr3[i] = input3.nextInt();
        }
        resmult = arr3[0];
        for(int i=1;i<operands;i++){
            resmult = resmult * arr3[i];
        }
        System.out.println("Multiplication result is " + resmult);
        return;
    }

}
