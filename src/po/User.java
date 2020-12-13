package po;

public class User {
    private Integer userID;
    private String username;
    private String password;
    private Integer credit;

    public Integer getUserID()
    {
        return userID;
    }

    public void setUserID(Integer userID)
    {
        this.userID = userID;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Integer getCredit()
    {
        return credit;
    }

    public void setCredit(Integer credit)
    {
        this.credit = credit;
    }
}
