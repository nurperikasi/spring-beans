package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import app.model.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        for (int i = 0; i < 10; i++) {
            AnimalsCage bean =
                    applicationContext.getBean(AnimalsCage.class);
            bean.whatAnimalSay();
        }

        AnimalsCage dog = applicationContext.getBean(AnimalsCage.class);
        dog.whatAnimalSay();
    }

}
