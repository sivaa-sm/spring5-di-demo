package guru.springframework.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository{

    @Override
    public String getGermanGreeting() {
        return "Hello - Primary Greeting service - GE";
    }

    @Override
    public String getFrenchGreeting() {
        return "Hello - Primary Greeting service - FR";
    }

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service - EN";
    }


}
