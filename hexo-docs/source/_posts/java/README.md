---
title: 【java.*】 - README
type: "tags"
tags:
  - 包结构
javaname: README
srcpath: java
---

```cmd
src
  └─java
    ├─applet(网页小应用程序应用包，已废弃）
    ├─awt(抽象窗口工具包)
    ├─beans(java bean 操作相关的包)
    ├─io(IO 操作的包)
    ├─lang(Java语言包，java 开发的基础类和一些基本的方法)
    ├─math(学及科学计算相关的包)
    ├─net(网络通讯包)
    ├─nio(New IO 操作包)
    ├─rmi(远程方法调用)
    ├─security(安全框架)
    ├─sql(数据库 API 包)
    ├─text(文本处理包)
    ├─time(日期时间包)
    └─util(常用工具包)
```

<!-- more -->

-----------------------------------------

## java.applet包

创建 java applet 小应用程序的主要包，可以嵌入到网页中能够呈现出特殊的效果，现在基本已经被废弃，很少使用。

## java.awt包

AWT 是 Abstract Window ToolKit (抽象窗口工具包)的缩写，这个工具包提供了一套与本地图形界面进行交互的接口。AWT 中的图形函数与操作系统所提供的图形函数之间有着一一对应的关系，当我们利用 AWT 来构件图形用户界面的时候，实际上是在利用操作系统所提供的图形库。AWT 所提供的图形功能是各种通用型操作系统所提供的图形功能的交集。

## java.beans包 

java bean 操作相关的包

## java.io包

java 中 io 操作的包，通过数据流、序列化和文件系统提供系统输入和输出。

## java.lang包

java.lang 包包含了 java 开发的基础类和一些基本的方法。其中最重要的类就是 java.lang.Object类，它的对象是 Java 平台中所有其他类对象扩展层次树的根

## java.math包

一些数学及科学计算相关的包，提供用于执行任意精度整数算法 (BigInteger) 和任意精度小数算法 (BigDecimal) 的类。

## java.net包

java 网络通讯，如 socket 等操作

## java.nio包

nio是java New IO的简称，在jdk1.4里提供的新api。Sun官方标榜的特性如下：

- 为所有的原始类型提供(Buffer)缓存支持。
- 字符集编码解码解决方案。
- Channel：一个新的原始 I/O 抽象。
- 支持锁和内存映射文件的文件访问接口。
- 提供多路(non-bloking)非阻塞式的高伸缩性网络 I/O。

## java.rmi包

Java 远程方法调用，即 Java RMI（Java Remote Method Invocation）是 java 编程语言里，一种用于实现远程过程调用的应用程序编程接口。它使客户机上运行的程序可以调用远程服务器上的对象。远程方法调用特性使 Java 编程人员能够在网络环境中分布操作。RMI 全部的宗旨就是尽可能简化远程接口对象的使用。

## java.security包

java.security 包为安全框架提供类和接口。通过该包中的 Java 实现，仅仅能够完成消息摘要算法的实现（消息摘要处理的MessageDigest、DigestInputStream和DigestOutputStream类），并且其源代码是可见的。

## java.sql包

提供使用 JavaTM 编程语言访问并处理存储在数据源（通常是一个关系数据库）中的数据的 API。此 API 包括一个框架，凭借此框架可以动态地安装不同驱动程序来访问不同数据源。

## java.text包

提供类和接口处理文本、日期、数字和消息的方式独立的自然语言。

## java.time

日期、时间相关包。

## java.util包

java 的常用工具类，包含 collection 框架、遗留的 collection 类、事件模型、日期和时间设施、国际化和各种实用工具类（字符串标记生成器、随机数生成器和位数组）。

引用：[https://blog.csdn.net/wuyong686/article/details/8178349](https://blog.csdn.net/wuyong686/article/details/8178349)

-----------------------------------------