# graphql-curious-dolphin

The purpose of this project is to aid people that want to reproduce an [issue](https://github.com/graphql-java-kickstart/graphql-spring-boot/issues/641) with the detection of custom exception handlers in [graphql-spring-boot](https://github.com/graphql-java-kickstart/graphql-spring-boot).

## Prerequisites
* Docker
* Docker Compose

## Steps

1. Run the `start-solace.sh` script, which can be found in the `scripts` directory. This will start a local Solace PubSub+ instance. You'll need a Bash emulator if you're on Windows - something like Git Bash.
2. Import the project in your IDE and start it. It will run on http://localhost:8787/graphiql.
3. Run the following GraphQL queries:
   ```
   query humans {
     getAllHumans {
       name
     }
   }

   query droids {
     getAllDroids {
       name
     }
   }
   ```
   The first query will show its exception message directly as expected. The second query's exception should get masked with `Internal Server Error(s) while executing query`, but it doesn't.
4. Open the project's `pom.xml` file and remove the following dependencies:
   ```
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-stream</artifactId>
        </dependency>
        <dependency>
            <groupId>com.solace.spring.cloud</groupId>
            <artifactId>spring-cloud-starter-stream-solace</artifactId>
        </dependency>
   ```
   After this step the custom exception handler will start working, thus proving that the issue comes whenever Spring Cloud Stream and its Solace PubSub+ binder are on the classpath.
