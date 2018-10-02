package io.wirk.api;

import io.wirk.ApiException;
import io.wirk.model.TaskLineReaderServiceModel;
import io.wirk.model.TaskLineWriterServiceModel;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaskLineApi
 */
public class TaskLineApiTest {

    private final TaskLineApi api = new TaskLineApi();

    
    /**
     * 
     *
     * ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        Integer id = null;
        // TaskLineReaderServiceModel response = api.get(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Post taskline
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postTest() throws ApiException {
        TaskLineWriterServiceModel taskLineWriterServiceModel = null;
        // TaskLineReaderServiceModel response = api.post(taskLineWriterServiceModel);

        // TODO: test validations
    }
    
}
