package model;

import entity.Menu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOMenu extends DBContext {

    public int insertMenu(Menu menu) {
        int n = 0;

        String sql = "insert into Menu(menuId, menuName)\n"
                + "values(?,?)";
        try {
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setInt(1, menu.getMenuid());
            pre.setString(2, menu.getMenuName());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n;
    }
    
    public ResultSet getAll(){
        String sql = "select * from Menu";
        return getData(sql);
    }
    
    public static void main(String[] args) {
        DAOMenu dao = new DAOMenu();
        
        int n = dao.insertMenu(new Menu(10, "repair fee"));
        if(n>0){
            System.out.println("add succesfully");
        }
    }
}
