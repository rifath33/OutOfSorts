import java.util.Arrays;
public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  */

  //@param data the elements to be sorted.
  public static void bubbleSort(int[] data){
    boolean wasThereAValueSwapped = false;
    for(int i = 0; i < data.length ; i++){

      for(int j = 0; j < data.length-i-1; j++){

        if(data[j] > data[j+1]){
          swap(data, j+1, j);
          wasThereAValueSwapped=true;
        }
        if(wasThereAValueSwapped == false) 
        return  ;

      }

    }
  }

/*
The selection sort is an in-place sorting algorithm. It modifies an array in the
following way:

For each index i of the array, starting with the first index:
a Find the smallest element located at index i or any of the higher indices.
b Swap that value into index i.
c Increase i
d repeat a,b,c until the last index.

*/
  public static void selectionSort(int[] data){
    for(int i = 0; i < data.length-1; i++){

      swap(data, indexOfSmallestElement(data, i, data.length), i);

    }

  }

  public static void insertionSort(int[] data) {
    for (int i = 1; i < data.length; i++) {
        
        int workingWith = data[i];
        int previous = i - 1;
        
        while( (previous >= 0) && (data[previous] > workingWith) ){
            data[previous+1] = data[previous];
            previous--;
        }
        
        data[previous+1] = workingWith;
        
    }
  }

    // tools of the trade
    
  public static void swap(int[] data, int indexA, int indexB){
    int memory = data[indexA];
    data[indexA] = data[indexB];
    data[indexB] = memory;
  }

  public static int indexOfSmallestElement(int[] data, int startInclusive,
  int endNonInclusive){
    for(int i = startInclusive; i < endNonInclusive; i++){
      if(data[i] < data[startInclusive])
      startInclusive = i;
    }
    return startInclusive;
  }


}
