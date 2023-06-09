// class version 52.0 (52)
// access flags 0x421
public abstract class MinecraftFriendlyByteBuf {

  // compiled from: 

  ATTRIBUTE Code : unknown
  // access flags 0x4019
  public final static enum INNERCLASS r$a r a

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 20 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x9
  public static a([Ljava/lang/String;)V
    // parameter  arr
   L0
    LINENUMBER 24 L0
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC 622726
    INVOKEVIRTUAL java/io/PrintStream.println (I)V
   L1
    LINENUMBER 25 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x9
  public static a(Ljava/lang/String;Lio/netty/buffer/ByteBuf;)V
    // parameter  string
    // parameter  byteBuf
   L0
    LINENUMBER 28 L0
    ALOAD 0
    INVOKEVIRTUAL java/lang/String.length ()I
    SIPUSH 32767
    IF_ICMPLE L1
   L2
    LINENUMBER 30 L2
    NEW java/lang/RuntimeException
    DUP
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "Cannot send string longer than Short.MAX_VALUE (got "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL java/lang/String.length ()I
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    LDC " characters)"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/String;)V
    ATHROW
   L1
    LINENUMBER 33 L1
   FRAME SAME
    ALOAD 0
    GETSTATIC java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    INVOKEVIRTUAL java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
    ASTORE 2
   L3
    LINENUMBER 34 L3
    ALOAD 2
    ARRAYLENGTH
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
   L4
    LINENUMBER 35 L4
    ALOAD 1
    ALOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBytes ([B)Lio/netty/buffer/ByteBuf;
    POP
   L5
    LINENUMBER 36 L5
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 3

  // access flags 0x9
  public static a(Lio/netty/buffer/ByteBuf;)Ljava/lang/String;
    // parameter  byteBuf
   L0
    LINENUMBER 40 L0
    ALOAD 0
    SIPUSH 32767
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;I)Ljava/lang/String;
    ARETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x9
  public static a(Lio/netty/buffer/ByteBuf;I)Ljava/lang/String;
    // parameter  byteBuf
    // parameter  integer
   L0
    LINENUMBER 45 L0
    ALOAD 0
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)I
    ISTORE 2
   L1
    LINENUMBER 46 L1
    ILOAD 2
    ILOAD 1
    ICONST_4
    IMUL
    IF_ICMPLE L2
   L3
    LINENUMBER 48 L3
    NEW java/lang/RuntimeException
    DUP
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "Cannot receive string longer than "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ILOAD 1
    ICONST_4
    IMUL
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    LDC " (got "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ILOAD 2
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    LDC " bytes)"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/String;)V
    ATHROW
   L2
    LINENUMBER 51 L2
   FRAME APPEND [I]
    ILOAD 2
    NEWARRAY T_BYTE
    ASTORE 3
   L4
    LINENUMBER 52 L4
    ALOAD 0
    ALOAD 3
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readBytes ([B)Lio/netty/buffer/ByteBuf;
    POP
   L5
    LINENUMBER 54 L5
    NEW java/lang/String
    DUP
    ALOAD 3
    GETSTATIC java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    INVOKESPECIAL java/lang/String.<init> ([BLjava/nio/charset/Charset;)V
    ASTORE 4
   L6
    LINENUMBER 55 L6
    ALOAD 4
    INVOKEVIRTUAL java/lang/String.length ()I
    ILOAD 1
    IF_ICMPLE L7
   L8
    LINENUMBER 57 L8
    NEW java/lang/RuntimeException
    DUP
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "Cannot receive string longer than "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ILOAD 1
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    LDC " (got "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 4
    INVOKEVIRTUAL java/lang/String.length ()I
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    LDC " characters)"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/String;)V
    ATHROW
   L7
    LINENUMBER 60 L7
   FRAME FULL [T T T T java/lang/String] []
    ALOAD 4
    ARETURN
    MAXSTACK = 5
    MAXLOCALS = 5

  // access flags 0x9
  public static a([BLio/netty/buffer/ByteBuf;)V
    // parameter  arr
    // parameter  byteBuf
   L0
    LINENUMBER 65 L0
    ALOAD 0
    ARRAYLENGTH
    SIPUSH 32767
    IF_ICMPLE L1
   L2
    LINENUMBER 67 L2
    NEW java/lang/RuntimeException
    DUP
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "Cannot send byte array longer than Short.MAX_VALUE (got "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    ARRAYLENGTH
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    LDC " bytes)"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/String;)V
    ATHROW
   L1
    LINENUMBER 69 L1
   FRAME SAME
    ALOAD 0
    ARRAYLENGTH
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
   L3
    LINENUMBER 70 L3
    ALOAD 1
    ALOAD 0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBytes ([B)Lio/netty/buffer/ByteBuf;
    POP
   L4
    LINENUMBER 71 L4
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 2

  // access flags 0x9
  public static a(Lio/netty/buffer/ByteBuf;)[B
    // parameter  byteBuf
   L0
    LINENUMBER 75 L0
    ALOAD 0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readableBytes ()I
    NEWARRAY T_BYTE
    ASTORE 1
   L1
    LINENUMBER 76 L1
    ALOAD 0
    ALOAD 1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readBytes ([B)Lio/netty/buffer/ByteBuf;
    POP
   L2
    LINENUMBER 78 L2
    ALOAD 1
    ARETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x9
  public static b(Lio/netty/buffer/ByteBuf;)[B
    // parameter  byteBuf
   L0
    LINENUMBER 83 L0
    ALOAD 0
    ALOAD 0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readableBytes ()I
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;I)[B
    ARETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x9
  public static a(Lio/netty/buffer/ByteBuf;I)[B
    // parameter  byteBuf
    // parameter  integer
   L0
    LINENUMBER 88 L0
    ALOAD 0
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)I
    ISTORE 2
   L1
    LINENUMBER 89 L1
    ILOAD 2
    ILOAD 1
    IF_ICMPLE L2
   L3
    LINENUMBER 91 L3
    NEW java/lang/RuntimeException
    DUP
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "Cannot receive byte array longer than "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ILOAD 1
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    LDC " (got "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ILOAD 2
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    LDC " bytes)"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/String;)V
    ATHROW
   L2
    LINENUMBER 93 L2
   FRAME FULL [io/netty/buffer/ByteBuf T I] []
    ILOAD 2
    NEWARRAY T_BYTE
    ASTORE 3
   L4
    LINENUMBER 94 L4
    ALOAD 0
    ALOAD 3
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readBytes ([B)Lio/netty/buffer/ByteBuf;
    POP
   L5
    LINENUMBER 95 L5
    ALOAD 3
    ARETURN
    MAXSTACK = 4
    MAXLOCALS = 4

  // access flags 0x9
  public static a(Lio/netty/buffer/ByteBuf;)[I
    // parameter  byteBuf
   L0
    LINENUMBER 100 L0
    ALOAD 0
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)I
    ISTORE 1
   L1
    LINENUMBER 101 L1
    ILOAD 1
    NEWARRAY T_INT
    ASTORE 2
   L2
    LINENUMBER 103 L2
    ICONST_0
    ISTORE 3
   L3
   FRAME APPEND [I [I I]
    ILOAD 3
    ILOAD 1
    IF_ICMPGE L4
   L5
    LINENUMBER 105 L5
    ALOAD 2
    ILOAD 3
    ALOAD 0
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)I
    IASTORE
   L6
    LINENUMBER 103 L6
    IINC 3 1
    GOTO L3
   L4
    LINENUMBER 108 L4
   FRAME FULL [T T [I] []
    ALOAD 2
    ARETURN
    MAXSTACK = 3
    MAXLOCALS = 4

  // access flags 0x9
  // signature (Ljava/util/List<Ljava/lang/String;>;Lio/netty/buffer/ByteBuf;)V
  // declaration: void a(java.util.List<java.lang.String>, io.netty.buffer.ByteBuf)
  public static a(Ljava/util/List;Lio/netty/buffer/ByteBuf;)V
    // parameter  list
    // parameter  byteBuf
   L0
    LINENUMBER 113 L0
    ALOAD 0
    INVOKEINTERFACE java/util/List.size ()I (itf)
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 114 L1
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
    CHECKCAST java/lang/String
    ASTORE 3
   L4
    LINENUMBER 116 L4
    ALOAD 3
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Ljava/lang/String;Lio/netty/buffer/ByteBuf;)V
   L5
    LINENUMBER 117 L5
    GOTO L2
   L3
    LINENUMBER 118 L3
   FRAME CHOP 3
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x9
  // signature (Lio/netty/buffer/ByteBuf;)Ljava/util/List<Ljava/lang/String;>;
  // declaration: java.util.List<java.lang.String> a(io.netty.buffer.ByteBuf)
  public static a(Lio/netty/buffer/ByteBuf;)Ljava/util/List;
    // parameter  byteBuf
   L0
    LINENUMBER 122 L0
    ALOAD 0
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)I
    ISTORE 1
   L1
    LINENUMBER 123 L1
    NEW java/util/ArrayList
    DUP
    ILOAD 1
    INVOKESPECIAL java/util/ArrayList.<init> (I)V
    ASTORE 2
   L2
    LINENUMBER 124 L2
    ICONST_0
    ISTORE 3
   L3
   FRAME APPEND [I java/util/ArrayList I]
    ILOAD 3
    ILOAD 1
    IF_ICMPGE L4
   L5
    LINENUMBER 126 L5
    ALOAD 2
    ALOAD 0
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)Ljava/lang/String;
    INVOKEINTERFACE java/util/List.add (Ljava/lang/Object;)Z (itf)
    POP
   L6
    LINENUMBER 124 L6
    IINC 3 1
    GOTO L3
   L4
    LINENUMBER 128 L4
   FRAME FULL [T T java/util/ArrayList] []
    ALOAD 2
    ARETURN
    MAXSTACK = 3
    MAXLOCALS = 4

  // access flags 0x9
  public static a(Lio/netty/buffer/ByteBuf;)I
    // parameter  byteBuf
   L0
    LINENUMBER 133 L0
    ALOAD 0
    ICONST_5
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;I)I
    IRETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x9
  public static a(Lio/netty/buffer/ByteBuf;I)I
    // parameter  byteBuf
    // parameter  integer
   L0
    LINENUMBER 138 L0
    ICONST_0
    ISTORE 2
   L1
    LINENUMBER 139 L1
    ICONST_0
    ISTORE 3
   L2
    LINENUMBER 143 L2
   FRAME APPEND [I I]
    ALOAD 0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readByte ()B
    ISTORE 4
   L3
    LINENUMBER 145 L3
    ILOAD 2
    ILOAD 4
    BIPUSH 127
    IAND
    ILOAD 3
    IINC 3 1
    BIPUSH 7
    IMUL
    ISHL
    IOR
    ISTORE 2
   L4
    LINENUMBER 147 L4
    ILOAD 3
    ILOAD 1
    IF_ICMPLE L5
   L6
    LINENUMBER 149 L6
    NEW java/lang/RuntimeException
    DUP
    LDC "VarInt too big"
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/String;)V
    ATHROW
   L5
    LINENUMBER 152 L5
   FRAME APPEND [I]
    ILOAD 4
    SIPUSH 128
    IAND
    SIPUSH 128
    IF_ICMPEQ L2
   L7
    LINENUMBER 154 L7
    GOTO L8
   L8
    LINENUMBER 158 L8
   FRAME FULL [T T I] []
    ILOAD 2
    IRETURN
    MAXSTACK = 4
    MAXLOCALS = 5

  // access flags 0x9
  public static a(ILio/netty/buffer/ByteBuf;)V
    // parameter  integer
    // parameter  byteBuf
   L0
    LINENUMBER 166 L0
   FRAME SAME
    ILOAD 0
    BIPUSH 127
    IAND
    ISTORE 2
   L1
    LINENUMBER 168 L1
    ILOAD 0
    BIPUSH 7
    IUSHR
    ISTORE 0
   L2
    LINENUMBER 169 L2
    ILOAD 0
    IFEQ L3
   L4
    LINENUMBER 171 L4
    ILOAD 2
    SIPUSH 128
    IOR
    ISTORE 2
   L3
    LINENUMBER 174 L3
   FRAME APPEND [I]
    ALOAD 1
    ILOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeByte (I)Lio/netty/buffer/ByteBuf;
    POP
   L5
    LINENUMBER 176 L5
    ILOAD 0
    IFNE L0
   L6
    LINENUMBER 178 L6
    GOTO L7
   L7
    LINENUMBER 181 L7
   FRAME CHOP 3
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 3

  // access flags 0x9
  public static b(Lio/netty/buffer/ByteBuf;)I
    // parameter  byteBuf
   L0
    LINENUMBER 185 L0
    ALOAD 0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readUnsignedShort ()I
    ISTORE 1
   L1
    LINENUMBER 186 L1
    ICONST_0
    ISTORE 2
   L2
    LINENUMBER 187 L2
    ILOAD 1
    LDC 32768
    IAND
    IFEQ L3
   L4
    LINENUMBER 189 L4
    ILOAD 1
    SIPUSH 32767
    IAND
    ISTORE 1
   L5
    LINENUMBER 190 L5
    ALOAD 0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readUnsignedByte ()S
    ISTORE 2
   L3
    LINENUMBER 192 L3
   FRAME FULL [T I I] []
    ILOAD 2
    SIPUSH 255
    IAND
    BIPUSH 15
    ISHL
    ILOAD 1
    IOR
    IRETURN
    MAXSTACK = 2
    MAXLOCALS = 3

  // access flags 0x9
  public static a(Lio/netty/buffer/ByteBuf;I)V
    // parameter  byteBuf
    // parameter  integer
   L0
    LINENUMBER 197 L0
    ILOAD 1
    SIPUSH 32767
    IAND
    ISTORE 2
   L1
    LINENUMBER 198 L1
    ILOAD 1
    LDC 8355840
    IAND
    BIPUSH 15
    ISHR
    ISTORE 3
   L2
    LINENUMBER 199 L2
    ILOAD 3
    IFEQ L3
   L4
    LINENUMBER 201 L4
    ILOAD 2
    LDC 32768
    IOR
    ISTORE 2
   L3
    LINENUMBER 203 L3
   FRAME FULL [io/netty/buffer/ByteBuf T I I] []
    ALOAD 0
    ILOAD 2
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeShort (I)Lio/netty/buffer/ByteBuf;
    POP
   L5
    LINENUMBER 204 L5
    ILOAD 3
    IFEQ L6
   L7
    LINENUMBER 206 L7
    ALOAD 0
    ILOAD 3
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeByte (I)Lio/netty/buffer/ByteBuf;
    POP
   L6
    LINENUMBER 208 L6
   FRAME FULL [] []
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x9
  public static a(Ljava/util/UUID;Lio/netty/buffer/ByteBuf;)V
    // parameter  uUID
    // parameter  byteBuf
   L0
    LINENUMBER 212 L0
    ALOAD 1
    ALOAD 0
    INVOKEVIRTUAL java/util/UUID.getMostSignificantBits ()J
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeLong (J)Lio/netty/buffer/ByteBuf;
    POP
   L1
    LINENUMBER 213 L1
    ALOAD 1
    ALOAD 0
    INVOKEVIRTUAL java/util/UUID.getLeastSignificantBits ()J
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeLong (J)Lio/netty/buffer/ByteBuf;
    POP
   L2
    LINENUMBER 214 L2
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 2

  // access flags 0x9
  public static a(Lio/netty/buffer/ByteBuf;)Ljava/util/UUID;
    // parameter  byteBuf
   L0
    LINENUMBER 218 L0
    NEW java/util/UUID
    DUP
    ALOAD 0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readLong ()J
    ALOAD 0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readLong ()J
    INVOKESPECIAL java/util/UUID.<init> (JJ)V
    ARETURN
    MAXSTACK = 6
    MAXLOCALS = 1

  // access flags 0x9
  public static a([Lq;Lio/netty/buffer/ByteBuf;)V
    // parameter  arr
    // parameter  byteBuf
   L0
    LINENUMBER 223 L0
    ALOAD 0
    IFNONNULL L1
   L2
    LINENUMBER 225 L2
    ICONST_0
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
   L3
    LINENUMBER 226 L3
    RETURN
   L1
    LINENUMBER 229 L1
   FRAME SAME
    ALOAD 0
    ARRAYLENGTH
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
   L4
    LINENUMBER 230 L4
    ALOAD 0
    ASTORE 2
    ALOAD 2
    ARRAYLENGTH
    ISTORE 3
    ICONST_0
    ISTORE 4
   L5
   FRAME FULL [T io/netty/buffer/ByteBuf [Lq; I I] []
    ILOAD 4
    ILOAD 3
    IF_ICMPGE L6
    ALOAD 2
    ILOAD 4
    AALOAD
    ASTORE 5
   L7
    LINENUMBER 232 L7
    ALOAD 5
    INVOKEVIRTUAL q.a ()Ljava/lang/String;
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Ljava/lang/String;Lio/netty/buffer/ByteBuf;)V
   L8
    LINENUMBER 233 L8
    ALOAD 5
    INVOKEVIRTUAL q.b ()Ljava/lang/String;
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Ljava/lang/String;Lio/netty/buffer/ByteBuf;)V
   L9
    LINENUMBER 234 L9
    ALOAD 5
    INVOKEVIRTUAL q.c ()Ljava/lang/String;
    IFNULL L10
   L11
    LINENUMBER 236 L11
    ALOAD 1
    ICONST_1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
    POP
   L12
    LINENUMBER 237 L12
    ALOAD 5
    INVOKEVIRTUAL q.c ()Ljava/lang/String;
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Ljava/lang/String;Lio/netty/buffer/ByteBuf;)V
    GOTO L13
   L10
    LINENUMBER 240 L10
   FRAME SAME
    ALOAD 1
    ICONST_0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
    POP
   L13
    LINENUMBER 230 L13
   FRAME SAME
    IINC 4 1
    GOTO L5
   L6
    LINENUMBER 243 L6
   FRAME FULL [] []
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 6

  // access flags 0x9
  public static a(Lio/netty/buffer/ByteBuf;)[Lq;
    // parameter  byteBuf
   L0
    LINENUMBER 247 L0
    ALOAD 0
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)I
    ANEWARRAY q
    ASTORE 1
   L1
    LINENUMBER 248 L1
    ICONST_0
    ISTORE 2
   L2
   FRAME APPEND [[Lq; I]
    ILOAD 2
    ALOAD 1
    ARRAYLENGTH
    IF_ICMPGE L3
   L4
    LINENUMBER 250 L4
    ALOAD 0
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)Ljava/lang/String;
    ASTORE 3
   L5
    LINENUMBER 251 L5
    ALOAD 0
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)Ljava/lang/String;
    ASTORE 4
   L6
    LINENUMBER 252 L6
    ALOAD 0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readBoolean ()Z
    IFEQ L7
   L8
    LINENUMBER 254 L8
    ALOAD 1
    ILOAD 2
    NEW q
    DUP
    ALOAD 3
    ALOAD 4
    ALOAD 0
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;)Ljava/lang/String;
    INVOKESPECIAL q.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    AASTORE
    GOTO L9
   L7
    LINENUMBER 257 L7
   FRAME APPEND [java/lang/String java/lang/String]
    ALOAD 1
    ILOAD 2
    NEW q
    DUP
    ALOAD 3
    ALOAD 4
    INVOKESPECIAL q.<init> (Ljava/lang/String;Ljava/lang/String;)V
    AASTORE
   L9
    LINENUMBER 248 L9
   FRAME CHOP 2
    IINC 2 1
    GOTO L2
   L3
    LINENUMBER 261 L3
   FRAME FULL [T [Lq;] []
    ALOAD 1
    ARETURN
    MAXSTACK = 7
    MAXLOCALS = 5

  // access flags 0x9
  public static a(Lp;Lio/netty/buffer/ByteBuf;)V
    // parameter  p
    // parameter  byteBuf
   L0
    LINENUMBER 266 L0
    ALOAD 0
    IFNULL L1
   L2
    LINENUMBER 268 L2
    ALOAD 1
    ICONST_1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
    POP
   L3
    LINENUMBER 269 L3
    ALOAD 1
    ALOAD 0
    INVOKEVIRTUAL p.a ()J
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeLong (J)Lio/netty/buffer/ByteBuf;
    POP
   L4
    LINENUMBER 270 L4
    ALOAD 0
    INVOKEVIRTUAL p.a ()[B
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a ([BLio/netty/buffer/ByteBuf;)V
   L5
    LINENUMBER 271 L5
    ALOAD 0
    INVOKEVIRTUAL p.b ()[B
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a ([BLio/netty/buffer/ByteBuf;)V
    GOTO L6
   L1
    LINENUMBER 274 L1
   FRAME FULL [T io/netty/buffer/ByteBuf] []
    ALOAD 1
    ICONST_0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
    POP
   L6
    LINENUMBER 276 L6
   FRAME CHOP 2
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 2

  // access flags 0x9
  public static a(Lio/netty/buffer/ByteBuf;)Lp;
    // parameter  byteBuf
   L0
    LINENUMBER 280 L0
    ALOAD 0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readBoolean ()Z
    IFEQ L1
   L2
    LINENUMBER 282 L2
    NEW p
    DUP
    ALOAD 0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readLong ()J
    ALOAD 0
    INVOKESTATIC MinecraftFriendlyByteBuf.b (Lio/netty/buffer/ByteBuf;)[B
    ALOAD 0
    INVOKESTATIC MinecraftFriendlyByteBuf.b (Lio/netty/buffer/ByteBuf;)[B
    INVOKESPECIAL p.<init> (J[B[B)V
    ARETURN
   L1
    LINENUMBER 285 L1
   FRAME CHOP 1
    ACONST_NULL
    ARETURN
    MAXSTACK = 6
    MAXLOCALS = 1

  // access flags 0x401
  public abstract a(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf

  // access flags 0x1
  public b(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 295 L0
    NEW java/lang/UnsupportedOperationException
    DUP
    LDC "Packet must implement read method"
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
    LINENUMBER 300 L0
    ALOAD 0
    ALOAD 1
    INVOKEVIRTUAL MinecraftFriendlyByteBuf.b (Lio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 301 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x1
  public c(Lio/netty/buffer/ByteBuf;)V
    // parameter  byteBuf
   L0
    LINENUMBER 305 L0
    NEW java/lang/UnsupportedOperationException
    DUP
    LDC "Packet must implement write method"
    INVOKESPECIAL java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
    ATHROW
    MAXSTACK = 3
    MAXLOCALS = 2

  // access flags 0x1
  public b(Lio/netty/buffer/ByteBuf;Lr$a;I)V
    // parameter  byteBuf
    // parameter  a
    // parameter  integer
   L0
    LINENUMBER 310 L0
    ALOAD 0
    ALOAD 1
    INVOKEVIRTUAL MinecraftFriendlyByteBuf.c (Lio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 311 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x9
  public static a(Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;
    // parameter  byteBuf
   L0
    LINENUMBER 314 L0
    ALOAD 0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readableBytes ()I
    ALOAD 0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readableBytes ()I
    INVOKESTATIC MinecraftFriendlyByteBuf.a (I)I
    IADD
    INVOKESTATIC io/netty/buffer/Unpooled.buffer (I)Lio/netty/buffer/ByteBuf;
    ASTORE 1
   L1
    LINENUMBER 315 L1
    ALOAD 0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readableBytes ()I
    ALOAD 1
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
   L2
    LINENUMBER 316 L2
    ALOAD 1
    ALOAD 0
    ALOAD 0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readableBytes ()I
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBytes (Lio/netty/buffer/ByteBuf;I)Lio/netty/buffer/ByteBuf;
    POP
   L3
    LINENUMBER 317 L3
    ALOAD 0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.release ()Z
    POP
   L4
    LINENUMBER 318 L4
    ALOAD 1
    ARETURN
    MAXSTACK = 3
    MAXLOCALS = 2

  // access flags 0x9
  public static a(Lio/netty/buffer/ByteBuf;ILA;)Lio/netty/buffer/ByteBuf;
    // parameter  byteBuf
    // parameter  integer
    // parameter  a
    TRYCATCHBLOCK L0 L1 L2 java/util/zip/DataFormatException
   L3
    LINENUMBER 326 L3
    ALOAD 0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readableBytes ()I
    ISTORE 3
   L4
    LINENUMBER 327 L4
    INVOKESTATIC io/netty/buffer/Unpooled.buffer ()Lio/netty/buffer/ByteBuf;
    ASTORE 4
   L5
    LINENUMBER 329 L5
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "try: orginalsize"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ILOAD 3
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    LDC " threshold"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ILOAD 1
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L6
    LINENUMBER 331 L6
    ILOAD 3
    ILOAD 1
    IF_ICMPGE L7
   L8
    LINENUMBER 333 L8
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "write uncompressed"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L9
    LINENUMBER 334 L9
    ICONST_0
    ALOAD 4
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
   L10
    LINENUMBER 335 L10
    ALOAD 4
    ALOAD 0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBytes (Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;
    POP
    GOTO L11
   L7
    LINENUMBER 338 L7
   FRAME FULL [io/netty/buffer/ByteBuf T A I io/netty/buffer/ByteBuf] []
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "write compressed"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L12
    LINENUMBER 340 L12
    ILOAD 3
    ALOAD 4
    INVOKESTATIC MinecraftFriendlyByteBuf.a (ILio/netty/buffer/ByteBuf;)V
   L0
    LINENUMBER 342 L0
    ALOAD 2
    ALOAD 0
    ALOAD 4
    INVOKEVIRTUAL A.a (Lio/netty/buffer/ByteBuf;Lio/netty/buffer/ByteBuf;)V
   L1
    LINENUMBER 345 L1
    GOTO L11
   L2
    LINENUMBER 343 L2
   FRAME FULL [] [java/util/zip/DataFormatException]
    ASTORE 5
   L13
    LINENUMBER 344 L13
    NEW java/lang/RuntimeException
    DUP
    ALOAD 5
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/Throwable;)V
    ATHROW
   L11
    LINENUMBER 347 L11
   FRAME FULL [io/netty/buffer/ByteBuf T T T io/netty/buffer/ByteBuf] []
    ALOAD 0
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.release ()Z
    POP
   L14
    LINENUMBER 348 L14
    ALOAD 4
    ARETURN
    MAXSTACK = 3
    MAXLOCALS = 6

  // access flags 0x9
  public static b(Lio/netty/buffer/ByteBuf;ILA;)Lio/netty/buffer/ByteBuf;
    // parameter  byteBuf
    // parameter  integer
    // parameter  a
   L0
    LINENUMBER 354 L0
    ALOAD 2
    IFNULL L1
    ILOAD 1
    ICONST_M1
    IF_ICMPNE L2
   L1
    LINENUMBER 355 L1
   FRAME CHOP 2
    ALOAD 0
    ARETURN
   L2
    LINENUMBER 357 L2
   FRAME APPEND [I A]
    ALOAD 0
    ILOAD 1
    ALOAD 2
    INVOKESTATIC MinecraftFriendlyByteBuf.a (Lio/netty/buffer/ByteBuf;ILA;)Lio/netty/buffer/ByteBuf;
    ARETURN
    MAXSTACK = 3
    MAXLOCALS = 3

  // access flags 0xA
  private static a(I)I
    // parameter  integer
   L0
    LINENUMBER 363 L0
    ILOAD 0
    BIPUSH -128
    IAND
    IFNE L1
   L2
    LINENUMBER 365 L2
    ICONST_1
    IRETURN
   L1
    LINENUMBER 367 L1
   FRAME SAME
    ILOAD 0
    SIPUSH -16384
    IAND
    IFNE L3
   L4
    LINENUMBER 369 L4
    ICONST_2
    IRETURN
   L3
    LINENUMBER 371 L3
   FRAME SAME
    ILOAD 0
    LDC -2097152
    IAND
    IFNE L5
   L6
    LINENUMBER 373 L6
    ICONST_3
    IRETURN
   L5
    LINENUMBER 375 L5
   FRAME SAME
    ILOAD 0
    LDC -268435456
    IAND
    IFNE L7
   L8
    LINENUMBER 377 L8
    ICONST_4
    IRETURN
   L7
    LINENUMBER 379 L7
   FRAME CHOP 1
    ICONST_5
    IRETURN
    MAXSTACK = 2
    MAXLOCALS = 1
}
