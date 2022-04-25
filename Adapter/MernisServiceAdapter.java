package Adapter;
import Abstract.CustomerCheckService;
import Entities.Customer;
import Mernis.KPSPublicLocator;
import Mernis.KPSPublicSoap_PortType;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;


public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		KPSPublicSoap_PortType client;
		try {
			client = new KPSPublicLocator().getKPSPublicSoap();
			return client.TCKimlikNoDogrula(customer.nationalityId , customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), customer.dateOfBirth.getDayOfYear());
		} catch (Exception e) {
			System.out.println("An error has occurred.");
		}

		return false;
	}
}