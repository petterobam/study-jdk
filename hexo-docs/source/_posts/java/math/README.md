---
title: 【java.math.*】 - README
type: "tags"
tags:
  - 包结构
javaname: README
srcpath: java.math
---

```cmd
java.math（高精度计算）
   └─ *.java（高精度计算相关类）
```

<!-- more -->

## 包简介

提供用于执行任意精度整数算术（BigInteger）和任意精度十进制算术（BigDecimal）的类。 

BigInteger类似于原始整数类型，除了它提供任意精度，因此对BigIntegers的操作不会溢出或丢失精度。除标准算术运算外， BigInteger还提供模运算，GCD计算，素数测试，素数生成，位操作以及一些其他杂项操作。 

BigDecimal提供适合于货币计算等的任意精度的带符号十进制数。 BigDecimal使用户可以完全控制舍入行为，允许用户从一组全面的八种舍入模式中进行选择。

## 详细目录
```cmd
java.math
    ├── BigDecimal.java
    ├── BigInteger.java
    ├── BitSieve.java
    ├── MathContext.java
    ├── MutableBigInteger.java
    ├── RoundingMode.java
    ├── SignedMutableBigInteger.java
    └── package-info.java
```