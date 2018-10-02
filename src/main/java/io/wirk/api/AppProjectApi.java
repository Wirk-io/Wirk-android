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

import io.wirk.model.AppProjectReaderServiceModel;
import io.wirk.model.AppProjectWriterServiceModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppProjectApi {
  private ApiClient apiClient;

  public AppProjectApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppProjectApi(ApiClient apiClient) {
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
    String localVarPath = "/AppProject/{id}".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] { "Authorization" };
    return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * 
   * Get
   * @param id ID (required)
   * @return AppProjectReaderServiceModel
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public AppProjectReaderServiceModel get(Integer id) throws ApiException {
    ApiResponse<AppProjectReaderServiceModel> resp = getWithHttpInfo(id);
    return resp.getData();
  }

  /**
   * 
   * Get
   * @param id ID (required)
   * @return ApiResponse<AppProjectReaderServiceModel>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<AppProjectReaderServiceModel> getWithHttpInfo(Integer id) throws ApiException {
    Call call = getCall(id, null, null);
    Type localVarReturnType = new TypeToken<AppProjectReaderServiceModel>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   *  (asynchronously)
   * Get
   * @param id ID (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getAsync(Integer id, final ApiCallback<AppProjectReaderServiceModel> callback) throws ApiException {

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
    Type localVarReturnType = new TypeToken<AppProjectReaderServiceModel>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /* Build call for post */
  private Call postCall(AppProjectWriterServiceModel appProjectWriterServiceModel, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = appProjectWriterServiceModel;
    
    // verify the required parameter 'appProjectWriterServiceModel' is set
    if (appProjectWriterServiceModel == null) {
       throw new ApiException("Missing the required parameter 'appProjectWriterServiceModel' when calling post(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/AppProject".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {
      "application/json"
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

    String[] localVarAuthNames = new String[] { "Authorization" };
    return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * 
   * Post app project
   * @param appProjectWriterServiceModel Definition of the appProject (required)
   * @return AppProjectReaderServiceModel
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public AppProjectReaderServiceModel post(AppProjectWriterServiceModel appProjectWriterServiceModel) throws ApiException {
    ApiResponse<AppProjectReaderServiceModel> resp = postWithHttpInfo(appProjectWriterServiceModel);
    return resp.getData();
  }

  /**
   * 
   * Post app project
   * @param appProjectWriterServiceModel Definition of the appProject (required)
   * @return ApiResponse<AppProjectReaderServiceModel>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<AppProjectReaderServiceModel> postWithHttpInfo(AppProjectWriterServiceModel appProjectWriterServiceModel) throws ApiException {
    Call call = postCall(appProjectWriterServiceModel, null, null);
    Type localVarReturnType = new TypeToken<AppProjectReaderServiceModel>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   *  (asynchronously)
   * Post app project
   * @param appProjectWriterServiceModel Definition of the appProject (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call postAsync(AppProjectWriterServiceModel appProjectWriterServiceModel, final ApiCallback<AppProjectReaderServiceModel> callback) throws ApiException {

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

    Call call = postCall(appProjectWriterServiceModel, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<AppProjectReaderServiceModel>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
