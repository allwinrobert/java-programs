import java.util.Scanner;

public class groupreverse {

	public static void main(String[] args) {
	
				Scanner sc = new Scanner(System.in);
				int a  = sc.nextInt();
				int[] arr=new int[a];
			    for(int i=0;i<arr.length;i++){
			       arr[i]=sc.nextInt();
			    }
			    int k=3;
			    
				for(int i=0;i<a;i++) {
					int left=i;
					int right=i+k-1;
					int temp=0;
				
				 while(left<right) {
					temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;
					left++;
					right--;

				}
				 for(int j :arr) {
					System.out.print(j+" ");
				}
			}
		}
				
	}

