package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// Qualifier annotation will have precedence over Primary annotation
@Primary
@Service
public class PrimaryGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World!! - From the PRIMARY Bean";
    }
}
