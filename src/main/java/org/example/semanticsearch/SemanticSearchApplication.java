package org.example.semanticsearch;

import org.json.JSONObject;
import org.json.JSONPointer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.core.SdkBytes;
import software.amazon.awssdk.core.exception.SdkClientException;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.bedrockruntime.BedrockRuntimeClient;

@SpringBootApplication
public class SemanticSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SemanticSearchApplication.class, args);
    }

}
