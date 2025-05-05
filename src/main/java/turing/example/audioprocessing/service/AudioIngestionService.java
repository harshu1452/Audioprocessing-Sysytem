package turing.example.audioprocessing.service;

import turing.example.audioprocessing.model.AudioFile;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * AudioIngestionService handles the ingestion of audio files into the system.
 * It processes uploaded files and generates an AudioFile object with the necessary details.
 */
@Service
public class AudioIngestionService {

    /**
     * Processes the uploaded audio file by storing its details.
     * This method simulates the file ingestion by generating a file path.
     *
     * @param file The uploaded audio file represented as a MultipartFile.
     * @return An AudioFile object containing the file name and its storage path.
     */
    public AudioFile processAudio(MultipartFile file) {
        // Generate a file path for the uploaded audio file
        String filePath = "uploads/" + file.getOriginalFilename();
        return new AudioFile(file.getOriginalFilename(), filePath);
    }
}
