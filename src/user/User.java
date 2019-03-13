package user;

public class User {
    protected String id;
    protected String password;
    protected String title;
    protected String name;
    protected String surname;
    protected String faculty;
    public boolean login(){
        return true;
    }
    public void logout(){

    }
    private boolean verifyPassword(String password){
        return true;
    }
}
