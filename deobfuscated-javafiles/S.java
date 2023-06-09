// class version 52.0 (52)
// access flags 0x21
public class S {

  // compiled from: 

  ATTRIBUTE Code : unknown
  // access flags 0x0
  INNERCLASS S$1 null null
  // access flags 0x0
  INNERCLASS S$2 null null
  // access flags 0x0
  INNERCLASS S$3 null null
  // access flags 0x19
  public final static INNERCLASS java/lang/invoke/MethodHandles$Lookup java/lang/invoke/MethodHandles Lookup

  // access flags 0x19
  // signature Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/Integer;LS;>;
  // declaration: a extends java.util.concurrent.ConcurrentHashMap<java.lang.Integer, S>
  public final static Ljava/util/concurrent/ConcurrentHashMap; a

  // access flags 0x1
  public Z a

  // access flags 0x12
  private final Le; a

  // access flags 0x11
  public final I a

  // access flags 0x11
  public final I b

  // access flags 0x11
  public final I c

  // access flags 0x2
  private La; a

  // access flags 0x12
  private final Lio/netty/channel/ChannelFutureListener; a

  // access flags 0x1
  public <init>(La;ILe;II)V
    // parameter  a
    // parameter  integer2
    // parameter  e
    // parameter  integer4
    // parameter  integer5
   L0
    LINENUMBER 28 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
   L1
    LINENUMBER 21 L1
    ALOAD 0
    ICONST_1
    PUTFIELD S.a : Z
   L2
    LINENUMBER 78 L2
    ALOAD 0
    NEW S$1
    DUP
    ALOAD 0
    INVOKESPECIAL S$1.<init> (LS;)V
    PUTFIELD S.a : Lio/netty/channel/ChannelFutureListener;
   L3
    LINENUMBER 29 L3
    ALOAD 0
    ALOAD 1
    PUTFIELD S.a : La;
   L4
    LINENUMBER 30 L4
    ALOAD 0
    ALOAD 3
    PUTFIELD S.a : Le;
   L5
    LINENUMBER 31 L5
    ALOAD 0
    ILOAD 4
    PUTFIELD S.a : I
   L6
    LINENUMBER 32 L6
    ALOAD 0
    ILOAD 5
    PUTFIELD S.b : I
   L7
    LINENUMBER 33 L7
    ALOAD 0
    ILOAD 2
    PUTFIELD S.c : I
   L8
    LINENUMBER 34 L8
    ALOAD 3
    ALOAD 0
    PUTFIELD e.a : LS;
   L9
    LINENUMBER 35 L9
    GETSTATIC S.a : Ljava/util/concurrent/ConcurrentHashMap;
    ILOAD 2
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    ALOAD 0
    INVOKEVIRTUAL java/util/concurrent/ConcurrentHashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    POP
   L10
    LINENUMBER 36 L10
    ALOAD 0
    INVOKEVIRTUAL S.a ()V
   L11
    LINENUMBER 37 L11
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 6

  // access flags 0x1
  public a()V
   L0
    LINENUMBER 40 L0
    ALOAD 0
    ALOAD 0
    GETFIELD S.a : Le;
    INVOKESPECIAL S.a (Le;)Lio/netty/bootstrap/Bootstrap;
    ASTORE 1
   L1
    LINENUMBER 41 L1
    NEW java/lang/Thread
    DUP
    ALOAD 0
    ALOAD 1
    INVOKEDYNAMIC run(LS;Lio/netty/bootstrap/Bootstrap;)Ljava/lang/Runnable; [
      // handle kind 0x6 : INVOKESTATIC
      java/lang/invoke/LambdaMetafactory.metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
      // arguments:
      ()V, 
      // handle kind 0x7 : INVOKESPECIAL
      S.a(Lio/netty/bootstrap/Bootstrap;)V, 
      ()V
    ]
    INVOKESPECIAL java/lang/Thread.<init> (Ljava/lang/Runnable;)V
   L2
    LINENUMBER 75 L2
    INVOKEVIRTUAL java/lang/Thread.start ()V
   L3
    LINENUMBER 76 L3
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 2

  // access flags 0x9
  public static a([Ljava/lang/String;)V
    // parameter  arr
    TRYCATCHBLOCK L0 L1 L2 java/lang/InterruptedException
   L3
    LINENUMBER 95 L3
    NEW m
    DUP
    LDC "127.0.0.1:25577"
    SIPUSH 760
    INVOKESPECIAL m.<init> (Ljava/lang/String;I)V
    ASTORE 1
   L4
    LINENUMBER 96 L4
    NEW io/netty/bootstrap/Bootstrap
    DUP
    INVOKESPECIAL io/netty/bootstrap/Bootstrap.<init> ()V
    LDC Lio/netty/channel/socket/nio/NioSocketChannel;.class
    INVOKEVIRTUAL io/netty/bootstrap/Bootstrap.channel (Ljava/lang/Class;)Lio/netty/bootstrap/AbstractBootstrap;
    CHECKCAST io/netty/bootstrap/Bootstrap
    NEW io/netty/channel/nio/NioEventLoopGroup
    DUP
    ICONST_0
    INVOKESPECIAL io/netty/channel/nio/NioEventLoopGroup.<init> (I)V
    INVOKEVIRTUAL io/netty/bootstrap/Bootstrap.group (Lio/netty/channel/EventLoopGroup;)Lio/netty/bootstrap/AbstractBootstrap;
    CHECKCAST io/netty/bootstrap/Bootstrap
    GETSTATIC io/netty/channel/ChannelOption.TCP_NODELAY : Lio/netty/channel/ChannelOption;
    ICONST_1
   L5
    LINENUMBER 97 L5
    INVOKESTATIC java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
    INVOKEVIRTUAL io/netty/bootstrap/Bootstrap.option (Lio/netty/channel/ChannelOption;Ljava/lang/Object;)Lio/netty/bootstrap/AbstractBootstrap;
    CHECKCAST io/netty/bootstrap/Bootstrap
    GETSTATIC io/netty/channel/ChannelOption.AUTO_READ : Lio/netty/channel/ChannelOption;
    ICONST_0
    INVOKESTATIC java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
    INVOKEVIRTUAL io/netty/bootstrap/Bootstrap.option (Lio/netty/channel/ChannelOption;Ljava/lang/Object;)Lio/netty/bootstrap/AbstractBootstrap;
    CHECKCAST io/netty/bootstrap/Bootstrap
    NEW S$2
    DUP
    ALOAD 1
    INVOKESPECIAL S$2.<init> (Lm;)V
   L6
    LINENUMBER 98 L6
    INVOKEVIRTUAL io/netty/bootstrap/Bootstrap.handler (Lio/netty/channel/ChannelHandler;)Lio/netty/bootstrap/AbstractBootstrap;
    CHECKCAST io/netty/bootstrap/Bootstrap
    ASTORE 2
   L7
    LINENUMBER 107 L7
    ALOAD 2
    ALOAD 1
    GETFIELD m.a : LMinecraftIPAddressResolver;
    INVOKEVIRTUAL MinecraftIPAddressResolver.a ()Ljava/net/InetSocketAddress;
    INVOKEVIRTUAL io/netty/bootstrap/Bootstrap.connect (Ljava/net/SocketAddress;)Lio/netty/channel/ChannelFuture;
    ALOAD 1
    INVOKEDYNAMIC operationComplete(Lm;)Lio/netty/channel/ChannelFutureListener; [
      // handle kind 0x6 : INVOKESTATIC
      java/lang/invoke/LambdaMetafactory.metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
      // arguments:
      (Lio/netty/util/concurrent/Future;)V, 
      // handle kind 0x6 : INVOKESTATIC
      S.a(Lm;Lio/netty/channel/ChannelFuture;)V, 
      (Lio/netty/channel/ChannelFuture;)V
    ]
    INVOKEINTERFACE io/netty/channel/ChannelFuture.addListener (Lio/netty/util/concurrent/GenericFutureListener;)Lio/netty/channel/ChannelFuture; (itf)
    POP
   L0
    LINENUMBER 115 L0
    LDC 10000
    INVOKESTATIC java/lang/Thread.sleep (J)V
   L1
    LINENUMBER 118 L1
    GOTO L8
   L2
    LINENUMBER 116 L2
   FRAME FULL [] [java/lang/InterruptedException]
    ASTORE 3
   L9
    LINENUMBER 117 L9
    NEW java/lang/RuntimeException
    DUP
    ALOAD 3
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/Throwable;)V
    ATHROW
   L8
    LINENUMBER 120 L8
   FRAME SAME
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 4

  // access flags 0x2
  private a(Le;)Lio/netty/bootstrap/Bootstrap;
    // parameter  e
   L0
    LINENUMBER 123 L0
    NEW io/netty/bootstrap/Bootstrap
    DUP
    INVOKESPECIAL io/netty/bootstrap/Bootstrap.<init> ()V
    LDC Lio/netty/channel/socket/nio/NioSocketChannel;.class
    INVOKEVIRTUAL io/netty/bootstrap/Bootstrap.channel (Ljava/lang/Class;)Lio/netty/bootstrap/AbstractBootstrap;
    CHECKCAST io/netty/bootstrap/Bootstrap
    ALOAD 0
    GETFIELD S.a : La;
    GETFIELD a.a : Lio/netty/channel/nio/NioEventLoopGroup;
    INVOKEVIRTUAL io/netty/bootstrap/Bootstrap.group (Lio/netty/channel/EventLoopGroup;)Lio/netty/bootstrap/AbstractBootstrap;
    CHECKCAST io/netty/bootstrap/Bootstrap
    GETSTATIC io/netty/channel/ChannelOption.TCP_NODELAY : Lio/netty/channel/ChannelOption;
    ICONST_1
   L1
    LINENUMBER 124 L1
    INVOKESTATIC java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
    INVOKEVIRTUAL io/netty/bootstrap/Bootstrap.option (Lio/netty/channel/ChannelOption;Ljava/lang/Object;)Lio/netty/bootstrap/AbstractBootstrap;
    CHECKCAST io/netty/bootstrap/Bootstrap
    GETSTATIC io/netty/channel/ChannelOption.AUTO_READ : Lio/netty/channel/ChannelOption;
    ALOAD 1
    INSTANCEOF MinecraftBot2
    INVOKESTATIC java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
    INVOKEVIRTUAL io/netty/bootstrap/Bootstrap.option (Lio/netty/channel/ChannelOption;Ljava/lang/Object;)Lio/netty/bootstrap/AbstractBootstrap;
    CHECKCAST io/netty/bootstrap/Bootstrap
    NEW S$3
    DUP
    ALOAD 0
    ALOAD 1
    INVOKESPECIAL S$3.<init> (LS;Le;)V
   L2
    LINENUMBER 125 L2
    INVOKEVIRTUAL io/netty/bootstrap/Bootstrap.handler (Lio/netty/channel/ChannelHandler;)Lio/netty/bootstrap/AbstractBootstrap;
    CHECKCAST io/netty/bootstrap/Bootstrap
   L3
    LINENUMBER 123 L3
    ARETURN
    MAXSTACK = 5
    MAXLOCALS = 2

  // access flags 0x100A
  private static synthetic a(Lm;Lio/netty/channel/ChannelFuture;)V throws java/lang/Exception 
    // parameter  m
    // parameter  channelFuture
   L0
    LINENUMBER 108 L0
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/ChannelFuture.isSuccess ()Z (itf)
    IFEQ L1
   L2
    LINENUMBER 109 L2
    ALOAD 0
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/ChannelFuture.channel ()Lio/netty/channel/Channel; (itf)
    INVOKEVIRTUAL m.a (Lio/netty/channel/Channel;)V
    GOTO L3
   L1
    LINENUMBER 111 L1
   FRAME FULL [T io/netty/channel/ChannelFuture] []
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/ChannelFuture.cause ()Ljava/lang/Throwable; (itf)
    INVOKEVIRTUAL java/lang/Throwable.printStackTrace ()V
   L3
    LINENUMBER 113 L3
   FRAME CHOP 2
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1002
  private synthetic a(Lio/netty/bootstrap/Bootstrap;)V
    // parameter  bootstrap
    TRYCATCHBLOCK L0 L1 L2 java/lang/InterruptedException
    TRYCATCHBLOCK L3 L4 L5 java/lang/OutOfMemoryError
    TRYCATCHBLOCK L6 L7 L5 java/lang/OutOfMemoryError
   L3
    LINENUMBER 43 L3
    INVOKESTATIC java/lang/System.currentTimeMillis ()J
    GETSTATIC java/util/concurrent/TimeUnit.SECONDS : Ljava/util/concurrent/TimeUnit;
    ALOAD 0
    GETFIELD S.a : I
    I2L
    INVOKEVIRTUAL java/util/concurrent/TimeUnit.toMillis (J)J
    LADD
    LSTORE 2
   L8
    LINENUMBER 44 L8
    ALOAD 0
    GETFIELD S.a : Le;
    GETFIELD e.a : LMinecraftIPAddressResolver;
    INVOKEVIRTUAL MinecraftIPAddressResolver.a ()Ljava/net/InetSocketAddress;
    ASTORE 4
   L9
    LINENUMBER 45 L9
    ALOAD 0
    GETFIELD S.b : I
    IFNE L6
   L4
    LINENUMBER 46 L4
    RETURN
   L6
    LINENUMBER 48 L6
   FRAME APPEND [J java/net/InetSocketAddress]
    ALOAD 4
    INVOKEVIRTUAL java/net/InetSocketAddress.getPort ()I
    IFNE L10
    ICONST_1
    GOTO L11
   L10
   FRAME SAME
    ICONST_0
   L11
   FRAME SAME1 I
    ISTORE 5
   L12
    LINENUMBER 49 L12
   FRAME APPEND [I]
    ALOAD 0
    GETFIELD S.a : Z
    IFEQ L13
    INVOKESTATIC java/lang/System.currentTimeMillis ()J
    LLOAD 2
    LCMP
    IFGT L13
   L14
    LINENUMBER 51 L14
    ILOAD 5
    IFEQ L15
   L16
    LINENUMBER 52 L16
    NEW java/net/InetSocketAddress
    DUP
    ALOAD 4
    INVOKEVIRTUAL java/net/InetSocketAddress.getAddress ()Ljava/net/InetAddress;
    INVOKESTATIC io/netty/util/internal/ThreadLocalRandom.current ()Lio/netty/util/internal/ThreadLocalRandom;
    ICONST_1
    LDC 65534
    INVOKEVIRTUAL io/netty/util/internal/ThreadLocalRandom.nextInt (II)I
    INVOKESPECIAL java/net/InetSocketAddress.<init> (Ljava/net/InetAddress;I)V
    ASTORE 4
   L15
    LINENUMBER 56 L15
   FRAME SAME
    ALOAD 0
    GETFIELD S.b : I
    ICONST_M1
    IF_ICMPNE L17
   L18
    LINENUMBER 57 L18
    ALOAD 1
    ALOAD 4
    INVOKEVIRTUAL io/netty/bootstrap/Bootstrap.connect (Ljava/net/SocketAddress;)Lio/netty/channel/ChannelFuture;
    ALOAD 0
    GETFIELD S.a : Lio/netty/channel/ChannelFutureListener;
    INVOKEINTERFACE io/netty/channel/ChannelFuture.addListener (Lio/netty/util/concurrent/GenericFutureListener;)Lio/netty/channel/ChannelFuture; (itf)
    INVOKEINTERFACE io/netty/channel/ChannelFuture.syncUninterruptibly ()Lio/netty/channel/ChannelFuture; (itf)
    POP
    GOTO L12
   L17
    LINENUMBER 59 L17
   FRAME SAME
    ALOAD 1
    ALOAD 4
    INVOKEVIRTUAL io/netty/bootstrap/Bootstrap.connect (Ljava/net/SocketAddress;)Lio/netty/channel/ChannelFuture;
    ALOAD 0
    GETFIELD S.a : Lio/netty/channel/ChannelFutureListener;
    INVOKEINTERFACE io/netty/channel/ChannelFuture.addListener (Lio/netty/util/concurrent/GenericFutureListener;)Lio/netty/channel/ChannelFuture; (itf)
    POP
   L19
    LINENUMBER 60 L19
    ALOAD 0
    GETFIELD S.b : I
    IFLE L12
   L0
    LINENUMBER 62 L0
    ALOAD 0
    GETFIELD S.b : I
    I2L
    INVOKESTATIC java/lang/Thread.sleep (J)V
   L1
    LINENUMBER 65 L1
    GOTO L12
   L2
    LINENUMBER 63 L2
   FRAME SAME1 java/lang/InterruptedException
    ASTORE 6
   L20
    LINENUMBER 64 L20
    ALOAD 6
    INVOKEVIRTUAL java/lang/InterruptedException.printStackTrace ()V
   L21
    LINENUMBER 65 L21
    GOTO L12
   L13
    LINENUMBER 71 L13
   FRAME FULL [S] []
    GETSTATIC S.a : Ljava/util/concurrent/ConcurrentHashMap;
    ALOAD 0
    GETFIELD S.c : I
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    INVOKEVIRTUAL java/util/concurrent/ConcurrentHashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
    POP
   L7
    LINENUMBER 74 L7
    GOTO L22
   L5
    LINENUMBER 72 L5
   FRAME FULL [] [java/lang/OutOfMemoryError]
    ASTORE 2
   L23
    LINENUMBER 73 L23
    INVOKESTATIC java/lang/System.gc ()V
   L22
    LINENUMBER 75 L22
   FRAME SAME
    RETURN
    MAXSTACK = 6
    MAXLOCALS = 7

  // access flags 0x1008
  static synthetic a(LS;)Le;
    // parameter  s
   L0
    LINENUMBER 16 L0
    ALOAD 0
    GETFIELD S.a : Le;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x8
  static <clinit>()V
   L0
    LINENUMBER 18 L0
    NEW java/util/concurrent/ConcurrentHashMap
    DUP
    INVOKESPECIAL java/util/concurrent/ConcurrentHashMap.<init> ()V
    PUTSTATIC S.a : Ljava/util/concurrent/ConcurrentHashMap;
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 0
}
