import java.time.LocalDate;
import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Test {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.Save(new Customer(16258, "Engin" , "Demiroð" , LocalDate.of(1995, 10, 19) , 46545645L));
				
	}

}
