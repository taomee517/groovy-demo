package org.demo.groovy

import org.demo.groovy.beans.Teacher

/**
 * Demo
 *
 * @Author: taomee* @Date: 2020/4/9 0009 17:46
 * @Description:
 */
class Demo {
    static void main(String[] args) {
        Teacher teacher = new Teacher(name: "张杰", age: 40, course: "物理")
        println(teacher.name)
        println(teacher.age)
        println(teacher.course)
    }
}
