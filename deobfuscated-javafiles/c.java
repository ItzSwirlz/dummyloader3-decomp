// class version 52.0 (52)
// access flags 0x21
// signature Lio/netty/handler/codec/MessageToMessageDecoder<Lio/netty/buffer/ByteBuf;>;
// declaration: C extends io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf>
public class C extends io/netty/handler/codec/MessageToMessageDecoder {

  // compiled from: 

  ATTRIBUTE Code : unknown

  // access flags 0x12
  private final Lz; a

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 10 L0
    ALOAD 0
    INVOKESPECIAL io/netty/handler/codec/MessageToMessageDecoder.<init> ()V
   L1
    LINENUMBER 13 L1
    ALOAD 0
    NEW A
    DUP
    INVOKESPECIAL A.<init> ()V
    PUTFIELD C.a : Lz;
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 1

  // access flags 0x1
  public handlerAdded(Lio/netty/channel/ChannelHandlerContext;)V throws java/lang/Exception 
    // parameter  ctx
   L0
    LINENUMBER 18 L0
    ALOAD 0
    GETFIELD C.a : Lz;
    ICONST_0
    ICONST_0
    INVOKEINTERFACE z.a (ZI)V (itf)
   L1
    LINENUMBER 19 L1
    RETURN
   L2
    LOCALVARIABLE this LC; L0 L2 0
    LOCALVARIABLE ctx Lio/netty/channel/ChannelHandlerContext; L0 L2 1
    MAXSTACK = 3
    MAXLOCALS = 2

  // access flags 0x1
  public handlerRemoved(Lio/netty/channel/ChannelHandlerContext;)V throws java/lang/Exception 
    // parameter  ctx
   L0
    LINENUMBER 24 L0
    ALOAD 0
    GETFIELD C.a : Lz;
    INVOKEINTERFACE z.a ()V (itf)
   L1
    LINENUMBER 25 L1
    RETURN
   L2
    LOCALVARIABLE this LC; L0 L2 0
    LOCALVARIABLE ctx Lio/netty/channel/ChannelHandlerContext; L0 L2 1
    MAXSTACK = 1
    MAXLOCALS = 2

  // access flags 0x4
  // signature (Lio/netty/channel/ChannelHandlerContext;Lio/netty/buffer/ByteBuf;Ljava/util/List<Ljava/lang/Object;>;)V
  // declaration: void decode(io.netty.channel.ChannelHandlerContext, io.netty.buffer.ByteBuf, java.util.List<java.lang.Object>)
  protected decode(Lio/netty/channel/ChannelHandlerContext;Lio/netty/buffer/ByteBuf;Ljava/util/List;)V throws java/lang/Exception 
    // parameter  channelHandlerContext
    // parameter  byteBuf
    // parameter  list
    TRYCATCHBLOCK L0 L1 L2 null
    TRYCATCHBLOCK L2 L3 L2 null
   L4
    LINENUMBER 30 L4
    ALOAD 2
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)I
    ISTORE 4
   L5
    LINENUMBER 31 L5
    ILOAD 4
    IFNE L6
   L7
    LINENUMBER 33 L7
    ALOAD 3
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.retain ()Lio/netty/buffer/ByteBuf;
    INVOKEINTERFACE java/util/List.add (Ljava/lang/Object;)Z (itf)
    POP
    GOTO L8
   L6
    LINENUMBER 36 L6
   FRAME SAME
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/ChannelHandlerContext.alloc ()Lio/netty/buffer/ByteBufAllocator; (itf)
    INVOKEINTERFACE io/netty/buffer/ByteBufAllocator.directBuffer ()Lio/netty/buffer/ByteBuf; (itf)
    ASTORE 5
   L0
    LINENUMBER 40 L0
    ALOAD 0
    GETFIELD C.a : Lz;
    ALOAD 2
    ALOAD 5
    INVOKEINTERFACE z.a (Lio/netty/buffer/ByteBuf;Lio/netty/buffer/ByteBuf;)V (itf)
   L9
    LINENUMBER 41 L9
    ALOAD 3
    ALOAD 5
    INVOKEINTERFACE java/util/List.add (Ljava/lang/Object;)Z (itf)
    POP
   L10
    LINENUMBER 42 L10
    ACONST_NULL
    ASTORE 5
   L1
    LINENUMBER 45 L1
    ALOAD 5
    IFNULL L8
   L11
    LINENUMBER 47 L11
    ALOAD 5
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.release ()Z
    POP
    GOTO L8
   L2
    LINENUMBER 45 L2
   FRAME FULL [T T T T T io/netty/buffer/ByteBuf] [java/lang/Throwable]
    ASTORE 6
   L3
    ALOAD 5
    IFNULL L12
   L13
    LINENUMBER 47 L13
    ALOAD 5
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.release ()Z
    POP
   L12
    LINENUMBER 49 L12
   FRAME FULL [T T T T T T java/lang/Throwable] []
    ALOAD 6
    ATHROW
   L8
    LINENUMBER 51 L8
   FRAME FULL [] []
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 7

  // access flags 0x1044
  protected synthetic bridge decode(Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Ljava/util/List;)V throws java/lang/Exception 
    // parameter  channelHandlerContext
    // parameter  object
    // parameter  list
   L0
    LINENUMBER 10 L0
    ALOAD 0
    ALOAD 1
    ALOAD 2
    CHECKCAST io/netty/buffer/ByteBuf
    ALOAD 3
    INVOKEVIRTUAL C.a (Lio/netty/channel/ChannelHandlerContext;Lio/netty/buffer/ByteBuf;Ljava/util/List;)V
    RETURN
   L1
    LOCALVARIABLE this LC; L0 L1 0
    MAXSTACK = 4
    MAXLOCALS = 4
}
