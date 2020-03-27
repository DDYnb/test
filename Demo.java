package com.honzooban.springbootdom4j;

import java.util.HashMap;

/**
 * @author 你自己的昵称
 * @version 1.0.0
 * @ClassName Demo.java
 * @Description 该类的描述
 * @createTime 2020年03月25日 22:41:00
 */
public class Demo {

    /**
     * 常量的命名按照如下案例，所有的单词均用大写字母表示，且单词间使用下划线_隔开
     */
    public static final String USER_NAME = "张三";

    // 方法命名使用驼峰命名，第一个单词首字母小写，后面的单词首字母大写
    public void addUser(User user) {
        //变量也是驼峰命名，上面的形参也是驼峰命名
        String userName = "张三";
    }


    /**
     * 方法的描述，比如这里通过用户id查找用户信息
     * @param id 参数说明，比如这里是用户id
     * @return 返回结果说明，比如这里返回的是用户对象
     */
    public User selectUserById(Integer id){
        /**
         * 关键代码需要添加行注释，比如下面
         */
        UserService userService = new UserService();
        // 调用业务层方法获取用户信息
        User user = userService.selectUserById(id);
        return user;
    }

    /**
     * 假设这是业务层
     */
    class UserService{

        public User selectUserById(Integer id){
            HashMap<Object, Object> map = new HashMap<>(4);
            // 这里的value使用常量可以避免魔法值的出现
            map.put("name", USER_NAME);
            // 如果像下面这条代码的话，后期别人看代码甚至自己看代码都可能会忘记这个value的意义
            map.put("name", "hello world!");
            return new User();
        }
    }


    /**
     * 这里创建内部类仅用于展示，实体类要放在entity包下
     */
    class User{
        private Integer id;
        private String name;
        private Integer gender;
        private Integer age;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getGender() {
            return gender;
        }

        public void setGender(Integer gender) {
            this.gender = gender;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
