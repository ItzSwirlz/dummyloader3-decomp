// class version 52.0 (52)
// access flags 0x21
public class ClientChat extends MinecraftFriendlyByteBuf {

  // compiled from: 

  ATTRIBUTE Code : unknown
  // access flags 0x4019
  public final static enum INNERCLASS r$a r a

  // access flags 0x2
  private Ljava/lang/String; a

  // access flags 0x2
  private J a

  // access flags 0x2
  private J b

  // access flags 0x2
  private [B a

  // access flags 0x2
  private Z a

  // access flags 0x2
  private LChatChain; a

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 20 L0
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
    LINENUMBER 25 L0
    ALOAD 0
    ALOAD 1
    SIPUSH 256
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;I)Ljava/lang/String;
    PUTFIELD ClientChat.a : Ljava/lang/String;
   L1
    LINENUMBER 26 L1
    ALOAD 0
    ALOAD 1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readLong ()J
    PUTFIELD ClientChat.a : J
   L2
    LINENUMBER 27 L2
    ALOAD 0
    ALOAD 1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readLong ()J
    PUTFIELD ClientChat.b : J
   L3
    LINENUMBER 28 L3
    ALOAD 0
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.b (Lio/netty/buffer/ByteBuf;)[B
    PUTFIELD ClientChat.a : [B
   L4
    LINENUMBER 29 L4
    ALOAD 0
    ALOAD 1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readBoolean ()Z
    PUTFIELD ClientChat.a : Z
   L5
    LINENUMBER 30 L5
    ILOAD 3
    SIPUSH 760
    IF_ICMPLT L6
   L7
    LINENUMBER 31 L7
    ALOAD 0
    NEW ChatChain
    DUP
    INVOKESPECIAL ChatChain.<init> ()V
    DUP_X1
    PUTFIELD ClientChat.a : LChatChain;
    ALOAD 1
    ALOAD 2
    ILOAD 3
    INVOKEVIRTUAL ChatChain.a (Lio/netty/buffer/ByteBuf;Lr$a;I)V
   L6
    LINENUMBER 33 L6
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
    LINENUMBER 37 L0
    ALOAD 0
    GETFIELD ClientChat.a : Ljava/lang/String;
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Ljava/lang/String;Lio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 38 L1
    ALOAD 1
    ALOAD 0
    GETFIELD ClientChat.a : J
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeLong (J)Lio/netty/buffer/ByteBuf;
    POP
   L2
    LINENUMBER 39 L2
    ALOAD 1
    ALOAD 0
    GETFIELD ClientChat.b : J
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeLong (J)Lio/netty/buffer/ByteBuf;
    POP
   L3
    LINENUMBER 40 L3
    ALOAD 0
    GETFIELD ClientChat.a : [B
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a ([BLio/netty/buffer/ByteBuf;)V
   L4
    LINENUMBER 41 L4
    ALOAD 1
    ALOAD 0
    GETFIELD ClientChat.a : Z
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
    POP
   L5
    LINENUMBER 42 L5
    ILOAD 3
    SIPUSH 760
    IF_ICMPLT L6
   L7
    LINENUMBER 43 L7
    ALOAD 0
    GETFIELD ClientChat.a : LChatChain;
    ALOAD 1
    ALOAD 2
    ILOAD 3
    INVOKEVIRTUAL ChatChain.b (Lio/netty/buffer/ByteBuf;Lr$a;I)V
   L6
    LINENUMBER 45 L6
   FRAME FULL [] []
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 4

  // access flags 0x1
  public a()Ljava/lang/String;
   L0
    LINENUMBER 50 L0
    ALOAD 0
    GETFIELD ClientChat.a : Ljava/lang/String;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a()J
   L0
    LINENUMBER 54 L0
    ALOAD 0
    GETFIELD ClientChat.a : J
    LRETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x1
  public b()J
   L0
    LINENUMBER 58 L0
    ALOAD 0
    GETFIELD ClientChat.b : J
    LRETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x1
  public a()[B
   L0
    LINENUMBER 62 L0
    ALOAD 0
    GETFIELD ClientChat.a : [B
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a()Z
   L0
    LINENUMBER 66 L0
    ALOAD 0
    GETFIELD ClientChat.a : Z
    IRETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a()LChatChain;
   L0
    LINENUMBER 70 L0
    ALOAD 0
    GETFIELD ClientChat.a : LChatChain;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a(Ljava/lang/String;)V
    // parameter  string
   L0
    LINENUMBER 74 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD ClientChat.a : Ljava/lang/String;
   L1
    LINENUMBER 75 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public a(J)V
    // parameter  long1
   L0
    LINENUMBER 78 L0
    ALOAD 0
    LLOAD 1
    PUTFIELD ClientChat.a : J
   L1
    LINENUMBER 79 L1
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 3

  // access flags 0x1
  public b(J)V
    // parameter  long1
   L0
    LINENUMBER 82 L0
    ALOAD 0
    LLOAD 1
    PUTFIELD ClientChat.b : J
   L1
    LINENUMBER 83 L1
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 3

  // access flags 0x1
  public a([B)V
    // parameter  arr
   L0
    LINENUMBER 86 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD ClientChat.a : [B
   L1
    LINENUMBER 87 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public a(Z)V
    // parameter  boolean1
   L0
    LINENUMBER 90 L0
    ALOAD 0
    ILOAD 1
    PUTFIELD ClientChat.a : Z
   L1
    LINENUMBER 91 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public a(LChatChain;)V
    // parameter  e
   L0
    LINENUMBER 94 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD ClientChat.a : LChatChain;
   L1
    LINENUMBER 95 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public toString()Ljava/lang/String;
   L0
    LINENUMBER 99 L0
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "ClientChat(message="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL ClientChat.a ()Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC ", timestamp="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL ClientChat.a ()J
    INVOKEVIRTUAL java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
    LDC ", salt="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL ClientChat.b ()J
    INVOKEVIRTUAL java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
    LDC ", signature="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL ClientChat.a ()[B
    INVOKESTATIC java/util/Arrays.toString ([B)Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC ", signedPreview="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL ClientChat.a ()Z
    INVOKEVIRTUAL java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
    LDC ", chain="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL ClientChat.a ()LChatChain;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    LDC ")"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ARETURN
    MAXSTACK = 3
    MAXLOCALS = 1

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 102 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 103 L1
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public <init>(Ljava/lang/String;JJ[BZLChatChain;)V
    // parameter  string
    // parameter  long2
    // parameter  long3
    // parameter  arr
    // parameter  boolean5
    // parameter  e
   L0
    LINENUMBER 105 L0
    ALOAD 0
    INVOKESPECIAL MinecraftFriendlyByteBuf.<init> ()V
   L1
    LINENUMBER 106 L1
    ALOAD 0
    ALOAD 1
    PUTFIELD ClientChat.a : Ljava/lang/String;
   L2
    LINENUMBER 107 L2
    ALOAD 0
    LLOAD 2
    PUTFIELD ClientChat.a : J
   L3
    LINENUMBER 108 L3
    ALOAD 0
    LLOAD 4
    PUTFIELD ClientChat.b : J
   L4
    LINENUMBER 109 L4
    ALOAD 0
    ALOAD 6
    PUTFIELD ClientChat.a : [B
   L5
    LINENUMBER 110 L5
    ALOAD 0
    ILOAD 7
    PUTFIELD ClientChat.a : Z
   L6
    LINENUMBER 111 L6
    ALOAD 0
    ALOAD 8
    PUTFIELD ClientChat.a : LChatChain;
   L7
    LINENUMBER 112 L7
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 9

  // access flags 0x1
  public equals(Ljava/lang/Object;)Z
    // parameter  o
   L0
    LINENUMBER 116 L0
    ALOAD 1
    ALOAD 0
    IF_ACMPNE L1
   L2
    LINENUMBER 117 L2
    ICONST_1
    IRETURN
   L1
    LINENUMBER 119 L1
   FRAME SAME
    ALOAD 1
    INSTANCEOF ClientChat
    IFNE L3
   L4
    LINENUMBER 120 L4
    ICONST_0
    IRETURN
   L3
    LINENUMBER 122 L3
   FRAME SAME
    ALOAD 1
    CHECKCAST ClientChat
    ASTORE 2
   L5
    LINENUMBER 123 L5
    ALOAD 2
    ALOAD 0
    INVOKEVIRTUAL ClientChat.a (Ljava/lang/Object;)Z
    IFNE L6
   L7
    LINENUMBER 124 L7
    ICONST_0
    IRETURN
   L6
    LINENUMBER 126 L6
   FRAME FULL [ClientChat T ClientChat] []
    ALOAD 0
    INVOKEVIRTUAL ClientChat.a ()J
    ALOAD 2
    INVOKEVIRTUAL ClientChat.a ()J
    LCMP
    IFEQ L8
   L9
    LINENUMBER 127 L9
    ICONST_0
    IRETURN
   L8
    LINENUMBER 129 L8
   FRAME SAME
    ALOAD 0
    INVOKEVIRTUAL ClientChat.b ()J
    ALOAD 2
    INVOKEVIRTUAL ClientChat.b ()J
    LCMP
    IFEQ L10
   L11
    LINENUMBER 130 L11
    ICONST_0
    IRETURN
   L10
    LINENUMBER 132 L10
   FRAME SAME
    ALOAD 0
    INVOKEVIRTUAL ClientChat.a ()Z
    ALOAD 2
    INVOKEVIRTUAL ClientChat.a ()Z
    IF_ICMPEQ L12
   L13
    LINENUMBER 133 L13
    ICONST_0
    IRETURN
   L12
    LINENUMBER 135 L12
   FRAME SAME
    ALOAD 0
    INVOKEVIRTUAL ClientChat.a ()Ljava/lang/String;
    ASTORE 3
   L14
    LINENUMBER 136 L14
    ALOAD 2
    INVOKEVIRTUAL ClientChat.a ()Ljava/lang/String;
    ASTORE 4
   L15
    LINENUMBER 138 L15
    ALOAD 3
    IFNONNULL L16
   L17
    LINENUMBER 139 L17
    ALOAD 4
    IFNONNULL L18
   L19
    LINENUMBER 140 L19
    GOTO L20
   L16
    LINENUMBER 143 L16
   FRAME APPEND [java/lang/String java/lang/String]
    ALOAD 3
    ALOAD 4
    INVOKEVIRTUAL java/lang/Object.equals (Ljava/lang/Object;)Z
    IFEQ L18
   L21
    LINENUMBER 144 L21
    GOTO L20
   L18
    LINENUMBER 146 L18
   FRAME FULL [] []
    ICONST_0
    IRETURN
   L20
    LINENUMBER 148 L20
   FRAME APPEND [ClientChat T ClientChat]
    ALOAD 0
    INVOKEVIRTUAL ClientChat.a ()[B
    ALOAD 2
    INVOKEVIRTUAL ClientChat.a ()[B
    INVOKESTATIC java/util/Arrays.equals ([B[B)Z
    IFNE L22
   L23
    LINENUMBER 149 L23
    ICONST_0
    IRETURN
   L22
    LINENUMBER 151 L22
   FRAME SAME
    ALOAD 0
    INVOKEVIRTUAL ClientChat.a ()LChatChain;
    ASTORE 5
   L24
    LINENUMBER 152 L24
    ALOAD 2
    INVOKEVIRTUAL ClientChat.a ()LChatChain;
    ASTORE 6
   L25
    LINENUMBER 153 L25
    ALOAD 5
    IFNONNULL L26
   L27
    LINENUMBER 154 L27
    ALOAD 6
    IFNONNULL L28
   L29
    LINENUMBER 155 L29
    ICONST_1
    IRETURN
   L26
    LINENUMBER 158 L26
   FRAME FULL [T T T T T ChatChain ChatChain] []
    ALOAD 5
    ALOAD 6
    INVOKEVIRTUAL java/lang/Object.equals (Ljava/lang/Object;)Z
    IFEQ L28
   L30
    LINENUMBER 159 L30
    ICONST_1
    IRETURN
   L28
    LINENUMBER 161 L28
   FRAME FULL [] []
    ICONST_0
    IRETURN
   L31
    LOCALVARIABLE this LClientChat; L0 L31 0
    LOCALVARIABLE o Ljava/lang/Object; L0 L31 1
    MAXSTACK = 4
    MAXLOCALS = 7

  // access flags 0x4
  protected a(Ljava/lang/Object;)Z
    // parameter  object
   L0
    LINENUMBER 165 L0
    ALOAD 1
    INSTANCEOF ClientChat
    IRETURN
    MAXSTACK = 1
    MAXLOCALS = 2

  // access flags 0x1
  public hashCode()I
   L0
    LINENUMBER 170 L0
    BIPUSH 59
    ISTORE 1
   L1
    LINENUMBER 171 L1
    ICONST_1
    ISTORE 2
   L2
    LINENUMBER 172 L2
    ALOAD 0
    INVOKEVIRTUAL ClientChat.a ()J
    LSTORE 3
   L3
    LINENUMBER 173 L3
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
    LINENUMBER 174 L4
    ALOAD 0
    INVOKEVIRTUAL ClientChat.b ()J
    LSTORE 5
   L5
    LINENUMBER 175 L5
    ILOAD 2
    BIPUSH 59
    IMUL
    LLOAD 5
    BIPUSH 32
    LUSHR
    LLOAD 5
    LXOR
    L2I
    IADD
    ISTORE 2
   L6
    LINENUMBER 176 L6
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 0
    INVOKEVIRTUAL ClientChat.a ()Z
    IFEQ L7
    BIPUSH 79
    GOTO L8
   L7
   FRAME SAME1 I
    BIPUSH 97
   L8
   FRAME FULL [ClientChat] [I I]
    IADD
    ISTORE 2
   L9
    LINENUMBER 177 L9
    ALOAD 0
    INVOKEVIRTUAL ClientChat.a ()Ljava/lang/String;
    ASTORE 7
   L10
    LINENUMBER 178 L10
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 7
    IFNONNULL L11
    BIPUSH 43
    GOTO L12
   L11
   FRAME FULL [ClientChat T T T T T T java/lang/String] [I]
    ALOAD 7
    INVOKEVIRTUAL java/lang/Object.hashCode ()I
   L12
   FRAME FULL [ClientChat] [I I]
    IADD
    ISTORE 2
   L13
    LINENUMBER 179 L13
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 0
    INVOKEVIRTUAL ClientChat.a ()[B
    INVOKESTATIC java/util/Arrays.hashCode ([B)I
    IADD
    ISTORE 2
   L14
    LINENUMBER 180 L14
    ALOAD 0
    INVOKEVIRTUAL ClientChat.a ()LChatChain;
    ASTORE 8
   L15
    LINENUMBER 181 L15
    ILOAD 2
    BIPUSH 59
    IMUL
    ALOAD 8
    IFNONNULL L16
    BIPUSH 43
    GOTO L17
   L16
   FRAME FULL [T T T T T T T T ChatChain] [I]
    ALOAD 8
    INVOKEVIRTUAL java/lang/Object.hashCode ()I
   L17
   FRAME FULL [] [I I]
    IADD
    ISTORE 2
   L18
    LINENUMBER 182 L18
    ILOAD 2
    IRETURN
    MAXSTACK = 5
    MAXLOCALS = 9
}
