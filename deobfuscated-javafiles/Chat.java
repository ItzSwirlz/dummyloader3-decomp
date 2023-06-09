// class version 52.0 (52)
// access flags 0x21
public class Chat extends MinecraftFriendlyByteBuf {

  // compiled from: 

  ATTRIBUTE Code : unknown
  // access flags 0x4019
  public final static enum INNERCLASS r$a r a

  // access flags 0x1A
  private final static Ljava/util/UUID; a

  // access flags 0x2
  private Ljava/lang/String; a

  // access flags 0x2
  private B a

  // access flags 0x2
  private Ljava/util/UUID; b

  // access flags 0x1
  public <init>(Ljava/lang/String;)V
    // parameter  string
   L0
    LINENUMBER 16 L0
    ALOAD 0
    ALOAD 1
    ICONST_0
    INVOKESPECIAL Chat.<init> (Ljava/lang/String;B)V
   L1
    LINENUMBER 17 L1
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 2

  // access flags 0x1
  public <init>(Ljava/lang/String;B)V
    // parameter  string
    // parameter  byte2
   L0
    LINENUMBER 20 L0
    ALOAD 0
    ALOAD 1
    ILOAD 2
    GETSTATIC Chat.a : Ljava/util/UUID;
    INVOKESPECIAL Chat.<init> (Ljava/lang/String;BLjava/util/UUID;)V
   L1
    LINENUMBER 21 L1
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 3

  // access flags 0x1
  public <init>(Ljava/lang/String;BLjava/util/UUID;)V
    // parameter  string
    // parameter  byte2
    // parameter  uUID
   L0
    LINENUMBER 23 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 24 L1
    ALOAD 0
    ALOAD 1
    PUTFIELD Chat.a : Ljava/lang/String;
   L2
    LINENUMBER 25 L2
    ALOAD 0
    ILOAD 2
    PUTFIELD Chat.a : B
   L3
    LINENUMBER 26 L3
    ALOAD 0
    ALOAD 3
    IFNONNULL L4
    GETSTATIC Chat.a : Ljava/util/UUID;
    GOTO L5
   L4
   FRAME FULL [T T T java/util/UUID] [Chat]
    ALOAD 3
   L5
   FRAME FULL [] [Chat java/util/UUID]
    PUTFIELD Chat.b : Ljava/util/UUID;
   L6
    LINENUMBER 27 L6
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 31 L0
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
    LINENUMBER 36 L0
    ALOAD 0
    ALOAD 1
    ALOAD 2
    GETSTATIC r$a.TO_CLIENT : Lr$a;
    IF_ACMPNE L1
    LDC 262144
    GOTO L2
   L1
   FRAME FULL [Chat io/netty/buffer/ByteBuf r$a I] [Chat io/netty/buffer/ByteBuf]
    ILOAD 3
    SIPUSH 315
    IF_ICMPLT L3
    SIPUSH 256
    GOTO L2
   L3
   FRAME FULL [Chat io/netty/buffer/ByteBuf r$a I] [Chat io/netty/buffer/ByteBuf]
    BIPUSH 100
   L2
   FRAME FULL [Chat io/netty/buffer/ByteBuf r$a I] [Chat io/netty/buffer/ByteBuf I]
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;I)Ljava/lang/String;
    PUTFIELD Chat.a : Ljava/lang/String;
   L4
    LINENUMBER 37 L4
    ALOAD 2
    GETSTATIC r$a.TO_CLIENT : Lr$a;
    IF_ACMPNE L5
   L6
    LINENUMBER 38 L6
    ALOAD 0
    ALOAD 1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readByte ()B
    PUTFIELD Chat.a : B
   L7
    LINENUMBER 39 L7
    ILOAD 3
    SIPUSH 735
    IF_ICMPLT L5
   L8
    LINENUMBER 40 L8
    ALOAD 0
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)Ljava/util/UUID;
    PUTFIELD Chat.b : Ljava/util/UUID;
   L5
    LINENUMBER 43 L5
   FRAME FULL [] []
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 4

  // access flags 0x1
  public b(Lio/netty/buffer/ByteBuf;Lr$a;I)V
    // parameter  byteBuf
    // parameter  a
    // parameter  integer
   L0
    LINENUMBER 47 L0
    ALOAD 0
    GETFIELD Chat.a : Ljava/lang/String;
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Ljava/lang/String;Lio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 48 L1
    ALOAD 2
    GETSTATIC r$a.TO_CLIENT : Lr$a;
    IF_ACMPNE L2
   L3
    LINENUMBER 49 L3
    ALOAD 1
    ALOAD 0
    GETFIELD Chat.a : B
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeByte (I)Lio/netty/buffer/ByteBuf;
    POP
   L4
    LINENUMBER 50 L4
    ILOAD 3
    SIPUSH 735
    IF_ICMPLT L2
   L5
    LINENUMBER 51 L5
    ALOAD 0
    GETFIELD Chat.b : Ljava/util/UUID;
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Ljava/util/UUID;Lio/netty/buffer/ByteBuf;)V
   L2
    LINENUMBER 54 L2
   FRAME FULL [] []
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x1
  public a()Ljava/lang/String;
   L0
    LINENUMBER 59 L0
    ALOAD 0
    GETFIELD Chat.a : Ljava/lang/String;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a()B
   L0
    LINENUMBER 63 L0
    ALOAD 0
    GETFIELD Chat.a : B
    IRETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a()Ljava/util/UUID;
   L0
    LINENUMBER 67 L0
    ALOAD 0
    GETFIELD Chat.b : Ljava/util/UUID;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a(Ljava/lang/String;)V
    // parameter  string
   L0
    LINENUMBER 71 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD Chat.a : Ljava/lang/String;
   L1
    LINENUMBER 72 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public a(B)V
    // parameter  byte1
   L0
    LINENUMBER 75 L0
    ALOAD 0
    ILOAD 1
    PUTFIELD Chat.a : B
   L1
    LINENUMBER 76 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public a(Ljava/util/UUID;)V
    // parameter  uUID
   L0
    LINENUMBER 79 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD Chat.b : Ljava/util/UUID;
   L1
    LINENUMBER 80 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public toString()Ljava/lang/String;
   L0
    LINENUMBER 84 L0
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "Chat(message="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL Chat.a ()Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC ", position="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL Chat.a ()B
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    LDC ", sender="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL Chat.a ()Ljava/util/UUID;
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
    LINENUMBER 87 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 88 L1
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public equals(Ljava/lang/Object;)Z
    // parameter  o
   L0
    LINENUMBER 92 L0
    ALOAD 1
    ALOAD 0
    IF_ACMPNE L1
   L2
    LINENUMBER 93 L2
    ICONST_1
    IRETURN
   L1
    LINENUMBER 95 L1
   FRAME SAME
    ALOAD 1
    INSTANCEOF Chat
    IFNE L3
   L4
    LINENUMBER 96 L4
    ICONST_0
    IRETURN
   L3
    LINENUMBER 98 L3
   FRAME SAME
    ALOAD 1
    CHECKCAST Chat
    ASTORE 2
   L5
    LINENUMBER 99 L5
    ALOAD 2
    ALOAD 0
    INVOKEVIRTUAL Chat.a (Ljava/lang/Object;)Z
    IFNE L6
   L7
    LINENUMBER 100 L7
    ICONST_0
    IRETURN
   L6
    LINENUMBER 102 L6
   FRAME FULL [Chat T Chat] []
    ALOAD 0
    INVOKEVIRTUAL Chat.a ()B
    ALOAD 2
    INVOKEVIRTUAL Chat.a ()B
    IF_ICMPEQ L8
   L9
    LINENUMBER 103 L9
    ICONST_0
    IRETURN
   L8
    LINENUMBER 105 L8
   FRAME SAME
    ALOAD 0
    INVOKEVIRTUAL Chat.a ()Ljava/lang/String;
    ASTORE 3
   L10
    LINENUMBER 106 L10
    ALOAD 2
    INVOKEVIRTUAL Chat.a ()Ljava/lang/String;
    ASTORE 4
   L11
    LINENUMBER 108 L11
    ALOAD 3
    IFNONNULL L12
   L13
    LINENUMBER 109 L13
    ALOAD 4
    IFNONNULL L14
   L15
    LINENUMBER 110 L15
    GOTO L16
   L12
    LINENUMBER 113 L12
   FRAME APPEND [java/lang/String java/lang/String]
    ALOAD 3
    ALOAD 4
    INVOKEVIRTUAL java/lang/Object.equals (Ljava/lang/Object;)Z
    IFEQ L14
   L17
    LINENUMBER 114 L17
    GOTO L16
   L14
    LINENUMBER 116 L14
   FRAME FULL [] []
    ICONST_0
    IRETURN
   L16
    LINENUMBER 118 L16
   FRAME APPEND [Chat T Chat]
    ALOAD 0
    INVOKEVIRTUAL Chat.a ()Ljava/util/UUID;
    ASTORE 5
   L18
    LINENUMBER 119 L18
    ALOAD 2
    INVOKEVIRTUAL Chat.a ()Ljava/util/UUID;
    ASTORE 6
   L19
    LINENUMBER 120 L19
    ALOAD 5
    IFNONNULL L20
   L21
    LINENUMBER 121 L21
    ALOAD 6
    IFNONNULL L22
   L23
    LINENUMBER 122 L23
    ICONST_1
    IRETURN
   L20
    LINENUMBER 125 L20
   FRAME FULL [T T T T T java/util/UUID java/util/UUID] []
    ALOAD 5
    ALOAD 6
    INVOKEVIRTUAL java/lang/Object.equals (Ljava/lang/Object;)Z
    IFEQ L22
   L24
    LINENUMBER 126 L24
    ICONST_1
    IRETURN
   L22
    LINENUMBER 128 L22
   FRAME FULL [] []
    ICONST_0
    IRETURN
   L25
    LOCALVARIABLE this LChat; L0 L25 0
    LOCALVARIABLE o Ljava/lang/Object; L0 L25 1
    MAXSTACK = 2
    MAXLOCALS = 7

  // access flags 0x4
  protected a(Ljava/lang/Object;)Z
    // parameter  object
   L0
    LINENUMBER 132 L0
    ALOAD 1
    INSTANCEOF Chat
    IRETURN
    MAXSTACK = 1
    MAXLOCALS = 2

  // access flags 0x1
  public hashCode()I
   L0
    LINENUMBER 137 L0
    BIPUSH 59
    ISTORE 1
   L1
    LINENUMBER 138 L1
    ICONST_1
    ISTORE 2
   L2
    LINENUMBER 139 L2
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 0
    INVOKEVIRTUAL Chat.a ()B
    IADD
    ISTORE 2
   L3
    LINENUMBER 140 L3
    ALOAD 0
    INVOKEVIRTUAL Chat.a ()Ljava/lang/String;
    ASTORE 3
   L4
    LINENUMBER 141 L4
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 3
    IFNONNULL L5
    BIPUSH 43
    GOTO L6
   L5
   FRAME FULL [Chat T T java/lang/String] [I]
    ALOAD 3
    INVOKEVIRTUAL java/lang/Object.hashCode ()I
   L6
   FRAME FULL [Chat] [I I]
    IADD
    ISTORE 2
   L7
    LINENUMBER 142 L7
    ALOAD 0
    INVOKEVIRTUAL Chat.a ()Ljava/util/UUID;
    ASTORE 4
   L8
    LINENUMBER 143 L8
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 4
    IFNONNULL L9
    BIPUSH 43
    GOTO L10
   L9
   FRAME FULL [T T T T java/util/UUID] [I]
    ALOAD 4
    INVOKEVIRTUAL java/lang/Object.hashCode ()I
   L10
   FRAME FULL [] [I I]
    IADD
    ISTORE 2
   L11
    LINENUMBER 144 L11
    ILOAD 2
    IRETURN
    MAXSTACK = 2
    MAXLOCALS = 5

  // access flags 0x8
  static <clinit>()V
   L0
    LINENUMBER 148 L0
    NEW java/util/UUID
    DUP
    LCONST_0
    LCONST_0
    INVOKESPECIAL java/util/UUID.<init> (JJ)V
    PUTSTATIC Chat.a : Ljava/util/UUID;
   L1
    LINENUMBER 149 L1
    RETURN
    MAXSTACK = 6
    MAXLOCALS = 0
}
