package MovieRS;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class CRank {
	private Map<String,ArrayList> contentRank;
	public CRank(UserRating Rate){
		contentRank = new HashMap<String,ArrayList>();
		contentRanking semiRank = new contentRanking(Rate);	//create semiRank that contains userid-> movieid-> weight
		MovieIdTitle IdTitle = new MovieIdTitle();			//this class will used for put movie title in rank
		for(String curUser: semiRank.getSemiRanking().keySet()){
			ArrayList<String> movietitles = new ArrayList<String>();

			Map<Integer, Double> unsorted = semiRank.getSemiRanking().get(curUser);
			//sort the map by value
			Map<Integer, Double> aftersorted = sortByValues((HashMap) unsorted); 
			//put the sorted map into ArrayList of Movie
			ArrayList<String> Movie = new ArrayList<String>();
			int NumofRecommend = 10;// we will recommend 10 movies
			Iterator it = aftersorted.entrySet().iterator();
		    while (it.hasNext() && NumofRecommend > 0) {
		        Map.Entry pair = (Map.Entry)it.next();
		        //if(pair.getValue() != 0)
		       // System.out.println(pair.getKey() + " :    " + pair.getValue());
		        String movietitle = IdTitle.getIdTitle().get(pair.getKey());
		        Movie.add(movietitle);
		        it.remove(); // avoids a ConcurrentModificationException
		        NumofRecommend--;
		    }
		    contentRank.put(curUser, Movie);
		}
	}
	@SuppressWarnings("unchecked")
	private static HashMap sortByValues(HashMap map) { 
	       LinkedList list = new LinkedList(map.entrySet());
	       // Defined Custom Comparator here
	       Collections.sort(list, new Comparator() {
	            public int compare(Object o1, Object o2) {
	               return ((Comparable) ((Map.Entry) (o2)).getValue())
	                  .compareTo(((Map.Entry) (o1)).getValue());
	            }
	       });

	       // Here I am copying the sorted list in HashMap
	       // using LinkedHashMap to preserve the insertion order
	       HashMap sortedHashMap = new LinkedHashMap();
	       for (Iterator it = list.iterator(); it.hasNext();) {
	              Map.Entry entry = (Map.Entry) it.next();
	              sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
	       return sortedHashMap;
	  }
	public Map<String, ArrayList> getContentRank() {
		return contentRank;
	}	
}