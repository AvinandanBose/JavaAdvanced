import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
public class ArrClass{
	int a;
	int b;
	public ArrClass(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int intArr[][] = { { 10, 20, 15, 22, 35 } ,{1,2,3,4,5}};
		int intArr1[][] = { { 10, 20, 15, 22, 35 } ,{1,2,3,4,5}};
		System.out.println("Enter an range:");
		int n = sc.nextInt();
		int Arr[]= new int [n];
		int Arr2[]= {1,2,3,4};
		for(int i = 0;i<Arr.length;i++) {
			Arr[i]= sc.nextInt();
		}
		for(int i = 0;i<Arr.length;i++) {
			System.out.print(Arr[i]);
		}
		System.out.println();
		List<ArrClass> list = Arrays.asList(new ArrClass(20,12), new ArrClass(40,15));
		System.out.println("Array as List: " + Arrays.asList(Arr));
		System.out.println("Array as List: " + list);
		System.out.println("Arrays to String:"+ Arrays.toString(Arr));
		System.out.println("Arrays Deep to String[multi-dimensional]:"+ Arrays.deepToString(intArr));
		System.out.println("Arrays Copy"+Arrays.toString(Arrays.copyOfRange(Arr,1,3)));
		System.out.println("Check boolean equals:"+Arrays.equals(Arr, Arr2));
		System.out.println("Check boolean equals:"+Arrays.deepEquals(intArr, intArr1));
		
		//BinarySearch
		int intKey = 5;
		System.out.println(intKey+ " found at index = "+ Arrays.binarySearch(Arr, 0, n, intKey));
		
		Arrays.fill(Arr, 5);
		//print altered array
        System.out.println("Array after call to fill:" + Arrays.toString(Arr));
		
	}
}