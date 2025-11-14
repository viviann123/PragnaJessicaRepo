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
				if(arr[i][j]%2==0)
					return arr[i][j];
			}
		}
		return 0;
	}
}