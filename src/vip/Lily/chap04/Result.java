package vip.Lily.chap04;

public class Result {
    private int code;
    private String msg;
    private Object data;

    private static final int OK = 0;
    private static final int ERROR = 1;
    private static final String OK_MSG = "OK";

    public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result success(Object data){
        return new Result(OK,OK_MSG,data);
    }
    public boolean isSuccess(){
        return code == OK;
    }
    //方法的重载 ： 方法名称相同，参数列表不同
    public static Result success(){
        return success(null);
    }

    public static Result error(String msg){
        return new Result(ERROR,msg,null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
