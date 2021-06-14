import java.util.Arrays;

/**
 * Search element in collection
 * @author ashish
 */
public class BinSearch {
    public static void main(String[] args) {
        String strArr[]={"one","two","three","four"};
        Arrays.sort(strArr);
        int index=Arrays.binarySearch(strArr,"one");
        System.out.println(index);
    }
}
