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