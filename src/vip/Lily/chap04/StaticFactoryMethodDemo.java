package vip.Lily.chap04;

public class StaticFactoryMethodDemo {
    public static void main(String[] args) {

    }

    public static Result queryStudentById(int id){
        if(id < 0){
        //查询失败
            return Result.error("id不能小于0");
        }
        Student student = new Student("张三","男");
        //查询成功
        return Result.success(student);
    }

    public static Result deleteById(int id){
        if(id < 0){
        //删除失败
            return Result.error("id不能小于0");
        }
        //删除成功
        return Result.success();
    }


}
