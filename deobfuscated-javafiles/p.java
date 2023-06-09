// class version 52.0 (52)
// access flags 0x21
public class P extends MinecraftFriendlyByteBuf {

  // compiled from: 

  ATTRIBUTE Code : unknown
  // access flags 0x4019
  public final static enum INNERCLASS r$a r a

  // access flags 0x2
  private I a

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 13 L0
    ICONST_3
    ALOAD 1
    INVOKESTATIC P.a (ILio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 14 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;Lr$a;I)V
    // parameter  byteBuf
    // parameter  a
    // parameter  integer
   L0
    LINENUMBER 18 L0
    ALOAD 0
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)I
    PUTFIELD P.a : I
   L1
    LINENUMBER 19 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x1
  public b(Lio/netty/buffer/ByteBuf;Lr$a;I)V
    // parameter  byteBuf
    // parameter  a
    // parameter  integer
   L0
    LINENUMBER 23 L0
    ALOAD 0
    GETFIELD P.a : I
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 24 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x1
  public a()I
   L0
    LINENUMBER 29 L0
    ALOAD 0
    GETFIELD P.a : I
    IRETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a(I)V
    // parameter  integer
   L0
    LINENUMBER 33 L0
    ALOAD 0
    ILOAD 1
    PUTFIELD P.a : I
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
    LDC "SetCompression(threshold="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL P.a ()I
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
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

  // access flags 0x1
  public <init>(I)V
    // parameter  integer
   L0
    LINENUMBER 44 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 45 L1
    ALOAD 0
    ILOAD 1
    PUTFIELD P.a : I
   L2
    LINENUMBER 46 L2
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public equals(Ljava/lang/Object;)Z
    // parameter  o
   L0
    LINENUMBER 50 L0
    ALOAD 1
    ALOAD 0
    IF_ACMPNE L1
   L2
    LINENUMBER 51 L2
    ICONST_1
    IRETURN
   L1
    LINENUMBER 53 L1
   FRAME SAME
    ALOAD 1
    INSTANCEOF P
    IFNE L3
   L4
    LINENUMBER 54 L4
    ICONST_0
    IRETURN
   L3
    LINENUMBER 56 L3
   FRAME SAME
    ALOAD 1
    CHECKCAST P
    ASTORE 2
   L5
    LINENUMBER 57 L5
    ALOAD 2
    ALOAD 0
    INVOKEVIRTUAL P.a (Ljava/lang/Object;)Z
    IFEQ L6
    ALOAD 0
    INVOKEVIRTUAL P.a ()I
    ALOAD 2
    INVOKEVIRTUAL P.a ()I
    IF_ICMPNE L6
    ICONST_1
    GOTO L7
   L6
   FRAME CHOP 2
    ICONST_0
   L7
   FRAME SAME1 I
    IRETURN
   L8
    LOCALVARIABLE this LP; L0 L8 0
    LOCALVARIABLE o Ljava/lang/Object; L0 L8 1
    MAXSTACK = 2
    MAXLOCALS = 3

  // access flags 0x4
  protected a(Ljava/lang/Object;)Z
    // parameter  object
   L0
    LINENUMBER 61 L0
    ALOAD 1
    INSTANCEOF P
    IRETURN
    MAXSTACK = 1
    MAXLOCALS = 2

  // access flags 0x1
  public hashCode()I
   L0
    LINENUMBER 66 L0
    BIPUSH 59
    ISTORE 1
   L1
    LINENUMBER 67 L1
    ICONST_1
    ISTORE 2
   L2
    LINENUMBER 68 L2
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 0
    INVOKEVIRTUAL P.a ()I
    IADD
    ISTORE 2
   L3
    LINENUMBER 69 L3
    ILOAD 2
    IRETURN
    MAXSTACK = 2
    MAXLOCALS = 3
}
