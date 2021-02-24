package ru.netology;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static ru.netology.DataGenerator.Registration.generateByCard;

public class CardDeliveryTest {

    RegistrationInfo info = generateByCard();
    String date = LocalDate.now().plusDays(3).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

    @Test
    public void shouldRegistrationAndChangeDateMeeting(){
        open("http://localhost:9999/");
        $("[data-test-id=city] input").setValue(DataGenerator.Registration.generateByCard().getCity());
        $("[data-test-id=date] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id=date] input").setValue(date);
        $("[data-test-id=name] input").setValue(DataGenerator.Registration.generateByCard().getName());
        $("[name=phone]").setValue(DataGenerator.Registration.generateByCard().getPhone());
        $("[data-test-id=agreement]").click();
        $$("[type='button']").find(exactText("Запланировать")).click();
        $("[data-test-id=success-notification] .notification__content").shouldBe(visible, Duration.ofSeconds(15)).shouldHave(exactText("Встреча успешно запланирована на " + date));
        $$("[type='button']").find(exactText("Запланировать")).click();
        $(withText("Перепланировать")).click();
        $("[data-test-id=success-notification] .notification__title").shouldBe(visible, Duration.ofSeconds(15)).shouldHave(exactText("Успешно!"));
    }

}
