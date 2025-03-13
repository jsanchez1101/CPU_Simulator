package Cpu;

public class Register {
	//essentially a small location for data.
	
	public Register() {
		this.value=0; //initializing register to a known state. 
		
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}
