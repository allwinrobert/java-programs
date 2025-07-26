
public class arraysmin {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Sort the array
	        Arrays.sort(arr);  

	        // The second-largest is at index (n-2)
	        int secondLargest = arr[n-2];

	        System.out.println(secondLargest);
	    }
	}

	}

}
