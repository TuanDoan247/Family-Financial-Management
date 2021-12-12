
package model;

import entity.Manager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOManager extends DBContext{
    public int insertManager(Manager manager) {
        int n = 0;

        String sql = "insert into Manager(mid, mfullname, mphone, username, password)\n"
                + "values(?,?,?,?,?)";
        try {
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setString(1, manager.getMid());
            pre.setString(2, manager.getmFullName());
            pre.setString(3, manager.getmPhone());
            pre.setString(4, manager.getUsername());
            pre.setString(5, manager.getPassword());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n;
    }
    
    public boolean check(String username, String password){
        boolean isValid = false;

        try {
            String sql = "select * from Manager where username = ? and password = ?";
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setString(1, username);
            pre.setString(2, password);
            
            ResultSet rs = pre.executeQuery();
            
            if(rs.next()){
                isValid = true;
            }else{
                isValid = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isValid;
    }
    
    public ArrayList<Manager> getAll(){
        ArrayList<Manager> arr = new ArrayList<Manager>();
        
        String sql = "select * from Manager";
        ResultSet rsMana = getData(sql);
        try{
            while(rsMana.next()){
                String mid = rsMana.getString(1);
                String mFullName = rsMana.getString(2);
                String mPhone = rsMana.getString(3);
                String username = rsMana.getString(4);
                String password = rsMana.getString(5);
                Manager mana = new Manager(mid, mFullName, mPhone, username, password);
                arr.add(mana);
            }
        }catch (SQLException ex) {
            Logger.getLogger(DAOManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    
    public static void main(String[] args) {
        DAOManager dao = new DAOManager();
        
        boolean t = dao.check("tuanhz", "12345678");
        System.out.println(t);
    }
}
