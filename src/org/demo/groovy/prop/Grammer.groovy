package org.demo.groovy.prop

println "===========基本语法==========="

def  name = "alizee"
age = 37

println name + "\t" + age

//断言
//assert  age == 39

println ''
println "===========字符串定义==========="
jarname = 'spring-eureka'
version = "1.0.0"
//引用其它变量
soft = "${jarname}-${version}"
//保留原有格式
msg = '''name:"tylor"  age:"32" '''

println soft
println msg

println ''
println "===========集合定义==========="
def list = ['taomee', 'nick']
//添加元素
list.add('tao')
list << "taomee517" 

println list
println list.getClass()

println ''
println "===========映射定义==========="
//map映射，使用[key:value]的形式
def map = ["name":"nick","age":30]
map.gender = "男"

println map.name
println map.age
println map.gender

println ''
println "===========方法定义==========="
def methodA(String name){
    println "Hello," + name + "!"
}

methodA("taomee")
methodA "taomee"

println ''
println "===========闭包定义==========="
//无参数闭包
def hello = {
    println "Hello,World!"
}
hello.call()


//隐式单个参数, 'it'是Groovy中的关键字
def closure = {
   println "Hello," + it + "!"
}
closure.call("Felix")

//包含形式参数的闭包
def closureA = {
    name1,name2 ->
//        println "Hello," + name1 + "," + name2
        println "Hello,${name1},${name2}"
}
closureA.call("tao", "nick")


println ''
println "===========闭包作为参数的方法==========="
//定义方法形参是指定类型，接收不带参数的闭包方法
def method1(Closure clo){
    clo.call()
}

//定义方法形参无指定类型，接收带参数的闭包的方法
def method2(closure){
    closure("Felix")
}

method1 hello
method2 closure

//调用方法时，定义新的闭包
method1({
    println "new closure"
})

//括号可以省略
method1{
    println "new closure"
}

method2{
    value ->
        println "Let's go! ${value}"
}