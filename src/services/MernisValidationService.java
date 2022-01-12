package services;

import java.rmi.RemoteException;
import java.util.Locale;
import java.util.Objects;

import commons.Citizen;
import commons.CitizenValidationService;
import external.mernis.ws.KPSPublicSoapProxy;

public class MernisValidationService implements CitizenValidationService {

	private static final Locale LOCALE = new Locale("tr");
	private static MernisValidationService instance;

	public static MernisValidationService getInstance() {
		if (Objects.isNull(instance)) {
			instance = new MernisValidationService();
		}
		return instance;
	}

	private MernisValidationService() {
	}

	@Override
	public boolean validate(Citizen citizen) {
		try {
			KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
			return proxy.TCKimlikNoDogrula(citizen.getTckNo(),
										   citizen.getFirstName().toUpperCase(LOCALE),
										   citizen.getFamilyName().toUpperCase(LOCALE),
										   citizen.getBirthYear());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

}
