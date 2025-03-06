package Cpu;

public enum Instruction {
	NOP(0),
	ADD(1),
	SUB(2),
	LOAD(3),	
	STORE(4),
	JMP(5);
	
	private final int opcode;
	
	Instruction(int opcode) {
		this.opcode= opcode;
	}
	
	public int getOpcode() {
		return opcode;
	}
	
	public static Instruction fromOpcode(int opcode) {
		for(Instruction instr : values()) {
			if (instr.getOpcode() == opcode)  {
				return instr;
			}
		}
		throw new IllegalArgumentException("Invalid Instructions: " + opcode);
	}
	
}
