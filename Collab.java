public class Collab{
	public int[] createArray(int n){
		int[] arr = new int[n];
		for(int i = 0; i<n; i++)
			arr[i] = (int)(Math.random()*10)+1;
		return arr;
	}
}