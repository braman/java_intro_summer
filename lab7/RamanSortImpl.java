public class RamanSortImpl implements SortInterface {
	
	public int[] sort(int[] a) {
		for (int i=0;i<a.length-1;i++) {
			for (int j=i+1;j<a.length;j++) {
				if (a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		return a;
	}

	public static void main(String args[]) {
		int a[] = new RamanSortImpl().sort(new int[]{5,4,6,7,1,2});
		for (int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
}
