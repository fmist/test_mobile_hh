package hooks;

import com.codeborne.selenide.CollectionCondition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static hooks.Widgets.*;

public class Steps {

    @And("Закрываю всплывающее окно")
    public void closeWindow() {
        closeButton().click();
    }

    @And("В поле поиска ввожу {string} и нажимаю на первое значение")
    public void fillData(String data) {
        searchField().click();
        input().sendKeys(data);
        value().click();
    }

    @Then("Проверяю что количество найденных ваканский больше {int}")
    public void checkItemsList(int number) {
        vacanciesList().shouldHave(CollectionCondition.sizeGreaterThan(number));
        System.out.println("items size: " + vacanciesList().size());
    }
}
