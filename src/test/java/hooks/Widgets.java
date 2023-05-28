package hooks;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Widgets {

    static SelenideElement elemId(String id) {
        return $(By.id("ru.hh.android:id/" + id));
    }

    static ElementsCollection listId(String id) {
        return $$(By.id("ru.hh.android:id/" + id));
    }

    public static SelenideElement closeButton() {
        return elemId("fragment_intentions_onboarding_choose_direction_image_close");
    }

    public static SelenideElement searchField() {
        return elemId("view_main_search_container");
    }

    public static SelenideElement input() {
        return elemId("toolbar_search_query");
    }

    public static ElementsCollection vacanciesList() {
        return listId("cell_vacancy_card_button_response");
    }

    public static SelenideElement value() {
        return elemId("cell_compound_left_image_title_text_view_title");
    }
}
