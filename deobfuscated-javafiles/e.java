// class version 52.0 (52)
// access flags 0x421
public abstract class e {

  // compiled from: 

  ATTRIBUTE Code : unknown

  // access flags 0x1
  public I a

  // access flags 0x1
  public I b

  // access flags 0x1
  public LMinecraftIPAddressResolver; a

  // access flags 0x1
  public LS; a

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 16 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
   L1
    LINENUMBER 17 L1
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public <init>(Ljava/lang/String;I)V
    // parameter  string
    // parameter  integer
   L0
    LINENUMBER 19 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
   L1
    LINENUMBER 20 L1
    ALOAD 0
    ILOAD 2
    PUTFIELD e.a : I
   L2
    LINENUMBER 21 L2
    ALOAD 0
    ALOAD 1
    INVOKESTATIC MinecraftIPAddressResolver.a (Ljava/lang/String;)LMinecraftIPAddressResolver;
    PUTFIELD e.a : LMinecraftIPAddressResolver;
   L3
    LINENUMBER 22 L3
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 3

  // access flags 0x401
  public abstract a(Lio/netty/channel/Channel;)V
    // parameter  channel

  // access flags 0x401
  public abstract b(Lio/netty/channel/Channel;)V
    // parameter  channel
}
