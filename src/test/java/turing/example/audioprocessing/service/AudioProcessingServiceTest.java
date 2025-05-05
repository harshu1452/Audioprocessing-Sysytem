package turing.example.audioprocessing.service;

import turing.example.audioprocessing.model.AudioFile;
import turing.example.audioprocessing.util.AudioEncoder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

/**
 * Unit test for AudioProcessingService.
 * Verifies audio normalization using AudioEncoder.
 */
@ExtendWith(MockitoExtension.class)
class AudioProcessingServiceTest {

    // Mock AudioEncoder to simulate encoding behavior
    @Mock
    private AudioEncoder audioEncoder;

    // Inject AudioProcessingService with the mock AudioEncoder
    @InjectMocks
    private AudioProcessingService audioProcessingService;

    /**
     * Test to validate the normalizeAudio method.
     * Ensures the encoding result matches expectations and the encoder is called once.
     */
    @Test
    void testNormalizeAudio() {
        // Create a sample AudioFile
        AudioFile audioFile = new AudioFile("test.mp3", "uploads/test.mp3");

        // Mock the encoder behavior to return an encoded path
        when(audioEncoder.encode(audioFile)).thenReturn("encoded/test.mp3");

        // Call the method under test
        String result = audioProcessingService.normalizeAudio(audioFile);

        // Assert the result is as expected
        assertThat(result).isEqualTo("encoded/test.mp3");

        // Verify that encode method was called exactly once
        verify(audioEncoder, times(1)).encode(audioFile);
    }
}
