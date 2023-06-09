// class version 52.0 (52)
// access flags 0x21
public class N extends MinecraftFriendlyByteBuf {

  // compiled from: 

  ATTRIBUTE Code : unknown

  // access flags 0x2
  private J a

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 14 L0
    ICONST_1
    ALOAD 1
    INVOKESTATIC N.a (ILio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 15 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public <init>(J)V
    // parameter  long1
   L0
    LINENUMBER 18 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 19 L1
    ALOAD 0
    LLOAD 1
    PUTFIELD N.a : J
   L2
    LINENUMBER 20 L2
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 3

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 23 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 24 L1
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public b(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 29 L0
    ALOAD 0
    ALOAD 1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readLong ()J
    PUTFIELD N.a : J
   L1
    LINENUMBER 30 L1
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 2

  // access flags 0x1
  public c(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 35 L0
    ALOAD 1
    ALOAD 0
    GETFIELD N.a : J
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeLong (J)Lio/netty/buffer/ByteBuf;
    POP
   L1
    LINENUMBER 36 L1
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 2

  // access flags 0x1
  public a()J
   L0
    LINENUMBER 40 L0
    ALOAD 0
    GETFIELD N.a : J
    LRETURN
    MAXSTACK = 2
    MAXLOCALS = 1
}
