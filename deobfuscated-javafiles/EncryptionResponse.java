// class version 52.0 (52)
// access flags 0x21
public class EncryptionResponse extends MinecraftFriendlyByteBuf {

  // compiled from: 

  ATTRIBUTE Code : unknown
  // access flags 0x9
  public static INNERCLASS EncryptionResponse$a EncryptionResponse a
  // access flags 0x4019
  public final static enum INNERCLASS r$a r a

  // access flags 0x2
  private [B a

  // access flags 0x2
  private [B b

  // access flags 0x2
  private LEncryptionResponse$a; a

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 20 L0
    ICONST_1
    ALOAD 1
    INVOKESTATIC EncryptionResponse.a (ILio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 21 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;Lr$a;I)V
    // parameter  byteBuf
    // parameter  a
    // parameter  integer
   L0
    LINENUMBER 25 L0
    ALOAD 0
    ALOAD 1
    SIPUSH 128
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;I)[B
    PUTFIELD EncryptionResponse.a : [B
   L1
    LINENUMBER 26 L1
    ILOAD 3
    SIPUSH 759
    IF_ICMPLT L2
    ALOAD 1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readBoolean ()Z
    IFEQ L3
   L2
    LINENUMBER 27 L2
   FRAME CHOP 2
    ALOAD 0
    ALOAD 1
    SIPUSH 128
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;I)[B
    PUTFIELD EncryptionResponse.b : [B
    GOTO L4
   L3
    LINENUMBER 29 L3
   FRAME SAME
    ALOAD 0
    NEW EncryptionResponse$a
    DUP
    ALOAD 1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readLong ()J
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.b (Lio/netty/buffer/ByteBuf;)[B
    INVOKESPECIAL EncryptionResponse$a.<init> (J[B)V
    PUTFIELD EncryptionResponse.a : LEncryptionResponse$a;
   L4
    LINENUMBER 31 L4
   FRAME CHOP 2
    RETURN
    MAXSTACK = 6
    MAXLOCALS = 4

  // access flags 0x1
  public b(Lio/netty/buffer/ByteBuf;Lr$a;I)V
    // parameter  byteBuf
    // parameter  a
    // parameter  integer
   L0
    LINENUMBER 35 L0
    ALOAD 0
    GETFIELD EncryptionResponse.a : [B
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a ([BLio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 36 L1
    ALOAD 0
    GETFIELD EncryptionResponse.b : [B
    IFNULL L2
   L3
    LINENUMBER 37 L3
    ILOAD 3
    SIPUSH 759
    IF_ICMPLT L4
   L5
    LINENUMBER 38 L5
    ALOAD 1
    ICONST_1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
    POP
   L4
    LINENUMBER 40 L4
   FRAME CHOP 2
    ALOAD 0
    GETFIELD EncryptionResponse.b : [B
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a ([BLio/netty/buffer/ByteBuf;)V
    GOTO L6
   L2
    LINENUMBER 42 L2
   FRAME SAME
    ALOAD 1
    ALOAD 0
    GETFIELD EncryptionResponse.a : LEncryptionResponse$a;
    INVOKEVIRTUAL EncryptionResponse$a.a ()J
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeLong (J)Lio/netty/buffer/ByteBuf;
    POP
   L7
    LINENUMBER 43 L7
    ALOAD 0
    GETFIELD EncryptionResponse.a : LEncryptionResponse$a;
    INVOKEVIRTUAL EncryptionResponse$a.a ()[B
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a ([BLio/netty/buffer/ByteBuf;)V
   L6
    LINENUMBER 45 L6
   FRAME CHOP 2
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 4

  // access flags 0x1
  public a()[B
   L0
    LINENUMBER 49 L0
    ALOAD 0
    GETFIELD EncryptionResponse.a : [B
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public b()[B
   L0
    LINENUMBER 53 L0
    ALOAD 0
    GETFIELD EncryptionResponse.b : [B
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a()LEncryptionResponse$a;
   L0
    LINENUMBER 57 L0
    ALOAD 0
    GETFIELD EncryptionResponse.a : LEncryptionResponse$a;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a([B)V
    // parameter  arr
   L0
    LINENUMBER 61 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD EncryptionResponse.a : [B
   L1
    LINENUMBER 62 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public b([B)V
    // parameter  arr
   L0
    LINENUMBER 65 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD EncryptionResponse.b : [B
   L1
    LINENUMBER 66 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public a(LEncryptionResponse$a;)V
    // parameter  a
   L0
    LINENUMBER 69 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD EncryptionResponse.a : LEncryptionResponse$a;
   L1
    LINENUMBER 70 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public toString()Ljava/lang/String;
   L0
    LINENUMBER 74 L0
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "EncryptionResponse(sharedSecret="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL EncryptionResponse.a ()[B
    INVOKESTATIC java/util/Arrays.toString ([B)Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC ", verifyToken="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL EncryptionResponse.b ()[B
    INVOKESTATIC java/util/Arrays.toString ([B)Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC ", encryptionData="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL EncryptionResponse.a ()LEncryptionResponse$a;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    LDC ")"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ARETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 77 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 78 L1
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public <init>([B[BLEncryptionResponse$a;)V
    // parameter  arr1
    // parameter  arr2
    // parameter  a
   L0
    LINENUMBER 80 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 81 L1
    ALOAD 0
    ALOAD 1
    PUTFIELD EncryptionResponse.a : [B
   L2
    LINENUMBER 82 L2
    ALOAD 0
    ALOAD 2
    PUTFIELD EncryptionResponse.b : [B
   L3
    LINENUMBER 83 L3
    ALOAD 0
    ALOAD 3
    PUTFIELD EncryptionResponse.a : LEncryptionResponse$a;
   L4
    LINENUMBER 84 L4
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x1
  public <init>(Ljavax/crypto/SecretKey;Ljava/security/PublicKey;[BLEncryptionResponse$a;)V
    // parameter  secretKey
    // parameter  publicKey
    // parameter  arr
    // parameter  a
   L0
    LINENUMBER 86 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 87 L1
    ALOAD 0
    ALOAD 2
    ALOAD 1
    INVOKEINTERFACE javax/crypto/SecretKey.getEncoded ()[B (itf)
    INVOKESTATIC EncryptionResponse.a (Ljava/security/Key;[B)[B
    PUTFIELD EncryptionResponse.a : [B
   L2
    LINENUMBER 88 L2
    ALOAD 0
    ALOAD 2
    ALOAD 3
    INVOKESTATIC EncryptionResponse.a (Ljava/security/Key;[B)[B
    PUTFIELD EncryptionResponse.b : [B
   L3
    LINENUMBER 89 L3
    ALOAD 0
    ALOAD 4
    PUTFIELD EncryptionResponse.a : LEncryptionResponse$a;
   L4
    LINENUMBER 90 L4
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 5

  // access flags 0x9
  public static a(Ljava/security/Key;[B)[B
    // parameter  key
    // parameter  arr
   L0
    LINENUMBER 95 L0
    ICONST_1
    ALOAD 0
    ALOAD 1
    INVOKESTATIC EncryptionResponse.a (ILjava/security/Key;[B)[B
    ARETURN
    MAXSTACK = 3
    MAXLOCALS = 2

  // access flags 0xA
  private static a(ILjava/security/Key;[B)[B
    // parameter  integer
    // parameter  key
    // parameter  arr
    TRYCATCHBLOCK L0 L1 L2 java/lang/Exception
   L0
    LINENUMBER 100 L0
    ILOAD 0
    ALOAD 1
    INVOKEINTERFACE java/security/Key.getAlgorithm ()Ljava/lang/String; (itf)
    ALOAD 1
    INVOKESTATIC EncryptionResponse.a (ILjava/lang/String;Ljava/security/Key;)Ljavax/crypto/Cipher;
    ALOAD 2
    INVOKEVIRTUAL javax/crypto/Cipher.doFinal ([B)[B
   L1
    ARETURN
   L2
    LINENUMBER 102 L2
   FRAME FULL [] [java/lang/Exception]
    ASTORE 3
   L3
    LINENUMBER 104 L3
    ALOAD 3
    INVOKEVIRTUAL java/lang/Exception.printStackTrace ()V
   L4
    LINENUMBER 106 L4
    ACONST_NULL
    ARETURN
    MAXSTACK = 3
    MAXLOCALS = 4

  // access flags 0xA
  private static a(ILjava/lang/String;Ljava/security/Key;)Ljavax/crypto/Cipher;
    // parameter  integer
    // parameter  string
    // parameter  key
    TRYCATCHBLOCK L0 L1 L2 java/lang/Exception
   L0
    LINENUMBER 111 L0
    ALOAD 1
    INVOKESTATIC javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
    ASTORE 3
   L3
    LINENUMBER 112 L3
    ALOAD 3
    ILOAD 0
    ALOAD 2
    INVOKEVIRTUAL javax/crypto/Cipher.init (ILjava/security/Key;)V
   L4
    LINENUMBER 113 L4
    ALOAD 3
   L1
    ARETURN
   L2
    LINENUMBER 114 L2
   FRAME FULL [] [java/lang/Exception]
    ASTORE 3
   L5
    LINENUMBER 115 L5
    ALOAD 3
    INVOKEVIRTUAL java/lang/Exception.printStackTrace ()V
   L6
    LINENUMBER 117 L6
    ACONST_NULL
    ARETURN
    MAXSTACK = 3
    MAXLOCALS = 4

  // access flags 0x1
  public equals(Ljava/lang/Object;)Z
    // parameter  o
   L0
    LINENUMBER 122 L0
    ALOAD 1
    ALOAD 0
    IF_ACMPNE L1
   L2
    LINENUMBER 123 L2
    ICONST_1
    IRETURN
   L1
    LINENUMBER 125 L1
   FRAME SAME
    ALOAD 1
    INSTANCEOF EncryptionResponse
    IFNE L3
   L4
    LINENUMBER 126 L4
    ICONST_0
    IRETURN
   L3
    LINENUMBER 128 L3
   FRAME SAME
    ALOAD 1
    CHECKCAST EncryptionResponse
    ASTORE 2
   L5
    LINENUMBER 129 L5
    ALOAD 2
    ALOAD 0
    INVOKEVIRTUAL EncryptionResponse.a (Ljava/lang/Object;)Z
    IFNE L6
   L7
    LINENUMBER 130 L7
    ICONST_0
    IRETURN
   L6
    LINENUMBER 132 L6
   FRAME FULL [EncryptionResponse T EncryptionResponse] []
    ALOAD 0
    INVOKEVIRTUAL EncryptionResponse.a ()[B
    ALOAD 2
    INVOKEVIRTUAL EncryptionResponse.a ()[B
    INVOKESTATIC java/util/Arrays.equals ([B[B)Z
    IFNE L8
   L9
    LINENUMBER 133 L9
    ICONST_0
    IRETURN
   L8
    LINENUMBER 135 L8
   FRAME SAME
    ALOAD 0
    INVOKEVIRTUAL EncryptionResponse.b ()[B
    ALOAD 2
    INVOKEVIRTUAL EncryptionResponse.b ()[B
    INVOKESTATIC java/util/Arrays.equals ([B[B)Z
    IFNE L10
   L11
    LINENUMBER 136 L11
    ICONST_0
    IRETURN
   L10
    LINENUMBER 138 L10
   FRAME SAME
    ALOAD 0
    INVOKEVIRTUAL EncryptionResponse.a ()LEncryptionResponse$a;
    ASTORE 3
   L12
    LINENUMBER 139 L12
    ALOAD 2
    INVOKEVIRTUAL EncryptionResponse.a ()LEncryptionResponse$a;
    ASTORE 4
   L13
    LINENUMBER 140 L13
    ALOAD 3
    IFNONNULL L14
   L15
    LINENUMBER 141 L15
    ALOAD 4
    IFNONNULL L16
   L17
    LINENUMBER 142 L17
    ICONST_1
    IRETURN
   L14
    LINENUMBER 144 L14
   FRAME FULL [T T T EncryptionResponse$a EncryptionResponse$a] []
    ALOAD 3
    ALOAD 4
    INVOKEVIRTUAL java/lang/Object.equals (Ljava/lang/Object;)Z
    IFEQ L16
   L18
    LINENUMBER 145 L18
    ICONST_1
    IRETURN
   L16
    LINENUMBER 147 L16
   FRAME FULL [] []
    ICONST_0
    IRETURN
   L19
    LOCALVARIABLE this LEncryptionResponse; L0 L19 0
    LOCALVARIABLE o Ljava/lang/Object; L0 L19 1
    MAXSTACK = 2
    MAXLOCALS = 5

  // access flags 0x4
  protected a(Ljava/lang/Object;)Z
    // parameter  object
   L0
    LINENUMBER 151 L0
    ALOAD 1
    INSTANCEOF EncryptionResponse
    IRETURN
    MAXSTACK = 1
    MAXLOCALS = 2

  // access flags 0x1
  public hashCode()I
   L0
    LINENUMBER 156 L0
    BIPUSH 59
    ISTORE 1
   L1
    LINENUMBER 157 L1
    ICONST_1
    ISTORE 2
   L2
    LINENUMBER 158 L2
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 0
    INVOKEVIRTUAL EncryptionResponse.a ()[B
    INVOKESTATIC java/util/Arrays.hashCode ([B)I
    IADD
    ISTORE 2
   L3
    LINENUMBER 159 L3
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 0
    INVOKEVIRTUAL EncryptionResponse.b ()[B
    INVOKESTATIC java/util/Arrays.hashCode ([B)I
    IADD
    ISTORE 2
   L4
    LINENUMBER 160 L4
    ALOAD 0
    INVOKEVIRTUAL EncryptionResponse.a ()LEncryptionResponse$a;
    ASTORE 3
   L5
    LINENUMBER 161 L5
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 3
    IFNONNULL L6
    BIPUSH 43
    GOTO L7
   L6
   FRAME FULL [T T T EncryptionResponse$a] [I]
    ALOAD 3
    INVOKEVIRTUAL java/lang/Object.hashCode ()I
   L7
   FRAME FULL [] [I I]
    IADD
    ISTORE 2
   L8
    LINENUMBER 162 L8
    ILOAD 2
    IRETURN
    MAXSTACK = 2
    MAXLOCALS = 4
}
