---
title: 【java.util.HashMap.java】 - 源码提要
description: HashMap 源码阅读提要
type: "tags"
tags:
  - 源码提要
javaname: HashMap
srcpath: java.util
---

## 继承实现

```java
public class HashMap<K,V> extends AbstractMap<K,V>
        implements Map<K,V>, Cloneable, Serializable{...}
```

### AbstractMap

```java
public abstract class AbstractMap<K,V> implements Map<K,V>{...}
```

AbstractMap 抽象类实现了一些 Map 接口的简单且通用的方法

### Map

```java
public interface Map<K,V>{...}
```

定义键值对结构对象的通用操作，通过使用模板方式实现类或实例化时候可以动态自定义键（K）和值（V）类型

### Cloneable

```java
public interface Cloneable {
}
```

Cloneable 是标记型接口，它们内部都没有方法和属性，implements Cloneable表示该对象能被克隆，能使用 Object.clone() 方法。如果没有 implements Cloneable 的类调用 Object.clone() 方法就会抛出 CloneNotSupportedException。

### Serializable

```java
public interface Serializable {
}
```

和 Cloneable 一样都是标记型接口，一个类只有实现了 Serializable 接口，它的对象才能被序列化

## 变量属性

```java
// 持久化版本ID，用于 Serializable 的序列化。
private static final long serialVersionUID = 362498820763181265L;

/**
 * The default initial capacity - MUST be a power of two.
 * 初始容量 —— 必须是 2 的幂
 */
static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka（有名） 16

/**
 * The maximum capacity, used if a higher value is implicitly specified
 * by either of the constructors with arguments.
 * 最大容量，如果构造时候被指定更大的容量，这个就会被隐式指定为其容量。
 * MUST be a power of two <= 1<<30.
 */
static final int MAXIMUM_CAPACITY = 1 << 30;

/**
 * The load factor used when none specified in constructor.
 * 默认加载因子
 */
static final float DEFAULT_LOAD_FACTOR = 0.75f;

/**
 * The bin count threshold for using a tree rather than list for a
 * bin.  Bins are converted to trees when adding an element to a
 * bin with at least this many nodes. The value must be greater
 * than 2 and should be at least 8 to mesh with assumptions in
 * tree removal about conversion back to plain bins upon
 * shrinkage.
 * 链改成树的阀值
 */
static final int TREEIFY_THRESHOLD = 8;

/**
 * The bin count threshold for untreeifying a (split) bin during a
 * resize operation. Should be less than TREEIFY_THRESHOLD, and at
 * most 6 to mesh with shrinkage detection under removal.
 * 树变成链的阀值
 */
static final int UNTREEIFY_THRESHOLD = 6;

/**
 * The smallest table capacity for which bins may be treeified.
 * 可能树化的最小容量
 * (Otherwise the table is resized if too many nodes in a bin.)
 * Should be at least 4 * TREEIFY_THRESHOLD to avoid conflicts
 * between resizing and treeification thresholds.
 */
static final int MIN_TREEIFY_CAPACITY = 64;
/**
 * The table, initialized on first use, and resized as
 * necessary.
 * 哈希桶
 */
transient Node<K,V>[] table;

/**
 * Holds cached entrySet().
 * 缓存第一次 entrySet()的指针
 */
transient Set<Map.Entry<K,V>> entrySet;

/**
 * The number of key-value mappings contained in this map.
 * key-value 映射的数量
 */
transient int size;

/**
 * The number of times this HashMap has been structurally modified
 * 结构修改的次数
 */
transient int modCount;

/**
 * The next size value at which to resize (capacity * load factor).
 * 扩容阀值 ，一次初始化就不能修改了
 * @serial
 */
int threshold;

/**
 * The load factor for the hash table.
 * 加载因子，一次初始化就不能修改了
 * @serial
 */
final float loadFactor;
```

### static

用来修饰变量表示类变量，一个类中某个属性被static所修饰，那么就可以通过"类名.属性名"来访问

### final

一旦定义了 final 变量并在首次为其显示初始化后，final修饰的变量值不可被改变。对于基础类型变量，值不能改变；对于引用类型变量，引用不能指向其他对象。

### transient

- 只能修饰变量。
- 局部变量不能被 transient 关键字修饰，静态变量不管是否被 transient 修饰，均不能被序列化。
- 一旦变量被 transient 修饰，变量将不再是对象持久化的一部分，该变量内容在序列化后无法获得访问。

HashMap 实现 Serializable 接口，搭配 transient 可以选择性的序列化变量，比如 entrySet 和 threshold 之类的就可以不用了。

## 内部类

待续...