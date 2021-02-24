package ru.netology;

import com.github.javafaker.Faker;
import java.util.Locale;


public class DataGenerator {

    private DataGenerator() {
    }

    public static class Registration {

        private Registration() {

        }

        public static RegistrationInfo generateByCard() {
            Faker faker = new Faker(new Locale("ru"));
            return new RegistrationInfo(
                    faker.address().city(),
                    faker.name().fullName(),
                    faker.phoneNumber().phoneNumber()
            );
        }
    }
}
