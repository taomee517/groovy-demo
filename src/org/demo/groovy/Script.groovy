package org.demo.groovy

import org.demo.groovy.beans.Student

//以脚本的形式来书写代码
Student stu = new Student()

//调用getter/setter
stu.setName("小明")
println stu.name

//访问没有权限的字段
stu.age = 20
println(stu.age)

//调用默认的具名构造方法
Student boy = new Student(gender: "男", name: "小东", age: 21)
println boy.gender
println boy.name
println boy.age
