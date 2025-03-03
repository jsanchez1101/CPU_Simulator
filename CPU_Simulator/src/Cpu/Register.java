package Cpu;

public class Register {
	//essentially a small location for data. REMEMBER CPU IS A COLLECTION OF ALL COMPONENTS. ALU, Control Unit, Memory for Ram simulaton, and Instruction set to define CPU operations
	private int value;
	
	public Register() {
		this.value=0; //initializing register to a known state. 
		//Why =0? 
		/*1. Default state duh lol
		2. Predictable behavior. When simming CPU operations we want it easy to debug & easy to predict computations
		3. registers are cleared during a reset process so -> 0 -> mimic this behavior in sim
		4. With a known initial state we can prevent errors that can happen from uninitialized data
		*
		*/
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}
