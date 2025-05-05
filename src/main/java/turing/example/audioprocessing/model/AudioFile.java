package turing.example.audioprocessing.model;

/**
 * AudioFile is a model class representing an audio file in the system.
 * It contains basic metadata such as the file name and file path.
 */
public class AudioFile {

    // Name of the audio file
    private String fileName;

    // Path where the audio file is stored
    private String filePath;

    /**
     * Constructor to initialize an AudioFile with both file name and file path.
     *
     * @param fileName Name of the audio file.
     * @param filePath Path where the audio file is stored.
     */
    public AudioFile(String fileName, String filePath) {
        this.fileName = fileName;
        this.filePath = filePath;
    }

    /**
     * Constructor to initialize an AudioFile with only the file name.
     *
     * @param fileName Name of the audio file.
     */
    public AudioFile(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Gets the name of the audio file.
     *
     * @return The file name.
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Gets the file path of the audio file.
     *
     * @return The file path, or null if not set.
     */
    public String getFilePath() {
        return filePath;
    }
}
