package pojo;

public class AuthenticationPojo
{
    private String email;
    private String password;

    public AuthenticationPojo(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }

    @Override
    public String toString() {
        return "AuthenticationPojo{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
