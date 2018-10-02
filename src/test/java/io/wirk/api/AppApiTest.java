package io.wirk.api;

import io.wirk.ApiException;
import io.wirk.model.AppReaderServiceModel;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppApi
 */
public class AppApiTest {

    private final AppApi api = new AppApi();

    
    /**
     * 
     *
     * Get App Id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        Integer id = null;
        // AppReaderServiceModel response = api.get(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get all apps
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        // List<AppReaderServiceModel> response = api.getAll();

        // TODO: test validations
    }
    
}
