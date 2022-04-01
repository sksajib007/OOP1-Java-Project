package Interface;
import java.lang.*;
import Class.*;

public interface IEmployee{
	
	void insertEmployee(Employee e);
	void removeEmployee(Employee e);
	Employee getEmployee(String empId);
	void showAllEmployees();
}