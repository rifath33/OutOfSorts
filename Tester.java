import java.util.Random;
import java.util.Arrays;

public class Tester{
  public static void main(String[] args){


    // System.out.println(Arrays.toString(sort));
    // Sorts.selectionSort(sort);
    // System.out.println(Arrays.toString(sort));

    int[] sort = {64,25,12,22,11};

    // System.out.println(Sorts.indexOfSmallestElement(sort, 0, sort.length));
    System.out.println(Arrays.toString(sort));
    Sorts.bubbleSort(sort);
    System.out.println(Arrays.toString(sort));





    //
    // //kredit to mr.k for the seed code ;;;;;;)
    // Random rng = new Random(100);//seed of 100 is stored.
    //   for(int i =  0; i < sort.length; i++ ){
    //     sort[i] = (rng.nextInt() % 1000);
    //   }

    // System.out.println(sort.toString());

  }
}
