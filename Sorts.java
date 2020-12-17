public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  */

  //@param data the elements to be sorted.
  public static void bubbleSort(int[] data){
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

  public static void selectionSort(int[] data){
    for(int i = 0 ; i < data.length; i++){

      for(int f = 0; f < data.length-i; f++){

        if(data[f] < data[i]){
          int memory = data[i];
          data[i] = data[f];
          data[f] = memory;
        }

      }

    }
  }

}
