package database;
import java.sql.*;

import static java.lang.System.*;
public class ProductDAO {

    public void create(String n,double p,int q,String c){
        String sql = "INSERT INTO products(String n,double p,int q,String c)";
        try(Connection conn = DatabaseConnection.getConnection();
          PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1,n);
            ps.setDouble(2,p);
            ps.setInt(3,q);
            ps.setString(4,c);
            ps.executeUpdate();
            out.println("saved");
        }catch(SQLException e) {e.printStackTrace();}
    }

    public void readAll() {
        String sql = "SELECT * FROM products";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement ps = conn.createStatement();
             ResultSet rs = ps.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("product_id") + rs.getString("name") + rs.getDouble("price"));
            }
        } catch (SQLException e) {e.printStackTrace();
        }
    }


    public void searchByPriceRange(double min,double max){
        String sql = "SELECT * FROM products WHERE price BETWEEN ? AND ?";
        try(Connection conn = DatabaseConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setDouble(1,min);
            ps.setDouble(2,max);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                out.println(rs.getString("name") + rs.getDouble("price"));
            }
        }catch (SQLException e) {e.printStackTrace();}
    }

    public void getStaffById(int id){
        String sql = "SELECT * FROM products WHERE product_id=?";
        try(Connection conn = DatabaseConnection.getConnection();
          PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                out.println("found: " + rs.getString("name"));
            }else{
                out.println("not found");
            }
        }catch(SQLException e) {e.printStackTrace();}
    }

    public void update(int id,double p,int q){
        String sql = "UPDATE products SET price=?,quantity=? WHERE product_id=?";
        try(Connection conn = DatabaseConnection.getConnection();
           PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setDouble(1,p);
            ps.setInt(2,q);
            ps.setInt(3,id);
            if(ps.executeUpdate()>0){
                out.println("updated");
            }else{
                out.println("eror");
            }
        }catch(SQLException e) {e.printStackTrace();}
    }

    public void delete(int id){
        String sql = "DELETE FROM products WHERE product_id=?";
        try(Connection conn = DatabaseConnection.getConnection();
          PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,id);
            if(ps.executeUpdate()>0){
                out.println("deleted");
            }else{
                out.println("eror");
            }
        }catch(SQLException e) {e.printStackTrace();}
    }

    public void searchByName(String name){
        String sql = "SELECT * FROM products WHERE name ILIKE?";
        try(Connection conn = DatabaseConnection.getConnection();
           PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1,"%" + name + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                out.println("found: " + rs.getString("name"));
            }
        }catch(SQLException e) {e.printStackTrace();}
    }

    public void searchByMinPrice(double min) {
        String sql = "SELECT * FROM products WHERE price >= ? ORDER BY price";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, min);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                out.println(rs.getString("name") + " - " + rs.getDouble("price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
