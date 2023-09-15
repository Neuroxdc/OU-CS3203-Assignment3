import java.util.Scanner;

public static int arraySum(int[] array) {
	    
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
        sum += array[i];
    }
    
    return sum;
}

public static int arrayProduct(int[] array) {
	    
    int product = 1;
    for (int i = 0; i < array.length; i++) {
        product *= array[i];
    }
    
    return product;
}

public static int[] arrayReversed(int[] array) {
    int n = array.length;
    int[] arrayReversed = new int[n];
    
    for (int i = 0; i < n; i++) {
        arrayReversed[i] = array[n - i - 1];
    }
    
    return arrayReversed;
}

public static void main(String args[]) {
	    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of elements for the array: ");
    int num = scanner.nextInt();
    int[] array = new int[num];
    
    System.out.println("Enter" + num + "numbers:");
    for (int i = 0; i < num; i++) {
        System.out.println("Element " + (i + 1) + ":");
        array[i]=scanner.nextInt();
    }
    
    int totalSum = arraySum(array);
    int totalProduct = arrayProduct(array);
    int[] arrayReversed = arrayReversed(array);
    
    System.out.println("The sum of the array is :" + totalSum);
    System.out.println("The product of the array is:" + totalProduct);
    System.out.print("The order of the array in reverse is: ");

	for (int i = 0; i < arrayReversed.length; i++) {
	    System.out.print(arrayReversed[i] + " ");
	}

    scanner.close();
}