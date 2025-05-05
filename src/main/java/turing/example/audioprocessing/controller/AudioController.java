package turing.example.audioprocessing.controller;

import turing.example.audioprocessing.model.AudioFile;
import turing.example.audioprocessing.service.AudioIngestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * AudioController handles HTTP requests related to audio file operations.
 * It provides endpoints for uploading audio files and returns relevant responses.
 */
@RestController
@RequestMapping("/audio")
public class AudioController {

    // Service responsible for processing audio file uploads
    private final AudioIngestionService audioIngestionService;

    /**
     * Constructor for injecting the AudioIngestionService using dependency injection.
     *
     * @param audioIngestionService The service used for processing uploaded audio files.
     */
    public AudioController(AudioIngestionService audioIngestionService) {
        this.audioIngestionService = audioIngestionService;
    }

    /**
     * Endpoint for uploading audio files.
     * Accepts multipart file uploads using @RequestParam.
     *
     * @param file The audio file uploaded by the user.
     * @return ResponseEntity containing the AudioFile object with its name and path.
     */
    @PostMapping("/upload")
    public ResponseEntity<AudioFile> uploadAudio(@RequestParam("file") MultipartFile file) {
        // Process the uploaded audio file using the service
        AudioFile audioFile = audioIngestionService.processAudio(file);
        return ResponseEntity.ok(audioFile);
    }
}
