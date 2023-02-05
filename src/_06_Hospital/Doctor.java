package _06_Hospital;

import java.util.ArrayList;

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
patient.checkPulse();
	}

	// @Override
	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		assignedPatients.add(patient);
		if(assignedPatients.size()>3) {
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
assignedPatients.add(patient);
if(assignedPatients.size()>3) {
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
