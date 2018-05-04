import java.util.ArrayList;

public class InsertSorted {
	
	private static int insert(ArrayList<String> list, String target) {
		if(list.size() > 0 && list.get(list.size()-1).compareTo(target) < 0)
			return list.size();
		return indexSorted(list, target, 0, list.size()-1);
	}
	
	private static int indexSorted(ArrayList<String> list, String target, int start, int end) {
		if (list.size() == 0)
			return 0;
		if(end == start) {
			return start;
		}
		int middle = (start + end) / 2;
		if(list.get(middle).compareTo(target) < 0)
			return indexSorted(list, target, middle + 1, end);
		return indexSorted(list, target, start, middle+1);
		
	}
	

}
