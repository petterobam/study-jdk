---
title: 【java.util.*】 - README
type: "tags"
tags:
  - 包结构
javaname: README
srcpath: java.util
---

```cmd
├─concurrent(多线程）
│  ├─atomic（原子操作）
│  └─locks（锁）
├─function（Function接口）
├─jar（jar工具）
├─logging（日志组件）
├─prefs（首选项工具）
├─regex（正则）
├─spi（服务提供发现机制）
├─stream（Lambda流编程）
├─zip（压缩工具）
└─*.java（集合工具）
```

<!-- more -->

## 包简介

java.util.* 是 java 的常用工具类，包含 collection 框架、遗留的 collection 类、事件模型、日期和时间设施、国际化和各种实用工具类（字符串标记生成器、随机数生成器和位数组）。

## 详细目录
```cmd
java.util
    ├─AbstractCollection.java
    ├─AbstractList.java
    ├─AbstractMap.java
    ├─AbstractQueue.java
    ├─AbstractSequentialList.java
    ├─AbstractSet.java
    ├─ArrayDeque.java
    ├─ArrayList.java
    ├─ArrayPrefixHelpers.java
    ├─Arrays.java
    ├─ArraysParallelSortHelpers.java
    ├─Base64.java
    ├─BitSet.java
    ├─Calendar.java
    ├─Collection.java
    ├─Collections.java
    ├─ComparableTimSort.java
    ├─Comparator.java
    ├─Comparators.java
    ├─ConcurrentModificationException.java
    ├─Currency.java
    ├─Date.java
    ├─Deque.java
    ├─Dictionary.java
    ├─DoubleSummaryStatistics.java
    ├─DualPivotQuicksort.java
    ├─DuplicateFormatFlagsException.java
    ├─EmptyStackException.java
    ├─Enumeration.java
    ├─EnumMap.java
    ├─EnumSet.java
    ├─EventListener.java
    ├─EventListenerProxy.java
    ├─EventObject.java
    ├─FormatFlagsConversionMismatchException.java
    ├─Formattable.java
    ├─FormattableFlags.java
    ├─Formatter.java
    ├─FormatterClosedException.java
    ├─GregorianCalendar.java
    ├─HashMap.java
    ├─HashSet.java
    ├─Hashtable.java
    ├─IdentityHashMap.java
    ├─IllegalFormatCodePointException.java
    ├─IllegalFormatConversionException.java
    ├─IllegalFormatException.java
    ├─IllegalFormatFlagsException.java
    ├─IllegalFormatPrecisionException.java
    ├─IllegalFormatWidthException.java
    ├─IllformedLocaleException.java
    ├─InputMismatchException.java
    ├─IntSummaryStatistics.java
    ├─InvalidPropertiesFormatException.java
    ├─Iterator.java
    ├─JapaneseImperialCalendar.java
    ├─JumboEnumSet.java
    ├─LinkedHashMap.java
    ├─LinkedHashSet.java
    ├─LinkedList.java
    ├─List.java
    ├─ListIterator.java
    ├─ListResourceBundle.java
    ├─Locale.java
    ├─LocaleISOData.java
    ├─LongSummaryStatistics.java
    ├─Map.java
    ├─MissingFormatArgumentException.java
    ├─MissingFormatWidthException.java
    ├─MissingResourceException.java
    ├─NavigableMap.java
    ├─NavigableSet.java
    ├─NoSuchElementException.java
    ├─Objects.java
    ├─Observable.java
    ├─Observer.java
    ├─Optional.java
    ├─OptionalDouble.java
    ├─OptionalInt.java
    ├─OptionalLong.java
    ├─PrimitiveIterator.java
    ├─PriorityQueue.java
    ├─Properties.java
    ├─PropertyPermission.java
    ├─PropertyResourceBundle.java
    ├─Queue.java
    ├─Random.java
    ├─RandomAccess.java
    ├─RegularEnumSet.java
    ├─ResourceBundle.java
    ├─Scanner.java
    ├─ServiceConfigurationError.java
    ├─ServiceLoader.java
    ├─Set.java
    ├─SimpleTimeZone.java
    ├─SortedMap.java
    ├─SortedSet.java
    ├─Spliterator.java
    ├─Spliterators.java
    ├─SplittableRandom.java
    ├─Stack.java
    ├─StringJoiner.java
    ├─StringTokenizer.java
    ├─Timer.java
    ├─TimerTask.java
    ├─TimeZone.java
    ├─TimSort.java
    ├─TooManyListenersException.java
    ├─TreeMap.java
    ├─TreeSet.java
    ├─Tripwire.java
    ├─UnknownFormatConversionException.java
    ├─UnknownFormatFlagsException.java
    ├─UUID.java
    ├─Vector.java
    ├─WeakHashMap.java
    │
    ├─concurrent
    │   ├─AbstractExecutorService.java
    │   ├─ArrayBlockingQueue.java
    │   ├─BlockingDeque.java
    │   ├─BlockingQueue.java
    │   ├─BrokenBarrierException.java
    │   ├─Callable.java
    │   ├─CancellationException.java
    │   ├─CompletableFuture.java
    │   ├─CompletionException.java
    │   ├─CompletionService.java
    │   ├─CompletionStage.java
    │   ├─ConcurrentHashMap.java
    │   ├─ConcurrentLinkedDeque.java
    │   ├─ConcurrentLinkedQueue.java
    │   ├─ConcurrentMap.java
    │   ├─ConcurrentNavigableMap.java
    │   ├─ConcurrentSkipListMap.java
    │   ├─ConcurrentSkipListSet.java
    │   ├─CopyOnWriteArrayList.java
    │   ├─CopyOnWriteArraySet.java
    │   ├─CountDownLatch.java
    │   ├─CountedCompleter.java
    │   ├─CyclicBarrier.java
    │   ├─Delayed.java
    │   ├─DelayQueue.java
    │   ├─Exchanger.java
    │   ├─ExecutionException.java
    │   ├─Executor.java
    │   ├─ExecutorCompletionService.java
    │   ├─Executors.java
    │   ├─ExecutorService.java
    │   ├─ForkJoinPool.java
    │   ├─ForkJoinTask.java
    │   ├─ForkJoinWorkerThread.java
    │   ├─Future.java
    │   ├─FutureTask.java
    │   ├─LinkedBlockingDeque.java
    │   ├─LinkedBlockingQueue.java
    │   ├─LinkedTransferQueue.java
    │   ├─package-info.java
    │   ├─Phaser.java
    │   ├─PriorityBlockingQueue.java
    │   ├─RecursiveAction.java
    │   ├─RecursiveTask.java
    │   ├─RejectedExecutionException.java
    │   ├─RejectedExecutionHandler.java
    │   ├─RunnableFuture.java
    │   ├─RunnableScheduledFuture.java
    │   ├─ScheduledExecutorService.java
    │   ├─ScheduledFuture.java
    │   ├─ScheduledThreadPoolExecutor.java
    │   ├─Semaphore.java
    │   ├─SynchronousQueue.java
    │   ├─ThreadFactory.java
    │   ├─ThreadLocalRandom.java
    │   ├─ThreadPoolExecutor.java
    │   ├─TimeoutException.java
    │   ├─TimeUnit.java
    │   └─TransferQueue.java
    │
    ├─atomic
    │   ├─AtomicBoolean.java
    │   ├─AtomicInteger.java
    │   ├─AtomicIntegerArray.java
    │   ├─AtomicIntegerFieldUpdater.java
    │   ├─AtomicLong.java
    │   ├─AtomicLongArray.java
    │   ├─AtomicLongFieldUpdater.java
    │   ├─AtomicMarkableReference.java
    │   ├─AtomicReference.java
    │   ├─AtomicReferenceArray.java
    │   ├─AtomicReferenceFieldUpdater.java
    │   ├─AtomicStampedReference.java
    │   ├─DoubleAccumulator.java
    │   ├─DoubleAdder.java
    │   ├─LongAccumulator.java
    │   ├─LongAdder.java
    │   ├─package-info.java
    │   └─Striped64.java
    │
    ├─locks
    │   ├─AbstractOwnableSynchronizer.java
    │   ├─AbstractQueuedLongSynchronizer.java
    │   ├─AbstractQueuedSynchronizer.java
    │   ├─Condition.java
    │   ├─Lock.java
    │   ├─LockSupport.java
    │   ├─package-info.java
    │   ├─ReadWriteLock.java
    │   ├─ReentrantLock.java
    │   ├─ReentrantReadWriteLock.java
    │   └─StampedLock.java
    │
    ├─function
    │   ├─BiConsumer.java
    │   ├─BiFunction.java
    │   ├─BinaryOperator.java
    │   ├─BiPredicate.java
    │   ├─BooleanSupplier.java
    │   ├─Consumer.java
    │   ├─DoubleBinaryOperator.java
    │   ├─DoubleConsumer.java
    │   ├─DoubleFunction.java
    │   ├─DoublePredicate.java
    │   ├─DoubleSupplier.java
    │   ├─DoubleToIntFunction.java
    │   ├─DoubleToLongFunction.java
    │   ├─DoubleUnaryOperator.java
    │   ├─Function.java
    │   ├─IntBinaryOperator.java
    │   ├─IntConsumer.java
    │   ├─IntFunction.java
    │   ├─IntPredicate.java
    │   ├─IntSupplier.java
    │   ├─IntToDoubleFunction.java
    │   ├─IntToLongFunction.java
    │   ├─IntUnaryOperator.java
    │   ├─LongBinaryOperator.java
    │   ├─LongConsumer.java
    │   ├─LongFunction.java
    │   ├─LongPredicate.java
    │   ├─LongSupplier.java
    │   ├─LongToDoubleFunction.java
    │   ├─LongToIntFunction.java
    │   ├─LongUnaryOperator.java
    │   ├─ObjDoubleConsumer.java
    │   ├─ObjIntConsumer.java
    │   ├─ObjLongConsumer.java
    │   ├─package-info.java
    │   ├─Predicate.java
    │   ├─Supplier.java
    │   ├─ToDoubleBiFunction.java
    │   ├─ToDoubleFunction.java
    │   ├─ToIntBiFunction.java
    │   ├─ToIntFunction.java
    │   ├─ToLongBiFunction.java
    │   ├─ToLongFunction.java
    │   └─UnaryOperator.java
    │
    ├─jar
    │   ├─Attributes.java
    │   ├─JarEntry.java
    │   ├─JarException.java
    │   ├─JarFile.java
    │   ├─JarInputStream.java
    │   ├─JarOutputStream.java
    │   ├─JarVerifier.java
    │   ├─JavaUtilJarAccessImpl.java
    │   ├─Manifest.java
    │   └─Pack200.java
    │
    ├─logging
    │   ├─ConsoleHandler.java
    │   ├─ErrorManager.java
    │   ├─FileHandler.java
    │   ├─Filter.java
    │   ├─Formatter.java
    │   ├─Handler.java
    │   ├─Level.java
    │   ├─Logger.java
    │   ├─Logging.java
    │   ├─LoggingMXBean.java
    │   ├─LoggingPermission.java
    │   ├─LoggingProxyImpl.java
    │   ├─LogManager.java
    │   ├─LogRecord.java
    │   ├─MemoryHandler.java
    │   ├─SimpleFormatter.java
    │   ├─SocketHandler.java
    │   ├─StreamHandler.java
    │   └─XMLFormatter.java
    │
    ├─prefs
    │   ├─AbstractPreferences.java
    │   ├─BackingStoreException.java
    │   ├─Base64.java
    │   ├─FileSystemPreferences.java
    │   ├─FileSystemPreferencesFactory.java
    │   ├─InvalidPreferencesFormatException.java
    │   ├─NodeChangeEvent.java
    │   ├─NodeChangeListener.java
    │   ├─PreferenceChangeEvent.java
    │   ├─PreferenceChangeListener.java
    │   ├─Preferences.java
    │   ├─PreferencesFactory.java
    │   └─XmlSupport.java
    │
    ├─regex
    │   ├─ASCII.java
    │   ├─Matcher.java
    │   ├─MatchResult.java
    │   ├─Pattern.java
    │   ├─PatternSyntaxException.java
    │   └─UnicodeProp.java
    │
    ├─spi
    │   ├─CalendarDataProvider.java
    │   ├─CalendarNameProvider.java
    │   ├─CurrencyNameProvider.java
    │   ├─LocaleNameProvider.java
    │   ├─LocaleServiceProvider.java
    │   ├─ResourceBundleControlProvider.java
    │   └─TimeZoneNameProvider.java
    │
    ├─stream
    │   ├─AbstractPipeline.java
    │   ├─AbstractShortCircuitTask.java
    │   ├─AbstractSpinedBuffer.java
    │   ├─AbstractTask.java
    │   ├─BaseStream.java
    │   ├─Collector.java
    │   ├─Collectors.java
    │   ├─DistinctOps.java
    │   ├─DoublePipeline.java
    │   ├─DoubleStream.java
    │   ├─FindOps.java
    │   ├─ForEachOps.java
    │   ├─IntPipeline.java
    │   ├─IntStream.java
    │   ├─LongPipeline.java
    │   ├─LongStream.java
    │   ├─MatchOps.java
    │   ├─Node.java
    │   ├─Nodes.java
    │   ├─package-info.java
    │   ├─PipelineHelper.java
    │   ├─ReduceOps.java
    │   ├─ReferencePipeline.java
    │   ├─Sink.java
    │   ├─SliceOps.java
    │   ├─SortedOps.java
    │   ├─SpinedBuffer.java
    │   ├─Stream.java
    │   ├─StreamOpFlag.java
    │   ├─Streams.java
    │   ├─StreamShape.java
    │   ├─StreamSpliterators.java
    │   ├─StreamSupport.java
    │   ├─TerminalOp.java
    │   ├─TerminalSink.java
    │   └─Tripwire.java
    │
    └─zip
       ├─Adler32.java
       ├─CheckedInputStream.java
       ├─CheckedOutputStream.java
       ├─Checksum.java
       ├─CRC32.java
       ├─DataFormatException.java
       ├─Deflater.java
       ├─DeflaterInputStream.java
       ├─DeflaterOutputStream.java
       ├─GZIPInputStream.java
       ├─GZIPOutputStream.java
       ├─Inflater.java
       ├─InflaterInputStream.java
       ├─InflaterOutputStream.java
       ├─ZipCoder.java
       ├─ZipConstants.java
       ├─ZipConstants64.java
       ├─ZipEntry.java
       ├─ZipError.java
       ├─ZipException.java
       ├─ZipFile.java
       ├─ZipInputStream.java
       ├─ZipOutputStream.java
       ├─ZipUtils.java
       └─ZStreamRef.java
```