// class version 52.0 (52)
// access flags 0x21
public class O extends MinecraftFriendlyByteBuf {

  // compiled from: 

  ATTRIBUTE Code : unknown
  // access flags 0x4019
  public final static enum INNERCLASS r$a r a
  // access flags 0x0
  INNERCLASS O$1 null null

  // access flags 0x19
  // signature Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/String;>;
  // declaration: a extends java.util.function.Function<java.lang.String, java.lang.String>
  public final static Ljava/util/function/Function; a

  // access flags 0x2
  private Ljava/lang/String; a

  // access flags 0x2
  private [B a

  // access flags 0x2
  private Z a

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 19 L0
    NEW java/lang/UnsupportedOperationException
    DUP
    LDC "multiple versions"
    INVOKESPECIAL java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
    ATHROW
    MAXSTACK = 3
    MAXLOCALS = 2

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;Lr$a;I)V
    // parameter  byteBuf
    // parameter  a
    // parameter  integer
   L0
    LINENUMBER 24 L0
    ALOAD 0
    ILOAD 3
    SIPUSH 393
    IF_ICMPLT L1
    GETSTATIC O.a : Ljava/util/function/Function;
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)Ljava/lang/String;
    INVOKEINTERFACE java/util/function/Function.apply (Ljava/lang/Object;)Ljava/lang/Object; (itf)
    CHECKCAST java/lang/String
    GOTO L2
   L1
   FRAME FULL [O io/netty/buffer/ByteBuf r$a] [O]
    ALOAD 1
    BIPUSH 20
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;I)Ljava/lang/String;
   L2
   FRAME FULL [O io/netty/buffer/ByteBuf r$a] [O java/lang/String]
    PUTFIELD O.a : Ljava/lang/String;
   L3
    LINENUMBER 25 L3
    ALOAD 2
    GETSTATIC r$a.TO_SERVER : Lr$a;
    IF_ACMPNE L4
    SIPUSH 32767
    GOTO L5
   L4
   FRAME CHOP 1
    LDC 1048576
   L5
   FRAME SAME1 I
    ISTORE 4
   L6
    LINENUMBER 26 L6
    ALOAD 1
    ALOAD 0
    ALOAD 1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readableBytes ()I
    NEWARRAY T_BYTE
    DUP_X1
    PUTFIELD O.a : [B
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readBytes ([B)Lio/netty/buffer/ByteBuf;
    POP
   L7
    LINENUMBER 27 L7
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 5

  // access flags 0x1
  public b(Lio/netty/buffer/ByteBuf;Lr$a;I)V
    // parameter  byteBuf
    // parameter  a
    // parameter  integer
   L0
    LINENUMBER 31 L0
    ILOAD 3
    SIPUSH 393
    IF_ICMPLT L1
    GETSTATIC O.a : Ljava/util/function/Function;
    ALOAD 0
    GETFIELD O.a : Ljava/lang/String;
    INVOKEINTERFACE java/util/function/Function.apply (Ljava/lang/Object;)Ljava/lang/Object; (itf)
    CHECKCAST java/lang/String
    GOTO L2
   L1
   FRAME CHOP 2
    ALOAD 0
    GETFIELD O.a : Ljava/lang/String;
   L2
   FRAME SAME1 java/lang/String
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Ljava/lang/String;Lio/netty/buffer/ByteBuf;)V
   L3
    LINENUMBER 32 L3
    ALOAD 1
    ALOAD 0
    GETFIELD O.a : [B
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBytes ([B)Lio/netty/buffer/ByteBuf;
    POP
   L4
    LINENUMBER 33 L4
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x1
  public a()Ljava/io/DataInput;
   L0
    LINENUMBER 38 L0
    NEW java/io/DataInputStream
    DUP
    NEW java/io/ByteArrayInputStream
    DUP
    ALOAD 0
    GETFIELD O.a : [B
    INVOKESPECIAL java/io/ByteArrayInputStream.<init> ([B)V
    INVOKESPECIAL java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
    ARETURN
    MAXSTACK = 5
    MAXLOCALS = 1

  // access flags 0x1
  public a()Ljava/lang/String;
   L0
    LINENUMBER 42 L0
    ALOAD 0
    GETFIELD O.a : Ljava/lang/String;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a()[B
   L0
    LINENUMBER 46 L0
    ALOAD 0
    GETFIELD O.a : [B
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a()Z
   L0
    LINENUMBER 50 L0
    ALOAD 0
    GETFIELD O.a : Z
    IRETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a(Ljava/lang/String;)V
    // parameter  string
   L0
    LINENUMBER 54 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD O.a : Ljava/lang/String;
   L1
    LINENUMBER 55 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public a([B)V
    // parameter  arr
   L0
    LINENUMBER 58 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD O.a : [B
   L1
    LINENUMBER 59 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public a(Z)V
    // parameter  boolean1
   L0
    LINENUMBER 62 L0
    ALOAD 0
    ILOAD 1
    PUTFIELD O.a : Z
   L1
    LINENUMBER 63 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public toString()Ljava/lang/String;
   L0
    LINENUMBER 67 L0
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "PluginMessage(tag="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL O.a ()Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC ", data="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL O.a ()[B
    INVOKESTATIC java/util/Arrays.toString ([B)Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC ", allowExtendedPacket="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL O.a ()Z
    INVOKEVIRTUAL java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
    LDC ")"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ARETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 70 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 71 L1
    ALOAD 0
    ICONST_0
    PUTFIELD O.a : Z
   L2
    LINENUMBER 72 L2
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x1
  public <init>(Ljava/lang/String;[BZ)V
    // parameter  string
    // parameter  arr
    // parameter  boolean3
   L0
    LINENUMBER 74 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 75 L1
    ALOAD 0
    ICONST_0
    PUTFIELD O.a : Z
   L2
    LINENUMBER 76 L2
    ALOAD 0
    ALOAD 1
    PUTFIELD O.a : Ljava/lang/String;
   L3
    LINENUMBER 77 L3
    ALOAD 0
    ALOAD 2
    PUTFIELD O.a : [B
   L4
    LINENUMBER 78 L4
    ALOAD 0
    ILOAD 3
    PUTFIELD O.a : Z
   L5
    LINENUMBER 79 L5
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x1
  public equals(Ljava/lang/Object;)Z
    // parameter  o
   L0
    LINENUMBER 83 L0
    ALOAD 1
    ALOAD 0
    IF_ACMPNE L1
   L2
    LINENUMBER 84 L2
    ICONST_1
    IRETURN
   L1
    LINENUMBER 86 L1
   FRAME SAME
    ALOAD 1
    INSTANCEOF O
    IFNE L3
   L4
    LINENUMBER 87 L4
    ICONST_0
    IRETURN
   L3
    LINENUMBER 89 L3
   FRAME SAME
    ALOAD 1
    CHECKCAST O
    ASTORE 2
   L5
    LINENUMBER 90 L5
    ALOAD 2
    ALOAD 0
    INVOKEVIRTUAL O.a (Ljava/lang/Object;)Z
    IFNE L6
   L7
    LINENUMBER 91 L7
    ICONST_0
    IRETURN
   L6
    LINENUMBER 93 L6
   FRAME FULL [O T O] []
    ALOAD 0
    INVOKEVIRTUAL O.a ()Z
    ALOAD 2
    INVOKEVIRTUAL O.a ()Z
    IF_ICMPEQ L8
   L9
    LINENUMBER 94 L9
    ICONST_0
    IRETURN
   L8
    LINENUMBER 96 L8
   FRAME SAME
    ALOAD 0
    INVOKEVIRTUAL O.a ()Ljava/lang/String;
    ASTORE 3
   L10
    LINENUMBER 97 L10
    ALOAD 2
    INVOKEVIRTUAL O.a ()Ljava/lang/String;
    ASTORE 4
   L11
    LINENUMBER 98 L11
    ALOAD 3
    IFNONNULL L12
   L13
    LINENUMBER 99 L13
    ALOAD 4
    IFNONNULL L14
   L15
    LINENUMBER 100 L15
    ALOAD 0
    INVOKEVIRTUAL O.a ()[B
    ALOAD 2
    INVOKEVIRTUAL O.a ()[B
    INVOKESTATIC java/util/Arrays.equals ([B[B)Z
    IRETURN
   L12
    LINENUMBER 103 L12
   FRAME APPEND [java/lang/String java/lang/String]
    ALOAD 3
    ALOAD 4
    INVOKEVIRTUAL java/lang/Object.equals (Ljava/lang/Object;)Z
    IFEQ L14
   L16
    LINENUMBER 104 L16
    ALOAD 0
    INVOKEVIRTUAL O.a ()[B
    ALOAD 2
    INVOKEVIRTUAL O.a ()[B
    INVOKESTATIC java/util/Arrays.equals ([B[B)Z
    IRETURN
   L14
    LINENUMBER 106 L14
   FRAME FULL [] []
    ICONST_0
    IRETURN
   L17
    LOCALVARIABLE this LO; L0 L17 0
    LOCALVARIABLE o Ljava/lang/Object; L0 L17 1
    MAXSTACK = 2
    MAXLOCALS = 5

  // access flags 0x4
  protected a(Ljava/lang/Object;)Z
    // parameter  object
   L0
    LINENUMBER 110 L0
    ALOAD 1
    INSTANCEOF O
    IRETURN
    MAXSTACK = 1
    MAXLOCALS = 2

  // access flags 0x1
  public hashCode()I
   L0
    LINENUMBER 115 L0
    BIPUSH 59
    ISTORE 1
   L1
    LINENUMBER 116 L1
    ICONST_1
    ISTORE 2
   L2
    LINENUMBER 117 L2
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 0
    INVOKEVIRTUAL O.a ()Z
    IFEQ L3
    BIPUSH 79
    GOTO L4
   L3
   FRAME SAME1 I
    BIPUSH 97
   L4
   FRAME FULL [O] [I I]
    IADD
    ISTORE 2
   L5
    LINENUMBER 118 L5
    ALOAD 0
    INVOKEVIRTUAL O.a ()Ljava/lang/String;
    ASTORE 3
   L6
    LINENUMBER 119 L6
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 3
    IFNONNULL L7
    BIPUSH 43
    GOTO L8
   L7
   FRAME FULL [O T T java/lang/String] [I]
    ALOAD 3
    INVOKEVIRTUAL java/lang/Object.hashCode ()I
   L8
   FRAME FULL [O] [I I]
    IADD
    ISTORE 2
   L9
    LINENUMBER 120 L9
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 0
    INVOKEVIRTUAL O.a ()[B
    INVOKESTATIC java/util/Arrays.hashCode ([B)I
    IADD
    ISTORE 2
   L10
    LINENUMBER 121 L10
    ILOAD 2
    IRETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x8
  static <clinit>()V
   L0
    LINENUMBER 125 L0
    NEW O$1
    DUP
    INVOKESPECIAL O$1.<init> ()V
    PUTSTATIC O.a : Ljava/util/function/Function;
   L1
    LINENUMBER 140 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 0
}
