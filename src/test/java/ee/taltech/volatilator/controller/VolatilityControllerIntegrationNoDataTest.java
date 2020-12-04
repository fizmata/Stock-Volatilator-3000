package ee.taltech.volatilator.controller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.LinkedHashMap;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class VolatilityControllerIntegrationNoDataTest {

    @Autowired
    private TestRestTemplate restTemplate;

    /*@Test
    void getDataDefault() {
        assertThat(((LinkedHashMap) this.restTemplate.getForObject("/volatilator?endDate=1851-10-03&startDate=1851-09-06&symbol=FB", LinkedHashMap.class).get("body")).get("message")).isEqualTo("No data entries found.");

    }*/

}