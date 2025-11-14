public class Collab{
	public int[] Part1(int n){
		int[] arr = new int[n];
		for(int i = 0; i<n; i++)
			arr[i] = (int)(Math.random()*10)+1;
		return arr;
	}
	public int Part2(int[][] arr){
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j< arr[0].length; j++){
				if(arr[i][j]%2==0){
					int sum = 0;
					if(j>0)
						sum+=arr[i][j-1];
					if(i>0)
						sum+=arr[i-1][j];
					if(i<arr.length)
						sum+=arr[i+1][j];
					if(j<arr.length)
						sum+=arr[i][j+1];
					if(sum>17)
						return sum;
				}
			}
		}
		return 0;
	}
}