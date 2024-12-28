package com.example.demoX;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class Main implements CommandLineRunner{
    private PupiolService pupiolService;

    @Override
    public void run(String[] args) {
        Pupiol newPupiol = pupiolService.addNewPerson("x", "x");
        System.out.println("Добавлена новый челикс с ID: " + newPupiol.getPupiol_id());

        pupiolService.updatePers(UUID.fromString("8eaaa877-5af8-428e-9f2c-423cb3498792"), "y", "y");
        System.out.println("Обновил");

        pupiolService.delPersById(UUID.fromString("350f8402-ce8c-486f-a06b-74e029c19036"));
        System.out.println("Удалил");
    }
}
