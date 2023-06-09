// class version 52.0 (52)
// access flags 0x21
public class f extends e {

  // compiled from: 

  ATTRIBUTE Code : unknown
  // access flags 0x0
  INNERCLASS f$1 null null
  // access flags 0x0
  INNERCLASS f$2 null null

  // access flags 0x12
  // signature Lio/netty/util/concurrent/FastThreadLocal<Lio/netty/buffer/ByteBuf;>;
  // declaration: a extends io.netty.util.concurrent.FastThreadLocal<io.netty.buffer.ByteBuf>
  private final Lio/netty/util/concurrent/FastThreadLocal; a

  // access flags 0x12
  // signature Lio/netty/util/concurrent/FastThreadLocal<Lio/netty/buffer/ByteBuf;>;
  // declaration: b extends io.netty.util.concurrent.FastThreadLocal<io.netty.buffer.ByteBuf>
  private final Lio/netty/util/concurrent/FastThreadLocal; b

  // access flags 0x0
  Ljava/lang/String; a

  // access flags 0x0
  Ljava/security/SecureRandom; a

  // access flags 0x0
  a(I)Ljava/lang/String;
    // parameter  integer
   L0
    LINENUMBER 47 L0
    NEW java/lang/StringBuilder
    DUP
    ILOAD 1
    INVOKESPECIAL java/lang/StringBuilder.<init> (I)V
    ASTORE 2
   L1
    LINENUMBER 48 L1
    ICONST_0
    ISTORE 3
   L2
   FRAME APPEND [java/lang/StringBuilder I]
    ILOAD 3
    ILOAD 1
    IF_ICMPGE L3
   L4
    LINENUMBER 49 L4
    ALOAD 2
    ALOAD 0
    GETFIELD f.a : Ljava/lang/String;
    ALOAD 0
    GETFIELD f.a : Ljava/security/SecureRandom;
    ALOAD 0
    GETFIELD f.a : Ljava/lang/String;
    INVOKEVIRTUAL java/lang/String.length ()I
    INVOKEVIRTUAL java/security/SecureRandom.nextInt (I)I
    INVOKEVIRTUAL java/lang/String.charAt (I)C
    INVOKEVIRTUAL java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
    POP
   L5
    LINENUMBER 48 L5
    IINC 3 1
    GOTO L2
   L3
    LINENUMBER 50 L3
   FRAME FULL [T T java/lang/StringBuilder] []
    ALOAD 2
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ARETURN
    MAXSTACK = 4
    MAXLOCALS = 4

  // access flags 0x1
  public <init>(Ljava/lang/String;I)V
    // parameter  string
    // parameter  integer
   L0
    LINENUMBER 56 L0
    ALOAD 0
    ALOAD 1
    ILOAD 2
    INVOKESPECIAL e.<init> (Ljava/lang/String;I)V
   L1
    LINENUMBER 19 L1
    ALOAD 0
    NEW f$1
    DUP
    ALOAD 0
    INVOKESPECIAL f$1.<init> (Lf;)V
    PUTFIELD f.a : Lio/netty/util/concurrent/FastThreadLocal;
   L2
    LINENUMBER 31 L2
    ALOAD 0
    NEW f$2
    DUP
    ALOAD 0
    INVOKESPECIAL f$2.<init> (Lf;)V
    PUTFIELD f.b : Lio/netty/util/concurrent/FastThreadLocal;
   L3
    LINENUMBER 43 L3
    ALOAD 0
    LDC "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_.-"
    PUTFIELD f.a : Ljava/lang/String;
   L4
    LINENUMBER 44 L4
    ALOAD 0
    NEW java/security/SecureRandom
    DUP
    INVOKESPECIAL java/security/SecureRandom.<init> ()V
    PUTFIELD f.a : Ljava/security/SecureRandom;
   L5
    LINENUMBER 57 L5
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 3

  // access flags 0x1
  public a(Lio/netty/channel/Channel;)V
    // parameter  channel
   L0
    LINENUMBER 61 L0
    ALOAD 1
    ALOAD 0
    GETFIELD f.a : Lio/netty/util/concurrent/FastThreadLocal;
    INVOKEVIRTUAL io/netty/util/concurrent/FastThreadLocal.get ()Ljava/lang/Object;
    CHECKCAST io/netty/buffer/ByteBuf
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.resetReaderIndex ()Lio/netty/buffer/ByteBuf;
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.retain ()Lio/netty/buffer/ByteBuf;
    INVOKEINTERFACE io/netty/channel/Channel.write (Ljava/lang/Object;)Lio/netty/channel/ChannelFuture; (itf)
    POP
   L1
    LINENUMBER 62 L1
    ALOAD 1
    ALOAD 0
    GETFIELD f.b : Lio/netty/util/concurrent/FastThreadLocal;
    INVOKEVIRTUAL io/netty/util/concurrent/FastThreadLocal.get ()Ljava/lang/Object;
    CHECKCAST io/netty/buffer/ByteBuf
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.resetReaderIndex ()Lio/netty/buffer/ByteBuf;
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.retain ()Lio/netty/buffer/ByteBuf;
    INVOKEINTERFACE io/netty/channel/Channel.writeAndFlush (Ljava/lang/Object;)Lio/netty/channel/ChannelFuture; (itf)
    POP
   L2
    LINENUMBER 63 L2
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public b(Lio/netty/channel/Channel;)V
    // parameter  channel
   L0
    LINENUMBER 67 L0
    RETURN
    MAXSTACK = 0
    MAXLOCALS = 2
}
