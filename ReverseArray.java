import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Question: https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true
public class ReverseArray {

    public static void main(String[] args) {
        //toList() --> Gives immutable list this results in
        // UnSupportedOperation on ImmutableCollections
//        System.out.println(reverseArray(IntStream.range(1,10).boxed().toList()));

        //Doesnt give immutable list
        System.out.println(reverseArray(IntStream.range(1,10).boxed().collect(Collectors.toList())));
    }




    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        //Time: O(n) and Space: O(n)
        // ArrayList<Integer> res = new ArrayList<>(a.size());

        //This does not assign size to res, res size is still 0
        // if we try to add res.set(10, 7); results in ArrayOutofBounds

        // int las = a.size()-1;
        // for(int i=0;i<a.size();i++) {
        //     res.add(a.get(las-i));
        // }
        // return res;


        //Mistake: Tried to reverse array
        // with complete iteration this resulted
        // reversing twice and preserving the array

        //Time : O(n/2)
        int las = a.size()-1;
        for(int i=0; i<a.size()/2;i++) {
            int t = a.get(i);
            a.set(i, a.get(las-i));
            a.set(las-i, t);
        }
        return a;
    }
}
