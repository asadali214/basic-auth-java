
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `port` | `String` | *Default*: `"80"` |
| `suites` | `SuiteCodeEnum` | *Default*: `SuiteCodeEnum.HEARTS` |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.TESTING`** |
| `httpClientConfig` | [`Consumer<HttpClientConfiguration.Builder>`](http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| `basicAuthCredentials` | [`BasicAuthCredentials`](auth/basic-authentication.md) | The Credentials Setter for Basic Authentication |

The API client can be initialized as follows:

```java
BATesterClient client = new BATesterClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .basicAuthCredentials(new BasicAuthModel.Builder(
            "BasicAuthUserName",
            "BasicAuthPassword"
        )
        .build())
    .environment(Environment.TESTING)
    .port("80")
    .suites(SuiteCodeEnum.HEARTS)
    .build();
```

## BATesterClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getAPIController()` | Provides access to Client controller. | `APIController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getPort()` | port value. | `String` |
| `getSuites()` | suites value. | `SuiteCodeEnum` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getBasicAuthCredentials()` | The credentials to use with BasicAuth. | [`BasicAuthCredentials`](auth/basic-authentication.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

