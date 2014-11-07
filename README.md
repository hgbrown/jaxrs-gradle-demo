# Simple JAX-RS Demo

To load jax-rs resource use url: <http://localhost:8080/jaxrs-gradle-demo-1.0/resources/party/>

where:

* `localhost` is the host for the server
* `8080` is the port on which http is listening on the server
* `jaxrs-gradle-demo-1.0` is the context path to which the app is deployed.

## Building the app

The application is build using Gradle. To build the war simply run: `gradle war`

If gradle is not installed on your system, you can set up Gradle using the wrapper script included (`gradlew`).

----

For more information, contact <henry.g.brown@gmail.com>