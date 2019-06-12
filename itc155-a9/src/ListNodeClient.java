
public class ListNodeClient {

	public static void main(String[] args) {
		int[] listData1 = {0, 1, -1, 2, 3, 5};
		int[] listData2 = {-1, 0, 0, 1, 2, 4};
		
		LinkedIntList list1 = new LinkedIntList();
		LinkedIntList list2 = new LinkedIntList();
		
		for(int i = 0; i < listData1.length; i++) {
			list1.add(listData1[i]);
		}
		
		for(int i = 0; i < listData2.length; i++) {
			list2.add(listData2[i]);
		}
		
		System.out.println("List 1 sorted?: " + list1.isSorted());
		System.out.println("List 2 sorted?: " + list2.isSorted());

	}

}
