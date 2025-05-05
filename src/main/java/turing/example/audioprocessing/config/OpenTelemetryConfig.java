package turing.example.audioprocessing.config;

import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.trace.Tracer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for setting up OpenTelemetry Tracer.
 * This enables tracing for monitoring and observability.
 */
@Configuration
public class OpenTelemetryConfig {

    /**
     * Creates and provides a Tracer bean using OpenTelemetry.
     * The Tracer is used to capture and manage traces across the application.
     *
     * @return A Tracer instance with a custom name for the application.
     */
    @Bean
    public Tracer tracer() {
        return GlobalOpenTelemetry.getTracer("audio-processing-app");
    }
}
