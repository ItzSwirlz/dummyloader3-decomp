// class version 52.0 (52)
// access flags 0x21
// signature Lio/netty/handler/codec/MessageToByteEncoder<Lio/netty/buffer/ByteBuf;>;
// declaration: B extends io.netty.handler.codec.MessageToByteEncoder<io.netty.buffer.ByteBuf>
public class B extends io/netty/handler/codec/MessageToByteEncoder {

  // compiled from: 

  ATTRIBUTE Code : unknown

  // access flags 0x12
  private final Lz; a

  // access flags 0x2
  private I a

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 10 L0
    ALOAD 0
    INVOKESPECIAL io/netty/handler/codec/MessageToByteEncoder.<init> ()V
   L1
    LINENUMBER 13 L1
    ALOAD 0
    NEW A
    DUP
    INVOKESPECIAL A.<init> ()V
    PUTFIELD B.a : Lz;
   L2
    LINENUMBER 14 L2
    ALOAD 0
    SIPUSH 256
    PUTFIELD B.a : I
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 1

  // access flags 0x1
  public a(I)V
    // parameter  integer
   L0
    LINENUMBER 17 L0
    ALOAD 0
    ILOAD 1
    PUTFIELD B.a : I
   L1
    LINENUMBER 18 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public handlerAdded(Lio/netty/channel/ChannelHandlerContext;)V throws java/lang/Exception 
    // parameter  ctx
   L0
    LINENUMBER 24 L0
    ALOAD 0
    GETFIELD B.a : Lz;
    ICONST_1
    ICONST_M1
    INVOKEINTERFACE z.a (ZI)V (itf)
   L1
    LINENUMBER 25 L1
    RETURN
   L2
    LOCALVARIABLE this LB; L0 L2 0
    LOCALVARIABLE ctx Lio/netty/channel/ChannelHandlerContext; L0 L2 1
    MAXSTACK = 3
    MAXLOCALS = 2

  // access flags 0x1
  public handlerRemoved(Lio/netty/channel/ChannelHandlerContext;)V throws java/lang/Exception 
    // parameter  ctx
   L0
    LINENUMBER 30 L0
    ALOAD 0
    GETFIELD B.a : Lz;
    INVOKEINTERFACE z.a ()V (itf)
   L1
    LINENUMBER 31 L1
    RETURN
   L2
    LOCALVARIABLE this LB; L0 L2 0
    LOCALVARIABLE ctx Lio/netty/channel/ChannelHandlerContext; L0 L2 1
    MAXSTACK = 1
    MAXLOCALS = 2

  // access flags 0x4
  protected encode(Lio/netty/channel/ChannelHandlerContext;Lio/netty/buffer/ByteBuf;Lio/netty/buffer/ByteBuf;)V throws java/lang/Exception 
    // parameter  channelHandlerContext
    // parameter  byteBuf2
    // parameter  byteBuf3
   L0
    LINENUMBER 36 L0
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readableBytes ()I
    ISTORE 4
   L1
    LINENUMBER 37 L1
    ILOAD 4
    ALOAD 0
    GETFIELD B.a : I
    IF_ICMPGE L2
   L3
    LINENUMBER 39 L3
    ICONST_0
    ALOAD 3
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
   L4
    LINENUMBER 40 L4
    ALOAD 3
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBytes (Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;
    POP
    GOTO L5
   L2
    LINENUMBER 43 L2
   FRAME FULL [B T io/netty/buffer/ByteBuf io/netty/buffer/ByteBuf I] []
    ILOAD 4
    ALOAD 3
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
   L6
    LINENUMBER 45 L6
    ALOAD 0
    GETFIELD B.a : Lz;
    ALOAD 2
    ALOAD 3
    INVOKEINTERFACE z.a (Lio/netty/buffer/ByteBuf;Lio/netty/buffer/ByteBuf;)V (itf)
   L5
    LINENUMBER 47 L5
   FRAME FULL [] []
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 5

  // access flags 0x1044
  protected synthetic bridge encode(Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/buffer/ByteBuf;)V throws java/lang/Exception 
    // parameter  channelHandlerContext
    // parameter  object
    // parameter  byteBuf
   L0
    LINENUMBER 10 L0
    ALOAD 0
    ALOAD 1
    ALOAD 2
    CHECKCAST io/netty/buffer/ByteBuf
    ALOAD 3
    INVOKEVIRTUAL B.a (Lio/netty/channel/ChannelHandlerContext;Lio/netty/buffer/ByteBuf;Lio/netty/buffer/ByteBuf;)V
    RETURN
   L1
    LOCALVARIABLE this LB; L0 L1 0
    MAXSTACK = 4
    MAXLOCALS = 4
}
