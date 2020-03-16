package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// Add multiple values to set a name to the profile and to set a default profile
@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Ola Mundo!!";
    }
}
