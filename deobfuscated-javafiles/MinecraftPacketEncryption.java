// class version 52.0 (52)
// access flags 0x21
public class MinecraftPacketEncryption implements v {

  // compiled from: 

  ATTRIBUTE Code : unknown
  // access flags 0xA
  private static INNERCLASS MinecraftPacketEncryption$a MinecraftPacketEncryption a
  // access flags 0x1008
  static synthetic INNERCLASS MinecraftPacketEncryption$1 null null

  // access flags 0x12
  private final Ljavax/crypto/Cipher; a

  // access flags 0x1A
  // signature Ljava/lang/ThreadLocal<[B>;
  // declaration: a extends java.lang.ThreadLocal<byte[]>
  private final static Ljava/lang/ThreadLocal; a

  // access flags 0x1A
  // signature Ljava/lang/ThreadLocal<[B>;
  // declaration: b extends java.lang.ThreadLocal<byte[]>
  private final static Ljava/lang/ThreadLocal; b

  // access flags 0x1
  public <init>()V
    TRYCATCHBLOCK L0 L1 L2 java/security/GeneralSecurityException
   L3
    LINENUMBER 29 L3
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
   L0
    LINENUMBER 32 L0
    ALOAD 0
    LDC "AES/CFB8/NoPadding"
    INVOKESTATIC javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
    PUTFIELD MinecraftPacketEncryption.a : Ljavax/crypto/Cipher;
   L1
    LINENUMBER 36 L1
    GOTO L4
   L2
    LINENUMBER 33 L2
   FRAME FULL [] [java/security/GeneralSecurityException]
    ASTORE 1
   L5
    LINENUMBER 35 L5
    NEW java/lang/RuntimeException
    DUP
    ALOAD 1
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/Throwable;)V
    ATHROW
   L4
    LINENUMBER 37 L4
   FRAME SAME
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 2

  // access flags 0x1
  public a(ZLjavax/crypto/SecretKey;)V throws java/security/GeneralSecurityException 
    // parameter  boolean1
    // parameter  secretKey
   L0
    LINENUMBER 42 L0
    ILOAD 1
    IFEQ L1
    ICONST_1
    GOTO L2
   L1
   FRAME FULL [MinecraftPacketEncryption T javax/crypto/SecretKey] []
    ICONST_2
   L2
   FRAME SAME1 I
    ISTORE 3
   L3
    LINENUMBER 43 L3
    ALOAD 0
    GETFIELD MinecraftPacketEncryption.a : Ljavax/crypto/Cipher;
    ILOAD 3
    ALOAD 2
    NEW javax/crypto/spec/IvParameterSpec
    DUP
    ALOAD 2
    INVOKEINTERFACE javax/crypto/SecretKey.getEncoded ()[B (itf)
    INVOKESPECIAL javax/crypto/spec/IvParameterSpec.<init> ([B)V
    INVOKEVIRTUAL javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
   L4
    LINENUMBER 44 L4
    RETURN
    MAXSTACK = 6
    MAXLOCALS = 4

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;Lio/netty/buffer/ByteBuf;)V throws javax/crypto/ShortBufferException 
    // parameter  byteBuf1
    // parameter  byteBuf2
   L0
    LINENUMBER 49 L0
    ALOAD 1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readableBytes ()I
    ISTORE 3
   L1
    LINENUMBER 50 L1
    ALOAD 0
    ALOAD 1
    INVOKESPECIAL MinecraftPacketEncryption.a (Lio/netty/buffer/ByteBuf;)[B
    ASTORE 4
   L2
    LINENUMBER 52 L2
    GETSTATIC MinecraftPacketEncryption.b : Ljava/lang/ThreadLocal;
    INVOKEVIRTUAL java/lang/ThreadLocal.get ()Ljava/lang/Object;
    CHECKCAST [B
    ASTORE 5
   L3
    LINENUMBER 53 L3
    ALOAD 0
    GETFIELD MinecraftPacketEncryption.a : Ljavax/crypto/Cipher;
    ILOAD 3
    INVOKEVIRTUAL javax/crypto/Cipher.getOutputSize (I)I
    ISTORE 6
   L4
    LINENUMBER 54 L4
    ALOAD 5
    ARRAYLENGTH
    ILOAD 6
    IF_ICMPGE L5
   L6
    LINENUMBER 56 L6
    ILOAD 6
    NEWARRAY T_BYTE
    ASTORE 5
   L7
    LINENUMBER 57 L7
    GETSTATIC MinecraftPacketEncryption.b : Ljava/lang/ThreadLocal;
    ALOAD 5
    INVOKEVIRTUAL java/lang/ThreadLocal.set (Ljava/lang/Object;)V
   L5
    LINENUMBER 59 L5
   FRAME FULL [MinecraftPacketEncryption T io/netty/buffer/ByteBuf I [B [B] []
    ALOAD 2
    ALOAD 5
    ICONST_0
    ALOAD 0
    GETFIELD MinecraftPacketEncryption.a : Ljavax/crypto/Cipher;
    ALOAD 4
    ICONST_0
    ILOAD 3
    ALOAD 5
    INVOKEVIRTUAL javax/crypto/Cipher.update ([BII[B)I
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBytes ([BII)Lio/netty/buffer/ByteBuf;
    POP
   L8
    LINENUMBER 60 L8
    RETURN
    MAXSTACK = 8
    MAXLOCALS = 7

  // access flags 0x1
  public a(Lio/netty/channel/ChannelHandlerContext;Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf; throws javax/crypto/ShortBufferException 
    // parameter  channelHandlerContext
    // parameter  byteBuf
   L0
    LINENUMBER 65 L0
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readableBytes ()I
    ISTORE 3
   L1
    LINENUMBER 66 L1
    ALOAD 0
    ALOAD 2
    INVOKESPECIAL MinecraftPacketEncryption.a (Lio/netty/buffer/ByteBuf;)[B
    ASTORE 4
   L2
    LINENUMBER 68 L2
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/ChannelHandlerContext.alloc ()Lio/netty/buffer/ByteBufAllocator; (itf)
    ALOAD 0
    GETFIELD MinecraftPacketEncryption.a : Ljavax/crypto/Cipher;
    ILOAD 3
    INVOKEVIRTUAL javax/crypto/Cipher.getOutputSize (I)I
    INVOKEINTERFACE io/netty/buffer/ByteBufAllocator.heapBuffer (I)Lio/netty/buffer/ByteBuf; (itf)
    ASTORE 5
   L3
    LINENUMBER 69 L3
    ALOAD 5
    ALOAD 0
    GETFIELD MinecraftPacketEncryption.a : Ljavax/crypto/Cipher;
    ALOAD 4
    ICONST_0
    ILOAD 3
    ALOAD 5
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.array ()[B
    ALOAD 5
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.arrayOffset ()I
    INVOKEVIRTUAL javax/crypto/Cipher.update ([BII[BI)I
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writerIndex (I)Lio/netty/buffer/ByteBuf;
    POP
   L4
    LINENUMBER 71 L4
    ALOAD 5
    ARETURN
    MAXSTACK = 7
    MAXLOCALS = 6

  // access flags 0x1
  public a()V
   L0
    LINENUMBER 77 L0
    RETURN
    MAXSTACK = 0
    MAXLOCALS = 1

  // access flags 0x2
  private a(Lio/netty/buffer/ByteBuf;)[B
    // parameter  byteBuf
   L0
    LINENUMBER 81 L0
    GETSTATIC MinecraftPacketEncryption.a : Ljava/lang/ThreadLocal;
    INVOKEVIRTUAL java/lang/ThreadLocal.get ()Ljava/lang/Object;
    CHECKCAST [B
    ASTORE 2
   L1
    LINENUMBER 82 L1
    ALOAD 1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readableBytes ()I
    ISTORE 3
   L2
    LINENUMBER 83 L2
    ALOAD 2
    ARRAYLENGTH
    ILOAD 3
    IF_ICMPGE L3
   L4
    LINENUMBER 85 L4
    ILOAD 3
    NEWARRAY T_BYTE
    ASTORE 2
   L5
    LINENUMBER 86 L5
    GETSTATIC MinecraftPacketEncryption.a : Ljava/lang/ThreadLocal;
    ALOAD 2
    INVOKEVIRTUAL java/lang/ThreadLocal.set (Ljava/lang/Object;)V
   L3
    LINENUMBER 88 L3
   FRAME FULL [T io/netty/buffer/ByteBuf [B I] []
    ALOAD 1
    ALOAD 2
    ICONST_0
    ILOAD 3
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readBytes ([BII)Lio/netty/buffer/ByteBuf;
    POP
   L6
    LINENUMBER 89 L6
    ALOAD 2
    ARETURN
    MAXSTACK = 4
    MAXLOCALS = 4

  // access flags 0x8
  static <clinit>()V
   L0
    LINENUMBER 15 L0
    NEW MinecraftPacketEncryption$a
    DUP
    ACONST_NULL
    INVOKESPECIAL MinecraftPacketEncryption$a.<init> (LMinecraftPacketEncryption$1;)V
    PUTSTATIC MinecraftPacketEncryption.a : Ljava/lang/ThreadLocal;
   L1
    LINENUMBER 16 L1
    NEW MinecraftPacketEncryption$a
    DUP
    ACONST_NULL
    INVOKESPECIAL MinecraftPacketEncryption$a.<init> (LMinecraftPacketEncryption$1;)V
    PUTSTATIC MinecraftPacketEncryption.b : Ljava/lang/ThreadLocal;
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 0
}
