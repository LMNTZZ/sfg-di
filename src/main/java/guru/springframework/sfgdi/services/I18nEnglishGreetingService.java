package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
// Define a name to your service for the @Qualifier annotation to pick up
@Service("i18nService")
public class I18nEnglishGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World!!";
    }
}
