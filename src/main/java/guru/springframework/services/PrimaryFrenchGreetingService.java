package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*@Service
@Profile("fr")
@Primary*/
public class PrimaryFrenchGreetingService implements  GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryFrenchGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {

        return greetingRepository.getFrenchGreeting();
    }
}
