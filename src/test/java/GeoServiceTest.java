import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.entity.Country;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceTest {
    @Test
    void byIpTest() {
        GeoService geoService = Mockito.spy(GeoServiceImpl.class);

        Assertions.assertEquals(Country.RUSSIA, geoService.byIp("172.").getCountry());
        Assertions.assertEquals(Country.USA, geoService.byIp("96.").getCountry());
    }
}
