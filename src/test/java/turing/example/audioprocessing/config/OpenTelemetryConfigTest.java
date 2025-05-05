package turing.example.audioprocessing.config;

import io.opentelemetry.api.trace.Tracer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OpenTelemetryConfigTest {

    @Test
    void testTracerBean() {
        OpenTelemetryConfig config = new OpenTelemetryConfig();
        Tracer tracer = config.tracer();

        assertNotNull(tracer, "Tracer bean should not be null");
    }
}
