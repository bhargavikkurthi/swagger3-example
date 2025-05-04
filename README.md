## Swagger 3 and Spring Boot example (with OpenAPI 3)

This project demonstrates how to **document a REST API with Swagger 3** in a **Spring Boot** application, following the **OpenAPI 3 specification**.  
You will also learn how to configure Swagger API description and response behavior.

---

### 🚀 Running the Project

1. Start the Spring Boot application.
2. Open your browser and navigate to:

```
http://localhost:8080/swagger-ui/index.html
```

By default, Swagger UI is available at /swagger-ui/index.html.  
However, in this project, we changed the Swagger UI path in application.properties to
```
http://localhost:8080/bhargav-documentation
```

 If you want to revert it back to /swagger-ui/index.html, simply remove or comment out this configuration:
 ```
springdoc.swagger-ui.path=/bhargav-documentation
```


### Important Note
SpringDoc does not disable ** /swagger-ui/index.html ** when setting springdoc.swagger-ui.path.
Instead, it adds an additional path rather than replacing the default one

In other words:
```
springdoc.swagger-ui.path=/bhargav-documentation
```
* Adds a new endpoint at /bhargav-documentation
* Keeps /swagger-ui/index.html accessible for backward compatibility

Both URLs will work unless you explicitly block /swagger-ui/index.html via security config.



### OpenAPI JSON Docs

If you open:
```
http://localhost:8080/v3/api-docs
```

You will see the API documentation in JSON format.

We customized the OpenAPI docs path in application.properties:
```
springdoc.api-docs.path=/bhargav-api-docs
```

This tells SpringDoc OpenAPI to serve the docs at ** /bhargav-api-docs ** instead of the default ** /v3/api-docs **

Therefore, your API docs are now accessible at:
```
http://localhost:8080/bhargav-api-docs
```

** Summary of Custom Paths

| Path                     | Description                                                   |
| ------------------------ | ------------------------------------------------------------- |
| `/bhargav-documentation` | Custom Swagger UI URL                                         |
| `/swagger-ui/index.html` | Default Swagger UI URL (still accessible)                     |
| `/bhargav-api-docs`      | Custom OpenAPI JSON docs                                      |
| `/v3/api-docs`           | Default OpenAPI JSON docs (redirected/disabled if configured) |


