import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList ("Dima","Stephan", "John", "Amalia");
		List<String> strings = filterNames(list);
		
		System.out.println("---------- name extractor -----------");
		System.out.println(strings);
		System.out.println("-----------similar numbers-----------");
		System.out.println(list3);
		System.out.println("-----------cycle letters-------------- ");
		System.out.println(cycleList(list4,list5));
		System.out.println("----------- Exclude number -------------------");
		System.out.println(listWithoutElements(list6, 10));
		System.out.println("------------- reverse numbers-----------");
		System.out.println(reverseList(listR));
		System.out.println("-------------connect two lists----------");
		System.out.println(ListConnection(list7, list8));
		
		
		
		//--------------------- name extractor --------------------//
		}
		public static List<String> filterNames(List <String> list){
			
			List<String> list2 = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).length() !=4) {
					list2.add(list.get(i));
					}	
			}
			return list2;
			
		//  ------------------------ similar numbers ---------------------------  //
			
		}
		
		static List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		static List<Integer> list2 = Arrays.asList(8,10,3,11,5);
		static List<String> list3 = similarNumbers(list1, list2);
		public static List<String> similarNumbers(List<Integer> list1, List<Integer> list2) {
			
			List<String> list3 = new ArrayList<>();
			for (int i = 0; i < list1.size(); i++) {
				if(list1.get(i) == list2.get(i)) {
					list3.add("YES");
					}	
			else list3.add("NO");
			}
			return list3;
		}
		
		//   ------------------------- cycle letters ----------------------------    //
		
		static List<String> list4 = Arrays.asList("a","b","c","d");
		static List<String> list5 = Arrays.asList("d","c","a","b");
		public static boolean cycleList (List<String> list1, List<String> list2){
	        if (list4.size()!=list5.size()) return false;
	        List<String> list = new ArrayList<>();
	        for (int i = 0; i <list2.size() ; i++) {
	            list.add(list2.get(i));
	        }
	        for (int i = 0; i <list4.size() ; i++) {
	        list.add(0,list5.get(list4.size()-1));
	        list.remove(list4.size());
	        list5=list;
	        if(list4.equals(list)) return true;
	        }
	        return false;
	    }
		
		//--------------------- Exclude number ----------------- //
		
		static List<Integer> list6 = Arrays.asList(1,10,20,3,4,5,12);
		
		public static List<Integer> listWithoutElements(List<Integer> list, int n){
	        List<Integer> nlist = new ArrayList<>();
	        for (int i = 0; i < list.size(); i++) {
	            if(list.get(i) < n){
	                nlist.add(list.get(i));
	            }
	        }
	        return nlist;
	    }
		// ------------------  reverse numbers -------------------//
		
		static List<Integer> listR = Arrays.asList(1,2,3,4,5);
		
		public static List<Integer> reverseList (List<Integer> list){
	        List<Integer> listR = new ArrayList<>();
	        for (int i = 0; i < list.size(); i++) {
	            listR.add(list.get(list.size()-1-i));
	        }
	        return listR;
	    }
		
		
		//---------------- connect two lists-------------//
		static List<Integer> list7 = Arrays.asList(1,2,3,8,5);
		static List<Integer> list8 = Arrays.asList(11,2,9,4,6);
		
		public static List<Integer> ListConnection (List<Integer> list7,List<Integer> list8){
			
			List<Integer> list9 = new ArrayList<>();
			list9.addAll(list7);
			list9.addAll(list8);
			return list9;
			
		}
	
}

			



		

		



