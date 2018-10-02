# AppProjectApi

All URIs are relative to *https://api.wirk.io/v1_0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](AppProjectApi.md#get) | **GET** /AppProject/{id} | 
[**post**](AppProjectApi.md#post) | **POST** /AppProject | 


<a name="get"></a>
# **get**
> AppProjectReaderServiceModel get(id)



Get

### Example
```java
// Import classes:
//import io.wirk.ApiClient;
//import io.wirk.ApiException;
//import io.wirk.Configuration;
//import io.wirk.auth.*;
//import io.wirk.api.AppProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: Authorization
HttpBasicAuth Authorization = (HttpBasicAuth) defaultClient.getAuthentication("Authorization");
Authorization.setUsername("YOUR USERNAME");
Authorization.setPassword("YOUR PASSWORD");

AppProjectApi apiInstance = new AppProjectApi();
Integer id = 1; // Integer | ID
try {
    AppProjectReaderServiceModel result = apiInstance.get(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppProjectApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| ID |

### Return type

[**AppProjectReaderServiceModel**](AppProjectReaderServiceModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="post"></a>
# **post**
> AppProjectReaderServiceModel post(appProjectWriterServiceModel)



Post app project

### Example
```java
// Import classes:
//import io.wirk.ApiClient;
//import io.wirk.ApiException;
//import io.wirk.Configuration;
//import io.wirk.auth.*;
//import io.wirk.api.AppProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: Authorization
HttpBasicAuth Authorization = (HttpBasicAuth) defaultClient.getAuthentication("Authorization");
Authorization.setUsername("YOUR USERNAME");
Authorization.setPassword("YOUR PASSWORD");

AppProjectApi apiInstance = new AppProjectApi();
AppProjectWriterServiceModel appProjectWriterServiceModel = new AppProjectWriterServiceModel(); // AppProjectWriterServiceModel | Definition of the appProject
try {
    AppProjectReaderServiceModel result = apiInstance.post(appProjectWriterServiceModel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppProjectApi#post");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appProjectWriterServiceModel** | [**AppProjectWriterServiceModel**](AppProjectWriterServiceModel.md)| Definition of the appProject |

### Return type

[**AppProjectReaderServiceModel**](AppProjectReaderServiceModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

