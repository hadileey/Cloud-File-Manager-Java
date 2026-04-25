package service;

import dao.FileDAO;
import model.FileData;

public class FileService {

    FileDAO fileDAO = new FileDAO();

    public void upload(int userId, String name, String path) {
        FileData file = new FileData(userId, name, path);
        fileDAO.uploadFile(file);
    }
}