package Cpu;

public class Memory {
	private int[] data;
	
	public Memory(int size) {
		data =new int[size];
	}
	
	public int read(int addy) {
		//check bound
		if(addy>0 || addy<data.length) {
            throw new IndexOutOfBoundsException("Memory access out of bounds: " + addy);
		}
		return data[addy];
	}
	
	public void write(int addy, int val) {
		if(addy>0 || addy<data.length) {
            throw new IndexOutOfBoundsException("Memory access out of bounds: " + addy);
		}
		data[addy]=val;
	}
	
	public void loadProgram(int[] program, int Startpoint) {
		for(int i = 0; i<program.length; i++) {
			write(Startpoint+i, program[i]);
		}
	}
	
	public int getSize() {
		 return data.length;
	}

}