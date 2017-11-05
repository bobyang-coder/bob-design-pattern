---

---

## 也称为
Action, Transaction

## 目的
Encapsulate a request as an object, thereby letting you
parameterize clients with different requests, queue or log requests, and
support undoable operations.
## UML图

## 涉及对象
![alt text](./etc/command.png "Command")

## 缺点

## 优点

## 适用场景
* 当需要对行为进行“记录、撤销/重做”等处理时。
* 系统需要将请求者和接收者解耦，使得调用者和接收者不直接交互。
* 系统需要在不同时间指定请求、请求排队和执行请求。
* 系统需要将一组操作组合在一起，即支持宏命令。

## 典型应用案例

* to keep a history of requests
* implement callback functionality
* implement the undo functionality

## 真实案例

* [java.lang.Runnable](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)
* [Netflix Hystrix](https://github.com/Netflix/Hystrix/wiki)
* [javax.swing.Action](http://docs.oracle.com/javase/8/docs/api/javax/swing/Action.html)