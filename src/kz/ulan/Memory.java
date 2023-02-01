package kz.ulan;

/**
 * Created by Ulan on 1/25/2023
 */

public class Memory {
    int value;
    Operation operation;

    public enum Operation {
        LOAD, ADD, STORE, JUMP, NONE
    }

    public Memory(int value, Operation operation) {
        this.value = value;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "value=" + value +
                ", operation=" + operation +
                '}';
    }
}
