package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OperationService {

    @Autowired
    private OperationStorage operationStorage;


    public Operation calculate( Operation operation) {
        Operation process = operation.process();
        operationStorage.save(process);
        return process;
    }
}
