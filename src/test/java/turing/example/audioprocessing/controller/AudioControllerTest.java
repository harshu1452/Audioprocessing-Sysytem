package turing.example.audioprocessing.controller;

import turing.example.audioprocessing.model.AudioFile;
import turing.example.audioprocessing.service.AudioIngestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockMultipartFile;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

/**
 * Unit test for AudioController.
 * Validates the behavior of the audio upload API using mocked dependencies.
 */
@ExtendWith(MockitoExtension.class)
class AudioControllerTest {

    // Mock the AudioIngestionService to simulate its behavior without executing actual logic
    @Mock
    private AudioIngestionService audioIngestionService;

    // Inject the mocks into the AudioController for testing
    @InjectMocks
    private AudioController audioController;

    /**
     * Test to verify successful audio upload handling.
     * Ensures the response contains the correct status and data.
     */
    @Test
    void testUploadAudio_Success() {
        // Create a mock multipart file representing an audio file
        MockMultipartFile file = new MockMultipartFile("file", "test.mp3", "audio/mpeg", "data".getBytes());

        // Simulate the behavior of the service using Mockito
        when(audioIngestionService.processAudio(file)).thenReturn(new AudioFile("test.mp3", "uploads/test.mp3"));

        // Call the uploadAudio method of the controller
        ResponseEntity<AudioFile> response = audioController.uploadAudio(file);

        // Assert that the response status code is 200 (OK)
        assertThat(response.getStatusCodeValue()).isEqualTo(200);

        // Assert that the response body is not null and contains the expected data
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().getFileName()).isEqualTo("test.mp3");
    }
}
