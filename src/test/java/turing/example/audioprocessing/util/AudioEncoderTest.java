package turing.example.audioprocessing.util;

import org.junit.jupiter.api.Test;
import turing.example.audioprocessing.model.AudioFile;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for AudioEncoder.
 * Ensures proper encoding of audio file names.
 */
class AudioEncoderTest {

    /**
     * Test to verify the encode method correctly generates the encoded file path.
     */
    @Test
    void testEncode() {
        // Arrange - Create an AudioEncoder instance and a sample AudioFile
        AudioEncoder audioEncoder = new AudioEncoder();
        AudioFile audioFile = new AudioFile("sample.mp3");

        // Act - Perform encoding using the encode method
        String encodedFileName = audioEncoder.encode(audioFile);

        // Assert - Validate that the encoded file path is as expected
        assertEquals("encoded/sample.mp3", encodedFileName);
    }
}
