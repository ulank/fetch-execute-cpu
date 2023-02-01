package kz.ulan;

public class CPU {
    int counter;
    int accumulator;
    int instruction;
    Memory.Operation operation;
    Memory[] memories;

    public CPU(Memory[] memories) {
        this.memories = memories;
        this.accumulator = 0;
    }

    public void run() {
        for (this.counter = 0; this.counter < this.memories.length; this.counter++) {
            if (this.memories[this.counter] != null) {
                fetch();
                execute();
            }
        }
    }

    public void read() {
        for (int i = 0; i < memories.length; i++) {
            if (memories[i] != null)
                System.out.println("Memory address " + i + " and " + memories[i]);
        }
    }

    public void fetch() {
        this.operation = this.memories[this.counter].operation;
        this.instruction = this.memories[this.counter].value;
    }

    public void execute() {
        switch (operation) {
            case LOAD -> {
                this.accumulator = memories[this.instruction].value;
            }
            case ADD -> {
                this.accumulator += memories[this.instruction].value;
            }
            case STORE -> {
                memories[this.instruction].value = this.accumulator;
            }
            case JUMP -> {
                this.counter = memories[this.instruction].value;
            }
        }
    }
}
