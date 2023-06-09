// class version 52.0 (52)
// access flags 0x21
public class EncryptionRequest extends MinecraftFriendlyByteBuf {

  // compiled from: 

  ATTRIBUTE Code : unknown
  // access flags 0x4019
  public final static enum INNERCLASS r$a r a

  // access flags 0x2
  private Ljava/lang/String; a

  // access flags 0x2
  private [B a

  // access flags 0x2
  private [B b

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;Lr$a;I)V
    // parameter  byteBuf
    // parameter  a
    // parameter  integer
   L0
    LINENUMBER 17 L0
    ALOAD 0
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)Ljava/lang/String;
    PUTFIELD EncryptionRequest.a : Ljava/lang/String;
   L1
    LINENUMBER 18 L1
    ALOAD 0
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.b (Lio/netty/buffer/ByteBuf;)[B
    PUTFIELD EncryptionRequest.a : [B
   L2
    LINENUMBER 19 L2
    ALOAD 0
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.b (Lio/netty/buffer/ByteBuf;)[B
    PUTFIELD EncryptionRequest.b : [B
   L3
    LINENUMBER 20 L3
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x1
  public b(Lio/netty/buffer/ByteBuf;Lr$a;I)V
    // parameter  byteBuf
    // parameter  a
    // parameter  integer
   L0
    LINENUMBER 24 L0
    ALOAD 0
    GETFIELD EncryptionRequest.a : Ljava/lang/String;
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Ljava/lang/String;Lio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 25 L1
    ALOAD 0
    GETFIELD EncryptionRequest.a : [B
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a ([BLio/netty/buffer/ByteBuf;)V
   L2
    LINENUMBER 26 L2
    ALOAD 0
    GETFIELD EncryptionRequest.b : [B
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a ([BLio/netty/buffer/ByteBuf;)V
   L3
    LINENUMBER 27 L3
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x1
  public a()Ljava/lang/String;
   L0
    LINENUMBER 32 L0
    ALOAD 0
    GETFIELD EncryptionRequest.a : Ljava/lang/String;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a()[B
   L0
    LINENUMBER 36 L0
    ALOAD 0
    GETFIELD EncryptionRequest.a : [B
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public b()[B
   L0
    LINENUMBER 40 L0
    ALOAD 0
    GETFIELD EncryptionRequest.b : [B
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a(Ljava/lang/String;)V
    // parameter  string
   L0
    LINENUMBER 44 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD EncryptionRequest.a : Ljava/lang/String;
   L1
    LINENUMBER 45 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public a([B)V
    // parameter  arr
   L0
    LINENUMBER 48 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD EncryptionRequest.a : [B
   L1
    LINENUMBER 49 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public b([B)V
    // parameter  arr
   L0
    LINENUMBER 52 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD EncryptionRequest.b : [B
   L1
    LINENUMBER 53 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public toString()Ljava/lang/String;
   L0
    LINENUMBER 57 L0
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "EncryptionRequest(serverId="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL EncryptionRequest.a ()Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC ", publicKey="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL EncryptionRequest.a ()[B
    INVOKESTATIC java/util/Arrays.toString ([B)Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC ", verifyToken="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL EncryptionRequest.b ()[B
    INVOKESTATIC java/util/Arrays.toString ([B)Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC ")"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ARETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 60 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 61 L1
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public <init>(Ljava/lang/String;[B[B)V
    // parameter  string
    // parameter  arr2
    // parameter  arr3
   L0
    LINENUMBER 63 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 64 L1
    ALOAD 0
    ALOAD 1
    PUTFIELD EncryptionRequest.a : Ljava/lang/String;
   L2
    LINENUMBER 65 L2
    ALOAD 0
    ALOAD 2
    PUTFIELD EncryptionRequest.a : [B
   L3
    LINENUMBER 66 L3
    ALOAD 0
    ALOAD 3
    PUTFIELD EncryptionRequest.b : [B
   L4
    LINENUMBER 67 L4
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x1
  public equals(Ljava/lang/Object;)Z
    // parameter  o
   L0
    LINENUMBER 71 L0
    ALOAD 1
    ALOAD 0
    IF_ACMPNE L1
   L2
    LINENUMBER 72 L2
    ICONST_1
    IRETURN
   L1
    LINENUMBER 74 L1
   FRAME SAME
    ALOAD 1
    INSTANCEOF EncryptionRequest
    IFNE L3
   L4
    LINENUMBER 75 L4
    ICONST_0
    IRETURN
   L3
    LINENUMBER 77 L3
   FRAME SAME
    ALOAD 1
    CHECKCAST EncryptionRequest
    ASTORE 2
   L5
    LINENUMBER 78 L5
    ALOAD 2
    ALOAD 0
    INVOKEVIRTUAL EncryptionRequest.a (Ljava/lang/Object;)Z
    IFNE L6
   L7
    LINENUMBER 79 L7
    ICONST_0
    IRETURN
   L6
    LINENUMBER 81 L6
   FRAME FULL [EncryptionRequest T EncryptionRequest] []
    ALOAD 0
    INVOKEVIRTUAL EncryptionRequest.a ()Ljava/lang/String;
    ASTORE 3
   L8
    LINENUMBER 82 L8
    ALOAD 2
    INVOKEVIRTUAL EncryptionRequest.a ()Ljava/lang/String;
    ASTORE 4
   L9
    LINENUMBER 83 L9
    ALOAD 3
    IFNONNULL L10
   L11
    LINENUMBER 84 L11
    ALOAD 4
    IFNONNULL L12
   L13
    LINENUMBER 85 L13
    ALOAD 0
    INVOKEVIRTUAL EncryptionRequest.a ()[B
    ALOAD 2
    INVOKEVIRTUAL EncryptionRequest.a ()[B
    INVOKESTATIC java/util/Arrays.equals ([B[B)Z
    IFEQ L14
    ALOAD 0
    INVOKEVIRTUAL EncryptionRequest.b ()[B
    ALOAD 2
    INVOKEVIRTUAL EncryptionRequest.b ()[B
    INVOKESTATIC java/util/Arrays.equals ([B[B)Z
    IFEQ L14
    ICONST_1
    GOTO L15
   L14
   FRAME CHOP 3
    ICONST_0
   L15
   FRAME SAME1 I
    IRETURN
   L10
    LINENUMBER 88 L10
   FRAME FULL [EncryptionRequest T EncryptionRequest java/lang/String java/lang/String] []
    ALOAD 3
    ALOAD 4
    INVOKEVIRTUAL java/lang/Object.equals (Ljava/lang/Object;)Z
    IFEQ L12
   L16
    LINENUMBER 89 L16
    ALOAD 0
    INVOKEVIRTUAL EncryptionRequest.a ()[B
    ALOAD 2
    INVOKEVIRTUAL EncryptionRequest.a ()[B
    INVOKESTATIC java/util/Arrays.equals ([B[B)Z
    IFEQ L17
    ALOAD 0
    INVOKEVIRTUAL EncryptionRequest.b ()[B
    ALOAD 2
    INVOKEVIRTUAL EncryptionRequest.b ()[B
    INVOKESTATIC java/util/Arrays.equals ([B[B)Z
    IFEQ L17
    ICONST_1
    GOTO L18
   L17
   FRAME FULL [] []
    ICONST_0
   L18
   FRAME SAME1 I
    IRETURN
   L12
    LINENUMBER 91 L12
   FRAME SAME
    ICONST_0
    IRETURN
   L19
    LOCALVARIABLE this LEncryptionRequest; L0 L19 0
    LOCALVARIABLE o Ljava/lang/Object; L0 L19 1
    MAXSTACK = 2
    MAXLOCALS = 5

  // access flags 0x4
  protected a(Ljava/lang/Object;)Z
    // parameter  object
   L0
    LINENUMBER 95 L0
    ALOAD 1
    INSTANCEOF EncryptionRequest
    IRETURN
    MAXSTACK = 1
    MAXLOCALS = 2

  // access flags 0x1
  public hashCode()I
   L0
    LINENUMBER 100 L0
    BIPUSH 59
    ISTORE 1
   L1
    LINENUMBER 101 L1
    ICONST_1
    ISTORE 2
   L2
    LINENUMBER 102 L2
    ALOAD 0
    INVOKEVIRTUAL EncryptionRequest.a ()Ljava/lang/String;
    ASTORE 3
   L3
    LINENUMBER 103 L3
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 3
    IFNONNULL L4
    BIPUSH 43
    GOTO L5
   L4
   FRAME FULL [EncryptionRequest T T java/lang/String] [I]
    ALOAD 3
    INVOKEVIRTUAL java/lang/Object.hashCode ()I
   L5
   FRAME FULL [EncryptionRequest] [I I]
    IADD
    ISTORE 2
   L6
    LINENUMBER 104 L6
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 0
    INVOKEVIRTUAL EncryptionRequest.a ()[B
    INVOKESTATIC java/util/Arrays.hashCode ([B)I
    IADD
    ISTORE 2
   L7
    LINENUMBER 105 L7
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 0
    INVOKEVIRTUAL EncryptionRequest.b ()[B
    INVOKESTATIC java/util/Arrays.hashCode ([B)I
    IADD
    ISTORE 2
   L8
    LINENUMBER 106 L8
    ILOAD 2
    IRETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 111 L0
    ALOAD 1
    ICONST_1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeByte (I)Lio/netty/buffer/ByteBuf;
    POP
   L1
    LINENUMBER 112 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2
}
