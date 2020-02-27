import java.util.Date;

public class Token{

    private int id;
    private String token;
    private String openid;
    private String session_key;
    private Date createtime;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Token{" +
                "id=" + id +
                ", token='" + token + '\'' +
                ", openid='" + openid + '\'' +
                ", session_key='" + session_key + '\'' +
                ", createtime=" + createtime +
                ", status=" + status +
                '}';
    }
}