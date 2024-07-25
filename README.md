
# Getting Started with BATester

## Building

Supported Java version is **8+**.

The generated code uses a few Maven dependencies e.g., Jackson, OkHttp,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on `File -> Import`.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?workspaceFolder=BATester-Java&workspaceName=BATester&projectName=BATesterLib&rootNamespace=localhost3000&groupId=BATesterLib&artifactId=batester-lib&version=1.0.0&step=import0)

* In the import dialog, select `Existing Java Project` and click `Next`.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?workspaceFolder=BATester-Java&workspaceName=BATester&projectName=BATesterLib&rootNamespace=localhost3000&groupId=BATesterLib&artifactId=batester-lib&version=1.0.0&step=import1)

* Browse to locate the folder containing the source code. Select the detected location of the project and click `Finish`.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?workspaceFolder=BATester-Java&workspaceName=BATester&projectName=BATesterLib&rootNamespace=localhost3000&groupId=BATesterLib&artifactId=batester-lib&version=1.0.0&step=import2)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?workspaceFolder=BATester-Java&workspaceName=BATester&projectName=BATesterLib&rootNamespace=localhost3000&groupId=BATesterLib&artifactId=batester-lib&version=1.0.0&step=import3)

* After successfully building the project, the client library needs to be installed as a Maven package in your local cache. Right-click on the project, select `Show in Local Terminal -> Terminal` or use `Ctrl + Alt + T` to open Terminal.

![Importing SDK into Eclipse - Step 5](https://apidocs.io/illustration/java?workspaceFolder=BATester-Java&workspaceName=BATester&projectName=BATesterLib&rootNamespace=localhost3000&groupId=BATesterLib&artifactId=batester-lib&version=1.0.0&step=openTerminal)

* In the terminal dialog, run the following command to install client library.

```
mvn install -Dmaven.test.skip=true -Dmaven.javadoc.skip=true
```

![Importing SDK into Eclipse - Step 6](https://apidocs.io/illustration/java?workspaceFolder=BATester-Java&workspaceName=BATester&projectName=BATesterLib&rootNamespace=localhost3000&groupId=BATesterLib&artifactId=batester-lib&version=1.0.0&step=installCommand)

## Installation

The following section explains how to use the BATesterLib library in a new project.

### 1. Starting a new project

For starting a new project, click the menu command `File > New > Project`.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?workspaceFolder=BATester-Java&workspaceName=BATester&projectName=BATesterLib&rootNamespace=localhost3000&groupId=BATesterLib&artifactId=batester-lib&version=1.0.0&step=createNewProject0)

Next, choose `Maven > Maven Project` and click `Next`.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?workspaceFolder=BATester-Java&workspaceName=BATester&projectName=BATesterLib&rootNamespace=localhost3000&groupId=BATesterLib&artifactId=batester-lib&version=1.0.0&step=createNewProject1)

Here, make sure to use the current workspace by choosing `Use default Workspace location`, as shown in the picture below and click `Next`.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?workspaceFolder=BATester-Java&workspaceName=BATester&projectName=BATesterLib&rootNamespace=localhost3000&groupId=BATesterLib&artifactId=batester-lib&version=1.0.0&step=createNewProject2)

Following this, select the *quick start* project type to create a simple project with an existing class and a `main` method. To do this, choose `maven-archetype-quickstart` item from the list and click `Next`.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?workspaceFolder=BATester-Java&workspaceName=BATester&projectName=BATesterLib&rootNamespace=localhost3000&groupId=BATesterLib&artifactId=batester-lib&version=1.0.0&step=createNewProject3)

In the last step, provide a `Group Id` and `Artifact Id` as shown in the picture below and click `Finish`.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?workspaceFolder=BATester-Java&workspaceName=BATester&projectName=BATesterLib&rootNamespace=localhost3000&groupId=BATesterLib&artifactId=batester-lib&version=1.0.0&step=createNewProject4)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its `pom.xml` file. In order to add a dependency on the *BATesterLib* client library, double click on the `pom.xml` file in the `Package Explorer`. Opening the `pom.xml` file will render a graphical view on the canvas. Here, switch to the `Dependencies` tab and click the `Add` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?workspaceFolder=BATester-Java&workspaceName=BATester&projectName=BATesterLib&rootNamespace=localhost3000&groupId=BATesterLib&artifactId=batester-lib&version=1.0.0&step=testProject0)

Clicking the `Add` button will open a dialog where you need to specify BATesterLib in `Group Id`, batester-lib in `Artifact Id` and 1.0.0 in the `Version` fields. Once added click `OK`. Save the `pom.xml` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?workspaceFolder=BATester-Java&workspaceName=BATester&projectName=BATesterLib&rootNamespace=localhost3000&groupId=BATesterLib&artifactId=batester-lib&version=1.0.0&step=testProject1)

![Adding sample code](https://apidocs.io/illustration/java?workspaceFolder=BATester-Java&workspaceName=BATester&projectName=BATesterLib&rootNamespace=localhost3000&groupId=BATesterLib&artifactId=batester-lib&version=1.0.0&step=testProject2)

### 3. Write sample code

Once the `SimpleConsoleApp` is created, a file named `App.java` will be visible in the *Package Explorer* with a `main` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project BATesterLib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `port` | `String` | *Default*: `"80"` |
| `suites` | `SuiteCodeEnum` | *Default*: `SuiteCodeEnum.HEARTS` |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.TESTING`** |
| `httpClientConfig` | [`Consumer<HttpClientConfiguration.Builder>`](doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| `basicAuthCredentials` | [`BasicAuthCredentials`](doc/auth/basic-authentication.md) | The Credentials Setter for Basic Authentication |

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

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| production | - |
| testing | **Default** |

## Authorization

This API uses the following authentication schemes.

* [`httpBasic (Basic Authentication)`](doc/auth/basic-authentication.md)

## List of APIs

* [API](doc/controllers/api.md)

## Classes Documentation

* [Utility Classes](doc/utility-classes.md)
* [HttpRequest](doc/http-request.md)
* [HttpResponse](doc/http-response.md)
* [HttpStringResponse](doc/http-string-response.md)
* [HttpContext](doc/http-context.md)
* [HttpBodyRequest](doc/http-body-request.md)
* [HttpCallback Interface](doc/http-callback-interface.md)
* [Headers](doc/headers.md)
* [ApiException](doc/api-exception.md)
* [Configuration Interface](doc/configuration-interface.md)
* [HttpClientConfiguration](doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](doc/http-client-configuration-builder.md)

