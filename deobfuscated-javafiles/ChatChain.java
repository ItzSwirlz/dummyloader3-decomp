// class version 52.0 (52)
// access flags 0x21
public class ChatChain extends MinecraftFriendlyByteBuf {

  // compiled from: 

  ATTRIBUTE Code : unknown
  // access flags 0x9
  public static INNERCLASS ChatChain$a ChatChain a
  // access flags 0x4019
  public final static enum INNERCLASS r$a r a

  // access flags 0x2
  // signature Ljava/util/List<LChatChain$a;>;
  // declaration: a extends java.util.List<ChatChain$a>
  private Ljava/util/List; a

  // access flags 0x2
  // signature Ljava/util/List<LChatChain$a;>;
  // declaration: b extends java.util.List<ChatChain$a>
  private Ljava/util/List; b

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 16 L0
    NEW java/lang/UnsupportedOperationException
    DUP
    LDC "cant do that"
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
    LINENUMBER 21 L0
    ALOAD 0
    ALOAD 1
    INVOKESTATIC ChatChain.b (Lio/netty/buffer/ByteBuf;)Ljava/util/List;
    PUTFIELD ChatChain.a : Ljava/util/List;
   L1
    LINENUMBER 22 L1
    ALOAD 1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readBoolean ()Z
    IFEQ L2
   L3
    LINENUMBER 23 L3
    ALOAD 0
    ALOAD 1
    INVOKESTATIC ChatChain.b (Lio/netty/buffer/ByteBuf;)Ljava/util/List;
    PUTFIELD ChatChain.b : Ljava/util/List;
   L2
    LINENUMBER 25 L2
   FRAME FULL [] []
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0xA
  // signature (Lio/netty/buffer/ByteBuf;)Ljava/util/List<LChatChain$a;>;
  // declaration: java.util.List<ChatChain$a> b(io.netty.buffer.ByteBuf)
  private static b(Lio/netty/buffer/ByteBuf;)Ljava/util/List;
    // parameter  byteBuf
   L0
    LINENUMBER 28 L0
    ALOAD 0
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)I
    ISTORE 1
   L1
    LINENUMBER 29 L1
    NEW java/util/LinkedList
    DUP
    INVOKESPECIAL java/util/LinkedList.<init> ()V
    ASTORE 2
   L2
    LINENUMBER 30 L2
    ICONST_0
    ISTORE 3
   L3
   FRAME APPEND [I java/util/LinkedList I]
    ILOAD 3
    ILOAD 1
    IF_ICMPGE L4
   L5
    LINENUMBER 31 L5
    ALOAD 2
    NEW ChatChain$a
    DUP
    ALOAD 0
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)Ljava/util/UUID;
    ALOAD 0
    INVOKESTATIC MinecraftFriendlyByteBuf.b (Lio/netty/buffer/ByteBuf;)[B
    INVOKESPECIAL ChatChain$a.<init> (Ljava/util/UUID;[B)V
    INVOKEINTERFACE java/util/List.add (Ljava/lang/Object;)Z (itf)
    POP
   L6
    LINENUMBER 30 L6
    IINC 3 1
    GOTO L3
   L4
    LINENUMBER 33 L4
   FRAME FULL [T T java/util/LinkedList] []
    ALOAD 2
    ARETURN
    MAXSTACK = 5
    MAXLOCALS = 4

  // access flags 0x1
  public b(Lio/netty/buffer/ByteBuf;Lr$a;I)V
    // parameter  byteBuf
    // parameter  a
    // parameter  integer
   L0
    LINENUMBER 38 L0
    ALOAD 0
    GETFIELD ChatChain.a : Ljava/util/List;
    ALOAD 1
    INVOKESTATIC ChatChain.b (Ljava/util/List;Lio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 39 L1
    ALOAD 0
    GETFIELD ChatChain.b : Ljava/util/List;
    IFNULL L2
   L3
    LINENUMBER 40 L3
    ALOAD 1
    ICONST_1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
    POP
   L4
    LINENUMBER 41 L4
    ALOAD 0
    GETFIELD ChatChain.b : Ljava/util/List;
    ALOAD 1
    INVOKESTATIC ChatChain.b (Ljava/util/List;Lio/netty/buffer/ByteBuf;)V
    GOTO L5
   L2
    LINENUMBER 44 L2
   FRAME FULL [T io/netty/buffer/ByteBuf] []
    ALOAD 1
    ICONST_0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
    POP
   L5
    LINENUMBER 46 L5
   FRAME CHOP 2
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0xA
  // signature (Ljava/util/List<LChatChain$a;>;Lio/netty/buffer/ByteBuf;)V
  // declaration: void b(java.util.List<ChatChain$a>, io.netty.buffer.ByteBuf)
  private static b(Ljava/util/List;Lio/netty/buffer/ByteBuf;)V
    // parameter  list
    // parameter  byteBuf
   L0
    LINENUMBER 49 L0
    ALOAD 0
    INVOKEINTERFACE java/util/List.size ()I (itf)
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 50 L1
    ALOAD 0
    INVOKEINTERFACE java/util/List.iterator ()Ljava/util/Iterator; (itf)
    ASTORE 2
   L2
   FRAME FULL [T io/netty/buffer/ByteBuf java/util/Iterator] []
    ALOAD 2
    INVOKEINTERFACE java/util/Iterator.hasNext ()Z (itf)
    IFEQ L3
    ALOAD 2
    INVOKEINTERFACE java/util/Iterator.next ()Ljava/lang/Object; (itf)
    CHECKCAST ChatChain$a
    ASTORE 3
   L4
    LINENUMBER 51 L4
    ALOAD 3
    INVOKESTATIC ChatChain$a.a (LChatChain$a;)Ljava/util/UUID;
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Ljava/util/UUID;Lio/netty/buffer/ByteBuf;)V
   L5
    LINENUMBER 52 L5
    ALOAD 3
    INVOKESTATIC ChatChain$a.a (LChatChain$a;)[B
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a ([BLio/netty/buffer/ByteBuf;)V
   L6
    LINENUMBER 53 L6
    GOTO L2
   L3
    LINENUMBER 54 L3
   FRAME CHOP 3
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x1
  // signature ()Ljava/util/List<LChatChain$a;>;
  // declaration: java.util.List<ChatChain$a> a()
  public a()Ljava/util/List;
   L0
    LINENUMBER 59 L0
    ALOAD 0
    GETFIELD ChatChain.a : Ljava/util/List;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  // signature ()Ljava/util/List<LChatChain$a;>;
  // declaration: java.util.List<ChatChain$a> b()
  public b()Ljava/util/List;
   L0
    LINENUMBER 63 L0
    ALOAD 0
    GETFIELD ChatChain.b : Ljava/util/List;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  // signature (Ljava/util/List<LChatChain$a;>;)V
  // declaration: void a(java.util.List<ChatChain$a>)
  public a(Ljava/util/List;)V
    // parameter  list
   L0
    LINENUMBER 67 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD ChatChain.a : Ljava/util/List;
   L1
    LINENUMBER 68 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  // signature (Ljava/util/List<LChatChain$a;>;)V
  // declaration: void b(java.util.List<ChatChain$a>)
  public b(Ljava/util/List;)V
    // parameter  list
   L0
    LINENUMBER 71 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD ChatChain.b : Ljava/util/List;
   L1
    LINENUMBER 72 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public toString()Ljava/lang/String;
   L0
    LINENUMBER 76 L0
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "ChatChain(seen="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL ChatChain.a ()Ljava/util/List;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    LDC ", received="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL ChatChain.b ()Ljava/util/List;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    LDC ")"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ARETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 79 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 80 L1
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  // signature (Ljava/util/List<LChatChain$a;>;Ljava/util/List<LChatChain$a;>;)V
  // declaration: void <init>(java.util.List<ChatChain$a>, java.util.List<ChatChain$a>)
  public <init>(Ljava/util/List;Ljava/util/List;)V
    // parameter  list1
    // parameter  list2
   L0
    LINENUMBER 82 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 83 L1
    ALOAD 0
    ALOAD 1
    PUTFIELD ChatChain.a : Ljava/util/List;
   L2
    LINENUMBER 84 L2
    ALOAD 0
    ALOAD 2
    PUTFIELD ChatChain.b : Ljava/util/List;
   L3
    LINENUMBER 85 L3
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 3

  // access flags 0x1
  public equals(Ljava/lang/Object;)Z
    // parameter  o
   L0
    LINENUMBER 89 L0
    ALOAD 1
    ALOAD 0
    IF_ACMPNE L1
   L2
    LINENUMBER 90 L2
    ICONST_1
    IRETURN
   L1
    LINENUMBER 92 L1
   FRAME SAME
    ALOAD 1
    INSTANCEOF ChatChain
    IFNE L3
   L4
    LINENUMBER 93 L4
    ICONST_0
    IRETURN
   L3
    LINENUMBER 95 L3
   FRAME SAME
    ALOAD 1
    CHECKCAST ChatChain
    ASTORE 2
   L5
    LINENUMBER 96 L5
    ALOAD 2
    ALOAD 0
    INVOKEVIRTUAL ChatChain.a (Ljava/lang/Object;)Z
    IFNE L6
   L7
    LINENUMBER 97 L7
    ICONST_0
    IRETURN
   L6
    LINENUMBER 99 L6
   FRAME FULL [ChatChain T ChatChain] []
    ALOAD 0
    INVOKEVIRTUAL ChatChain.a ()Ljava/util/List;
    ASTORE 3
   L8
    LINENUMBER 100 L8
    ALOAD 2
    INVOKEVIRTUAL ChatChain.a ()Ljava/util/List;
    ASTORE 4
   L9
    LINENUMBER 102 L9
    ALOAD 3
    IFNONNULL L10
   L11
    LINENUMBER 103 L11
    ALOAD 4
    IFNONNULL L12
   L13
    LINENUMBER 104 L13
    GOTO L14
   L10
    LINENUMBER 107 L10
   FRAME APPEND [java/util/List java/util/List]
    ALOAD 3
    ALOAD 4
    INVOKEVIRTUAL java/lang/Object.equals (Ljava/lang/Object;)Z
    IFEQ L12
   L15
    LINENUMBER 108 L15
    GOTO L14
   L12
    LINENUMBER 110 L12
   FRAME FULL [] []
    ICONST_0
    IRETURN
   L14
    LINENUMBER 112 L14
   FRAME APPEND [ChatChain T ChatChain]
    ALOAD 0
    INVOKEVIRTUAL ChatChain.b ()Ljava/util/List;
    ASTORE 5
   L16
    LINENUMBER 113 L16
    ALOAD 2
    INVOKEVIRTUAL ChatChain.b ()Ljava/util/List;
    ASTORE 6
   L17
    LINENUMBER 114 L17
    ALOAD 5
    IFNONNULL L18
   L19
    LINENUMBER 115 L19
    ALOAD 6
    IFNONNULL L20
   L21
    LINENUMBER 116 L21
    ICONST_1
    IRETURN
   L18
    LINENUMBER 119 L18
   FRAME FULL [T T T T T java/util/List java/util/List] []
    ALOAD 5
    ALOAD 6
    INVOKEVIRTUAL java/lang/Object.equals (Ljava/lang/Object;)Z
    IFEQ L20
   L22
    LINENUMBER 120 L22
    ICONST_1
    IRETURN
   L20
    LINENUMBER 122 L20
   FRAME FULL [] []
    ICONST_0
    IRETURN
   L23
    LOCALVARIABLE this LChatChain; L0 L23 0
    LOCALVARIABLE o Ljava/lang/Object; L0 L23 1
    MAXSTACK = 2
    MAXLOCALS = 7

  // access flags 0x4
  protected a(Ljava/lang/Object;)Z
    // parameter  object
   L0
    LINENUMBER 126 L0
    ALOAD 1
    INSTANCEOF ChatChain
    IRETURN
    MAXSTACK = 1
    MAXLOCALS = 2

  // access flags 0x1
  public hashCode()I
   L0
    LINENUMBER 131 L0
    BIPUSH 59
    ISTORE 1
   L1
    LINENUMBER 132 L1
    ICONST_1
    ISTORE 2
   L2
    LINENUMBER 133 L2
    ALOAD 0
    INVOKEVIRTUAL ChatChain.a ()Ljava/util/List;
    ASTORE 3
   L3
    LINENUMBER 134 L3
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 3
    IFNONNULL L4
    BIPUSH 43
    GOTO L5
   L4
   FRAME FULL [ChatChain T T java/util/List] [I]
    ALOAD 3
    INVOKEVIRTUAL java/lang/Object.hashCode ()I
   L5
   FRAME FULL [ChatChain] [I I]
    IADD
    ISTORE 2
   L6
    LINENUMBER 135 L6
    ALOAD 0
    INVOKEVIRTUAL ChatChain.b ()Ljava/util/List;
    ASTORE 4
   L7
    LINENUMBER 136 L7
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 4
    IFNONNULL L8
    BIPUSH 43
    GOTO L9
   L8
   FRAME FULL [T T T T java/util/List] [I]
    ALOAD 4
    INVOKEVIRTUAL java/lang/Object.hashCode ()I
   L9
   FRAME FULL [] [I I]
    IADD
    ISTORE 2
   L10
    LINENUMBER 137 L10
    ILOAD 2
    IRETURN
    MAXSTACK = 2
    MAXLOCALS = 5
}
