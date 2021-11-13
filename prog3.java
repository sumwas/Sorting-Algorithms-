// Used to return the two pivots in the 2-pivot partition
class Pair {
public int left, right;
public Pair(int left, int right) {
this.left = left;
this.right = right;
}
}
// Class to hold all the sorts and their associated methods
class ArraySorts {
	
   public static String myName() {
	return "Summayah Waseem";}
   
   static void swap(int[] arr, int i, int j) {
	   int temp = arr[i];
	   arr[i]= arr[j];
	   arr[j] = temp;
   }
   
   public static void insertionSort(int a[], int n) {}
   public static void QS_OutsideIn_randomPivot(int a[], int n, int cutoff) {
QS_OutsideIn_randomPivot(a, 0, n - 1, cutoff);
insertionSort(a, n);
   }
   
   private static void QS_OutsideIn_randomPivot(int a[], int lf, int rt, int cutoff) {
	   int pivot;
	   while ((rt - lf + 1) >= cutoff) {
		   pivot = lf + (int) (Math.random() * (rt - lf + 1));
		   pivot = partitionOutsideIn(a, lf, rt, pivot);
		   if ((pivot - lf) < (rt - pivot)) {
			   QS_OutsideIn_randomPivot(a, lf, pivot-1, cutoff);
			   lf = pivot+1;
		   } else {
			   QS_OutsideIn_randomPivot(a, pivot+1, rt, cutoff);
			   rt = pivot-1;
		   }
	   }
   }
   
   public static void QS_LeftToRight_randomPivot(int a[], int n, int cutoff){}
   public static void QuickSort_2Pivot_BothRandom(int a[], int n, int cutoff){}
   public static void QS_OutsideIn_lfPivot(int a[], int n, int cutoff) {}
   public static void QS_LeftToRight_lfPivot(int a[], int n, int cutoff) {}
   
   public static void AlmostQS_OutsideIn_randomPivot(int a[], int n, int cutoff) {
QS_OutsideIn_randomPivot(a, 0, n - 1, cutoff);
   }
   public static void AlmostQS_LeftToRight_randomPivot(int a[], int n, int cutoff) {
	   
   }
   public static void AlmostQuickSort_2Pivot_BothRandom(int a[], int n, int cutoff) {
	   
   }
   public static int partitionLeftToRight(int a[], int lf, int rt, int pivot) {
	   swap(a,pivot,lf);
	   int ls; 
	   int fu;
	   ls = lf;
	   fu = lf + 1;
	   while (fu <= rt) {
		   if (a[fu] < a[pivot]) {
			   swap(a,fu,ls+1);
			   ls++;
			   fu++;
		   }
		   else {
			   fu++;
		   }
	   }
	   swap(a,pivot,ls);
	   pivot = ls;
	   return pivot;
	   
   }
   public static int partitionOutsideIn(int a[], int lf, int rt, int pivot) {
	   swap(a, pivot, lf);
	   int LFPT; 
	   int RTPT; 
	   LFPT = lf + 1;
	   RTPT = rt;
	   while (LFPT < RTPT) {
		   while (a[LFPT]<a[pivot]) {
			   LFPT++;
		   }
		   while (a[RTPT]>a[pivot]) {
			   RTPT++;
		   }
		   swap(a,RTPT,LFPT);
	   }
	   if(a[RTPT]< pivot) {
		   swap(a,pivot, RTPT);
		   pivot = RTPT;
	   }
	   else {
		   swap(a,pivot,RTPT-1);
		   pivot = RTPT-1;
	   }
	   return pivot;
	   
   }
   public static Pair partition2Pivot(int a[], int lf, int rt, int pivotl, int pivotr) {
	   return null;
	   
   }
   public static void HeapSortBottomUp(int a[], int n) {
	   
   }
   public static void HeapSortTopDown(int a[], int n) {
	   
   }
   public static void trickleDown(int a[], int lf, int rt) {
	   
   }
   public static void trickleUp(int a[], int rt) {
   }
   
     
}
