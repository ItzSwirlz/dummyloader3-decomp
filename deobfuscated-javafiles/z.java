// class version 52.0 (52)
// access flags 0x21
// signature Lio/netty/handler/codec/ByteToMessageCodec<Lio/netty/buffer/ByteBuf;>;
// declaration: Z extends io.netty.handler.codec.ByteToMessageCodec<io.netty.buffer.ByteBuf>
public class Z extends io/netty/handler/codec/ByteToMessageCodec {

  // compiled from: 

  ATTRIBUTE Code : unknown

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 10 L0
    ALOAD 0
    INVOKESPECIAL io/netty/handler/codec/ByteToMessageCodec.<init> ()V
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x4
  protected encode(Lio/netty/channel/ChannelHandlerContext;Lio/netty/buffer/ByteBuf;Lio/netty/buffer/ByteBuf;)V throws java/lang/Exception 
    // parameter  channelHandlerContext
    // parameter  byteBuf2
    // parameter  byteBuf3
   L0
    LINENUMBER 14 L0
    ALOAD 3
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readableBytes ()I
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeInt (I)Lio/netty/buffer/ByteBuf;
    POP
   L1
    LINENUMBER 15 L1
    ALOAD 3
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBytes (Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;
    POP
   L2
    LINENUMBER 16 L2
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x4
  // signature (Lio/netty/channel/ChannelHandlerContext;Lio/netty/buffer/ByteBuf;Ljava/util/List<Ljava/lang/Object;>;)V
  // declaration: void decode(io.netty.channel.ChannelHandlerContext, io.netty.buffer.ByteBuf, java.util.List<java.lang.Object>)
  protected decode(Lio/netty/channel/ChannelHandlerContext;Lio/netty/buffer/ByteBuf;Ljava/util/List;)V throws java/lang/Exception 
    // parameter  ctx
    // parameter  in
    // parameter  out
   L0
    LINENUMBER 20 L0
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readableBytes ()I
    ICONST_2
    IF_ICMPGE L1
    RETURN
   L1
    LINENUMBER 21 L1
   FRAME FULL [T T io/netty/buffer/ByteBuf java/util/List] []
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readerIndex ()I
    ISTORE 4
   L2
    LINENUMBER 22 L2
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readInt ()I
    ISTORE 5
   L3
    LINENUMBER 23 L3
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readableBytes ()I
    ILOAD 5
    IF_ICMPGE L4
   L5
    LINENUMBER 24 L5
    ALOAD 2
    ILOAD 4
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readerIndex (I)Lio/netty/buffer/ByteBuf;
    POP
   L6
    LINENUMBER 25 L6
    RETURN
   L4
    LINENUMBER 27 L4
   FRAME APPEND [T I]
    ALOAD 3
    ALOAD 2
    ILOAD 5
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readSlice (I)Lio/netty/buffer/ByteBuf;
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.retain ()Lio/netty/buffer/ByteBuf;
    INVOKEINTERFACE java/util/List.add (Ljava/lang/Object;)Z (itf)
    POP
   L7
    LINENUMBER 28 L7
    RETURN
   L8
    LOCALVARIABLE this LZ; L0 L8 0
    LOCALVARIABLE ctx Lio/netty/channel/ChannelHandlerContext; L0 L8 1
    LOCALVARIABLE in Lio/netty/buffer/ByteBuf; L0 L8 2
    LOCALVARIABLE out Ljava/util/List; L0 L8 3
    // signature Ljava/util/List<Ljava/lang/Object;>;
    // declaration: out extends java.util.List<java.lang.Object>
    MAXSTACK = 3
    MAXLOCALS = 6

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
    INVOKEVIRTUAL Z.a (Lio/netty/channel/ChannelHandlerContext;Lio/netty/buffer/ByteBuf;Lio/netty/buffer/ByteBuf;)V
    RETURN
   L1
    LOCALVARIABLE this LZ; L0 L1 0
    MAXSTACK = 4
    MAXLOCALS = 4
}
