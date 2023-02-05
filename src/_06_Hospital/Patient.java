package _06_Hospital;

public class Patient {
public boolean pulseTaken = false;
	public void checkPulse() {
		// TODO Auto-generated method stub
		System.out.println("Patient's pulse taken.");
		pulseTaken = true;
		feelsCaredFor();
		}

	public boolean feelsCaredFor() {
		// TODO Auto-generated method stub
		System.out.println("Patient feels cared for.");
		if(pulseTaken == true) {
			return true;
		}
		return false;
	}

}
