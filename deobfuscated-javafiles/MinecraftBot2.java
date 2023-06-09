// class version 52.0 (52)
// access flags 0x21
public class MinecraftBot2 extends e {

  // compiled from: 

  ATTRIBUTE Code : unknown
  // access flags 0x0
  INNERCLASS MinecraftBot2$1 null null
  // access flags 0x4019
  public final static enum INNERCLASS r$a r a
  // access flags 0x8
  static INNERCLASS MinecraftBot2$a MinecraftBot2 a
  // access flags 0x0
  INNERCLASS MinecraftBot2$2 null null
  // access flags 0x19
  public final static INNERCLASS java/lang/invoke/MethodHandles$Lookup java/lang/invoke/MethodHandles Lookup

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

  // access flags 0x9
  public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; throws java/io/IOException 
    // parameter  string1
    // parameter  string2
    // parameter  string3
   L0
    LINENUMBER 87 L0
    GETSTATIC MinecraftBot2.a : Ljava/net/URL;
    ALOAD 0
    ALOAD 1
    ALOAD 2
    INVOKESTATIC MinecraftBot2.b (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    LDC "application/json"
    INVOKESTATIC MinecraftBot2.a (Ljava/net/URL;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
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
    LINENUMBER 91 L9
    ALOAD 0
    INVOKESTATIC MinecraftBot2.a (Ljava/net/URL;)Ljava/net/HttpURLConnection;
    ASTORE 3
   L10
    LINENUMBER 92 L10
    ALOAD 1
    GETSTATIC java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    INVOKEVIRTUAL java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
    ASTORE 4
   L11
    LINENUMBER 93 L11
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
    LINENUMBER 94 L12
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
    LINENUMBER 95 L13
    ALOAD 3
    ICONST_1
    INVOKEVIRTUAL java/net/HttpURLConnection.setDoOutput (Z)V
   L14
    LINENUMBER 96 L14
    ACONST_NULL
    ASTORE 5
   L0
    LINENUMBER 98 L0
    ALOAD 3
    INVOKEVIRTUAL java/net/HttpURLConnection.getOutputStream ()Ljava/io/OutputStream;
    ASTORE 5
   L15
    LINENUMBER 99 L15
    ALOAD 5
    ALOAD 4
    INVOKEVIRTUAL java/io/OutputStream.write ([B)V
   L1
    LINENUMBER 101 L1
    ALOAD 5
    IFNULL L16
   L17
    LINENUMBER 102 L17
    ALOAD 5
    INVOKEVIRTUAL java/io/OutputStream.close ()V
    GOTO L16
   L2
    LINENUMBER 101 L2
   FRAME FULL [T T T T T java/io/OutputStream] [java/lang/Throwable]
    ASTORE 6
   L3
    ALOAD 5
    IFNULL L18
   L19
    LINENUMBER 102 L19
    ALOAD 5
    INVOKEVIRTUAL java/io/OutputStream.close ()V
   L18
    LINENUMBER 104 L18
   FRAME FULL [T T T T T T java/lang/Throwable] []
    ALOAD 6
    ATHROW
   L16
    LINENUMBER 105 L16
   FRAME FULL [T T T java/net/HttpURLConnection] []
    ACONST_NULL
    ASTORE 6
   L4
    LINENUMBER 107 L4
    ALOAD 3
    INVOKEVIRTUAL java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
    ASTORE 6
   L20
    LINENUMBER 108 L20
    NEW java/io/ByteArrayOutputStream
    DUP
    INVOKESPECIAL java/io/ByteArrayOutputStream.<init> ()V
    ASTORE 7
   L21
    LINENUMBER 111 L21
    SIPUSH 16384
    NEWARRAY T_BYTE
    ASTORE 9
   L22
    LINENUMBER 113 L22
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
    LINENUMBER 114 L24
    ALOAD 7
    ALOAD 9
    ICONST_0
    ILOAD 8
    INVOKEVIRTUAL java/io/ByteArrayOutputStream.write ([BII)V
    GOTO L22
   L23
    LINENUMBER 117 L23
   FRAME CHOP 2
    NEW java/lang/String
    DUP
    ALOAD 7
    INVOKEVIRTUAL java/io/ByteArrayOutputStream.toByteArray ()[B
    GETSTATIC java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    INVOKESPECIAL java/lang/String.<init> ([BLjava/nio/charset/Charset;)V
    ASTORE 10
   L25
    LINENUMBER 118 L25
    ALOAD 10
    ASTORE 11
   L5
    LINENUMBER 122 L5
    ALOAD 6
    IFNULL L26
    ALOAD 6
    INVOKEVIRTUAL java/io/InputStream.close ()V
   L26
    LINENUMBER 118 L26
   FRAME FULL [T T T T T T T T T T T java/lang/String] []
    ALOAD 11
    ARETURN
   L6
    LINENUMBER 119 L6
   FRAME FULL [T T T T T T java/io/InputStream] [java/io/IOException]
    ASTORE 7
   L27
    LINENUMBER 120 L27
    ALOAD 7
    ATHROW
   L7
    LINENUMBER 122 L7
   FRAME SAME1 java/lang/Throwable
    ASTORE 12
   L8
    ALOAD 6
    IFNULL L28
    ALOAD 6
    INVOKEVIRTUAL java/io/InputStream.close ()V
   L28
    LINENUMBER 123 L28
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
    LINENUMBER 127 L0
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
    LINENUMBER 131 L0
    ALOAD 0
    INVOKEVIRTUAL java/net/URL.openConnection ()Ljava/net/URLConnection;
    CHECKCAST java/net/HttpURLConnection
    ASTORE 1
   L1
    LINENUMBER 132 L1
    ALOAD 1
    SIPUSH 15000
    INVOKEVIRTUAL java/net/HttpURLConnection.setConnectTimeout (I)V
   L2
    LINENUMBER 133 L2
    ALOAD 1
    SIPUSH 15000
    INVOKEVIRTUAL java/net/HttpURLConnection.setReadTimeout (I)V
   L3
    LINENUMBER 134 L3
    ALOAD 1
    ICONST_0
    INVOKEVIRTUAL java/net/HttpURLConnection.setUseCaches (Z)V
   L4
    LINENUMBER 135 L4
    ALOAD 1
    ARETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public <init>(Ljava/lang/String;I)V
    // parameter  string
    // parameter  integer
   L0
    LINENUMBER 142 L0
    ALOAD 0
    INVOKESPECIAL e.<init> ()V
   L1
    LINENUMBER 71 L1
    ALOAD 0
    NEW MinecraftBot2$1
    DUP
    ALOAD 0
    INVOKESPECIAL MinecraftBot2$1.<init> (LMinecraftBot2;)V
    PUTFIELD MinecraftBot2.a : Lio/netty/util/concurrent/FastThreadLocal;
   L2
    LINENUMBER 83 L2
    ALOAD 0
    NEW java/security/SecureRandom
    DUP
    INVOKESPECIAL java/security/SecureRandom.<init> ()V
    PUTFIELD MinecraftBot2.a : Ljava/security/SecureRandom;
   L3
    LINENUMBER 163 L3
    ALOAD 0
    ACONST_NULL
    PUTFIELD MinecraftBot2.d : Ljava/lang/String;
   L4
    LINENUMBER 164 L4
    ALOAD 0
    ICONST_0
    PUTFIELD MinecraftBot2.a : Z
   L5
    LINENUMBER 320 L5
    ALOAD 0
    ICONST_0
    PUTFIELD MinecraftBot2.b : Z
   L6
    LINENUMBER 143 L6
    ALOAD 0
    ILOAD 2
    PUTFIELD MinecraftBot2.a : I
   L7
    LINENUMBER 144 L7
    ALOAD 1
    LDC "\u0000"
    INVOKEVIRTUAL java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
    ASTORE 3
   L8
    LINENUMBER 145 L8
    ALOAD 0
    ALOAD 3
    ICONST_0
    AALOAD
    PUTFIELD MinecraftBot2.a : Ljava/lang/String;
   L9
    LINENUMBER 146 L9
    ALOAD 0
    ALOAD 3
    ICONST_1
    AALOAD
    PUTFIELD MinecraftBot2.b : Ljava/lang/String;
   L10
    LINENUMBER 147 L10
    ALOAD 0
    ALOAD 3
    ICONST_2
    AALOAD
    PUTFIELD MinecraftBot2.c : Ljava/lang/String;
   L11
    LINENUMBER 148 L11
    ALOAD 3
    ICONST_3
    AALOAD
    ASTORE 1
   L12
    LINENUMBER 149 L12
    ALOAD 3
    ARRAYLENGTH
    ICONST_4
    IF_ICMPLE L13
   L14
    LINENUMBER 150 L14
    ALOAD 3
    ICONST_4
    AALOAD
    ASTORE 4
   L15
    LINENUMBER 151 L15
    ALOAD 4
    INVOKEVIRTUAL java/lang/String.isEmpty ()Z
    IFNE L16
    ALOAD 4
    LDC ";"
    INVOKEVIRTUAL java/lang/String.equals (Ljava/lang/Object;)Z
    IFEQ L17
   L16
    LINENUMBER 152 L16
   FRAME FULL [MinecraftBot2 java/lang/String T [Ljava/lang/String;] []
    ALOAD 0
    ACONST_NULL
    PUTFIELD MinecraftBot2.d : Ljava/lang/String;
    GOTO L18
   L17
    LINENUMBER 154 L17
   FRAME APPEND [java/lang/String]
    ALOAD 0
    ALOAD 4
    BIPUSH 59
    BIPUSH 32
    INVOKEVIRTUAL java/lang/String.replace (CC)Ljava/lang/String;
    PUTFIELD MinecraftBot2.d : Ljava/lang/String;
   L18
    LINENUMBER 157 L18
   FRAME CHOP 1
    ALOAD 0
    ALOAD 3
    ARRAYLENGTH
    ICONST_5
    IF_ICMPLE L19
    ALOAD 3
    ICONST_5
    AALOAD
    LDC "true"
    INVOKEVIRTUAL java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
    IFEQ L19
    ICONST_1
    GOTO L20
   L19
   FRAME FULL [MinecraftBot2 java/lang/String] [MinecraftBot2]
    ICONST_0
   L20
   FRAME FULL [MinecraftBot2 java/lang/String] [MinecraftBot2 I]
    PUTFIELD MinecraftBot2.a : Z
   L13
    LINENUMBER 159 L13
   FRAME SAME
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "CRASH! "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    GETFIELD MinecraftBot2.a : Z
    INVOKEVIRTUAL java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L21
    LINENUMBER 160 L21
    ALOAD 0
    ALOAD 1
    INVOKESTATIC MinecraftIPAddressResolver.a (Ljava/lang/String;)LMinecraftIPAddressResolver;
    PUTFIELD MinecraftBot2.a : LMinecraftIPAddressResolver;
   L22
    LINENUMBER 161 L22
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 5

  // access flags 0x9
  public static a()Ljavax/crypto/SecretKey;
    TRYCATCHBLOCK L0 L1 L2 java/lang/Exception
   L0
    LINENUMBER 171 L0
    LDC "AES"
    INVOKESTATIC javax/crypto/KeyGenerator.getInstance (Ljava/lang/String;)Ljavax/crypto/KeyGenerator;
    ASTORE 0
   L3
    LINENUMBER 172 L3
    ALOAD 0
    SIPUSH 128
    INVOKEVIRTUAL javax/crypto/KeyGenerator.init (I)V
   L4
    LINENUMBER 173 L4
    ALOAD 0
    INVOKEVIRTUAL javax/crypto/KeyGenerator.generateKey ()Ljavax/crypto/SecretKey;
   L1
    ARETURN
   L2
    LINENUMBER 174 L2
   FRAME SAME1 java/lang/Exception
    ASTORE 0
   L5
    LINENUMBER 175 L5
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
    LINENUMBER 181 L0
    NEW java/security/spec/X509EncodedKeySpec
    DUP
    ALOAD 0
    INVOKESPECIAL java/security/spec/X509EncodedKeySpec.<init> ([B)V
    ASTORE 1
   L3
    LINENUMBER 182 L3
    LDC "RSA"
    INVOKESTATIC java/security/KeyFactory.getInstance (Ljava/lang/String;)Ljava/security/KeyFactory;
    ASTORE 2
   L4
    LINENUMBER 183 L4
    ALOAD 2
    ALOAD 1
    INVOKEVIRTUAL java/security/KeyFactory.generatePublic (Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
   L1
    ARETURN
   L2
    LINENUMBER 184 L2
   FRAME FULL [] [java/lang/Exception]
    ASTORE 1
   L5
    LINENUMBER 185 L5
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
    LINENUMBER 191 L0
    LDC "AES/CFB8/NoPadding"
    INVOKESTATIC javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
    ASTORE 2
   L3
    LINENUMBER 192 L3
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
    LINENUMBER 193 L4
    ALOAD 2
   L1
    ARETURN
   L2
    LINENUMBER 194 L2
   FRAME FULL [] [java/lang/Exception]
    ASTORE 2
   L5
    LINENUMBER 195 L5
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
    LINENUMBER 201 L0
    ICONST_3
    ANEWARRAY [B
    DUP
    ICONST_0
    ALOAD 0
    LDC "ISO_8859_1"
   L3
    LINENUMBER 202 L3
    INVOKEVIRTUAL java/lang/String.getBytes (Ljava/lang/String;)[B
    AASTORE
    DUP
    ICONST_1
    ALOAD 2
   L4
    LINENUMBER 203 L4
    INVOKEINTERFACE javax/crypto/SecretKey.getEncoded ()[B (itf)
    AASTORE
    DUP
    ICONST_2
    ALOAD 1
   L5
    LINENUMBER 204 L5
    INVOKEINTERFACE java/security/PublicKey.getEncoded ()[B (itf)
    AASTORE
   L6
    LINENUMBER 201 L6
    INVOKESTATIC MinecraftBot2.a ([[B)[B
   L1
    ARETURN
   L2
    LINENUMBER 205 L2
   FRAME FULL [] [java/lang/Exception]
    ASTORE 3
   L7
    LINENUMBER 206 L7
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
    LINENUMBER 214 L0
    ILOAD 0
    ALOAD 1
    INVOKEINTERFACE java/security/Key.getAlgorithm ()Ljava/lang/String; (itf)
    ALOAD 1
    INVOKESTATIC MinecraftBot2.a (ILjava/lang/String;Ljava/security/Key;)Ljavax/crypto/Cipher;
    ALOAD 2
    INVOKEVIRTUAL javax/crypto/Cipher.doFinal ([B)[B
   L1
    ARETURN
   L2
    LINENUMBER 215 L2
   FRAME FULL [] [java/lang/Exception]
    ASTORE 3
   L3
    LINENUMBER 216 L3
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
    LINENUMBER 221 L0
    ALOAD 1
    INVOKESTATIC javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
    ASTORE 3
   L1
    LINENUMBER 222 L1
    ALOAD 3
    ILOAD 0
    ALOAD 2
    INVOKEVIRTUAL javax/crypto/Cipher.init (ILjava/security/Key;)V
   L2
    LINENUMBER 223 L2
    ALOAD 3
    ARETURN
    MAXSTACK = 3
    MAXLOCALS = 4

  // access flags 0x8A
  private static varargs a([[B)[B throws java/lang/Exception 
    // parameter  arr
   L0
    LINENUMBER 226 L0
    LDC "SHA-1"
    INVOKESTATIC java/security/MessageDigest.getInstance (Ljava/lang/String;)Ljava/security/MessageDigest;
    ASTORE 1
   L1
    LINENUMBER 227 L1
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
    LINENUMBER 228 L4
    ALOAD 1
    ALOAD 5
    INVOKEVIRTUAL java/security/MessageDigest.update ([B)V
   L5
    LINENUMBER 227 L5
    IINC 4 1
    GOTO L2
   L3
    LINENUMBER 229 L3
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
    LINENUMBER 252 L0
    ALOAD 0
    GETFIELD MinecraftBot2.b : Z
    IFEQ L1
    RETURN
   L1
    LINENUMBER 255 L1
   FRAME SAME
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "SEND DATA"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L2
    LINENUMBER 257 L2
    ALOAD 0
    ALOAD 1
    ICONST_M1
    ACONST_NULL
    ALOAD 0
    GETFIELD MinecraftBot2.a : Lio/netty/util/concurrent/FastThreadLocal;
    INVOKEVIRTUAL io/netty/util/concurrent/FastThreadLocal.get ()Ljava/lang/Object;
    CHECKCAST io/netty/buffer/ByteBuf
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.resetReaderIndex ()Lio/netty/buffer/ByteBuf;
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.retain ()Lio/netty/buffer/ByteBuf;
    INVOKEVIRTUAL MinecraftBot2.a (Lio/netty/channel/Channel;ILA;Lio/netty/buffer/ByteBuf;)V
   L3
    LINENUMBER 259 L3
    INVOKESTATIC io/netty/buffer/Unpooled.buffer ()Lio/netty/buffer/ByteBuf;
    ASTORE 2
   L4
    LINENUMBER 260 L4
    NEW M
    DUP
    INVOKESPECIAL M.<init> ()V
    ASTORE 3
   L5
    LINENUMBER 261 L5
    ALOAD 3
    ALOAD 0
    GETFIELD MinecraftBot2.b : Ljava/lang/String;
    PUTFIELD M.a : Ljava/lang/String;
   L6
    LINENUMBER 262 L6
    ALOAD 3
    ALOAD 2
    INVOKEVIRTUAL M.a (Lio/netty/buffer/ByteBuf;)V
   L7
    LINENUMBER 263 L7
    ALOAD 3
    ALOAD 2
    ACONST_NULL
    ALOAD 0
    GETFIELD MinecraftBot2.a : I
    INVOKEVIRTUAL M.b (Lio/netty/buffer/ByteBuf;Lr$a;I)V
   L8
    LINENUMBER 265 L8
    ALOAD 0
    ALOAD 1
    ICONST_M1
    ACONST_NULL
    ALOAD 2
    INVOKEVIRTUAL MinecraftBot2.a (Lio/netty/channel/Channel;ILA;Lio/netty/buffer/ByteBuf;)V
   L9
    LINENUMBER 268 L9
    ALOAD 0
    GETFIELD MinecraftBot2.a : LS;
    IFNULL L10
    ALOAD 0
    GETFIELD MinecraftBot2.a : LS;
    GETFIELD S.b : I
    BIPUSH 8
    IMUL
    SIPUSH 2000
    ISUB
    GOTO L11
   L10
   FRAME FULL [T io/netty/channel/Channel] []
    LDC 60000
   L11
   FRAME SAME1 I
    ISTORE 4
   L12
    LINENUMBER 269 L12
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
   L13
    LINENUMBER 270 L13
    ILOAD 4
    IFGT L14
   L15
    LINENUMBER 271 L15
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/Channel.close ()Lio/netty/channel/ChannelFuture; (itf)
    POP
   L16
    LINENUMBER 272 L16
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "AUTO CLOSE DIREKT"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
    GOTO L17
   L14
    LINENUMBER 275 L14
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
      MinecraftBot2.c(Lio/netty/channel/Channel;)V, 
      ()V
    ]
    ILOAD 4
    I2L
    GETSTATIC java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    INVOKEINTERFACE io/netty/channel/EventLoop.schedule (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/netty/util/concurrent/ScheduledFuture; (itf)
    POP
   L17
    LINENUMBER 281 L17
   FRAME FULL [] []
    RETURN
    MAXSTACK = 5
    MAXLOCALS = 5

  // access flags 0x1
  public a(Lio/netty/channel/Channel;ILA;Lio/netty/buffer/ByteBuf;)V
    // parameter  channel
    // parameter  integer
    // parameter  a
    // parameter  byteBuf
   L0
    LINENUMBER 323 L0
    ALOAD 1
    ALOAD 4
    ILOAD 2
    ALOAD 3
    INVOKESTATIC MinecraftFriendlyByteBuf.b (Lio/netty/buffer/ByteBuf;ILA;)Lio/netty/buffer/ByteBuf;
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;
    INVOKEINTERFACE io/netty/channel/Channel.writeAndFlush (Ljava/lang/Object;)Lio/netty/channel/ChannelFuture; (itf)
    POP
   L1
    LINENUMBER 324 L1
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
    LINENUMBER 326 L0
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/Channel.eventLoop ()Lio/netty/channel/EventLoop; (itf)
    ALOAD 0
    ALOAD 1
    ALOAD 4
    ILOAD 2
    ALOAD 3
    INVOKEDYNAMIC run(LMinecraftBot2;Lio/netty/channel/Channel;Ljava/lang/String;ILA;)Ljava/lang/Runnable; [
      // handle kind 0x6 : INVOKESTATIC
      java/lang/invoke/LambdaMetafactory.metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
      // arguments:
      ()V, 
      // handle kind 0x7 : INVOKESPECIAL
      MinecraftBot2.a(Lio/netty/channel/Channel;Ljava/lang/String;ILA;)V, 
      ()V
    ]
    LDC 1000
    GETSTATIC java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    INVOKEINTERFACE io/netty/channel/EventLoop.schedule (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/netty/util/concurrent/ScheduledFuture; (itf)
    POP
   L1
    LINENUMBER 359 L1
    RETURN
    MAXSTACK = 6
    MAXLOCALS = 5

  // access flags 0x1
  public a(Lio/netty/channel/Channel;ILA;)V
    // parameter  channel
    // parameter  integer
    // parameter  a
   L0
    LINENUMBER 362 L0
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/Channel.isActive ()Z (itf)
    IFNE L1
    RETURN
   L1
    LINENUMBER 363 L1
   FRAME SAME
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "QQQQQQQQQQQQQ"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L2
    LINENUMBER 364 L2
    NEW O
    DUP
    INVOKESPECIAL O.<init> ()V
    ASTORE 4
   L3
    LINENUMBER 365 L3
    ALOAD 4
    LDC "BungeeCord"
    INVOKEVIRTUAL O.a (Ljava/lang/String;)V
   L4
    LINENUMBER 366 L4
    ALOAD 4
    SIPUSH 32467
    NEWARRAY T_BYTE
    INVOKEVIRTUAL O.a ([B)V
   L5
    LINENUMBER 367 L5
    INVOKESTATIC io/netty/buffer/Unpooled.buffer ()Lio/netty/buffer/ByteBuf;
    ASTORE 5
   L6
    LINENUMBER 368 L6
    ALOAD 0
    GETFIELD MinecraftBot2.a : I
    SIPUSH 760
    IF_ICMPLT L7
   L8
    LINENUMBER 369 L8
    BIPUSH 13
    ALOAD 5
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L9
   L7
    LINENUMBER 370 L7
   FRAME APPEND [O io/netty/buffer/ByteBuf]
    ALOAD 0
    GETFIELD MinecraftBot2.a : I
    SIPUSH 759
    IF_ICMPLT L10
   L11
    LINENUMBER 371 L11
    BIPUSH 12
    ALOAD 5
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L9
   L10
    LINENUMBER 372 L10
   FRAME SAME
    ALOAD 0
    GETFIELD MinecraftBot2.a : I
    SIPUSH 755
    IF_ICMPLT L12
   L13
    LINENUMBER 373 L13
    BIPUSH 10
    ALOAD 5
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L9
   L12
    LINENUMBER 374 L12
   FRAME SAME
    ALOAD 0
    GETFIELD MinecraftBot2.a : I
    SIPUSH 477
    IF_ICMPLT L14
   L15
    LINENUMBER 375 L15
    BIPUSH 11
    ALOAD 5
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L9
   L14
    LINENUMBER 376 L14
   FRAME SAME
    ALOAD 0
    GETFIELD MinecraftBot2.a : I
    SIPUSH 393
    IF_ICMPLT L16
   L17
    LINENUMBER 377 L17
    BIPUSH 10
    ALOAD 5
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L9
   L16
    LINENUMBER 378 L16
   FRAME SAME
    ALOAD 0
    GETFIELD MinecraftBot2.a : I
    SIPUSH 338
    IF_ICMPLT L18
   L19
    LINENUMBER 379 L19
    BIPUSH 9
    ALOAD 5
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L9
   L18
    LINENUMBER 380 L18
   FRAME SAME
    ALOAD 0
    GETFIELD MinecraftBot2.a : I
    SIPUSH 335
    IF_ICMPLT L20
   L21
    LINENUMBER 381 L21
    BIPUSH 10
    ALOAD 5
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L9
   L20
    LINENUMBER 382 L20
   FRAME SAME
    ALOAD 0
    GETFIELD MinecraftBot2.a : I
    BIPUSH 107
    IF_ICMPLT L22
   L23
    LINENUMBER 383 L23
    BIPUSH 9
    ALOAD 5
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L9
   L22
    LINENUMBER 385 L22
   FRAME SAME
    BIPUSH 23
    ALOAD 5
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
   L9
    LINENUMBER 387 L9
   FRAME SAME
    ALOAD 4
    ALOAD 5
    GETSTATIC r$a.TO_SERVER : Lr$a;
    ALOAD 0
    GETFIELD MinecraftBot2.a : I
    INVOKEVIRTUAL O.b (Lio/netty/buffer/ByteBuf;Lr$a;I)V
   L24
    LINENUMBER 388 L24
    ALOAD 5
    ILOAD 2
    ALOAD 3
    INVOKESTATIC MinecraftFriendlyByteBuf.b (Lio/netty/buffer/ByteBuf;ILA;)Lio/netty/buffer/ByteBuf;
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;
    ASTORE 6
   L25
    LINENUMBER 390 L25
    NEW MinecraftBot2$a
    DUP
    INVOKESPECIAL MinecraftBot2$a.<init> ()V
    ASTORE 7
   L26
    LINENUMBER 391 L26
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/Channel.eventLoop ()Lio/netty/channel/EventLoop; (itf)
    ALOAD 7
    ALOAD 1
    ALOAD 6
    INVOKEDYNAMIC run(LMinecraftBot2$a;Lio/netty/channel/Channel;Lio/netty/buffer/ByteBuf;)Ljava/lang/Runnable; [
      // handle kind 0x6 : INVOKESTATIC
      java/lang/invoke/LambdaMetafactory.metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
      // arguments:
      ()V, 
      // handle kind 0x6 : INVOKESTATIC
      MinecraftBot2.a(LMinecraftBot2$a;Lio/netty/channel/Channel;Lio/netty/buffer/ByteBuf;)V, 
      ()V
    ]
    LCONST_0
    LCONST_1
    GETSTATIC java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    INVOKEINTERFACE io/netty/channel/EventLoop.scheduleAtFixedRate (Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lio/netty/util/concurrent/ScheduledFuture; (itf)
    ASTORE 8
   L27
    LINENUMBER 414 L27
    ALOAD 7
    ALOAD 8
    PUTFIELD MinecraftBot2$a.a : Lio/netty/util/concurrent/ScheduledFuture;
   L28
    LINENUMBER 418 L28
    RETURN
    MAXSTACK = 7
    MAXLOCALS = 9

  // access flags 0x1
  public b(Lio/netty/channel/Channel;)V
    // parameter  channel
   L0
    LINENUMBER 429 L0
    ALOAD 0
    GETFIELD MinecraftBot2.b : Z
    IFEQ L1
    RETURN
   L1
    LINENUMBER 430 L1
   FRAME SAME
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/Channel.config ()Lio/netty/channel/ChannelConfig; (itf)
    ICONST_1
    INVOKEINTERFACE io/netty/channel/ChannelConfig.setAutoRead (Z)Lio/netty/channel/ChannelConfig; (itf)
    POP
   L2
    LINENUMBER 436 L2
    NEW java/util/concurrent/atomic/AtomicReference
    DUP
    ICONST_M1
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    INVOKESPECIAL java/util/concurrent/atomic/AtomicReference.<init> (Ljava/lang/Object;)V
    ASTORE 2
   L3
    LINENUMBER 437 L3
    NEW java/util/concurrent/atomic/AtomicReference
    DUP
    ACONST_NULL
    INVOKESPECIAL java/util/concurrent/atomic/AtomicReference.<init> (Ljava/lang/Object;)V
    ASTORE 3
   L4
    LINENUMBER 438 L4
    NEW java/util/concurrent/atomic/AtomicReference
    DUP
    ICONST_0
    INVOKESTATIC java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
    INVOKESPECIAL java/util/concurrent/atomic/AtomicReference.<init> (Ljava/lang/Object;)V
    ASTORE 4
   L5
    LINENUMBER 440 L5
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; (itf)
    LDC "timeout"
    INVOKEINTERFACE io/netty/channel/ChannelPipeline.remove (Ljava/lang/String;)Lio/netty/channel/ChannelHandler; (itf)
    POP
   L6
    LINENUMBER 441 L6
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; (itf)
    LDC "splitter"
    NEW MinecraftPacketDecoder
    DUP
    INVOKESPECIAL MinecraftPacketDecoder.<init> ()V
    INVOKEINTERFACE io/netty/channel/ChannelPipeline.addFirst (Ljava/lang/String;Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelPipeline; (itf)
    LDC "splitter"
    LDC "packet-handler"
    NEW MinecraftBot2$2
    DUP
    ALOAD 0
    ICONST_1
    ALOAD 4
    ALOAD 1
    ALOAD 2
    ALOAD 3
    INVOKESPECIAL MinecraftBot2$2.<init> (LMinecraftBot2;ZLjava/util/concurrent/atomic/AtomicReference;Lio/netty/channel/Channel;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;)V
    INVOKEINTERFACE io/netty/channel/ChannelPipeline.addAfter (Ljava/lang/String;Ljava/lang/String;Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelPipeline; (itf)
    POP
   L7
    LINENUMBER 599 L7
    RETURN
    MAXSTACK = 11
    MAXLOCALS = 5

  // access flags 0x9
  public static a(ZLjavax/crypto/SecretKey;)Lv;
    // parameter  boolean1
    // parameter  secretKey
    TRYCATCHBLOCK L0 L1 L2 java/security/GeneralSecurityException
   L3
    LINENUMBER 602 L3
    NEW MinecraftPacketEncryption
    DUP
    INVOKESPECIAL MinecraftPacketEncryption.<init> ()V
    ASTORE 2
   L0
    LINENUMBER 605 L0
    ALOAD 2
    ILOAD 0
    ALOAD 1
    INVOKEINTERFACE v.a (ZLjavax/crypto/SecretKey;)V (itf)
   L1
    LINENUMBER 608 L1
    GOTO L4
   L2
    LINENUMBER 606 L2
   FRAME FULL [] [java/security/GeneralSecurityException]
    ASTORE 3
   L5
    LINENUMBER 607 L5
    NEW java/lang/RuntimeException
    DUP
    ALOAD 3
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/Throwable;)V
    ATHROW
   L4
    LINENUMBER 609 L4
   FRAME APPEND [T T MinecraftPacketEncryption]
    ALOAD 2
    ARETURN
    MAXSTACK = 3
    MAXLOCALS = 4

  // access flags 0x100A
  private static synthetic a(LMinecraftBot2$a;Lio/netty/channel/Channel;Lio/netty/buffer/ByteBuf;)V
    // parameter  a
    // parameter  channel
    // parameter  byteBuf
    TRYCATCHBLOCK L0 L1 L2 java/lang/Throwable
    TRYCATCHBLOCK L3 L4 L2 java/lang/Throwable
    TRYCATCHBLOCK L5 L6 L2 java/lang/Throwable
   L0
    LINENUMBER 395 L0
    ALOAD 0
    GETFIELD MinecraftBot2$a.a : Z
    IFEQ L3
   L1
    LINENUMBER 397 L1
    RETURN
   L3
    LINENUMBER 399 L3
   FRAME SAME
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/Channel.isActive ()Z (itf)
    IFNE L5
   L7
    LINENUMBER 401 L7
    ALOAD 0
    ICONST_1
    PUTFIELD MinecraftBot2$a.a : Z
   L8
    LINENUMBER 402 L8
    ALOAD 0
    GETFIELD MinecraftBot2$a.a : Lio/netty/util/concurrent/ScheduledFuture;
    ICONST_0
    INVOKEINTERFACE io/netty/util/concurrent/ScheduledFuture.cancel (Z)Z (itf)
    POP
   L4
    LINENUMBER 403 L4
    RETURN
   L5
    LINENUMBER 406 L5
   FRAME FULL [T io/netty/channel/Channel io/netty/buffer/ByteBuf] []
    ICONST_0
    ISTORE 3
   L9
   FRAME APPEND [I]
    ILOAD 3
    ICONST_5
    IF_ICMPGE L6
   L10
    LINENUMBER 407 L10
    ALOAD 1
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.resetReaderIndex ()Lio/netty/buffer/ByteBuf;
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.retain ()Lio/netty/buffer/ByteBuf;
    INVOKEINTERFACE io/netty/channel/Channel.writeAndFlush (Ljava/lang/Object;)Lio/netty/channel/ChannelFuture; (itf)
    GETSTATIC io/netty/channel/ChannelFutureListener.CLOSE_ON_FAILURE : Lio/netty/channel/ChannelFutureListener;
    INVOKEINTERFACE io/netty/channel/ChannelFuture.addListener (Lio/netty/util/concurrent/GenericFutureListener;)Lio/netty/channel/ChannelFuture; (itf)
    POP
   L11
    LINENUMBER 406 L11
    IINC 3 1
    GOTO L9
   L6
    LINENUMBER 411 L6
   FRAME FULL [] []
    GOTO L12
   L2
    LINENUMBER 409 L2
   FRAME SAME1 java/lang/Throwable
    ASTORE 3
   L13
    LINENUMBER 410 L13
    ALOAD 3
    INVOKEVIRTUAL java/lang/Throwable.printStackTrace ()V
   L12
    LINENUMBER 413 L12
   FRAME SAME
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x1002
  private synthetic a(Lio/netty/channel/Channel;Ljava/lang/String;ILA;)V
    // parameter  channel
    // parameter  string
    // parameter  integer
    // parameter  a
   L0
    LINENUMBER 327 L0
    ALOAD 1
    INVOKEINTERFACE io/netty/channel/Channel.isActive ()Z (itf)
    IFEQ L1
   L2
    LINENUMBER 328 L2
    ALOAD 0
    GETFIELD MinecraftBot2.a : I
    SIPUSH 759
    IF_ICMPLT L3
   L4
    LINENUMBER 329 L4
    NEW ClientChat
    DUP
    INVOKESPECIAL ClientChat.<init> ()V
    ASTORE 5
   L5
    LINENUMBER 330 L5
    ALOAD 5
    ALOAD 2
    INVOKEVIRTUAL ClientChat.a (Ljava/lang/String;)V
   L6
    LINENUMBER 331 L6
    ALOAD 5
    INVOKESTATIC java/lang/System.currentTimeMillis ()J
    INVOKEVIRTUAL ClientChat.a (J)V
   L7
    LINENUMBER 332 L7
    ALOAD 5
    LDC 2131234
    INVOKEVIRTUAL ClientChat.b (J)V
   L8
    LINENUMBER 333 L8
    ALOAD 5
    ICONST_0
    NEWARRAY T_BYTE
    INVOKEVIRTUAL ClientChat.a ([B)V
   L9
    LINENUMBER 334 L9
    ALOAD 5
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
   L10
    LINENUMBER 335 L10
    INVOKESTATIC io/netty/buffer/Unpooled.buffer ()Lio/netty/buffer/ByteBuf;
    ASTORE 6
   L11
    LINENUMBER 336 L11
    ALOAD 0
    GETFIELD MinecraftBot2.a : I
    SIPUSH 759
    IF_ICMPLE L12
    ICONST_5
    GOTO L13
   L12
   FRAME FULL [MinecraftBot2 io/netty/channel/Channel T I A ClientChat io/netty/buffer/ByteBuf] []
    ICONST_4
   L13
   FRAME SAME1 I
    ALOAD 6
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
   L14
    LINENUMBER 337 L14
    ALOAD 5
    ALOAD 6
    ACONST_NULL
    ALOAD 0
    GETFIELD MinecraftBot2.a : I
    INVOKEVIRTUAL ClientChat.b (Lio/netty/buffer/ByteBuf;Lr$a;I)V
   L15
    LINENUMBER 338 L15
    ALOAD 0
    ALOAD 1
    ILOAD 3
    ALOAD 4
    ALOAD 6
    INVOKEVIRTUAL MinecraftBot2.a (Lio/netty/channel/Channel;ILA;Lio/netty/buffer/ByteBuf;)V
   L16
    LINENUMBER 339 L16
    GOTO L1
   L3
    LINENUMBER 340 L3
   FRAME FULL [MinecraftBot2 io/netty/channel/Channel java/lang/String I A] []
    NEW Chat
    DUP
    INVOKESPECIAL Chat.<init> ()V
    ASTORE 5
   L17
    LINENUMBER 341 L17
    ALOAD 5
    ALOAD 2
    INVOKEVIRTUAL Chat.a (Ljava/lang/String;)V
   L18
    LINENUMBER 342 L18
    INVOKESTATIC io/netty/buffer/Unpooled.buffer ()Lio/netty/buffer/ByteBuf;
    ASTORE 6
   L19
    LINENUMBER 343 L19
    ALOAD 0
    GETFIELD MinecraftBot2.a : I
    SIPUSH 477
    IF_ICMPLT L20
   L21
    LINENUMBER 344 L21
    ICONST_3
    ALOAD 6
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L22
   L20
    LINENUMBER 345 L20
   FRAME FULL [MinecraftBot2 io/netty/channel/Channel T I A Chat io/netty/buffer/ByteBuf] []
    ALOAD 0
    GETFIELD MinecraftBot2.a : I
    SIPUSH 338
    IF_ICMPLT L23
   L24
    LINENUMBER 346 L24
    ICONST_2
    ALOAD 6
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L22
   L23
    LINENUMBER 347 L23
   FRAME SAME
    ALOAD 0
    GETFIELD MinecraftBot2.a : I
    SIPUSH 335
    IF_ICMPLT L25
   L26
    LINENUMBER 348 L26
    ICONST_3
    ALOAD 6
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L22
   L25
    LINENUMBER 349 L25
   FRAME SAME
    ALOAD 0
    GETFIELD MinecraftBot2.a : I
    BIPUSH 107
    IF_ICMPLT L27
   L28
    LINENUMBER 350 L28
    ICONST_2
    ALOAD 6
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
    GOTO L22
   L27
    LINENUMBER 352 L27
   FRAME SAME
    ICONST_1
    ALOAD 6
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
   L22
    LINENUMBER 354 L22
   FRAME SAME
    ALOAD 5
    ALOAD 6
    GETSTATIC r$a.TO_SERVER : Lr$a;
    ALOAD 0
    GETFIELD MinecraftBot2.a : I
    INVOKEVIRTUAL Chat.b (Lio/netty/buffer/ByteBuf;Lr$a;I)V
   L29
    LINENUMBER 355 L29
    ALOAD 0
    ALOAD 1
    ILOAD 3
    ALOAD 4
    ALOAD 6
    INVOKEVIRTUAL MinecraftBot2.a (Lio/netty/channel/Channel;ILA;Lio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 358 L1
   FRAME FULL [] []
    RETURN
    MAXSTACK = 6
    MAXLOCALS = 7

  // access flags 0x100A
  private static synthetic c(Lio/netty/channel/Channel;)V
    // parameter  channel
   L0
    LINENUMBER 276 L0
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "AUTO CLOSE"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L1
    LINENUMBER 277 L1
    ALOAD 0
    INVOKEINTERFACE io/netty/channel/Channel.config ()Lio/netty/channel/ChannelConfig; (itf)
    ICONST_0
    INVOKEINTERFACE io/netty/channel/ChannelConfig.setAutoRead (Z)Lio/netty/channel/ChannelConfig; (itf)
    POP
   L2
    LINENUMBER 278 L2
    ALOAD 0
    INVOKEINTERFACE io/netty/channel/Channel.close ()Lio/netty/channel/ChannelFuture; (itf)
    POP
   L3
    LINENUMBER 279 L3
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x8
  static <clinit>()V
    TRYCATCHBLOCK L0 L1 L2 java/net/MalformedURLException
   L0
    LINENUMBER 55 L0
    NEW java/net/URL
    DUP
    LDC "https://sessionserver.mojang.com/session/minecraft/join"
    INVOKESPECIAL java/net/URL.<init> (Ljava/lang/String;)V
    PUTSTATIC MinecraftBot2.a : Ljava/net/URL;
   L1
    LINENUMBER 58 L1
    GOTO L3
   L2
    LINENUMBER 56 L2
   FRAME SAME1 java/net/MalformedURLException
    ASTORE 0
   L4
    LINENUMBER 57 L4
    NEW java/lang/RuntimeException
    DUP
    ALOAD 0
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/Throwable;)V
    ATHROW
   L3
    LINENUMBER 167 L3
   FRAME SAME
    INVOKESTATIC java/util/concurrent/Executors.newCachedThreadPool ()Ljava/util/concurrent/ExecutorService;
    PUTSTATIC MinecraftBot2.a : Ljava/util/concurrent/ExecutorService;
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 1
}
