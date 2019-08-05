---
title: 【java.lang.*】 - README
type: "tags"
tags:
  - 包结构
javaname: README
srcpath: java.lang
---

```cmd
java.lang（提供对Java编程语言设计至关重要的类）
    ├── annotation（通用注解类）
    ├── instrument（自定义代理基础类-动态语言支持）
    ├── invoke（方法句柄相关基础类-动态语言支持）
    ├── management（JVM监测和管理相关基础类）
    ├── ref（引用对象类-支持与垃圾收集器的有限程度的交互）
    ├── reflect（反射编程相关）
    └─ *.java（Java编程基础类）
```

<!-- more -->

## 包简介

提供对Java编程语言设计至关重要的类。最重要的类是 Object类层次结构的根，并且其 Class实例在运行时表示类。

通常，有必要将原始类型的值表示为对象。该包装类Boolean， Character，Integer，Long，Float，和Double服务于这个目的。 Double例如，类型的对象包含一个类型为double的字段，以这样的方式表示该值，即对它的引用可以存储在引用类型的变量中。这些类还提供了许多用于在原始值之间进行转换的方法，以及支持诸如equals和hashCode之类的标准方法。的 Void类是保持于基准的非实例化类Class代表类型void对象。

该类Math提供常用的数学函数，如正弦，余弦和平方根。类 String，StringBuffer以及StringBuilder类似地提供字符串上常用的操作。

类ClassLoader，Process， ProcessBuilder，Runtime，SecurityManager，并 System提供了管理类的动态加载，创造外部进程中，主机环境查询，如一天中的时间，以及安全策略的执行“系统操作”。

类Throwable包含throw语句可能抛出的对象。Throwable 表示错误和异常的子类。

## 详细目录
```cmd
java.lang
    ├── AbstractMethodError.java
    ├── AbstractStringBuilder.java
    ├── Appendable.java
    ├── ApplicationShutdownHooks.java
    ├── ArithmeticException.java
    ├── ArrayIndexOutOfBoundsException.java
    ├── ArrayStoreException.java
    ├── AssertionError.java
    ├── AssertionStatusDirectives.java
    ├── AutoCloseable.java
    ├── Boolean.java
    ├── BootstrapMethodError.java
    ├── Byte.java
    ├── CharSequence.java
    ├── Character.java
    ├── CharacterData.java
    ├── CharacterData00.java
    ├── CharacterData01.java
    ├── CharacterData02.java
    ├── CharacterData0E.java
    ├── CharacterDataLatin1.java
    ├── CharacterDataPrivateUse.java
    ├── CharacterDataUndefined.java
    ├── CharacterName.java
    ├── Class.java
    ├── ClassCastException.java
    ├── ClassCircularityError.java
    ├── ClassFormatError.java
    ├── ClassLoader.java
    ├── ClassLoaderHelper.java
    ├── ClassNotFoundException.java
    ├── ClassValue.java
    ├── CloneNotSupportedException.java
    ├── Cloneable.java
    ├── Comparable.java
    ├── Compiler.java
    ├── ConditionalSpecialCasing.java
    ├── Deprecated.java
    ├── Double.java
    ├── Enum.java
    ├── EnumConstantNotPresentException.java
    ├── Error.java
    ├── Exception.java
    ├── ExceptionInInitializerError.java
    ├── Float.java
    ├── FunctionalInterface.java
    ├── IllegalAccessError.java
    ├── IllegalAccessException.java
    ├── IllegalArgumentException.java
    ├── IllegalMonitorStateException.java
    ├── IllegalStateException.java
    ├── IllegalThreadStateException.java
    ├── IncompatibleClassChangeError.java
    ├── IndexOutOfBoundsException.java
    ├── InheritableThreadLocal.java
    ├── InstantiationError.java
    ├── InstantiationException.java
    ├── Integer.java
    ├── InternalError.java
    ├── InterruptedException.java
    ├── Iterable.java
    ├── LinkageError.java
    ├── Long.java
    ├── Math.java
    ├── NegativeArraySizeException.java
    ├── NoClassDefFoundError.java
    ├── NoSuchFieldError.java
    ├── NoSuchFieldException.java
    ├── NoSuchMethodError.java
    ├── NoSuchMethodException.java
    ├── NullPointerException.java
    ├── Number.java
    ├── NumberFormatException.java
    ├── Object.java
    ├── OutOfMemoryError.java
    ├── Override.java
    ├── Package.java
    ├── Process.java
    ├── ProcessBuilder.java
    ├── ProcessEnvironment.java
    ├── ProcessImpl.java
    ├── Readable.java
    ├── ReflectiveOperationException.java
    ├── Runnable.java
    ├── Runtime.java
    ├── RuntimeException.java
    ├── RuntimePermission.java
    ├── SafeVarargs.java
    ├── SecurityException.java
    ├── SecurityManager.java
    ├── Short.java
    ├── Shutdown.java
    ├── StackOverflowError.java
    ├── StackTraceElement.java
    ├── StrictMath.java
    ├── String.java
    ├── StringBuffer.java
    ├── StringBuilder.java
    ├── StringCoding.java
    ├── StringIndexOutOfBoundsException.java
    ├── SuppressWarnings.java
    ├── System.java
    ├── Terminator.java
    ├── Thread.java
    ├── ThreadDeath.java
    ├── ThreadGroup.java
    ├── ThreadLocal.java
    ├── Throwable.java
    ├── TypeNotPresentException.java
    ├── UNIXProcess.java
    ├── UnknownError.java
    ├── UnsatisfiedLinkError.java
    ├── UnsupportedClassVersionError.java
    ├── UnsupportedOperationException.java
    ├── VerifyError.java
    ├── VirtualMachineError.java
    ├── Void.java
    ├── annotation
    │   ├── Annotation.java
    │   ├── AnnotationFormatError.java
    │   ├── AnnotationTypeMismatchException.java
    │   ├── Documented.java
    │   ├── ElementType.java
    │   ├── IncompleteAnnotationException.java
    │   ├── Inherited.java
    │   ├── Native.java
    │   ├── Repeatable.java
    │   ├── Retention.java
    │   ├── RetentionPolicy.java
    │   ├── Target.java
    │   └── package-info.java
    ├── instrument
    │   ├── ClassDefinition.java
    │   ├── ClassFileTransformer.java
    │   ├── IllegalClassFormatException.java
    │   ├── Instrumentation.java
    │   └── UnmodifiableClassException.java
    ├── invoke
    │   ├── AbstractValidatingLambdaMetafactory.java
    │   ├── BoundMethodHandle.java
    │   ├── CallSite.java
    │   ├── ConstantCallSite.java
    │   ├── DelegatingMethodHandle.java
    │   ├── DirectMethodHandle.java
    │   ├── DontInline.java
    │   ├── ForceInline.java
    │   ├── InfoFromMemberName.java
    │   ├── InjectedProfile.java
    │   ├── InnerClassLambdaMetafactory.java
    │   ├── InvokeDynamic.java
    │   ├── InvokerBytecodeGenerator.java
    │   ├── Invokers.java
    │   ├── LambdaConversionException.java
    │   ├── LambdaForm.java
    │   ├── LambdaFormBuffer.java
    │   ├── LambdaFormEditor.java
    │   ├── LambdaMetafactory.java
    │   ├── MemberName.java
    │   ├── MethodHandle.java
    │   ├── MethodHandleImpl.java
    │   ├── MethodHandleInfo.java
    │   ├── MethodHandleNatives.java
    │   ├── MethodHandleProxies.java
    │   ├── MethodHandleStatics.java
    │   ├── MethodHandles.java
    │   ├── MethodType.java
    │   ├── MethodTypeForm.java
    │   ├── MutableCallSite.java
    │   ├── ProxyClassesDumper.java
    │   ├── SerializedLambda.java
    │   ├── SimpleMethodHandle.java
    │   ├── Stable.java
    │   ├── SwitchPoint.java
    │   ├── TypeConvertingMethodAdapter.java
    │   ├── VolatileCallSite.java
    │   ├── WrongMethodTypeException.java
    │   └── package-info.java
    ├── management
    │   ├── BufferPoolMXBean.java
    │   ├── ClassLoadingMXBean.java
    │   ├── CompilationMXBean.java
    │   ├── GarbageCollectorMXBean.java
    │   ├── LockInfo.java
    │   ├── ManagementFactory.java
    │   ├── ManagementPermission.java
    │   ├── MemoryMXBean.java
    │   ├── MemoryManagerMXBean.java
    │   ├── MemoryNotificationInfo.java
    │   ├── MemoryPoolMXBean.java
    │   ├── MemoryType.java
    │   ├── MemoryUsage.java
    │   ├── MonitorInfo.java
    │   ├── OperatingSystemMXBean.java
    │   ├── PlatformComponent.java
    │   ├── PlatformLoggingMXBean.java
    │   ├── PlatformManagedObject.java
    │   ├── RuntimeMXBean.java
    │   ├── ThreadInfo.java
    │   └── ThreadMXBean.java
    ├── package-info.java
    ├── ref
    │   ├── FinalReference.java
    │   ├── Finalizer.java
    │   ├── FinalizerHistogram.java
    │   ├── PhantomReference.java
    │   ├── Reference.java
    │   ├── ReferenceQueue.java
    │   ├── SoftReference.java
    │   └── WeakReference.java
    └── reflect
        ├── AccessibleObject.java
        ├── AnnotatedArrayType.java
        ├── AnnotatedElement.java
        ├── AnnotatedParameterizedType.java
        ├── AnnotatedType.java
        ├── AnnotatedTypeVariable.java
        ├── AnnotatedWildcardType.java
        ├── Array.java
        ├── Constructor.java
        ├── Executable.java
        ├── Field.java
        ├── GenericArrayType.java
        ├── GenericDeclaration.java
        ├── GenericSignatureFormatError.java
        ├── InvocationHandler.java
        ├── InvocationTargetException.java
        ├── MalformedParameterizedTypeException.java
        ├── MalformedParametersException.java
        ├── Member.java
        ├── Method.java
        ├── Modifier.java
        ├── Parameter.java
        ├── ParameterizedType.java
        ├── Proxy.java
        ├── ReflectAccess.java
        ├── ReflectPermission.java
        ├── Type.java
        ├── TypeVariable.java
        ├── UndeclaredThrowableException.java
        ├── WeakCache.java
        ├── WildcardType.java
        └── package-info.java

```