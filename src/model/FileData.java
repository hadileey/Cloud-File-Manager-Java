package model;

public class FileData {
    private int id;
    private int userId;
    private String fileName;
    private String filePath;

    public FileData() {}

    public FileData(int userId, String fileName, String filePath) {
        this.userId = userId;
        this.fileName = fileName;
        this.filePath = filePath;
    }

    public int getUserId() { return userId; }
    public String getFileName() { return fileName; }
    public String getFilePath() { return filePath; }
}