package OOPInterface;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FortisHospital fh = new FortisHospital();
		fh.dentalServices();
		fh.emergencyServices();
		fh.oncologyservices();
		fh.physioServices(10);
		fh.covidvaccination();
		System.out.println("Calling variable: "+USMedical.MIN_Fee);
		//top casting
		//child class object can be referred by parent interface ref variable
		USMedical us = new FortisHospital();
		us.oncologyservices();
		us.emergencyServices();
		us.dentalServices();
		us.dentalServices();

	}

}
