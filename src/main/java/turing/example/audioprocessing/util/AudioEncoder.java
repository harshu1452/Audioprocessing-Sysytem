package turing.example.audioprocessing.util;

import org.springframework.stereotype.Component;
import turing.example.audioprocessing.model.AudioFile;

/**
 * AudioEncoder is a utility class responsible for encoding audio files.
 * It is marked as a Spring-managed component using the @Component annotation,
 * which makes it available for dependency injection throughout the application.
 */
@Component
public class AudioEncoder {

    /**
     * Encodes the given AudioFile object.
     * This is a placeholder method that simulates encoding by returning a simple string.
     *
     * @param audioFile The audio file to be encoded, represented by the AudioFile model.
     * @return A simulated encoded file path with a prefix "encoded/".
     */
    public String encode(AudioFile audioFile) {
        return "encoded/" + audioFile.getFileName();
    }
}

