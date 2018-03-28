package MovieRS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UserFeature {
	private Map<String, Map<Integer,Double>> userfeature;
	
	public UserFeature(UserRating curRating){
		userfeature = new HashMap<String, Map<Integer,Double>>();
		//UserRating curRating = new UserRating();// get the data from UserRating
		createModel allData = new createModel();// get dataModel
		//loop every userid and put it into new map
		for(String user: curRating.getUserrating().keySet()){//loop every user
			Map<Integer, Double> value = new HashMap();
			//
			for(int genre = 6; genre < 24 ;genre++){//loop every genre
				//
				for(Rating rate:curRating.getUserrating().get(user)){//loop every rate(movieid and rate)
					
					if(allData.getDataModel().get(genre).contains(rate.movieID)){
						//if is first time to put the user in or  put special user's first genre
						if(!userfeature.containsKey(user)||!userfeature.get(user).containsKey(genre)){
							value.put(genre,rate.ratingScore);
							userfeature.put(user, value);
						}else{// we will use old score + new score
							double oldscore = userfeature.get(user).get(genre);
							double newscore = oldscore + rate.ratingScore;
							Map<Integer, Double> oldvalue = userfeature.get(user);
							oldvalue.replace(genre,oldscore,newscore);
							userfeature.put(user, oldvalue);
						}
					}
				}
			}	
		}
	}

	public Map<String, Map<Integer, Double>> getUserfeature() {
		return userfeature;
	}
}

