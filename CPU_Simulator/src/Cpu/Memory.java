package Cpu;

public class Memory {
	private int[] data;
	
	public Memory(int size) {
		data= new int[size];
	}
	
	public int read(int addy) {//address
		//bound check
		if(addy<0 || addy>=data.length) {
			throw new IndexOutOfBoundsException("Out of Bounds :(\n"+ addy);
		}
		return data[addy];
	}
	
	
	//write value to data
	public void write(int addy, int val) {
		//bound check
		if(addy<0 || addy >= data.length) {
			throw new IndexOutOfBoundsException("Out of Bounds :(\n"+ addy);
		}
		data[addy] = val;
	}
	
	//help mthd to load program into mem
	public void loadProgram(int[] program, int startAddy) {
		for(int i = 0; i<program.length;i++) {
			write(startAddy +i, program[i]);
		}
	}
	
	public int getSize() {
		return data.length;
	}
	
}
