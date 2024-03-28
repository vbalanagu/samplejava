package OOPInterface;

public class FortisHospital extends Hospital implements USMedical, UKMedical, IndianMedical {


	@Override
	public void physioServices() {
		// TODO Auto-generated method stub
		System.out.println("FH -- PhysioServices");
	}

	@Override
	public void oncologyservices() {
		// TODO Auto-generated method stub
		System.out.println("FH -- oncologyServices");
		
	}

	@Override
	public void dentalServices() {
		// TODO Auto-generated method stub
		System.out.println("FH -- Dental Services");
	}

	@Override
	public void gynicServices() {
		// TODO Auto-generated method stub
		System.out.println("FH -- Gynic Services");		
	}

	@Override
	public void gastroServices() {
		// TODO Auto-generated method stub
		System.out.println("FH -- Gastor Services");
	}

	@Override
	public void neuroServices() {
		// TODO Auto-generated method stub
		System.out.println("FH -- neuro Services");
		
	}

	@Override
	public void pediaServices() {
		// TODO Auto-generated method stub
		System.out.println("FH -- pedia Services");
	}

	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub
		System.out.println("FH -- Emergency Services");
	}
	
	//Individual methods
	public void medicalTraining() {
		System.out.println("FH -- medical training");
	}
	public void pathologyTraining() {
		System.out.println("FH -- pathology training");
	}

	@Override
	public void physioServices(int a) {
		// TODO Auto-generated method stub
		System.out.println("FH -- physioServices --"+a);
	}

	@Override
	public void covidvaccination() {
		// TODO Auto-generated method stub
		System.out.println("FH -- COVID Vaccination --");
	}
	

}
