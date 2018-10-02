package io.wirk.api;

import io.wirk.ApiException;
import io.wirk.model.AppProjectReaderServiceModel;
import io.wirk.model.AppProjectWriterServiceModel;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppProjectApi
 */
public class AppProjectApiTest {

    private final AppProjectApi api = new AppProjectApi();

    
    /**
     * 
     *
     * Get
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        Integer id = null;
        // AppProjectReaderServiceModel response = api.get(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Post app project
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postTest() throws ApiException {
        AppProjectWriterServiceModel appProjectWriterServiceModel = null;
        // AppProjectReaderServiceModel response = api.post(appProjectWriterServiceModel);

        // TODO: test validations
    }
    
}
