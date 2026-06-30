package qa.test.allure;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class StepsTest {
    @BeforeAll
    static void setupAllure() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
    @Test
    public void testIssueSearch() {
        //Лямда функция () -> {}
        step("Открыть главную страницу", () -> {
            open("https://github.com");
        });
        //$(".search-input-container").click();
        step("Нажать на поле", () -> {
            $(".search-input-container").click();
        });
        //$("#query-builder-test").sendKeys("eroshenkoam/allure-example");
        step("Ввезти данные eroshenkoam/allure-example", () -> {
            $("#query-builder-test").sendKeys("eroshenkoam/allure-example");
        });
        //$("#query-builder-test").submit();
        step("Нажать кнопку ENTER", () -> {
            $("#query-builder-test").submit();
        });

        //$(linkText("eroshenkoam/allure-example")).click();
        step("Нажать на строку", () -> {
            $("#query-builder-test").submit();
        });
        //$("#_r_6_--label");
        step("Выбрать раздел", () -> {
            $("#query-builder-test").submit();
        });
        //$(withText("#1747")).should(exist);
        step("Найти хештег", () -> {
            $("#query-builder-test").submit();
        });
    }
}

