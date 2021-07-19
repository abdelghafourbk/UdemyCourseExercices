package FirstExercice;

	import java.util.Scanner;
	
	public class maxIntInArray {
	
		public static void main(String[] args) {
			System.out.println("How many numbers u want to enter:");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			System.out.println("Enter ur Integar numbers");
			
			int T[] = new int[n]; 
			for(int i=0;i<n;i++) {
				T[i]=sc.nextInt();
			}
			int MaxIntinArray=T[0];
			for(int i=1;i<n;i++) {
				if(T[i]>MaxIntinArray) {
					MaxIntinArray = T[i];
				}
			}
			System.out.println("\nthe max integar is: "+MaxIntinArray);
	
		}
	
	}
