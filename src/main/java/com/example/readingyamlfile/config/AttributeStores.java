package com.example.readingyamlfile.config;

import com.example.readingyamlfile.dto.AttributeStore;
import com.example.readingyamlfile.config.YamlPropertySourceFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Data
@Configuration
@ConfigurationProperties("store")
@EnableConfigurationProperties
@PropertySource(value = {
        "classpath:stores/attribute-stores.yml",
        "classpath:stores/attribute-stores-${spring.profiles.active}.yml" },
        factory = YamlPropertySourceFactory.class)
public class AttributeStores {
    public String localBaseUrl;
    public AttributeStore userAttributeStore;
    public AttributeStore controlPlaneAttributeStore;
    public AttributeStore supplyPartnerAttributeStore;

}
