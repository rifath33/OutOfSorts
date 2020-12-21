import java.util.Arrays;
public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  */

  //@param data the elements to be sorted.
  public static void bubbleSort(int[] data){
    int stop = 0;
    for(int i = 0; i < data.length; i++){
      for(int j = 0; j < data.length-i-1; j++){
        int memory = data[j+1];
        if(data[j] > data[j+1]){
          data[j+1] = data[j];
          data[j] = memory;
        }
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
    for(int i = 0; i < data.length; i++){

      // for(int f = 0; f < data.length; f++){
      //   if(data[f] < data[i]){
      //     swap(data, f, i);
      //   }

      swap(data, indexOfSmallestElement(data, i, data.length), i);


    }

  }


  public static void swap(int[] data, int indexA, int indexB){
    int memory = data[indexA];
    data[indexA] = data[indexB];
    data[indexB] = memory;
  }

  public static int indexOfSmallestElement(int[] data, int startInclusive,
  int endNonInclusive){
    int memory = 0;
    for(int i = 0; i < endNonInclusive; i++){
      if(data[i] < data[memory])
      memory = i;
    }
    return memory;
  }


}
