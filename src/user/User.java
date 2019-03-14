package user;

public class User {
    protected String id;
    protected String password;
    protected String title;
    protected String name;
    protected String surname;
    protected String faculty;
    public boolean login(){
        //Login
        return true;
    }
    public void logout(){
        //Logout
    }
    private boolean verifyPassword(String password){
        //Verify password
        return true;
    }
}
