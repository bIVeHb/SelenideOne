package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenide {

    @Test
    void solntsevShouldBeBestContributor(){
        // открыть страницу репозитария selenide
        open("https://github.com/selenide/selenide");
        // подвести мышку к первому аватару из блока contributors
        $(".BorderGrid").$(byText("Contributors")).ancestor(".BorderGrid-row")
                .$$("ul li").first().hover();
        // проверка: во всплывающем окне есть текст Andrei Solntsev
        $$(".Popover .Popover-message").findBy(Condition.visible).shouldHave(Condition.text("Andrei Solntsev"));

    }
}
