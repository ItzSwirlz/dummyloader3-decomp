// class version 52.0 (52)
// access flags 0x21
public class MinecraftBot extends e {

  // compiled from: 

  ATTRIBUTE Code : unknown
  // access flags 0x0
  INNERCLASS MinecraftBot$1 null null
  // access flags 0x4019
  public final static enum INNERCLASS r$a r a
  // access flags 0x0
  INNERCLASS MinecraftBot$2 null null
  // access flags 0x19
  public final static INNERCLASS java/lang/invoke/MethodHandles$Lookup java/lang/invoke/MethodHandles Lookup

  // access flags 0x19
  // signature Lio/netty/util/AttributeKey<Ljava/lang/Object;>;
  // declaration: a extends io.netty.util.AttributeKey<java.lang.Object>
  public final static Lio/netty/util/AttributeKey; a

  // access flags 0x1A
  private final static Ljava/net/URL; a

  // access flags 0x12
  // signature Lio/netty/util/concurrent/FastThreadLocal<Lio/netty/buffer/ByteBuf;>;
  // declaration: a extends io.netty.util.concurrent.FastThreadLocal<io.netty.buffer.ByteBuf>
  private final Lio/netty/util/concurrent/FastThreadLocal; a

  // access flags 0x0
  Ljava/security/SecureRandom; a

  // access flags 0x0
  Ljava/lang/String; a

  // access flags 0x0
  Ljava/lang/String; b

  // access flags 0x0
  Ljava/lang/String; c

  // access flags 0x0
  Ljava/lang/String; d

  // access flags 0x0
  Z a

  // access flags 0x19
  public final static Ljava/util/concurrent/ExecutorService; a

  // access flags 0x1
  public Z b

  // access flags 0x41
  public volatile Z c

  // access flags 0x9
  public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; throws java/io/IOException 
    // parameter  string1
    // parameter  string2
    // parameter  string3
   L0
    LINENUMBER 77 L0
    GETSTATIC MinecraftBot.a : Ljava/net/URL;
    ALOAD 0
    ALOAD 1
    ALOAD 2
    INVOKESTATIC MinecraftBot.b (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    LDC "application/json"
    INVOKESTATIC MinecraftBot.a (Ljava/net/URL;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    ARETURN
    MAXSTACK = 4
    MAXLOCALS = 3

  // access flags 0x9
  public static a(Ljava/net/URL;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; throws java/io/IOException 
    // parameter  uRL
    // parameter  string2
    // parameter  string3
    TRYCATCHBLOCK L0 L1 L2 null
    TRYCATCHBLOCK L2 L3 L2 null
    TRYCATCHBLOCK L4 L5 L6 java/io/IOException
    TRYCATCHBLOCK L4 L5 L7 null
    TRYCATCHBLOCK L6 L8 L7 null
   L9
    LINENUMBER 81 L9
    ALOAD 0
    INVOKESTATIC MinecraftBot.a (Ljava/net/URL;)Ljava/net/HttpURLConnection;
    ASTORE 3
   L10
    LINENUMBER 82 L10
    ALOAD 1
    GETSTATIC java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    INVOKEVIRTUAL java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
    ASTORE 4
   L11
    LINENUMBER 83 L11
    ALOAD 3
    LDC "Content-Type"
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    ALOAD 2
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC "; charset=utf-8"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    INVOKEVIRTUAL java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
   L12
    LINENUMBER 84 L12
    ALOAD 3
    LDC "Content-Length"
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC ""
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 4
    ARRAYLENGTH
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    INVOKEVIRTUAL java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
   L13
    LINENUMBER 85 L13
    ALOAD 3
    ICONST_1
    INVOKEVIRTUAL java/net/HttpURLConnection.setDoOutput (Z)V
   L14
    LINENUMBER 86 L14
    ACONST_NULL
    ASTORE 5
   L0
    LINENUMBER 88 L0
    ALOAD 3
    INVOKEVIRTUAL java/net/HttpURLConnection.getOutputStream ()Ljava/io/OutputStream;
    ASTORE 5
   L15
    LINENUMBER 89 L15
    ALOAD 5
    ALOAD 4
    INVOKEVIRTUAL java/io/OutputStream.write ([B)V
   L1
    LINENUMBER 91 L1
    ALOAD 5
    IFNULL L16
   L17
    LINENUMBER 92 L17
    ALOAD 5
    INVOKEVIRTUAL java/io/OutputStream.close ()V
    GOTO L16
   L2
    LINENUMBER 91 L2
   FRAME FULL [T T T T T java/io/OutputStream] [java/lang/Throwable]
    ASTORE 6
   L3
    ALOAD 5
    IFNULL L18
   L19
    LINENUMBER 92 L19
    ALOAD 5
    INVOKEVIRTUAL java/io/OutputStream.close ()V
   L18
    LINENUMBER 94 L18
   FRAME FULL [T T T T T T java/lang/Throwable] []
    ALOAD 6
    ATHROW
   L16
    LINENUMBER 95 L16
   FRAME FULL [T T T java/net/HttpURLConnection] []
    ACONST_NULL
    ASTORE 6
   L4
    LINENUMBER 97 L4
    ALOAD 3
    INVOKEVIRTUAL java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
    ASTORE 6
   L20
    LINENUMBER 98 L20
    NEW java/io/ByteArrayOutputStream
    DUP
    INVOKESPECIAL java/io/ByteArrayOutputStream.<init> ()V
    ASTORE 7
   L21
    LINENUMBER 101 L21
    SIPUSH 16384
    NEWARRAY T_BYTE
    ASTORE 9
   L22
    LINENUMBER 103 L22
   FRAME FULL [T T T T T T java/io/InputStream java/io/ByteArrayOutputStream T [B] []
    ALOAD 6
    ALOAD 9
    ICONST_0
    ALOAD 9
    ARRAYLENGTH
    INVOKEVIRTUAL java/io/InputStream.read ([BII)I
    DUP
    ISTORE 8
    ICONST_M1
    IF_ICMPEQ L23
   L24
    LINENUMBER 104 L24
    ALOAD 7
    ALOAD 9
    ICONST_0
    ILOAD 8
    INVOKEVIRTUAL java/io/ByteArrayOutputStream.write ([BII)V
    GOTO L22
   L23
    LINENUMBER 107 L23
   FRAME CHOP 2
    NEW java/lang/String
    DUP
    ALOAD 7
    INVOKEVIRTUAL java/io/ByteArrayOutputStream.toByteArray ()[B
    GETSTATIC java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    INVOKESPECIAL java/lang/String.<init> ([BLjava/nio/charset/Charset;)V
    ASTORE 10
   L25
    LINENUMBER 108 L25
    ALOAD 10
    ASTORE 11
   L5
    LINENUMBER 112 L5
    ALOAD 6
    IFNULL L26
    ALOAD 6
    INVOKEVIRTUAL java/io/InputStream.close ()V
   L26
    LINENUMBER 108 L26
   FRAME FULL [T T T T T T T T T T T java/lang/String] []
    ALOAD 11
    ARETURN
   L6
    LINENUMBER 109 L6
   FRAME FULL [T T T T T T java/io/InputStream] [java/io/IOException]
    ASTORE 7
   L27
    LINENUMBER 110 L27
    ALOAD 7
    ATHROW
   L7
    LINENUMBER 112 L7
   FRAME SAME1 java/lang/Throwable
    ASTORE 12
   L8
    ALOAD 6
    IFNULL L28
    ALOAD 6
    INVOKEVIRTUAL java/io/InputStream.close ()V
   L28
    LINENUMBER 113 L28
   FRAME FULL [T T T T T T T T T T T T java/lang/Throwable] []
    ALOAD 12
    ATHROW
    MAXSTACK = 4
    MAXLOCALS = 13

  // access flags 0x9
  public static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    // parameter  string1
    // parameter  string2
    // parameter  string3
   L0
    LINENUMBER 117 L0
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "{\"accessToken\": \""
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC "\", \"selectedProfile\": \""
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 1
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC "\", \"serverId\": \""
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 2
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC "\"}"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ARETURN
    MAXSTACK = 2
    MAXLOCALS = 3

  // access flags 0x9
  public static a(Ljava/net/URL;)Ljava/net/HttpURLConnection; throws java/io/IOException 
    // parameter  uRL
   L0
    LINENUMBER 121 L0
    ALOAD 0
    INVOKEVIRTUAL java/net/URL.openConnection ()Ljava/net/URLConnection;
    CHECKCAST java/net/HttpURLConnection
    ASTORE 1
   L1
    LINENUMBER 122 L1
    ALOAD 1
    SIPUSH 15000
    INVOKEVIRTUAL java/net/HttpURLConnection.setConnectTimeout (I)V
   L2
    LINENUMBER 123 L2
    ALOAD 1
    SIPUSH 15000
    INVOKEVIRTUAL java/net/HttpURLConnection.setReadTimeout (I)V
   L3
    LINENUMBER 124 L3
    ALOAD 1
    ICONST_0
    INVOKEVIRTUAL java/net/HttpURLConnection.setUseCaches (Z)V
   L4
    LINENUMBER 125 L4
    ALOAD 1
    ARETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public <init>(Ljava/lang/String;I)V
    // parameter  string
    // parameter  integer
   L0
    LINENUMBER 132 L0
    ALOAD 0
    INVOKESPECIAL e.<init> ()V
   L1
    LINENUMBER 61 L1
    ALOAD 0
    NEW MinecraftBot$1
    DUP
    ALOAD 0
    INVOKESPECIAL MinecraftBot$1.<init> (LMinecraftBot;)V
    PUTFIELD MinecraftBot.a : Lio/netty/util/concurrent/FastThreadLocal;
   L2
    LINENUMBER 73 L2
    ALOAD 0
    NEW java/security/SecureRandom
    DUP
    INVOKESPECIAL java/security/SecureRandom.<init> ()V
    PUTFIELD MinecraftBot.a : Ljava/security/SecureRandom;
   L3
    LINENUMBER 153 L3
    ALOAD 0
    ACONST_NULL
    PUTFIELD MinecraftBot.d : Ljava/lang/String;
   L4
    LINENUMBER 154 L4
    ALOAD 0
    ICONST_0
    PUTFIELD MinecraftBot.a : Z
   L5
    LINENUMBER 310 L5
    ALOAD 0
    ICONST_0
    PUTFIELD MinecraftBot.b : Z
   L6
    LINENUMBER 387 L6
    ALOAD 0
    ICONST_0
    PUTFIELD MinecraftBot.c : Z
   L7
    LINENUMBER 133 L7
    ALOAD 0
    ILOAD 2
    PUTFIELD MinecraftBot.a : I
   L8
    LINENUMBER 134 L8
    ALOAD 1
    LDC "\u0000"
    INVOKEVIRTUAL java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
    ASTORE 3
   L9
    LINENUMBER 135 L9
    ALOAD 0
    ALOAD 3
    ICONST_0
    AALOAD
    PUTFIELD MinecraftBot.a : Ljava/lang/String;
   L10
    LINENUMBER 136 L10
    ALOAD 0
    ALOAD 3
    ICONST_1
    AALOAD
    PUTFIELD MinecraftBot.b : Ljava/lang/String;
   L11
    LINENUMBER 137 L11
    ALOAD 0
    ALOAD 3
    ICONST_2
    AALOAD
    PUTFIELD MinecraftBot.c : Ljava/lang/String;
   L12
    LINENUMBER 138 L12
    ALOAD 3
    ICONST_3
    AALOAD
    ASTORE 1
   L13
    LINENUMBER 139 L13
    ALOAD 3
    ARRAYLENGTH
    ICONST_4
    IF_ICMPLE L14
   L15
    LINENUMBER 140 L15
    ALOAD 3
    ICONST_4
    AALOAD
    ASTORE 4
   L16
    LINENUMBER 141 L16
    ALOAD 4
    INVOKEVIRTUAL java/lang/String.isEmpty ()Z
    IFNE L17
    ALOAD 4
    LDC ";"
    INVOKEVIRTUAL java/lang/String.equals (Ljava/lang/Object;)Z
    IFEQ L18
   L17
    LINENUMBER 142 L17
   FRAME FULL [MinecraftBot java/lang/String T [Ljava/lang/String;] []
    ALOAD 0
    ACONST_NULL
    PUTFIELD MinecraftBot.d : Ljava/lang/String;
    GOTO L19
   L18
    LINENUMBER 144 L18
   FRAME APPEND [java/lang/String]
    ALOAD 0
    ALOAD 4
    BIPUSH 59
    BIPUSH 32
    INVOKEVIRTUAL java/lang/String.replace (CC)Ljava/lang/String;
    PUTFIELD MinecraftBot.d : Ljava/lang/String;
   L19
    LINENUMBER 147 L19
   FRAME CHOP 1
    ALOAD 0
    ALOAD 3
    ARRAYLENGTH
    ICONST_5
    IF_ICMPLE L20
    ALOAD 3
    ICONST_5
    AALOAD
    LDC "true"
    INVOKEVIRTUAL java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
    IFEQ L20
    ICONST_1
    GOTO L21
   L20
   FRAME FULL [MinecraftBot java/lang/String] [MinecraftBot]
    ICONST_0
   L21
   FRAME FULL [MinecraftBot java/lang/String] [MinecraftBot I]
    PUTFIELD MinecraftBot.a : Z
   L14
    LINENUMBER 149 L14
   FRAME SAME
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "CRASH! "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    GETFIELD MinecraftBot.a : Z
    INVOKEVIRTUAL java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L22
    LINENUMBER 150 L22
    ALOAD 0
    ALOAD 1
    INVOKESTATIC MinecraftIPAddressResolver.a (Ljava/lang/String;)LMinecraftIPAddressResolver;
    PUTFIELD MinecraftBot.a : LMinecraftIPAddressResolver;
   L23
    LINENUMBER 151 L23
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 5

  // access flags 0x9
  public static a()Ljavax/crypto/SecretKey;
    TRYCATCHBLOCK L0 L1 L2 java/lang/Exception
   L0
    LINENUMBER 161 L0
    LDC "AES"
    INVOKESTATIC javax/crypto/KeyGenerator.getInstance (Ljava/lang/String;)Ljavax/crypto/KeyGenerator;
    ASTORE 0
   L3
    LINENUMBER 162 L3
    ALOAD 0
    SIPUSH 128
    INVOKEVIRTUAL javax/crypto/KeyGenerator.init (I)V
   L4
    LINENUMBER 163 L4
    ALOAD 0
    INVOKEVIRTUAL javax/crypto/KeyGenerator.generateKey ()Ljavax/crypto/SecretKey;
   L1
    ARETURN
   L2
    LINENUMBER 164 L2
   FRAME SAME1 java/lang/Exception
    ASTORE 0
   L5
    LINENUMBER 165 L5
    NEW java/lang/RuntimeException
    DUP
    ALOAD 0
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/Throwable;)V
    ATHROW
    MAXSTACK = 3
    MAXLOCALS = 1

  // access flags 0x9
  public static a([B)Ljava/security/PublicKey;
    // parameter  arr
    TRYCATCHBLOCK L0 L1 L2 java/lang/Exception
   L0
    LINENUMBER 171 L0
    NEW java/security/spec/X509EncodedKeySpec
    DUP
    ALOAD 0
    INVOKESPECIAL java/security/spec/X509EncodedKeySpec.<init> ([B)V
    ASTORE 1
   L3
    LINENUMBER 172 L3
    LDC "RSA"
    INVOKESTATIC java/security/KeyFactory.getInstance (Ljava/lang/String;)Ljava/security/KeyFactory;
    ASTORE 2
   L4
    LINENUMBER 173 L4
    ALOAD 2
    ALOAD 1
    INVOKEVIRTUAL java/security/KeyFactory.generatePublic (Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
   L1
    ARETURN
   L2
    LINENUMBER 174 L2
   FRAME FULL [] [java/lang/Exception]
    ASTORE 1
   L5
    LINENUMBER 175 L5
    NEW java/lang/RuntimeException
    DUP
    ALOAD 1
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/Throwable;)V
    ATHROW
    MAXSTACK = 3
    MAXLOCALS = 3

  // access flags 0x9
  public static a(ILjava/security/Key;)Ljavax/crypto/Cipher;
    // parameter  integer
    // parameter  key
    TRYCATCHBLOCK L0 L1 L2 java/lang/Exception
   L0
    LINENUMBER 181 L0
    LDC "AES/CFB8/NoPadding"
    INVOKESTATIC javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
    ASTORE 2
   L3
    LINENUMBER 182 L3
    ALOAD 2
    ILOAD 0
    ALOAD 1
    NEW javax/crypto/spec/IvParameterSpec
    DUP
    ALOAD 1
    INVOKEINTERFACE java/security/Key.getEncoded ()[B (itf)
    INVOKESPECIAL javax/crypto/spec/IvParameterSpec.<init> ([B)V
    INVOKEVIRTUAL javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
   L4
    LINENUMBER 183 L4
    ALOAD 2
   L1
    ARETURN
   L2
    LINENUMBER 184 L2
   FRAME FULL [] [java/lang/Exception]
    ASTORE 2
   L5
    LINENUMBER 185 L5
    NEW java/lang/RuntimeException
    DUP
    ALOAD 2
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/Throwable;)V
    ATHROW
    MAXSTACK = 6
    MAXLOCALS = 3

  // access flags 0x9
  public static a(Ljava/lang/String;Ljava/security/PublicKey;Ljavax/crypto/SecretKey;)[B
    // parameter  string
    // parameter  publicKey
    // parameter  secretKey
    TRYCATCHBLOCK L0 L1 L2 java/lang/Exception
   L0
    LINENUMBER 191 L0
    ICONST_3
    ANEWARRAY [B
    DUP
    ICONST_0
    ALOAD 0
    LDC "ISO_8859_1"
   L3
    LINENUMBER 192 L3
    INVOKEVIRTUAL java/lang/String.getBytes (Ljava/lang/String;)[B
    AASTORE
    DUP
    ICONST_1
    ALOAD 2
   L4
    LINENUMBER 193 L4
    INVOKEINTERFACE javax/crypto/SecretKey.getEncoded ()[B (itf)
    AASTORE
    DUP
    ICONST_2
    ALOAD 1
   L5
    LINENUMBER 194 L5
    INVOKEINTERFACE java/security/PublicKey.getEncoded ()[B (itf)
    AASTORE
   L6
    LINENUMBER 191 L6
    INVOKESTATIC MinecraftBot.a ([[B)[B
   L1
    ARETURN
   L2
    LINENUMBER 195 L2
   FRAME FULL [] [java/lang/Exception]
    ASTORE 3
   L7
    LINENUMBER 196 L7
    NEW java/lang/RuntimeException
    DUP
    ALOAD 3
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/Throwable;)V
    ATHROW
    MAXSTACK = 5
    MAXLOCALS = 4

  // access flags 0xA
  private static a(ILjava/security/Key;[B)[B
    // parameter  integer
    // parameter  key
    // parameter  arr
    TRYCATCHBLOCK L0 L1 L2 java/lang/Exception
   L0
    LINENUMBER 204 L0
    ILOAD 0
    ALOAD 1
    INVOKEINTERFACE java/security/Key.getAlgorithm ()Ljava/lang/String; (itf)
    ALOAD 1
    INVOKESTATIC MinecraftBot.a (ILjava/lang/String;Ljava/security/Key;)Ljavax/crypto/Cipher;
    ALOAD 2
    INVOKEVIRTUAL javax/crypto/Cipher.doFinal ([B)[B
   L1
    ARETURN
   L2
    LINENUMBER 205 L2
   FRAME FULL [] [java/lang/Exception]
    ASTORE 3
   L3
    LINENUMBER 206 L3
    NEW java/lang/RuntimeException
    DUP
    ALOAD 3
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/Throwable;)V
    ATHROW
    MAXSTACK = 3
    MAXLOCALS = 4

  // access flags 0xA
  private static a(ILjava/lang/String;Ljava/security/Key;)Ljavax/crypto/Cipher; throws java/lang/Exception 
    // parameter  integer
    // parameter  string
    // parameter  key
   L0
    LINENUMBER 211 L0
    ALOAD 1
    INVOKESTATIC javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
    ASTORE 3
   L1
    LINENUMBER 212 L1
    ALOAD 3
    ILOAD 0
    ALOAD 2
    INVOKEVIRTUAL javax/crypto/Cipher.init (ILjava/security/Key;)V
   L2
    LINENUMBER 213 L2
    ALOAD 3
    ARETURN
    MAXSTACK = 3
    MAXLOCALS = 4

  // access flags 0x8A
  private static varargs a([[B)[B throws java/lang/Exception 
    // parameter  arr
   L0
    LINENUMBER 216 L0
    LDC "SHA-1"
    INVOKESTATIC java/security/MessageDigest.getInstance (Ljava/lang/String;)Ljava/security/MessageDigest;
    ASTORE 1
   L1
    LINENUMBER 217 L1
    ALOAD 0
    ASTORE 2
    ALOAD 2
    ARRAYLENGTH
    ISTORE 3
    ICONST_0
    ISTORE 4
   L2
   FRAME FULL [T java/security/MessageDigest [[B I I] []
    ILOAD 4
    ILOAD 3
    IF_ICMPGE L3
    ALOAD 2
    ILOAD 4
    AALOAD
    ASTORE 5
   L4
    LINENUMBER 218 L4
    ALOAD 1
    ALOAD 5
    INVOKEVIRTUAL java/security/MessageDigest.update ([B)V
   L5
    LINENUMBER 217 L5
    IINC 4 1
    GOTO L2
   L3
    LINENUMBER 219 L3
   FRAME CHOP 3
    ALOAD 1
    INVOKEVIRTUAL java/security/MessageDigest.digest ()[B
    ARETURN
    MAXSTACK = 2
    MAXLOCALS = 6

  // access flags 0x1
  public a(Lio/netty/channel/Channel;)V
    // parameter  channel
   L0
    LINENUMBER 225 L0
    ALOAD 1
    GETSTATIC MinecraftBot.a : Lio/netty/util/AttributeKey;
    INVOKEINTERFACE io/netty/channel/Channel.attr (Lio/netty/util/AttributeKey;)Lio/netty/util/Attribute; (itf)
    INVOKEINTERFACE io/netty/util/Attribute.get ()Ljava/lang/Object; (itf)
    IFNULL L1
   L2
    LINENUMBER 226 L2
    INVOKESTATIC io/netty/buffer/Unpooled.buffer ()Lio/netty/buffer/ByteBuf;
    ASTORE 2
   L3
    LINENUMBER 227 L3
    NEW I
    DUP
    ALOAD 0
    GETFIELD MinecraftBot.a : I
    ALOAD 0
    GETFIELD MinecraftBot.a : LMinecraftIPAddressResolver;
    INVOKEVIRTUAL MinecraftIPAddressResolver.a ()Ljava/lang/String;
    ALOAD 0
    GETFIELD MinecraftBot.a : LMinecraftIPAddressResolver;
    INVOKEVIRTUAL MinecraftIPAddressResolver.a ()I
    ICONST_1
    INVOKESPECIAL I.<init> (ILjava/lang/String;II)V
    ASTORE 3
   L4
    LINENUMBER 228 L4
    ALOAD 3
    ALOAD 2
    INVOKEVIRTUAL I.a (Lio/netty/buffer/ByteBuf;)V
   L5
    LINENUMBER 229 L5
    ALOAD 3
    ALOAD 2
    INVOKEVIRTUAL I.c (Lio/netty/buffer/ByteBuf;)V
   L6
    LINENUMBER 230 L6
    ALOAD 0
    ALOAD 1
    ICONST_M1
    ACONST_NULL
    ALOAD 2
    INVOKEVIRTUAL MinecraftBot.a (Lio/netty/channel/Channel;ILA;Lio/netty/buffer/ByteBuf;)V
   L7
    LINENUMBER 233 L7
    INVOKESTATIC io/netty/buffer/Unpooled.buffer ()Lio/netty/buffer/ByteBuf;
    ASTORE 4
   L8
    LINENUMBER 234 L8
    NEW Q
    DUP
    INVOKESPECIAL Q.<init> ()V
    ASTORE 5
   L9
    LINENUMBER 235 L9
    ALOAD 5
    ALOAD 4
    INVOKEVIRTUAL Q.a (Lio/netty/buffer/ByteBuf;)V
   L10
    LINENUMBER 236 L10
    ALOAD 5
    ALOAD 4
    INVOKEVIRTUAL Q.c (Lio/netty/buffer/ByteBuf;)V
   L11
    LINENUMBER 237 L11
    ALOAD 0
    ALOAD 1
    ICONST_M1
    ACONST_NULL
    ALOAD 4
    INVOKEVIRTUAL MinecraftBot.a (Lio/netty/channel/Channel;ILA;Lio/netty/buffer/ByteBuf;)V
   L12
    LINENUMBER 239 L12
    RETURN
   L1
    LINENUMBER 242 L1
   FRAME SAME
    ALOAD 0
    GETFIELD MinecraftBot.b : Z
    IFEQ L13
    RETURN
   L13
    LINENUMBER 245 L13
   FRAME SAME
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "SEND DATA"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L14
    LINENUMBER 247 L14
    ALOAD 0
    ALOAD 1
    ICONST_M1
    ACONST_NULL
    ALOAD 0
    GETFIELD MinecraftBot.a : Lio/netty/util/concurrent/FastThreadLocal;
    INVOKEVIRTUAL io/netty/util/concurrent/FastThreadLocal.get ()Ljava/lang/Object;
    CHECKCAST io/netty/buffer/ByteBuf
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.resetReaderIndex ()Lio/netty/buffer/ByteBuf;
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.retain ()Lio/netty/buffer/ByteBuf;
    INVOKEVIRTUAL MinecraftBot.a (Lio/netty/channel/Channel;ILA;Lio/netty/buffer/ByteBuf;)V
   L15
    LINENUMBER 249 L15
    INVOKESTATIC io/netty/buffer/Unpooled.buffer ()Lio/netty/buffer/ByteBuf;
    ASTORE 2
   L16
    LINENUMBER 250 L16
    NEW M
    DUP
    INVOKESPECIAL M.<init> ()V
    ASTORE 3
   L17
    LINENUMBER 251 L17
    ALOAD 3
    ALOAD 0
    GETFIELD MinecraftBot.b : Ljava/lang/String;
    PUTFIELD M.a : Ljava/lang/String;
   L18
    LINENUMBER 252 L18
    ALOAD 3
    ALOAD 2
    INVOKEVIRTUAL M.a (Lio/netty/buffer/ByteBuf;)V
   L19
    LINENUMBER 253 L19
    ALOAD 3
    ALOAD 2
    ACONST_NULL
    ALOAD 0
    GETFIELD MinecraftBot.a : I
    INVOKEVIRTUAL M.b (Lio/netty/buffer/ByteBuf;Lr$a;I)V
   L20
    LINENUMBER 255 L20
    ALOAD 0
    ALOAD 1
    ICONST_M1
    ACONST_NULL
    ALOAD 2
    INVOKEVIRTUAL MinecraftBot.a (Lio/netty/channel/Channel;ILA;Lio/netty/buffer/ByteBuf;)V
   L21
    LINENUMBER 258 L21
    ALOAD 0
    GETFIELD MinecraftBot.a : LS;
    IFNULL L22
    ALOAD 0
    GETFIELD MinecraftBot.a : LS;
    GETFIELD S.b : I
    BIPUSH 8
    IMUL
    SIPUSH 2000
    ISUB
    GOTO L23
   L22
   FRAME FULL [T io/netty/channel/Channel] []
    LDC 60000
   L23
   FRAME SAME1 I
    ISTORE 4
   L24
    LINENUMBER 259 L24
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "WAIT: "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ILOAD 4
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L25
    LINENUMBER 260 L25
    ILOAD 4
    IFGT L26
   L27
    LINENUMBER 261 L27
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/Channel.close ()Lio/netty/channel/ChannelFuture; (itf)
    POP
   L28
    LINENUMBER 262 L28
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "AUTO CLOSE DIREKT"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
    GOTO L29
   L26
    LINENUMBER 265 L26
   FRAME APPEND [T T I]
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/Channel.eventLoop ()Lio/netty/channel/EventLoop; (itf)
    ALOAD 1
    INVOKEDYNAMIC run(Lio/netty/channel/Channel;)Ljava/lang/Runnable; [
      // handle kind 0x6 : INVOKESTATIC
      java/lang/invoke/LambdaMetafactory.metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
      // arguments:
      ()V, 
      // handle kind 0x6 : INVOKESTATIC
      MinecraftBot.c(Lio/netty/channel/Channel;)V, 
      ()V
    ]
    ILOAD 4
    I2L
    GETSTATIC java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    INVOKEINTERFACE io/netty/channel/EventLoop.schedule (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/netty/util/concurrent/ScheduledFuture; (itf)
    POP
   L29
    LINENUMBER 271 L29
   FRAME FULL [] []
    RETURN
    MAXSTACK = 6
    MAXLOCALS = 6

  // access flags 0x1
  public a(Lio/netty/channel/Channel;ILA;Lio/netty/buffer/ByteBuf;)V
    // parameter  channel
    // parameter  integer
    // parameter  a
    // parameter  byteBuf
   L0
    LINENUMBER 313 L0
    ALOAD 1
    ALOAD 4
    ILOAD 2
    ALOAD 3
    INVOKESTATIC MinecraftFriendlyByteBuf.b (Lio/netty/buffer/ByteBuf;ILA;)Lio/netty/buffer/ByteBuf;
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;
    INVOKEINTERFACE io/netty/channel/Channel.writeAndFlush (Ljava/lang/Object;)Lio/netty/channel/ChannelFuture; (itf)
    POP
   L1
    LINENUMBER 314 L1
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 5

  // access flags 0x1
  public a(Lio/netty/channel/Channel;ILA;Ljava/lang/String;)V
    // parameter  channel
    // parameter  integer
    // parameter  a
    // parameter  string
   L0
    LINENUMBER 316 L0
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/Channel.eventLoop ()Lio/netty/channel/EventLoop; (itf)
    ALOAD 0
    ALOAD 1
    ALOAD 4
    ILOAD 2
    ALOAD 3
    INVOKEDYNAMIC run(LMinecraftBot;Lio/netty/channel/Channel;Ljava/lang/String;ILA;)Ljava/lang/Runnable; [
      // handle kind 0x6 : INVOKESTATIC
      java/lang/invoke/LambdaMetafactory.metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
      // arguments:
      ()V, 
      // handle kind 0x7 : INVOKESPECIAL
      MinecraftBot.a(Lio/netty/channel/Channel;Ljava/lang/String;ILA;)V, 
      ()V
    ]
    LDC 1000
    GETSTATIC java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    INVOKEINTERFACE io/netty/channel/EventLoop.schedule (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/netty/util/concurrent/ScheduledFuture; (itf)
    POP
   L1
    LINENUMBER 350 L1
    RETURN
    MAXSTACK = 6
    MAXLOCALS = 5

  // access flags 0x1
  public a(Lio/netty/channel/Channel;ILA;)V
    // parameter  channel
    // parameter  integer
    // parameter  a
   L0
    LINENUMBER 353 L0
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/Channel.isActive ()Z (itf)
    IFNE L1
    RETURN
   L1
    LINENUMBER 354 L1
   FRAME SAME
    NEW O
    DUP
    INVOKESPECIAL O.<init> ()V
    ASTORE 4
   L2
    LINENUMBER 355 L2
    ALOAD 4
    LDC "BungeeCord"
    INVOKEVIRTUAL O.a (Ljava/lang/String;)V
   L3
    LINENUMBER 356 L3
    ALOAD 4
    SIPUSH 32467
    NEWARRAY T_BYTE
    INVOKEVIRTUAL O.a ([B)V
   L4
    LINENUMBER 357 L4
    INVOKESTATIC io/netty/buffer/Unpooled.buffer ()Lio/netty/buffer/ByteBuf;
    ASTORE 5
   L5
    LINENUMBER 358 L5
    ALOAD 0
    GETFIELD MinecraftBot.a : I
    SIPUSH 760
    IF_ICMPLT L6
   L7
    LINENUMBER 359 L7
    BIPUSH 13
    ALOAD 5
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L8
   L6
    LINENUMBER 360 L6
   FRAME APPEND [O io/netty/buffer/ByteBuf]
    ALOAD 0
    GETFIELD MinecraftBot.a : I
    SIPUSH 759
    IF_ICMPLT L9
   L10
    LINENUMBER 361 L10
    BIPUSH 12
    ALOAD 5
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L8
   L9
    LINENUMBER 362 L9
   FRAME SAME
    ALOAD 0
    GETFIELD MinecraftBot.a : I
    SIPUSH 755
    IF_ICMPLT L11
   L12
    LINENUMBER 363 L12
    BIPUSH 10
    ALOAD 5
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L8
   L11
    LINENUMBER 364 L11
   FRAME SAME
    ALOAD 0
    GETFIELD MinecraftBot.a : I
    SIPUSH 477
    IF_ICMPLT L13
   L14
    LINENUMBER 365 L14
    BIPUSH 11
    ALOAD 5
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L8
   L13
    LINENUMBER 366 L13
   FRAME SAME
    ALOAD 0
    GETFIELD MinecraftBot.a : I
    SIPUSH 393
    IF_ICMPLT L15
   L16
    LINENUMBER 367 L16
    BIPUSH 10
    ALOAD 5
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L8
   L15
    LINENUMBER 368 L15
   FRAME SAME
    ALOAD 0
    GETFIELD MinecraftBot.a : I
    SIPUSH 338
    IF_ICMPLT L17
   L18
    LINENUMBER 369 L18
    BIPUSH 9
    ALOAD 5
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L8
   L17
    LINENUMBER 370 L17
   FRAME SAME
    ALOAD 0
    GETFIELD MinecraftBot.a : I
    SIPUSH 335
    IF_ICMPLT L19
   L20
    LINENUMBER 371 L20
    BIPUSH 10
    ALOAD 5
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L8
   L19
    LINENUMBER 372 L19
   FRAME SAME
    ALOAD 0
    GETFIELD MinecraftBot.a : I
    BIPUSH 107
    IF_ICMPLT L21
   L22
    LINENUMBER 373 L22
    BIPUSH 9
    ALOAD 5
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L8
   L21
    LINENUMBER 375 L21
   FRAME SAME
    BIPUSH 23
    ALOAD 5
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
   L8
    LINENUMBER 377 L8
   FRAME SAME
    ALOAD 4
    ALOAD 5
    GETSTATIC r$a.TO_SERVER : Lr$a;
    ALOAD 0
    GETFIELD MinecraftBot.a : I
    INVOKEVIRTUAL O.b (Lio/netty/buffer/ByteBuf;Lr$a;I)V
   L23
    LINENUMBER 378 L23
    ALOAD 5
    ILOAD 2
    ALOAD 3
    INVOKESTATIC MinecraftFriendlyByteBuf.b (Lio/netty/buffer/ByteBuf;ILA;)Lio/netty/buffer/ByteBuf;
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;
    ASTORE 6
   L24
    LINENUMBER 380 L24
    ICONST_0
    ISTORE 7
   L25
   FRAME FULL [T io/netty/channel/Channel T T T T io/netty/buffer/ByteBuf I] []
    ILOAD 7
    LDC 40000
    IF_ICMPGE L26
   L27
    LINENUMBER 381 L27
    ALOAD 1
    ALOAD 6
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.resetReaderIndex ()Lio/netty/buffer/ByteBuf;
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.retain ()Lio/netty/buffer/ByteBuf;
    INVOKEINTERFACE io/netty/channel/Channel.write (Ljava/lang/Object;)Lio/netty/channel/ChannelFuture; (itf)
    POP
   L28
    LINENUMBER 380 L28
    IINC 7 1
    GOTO L25
   L26
    LINENUMBER 383 L26
   FRAME CHOP 1
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/Channel.flush ()Lio/netty/channel/Channel; (itf)
    POP
   L29
    LINENUMBER 384 L29
    ALOAD 6
    INVOKESTATIC io/netty/util/ReferenceCountUtil.release (Ljava/lang/Object;)Z
    POP
   L30
    LINENUMBER 385 L30
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 8

  // access flags 0x1
  public b(Lio/netty/channel/Channel;)V
    // parameter  channel
   L0
    LINENUMBER 391 L0
    ALOAD 0
    GETFIELD MinecraftBot.b : Z
    IFEQ L1
    RETURN
   L1
    LINENUMBER 392 L1
   FRAME SAME
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/Channel.config ()Lio/netty/channel/ChannelConfig; (itf)
    ICONST_1
    INVOKEINTERFACE io/netty/channel/ChannelConfig.setAutoRead (Z)Lio/netty/channel/ChannelConfig; (itf)
    POP
   L2
    LINENUMBER 393 L2
    ALOAD 0
    GETFIELD MinecraftBot.c : Z
    ISTORE 2
   L3
    LINENUMBER 394 L3
    ALOAD 0
    GETFIELD MinecraftBot.c : Z
    IFEQ L4
   L5
    LINENUMBER 395 L5
    ALOAD 1
    GETSTATIC MinecraftBot.a : Lio/netty/util/AttributeKey;
    INVOKEINTERFACE io/netty/channel/Channel.attr (Lio/netty/util/AttributeKey;)Lio/netty/util/Attribute; (itf)
    ICONST_1
    INVOKESTATIC java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
    INVOKEINTERFACE io/netty/util/Attribute.set (Ljava/lang/Object;)V (itf)
   L6
    LINENUMBER 396 L6
    ALOAD 0
    ICONST_0
    PUTFIELD MinecraftBot.c : Z
   L4
    LINENUMBER 398 L4
   FRAME APPEND [I]
    NEW java/util/concurrent/atomic/AtomicReference
    DUP
    ICONST_M1
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    INVOKESPECIAL java/util/concurrent/atomic/AtomicReference.<init> (Ljava/lang/Object;)V
    ASTORE 3
   L7
    LINENUMBER 399 L7
    NEW java/util/concurrent/atomic/AtomicReference
    DUP
    ACONST_NULL
    INVOKESPECIAL java/util/concurrent/atomic/AtomicReference.<init> (Ljava/lang/Object;)V
    ASTORE 4
   L8
    LINENUMBER 400 L8
    NEW java/util/concurrent/atomic/AtomicReference
    DUP
    ICONST_0
    INVOKESTATIC java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
    INVOKESPECIAL java/util/concurrent/atomic/AtomicReference.<init> (Ljava/lang/Object;)V
    ASTORE 5
   L9
    LINENUMBER 402 L9
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; (itf)
    LDC "timeout"
    INVOKEINTERFACE io/netty/channel/ChannelPipeline.remove (Ljava/lang/String;)Lio/netty/channel/ChannelHandler; (itf)
    POP
   L10
    LINENUMBER 403 L10
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; (itf)
    LDC "splitter"
    NEW MinecraftPacketDecoder
    DUP
    INVOKESPECIAL MinecraftPacketDecoder.<init> ()V
    INVOKEINTERFACE io/netty/channel/ChannelPipeline.addFirst (Ljava/lang/String;Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelPipeline; (itf)
    LDC "splitter"
    LDC "packet-handler"
    NEW MinecraftBot$2
    DUP
    ALOAD 0
    ICONST_1
    ILOAD 2
    ALOAD 5
    ALOAD 1
    ALOAD 3
    ALOAD 4
    INVOKESPECIAL MinecraftBot$2.<init> (LMinecraftBot;ZZLjava/util/concurrent/atomic/AtomicReference;Lio/netty/channel/Channel;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;)V
    INVOKEINTERFACE io/netty/channel/ChannelPipeline.addAfter (Ljava/lang/String;Ljava/lang/String;Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelPipeline; (itf)
    POP
   L11
    LINENUMBER 568 L11
    RETURN
    MAXSTACK = 12
    MAXLOCALS = 6

  // access flags 0x9
  public static a(ZLjavax/crypto/SecretKey;)Lv;
    // parameter  boolean1
    // parameter  secretKey
    TRYCATCHBLOCK L0 L1 L2 java/security/GeneralSecurityException
   L3
    LINENUMBER 571 L3
    NEW MinecraftPacketEncryption
    DUP
    INVOKESPECIAL MinecraftPacketEncryption.<init> ()V
    ASTORE 2
   L0
    LINENUMBER 574 L0
    ALOAD 2
    ILOAD 0
    ALOAD 1
    INVOKEINTERFACE v.a (ZLjavax/crypto/SecretKey;)V (itf)
   L1
    LINENUMBER 577 L1
    GOTO L4
   L2
    LINENUMBER 575 L2
   FRAME FULL [] [java/security/GeneralSecurityException]
    ASTORE 3
   L5
    LINENUMBER 576 L5
    NEW java/lang/RuntimeException
    DUP
    ALOAD 3
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/Throwable;)V
    ATHROW
   L4
    LINENUMBER 578 L4
   FRAME APPEND [T T MinecraftPacketEncryption]
    ALOAD 2
    ARETURN
    MAXSTACK = 3
    MAXLOCALS = 4

  // access flags 0x1002
  private synthetic a(Lio/netty/channel/Channel;Ljava/lang/String;ILA;)V
    // parameter  channel
    // parameter  string
    // parameter  integer
    // parameter  a
   L0
    LINENUMBER 317 L0
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/Channel.isActive ()Z (itf)
    IFEQ L1
   L2
    LINENUMBER 318 L2
    INVOKESTATIC io/netty/buffer/Unpooled.buffer ()Lio/netty/buffer/ByteBuf;
    ASTORE 5
   L3
    LINENUMBER 319 L3
    ALOAD 0
    GETFIELD MinecraftBot.a : I
    SIPUSH 759
    IF_ICMPLT L4
   L5
    LINENUMBER 320 L5
    NEW ClientChat
    DUP
    INVOKESPECIAL ClientChat.<init> ()V
    ASTORE 6
   L6
    LINENUMBER 321 L6
    ALOAD 6
    ALOAD 2
    INVOKEVIRTUAL ClientChat.a (Ljava/lang/String;)V
   L7
    LINENUMBER 322 L7
    ALOAD 6
    INVOKESTATIC java/lang/System.currentTimeMillis ()J
    INVOKEVIRTUAL ClientChat.a (J)V
   L8
    LINENUMBER 323 L8
    ALOAD 6
    LDC 2131234
    INVOKEVIRTUAL ClientChat.b (J)V
   L9
    LINENUMBER 324 L9
    ALOAD 6
    ICONST_0
    NEWARRAY T_BYTE
    INVOKEVIRTUAL ClientChat.a ([B)V
   L10
    LINENUMBER 325 L10
    ALOAD 6
    NEW ChatChain
    DUP
    NEW java/util/ArrayList
    DUP
    INVOKESPECIAL java/util/ArrayList.<init> ()V
    NEW java/util/ArrayList
    DUP
    INVOKESPECIAL java/util/ArrayList.<init> ()V
    INVOKESPECIAL ChatChain.<init> (Ljava/util/List;Ljava/util/List;)V
    INVOKEVIRTUAL ClientChat.a (LChatChain;)V
   L11
    LINENUMBER 326 L11
    INVOKESTATIC io/netty/buffer/Unpooled.buffer ()Lio/netty/buffer/ByteBuf;
    ASTORE 7
   L12
    LINENUMBER 327 L12
    ALOAD 0
    GETFIELD MinecraftBot.a : I
    SIPUSH 759
    IF_ICMPLE L13
    ICONST_5
    GOTO L14
   L13
   FRAME FULL [MinecraftBot io/netty/channel/Channel T I A T ClientChat io/netty/buffer/ByteBuf] []
    ICONST_4
   L14
   FRAME SAME1 I
    ALOAD 7
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
   L15
    LINENUMBER 328 L15
    ALOAD 6
    ALOAD 7
    ACONST_NULL
    ALOAD 0
    GETFIELD MinecraftBot.a : I
    INVOKEVIRTUAL ClientChat.b (Lio/netty/buffer/ByteBuf;Lr$a;I)V
   L16
    LINENUMBER 329 L16
    ALOAD 0
    ALOAD 1
    ILOAD 3
    ALOAD 4
    ALOAD 7
    INVOKEVIRTUAL MinecraftBot.a (Lio/netty/channel/Channel;ILA;Lio/netty/buffer/ByteBuf;)V
   L17
    LINENUMBER 330 L17
    GOTO L1
   L4
    LINENUMBER 331 L4
   FRAME FULL [MinecraftBot io/netty/channel/Channel java/lang/String I A] []
    NEW Chat
    DUP
    INVOKESPECIAL Chat.<init> ()V
    ASTORE 6
   L18
    LINENUMBER 332 L18
    ALOAD 6
    ALOAD 2
    INVOKEVIRTUAL Chat.a (Ljava/lang/String;)V
   L19
    LINENUMBER 333 L19
    INVOKESTATIC io/netty/buffer/Unpooled.buffer ()Lio/netty/buffer/ByteBuf;
    ASTORE 7
   L20
    LINENUMBER 334 L20
    ALOAD 0
    GETFIELD MinecraftBot.a : I
    SIPUSH 477
    IF_ICMPLT L21
   L22
    LINENUMBER 335 L22
    ICONST_3
    ALOAD 7
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L23
   L21
    LINENUMBER 336 L21
   FRAME FULL [MinecraftBot io/netty/channel/Channel T I A T Chat io/netty/buffer/ByteBuf] []
    ALOAD 0
    GETFIELD MinecraftBot.a : I
    SIPUSH 338
    IF_ICMPLT L24
   L25
    LINENUMBER 337 L25
    ICONST_2
    ALOAD 7
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L23
   L24
    LINENUMBER 338 L24
   FRAME SAME
    ALOAD 0
    GETFIELD MinecraftBot.a : I
    SIPUSH 335
    IF_ICMPLT L26
   L27
    LINENUMBER 339 L27
    ICONST_3
    ALOAD 7
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L23
   L26
    LINENUMBER 340 L26
   FRAME SAME
    ALOAD 0
    GETFIELD MinecraftBot.a : I
    BIPUSH 107
    IF_ICMPLT L28
   L29
    LINENUMBER 341 L29
    ICONST_2
    ALOAD 7
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L23
   L28
    LINENUMBER 343 L28
   FRAME SAME
    ICONST_1
    ALOAD 7
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
   L23
    LINENUMBER 345 L23
   FRAME SAME
    ALOAD 6
    ALOAD 7
    GETSTATIC r$a.TO_SERVER : Lr$a;
    ALOAD 0
    GETFIELD MinecraftBot.a : I
    INVOKEVIRTUAL Chat.b (Lio/netty/buffer/ByteBuf;Lr$a;I)V
   L30
    LINENUMBER 346 L30
    ALOAD 0
    ALOAD 1
    ILOAD 3
    ALOAD 4
    ALOAD 7
    INVOKEVIRTUAL MinecraftBot.a (Lio/netty/channel/Channel;ILA;Lio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 349 L1
   FRAME FULL [] []
    RETURN
    MAXSTACK = 6
    MAXLOCALS = 8

  // access flags 0x100A
  private static synthetic c(Lio/netty/channel/Channel;)V
    // parameter  channel
   L0
    LINENUMBER 266 L0
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "AUTO CLOSE"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L1
    LINENUMBER 267 L1
    ALOAD 0
    INVOKEINTERFACE io/netty/channel/Channel.config ()Lio/netty/channel/ChannelConfig; (itf)
    ICONST_0
    INVOKEINTERFACE io/netty/channel/ChannelConfig.setAutoRead (Z)Lio/netty/channel/ChannelConfig; (itf)
    POP
   L2
    LINENUMBER 268 L2
    ALOAD 0
    INVOKEINTERFACE io/netty/channel/Channel.close ()Lio/netty/channel/ChannelFuture; (itf)
    POP
   L3
    LINENUMBER 269 L3
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x8
  static <clinit>()V
    TRYCATCHBLOCK L0 L1 L2 java/net/MalformedURLException
   L3
    LINENUMBER 46 L3
    LDC "motd"
    INVOKESTATIC io/netty/util/AttributeKey.valueOf (Ljava/lang/String;)Lio/netty/util/AttributeKey;
    PUTSTATIC MinecraftBot.a : Lio/netty/util/AttributeKey;
   L0
    LINENUMBER 52 L0
    NEW java/net/URL
    DUP
    LDC "https://sessionserver.mojang.com/session/minecraft/join"
    INVOKESPECIAL java/net/URL.<init> (Ljava/lang/String;)V
    PUTSTATIC MinecraftBot.a : Ljava/net/URL;
   L1
    LINENUMBER 55 L1
    GOTO L4
   L2
    LINENUMBER 53 L2
   FRAME SAME1 java/net/MalformedURLException
    ASTORE 0
   L5
    LINENUMBER 54 L5
    NEW java/lang/RuntimeException
    DUP
    ALOAD 0
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/Throwable;)V
    ATHROW
   L4
    LINENUMBER 157 L4
   FRAME SAME
    INVOKESTATIC java/util/concurrent/Executors.newCachedThreadPool ()Ljava/util/concurrent/ExecutorService;
    PUTSTATIC MinecraftBot.a : Ljava/util/concurrent/ExecutorService;
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 1
}
