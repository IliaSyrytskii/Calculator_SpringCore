package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OperationStorage {
    private final List<Operation> operations = new ArrayList<>();

    public void save(Operation operation) {
        operations.add(operation);
    }
    public List<Operation> getAll() {
        return new ArrayList<>(this.operations);
    }
}
