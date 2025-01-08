package ie.atu.week11example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final PersonRepository personRepository;

    public DataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Person testData = new Person(1L, "test", 20, "dfd@example.com", "ms", "556", "fgfgfo", "fgdf");
        Person testData1 = new Person(2L, "test2", 45, "fgdfgrgd@example.com", "Ms", "34534534", "jktj", "asdfasdfsd");
        Person testData2 = new Person(3L, "test3", 60, "email@example.com", "mr", "5654654", "dfgsfg", "asfsdafasd");
        personRepository.save(testData);
        personRepository.save(testData1);
        personRepository.save(testData2);
    }
}