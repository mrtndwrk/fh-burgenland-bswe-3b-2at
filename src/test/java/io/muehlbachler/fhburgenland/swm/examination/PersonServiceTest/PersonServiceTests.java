package io.muehlbachler.fhburgenland.swm.examination.PersonServiceTest;
import io.muehlbachler.fhburgenland.swm.examination.model.Person;
import io.muehlbachler.fhburgenland.swm.examination.repository.NoteRepository;
import io.muehlbachler.fhburgenland.swm.examination.repository.PersonRepository;
import io.muehlbachler.fhburgenland.swm.examination.service.impl.PersonServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@ExtendWith(MockitoExtension.class)

public class PersonServiceTests {

    @Mock
    private PersonRepository personRepository;

    @Mock
    private NoteRepository noteRepository;

    @InjectMocks
    private PersonServiceImpl personService;

    @Test
    public void testGetAll() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("1", "Max", "Mustermann"));

        Mockito.when(personRepository.findAll()).thenReturn(persons);

        List<Person> result = personService.getAll();

        assertEquals(persons, result);
    }

}
