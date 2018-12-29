package cn.cinemas.util;

/**
 * 军辉
 * 2018-12-18 11:39
 */
public class Message<T> {
    private String msg;
    private Integer code;
    private Integer count;
    private Object data;
/*
    private final static Integer SUCCCESS = 0;
    private final static Integer Fail = 1;*/

    public Message() {
    }

    public Message(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

    public Message(String msg, Integer code, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public Message(String msg, Integer code, Integer count, Object data) {
        this.msg = msg;
        this.code = code;
        this.count = count;
        this.data = data;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Message{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", count=" + count +
                ", data=" + data +
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
