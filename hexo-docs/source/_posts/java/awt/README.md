---
title: 【java.awt.*】 - README
type: "tags"
tags:
  - 包结构
javaname: README
srcpath: java.awt
---

```cmd
java.awt（用户界面和绘图相关）
   ├── color （提供颜色空间的类）
   ├── datatransfer（提供用于在应用程序之间和之内传输数据的接口和类）
   ├── dnd（拖放是在许多图形用户界面系统中发现的直接操纵手势，其提供了在GUI中与表示元素逻辑相关联的两个实体之间传递信息的机制）
   │   └── peer（1）
   ├── event（提供用于处理AWT组件触发的不同类型事件的接口和类）
   ├── font（提供与字体相关的类和界面）
   ├── geom（提供Java 2D类，用于定义和执行与二维几何体相关的对象的操作）
   ├── im（为输入方法框架提供类和接口）
   │   └── spi（提供可用于开发可与任何Java运行时环境一起使用的输入方法的接口）
   ├── image（提供用于创建和修改图像的类）
   │   └── renderable（提供用于生成与渲染无关的图像的类和接口）
   ├── peer（各组件接口定义）
   ├── print（为常规打印API提供类和接口）
   └─ *.java（用户界面和绘图相关基础类）
```

<!-- more -->

## 包简介

包含用于创建用户界面和绘制图形和图像的所有类。

## 详细目录
```cmd
java.awt
    ├── AWTError.java
    ├── AWTEvent.java
    ├── AWTEventMulticaster.java
    ├── AWTException.java
    ├── AWTKeyStroke.java
    ├── AWTPermission.java
    ├── ActiveEvent.java
    ├── Adjustable.java
    ├── AlphaComposite.java
    ├── AttributeValue.java
    ├── BasicStroke.java
    ├── BorderLayout.java
    ├── BufferCapabilities.java
    ├── Button.java
    ├── Canvas.java
    ├── CardLayout.java
    ├── Checkbox.java
    ├── CheckboxGroup.java
    ├── CheckboxMenuItem.java
    ├── Choice.java
    ├── Color.java
    ├── ColorPaintContext.java
    ├── Component.java
    ├── ComponentOrientation.java
    ├── Composite.java
    ├── CompositeContext.java
    ├── Conditional.java
    ├── Container.java
    ├── ContainerOrderFocusTraversalPolicy.java
    ├── Cursor.java
    ├── DefaultFocusTraversalPolicy.java
    ├── DefaultKeyboardFocusManager.java
    ├── Desktop.java
    ├── Dialog.java
    ├── Dimension.java
    ├── DisplayMode.java
    ├── Event.java
    ├── EventDispatchThread.java
    ├── EventFilter.java
    ├── EventQueue.java
    ├── FileDialog.java
    ├── FlowLayout.java
    ├── FocusTraversalPolicy.java
    ├── Font.java
    ├── FontFormatException.java
    ├── FontMetrics.java
    ├── Frame.java
    ├── GradientPaint.java
    ├── GradientPaintContext.java
    ├── Graphics.java
    ├── Graphics2D.java
    ├── GraphicsCallback.java
    ├── GraphicsConfigTemplate.java
    ├── GraphicsConfiguration.java
    ├── GraphicsDevice.java
    ├── GraphicsEnvironment.java
    ├── GridBagConstraints.java
    ├── GridBagLayout.java
    ├── GridBagLayoutInfo.java
    ├── GridLayout.java
    ├── HeadlessException.java
    ├── IllegalComponentStateException.java
    ├── Image.java
    ├── ImageCapabilities.java
    ├── Insets.java
    ├── ItemSelectable.java
    ├── JobAttributes.java
    ├── KeyEventDispatcher.java
    ├── KeyEventPostProcessor.java
    ├── KeyboardFocusManager.java
    ├── Label.java
    ├── LayoutManager.java
    ├── LayoutManager2.java
    ├── LinearGradientPaint.java
    ├── LinearGradientPaintContext.java
    ├── List.java
    ├── MediaTracker.java
    ├── Menu.java
    ├── MenuBar.java
    ├── MenuComponent.java
    ├── MenuContainer.java
    ├── MenuItem.java
    ├── MenuShortcut.java
    ├── ModalEventFilter.java
    ├── MouseInfo.java
    ├── MultipleGradientPaint.java
    ├── MultipleGradientPaintContext.java
    ├── PageAttributes.java
    ├── Paint.java
    ├── PaintContext.java
    ├── Panel.java
    ├── Point.java
    ├── PointerInfo.java
    ├── Polygon.java
    ├── PopupMenu.java
    ├── PrintGraphics.java
    ├── PrintJob.java
    ├── RadialGradientPaint.java
    ├── RadialGradientPaintContext.java
    ├── Rectangle.java
    ├── RenderingHints.java
    ├── Robot.java
    ├── ScrollPane.java
    ├── ScrollPaneAdjustable.java
    ├── Scrollbar.java
    ├── SecondaryLoop.java
    ├── SentEvent.java
    ├── SequencedEvent.java
    ├── Shape.java
    ├── SplashScreen.java
    ├── Stroke.java
    ├── SystemColor.java
    ├── SystemTray.java
    ├── TextArea.java
    ├── TextComponent.java
    ├── TextField.java
    ├── TexturePaint.java
    ├── TexturePaintContext.java
    ├── Toolkit.java
    ├── Transparency.java
    ├── TrayIcon.java
    ├── WaitDispatchSupport.java
    ├── Window.java
    ├── color
    │   ├── CMMException.java
    │   ├── ColorSpace.java
    │   ├── ICC_ColorSpace.java
    │   ├── ICC_Profile.java
    │   ├── ICC_ProfileGray.java
    │   ├── ICC_ProfileRGB.java
    │   └── ProfileDataException.java
    ├── datatransfer
    │   ├── Clipboard.java
    │   ├── ClipboardOwner.java
    │   ├── DataFlavor.java
    │   ├── FlavorEvent.java
    │   ├── FlavorListener.java
    │   ├── FlavorMap.java
    │   ├── FlavorTable.java
    │   ├── MimeType.java
    │   ├── MimeTypeParameterList.java
    │   ├── MimeTypeParseException.java
    │   ├── StringSelection.java
    │   ├── SystemFlavorMap.java
    │   ├── Transferable.java
    │   └── UnsupportedFlavorException.java
    ├── dnd
    │   ├── Autoscroll.java
    │   ├── DnDConstants.java
    │   ├── DnDEventMulticaster.java
    │   ├── DragGestureEvent.java
    │   ├── DragGestureListener.java
    │   ├── DragGestureRecognizer.java
    │   ├── DragSource.java
    │   ├── DragSourceAdapter.java
    │   ├── DragSourceContext.java
    │   ├── DragSourceDragEvent.java
    │   ├── DragSourceDropEvent.java
    │   ├── DragSourceEvent.java
    │   ├── DragSourceListener.java
    │   ├── DragSourceMotionListener.java
    │   ├── DropTarget.java
    │   ├── DropTargetAdapter.java
    │   ├── DropTargetContext.java
    │   ├── DropTargetDragEvent.java
    │   ├── DropTargetDropEvent.java
    │   ├── DropTargetEvent.java
    │   ├── DropTargetListener.java
    │   ├── InvalidDnDOperationException.java
    │   ├── MouseDragGestureRecognizer.java
    │   ├── SerializationTester.java
    │   └── peer
    │       ├── DragSourceContextPeer.java
    │       ├── DropTargetContextPeer.java
    │       └── DropTargetPeer.java
    ├── event
    │   ├── AWTEventListener.java
    │   ├── AWTEventListenerProxy.java
    │   ├── ActionEvent.java
    │   ├── ActionListener.java
    │   ├── AdjustmentEvent.java
    │   ├── AdjustmentListener.java
    │   ├── ComponentAdapter.java
    │   ├── ComponentEvent.java
    │   ├── ComponentListener.java
    │   ├── ContainerAdapter.java
    │   ├── ContainerEvent.java
    │   ├── ContainerListener.java
    │   ├── FocusAdapter.java
    │   ├── FocusEvent.java
    │   ├── FocusListener.java
    │   ├── HierarchyBoundsAdapter.java
    │   ├── HierarchyBoundsListener.java
    │   ├── HierarchyEvent.java
    │   ├── HierarchyListener.java
    │   ├── InputEvent.java
    │   ├── InputMethodEvent.java
    │   ├── InputMethodListener.java
    │   ├── InvocationEvent.java
    │   ├── ItemEvent.java
    │   ├── ItemListener.java
    │   ├── KeyAdapter.java
    │   ├── KeyEvent.java
    │   ├── KeyListener.java
    │   ├── MouseAdapter.java
    │   ├── MouseEvent.java
    │   ├── MouseListener.java
    │   ├── MouseMotionAdapter.java
    │   ├── MouseMotionListener.java
    │   ├── MouseWheelEvent.java
    │   ├── MouseWheelListener.java
    │   ├── NativeLibLoader.java
    │   ├── PaintEvent.java
    │   ├── TextEvent.java
    │   ├── TextListener.java
    │   ├── WindowAdapter.java
    │   ├── WindowEvent.java
    │   ├── WindowFocusListener.java
    │   ├── WindowListener.java
    │   └── WindowStateListener.java
    ├── font
    │   ├── CharArrayIterator.java
    │   ├── FontRenderContext.java
    │   ├── GlyphJustificationInfo.java
    │   ├── GlyphMetrics.java
    │   ├── GlyphVector.java
    │   ├── GraphicAttribute.java
    │   ├── ImageGraphicAttribute.java
    │   ├── LayoutPath.java
    │   ├── LineBreakMeasurer.java
    │   ├── LineMetrics.java
    │   ├── MultipleMaster.java
    │   ├── NumericShaper.java
    │   ├── OpenType.java
    │   ├── ShapeGraphicAttribute.java
    │   ├── StyledParagraph.java
    │   ├── TextAttribute.java
    │   ├── TextHitInfo.java
    │   ├── TextJustifier.java
    │   ├── TextLayout.java
    │   ├── TextLine.java
    │   ├── TextMeasurer.java
    │   └── TransformAttribute.java
    ├── geom
    │   ├── AffineTransform.java
    │   ├── Arc2D.java
    │   ├── ArcIterator.java
    │   ├── Area.java
    │   ├── CubicCurve2D.java
    │   ├── CubicIterator.java
    │   ├── Dimension2D.java
    │   ├── Ellipse2D.java
    │   ├── EllipseIterator.java
    │   ├── FlatteningPathIterator.java
    │   ├── GeneralPath.java
    │   ├── IllegalPathStateException.java
    │   ├── Line2D.java
    │   ├── LineIterator.java
    │   ├── NoninvertibleTransformException.java
    │   ├── Path2D.java
    │   ├── PathIterator.java
    │   ├── Point2D.java
    │   ├── QuadCurve2D.java
    │   ├── QuadIterator.java
    │   ├── RectIterator.java
    │   ├── Rectangle2D.java
    │   ├── RectangularShape.java
    │   ├── RoundRectIterator.java
    │   └── RoundRectangle2D.java
    ├── im
    │   ├── InputContext.java
    │   ├── InputMethodHighlight.java
    │   ├── InputMethodRequests.java
    │   ├── InputSubset.java
    │   └── spi
    │       ├── InputMethod.java
    │       ├── InputMethodContext.java
    │       └── InputMethodDescriptor.java
    ├── image
    │   ├── AffineTransformOp.java
    │   ├── AreaAveragingScaleFilter.java
    │   ├── BandCombineOp.java
    │   ├── BandedSampleModel.java
    │   ├── BufferStrategy.java
    │   ├── BufferedImage.java
    │   ├── BufferedImageFilter.java
    │   ├── BufferedImageOp.java
    │   ├── ByteLookupTable.java
    │   ├── ColorConvertOp.java
    │   ├── ColorModel.java
    │   ├── ComponentColorModel.java
    │   ├── ComponentSampleModel.java
    │   ├── ConvolveOp.java
    │   ├── CropImageFilter.java
    │   ├── DataBuffer.java
    │   ├── DataBufferByte.java
    │   ├── DataBufferDouble.java
    │   ├── DataBufferFloat.java
    │   ├── DataBufferInt.java
    │   ├── DataBufferShort.java
    │   ├── DataBufferUShort.java
    │   ├── DirectColorModel.java
    │   ├── FilteredImageSource.java
    │   ├── ImageConsumer.java
    │   ├── ImageFilter.java
    │   ├── ImageObserver.java
    │   ├── ImageProducer.java
    │   ├── ImagingOpException.java
    │   ├── IndexColorModel.java
    │   ├── Kernel.java
    │   ├── LookupOp.java
    │   ├── LookupTable.java
    │   ├── MemoryImageSource.java
    │   ├── MultiPixelPackedSampleModel.java
    │   ├── PackedColorModel.java
    │   ├── PixelGrabber.java
    │   ├── PixelInterleavedSampleModel.java
    │   ├── RGBImageFilter.java
    │   ├── Raster.java
    │   ├── RasterFormatException.java
    │   ├── RasterOp.java
    │   ├── RenderedImage.java
    │   ├── ReplicateScaleFilter.java
    │   ├── RescaleOp.java
    │   ├── SampleModel.java
    │   ├── ShortLookupTable.java
    │   ├── SinglePixelPackedSampleModel.java
    │   ├── TileObserver.java
    │   ├── VolatileImage.java
    │   ├── WritableRaster.java
    │   ├── WritableRenderedImage.java
    │   └── renderable
    │       ├── ContextualRenderedImageFactory.java
    │       ├── ParameterBlock.java
    │       ├── RenderContext.java
    │       ├── RenderableImage.java
    │       ├── RenderableImageOp.java
    │       ├── RenderableImageProducer.java
    │       └── RenderedImageFactory.java
    ├── peer
    │   ├── ButtonPeer.java
    │   ├── CanvasPeer.java
    │   ├── CheckboxMenuItemPeer.java
    │   ├── CheckboxPeer.java
    │   ├── ChoicePeer.java
    │   ├── ComponentPeer.java
    │   ├── ContainerPeer.java
    │   ├── DesktopPeer.java
    │   ├── DialogPeer.java
    │   ├── FileDialogPeer.java
    │   ├── FontPeer.java
    │   ├── FramePeer.java
    │   ├── KeyboardFocusManagerPeer.java
    │   ├── LabelPeer.java
    │   ├── LightweightPeer.java
    │   ├── ListPeer.java
    │   ├── MenuBarPeer.java
    │   ├── MenuComponentPeer.java
    │   ├── MenuItemPeer.java
    │   ├── MenuPeer.java
    │   ├── MouseInfoPeer.java
    │   ├── PanelPeer.java
    │   ├── PopupMenuPeer.java
    │   ├── RobotPeer.java
    │   ├── ScrollPanePeer.java
    │   ├── ScrollbarPeer.java
    │   ├── SystemTrayPeer.java
    │   ├── TextAreaPeer.java
    │   ├── TextComponentPeer.java
    │   ├── TextFieldPeer.java
    │   ├── TrayIconPeer.java
    │   └── WindowPeer.java
    └── print
        ├── Book.java
        ├── PageFormat.java
        ├── Pageable.java
        ├── Paper.java
        ├── Printable.java
        ├── PrinterAbortException.java
        ├── PrinterException.java
        ├── PrinterGraphics.java
        ├── PrinterIOException.java
        └── PrinterJob.java

```