package cn.cinemas.util;

/**
 * 军辉
 * 2018-12-18 16:50
 */
public class MessageUtil {

    public static Message<Object> Succees(String str) {
        Message<Object> message = new Message();
        message.setCode(0);
        message.setMsg(str);
        return message;
    }

    public static Message<Object> Fail(String str) {
        Message<Object> message = new Message();
        message.setCode(1);
        message.setMsg(str);
        return message;
    }

    public static Message<Object> objectMessageSuccess(Object o, String str) {
        Message<Object> message = new Message();
        message.setCode(0);
        message.setData(o);
        message.setMsg(str);
        return message;
    }

    public static Message<Object> objectMessageFail(Object o, String str) {
        Message<Object> message = new Message();
        message.setCode(1);
        message.setData(o);
        message.setMsg(str);
        return message;
    }

    public static Message<Object> objectMessageCountSuccess(Object o, Integer count,String str) {
        Message<Object> message = new Message();
        message.setCode(0);
        message.setData(o);
        message.setCount(count);
        message.setMsg(str);
        return message;
    }

    public static Message<Object> objectMessageCountFail(Object o,Integer count, String str) {
        Message<Object> message = new Message();
        message.setCode(1);
        message.setData(o);
        message.setCount(count);
        message.setMsg(str);
        return message;
    }

    /*public static Message<Object> Succees(String str) {
        Message<Object> message = new Message();
        message.setFlag(0);
        message.setMsg(str);
        return message;
    }

    public static Message<Object> Fail(String str) {
        Message<Object> message = new Message();
        message.setFlag(1);
        message.setMsg(str);
        return message;
    }

    public static Message<Object> objectMessageSuccess(Object o, String str) {
        Message<Object> message = new Message();
        message.setFlag(0);
        message.setObject(o);
        message.setMsg(str);
        return message;
    }

    public static Message<Object> objectMessageFail(Object o, String str) {
        Message<Object> message = new Message();
        message.setFlag(1);
        message.setObject(o);
        message.setMsg(str);
        return message;
    }*/
}
