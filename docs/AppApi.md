# AppApi

All URIs are relative to *https://api.wirk.io/v1_0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](AppApi.md#get) | **GET** /App/{id} | 
[**getAll**](AppApi.md#getAll) | **GET** /App | 


<a name="get"></a>
# **get**
> AppReaderServiceModel get(id)



Get App Id

### Example
```java
// Import classes:
//import io.wirk.ApiException;
//import io.wirk.api.AppApi;


AppApi apiInstance = new AppApi();
Integer id = 1; // Integer | id
try {
    AppReaderServiceModel result = apiInstance.get(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

[**AppReaderServiceModel**](AppReaderServiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAll"></a>
# **getAll**
> List&lt;AppReaderServiceModel&gt; getAll()



Get all apps

### Example
```java
// Import classes:
//import io.wirk.ApiException;
//import io.wirk.api.AppApi;


AppApi apiInstance = new AppApi();
try {
    List<AppReaderServiceModel> result = apiInstance.getAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppApi#getAll");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AppReaderServiceModel&gt;**](AppReaderServiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

