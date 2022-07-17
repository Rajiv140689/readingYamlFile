package com.example.readingyamlfile.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttributeStore {

    @Value("${name}")
    private String name;

    @Value("${island}")
    private String island;

    @Value("${base-url}")
    private String baseUrl;

    private String localEndpointBaseUrl;
}
