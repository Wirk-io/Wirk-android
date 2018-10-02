package io.wirk.api;

import io.wirk.ApiCallback;
import io.wirk.ApiClient;
import io.wirk.ApiException;
import io.wirk.ApiResponse;
import io.wirk.Configuration;
import io.wirk.Pair;
import io.wirk.ProgressRequestBody;
import io.wirk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Response;

import java.io.IOException;

import io.wirk.model.AppReaderServiceModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppApi {
  private ApiClient apiClient;

  public AppApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /* Build call for get */
  private Call getCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException("Missing the required parameter 'id' when calling get(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/App/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if(progressListener != null) {
      apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
      @Override
      public Response intercept(Interceptor.Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());
        return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
        }
      });
    }

    String[] localVarAuthNames = new String[] {  };
    return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * 
   * Get App Id
   * @param id id (required)
   * @return AppReaderServiceModel
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public AppReaderServiceModel get(Integer id) throws ApiException {
    ApiResponse<AppReaderServiceModel> resp = getWithHttpInfo(id);
    return resp.getData();
  }

  /**
   * 
   * Get App Id
   * @param id id (required)
   * @return ApiResponse<AppReaderServiceModel>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<AppReaderServiceModel> getWithHttpInfo(Integer id) throws ApiException {
    Call call = getCall(id, null, null);
    Type localVarReturnType = new TypeToken<AppReaderServiceModel>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   *  (asynchronously)
   * Get App Id
   * @param id id (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getAsync(Integer id, final ApiCallback<AppReaderServiceModel> callback) throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener = new ProgressResponseBody.ProgressListener() {
        @Override
        public void update(long bytesRead, long contentLength, boolean done) {
          callback.onDownloadProgress(bytesRead, contentLength, done);
        }
      };

      progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
        @Override
        public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
          callback.onUploadProgress(bytesWritten, contentLength, done);
        }
      };
    }

    Call call = getCall(id, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<AppReaderServiceModel>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /* Build call for getAll */
  private Call getAllCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/App".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if(progressListener != null) {
      apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
      @Override
      public Response intercept(Interceptor.Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());
        return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
        }
      });
    }

    String[] localVarAuthNames = new String[] {  };
    return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * 
   * Get all apps
   * @return List<AppReaderServiceModel>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public List<AppReaderServiceModel> getAll() throws ApiException {
    ApiResponse<List<AppReaderServiceModel>> resp = getAllWithHttpInfo();
    return resp.getData();
  }

  /**
   * 
   * Get all apps
   * @return ApiResponse<List<AppReaderServiceModel>>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<List<AppReaderServiceModel>> getAllWithHttpInfo() throws ApiException {
    Call call = getAllCall(null, null);
    Type localVarReturnType = new TypeToken<List<AppReaderServiceModel>>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   *  (asynchronously)
   * Get all apps
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getAllAsync(final ApiCallback<List<AppReaderServiceModel>> callback) throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener = new ProgressResponseBody.ProgressListener() {
        @Override
        public void update(long bytesRead, long contentLength, boolean done) {
          callback.onDownloadProgress(bytesRead, contentLength, done);
        }
      };

      progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
        @Override
        public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
          callback.onUploadProgress(bytesWritten, contentLength, done);
        }
      };
    }

    Call call = getAllCall(progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<List<AppReaderServiceModel>>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
