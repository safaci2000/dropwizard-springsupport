package com.esamir.dropwizard.support.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("testApplicationContext.xml")
public class XmlImportingTestConfiguration {
}
