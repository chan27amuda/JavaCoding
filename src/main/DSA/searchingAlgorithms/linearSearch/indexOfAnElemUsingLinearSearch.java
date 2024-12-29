package main.DSA.searchingAlgorithms.linearSearch;

public class indexOfAnElemUsingLinearSearch{

    public static int findElemIndexUsingLinearSearch(int arr[], int value){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]){

        int arr[] = {4,5,78,2,34,10,47,6};
        int foundIndexPosition;

        foundIndexPosition = findElemIndexUsingLinearSearch(arr, 34);

        if(foundIndexPosition < 0){
            System.out.println("Element 34 is not found in an Array");
        }else{
            System.out.println("Element 34 is placed at index position " + foundIndexPosition + " in an Array");
        }

        foundIndexPosition = findElemIndexUsingLinearSearch(arr, 100);

        if(foundIndexPosition < 0){
            System.out.println("Element 100 is not found in an Array");
        }else{
            System.out.println("Element 100 is placed at index position " + foundIndexPosition + " in an Array");
        }

        foundIndexPosition = findElemIndexUsingLinearSearch(arr, 5);

        if(foundIndexPosition < 0){
            System.out.println("Element 5 is not found in an Array");
        }else{
            System.out.println("Element 5 is placed at index position " + foundIndexPosition + " in an Array");
        }
    }
}