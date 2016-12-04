package Task_1;

public final class ArraysUtils {

    static void sum (int array[]){
        int sumAll=0;
        for (int i = 0; i < array.length; i++){
            sumAll+= array[i];
        }
        System.out.println("Array's summ  is "+sumAll);
    }

    static void minElement (int array[]){
        int min = array[0];
        for (int i = 0; i < (array.length-1); i++){
            if ((array[i]>array[i+1]) && (min > array[i+1])){
                min = array[i+1];
            }
        }
        System.out.println("Array's minimum element  is "+min);
    }

    static void maxElement (int array[]){
        int max = array[0];
        for (int i = 0; i < (array.length-1); i++){
            if ((array[i] < array[i+1]) && (max < array[i+1])){
                max = array[i+1];
            }
        }
        System.out.println("Array's maximum element  is "+max);
    }

    static void maxPositiv (int array[]){
        int maxPos = 0;
        for (int i = 0; i < array.length; i++){
            if ((array[i] > 0) && (maxPos < array[i])){
                maxPos = array[i];
            }
        }
        if (maxPos == 0){
            System.out.println("There are no any positive elements in array");
        } else {
            System.out.println("Array's maximum positive element  is " + maxPos);
        }
    }

    static void multiplication (int array[]){
        int multi = array[0];
        for (int i = 1; i < array.length; i++){
            multi*= array[i];
        }
        System.out.println("Multiplikation all array's elements is " + multi);
    }

    static void modulus (int array[]){
        int mod = array[(array.length-1)] % array[0];
        System.out.println("Division by mod last and first elements" + mod);
    }

    static void secondLargest (int array[]){
        int max, secMax;
        max = secMax = array [0];
        int i = 1;
        while ((max == secMax) && (i < array.length)) {
            if (array[i] != max){
                secMax = array[i];
            }
            i++;
        }
        for (i = 1; i < array.length; i++){
            if (max < array[i]){
                secMax = max;
                max = array[i];
            } else {
                if ((secMax < array[i]) && (array[i] != max)) {
                    secMax = array[i];
                }
            }
        }
        if (max == secMax) {
            System.out.println("All elements in array are equal");
        } else System.out.println("Second largest element is " + secMax);
    }

    static int[] reverse(int[] array){
        int tempVal;
        int length = array.length;
        if ((length%2) == 0){
            for (int i = 0; i <= length/2-1; i++){
                tempVal = array[i];
                array[i] = array[length-1-i];
                array[length-1-i] = tempVal;
            }
        }else {
            for (int i = 0; i <= (length-1)/2; i++){
                tempVal = array[i];
                array[i] = array[length-1-i];
                array[length-1-i] = tempVal;
            }
        }
        System.out.println("The reverse array is ");
        for (int i=0; i<length; i++){
            System.out.println(array[i]);
        }
        return array;
    }

    static int[] findEvenElements(int[] array){
        int p = array.length;
        int evenArraylength = 0;
        for (int i=0; i < array.length; i++){
            if (array[i]%2 == 0 && (array[i] != 0) || array[i] == 2){
                evenArraylength++;
            }
        }

        int[]evenArray = new int[evenArraylength];
        int k = 0;
        for (int i=0; i < array.length; i++){
            if (array[i]%2 == 0 && (array[i] != 0)){
                evenArray[k] = array[i];
                k++;
            }
        }

        if (evenArraylength == 0){
            System.out.println("There are no even elements in array");
        } else {
            System.out.println("Even elements  are ");
            for (int i=0; i< evenArraylength; i++){
            System.out.println(evenArray[i]);
            }
        }

        return evenArray;
    }
}

