package cn.no7player.model;

/**
 * Created by zl on 2015/8/27.
 */
public class User {
    private String username;
    private Integer age;
//    private String password;

    public String getName() {
        return this.username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
}
