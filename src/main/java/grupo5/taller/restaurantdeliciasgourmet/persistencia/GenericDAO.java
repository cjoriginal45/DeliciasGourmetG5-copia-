package grupo5.taller.restaurantdeliciasgourmet.persistencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GenericDAO<T> {
    private String jdbcUrl;

    public GenericDAO() {
        jdbcUrl = "jdbc:sqlite:src/main/java/grupo5/taller/restaurantdeliciasgourmet/persistencia/db/usersdb.db";
    }

    public String insert(String sql, Object... params) {
        try (Connection conn = DriverManager.getConnection(jdbcUrl);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }

            pstmt.executeUpdate();
            return "Insert successful.";
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public List<T> retrieveAll(String sql, RowMapper<T> rowMapper) {
        List<T> resultList = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(jdbcUrl);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                T obj = rowMapper.mapRow(rs);
                resultList.add(obj);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultList;
    }

    public String delete(String sql, int id) {
        try (Connection conn = DriverManager.getConnection(jdbcUrl);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            return "Delete successful.";
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public interface RowMapper<T> {
        T mapRow(ResultSet rs) throws SQLException;
    }
}
