package turing.example.audioprocessing.service;

import turing.example.audioprocessing.model.AudioFile;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockMultipartFile;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class AudioIngestionServiceTest {

    @InjectMocks
    private AudioIngestionService audioIngestionService;

    @Test
    void testProcessAudio() {
        MockMultipartFile file = new MockMultipartFile("file", "test.mp3", "audio/mpeg", "audio-data".getBytes());

        AudioFile audioFile = audioIngestionService.processAudio(file);

        assertThat(audioFile).isNotNull();
        assertThat(audioFile.getFileName()).isEqualTo("test.mp3");
        assertThat(audioFile.getFilePath()).isEqualTo("uploads/test.mp3");
    }
}
