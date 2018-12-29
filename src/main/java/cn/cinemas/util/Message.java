package cn.cinemas.util;

/**
 * 军辉
 * 2018-12-18 11:39
 */
public class Message<T> {
    private String msg;
    private Integer code;
    private Object date;
/*
    private final static Integer SUCCCESS = 0;
    private final static Integer Fail = 1;*/

    public Message() {
    }

    public Message(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

    public Message(String msg, Integer code, Object date) {
        this.msg = msg;
        this.code = code;
        this.date = date;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", date=" + date +
                '}';
    }
    /* public Message(String msg, Integer flag) {
        this.msg = msg;
        this.flag = flag;
    }

    public Message(String msg, Integer flag, Object object) {
        this.msg = msg;
        this.flag = flag;
        this.object = object;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Message{" +
                "msg='" + msg + '\'' +
                ", flag=" + flag +
                ", object=" + object +
                '}';
    }*/
}
