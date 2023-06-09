// class version 52.0 (52)
// access flags 0x21
public class L extends MinecraftFriendlyByteBuf {

  // compiled from: 

  ATTRIBUTE Code : unknown

  // access flags 0x2
  private I a

  // access flags 0x2
  private [B a

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 15 L0
    ICONST_2
    ALOAD 1
    INVOKESTATIC L.a (ILio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 16 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public b(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 20 L0
    ALOAD 0
    ALOAD 1
    INVOKESTATIC L.a (Lio/netty/buffer/ByteBuf;)I
    PUTFIELD L.a : I
   L1
    LINENUMBER 21 L1
    ALOAD 1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readBoolean ()Z
    IFEQ L2
   L3
    LINENUMBER 22 L3
    ALOAD 1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readableBytes ()I
    ISTORE 2
   L4
    LINENUMBER 23 L4
    ILOAD 2
    LDC 1048576
    IF_ICMPLE L5
   L6
    LINENUMBER 24 L6
    NEW java/lang/RuntimeException
    DUP
    LDC "Payload may not be larger than 1048576 bytes"
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/String;)V
    ATHROW
   L5
    LINENUMBER 26 L5
   FRAME APPEND [I]
    ALOAD 0
    ILOAD 2
    NEWARRAY T_BYTE
    PUTFIELD L.a : [B
   L7
    LINENUMBER 27 L7
    ALOAD 1
    ALOAD 0
    GETFIELD L.a : [B
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readBytes ([B)Lio/netty/buffer/ByteBuf;
    POP
   L2
    LINENUMBER 29 L2
   FRAME CHOP 3
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 3

  // access flags 0x1
  public c(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 33 L0
    ALOAD 0
    GETFIELD L.a : I
    ALOAD 1
    INVOKESTATIC L.a (ILio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 34 L1
    ALOAD 0
    GETFIELD L.a : [B
    IFNULL L2
   L3
    LINENUMBER 35 L3
    ALOAD 1
    ICONST_1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
    POP
   L4
    LINENUMBER 36 L4
    ALOAD 1
    ALOAD 0
    GETFIELD L.a : [B
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBytes ([B)Lio/netty/buffer/ByteBuf;
    POP
    GOTO L5
   L2
    LINENUMBER 38 L2
   FRAME FULL [T io/netty/buffer/ByteBuf] []
    ALOAD 1
    ICONST_0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
    POP
   L5
    LINENUMBER 40 L5
   FRAME CHOP 2
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public a()I
   L0
    LINENUMBER 45 L0
    ALOAD 0
    GETFIELD L.a : I
    IRETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a()[B
   L0
    LINENUMBER 49 L0
    ALOAD 0
    GETFIELD L.a : [B
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a(I)V
    // parameter  integer
   L0
    LINENUMBER 53 L0
    ALOAD 0
    ILOAD 1
    PUTFIELD L.a : I
   L1
    LINENUMBER 54 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public a([B)V
    // parameter  arr
   L0
    LINENUMBER 57 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD L.a : [B
   L1
    LINENUMBER 58 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public toString()Ljava/lang/String;
   L0
    LINENUMBER 62 L0
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "LoginPayloadResponse(id="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL L.a ()I
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    LDC ", data="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL L.a ()[B
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
    LINENUMBER 65 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 66 L1
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public <init>(I[B)V
    // parameter  integer
    // parameter  arr
   L0
    LINENUMBER 68 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 69 L1
    ALOAD 0
    ILOAD 1
    PUTFIELD L.a : I
   L2
    LINENUMBER 70 L2
    ALOAD 0
    ALOAD 2
    PUTFIELD L.a : [B
   L3
    LINENUMBER 71 L3
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 3

  // access flags 0x1
  public equals(Ljava/lang/Object;)Z
    // parameter  o
   L0
    LINENUMBER 75 L0
    ALOAD 1
    ALOAD 0
    IF_ACMPNE L1
   L2
    LINENUMBER 76 L2
    ICONST_1
    IRETURN
   L1
    LINENUMBER 78 L1
   FRAME SAME
    ALOAD 1
    INSTANCEOF L
    IFNE L3
   L4
    LINENUMBER 79 L4
    ICONST_0
    IRETURN
   L3
    LINENUMBER 81 L3
   FRAME SAME
    ALOAD 1
    CHECKCAST L
    ASTORE 2
   L5
    LINENUMBER 82 L5
    ALOAD 2
    ALOAD 0
    INVOKEVIRTUAL L.a (Ljava/lang/Object;)Z
    IFNE L6
   L7
    LINENUMBER 83 L7
    ICONST_0
    IRETURN
   L6
    LINENUMBER 85 L6
   FRAME FULL [L T L] []
    ALOAD 0
    INVOKEVIRTUAL L.a ()I
    ALOAD 2
    INVOKEVIRTUAL L.a ()I
    IF_ICMPEQ L8
   L9
    LINENUMBER 86 L9
    ICONST_0
    IRETURN
   L8
    LINENUMBER 88 L8
   FRAME SAME
    ALOAD 0
    INVOKEVIRTUAL L.a ()[B
    ALOAD 2
    INVOKEVIRTUAL L.a ()[B
    INVOKESTATIC java/util/Arrays.equals ([B[B)Z
    IRETURN
   L10
    LOCALVARIABLE this LL; L0 L10 0
    LOCALVARIABLE o Ljava/lang/Object; L0 L10 1
    MAXSTACK = 2
    MAXLOCALS = 3

  // access flags 0x4
  protected a(Ljava/lang/Object;)Z
    // parameter  object
   L0
    LINENUMBER 92 L0
    ALOAD 1
    INSTANCEOF L
    IRETURN
    MAXSTACK = 1
    MAXLOCALS = 2

  // access flags 0x1
  public hashCode()I
   L0
    LINENUMBER 97 L0
    BIPUSH 59
    ISTORE 1
   L1
    LINENUMBER 98 L1
    ICONST_1
    ISTORE 2
   L2
    LINENUMBER 99 L2
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 0
    INVOKEVIRTUAL L.a ()I
    IADD
    ISTORE 2
   L3
    LINENUMBER 100 L3
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 0
    INVOKEVIRTUAL L.a ()[B
    INVOKESTATIC java/util/Arrays.hashCode ([B)I
    IADD
    ISTORE 2
   L4
    LINENUMBER 101 L4
    ILOAD 2
    IRETURN
    MAXSTACK = 2
    MAXLOCALS = 3
}
