package Arrays;

import java.util.Arrays;

public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray (int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
    //insert
    public void insert (int location, int valueToInsert){
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToInsert;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("The location is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index top access array");
        }
    }

    //traverse

    public void traverseArray(){
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exist");
        }
    }
    //searcharray
    public void searchArray (int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    //delete

    public void deleteArray(int valueToDeleteIndex) {
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The Value is successfully deleted");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array");
        }
    }

    public static void main(String[] args) {
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(5);
        singleDimensionArray.insert(0,1);
        singleDimensionArray.insert(1,2);
        singleDimensionArray.insert(2,3);
        singleDimensionArray.insert(3,4);
        singleDimensionArray.insert(4,5);
//        singleDimensionArray.insert(5,4);
        singleDimensionArray.traverseArray();
        singleDimensionArray.deleteArray(2);
//        singleDimensionArray.searchArray(5);


        System.out.println(Arrays.toString(singleDimensionArray.arr));




        //Declare
        //Instantiate
        //Initialize

//        int[] intArray = new int[5];
//        intArray[0] = 1;
//        intArray[1] = 2;
//        intArray[2] = 5;
//        intArray[3] = 6;
//        intArray[4] = 7;
//        System.out.println(Arrays.toString(intArray));

//        String sArray[] = {"a","b","c","d"};
//        System.out.println(Arrays.toString(sArray));

    }
}
