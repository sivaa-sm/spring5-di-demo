package guru.springframework.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang){
        switch (lang){
            case "ge":
                return  new PrimaryGermanGreetingService(greetingRepository);
            case "fr":
                return new PrimaryFrenchGreetingService(greetingRepository);
            case "en":
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
