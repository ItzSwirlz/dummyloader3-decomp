// class version 52.0 (52)
// access flags 0x21
public class Y {

  // compiled from: 

  ATTRIBUTE Code : unknown

  // access flags 0x2
  private Ljava/lang/String; a

  // access flags 0x2
  private Ljava/lang/String; b

  // access flags 0x2
  private LY; a

  // access flags 0x2
  private [Ljava/lang/StackTraceElement; a

  // access flags 0x1
  public <init>(Ljava/lang/String;Ljava/lang/String;LY;[Ljava/lang/StackTraceElement;)V
    // parameter  string1
    // parameter  string2
    // parameter  y
    // parameter  arr
   L0
    LINENUMBER 15 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
   L1
    LINENUMBER 16 L1
    ALOAD 0
    ALOAD 1
    PUTFIELD Y.a : Ljava/lang/String;
   L2
    LINENUMBER 17 L2
    ALOAD 0
    ALOAD 2
    PUTFIELD Y.b : Ljava/lang/String;
   L3
    LINENUMBER 18 L3
    ALOAD 0
    ALOAD 3
    PUTFIELD Y.a : LY;
   L4
    LINENUMBER 19 L4
    ALOAD 0
    ALOAD 4
    PUTFIELD Y.a : [Ljava/lang/StackTraceElement;
   L5
    LINENUMBER 20 L5
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 5

  // access flags 0x1
  public <init>(Ljava/lang/Throwable;)V
    // parameter  throwable
   L0
    LINENUMBER 22 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
   L1
    LINENUMBER 23 L1
    ALOAD 0
    ALOAD 1
    INVOKEVIRTUAL java/lang/Object.getClass ()Ljava/lang/Class;
    INVOKEVIRTUAL java/lang/Class.getName ()Ljava/lang/String;
    PUTFIELD Y.a : Ljava/lang/String;
   L2
    LINENUMBER 24 L2
    ALOAD 0
    ALOAD 1
    INVOKEVIRTUAL java/lang/Throwable.getMessage ()Ljava/lang/String;
    PUTFIELD Y.b : Ljava/lang/String;
   L3
    LINENUMBER 25 L3
    ALOAD 0
    ALOAD 1
    INVOKEVIRTUAL java/lang/Throwable.getCause ()Ljava/lang/Throwable;
    IFNULL L4
    NEW Y
    DUP
    ALOAD 1
    INVOKEVIRTUAL java/lang/Throwable.getCause ()Ljava/lang/Throwable;
    INVOKESPECIAL Y.<init> (Ljava/lang/Throwable;)V
    GOTO L5
   L4
   FRAME FULL [Y java/lang/Throwable] [Y]
    ACONST_NULL
   L5
   FRAME FULL [Y java/lang/Throwable] [Y Y]
    PUTFIELD Y.a : LY;
   L6
    LINENUMBER 26 L6
    ALOAD 0
    ALOAD 1
    INVOKEVIRTUAL java/lang/Throwable.getStackTrace ()[Ljava/lang/StackTraceElement;
    PUTFIELD Y.a : [Ljava/lang/StackTraceElement;
   L7
    LINENUMBER 27 L7
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 2

  // access flags 0x1
  public a(Ljava/io/DataOutput;)V throws java/lang/Exception 
    // parameter  dataOutput
   L0
    LINENUMBER 30 L0
    ALOAD 0
    ASTORE 2
   L1
    LINENUMBER 31 L1
   FRAME FULL [T java/io/DataOutput Y] []
    ALOAD 2
    IFNULL L2
   L3
    LINENUMBER 32 L3
    ALOAD 1
    ALOAD 2
    INVOKEVIRTUAL Y.a ()Ljava/lang/String;
    INVOKEINTERFACE java/io/DataOutput.writeUTF (Ljava/lang/String;)V (itf)
   L4
    LINENUMBER 33 L4
    ALOAD 1
    ALOAD 2
    INVOKEVIRTUAL Y.b ()Ljava/lang/String;
    INVOKEINTERFACE java/io/DataOutput.writeUTF (Ljava/lang/String;)V (itf)
   L5
    LINENUMBER 34 L5
    ALOAD 1
    ALOAD 2
    INVOKEVIRTUAL Y.a ()[Ljava/lang/StackTraceElement;
    ARRAYLENGTH
    INVOKEINTERFACE java/io/DataOutput.writeShort (I)V (itf)
   L6
    LINENUMBER 35 L6
    ALOAD 2
    INVOKEVIRTUAL Y.a ()[Ljava/lang/StackTraceElement;
    ASTORE 3
    ALOAD 3
    ARRAYLENGTH
    ISTORE 4
    ICONST_0
    ISTORE 5
   L7
   FRAME APPEND [[Ljava/lang/StackTraceElement; I I]
    ILOAD 5
    ILOAD 4
    IF_ICMPGE L8
    ALOAD 3
    ILOAD 5
    AALOAD
    ASTORE 6
   L9
    LINENUMBER 36 L9
    ALOAD 1
    ALOAD 6
    INVOKEVIRTUAL java/lang/StackTraceElement.getClassName ()Ljava/lang/String;
    INVOKEINTERFACE java/io/DataOutput.writeUTF (Ljava/lang/String;)V (itf)
   L10
    LINENUMBER 37 L10
    ALOAD 1
    ALOAD 6
    INVOKEVIRTUAL java/lang/StackTraceElement.getMethodName ()Ljava/lang/String;
    INVOKEINTERFACE java/io/DataOutput.writeUTF (Ljava/lang/String;)V (itf)
   L11
    LINENUMBER 38 L11
    ALOAD 1
    ALOAD 6
    INVOKEVIRTUAL java/lang/StackTraceElement.getFileName ()Ljava/lang/String;
    IFNULL L12
    ICONST_1
    GOTO L13
   L12
   FRAME FULL [T java/io/DataOutput Y [Ljava/lang/StackTraceElement; I I java/lang/StackTraceElement] [java/io/DataOutput]
    ICONST_0
   L13
   FRAME FULL [T java/io/DataOutput Y [Ljava/lang/StackTraceElement; I I java/lang/StackTraceElement] [java/io/DataOutput I]
    INVOKEINTERFACE java/io/DataOutput.writeBoolean (Z)V (itf)
   L14
    LINENUMBER 39 L14
    ALOAD 6
    INVOKEVIRTUAL java/lang/StackTraceElement.getFileName ()Ljava/lang/String;
    IFNULL L15
   L16
    LINENUMBER 40 L16
    ALOAD 1
    ALOAD 6
    INVOKEVIRTUAL java/lang/StackTraceElement.getFileName ()Ljava/lang/String;
    INVOKEINTERFACE java/io/DataOutput.writeUTF (Ljava/lang/String;)V (itf)
   L15
    LINENUMBER 42 L15
   FRAME SAME
    ALOAD 1
    ALOAD 6
    INVOKEVIRTUAL java/lang/StackTraceElement.getLineNumber ()I
    INVOKEINTERFACE java/io/DataOutput.writeInt (I)V (itf)
   L17
    LINENUMBER 35 L17
    IINC 5 1
    GOTO L7
   L8
    LINENUMBER 44 L8
   FRAME FULL [T java/io/DataOutput Y] []
    ALOAD 1
    ALOAD 2
    INVOKEVIRTUAL Y.a ()LY;
    IFNULL L18
    ICONST_1
    GOTO L19
   L18
   FRAME SAME1 java/io/DataOutput
    ICONST_0
   L19
   FRAME FULL [T java/io/DataOutput Y] [java/io/DataOutput I]
    INVOKEINTERFACE java/io/DataOutput.writeBoolean (Z)V (itf)
   L20
    LINENUMBER 45 L20
    ALOAD 2
    INVOKEVIRTUAL Y.a ()LY;
    ASTORE 2
    GOTO L1
   L2
    LINENUMBER 47 L2
   FRAME CHOP 3
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 7

  // access flags 0x9
  public static a(Ljava/io/DataInput;)LY; throws java/lang/Exception 
    // parameter  dataInput
   L0
    LINENUMBER 50 L0
    ACONST_NULL
    ASTORE 1
   L1
    LINENUMBER 52 L1
    ICONST_1
    ISTORE 3
   L2
    LINENUMBER 53 L2
    ACONST_NULL
    ASTORE 4
   L3
    LINENUMBER 55 L3
   FRAME FULL [java/io/DataInput Y T I Y] []
    ALOAD 0
    INVOKEINTERFACE java/io/DataInput.readUTF ()Ljava/lang/String; (itf)
    ASTORE 5
   L4
    LINENUMBER 56 L4
    ALOAD 0
    INVOKEINTERFACE java/io/DataInput.readUTF ()Ljava/lang/String; (itf)
    ASTORE 6
   L5
    LINENUMBER 57 L5
    ALOAD 0
    INVOKEINTERFACE java/io/DataInput.readUnsignedShort ()I (itf)
    ANEWARRAY java/lang/StackTraceElement
    ASTORE 7
   L6
    LINENUMBER 58 L6
    ICONST_0
    ISTORE 8
   L7
   FRAME FULL [java/io/DataInput Y T I Y java/lang/String java/lang/String [Ljava/lang/StackTraceElement; I] []
    ILOAD 8
    ALOAD 7
    ARRAYLENGTH
    IF_ICMPGE L8
   L9
    LINENUMBER 59 L9
    ALOAD 0
    INVOKEINTERFACE java/io/DataInput.readUTF ()Ljava/lang/String; (itf)
    ASTORE 9
   L10
    LINENUMBER 60 L10
    ALOAD 0
    INVOKEINTERFACE java/io/DataInput.readUTF ()Ljava/lang/String; (itf)
    ASTORE 10
   L11
    LINENUMBER 61 L11
    ALOAD 0
    INVOKEINTERFACE java/io/DataInput.readBoolean ()Z (itf)
    IFEQ L12
    ALOAD 0
    INVOKEINTERFACE java/io/DataInput.readUTF ()Ljava/lang/String; (itf)
    GOTO L13
   L12
   FRAME APPEND [java/lang/String java/lang/String]
    ACONST_NULL
   L13
   FRAME SAME1 java/lang/String
    ASTORE 11
   L14
    LINENUMBER 62 L14
    ALOAD 0
    INVOKEINTERFACE java/io/DataInput.readInt ()I (itf)
    ISTORE 12
   L15
    LINENUMBER 63 L15
    ALOAD 7
    ILOAD 8
    NEW java/lang/StackTraceElement
    DUP
    ALOAD 9
    ALOAD 10
    ALOAD 11
    ILOAD 12
    INVOKESPECIAL java/lang/StackTraceElement.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    AASTORE
   L16
    LINENUMBER 58 L16
    IINC 8 1
    GOTO L7
   L8
    LINENUMBER 65 L8
   FRAME CHOP 3
    NEW Y
    DUP
    ALOAD 5
    ALOAD 6
    ACONST_NULL
    ALOAD 7
    INVOKESPECIAL Y.<init> (Ljava/lang/String;Ljava/lang/String;LY;[Ljava/lang/StackTraceElement;)V
    ASTORE 8
   L17
    LINENUMBER 66 L17
    ALOAD 4
    IFNULL L18
   L19
    LINENUMBER 67 L19
    ALOAD 4
    ALOAD 8
    INVOKEVIRTUAL Y.a (LY;)V
   L18
    LINENUMBER 69 L18
   FRAME FULL [java/io/DataInput Y T I T T T T Y] []
    ALOAD 8
    ASTORE 4
   L20
    LINENUMBER 70 L20
    ILOAD 3
    IFEQ L21
   L22
    LINENUMBER 71 L22
    ICONST_0
    ISTORE 3
   L23
    LINENUMBER 72 L23
    ALOAD 4
    ASTORE 1
   L21
    LINENUMBER 74 L21
   FRAME FULL [java/io/DataInput Y T I Y] []
    ALOAD 0
    INVOKEINTERFACE java/io/DataInput.readBoolean ()Z (itf)
    ISTORE 2
   L24
    LINENUMBER 75 L24
    ILOAD 2
    IFNE L3
   L25
    LINENUMBER 76 L25
    ALOAD 1
    ARETURN
    MAXSTACK = 8
    MAXLOCALS = 13

  // access flags 0x1
  public a()Ljava/lang/String;
   L0
    LINENUMBER 80 L0
    ALOAD 0
    GETFIELD Y.a : Ljava/lang/String;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a(Ljava/lang/String;)V
    // parameter  string
   L0
    LINENUMBER 84 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD Y.a : Ljava/lang/String;
   L1
    LINENUMBER 85 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public b()Ljava/lang/String;
   L0
    LINENUMBER 88 L0
    ALOAD 0
    GETFIELD Y.b : Ljava/lang/String;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public b(Ljava/lang/String;)V
    // parameter  string
   L0
    LINENUMBER 92 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD Y.b : Ljava/lang/String;
   L1
    LINENUMBER 93 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public a()LY;
   L0
    LINENUMBER 96 L0
    ALOAD 0
    GETFIELD Y.a : LY;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a(LY;)V
    // parameter  y
   L0
    LINENUMBER 100 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD Y.a : LY;
   L1
    LINENUMBER 101 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public a()[Ljava/lang/StackTraceElement;
   L0
    LINENUMBER 104 L0
    ALOAD 0
    GETFIELD Y.a : [Ljava/lang/StackTraceElement;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a([Ljava/lang/StackTraceElement;)V
    // parameter  arr
   L0
    LINENUMBER 108 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD Y.a : [Ljava/lang/StackTraceElement;
   L1
    LINENUMBER 109 L1
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public equals(Ljava/lang/Object;)Z
    // parameter  o
   L0
    LINENUMBER 113 L0
    ALOAD 0
    ALOAD 1
    IF_ACMPNE L1
    ICONST_1
    IRETURN
   L1
    LINENUMBER 114 L1
   FRAME SAME
    ALOAD 1
    IFNULL L2
    ALOAD 0
    INVOKEVIRTUAL java/lang/Object.getClass ()Ljava/lang/Class;
    ALOAD 1
    INVOKEVIRTUAL java/lang/Object.getClass ()Ljava/lang/Class;
    IF_ACMPEQ L3
   L2
   FRAME CHOP 2
    ICONST_0
    IRETURN
   L3
    LINENUMBER 115 L3
   FRAME APPEND [Y java/lang/Object]
    ALOAD 1
    CHECKCAST Y
    ASTORE 2
   L4
    LINENUMBER 116 L4
    ALOAD 0
    GETFIELD Y.a : Ljava/lang/String;
    ALOAD 2
    GETFIELD Y.a : Ljava/lang/String;
    INVOKESTATIC java/util/Objects.equals (Ljava/lang/Object;Ljava/lang/Object;)Z
    IFEQ L5
    ALOAD 0
    GETFIELD Y.b : Ljava/lang/String;
    ALOAD 2
    GETFIELD Y.b : Ljava/lang/String;
    INVOKESTATIC java/util/Objects.equals (Ljava/lang/Object;Ljava/lang/Object;)Z
    IFEQ L5
    ALOAD 0
    GETFIELD Y.a : LY;
    ALOAD 2
    GETFIELD Y.a : LY;
    INVOKESTATIC java/util/Objects.equals (Ljava/lang/Object;Ljava/lang/Object;)Z
    IFEQ L5
    ALOAD 0
    GETFIELD Y.a : [Ljava/lang/StackTraceElement;
    ALOAD 2
    GETFIELD Y.a : [Ljava/lang/StackTraceElement;
    INVOKESTATIC java/util/Arrays.equals ([Ljava/lang/Object;[Ljava/lang/Object;)Z
    IFEQ L5
    ICONST_1
    GOTO L6
   L5
   FRAME CHOP 2
    ICONST_0
   L6
   FRAME SAME1 I
    IRETURN
   L7
    LOCALVARIABLE this LY; L0 L7 0
    LOCALVARIABLE o Ljava/lang/Object; L0 L7 1
    MAXSTACK = 2
    MAXLOCALS = 3

  // access flags 0x1
  public hashCode()I
   L0
    LINENUMBER 121 L0
    ICONST_3
    ANEWARRAY java/lang/Object
    DUP
    ICONST_0
    ALOAD 0
    GETFIELD Y.a : Ljava/lang/String;
    AASTORE
    DUP
    ICONST_1
    ALOAD 0
    GETFIELD Y.b : Ljava/lang/String;
    AASTORE
    DUP
    ICONST_2
    ALOAD 0
    GETFIELD Y.a : LY;
    AASTORE
    INVOKESTATIC java/util/Objects.hash ([Ljava/lang/Object;)I
    ISTORE 1
   L1
    LINENUMBER 122 L1
    BIPUSH 31
    ILOAD 1
    IMUL
    ALOAD 0
    GETFIELD Y.a : [Ljava/lang/StackTraceElement;
    INVOKESTATIC java/util/Arrays.hashCode ([Ljava/lang/Object;)I
    IADD
    ISTORE 1
   L2
    LINENUMBER 123 L2
    ILOAD 1
    IRETURN
    MAXSTACK = 4
    MAXLOCALS = 2

  // access flags 0x1
  public toString()Ljava/lang/String;
   L0
    LINENUMBER 128 L0
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    ASTORE 1
   L1
    LINENUMBER 129 L1
    ALOAD 1
    ALOAD 0
    GETFIELD Y.a : Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC ": "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    GETFIELD Y.b : Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKESTATIC java/lang/System.lineSeparator ()Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    POP
   L2
    LINENUMBER 130 L2
    ALOAD 0
    GETFIELD Y.a : [Ljava/lang/StackTraceElement;
    ASTORE 2
    ALOAD 2
    ARRAYLENGTH
    ISTORE 3
    ICONST_0
    ISTORE 4
   L3
   FRAME FULL [Y java/lang/StringBuilder [Ljava/lang/StackTraceElement; I I] []
    ILOAD 4
    ILOAD 3
    IF_ICMPGE L4
    ALOAD 2
    ILOAD 4
    AALOAD
    ASTORE 5
   L5
    LINENUMBER 131 L5
    ALOAD 1
    LDC "\u0009at "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 5
    INVOKEVIRTUAL java/lang/StackTraceElement.getClassName ()Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC "."
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 5
    INVOKEVIRTUAL java/lang/StackTraceElement.getMethodName ()Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC "("
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    POP
   L6
    LINENUMBER 132 L6
    ALOAD 5
    INVOKEVIRTUAL java/lang/StackTraceElement.isNativeMethod ()Z
    IFEQ L7
   L8
    LINENUMBER 133 L8
    ALOAD 1
    LDC "Native Method"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    POP
    GOTO L9
   L7
    LINENUMBER 135 L7
   FRAME APPEND [java/lang/StackTraceElement]
    ALOAD 1
    ALOAD 5
    INVOKEVIRTUAL java/lang/StackTraceElement.getFileName ()Ljava/lang/String;
    IFNONNULL L10
    LDC "Unknown Source"
    GOTO L11
   L10
   FRAME SAME1 java/lang/StringBuilder
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    ALOAD 5
    INVOKEVIRTUAL java/lang/StackTraceElement.getFileName ()Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC ":"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 5
    INVOKEVIRTUAL java/lang/StackTraceElement.getLineNumber ()I
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
   L11
   FRAME FULL [Y java/lang/StringBuilder [Ljava/lang/StackTraceElement; I I] [java/lang/StringBuilder java/lang/String]
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    POP
   L9
    LINENUMBER 137 L9
   FRAME SAME
    ALOAD 1
    LDC ")"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKESTATIC java/lang/System.lineSeparator ()Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    POP
   L12
    LINENUMBER 130 L12
    IINC 4 1
    GOTO L3
   L4
    LINENUMBER 139 L4
   FRAME CHOP 3
    ALOAD 0
    GETFIELD Y.a : LY;
    IFNULL L13
   L14
    LINENUMBER 140 L14
    ALOAD 1
    LDC "Caused by: "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    GETFIELD Y.a : LY;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    POP
   L13
    LINENUMBER 142 L13
   FRAME FULL [T java/lang/StringBuilder] []
    ALOAD 1
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ARETURN
    MAXSTACK = 3
    MAXLOCALS = 6
}
