import java.util.*;
public class AddArr {
	public static void main(String[]args) {
		int n = 10;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(n);
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(6);
		a.add(7);
		adj.add(a);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(8);
		b.add(9);
		b.add(10);
		adj.add(b);
		System.out.print(adj);
		System.out.println();
		for(int i=0; i<adj.size();i++)
		{
			for(int j=0;j<adj.get(i).size();j++) {
				
				System.out.print(adj.get(i).get(j)+" ");
			}
		}
	}

}
