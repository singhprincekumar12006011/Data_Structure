import java.util.*;

class MyHash_1 {
 
        int bucket;
        ArrayList<LinkedList<Integer>> table;
        MyHash_1(int b)
        {
            bucket = b;
            table = new ArrayList<LinkedList<Integer>>();
            for(int i=0; i<b; i++)
            table.add(new LinkedList<Integer>());
        }
        void insert(Integer k)
        {
            int i = k % bucket;
            table.get(i).add(k);
        }
        boolean search (Integer k)
        {
            int i = k % bucket;
            return table.get(i).contains(k);
        }
        void delete(Integer k)
        {
            int i = k % bucket;
            table.get(i).remove(k);
        }
    }
public class MyHash_pro1 {

    public static void main(String[] args) {
        MyHash_1 mh = new MyHash_1(7);
        mh.insert(10);
        mh.insert(20);
	    mh.insert(15);
	    mh.insert(7);
	    System.out.println(mh.search(10));
	    mh.delete(15);
	    System.out.println(mh.search(15));
    }
}