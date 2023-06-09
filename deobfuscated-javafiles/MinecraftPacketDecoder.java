// class version 52.0 (52)
// access flags 0x21
public class MinecraftPacketDecoder extends io/netty/handler/codec/ByteToMessageDecoder {

  // compiled from: 

  ATTRIBUTE Code : unknown

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 11 L0
    ALOAD 0
    INVOKESPECIAL io/netty/handler/codec/ByteToMessageDecoder.<init> ()V
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x4
  // signature (Lio/netty/channel/ChannelHandlerContext;Lio/netty/buffer/ByteBuf;Ljava/util/List<Ljava/lang/Object;>;)V
  // declaration: void decode(io.netty.channel.ChannelHandlerContext, io.netty.buffer.ByteBuf, java.util.List<java.lang.Object>)
  protected decode(Lio/netty/channel/ChannelHandlerContext;Lio/netty/buffer/ByteBuf;Ljava/util/List;)V throws java/lang/Exception 
    // parameter  ctx
    // parameter  in
    // parameter  out
   L0
    LINENUMBER 16 L0
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; (itf)
    INVOKEINTERFACE io/netty/channel/Channel.isActive ()Z (itf)
    IFNE L1
   L2
    LINENUMBER 17 L2
    ALOAD 2
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readableBytes ()I
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.skipBytes (I)Lio/netty/buffer/ByteBuf;
    POP
   L3
    LINENUMBER 18 L3
    RETURN
   L1
    LINENUMBER 20 L1
   FRAME FULL [T io/netty/channel/ChannelHandlerContext io/netty/buffer/ByteBuf java/util/List] []
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.markReaderIndex ()Lio/netty/buffer/ByteBuf;
    POP
   L4
    LINENUMBER 21 L4
    ICONST_3
    NEWARRAY T_BYTE
    ASTORE 4
   L5
    LINENUMBER 22 L5
    ICONST_0
    ISTORE 5
   L6
    LINENUMBER 23 L6
   FRAME APPEND [[B I]
    ILOAD 5
    ALOAD 4
    ARRAYLENGTH
    IF_ICMPGE L7
   L8
    LINENUMBER 24 L8
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.isReadable ()Z
    IFNE L9
   L10
    LINENUMBER 25 L10
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.resetReaderIndex ()Lio/netty/buffer/ByteBuf;
    POP
   L11
    LINENUMBER 26 L11
    RETURN
   L9
    LINENUMBER 28 L9
   FRAME SAME
    ALOAD 4
    ILOAD 5
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readByte ()B
    BASTORE
   L12
    LINENUMBER 29 L12
    ALOAD 4
    ILOAD 5
    BALOAD
    IFLT L13
   L14
    LINENUMBER 30 L14
    ALOAD 4
    INVOKESTATIC io/netty/buffer/Unpooled.wrappedBuffer ([B)Lio/netty/buffer/ByteBuf;
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)I
    ISTORE 6
   L15
    LINENUMBER 31 L15
    ILOAD 6
    IFNE L16
   L17
    LINENUMBER 32 L17
    NEW io/netty/handler/codec/CorruptedFrameException
    DUP
    LDC "Empty Packet!"
    INVOKESPECIAL io/netty/handler/codec/CorruptedFrameException.<init> (Ljava/lang/String;)V
    ATHROW
   L16
    LINENUMBER 34 L16
   FRAME FULL [T io/netty/channel/ChannelHandlerContext io/netty/buffer/ByteBuf java/util/List T T I] []
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readableBytes ()I
    ILOAD 6
    IF_ICMPGE L18
   L19
    LINENUMBER 35 L19
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.resetReaderIndex ()Lio/netty/buffer/ByteBuf;
    POP
   L20
    LINENUMBER 36 L20
    RETURN
   L18
    LINENUMBER 38 L18
   FRAME SAME
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.hasMemoryAddress ()Z
    IFEQ L21
   L22
    LINENUMBER 39 L22
    ALOAD 3
    ALOAD 2
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readerIndex ()I
    ILOAD 6
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.slice (II)Lio/netty/buffer/ByteBuf;
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.retain ()Lio/netty/buffer/ByteBuf;
    INVOKEINTERFACE java/util/List.add (Ljava/lang/Object;)Z (itf)
    POP
   L23
    LINENUMBER 40 L23
    ALOAD 2
    ILOAD 6
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.skipBytes (I)Lio/netty/buffer/ByteBuf;
    POP
    GOTO L24
   L21
    LINENUMBER 43 L21
   FRAME SAME
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/ChannelHandlerContext.alloc ()Lio/netty/buffer/ByteBufAllocator; (itf)
    ILOAD 6
    INVOKEINTERFACE io/netty/buffer/ByteBufAllocator.directBuffer (I)Lio/netty/buffer/ByteBuf; (itf)
    ASTORE 7
   L25
    LINENUMBER 44 L25
    ALOAD 2
    ALOAD 7
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readBytes (Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;
    POP
   L26
    LINENUMBER 45 L26
    ALOAD 3
    ALOAD 7
    INVOKEINTERFACE java/util/List.add (Ljava/lang/Object;)Z (itf)
    POP
   L24
    LINENUMBER 47 L24
   FRAME FULL [] []
    RETURN
   L13
    LINENUMBER 50 L13
   FRAME FULL [T io/netty/channel/ChannelHandlerContext io/netty/buffer/ByteBuf java/util/List [B I] []
    IINC 5 1
    GOTO L6
   L7
    LINENUMBER 53 L7
   FRAME FULL [] []
    NEW io/netty/handler/codec/CorruptedFrameException
    DUP
    LDC "length wider than 21-bit"
    INVOKESPECIAL io/netty/handler/codec/CorruptedFrameException.<init> (Ljava/lang/String;)V
    ATHROW
   L27
    LOCALVARIABLE this LMinecraftPacketDecoder; L0 L27 0
    LOCALVARIABLE ctx Lio/netty/channel/ChannelHandlerContext; L0 L27 1
    LOCALVARIABLE in Lio/netty/buffer/ByteBuf; L0 L27 2
    LOCALVARIABLE out Ljava/util/List; L0 L27 3
    // signature Ljava/util/List<Ljava/lang/Object;>;
    // declaration: out extends java.util.List<java.lang.Object>
    MAXSTACK = 4
    MAXLOCALS = 8
}
