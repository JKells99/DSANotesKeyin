package Arrays;

import java.util.Arrays;

public class TwoDimensionalArray {
    int arr[][] = null;

    public TwoDimensionalArray (int numberOfRows, int numberOfCols){
        arr = new int[numberOfRows][numberOfCols];
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col <arr[0].length; col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    //insert
    public void insert (int row, int col, int valueToInsert){
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = valueToInsert;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("The location is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }

    //traverse

    public void traverseArray(){
        try {
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[0].length; col++){
                    System.out.println(arr[row][col] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Array no longer exist");
        }
    }

    //searcharray
    public void searchArray (int valueToSearch) {
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col <arr[0].length; col++){
                if (arr[row][col] == valueToSearch) {
                    System.out.println("Value is found at row:  " + row + " Col: " + col);
                    return;
                }
            }

        }
        System.out.println(valueToSearch + " is not found");
    }
    //delete

    public void deleteArray(int row,  int col) {
        try {
            arr[row][col] = Integer.MIN_VALUE;
            System.out.println("The Value is successfully deleted: " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array");
        }
    }

    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(4,5);
        System.out.println(Arrays.toString(twoDimensionalArray.arr));
    }
}
