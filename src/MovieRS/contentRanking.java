package MovieRS;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class contentRanking {
	//this map will contain every movie's weight for every user
	private Map<String, Map<Integer,Double>> semiRanking;
	//this constructor will calculate the rating according to movie's feature and user's feature
	public contentRanking(UserRating curRating){
		semiRanking = new HashMap<String, Map<Integer,Double>>();
		//get movie's information
		Map<Integer,List<Integer>> movieModel = new createModel().getDataModel();
		//get user's feature
		Map<String, Map<Integer,Double>> userModel = new UserFeature(curRating).getUserfeature();
		// 1st: loop every user because userid will be the key of result
		for(String user:userModel.keySet()){
			// 2nd: loop every genre to multiple every user's feature with movie which contains this kind of genre
			for(int genre = 6; genre < 24 ; genre++){
				// 3rd: loop every movie under this genre and put it into semiRanking
				for(int movieId:movieModel.get(genre)){
					//this map is temp map for put is semiRanking
					Map<Integer, Double> value = new HashMap();
					// there is a situation : user model may not have information about special genre 
					double newWeight = 0;
					if(userModel.get(user).get(genre)!=null){
						newWeight = userModel.get(user).get(genre);
					}
					// check if semiRanking contains current user
					if(!semiRanking.containsKey(user)){
						value.put(movieId, newWeight);
						semiRanking.put(user, value);
					}// check if semiRanking contains current movie
					else if(!semiRanking.get(user).containsKey(movieId)){
						Map<Integer,Double> oldweight = semiRanking.get(user);
						oldweight.put(movieId,newWeight);
						semiRanking.put(user, oldweight);
					}else{
						// already have current movie's weight in semiRanking
						double oldWeight = semiRanking.get(user).get(movieId);
						// replace previous weight to new weight into map in map
						double weight = newWeight + oldWeight;
						Map<Integer,Double> oldweight = semiRanking.get(user);
						oldweight.put(movieId, weight);
						semiRanking.put(user,oldweight);
					}
				}
			}
		}
	}
	public Map<String, Map<Integer, Double>> getSemiRanking() {
		return semiRanking;
	}
}