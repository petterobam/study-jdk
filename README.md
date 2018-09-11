# JDK源码阅读和学习

- 参考源码：[jdk-8u181-linux-x64.tar.gz](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- 阅读工具：IntelliJ IDEA 2017.2

# 阅读计划

- 分包阅读研究，不跳包阅读；
- 先常用、基础部分，再偏难、复杂部分；
- 形式包含：翻译、注释、MD博文

# 源码统计

- 统计行数明细：[count-result.txt](./count-result.txt)
- 总行数：2415713

```shell
t99@DESKTOP-54DNM8N ~/jdk1.8.0_181
$ find . -name "*.*" | xargs wc -l > count-result.txt

t99@DESKTOP-54DNM8N ~/jdk1.8.0_181
$ find . -name "*.*" | xargs wc -l | grep 总用量
 120153 总用量
  32540 总用量
 134010 总用量
  87498 总用量
 120771 总用量
 142893 总用量
  95869 总用量
 115000 总用量
 292156 总用量
 197502 总用量
 337404 总用量
 143734 总用量
 255664 总用量
 214830 总用量
  86986 总用量
  38703 总用量

t99@DESKTOP-54DNM8N ~/jdk1.8.0_181
$ find . -name "*.*" | xargs wc -l | grep 总用量 | awk '{sum += $1} END {print sum}'
2415713
```

# 加油

flighting ! (≧∀≦)