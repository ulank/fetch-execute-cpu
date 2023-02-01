package kz.ulan;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Ulan on 1/25/2023
 */

public class Register {

    /*
     * 1. Suppose the hypothetical processor of Figure 1.3 also has two I/O instructions:
     *   0001 = Load AC from I/O
     *   0101 = Add contents of memory
     *   1000 = Store AC to I/O
     * In these cases, the 12-bit address identifies a particular external device.
     * Show the program execution (using the format of Figure 1.4) for the following program:
     *   1. Load AC from I/O device 3
     *   2. Add contents of memory location 541
     *   3. Store AC to I/O device 7
     * Assume that the next value retrieved from device 3 is 9, and that location 541 contains a value of 7.
     * 1. The program execution of Figure 1.4 is described in the text using six steps.
     * Expand this description to show the use of the MAR and MBR.
     * */

    public static void main(String[] args) {
        Memory[] memories = new Memory[1000];
        memories[3] = new Memory(4, Memory.Operation.LOAD);
        memories[4] = new Memory(9, Memory.Operation.NONE);
        memories[7] = new Memory(0, Memory.Operation.NONE);
        memories[9] = new Memory(541, Memory.Operation.ADD);
        memories[541] = new Memory(7, Memory.Operation.STORE);
        CPU cpu = new CPU(memories);
        cpu.run();
        cpu.read();
    }
}
