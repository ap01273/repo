package com.example.demo.pojo;

public class Result {//响应格式
    private Integer code;//1，成功，0，失败
    private String message;//信息
    private Object data;//数据

    public Result() {
    }

    public Result(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static Result success(Object data)
    {
        return new Result(1,"success",data);
    }

    public static Result success()
    {
        return new Result(1,"success",null);
    }

    public static Result success(String message)
    {
        return new Result(1,message,null);
    }

    public static Result error(Object data)
    {
        return new Result(0,"error",data);
    }

    public static Result error()
    {
        return new Result(0,"error",null);
    }

    public static Result error(String message)
    {
        return new Result(0,message,null);
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
