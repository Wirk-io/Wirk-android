# TaskLineApi

All URIs are relative to *https://api.wirk.io/v1_0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](TaskLineApi.md#get) | **GET** /TaskLine/{id} | 
[**post**](TaskLineApi.md#post) | **POST** /TaskLine | 


<a name="get"></a>
# **get**
> TaskLineReaderServiceModel get(id)



ID

### Example
```java
// Import classes:
//import io.wirk.ApiClient;
//import io.wirk.ApiException;
//import io.wirk.Configuration;
//import io.wirk.auth.*;
//import io.wirk.api.TaskLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: Authorization
HttpBasicAuth Authorization = (HttpBasicAuth) defaultClient.getAuthentication("Authorization");
Authorization.setUsername("YOUR USERNAME");
Authorization.setPassword("YOUR PASSWORD");

TaskLineApi apiInstance = new TaskLineApi();
Integer id = 1; // Integer | ID
try {
    TaskLineReaderServiceModel result = apiInstance.get(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskLineApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| ID |

### Return type

[**TaskLineReaderServiceModel**](TaskLineReaderServiceModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="post"></a>
# **post**
> TaskLineReaderServiceModel post(taskLineWriterServiceModel)



Post taskline

### Example
```java
// Import classes:
//import io.wirk.ApiClient;
//import io.wirk.ApiException;
//import io.wirk.Configuration;
//import io.wirk.auth.*;
//import io.wirk.api.TaskLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: Authorization
HttpBasicAuth Authorization = (HttpBasicAuth) defaultClient.getAuthentication("Authorization");
Authorization.setUsername("YOUR USERNAME");
Authorization.setPassword("YOUR PASSWORD");

TaskLineApi apiInstance = new TaskLineApi();
TaskLineWriterServiceModel taskLineWriterServiceModel = new TaskLineWriterServiceModel(); // TaskLineWriterServiceModel | Taskline description
try {
    TaskLineReaderServiceModel result = apiInstance.post(taskLineWriterServiceModel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskLineApi#post");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskLineWriterServiceModel** | [**TaskLineWriterServiceModel**](TaskLineWriterServiceModel.md)| Taskline description |

### Return type

[**TaskLineReaderServiceModel**](TaskLineReaderServiceModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

