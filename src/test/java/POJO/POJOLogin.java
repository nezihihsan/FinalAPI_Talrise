package POJO;

public class POJOLogin {

    private  String email;
    private String password;

    public  POJOLogin(){

    }

    public POJOLogin(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "POJOLogin{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
