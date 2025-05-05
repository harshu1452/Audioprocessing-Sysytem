package turing.example.audioprocessing.service;

import org.springframework.beans.factory.annotation.Autowired;
import turing.example.audioprocessing.model.AudioFile;
import turing.example.audioprocessing.util.AudioEncoder;
import org.springframework.stereotype.Service;

@Service
public class AudioProcessingService {

    private final AudioEncoder audioEncoder;
  @Autowired
    public AudioProcessingService(AudioEncoder audioEncoder) {
        this.audioEncoder = audioEncoder;
    }

    public String normalizeAudio(AudioFile audioFile) {
        return audioEncoder.encode(audioFile);
    }
}
