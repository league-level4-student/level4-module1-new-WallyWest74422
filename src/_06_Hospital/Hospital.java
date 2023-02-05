package _06_Hospital;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hospital{

	ArrayList<Doctor> Doctors = new ArrayList<Doctor>();

	ArrayList<Patient> unassignedPatients = new ArrayList<Patient>();

	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		Doctors.add(doctor);
	}
	
	public void addPatient(Patient patient) {
		unassignedPatients.add(patient);
		
	}

	public ArrayList getDoctors() {
		// TODO Auto-generated method stub
		return Doctors;
	}

	public ArrayList getPatients() {
		// TODO Auto-generated method stub
		return unassignedPatients;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		for (int i=0; i<Doctors.size(); i++) {
			for(int j=0; j<3; j++) {
			try {
				if(unassignedPatients.size()==0) {
					break;
				}else {
					Doctors.get(i).assignPatient(unassignedPatients.remove(0));
				}
			} catch (DoctorFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}


}
