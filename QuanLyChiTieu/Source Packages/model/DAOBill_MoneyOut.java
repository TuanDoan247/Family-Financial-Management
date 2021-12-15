package model;

import entity.Bill_MoneyOut;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOBill_MoneyOut extends DBContext {

    public int insertBill(Bill_MoneyOut bill) {
        int n = 0;

        String sql = "insert into BillMoneyOut(billId, dateCreate, description, moneyOut, menuId, mid)\n"
                + "values(?,?,?,?,?,?)";
        try {
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setString(1, bill.getBillID());
            pre.setDate(2, bill.getDateCreate());
            pre.setString(3, bill.getDescription());
            pre.setFloat(4, bill.getMoneyOut());
            pre.setInt(5, bill.getMenuID());
            pre.setString(6, bill.getManagerID());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n;
    }

    public ResultSet getAll(String idMana, int year) {
        String sql = "select billId, dateCreate, description, moneyOut, m.menuName, mana.mfullname \n"
                + "from BillMoneyOut b \n"
                + "inner join Menu m on b.menuId = m.menuId\n"
                + "inner join Manager mana on b.mid = mana.mid\n"
                + "where b.mid = '" + idMana + "' ";

        if (year != 0) {
            sql += "and YEAR(dateCreate) = " + year + "";
        }
        return getData(sql);
    }

    public ResultSet getNumberCatagory(String idMana) {
        String sql = "select COUNT(distinct(menuId)) from BillMoneyOut where mid = '" + idMana + "'";
        return getData(sql);
    }

    public ResultSet getTotalMoneySpentForCategory(String idMana, int menuId) {
        String sql = "select * from BillMoneyOut where mid = '" + idMana + "' and menuId = " + menuId + "";
        return getData(sql);
    }

    public ResultSet getYear(String idMana) {
        String sql = "select distinct(Year(dateCreate)) as a from BillMoneyOut where mid = '" + idMana + "'\n"
                + "order by a desc";
        return getData(sql);
    }

    public ResultSet getCatagory(String idMana, int year) {
        String sql = "select distinct(menuName) from BillMoneyOut as b\n"
                + "inner join Menu as m \n"
                + "on b.menuId = m.menuId\n"
                + "where mid = '" + idMana + "' and YEAR(dateCreate) = " + year + "";
        return getData(sql);
    }

    public ResultSet getCatagoryUse(String idMana) {
        String sql = "select distinct(menuName) from BillMoneyOut as b\n"
                + "inner join Menu as m \n"
                + "on b.menuId = m.menuId\n"
                + "where mid = '" + idMana + "'";
        return getData(sql);
    }

    public ResultSet getTotalMoneyforEachCategory(String idMana, String menuName, int year) {
        String sql = "select billId, dateCreate, description, moneyOut, menuName\n"
                + "from BillMoneyOut as b inner join Menu as m \n"
                + "on b.menuId = m.menuId\n"
                + "where mid = '"+idMana+"' and menuName = '"+menuName+"' ";
        if(year != 0){
            sql += "and Year(dateCreate) = "+year+"";
        }
        
        return getData(sql);
    }
    
    public void remove(String idMana, String idBill) {
        String sql = "delete from BillMoneyOut where mid = '"+ idMana +"' and billId = '"+ idBill +"'";
        try {
            Statement state = connection.createStatement();
            state.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DAOBill_MoneyOut.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public ResultSet getBill(String idMana, String idBill){
        String sql = "select * from BillMoneyOut where mid = '"+ idMana +"' and billId = '"+ idBill +"'"; 
        return getData(sql);
    }
    
    public int updateBill_MoneyOut(Bill_MoneyOut bill, String idbill, String idMana){
        int n = 0;
            String sql = "update BillMoneyOut set "
                    + "dateCreate = '"+ bill.getDateCreate() +"', "
                    + "description = '"+ bill.getDescription() +"', "
                    + "moneyOut = "+ bill.getMoneyOut() +", "
                    + "menuId = "+ bill.getMenuID() +"\n"
                    + "where mid = '"+ idMana +"' and billId = '"+ idbill +"'";
        try {
            Statement state = connection.createStatement();
            n = state.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DAOBill_MoneyOut.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public static void main(String[] args) {
        DAOBill_MoneyOut dao = new DAOBill_MoneyOut();

        dao.remove("AT1", "EHX");

    }
}
