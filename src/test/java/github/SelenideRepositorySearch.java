package github;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {

    @Test
    void shouldFindSelenideAtTopContributor() {
        //Arrange, Act, Assert - 3 phases in any tests.

        // открыть главную страницу
        Selenide.open("https://github.com/");
        // ввести в поле поиска selenide и нажать enter
        $(".header-search-input").setValue("selenide").pressEnter();
        // кликнуть на первый репозитарий из списка найденных
        $$("ul.repo-list li").first().$("a").click();
        // проверка: заголовок selenide/selenide
        $("#repository-container-header").shouldHave(text("selenide / selenide"));

    }

}
