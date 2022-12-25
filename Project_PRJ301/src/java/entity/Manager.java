package entity;


public class Manager {
    private String mid;
    private String mFullName;
    private String mPhone;
    private String username;
    private String password;

    public Manager() {
    }

    public Manager(String mid, String mFullName, String mPhone, String username, String password) {
        this.mid = mid;
        this.mFullName = mFullName;
        this.mPhone = mPhone;
        this.username = username;
        this.password = password;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getmFullName() {
        return mFullName;
    }

    public void setmFullName(String mFullName) {
        this.mFullName = mFullName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
