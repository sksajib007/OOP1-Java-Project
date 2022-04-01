package Interface;
import java.lang.*;
import Class.*;

public interface IRestaurant{
	
	void insertRestaurant(Restaurant r);
	void removeRestaurant(Restaurant r);
	Restaurant getRestaurant(String rid);
	void showAllRestaurants();
}