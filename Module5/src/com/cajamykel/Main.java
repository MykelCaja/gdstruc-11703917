package com.cajamykel;

public class Main {

    public static void main(String[] args) {
	int numbers[] = {68,33,12,64,17,105,-53};

    selectionSortAscending(numbers);
    System.out.println(binarySearch(numbers, 105));
    System.out.println(binarySearch(numbers, 420));
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

    public static int binarySearch(int[] input, int value){
        int start = 0;
        int end = input.length -1;

        while(start <= end){
            int middle = (start + end) / 2;

            if(input[middle] == value){
                System.out.println("[ELEMENT FOUND AT THE MIDDLE]");
                return middle;
            }

            else if(value < input[middle]){
                System.out.println("[ELEMENT SEARCHING AT RIGHT SIDE]");
                end = middle - 1;
            }

            else if(value > input[middle]){
                System.out.println("[ELEMENT SEARCHING AT LEFT SIDE]");
                start = middle + 1;
            }
        }

        System.out.println("[ELEMENT NOT FOUND!]");
        return -1;
    }
}
