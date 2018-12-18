package cn.cinemas.util;

/**
 * 军辉
 * 2018-12-18 11:39
 */
public class Message<T> {
    private String msg;
    private Integer flag;
/*
    private final static Integer SUCCCESS = 0;
    private final static Integer Fail = 1;*/

    public Message() {
    }

    public Message(String msg, Integer flag) {
        this.msg = msg;
        this.flag = flag;
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

    @Override
    public String toString() {
        return "Message{" +
                "msg='" + msg + '\'' +
                ", flag=" + flag +
                '}';
    }
}
