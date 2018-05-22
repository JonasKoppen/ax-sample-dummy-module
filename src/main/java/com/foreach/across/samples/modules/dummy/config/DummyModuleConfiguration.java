package com.foreach.across.samples.modules.dummy.config;

import com.foreach.across.samples.modules.dummy.DummyModule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Steven Gentens
 * @since 0.0.1
 */
@Configuration
@Slf4j
public class DummyModuleConfiguration {

    @Bean
    public Void isBootstrapped() {
        log.info( DummyModule.NAME + " has been added to the application." );
        return null;
    }

}
