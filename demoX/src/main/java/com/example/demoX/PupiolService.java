package com.example.demoX;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;
import java.util.UUID;


@Service

public class PupiolService {

    private final PupiolRepository pupiolRepository;

    public PupiolService(PupiolRepository pupiolRepository) {
        this.pupiolRepository = pupiolRepository;
    }


    @Transactional
    public Pupiol updatePers(UUID person_id, String person_name, String person_surname){
        Optional<Pupiol> persOpt = pupiolRepository.findById(person_id);
        Pupiol pupiol = persOpt.orElse(null);
        pupiol.setPupiol_name(person_name);
        pupiol.setPupiol_surname(person_surname);
        return pupiolRepository.save(pupiol);    }

    @Transactional
    public Pupiol addNewPerson(String person_name, String person_surname){
        Pupiol car = new Pupiol();
        car.setPupiol_id(UUID.randomUUID());
        car.setPupiol_name(person_name);
        car.setPupiol_surname(person_surname);

        return pupiolRepository.save(car);
    }
    @Transactional
    public void delPersById(UUID car_id){
        pupiolRepository.deleteById(car_id);
    }
}