package dao;

import config.DBConnection;
import model.FileData;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class FileDAO {

    public boolean uploadFile(FileData file) {
        try {
            Connection conn = DBConnection.getConnection();

            String query = "INSERT INTO files(user_id, file_name, file_path) VALUES (?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, file.getUserId());
            ps.setString(2, file.getFileName());
            ps.setString(3, file.getFilePath());

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}