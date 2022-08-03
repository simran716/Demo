package longestsubseq;

import java.util.Scanner;

public class Longest_Sub_Sequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array-");
		int n=sc.nextInt();
		System.out.println("Enter size of array-");
		int[] arr= new int[n];
		for(int i=0;i<n; i++){
			arr[i]=sc.nextInt();
		}
		int omax=0;
		int[] s=new int[n];
		for(int i=0;i<s.length ;i++){
			int max=0;
			for(int j=0;j<i;j++){
				if(arr[j]<arr[i]){
					if(s[j]>max){
						max=s[j];
					}
				}
			}
			s[i]=max+1;
			if(s[i]>omax){
				omax=s[i];
			}
		}
		System.out.println("max sequence:-"+omax);
	}

}
