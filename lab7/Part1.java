import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class Part1 {
	
	public static void main(String args[]) {
		//List list1 = new ArrayList();
		SortInterface si = new RamanSortImpl();
		SortInterface si2 = new JavaSortImpl();
		
		Random r = new Random();

		int a[] = new int[10000];
		int b[] = new int[a.length];	
		for (int i=0;i<a.length;i++) {
			a[i] = r.nextInt(100000);
			b[i] = r.nextInt(100000);
		}
		
		long t0 = System.currentTimeMillis();

		a = si.sort(a);
		
		long t1 = System.currentTimeMillis();
		
		b = si2.sort(b);

		long t2 = System.currentTimeMillis();


		System.out.printf("SI1 - %d ms\n", t1-t0);
		System.out.printf("SI2 - %d ms\n", t2-t1);

	}

}
