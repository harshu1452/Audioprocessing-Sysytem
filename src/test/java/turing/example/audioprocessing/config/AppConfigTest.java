package turing.example.audioprocessing.config;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import turing.example.audioprocessing.util.AudioEncoder;

import static org.junit.jupiter.api.Assertions.*;

class AppConfigTest {

    @Test
    void testAudioEncoderBeanCreation() {
        // Create an application context using AppConfig
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Fetch the AudioEncoder bean from the context
        AudioEncoder audioEncoder = context.getBean(AudioEncoder.class);

        // Assert that the bean is not null (i.e., it was registered successfully)
        assertNotNull(audioEncoder, "AudioEncoder bean should be created and not null");
    }
}
