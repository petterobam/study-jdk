---
title: 【java.nio.*】 - README
type: "tags"
tags:
  - 包结构
javaname: README
srcpath: java.nio
---

```cmd
java.nio（bean相关的类）
   ├── channels（定义通道，表示与能够执行 I/O 操作的实体的连接，例如文件和套接字; 定义选择器，用于多路复用，非阻塞 I/O 操作。）
   │   └── spi（channels 服务提供类）
   ├── charset（定义字符集，解码器和编码器，用于在字节和Unicode字符之间进行转换。）
   │   └── spi（charset 服务提供类）
   ├── file（定义Java虚拟机的接口和类，以访问文件，文件属性和文件系统。）
   │   ├── attribute（提供对文件和文件系统属性的访问的接口和类。）
   │   └── spi（file 服务提供类）
   └─ *.java（缓冲区操作相关类）
```

<!-- more -->

## 包简介

定义缓冲区等数据的容器，并提供其他 NIO包 的概述。

## 详细目录
```cmd
java.nio
    ├── AppletInitializer.java
    ├── BeanDescriptor.java
    ├── BeanInfo.java
    ├── Beans.java
    ├── ChangeListenerMap.java
    ├── ConstructorProperties.java
    ├── Customizer.java
    ├── DefaultPersistenceDelegate.java
    ├── DesignMode.java
    ├── Encoder.java
    ├── EventHandler.java
    ├── EventSetDescriptor.java
    ├── ExceptionListener.java
    ├── Expression.java
    ├── FeatureDescriptor.java
    ├── IndexedPropertyChangeEvent.java
    ├── IndexedPropertyDescriptor.java
    ├── IntrospectionException.java
    ├── Introspector.java
    ├── MetaData.java
    ├── MethodDescriptor.java
    ├── MethodRef.java
    ├── NameGenerator.java
    ├── ParameterDescriptor.java
    ├── PersistenceDelegate.java
    ├── PropertyChangeEvent.java
    ├── PropertyChangeListener.java
    ├── PropertyChangeListenerProxy.java
    ├── PropertyChangeSupport.java
    ├── PropertyDescriptor.java
    ├── PropertyEditor.java
    ├── PropertyEditorManager.java
    ├── PropertyEditorSupport.java
    ├── PropertyVetoException.java
    ├── SimpleBeanInfo.java
    ├── Statement.java
    ├── ThreadGroupContext.java
    ├── Transient.java
    ├── VetoableChangeListener.java
    ├── VetoableChangeListenerProxy.java
    ├── VetoableChangeSupport.java
    ├── Visibility.java
    ├── WeakIdentityMap.java
    ├── XMLDecoder.java
    ├── XMLEncoder.java
    └── beancontext
        ├── BeanContext.java
        ├── BeanContextChild.java
        ├── BeanContextChildComponentProxy.java
        ├── BeanContextChildSupport.java
        ├── BeanContextContainerProxy.java
        ├── BeanContextEvent.java
        ├── BeanContextMembershipEvent.java
        ├── BeanContextMembershipListener.java
        ├── BeanContextProxy.java
        ├── BeanContextServiceAvailableEvent.java
        ├── BeanContextServiceProvider.java
        ├── BeanContextServiceProviderBeanInfo.java
        ├── BeanContextServiceRevokedEvent.java
        ├── BeanContextServiceRevokedListener.java
        ├── BeanContextServices.java
        ├── BeanContextServicesListener.java
        ├── BeanContextServicesSupport.java
        └── BeanContextSupport.java
    
```