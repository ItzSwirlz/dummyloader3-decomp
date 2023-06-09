// class version 52.0 (52)
// access flags 0x21
public class I extends MinecraftFriendlyByteBuf {

  // compiled from: 

  ATTRIBUTE Code : unknown

  // access flags 0x2
  private I a

  // access flags 0x2
  private Ljava/lang/String; a

  // access flags 0x2
  private I b

  // access flags 0x2
  private I c

  // access flags 0x1
  public <init>(ILjava/lang/String;II)V
    // parameter  integer1
    // parameter  string
    // parameter  integer3
    // parameter  integer4
   L0
    LINENUMBER 15 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 16 L1
    ALOAD 0
    ILOAD 1
    PUTFIELD I.a : I
   L2
    LINENUMBER 17 L2
    ALOAD 0
    ALOAD 2
    PUTFIELD I.a : Ljava/lang/String;
   L3
    LINENUMBER 18 L3
    ALOAD 0
    ILOAD 3
    PUTFIELD I.b : I
   L4
    LINENUMBER 19 L4
    ALOAD 0
    ILOAD 4
    PUTFIELD I.c : I
   L5
    LINENUMBER 20 L5
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 5

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 25 L0
    ICONST_0
    ALOAD 1
    INVOKESTATIC I.a (ILio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 26 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public b(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 31 L0
    ALOAD 0
    ALOAD 1
    INVOKESTATIC I.a (Lio/netty/buffer/ByteBuf;)I
    PUTFIELD I.a : I
   L1
    LINENUMBER 32 L1
    ALOAD 0
    ALOAD 1
    SIPUSH 255
    INVOKESTATIC I.a (Lio/netty/buffer/ByteBuf;I)Ljava/lang/String;
    PUTFIELD I.a : Ljava/lang/String;
   L2
    LINENUMBER 33 L2
    ALOAD 0
    ALOAD 1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readUnsignedShort ()I
    PUTFIELD I.b : I
   L3
    LINENUMBER 34 L3
    ALOAD 0
    ALOAD 1
    INVOKESTATIC I.a (Lio/netty/buffer/ByteBuf;)I
    PUTFIELD I.c : I
   L4
    LINENUMBER 35 L4
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 2

  // access flags 0x1
  public c(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 40 L0
    ALOAD 0
    GETFIELD I.a : I
    ALOAD 1
    INVOKESTATIC I.a (ILio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 41 L1
    ALOAD 0
    GETFIELD I.a : Ljava/lang/String;
    ALOAD 1
    INVOKESTATIC I.a (Ljava/lang/String;Lio/netty/buffer/ByteBuf;)V
   L2
    LINENUMBER 42 L2
    ALOAD 1
    ALOAD 0
    GETFIELD I.b : I
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeShort (I)Lio/netty/buffer/ByteBuf;
    POP
   L3
    LINENUMBER 43 L3
    ALOAD 0
    GETFIELD I.c : I
    ALOAD 1
    INVOKESTATIC I.a (ILio/netty/buffer/ByteBuf;)V
   L4
    LINENUMBER 44 L4
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2
}
