package loginregistration.learn2crack.com.myapplication;

/**
 * Created by manoj on 8/10/2017.
 */
public class ServerResponse {

/*    private String status;
    private String result;
    private String message;
    private User user;

    public String getResult() {
        return result;
    }

    public String getStatus() {
        return status;
    }


    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }*/


    private String status;

    private String memberType;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }


}