
package entity;


public class Menu {
    private int menuid;
    private String menuName;

    public Menu() {
    }

    public Menu(int menuid, String menuName) {
        this.menuid = menuid;
        this.menuName = menuName;
    }

    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    
    
}
