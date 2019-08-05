---
title: 【java.rim.*】 - README
type: "tags"
tags:
  - 包结构
javaname: README
srcpath: java.rim
---

```cmd
java.rim（远程调用相关）
   ├── activation（提供对RMI对象激活的支持）
   ├── dgc（为RMI分布式垃圾收集（DGC）提供类和接口）
   ├── registry（为RMI注册表提供一个类和两个接口）
   ├── server（提供用于支持RMI服务器端的类和接口）
   └─ *.java（远程调用相关基础类）
```

<!-- more -->

## 包简介

提供 RMI 包。RMI 指的是远程方法调用 (Remote Method Invocation)。

它是一种机制，能够让在某个 Java虚拟机上的对象调用另一个 Java 虚拟机中的对象上的方法。

可以用此方法调用的任何对象必须实现该远程接口。调用这样一个对象时，其参数为 "marshalled" 并将其从本地虚拟机发送到远程虚拟机（该远程虚拟机的参数为 "unmarshalled"）上。

该方法终止时，将编组来自远程机的结果并将结果发送到调用方的虚拟机。如果方法调用导致抛出异常，则该异常将指示给调用方。

## 详细目录
```cmd
java.rim
    ├── AccessException.java
    ├── AlreadyBoundException.java
    ├── ConnectException.java
    ├── ConnectIOException.java
    ├── MarshalException.java
    ├── MarshalledObject.java
    ├── Naming.java
    ├── NoSuchObjectException.java
    ├── NotBoundException.java
    ├── RMISecurityException.java
    ├── RMISecurityManager.java
    ├── Remote.java
    ├── RemoteException.java
    ├── ServerError.java
    ├── ServerException.java
    ├── ServerRuntimeException.java
    ├── StubNotFoundException.java
    ├── UnexpectedException.java
    ├── UnknownHostException.java
    ├── UnmarshalException.java
    ├── activation
    │   ├── Activatable.java
    │   ├── ActivateFailedException.java
    │   ├── ActivationDesc.java
    │   ├── ActivationException.java
    │   ├── ActivationGroup.java
    │   ├── ActivationGroupDesc.java
    │   ├── ActivationGroupID.java
    │   ├── ActivationID.java
    │   ├── ActivationInstantiator.java
    │   ├── ActivationMonitor.java
    │   ├── ActivationSystem.java
    │   ├── Activator.java
    │   ├── UnknownGroupException.java
    │   └── UnknownObjectException.java
    ├── dgc
    │   ├── DGC.java
    │   ├── Lease.java
    │   └── VMID.java
    ├── registry
    │   ├── LocateRegistry.java
    │   ├── Registry.java
    │   └── RegistryHandler.java
    └── server
        ├── ExportException.java
        ├── LoaderHandler.java
        ├── LogStream.java
        ├── ObjID.java
        ├── Operation.java
        ├── RMIClassLoader.java
        ├── RMIClassLoaderSpi.java
        ├── RMIClientSocketFactory.java
        ├── RMIFailureHandler.java
        ├── RMIServerSocketFactory.java
        ├── RMISocketFactory.java
        ├── RemoteCall.java
        ├── RemoteObject.java
        ├── RemoteObjectInvocationHandler.java
        ├── RemoteRef.java
        ├── RemoteServer.java
        ├── RemoteStub.java
        ├── ServerCloneException.java
        ├── ServerNotActiveException.java
        ├── ServerRef.java
        ├── Skeleton.java
        ├── SkeletonMismatchException.java
        ├── SkeletonNotFoundException.java
        ├── SocketSecurityException.java
        ├── UID.java
        ├── UnicastRemoteObject.java
        └── Unreferenced.java

```