package org.demo.groovy.beans

/**
 * Student
 * 通过此类来了解Groovy特性
 *  1. 可省略分号
 *  2. 可省略getter/setter
 *  3. 可省略return
 *  4. 无权限时自动生成getter/setter
 *  5. 默认带有具名构造器
 * @Author: taomee* @Date: 2020/4/9 0009 17:46
 * @Description:
 */
class Student {
    private String name
    private int age
    private String gender


    String getName(){
        name
    }

    void setName(String name){
        this.name = name
    }
}
