package com.cajamykel;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = new int[10];

        numbers[0] = 122;
        numbers[1] = 12;
        numbers[2] = 45;
        numbers[3] = 4;
        numbers[4] = 70;
        numbers[5] = 1;
        numbers[6] = 72;
        numbers[7] = 80;
        numbers[8] = 88;
        numbers[9] = 90;

        //Ascending Order:
        //bubbleSortAscending(numbers);
        //selectionSortAscending(numbers);

        //Descending Order:
        //bubbleSortDescending(numbers);
        selectionSortDescending(numbers);

        printArrayElements(numbers);
    }

    //Descending Order:
    private static void bubbleSortDescending(int[] arr){
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--){
            for (int i = 0; i < lastSortedIndex; i++){
                if (arr[i] < arr[i +1]){
                    int temporary = arr[i];
                    arr[i] = arr[i +1];
                    arr[i+1] = temporary;
                }
            }
        }
    }

    private static void selectionSortDescending(int[] arr){
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--){
            int smallestIndex = 0;

            for(int i = 1; i <= lastSortedIndex; i++){
                if(arr[i] <= arr[smallestIndex]){
                    smallestIndex = i;
                }
            }

            int temporary = arr[smallestIndex];
            arr[smallestIndex] = arr[lastSortedIndex];
            arr[lastSortedIndex] = temporary;
        }
    }

    //Ascending Order:
    private static void bubbleSortAscending(int[] arr){
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--){
            for (int i = 0; i < lastSortedIndex; i++){
                if (arr[i] > arr[i +1]){
                    int temporary = arr[i];
                    arr[i] = arr[i +1];
                    arr[i+1] = temporary;
                }
            }
        }
    }

    private static void selectionSortAscending(int[] arr){
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--){
            int largestIndex = 0;

            for(int i = 1; i <= lastSortedIndex; i++){
                if(arr[i] > arr[largestIndex]){
                    largestIndex = i;
                }
            }

            int temporary = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temporary;
        }
    }

    //Printing
    private static void printArrayElements(int[] arr){
        for(int j: arr){
            System.out.println(j);
        }
    }
}
