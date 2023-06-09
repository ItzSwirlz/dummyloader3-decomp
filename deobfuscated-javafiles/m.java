// class version 52.0 (52)
// access flags 0x21
public class M extends MinecraftFriendlyByteBuf {

  // compiled from: 

  ATTRIBUTE Code : unknown
  // access flags 0x4019
  public final static enum INNERCLASS r$a r a

  // access flags 0x1
  public Ljava/lang/String; a

  // access flags 0x1
  public Lp; a

  // access flags 0x1
  public Ljava/util/UUID; a

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 11 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 20 L0
    ICONST_0
    ALOAD 1
    INVOKESTATIC M.a (ILio/netty/buffer/ByteBuf;)V
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
    LINENUMBER 26 L0
    ALOAD 0
    ALOAD 1
    BIPUSH 16
    INVOKESTATIC M.a (Lio/netty/buffer/ByteBuf;I)Ljava/lang/String;
    PUTFIELD M.a : Ljava/lang/String;
   L1
    LINENUMBER 27 L1
    ILOAD 3
    SIPUSH 759
    IF_ICMPLT L2
   L3
    LINENUMBER 29 L3
    ALOAD 0
    ALOAD 1
    INVOKESTATIC M.a (Lio/netty/buffer/ByteBuf;)Lp;
    PUTFIELD M.a : Lp;
   L4
    LINENUMBER 31 L4
    ILOAD 3
    SIPUSH 760
    IF_ICMPLT L2
   L5
    LINENUMBER 33 L5
    ALOAD 1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readBoolean ()Z
    IFEQ L2
   L6
    LINENUMBER 35 L6
    ALOAD 0
    ALOAD 1
    INVOKESTATIC M.a (Lio/netty/buffer/ByteBuf;)Ljava/util/UUID;
    PUTFIELD M.a : Ljava/util/UUID;
   L2
    LINENUMBER 39 L2
   FRAME FULL [] []
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 4

  // access flags 0x1
  public b(Lio/netty/buffer/ByteBuf;Lr$a;I)V
    // parameter  byteBuf
    // parameter  a
    // parameter  integer
   L0
    LINENUMBER 44 L0
    ALOAD 0
    GETFIELD M.a : Ljava/lang/String;
    ALOAD 1
    INVOKESTATIC M.a (Ljava/lang/String;Lio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 45 L1
    ILOAD 3
    SIPUSH 759
    IF_ICMPLT L2
   L3
    LINENUMBER 47 L3
    ALOAD 0
    GETFIELD M.a : Lp;
    ALOAD 1
    INVOKESTATIC M.a (Lp;Lio/netty/buffer/ByteBuf;)V
   L4
    LINENUMBER 49 L4
    ILOAD 3
    SIPUSH 760
    IF_ICMPLT L2
   L5
    LINENUMBER 51 L5
    ALOAD 0
    GETFIELD M.a : Ljava/util/UUID;
    IFNULL L6
   L7
    LINENUMBER 53 L7
    ALOAD 1
    ICONST_1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
    POP
   L8
    LINENUMBER 54 L8
    ALOAD 0
    GETFIELD M.a : Ljava/util/UUID;
    ALOAD 1
    INVOKESTATIC M.a (Ljava/util/UUID;Lio/netty/buffer/ByteBuf;)V
    GOTO L2
   L6
    LINENUMBER 57 L6
   FRAME FULL [T io/netty/buffer/ByteBuf] []
    ALOAD 1
    ICONST_0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
    POP
   L2
    LINENUMBER 61 L2
   FRAME CHOP 2
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4
}
