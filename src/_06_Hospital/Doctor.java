package _06_Hospital;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Doctor extends Patient{
	Patient patient = new Patient();

	public abstract void doMedicine();

	ArrayList<Patient> assignedPatients = new ArrayList<Patient>();

	public abstract void assignPatient(Patient patient) throws DoctorFullException;

	public abstract ArrayList getPatients();
	
	public boolean makesHouseCalls() {
		return false;
	}
	
	public boolean performsSurgery() {
		return false;
		
	}
}

class GeneralPractitioner extends Doctor {

	@Override
	public void doMedicine() {
		// TODO Auto-generated method stub
		for (int i =0; i<assignedPatients.size();i++) {
			assignedPatients.get(i).checkPulse();
			
		}
	}

	 @Override
	public void assignPatient(Patient patient) throws DoctorFullException {
	if(assignedPatients.size()<3) {
			assignedPatients.add(patient);
			System.out.println(assignedPatients.size());
		}else{
			System.out.println("Exception.");
			throw new DoctorFullException();
			
		}

	}

	@Override
	public ArrayList getPatients() {
		// TODO Auto-generated method stub
		return assignedPatients;
	}

	public boolean makesHouseCalls() {
		return true;
	}

}

class Surgeon extends Doctor {

	@Override
	public void doMedicine() {
		// TODO Auto-generated method stub
patient.checkPulse();
	}

	@Override
	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		if(assignedPatients.size()<3) {
			assignedPatients.add(patient);
			System.out.println(assignedPatients.size());
		}else{
			System.out.println("Exception.");
			throw new DoctorFullException();
			
		}
	}

	@Override
	public ArrayList getPatients() {
		// TODO Auto-generated method stub
		return assignedPatients;
	}

	public boolean performsSurgery() {
		return true;
	}
}
