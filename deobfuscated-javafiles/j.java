// class version 52.0 (52)
// access flags 0x21
public class J extends MinecraftFriendlyByteBuf {

  // compiled from: 

  ATTRIBUTE Code : unknown
  // access flags 0x4019
  public final static enum INNERCLASS r$a r a

  // access flags 0x2
  private J a

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 14 L0
    RETURN
    MAXSTACK = 0
    MAXLOCALS = 2

  // access flags 0x9
  public static b(Lio/netty/buffer/ByteBuf;I)V
    // parameter  byteBuf
    // parameter  integer
   L0
    LINENUMBER 17 L0
    ILOAD 1
    INVOKESTATIC J.a (I)I
    ALOAD 0
    INVOKESTATIC J.a (ILio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 18 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x9
  public static a(I)I
    // parameter  integer
   L0
    LINENUMBER 32 L0
    ILOAD 0
    SIPUSH 760
    IF_ICMPLT L1
   L2
    LINENUMBER 33 L2
    BIPUSH 18
    IRETURN
   L1
    LINENUMBER 34 L1
   FRAME SAME
    ILOAD 0
    SIPUSH 759
    IF_ICMPLT L3
   L4
    LINENUMBER 35 L4
    BIPUSH 17
    IRETURN
   L3
    LINENUMBER 36 L3
   FRAME SAME
    ILOAD 0
    SIPUSH 755
    IF_ICMPLT L5
   L6
    LINENUMBER 37 L6
    BIPUSH 15
    IRETURN
   L5
    LINENUMBER 38 L5
   FRAME SAME
    ILOAD 0
    SIPUSH 735
    IF_ICMPLT L7
   L8
    LINENUMBER 39 L8
    BIPUSH 16
    IRETURN
   L7
    LINENUMBER 40 L7
   FRAME SAME
    ILOAD 0
    SIPUSH 477
    IF_ICMPLT L9
   L10
    LINENUMBER 41 L10
    BIPUSH 15
    IRETURN
   L9
    LINENUMBER 42 L9
   FRAME SAME
    ILOAD 0
    SIPUSH 393
    IF_ICMPLT L11
   L12
    LINENUMBER 43 L12
    BIPUSH 14
    IRETURN
   L11
    LINENUMBER 44 L11
   FRAME SAME
    ILOAD 0
    SIPUSH 338
    IF_ICMPLT L13
   L14
    LINENUMBER 45 L14
    BIPUSH 11
    IRETURN
   L13
    LINENUMBER 46 L13
   FRAME SAME
    ILOAD 0
    SIPUSH 335
    IF_ICMPLT L15
   L16
    LINENUMBER 47 L16
    BIPUSH 12
    IRETURN
   L15
    LINENUMBER 48 L15
   FRAME SAME
    ILOAD 0
    BIPUSH 107
    IF_ICMPLT L17
   L18
    LINENUMBER 49 L18
    BIPUSH 11
    IRETURN
   L17
    LINENUMBER 50 L17
   FRAME SAME
    ILOAD 0
    BIPUSH 47
    IF_ICMPLT L19
   L20
    LINENUMBER 51 L20
    ICONST_0
    IRETURN
   L19
    LINENUMBER 53 L19
   FRAME CHOP 1
    ICONST_0
    IRETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x9
  public static b(I)I
    // parameter  integer
   L0
    LINENUMBER 70 L0
    ILOAD 0
    SIPUSH 760
    IF_ICMPLT L1
   L2
    LINENUMBER 71 L2
    BIPUSH 32
    IRETURN
   L1
    LINENUMBER 73 L1
   FRAME SAME
    ILOAD 0
    SIPUSH 759
    IF_ICMPLT L3
   L4
    LINENUMBER 74 L4
    BIPUSH 30
    IRETURN
   L3
    LINENUMBER 76 L3
   FRAME SAME
    ILOAD 0
    SIPUSH 755
    IF_ICMPLT L5
   L6
    LINENUMBER 77 L6
    BIPUSH 33
    IRETURN
   L5
    LINENUMBER 79 L5
   FRAME SAME
    ILOAD 0
    SIPUSH 751
    IF_ICMPLT L7
   L8
    LINENUMBER 80 L8
    BIPUSH 31
    IRETURN
   L7
    LINENUMBER 82 L7
   FRAME SAME
    ILOAD 0
    SIPUSH 735
    IF_ICMPLT L9
   L10
    LINENUMBER 83 L10
    BIPUSH 32
    IRETURN
   L9
    LINENUMBER 85 L9
   FRAME SAME
    ILOAD 0
    SIPUSH 573
    IF_ICMPLT L11
   L12
    LINENUMBER 86 L12
    BIPUSH 33
    IRETURN
   L11
    LINENUMBER 88 L11
   FRAME SAME
    ILOAD 0
    SIPUSH 477
    IF_ICMPLT L13
   L14
    LINENUMBER 89 L14
    BIPUSH 32
    IRETURN
   L13
    LINENUMBER 91 L13
   FRAME SAME
    ILOAD 0
    SIPUSH 393
    IF_ICMPLT L15
   L16
    LINENUMBER 92 L16
    BIPUSH 33
    IRETURN
   L15
    LINENUMBER 94 L15
   FRAME SAME
    ILOAD 0
    BIPUSH 107
    IF_ICMPLT L17
   L18
    LINENUMBER 95 L18
    BIPUSH 31
    IRETURN
   L17
    LINENUMBER 97 L17
   FRAME CHOP 1
    ICONST_0
    IRETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;Lr$a;I)V
    // parameter  byteBuf
    // parameter  a
    // parameter  integer
   L0
    LINENUMBER 102 L0
    ALOAD 0
    ILOAD 3
    SIPUSH 340
    IF_ICMPLT L1
    ALOAD 1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readLong ()J
    GOTO L2
   L1
   FRAME FULL [T io/netty/buffer/ByteBuf] [J]
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)I
    I2L
   L2
   FRAME FULL [] [J J]
    PUTFIELD J.a : J
   L3
    LINENUMBER 103 L3
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 4

  // access flags 0x1
  public b(Lio/netty/buffer/ByteBuf;Lr$a;I)V
    // parameter  byteBuf
    // parameter  a
    // parameter  integer
   L0
    LINENUMBER 107 L0
    ILOAD 3
    SIPUSH 340
    IF_ICMPLT L1
   L2
    LINENUMBER 108 L2
    ALOAD 1
    ALOAD 0
    GETFIELD J.a : J
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeLong (J)Lio/netty/buffer/ByteBuf;
    POP
    GOTO L3
   L1
    LINENUMBER 111 L1
   FRAME CHOP 2
    ALOAD 0
    GETFIELD J.a : J
    L2I
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
   L3
    LINENUMBER 113 L3
   FRAME CHOP 2
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 4

  // access flags 0x1
  public a()J
   L0
    LINENUMBER 117 L0
    ALOAD 0
    GETFIELD J.a : J
    LRETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x1
  public a(J)V
    // parameter  long1
   L0
    LINENUMBER 121 L0
    ALOAD 0
    LLOAD 1
    PUTFIELD J.a : J
   L1
    LINENUMBER 122 L1
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 3

  // access flags 0x1
  public toString()Ljava/lang/String;
   L0
    LINENUMBER 126 L0
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "KeepAlive(randomId="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL J.a ()J
    INVOKEVIRTUAL java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
    LDC ")"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ARETURN
    MAXSTACK = 3
    MAXLOCALS = 1

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 129 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 130 L1
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public <init>(J)V
    // parameter  long1
   L0
    LINENUMBER 132 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 133 L1
    ALOAD 0
    LLOAD 1
    PUTFIELD J.a : J
   L2
    LINENUMBER 134 L2
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 3

  // access flags 0x1
  public equals(Ljava/lang/Object;)Z
    // parameter  o
   L0
    LINENUMBER 138 L0
    ALOAD 1
    ALOAD 0
    IF_ACMPNE L1
   L2
    LINENUMBER 139 L2
    ICONST_1
    IRETURN
   L1
    LINENUMBER 141 L1
   FRAME SAME
    ALOAD 1
    INSTANCEOF J
    IFNE L3
   L4
    LINENUMBER 142 L4
    ICONST_0
    IRETURN
   L3
    LINENUMBER 144 L3
   FRAME SAME
    ALOAD 1
    CHECKCAST J
    ASTORE 2
   L5
    LINENUMBER 145 L5
    ALOAD 2
    ALOAD 0
    INVOKEVIRTUAL J.a (Ljava/lang/Object;)Z
    IFEQ L6
    ALOAD 0
    INVOKEVIRTUAL J.a ()J
    ALOAD 2
    INVOKEVIRTUAL J.a ()J
    LCMP
    IFNE L6
    ICONST_1
    GOTO L7
   L6
   FRAME CHOP 2
    ICONST_0
   L7
   FRAME SAME1 I
    IRETURN
   L8
    LOCALVARIABLE this LJ; L0 L8 0
    LOCALVARIABLE o Ljava/lang/Object; L0 L8 1
    MAXSTACK = 4
    MAXLOCALS = 3

  // access flags 0x4
  protected a(Ljava/lang/Object;)Z
    // parameter  object
   L0
    LINENUMBER 149 L0
    ALOAD 1
    INSTANCEOF J
    IRETURN
    MAXSTACK = 1
    MAXLOCALS = 2

  // access flags 0x1
  public hashCode()I
   L0
    LINENUMBER 154 L0
    BIPUSH 59
    ISTORE 1
   L1
    LINENUMBER 155 L1
    ICONST_1
    ISTORE 2
   L2
    LINENUMBER 156 L2
    ALOAD 0
    INVOKEVIRTUAL J.a ()J
    LSTORE 3
   L3
    LINENUMBER 157 L3
    ILOAD 2
    BIPUSH 59
    IMUL
    LLOAD 3
    BIPUSH 32
    LUSHR
    LLOAD 3
    LXOR
    L2I
    IADD
    ISTORE 2
   L4
    LINENUMBER 158 L4
    ILOAD 2
    IRETURN
    MAXSTACK = 5
    MAXLOCALS = 5
}
