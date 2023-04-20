import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceTest {
    @Test
    void localeTest() {
        LocalizationService localizationService = Mockito.spy(LocalizationServiceImpl.class);
        Country[] countries = Country.values();
        String str;
        for (Country country : countries) {
            str = localizationService.locale(country);
            if (country.equals(Country.RUSSIA)) {
                Assertions.assertEquals("Добро пожаловать", str);
            } else {
                Assertions.assertEquals("Welcome", str);
            }
        }
    }
}
