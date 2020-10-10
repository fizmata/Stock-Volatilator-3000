package ee.taltech.volatilator.controller;

import ee.taltech.volatilator.responses.Response;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
public class VolatilatorControllerMockMvcCacheTest {

    @Test
    void volatilityController_method_call_calculation() {

        get("/volatilator?symbol=BETA").accept(MediaType.APPLICATION_JSON);
        get("/volatilator?symbol=BETA").accept(MediaType.APPLICATION_JSON);
        get("/volatilator?symbol=BETA").accept(MediaType.APPLICATION_JSON);

    }
}
