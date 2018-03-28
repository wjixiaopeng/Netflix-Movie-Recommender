package MovieRS;
import java.util.*;
public class UserRating {
	
	
	private Map<String, ArrayList<Rating>> userrating;
	
	//constructor create a empty map
	public UserRating(){
		userrating = new HashMap<String, ArrayList<Rating>>();
	}
	//Enter an userID, create a empty list
	public void addUser(String UserID){
		if(!userrating.containsKey(UserID))
			userrating.put(UserID, new ArrayList<Rating>());
		else
			return;
	}
	//Enter ratings, add the Rating class to the list.

	public void addUserIDRating(String UserID,int movieID, double ratingScore){
		Rating rating = new Rating(UserID,movieID,ratingScore);
		if(!userrating.get(UserID).contains(rating))
			userrating.get(UserID).add(rating);
		else
			return;
	}
	//You can write some getters whatever you want!
	public String[] getUserID(){
		Map<String, ArrayList<Rating>> map = getUserrating();
		String[] UID = null;
		int i=0;
		for (Map.Entry<String, ArrayList<Rating>> entry : map.entrySet()) {    
				UID[i]= entry.getKey();
				i++;
		}  
		return UID;	
	}
	public Map<String, ArrayList<Rating>> getUserrating() {
		return userrating;
	}
}
class Rating{
	String UserId;
	int movieID;
	double ratingScore;
	public Rating(){
		
	}
	public int getMovieID() {
		return movieID;
	}
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
	public double getRatingScore() {
		return ratingScore;
	}
	public void setRatingScore(int ratingScore) {
		this.ratingScore = ratingScore;
	}
	public Rating(String UserId, int movieID, double ratingScore2) {
		
		this.UserId = UserId;
		this.movieID = movieID;
		this.ratingScore = ratingScore2;
		
	}
	
	
}
