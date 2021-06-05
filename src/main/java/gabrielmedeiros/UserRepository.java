package gabrielmedeiros;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public List<User> getAll() {

        List<User> userList = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection()) {
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM user");

            ResultSet rs = statement.executeQuery();

            while(rs.next()) {

                User user = new User(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("password"));

                userList.add(user);
            }

        } catch (SQLException e) {
            System.out.println("Error trying to fetch all users from database.");
        }

        System.out.println("Users fetched.");
        return userList;
    }

    public User getById(int id) {

        User user = null;

        try (Connection conn = ConnectionFactory.getConnection()) {
            
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM user WHERE id = ?");

            statement.setInt(1, id);

            ResultSet rs = statement.executeQuery();

            if(rs.next()) {

                user = new User(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("password"));
            }

        } catch (SQLException e) {
            System.out.println("Error trying to fetch user from database.");
        }

        System.out.println("Users fetched.");
        return user;
    }
    
    public void insert(User user) {

        try (Connection conn = ConnectionFactory.getConnection()) {
            
            PreparedStatement statement = conn.prepareStatement("INSERT INTO user VALUES (default, ?, ?, ?)");

            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());

            int rowsAffected = statement.executeUpdate();

            System.out.println("Successfully inserted " + user.getName() + " into the database. " + "Rows affected: " + rowsAffected);

        } catch (SQLException e) {
            System.out.println("Error trying to insert user into database.");
        }
    }

    public void deleteById(int id) {
        
        try (Connection conn = ConnectionFactory.getConnection()) {
            
            PreparedStatement statement = conn.prepareStatement("DELETE FROM user WHERE id = ?");

            statement.setInt(1, id);

            int rowsAffected = statement.executeUpdate();

            System.out.println("Successfully deleted user from the database. " + "Rows affected: " + rowsAffected);

        } catch (SQLException e) {
            System.out.println("Error trying to insert user into database.");
        }
    }

    public void update(User user) {

        try (Connection conn = ConnectionFactory.getConnection()) {
            
            PreparedStatement statement = conn.prepareStatement("UPDATE user SET name=?, email=?, password=? WHERE id = ?");

            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.setInt(4, user.getId());

            int rowsAffected = statement.executeUpdate();

            System.out.println("Successfully updated " + user.getName() + ". " + "Rows affected: " + rowsAffected);

        } catch (SQLException e) {
            System.out.println("Error trying to update user in database.");
        }
    }
}
