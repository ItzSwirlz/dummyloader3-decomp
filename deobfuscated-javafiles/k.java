// class version 52.0 (52)
// access flags 0x21
public class K extends MinecraftFriendlyByteBuf {

  // compiled from: 

  ATTRIBUTE Code : unknown

  // access flags 0x2
  private Ljava/lang/String; a

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 14 L0
    RETURN
    MAXSTACK = 0
    MAXLOCALS = 2

  // access flags 0x1
  public b(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 18 L0
    ALOAD 0
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)Ljava/lang/String;
    PUTFIELD K.a : Ljava/lang/String;
   L1
    LINENUMBER 19 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public c(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 23 L0
    ALOAD 0
    GETFIELD K.a : Ljava/lang/String;
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Ljava/lang/String;Lio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 24 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public a()Ljava/lang/String;
   L0
    LINENUMBER 29 L0
    ALOAD 0
    GETFIELD K.a : Ljava/lang/String;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a(Ljava/lang/String;)V
    // parameter  string
   L0
    LINENUMBER 33 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD K.a : Ljava/lang/String;
   L1
    LINENUMBER 34 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public toString()Ljava/lang/String;
   L0
    LINENUMBER 38 L0
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "Kick(message="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL K.a ()Ljava/lang/String;
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
    LINENUMBER 41 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 42 L1
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x9
  public static a(I)I
    // parameter  integer
   L0
    LINENUMBER 56 L0
    ILOAD 0
    SIPUSH 760
    IF_ICMPLT L1
   L2
    LINENUMBER 57 L2
    BIPUSH 25
    IRETURN
   L1
    LINENUMBER 59 L1
   FRAME SAME
    ILOAD 0
    SIPUSH 759
    IF_ICMPLT L3
   L4
    LINENUMBER 60 L4
    BIPUSH 23
    IRETURN
   L3
    LINENUMBER 62 L3
   FRAME SAME
    ILOAD 0
    SIPUSH 755
    IF_ICMPLT L5
   L6
    LINENUMBER 63 L6
    BIPUSH 26
    IRETURN
   L5
    LINENUMBER 65 L5
   FRAME SAME
    ILOAD 0
    SIPUSH 751
    IF_ICMPLT L7
   L8
    LINENUMBER 66 L8
    BIPUSH 25
    IRETURN
   L7
    LINENUMBER 68 L7
   FRAME SAME
    ILOAD 0
    SIPUSH 735
    IF_ICMPLT L9
   L10
    LINENUMBER 69 L10
    BIPUSH 26
    IRETURN
   L9
    LINENUMBER 71 L9
   FRAME SAME
    ILOAD 0
    SIPUSH 573
    IF_ICMPLT L11
   L12
    LINENUMBER 72 L12
    BIPUSH 27
    IRETURN
   L11
    LINENUMBER 74 L11
   FRAME SAME
    ILOAD 0
    SIPUSH 477
    IF_ICMPLT L13
   L14
    LINENUMBER 75 L14
    BIPUSH 26
    IRETURN
   L13
    LINENUMBER 77 L13
   FRAME SAME
    ILOAD 0
    SIPUSH 393
    IF_ICMPLT L15
   L16
    LINENUMBER 78 L16
    BIPUSH 27
    IRETURN
   L15
    LINENUMBER 80 L15
   FRAME SAME
    ILOAD 0
    BIPUSH 107
    IF_ICMPLT L17
   L18
    LINENUMBER 81 L18
    BIPUSH 26
    IRETURN
   L17
    LINENUMBER 83 L17
   FRAME SAME
    ILOAD 0
    BIPUSH 47
    IF_ICMPLT L19
   L20
    LINENUMBER 84 L20
    BIPUSH 64
    IRETURN
   L19
    LINENUMBER 86 L19
   FRAME CHOP 1
    BIPUSH 64
    IRETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x1
  public <init>(Ljava/lang/String;)V
    // parameter  string
   L0
    LINENUMBER 89 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 90 L1
    ALOAD 0
    ALOAD 1
    PUTFIELD K.a : Ljava/lang/String;
   L2
    LINENUMBER 91 L2
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public equals(Ljava/lang/Object;)Z
    // parameter  o
   L0
    LINENUMBER 95 L0
    ALOAD 1
    ALOAD 0
    IF_ACMPNE L1
   L2
    LINENUMBER 96 L2
    ICONST_1
    IRETURN
   L1
    LINENUMBER 98 L1
   FRAME SAME
    ALOAD 1
    INSTANCEOF K
    IFNE L3
   L4
    LINENUMBER 99 L4
    ICONST_0
    IRETURN
   L3
    LINENUMBER 101 L3
   FRAME SAME
    ALOAD 1
    CHECKCAST K
    ASTORE 2
   L5
    LINENUMBER 102 L5
    ALOAD 2
    ALOAD 0
    INVOKEVIRTUAL K.a (Ljava/lang/Object;)Z
    IFNE L6
   L7
    LINENUMBER 103 L7
    ICONST_0
    IRETURN
   L6
    LINENUMBER 105 L6
   FRAME FULL [K T K] []
    ALOAD 0
    INVOKEVIRTUAL K.a ()Ljava/lang/String;
    ASTORE 3
   L8
    LINENUMBER 106 L8
    ALOAD 2
    INVOKEVIRTUAL K.a ()Ljava/lang/String;
    ASTORE 4
   L9
    LINENUMBER 107 L9
    ALOAD 3
    IFNONNULL L10
   L11
    LINENUMBER 108 L11
    ALOAD 4
    IFNONNULL L12
   L13
    LINENUMBER 109 L13
    ICONST_1
    IRETURN
   L10
    LINENUMBER 112 L10
   FRAME FULL [T T T java/lang/String java/lang/String] []
    ALOAD 3
    ALOAD 4
    INVOKEVIRTUAL java/lang/Object.equals (Ljava/lang/Object;)Z
    IFEQ L12
   L14
    LINENUMBER 113 L14
    ICONST_1
    IRETURN
   L12
    LINENUMBER 115 L12
   FRAME FULL [] []
    ICONST_0
    IRETURN
   L15
    LOCALVARIABLE this LK; L0 L15 0
    LOCALVARIABLE o Ljava/lang/Object; L0 L15 1
    MAXSTACK = 2
    MAXLOCALS = 5

  // access flags 0x4
  protected a(Ljava/lang/Object;)Z
    // parameter  object
   L0
    LINENUMBER 119 L0
    ALOAD 1
    INSTANCEOF K
    IRETURN
    MAXSTACK = 1
    MAXLOCALS = 2

  // access flags 0x1
  public hashCode()I
   L0
    LINENUMBER 124 L0
    BIPUSH 59
    ISTORE 1
   L1
    LINENUMBER 125 L1
    ICONST_1
    ISTORE 2
   L2
    LINENUMBER 126 L2
    ALOAD 0
    INVOKEVIRTUAL K.a ()Ljava/lang/String;
    ASTORE 3
   L3
    LINENUMBER 127 L3
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 3
    IFNONNULL L4
    BIPUSH 43
    GOTO L5
   L4
   FRAME FULL [T T T java/lang/String] [I]
    ALOAD 3
    INVOKEVIRTUAL java/lang/Object.hashCode ()I
   L5
   FRAME FULL [] [I I]
    IADD
    ISTORE 2
   L6
    LINENUMBER 128 L6
    ILOAD 2
    IRETURN
    MAXSTACK = 2
    MAXLOCALS = 4
}
