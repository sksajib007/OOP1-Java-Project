package Interface;
import java.lang.*;
import Class.*;

public interface IFoodItem{
	
	void insertFoodItem(FoodItem f);
	void removeFoodItem(FoodItem f);
	FoodItem getFoodItem(String fid);
	void showAllFoodItems();
}