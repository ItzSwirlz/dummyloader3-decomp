// class version 52.0 (52)
// access flags 0x4031
// signature Ljava/lang/Enum<LW;>;
// declaration: W extends java.lang.Enum<W>
public final enum W extends java/lang/Enum {

  // compiled from: 

  ATTRIBUTE Code : unknown

  // access flags 0x4019
  public final static enum LW; WINDOWS

  // access flags 0x4019
  public final static enum LW; LINUX

  // access flags 0x4019
  public final static enum LW; MACOS

  // access flags 0x4019
  public final static enum LW; SOLARIS

  // access flags 0x4019
  public final static enum LW; ANDROID

  // access flags 0x4019
  public final static enum LW; UNKNOWN

  // access flags 0x12
  private final Ljava/lang/String; a

  // access flags 0x101A
  private final static synthetic [LW; a

  // access flags 0x9
  public static values()[LW;
   L0
    LINENUMBER 3 L0
    GETSTATIC W.a : [LW;
    INVOKEVIRTUAL [LW;.clone ()Ljava/lang/Object;
    CHECKCAST [LW;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 0

  // access flags 0x9
  public static valueOf(Ljava/lang/String;)LW;
    // parameter  name
   L0
    LINENUMBER 3 L0
    LDC LW;.class
    ALOAD 0
    INVOKESTATIC java/lang/Enum.valueOf (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    CHECKCAST W
    ARETURN
   L1
    LOCALVARIABLE name Ljava/lang/String; L0 L1 0
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x2
  // signature (Ljava/lang/String;)V
  // declaration: void <init>(java.lang.String)
  private <init>(Ljava/lang/String;ILjava/lang/String;)V
    // parameter synthetic  name
    // parameter synthetic  ordinal
    // parameter  string3
   L0
    LINENUMBER 14 L0
    ALOAD 0
    ALOAD 1
    ILOAD 2
    INVOKESPECIAL java/lang/Enum.<init> (Ljava/lang/String;I)V
   L1
    LINENUMBER 15 L1
    ALOAD 0
    ALOAD 3
    PUTFIELD W.a : Ljava/lang/String;
   L2
    LINENUMBER 16 L2
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 4

  // access flags 0x1
  public a()Ljava/lang/String;
   L0
    LINENUMBER 19 L0
    ALOAD 0
    GETFIELD W.a : Ljava/lang/String;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public toString()Ljava/lang/String;
   L0
    LINENUMBER 24 L0
    ALOAD 0
    GETFIELD W.a : Ljava/lang/String;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x9
  public static a()Z
   L0
    LINENUMBER 28 L0
    INVOKESTATIC W.a ()LW;
    GETSTATIC W.WINDOWS : LW;
    IF_ACMPEQ L1
    ICONST_1
    GOTO L2
   L1
   FRAME SAME
    ICONST_0
   L2
   FRAME SAME1 I
    IRETURN
    MAXSTACK = 2
    MAXLOCALS = 0

  // access flags 0x9
  public static a()LW;
   L0
    LINENUMBER 31 L0
    LDC "os.name"
    INVOKESTATIC java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
    INVOKEVIRTUAL java/lang/String.toLowerCase ()Ljava/lang/String;
    ASTORE 0
   L1
    LINENUMBER 32 L1
    ALOAD 0
    LDC "win"
    INVOKEVIRTUAL java/lang/String.contains (Ljava/lang/CharSequence;)Z
    IFEQ L2
    GETSTATIC W.WINDOWS : LW;
    GOTO L3
   L2
    LINENUMBER 33 L2
   FRAME APPEND [java/lang/String]
    ALOAD 0
    LDC "mac"
    INVOKEVIRTUAL java/lang/String.contains (Ljava/lang/CharSequence;)Z
    IFEQ L4
    GETSTATIC W.MACOS : LW;
    GOTO L3
   L4
    LINENUMBER 34 L4
   FRAME SAME
    ALOAD 0
    LDC "solaris"
    INVOKEVIRTUAL java/lang/String.contains (Ljava/lang/CharSequence;)Z
    IFEQ L5
    GETSTATIC W.SOLARIS : LW;
    GOTO L3
   L5
    LINENUMBER 35 L5
   FRAME SAME
    ALOAD 0
    LDC "sunos"
    INVOKEVIRTUAL java/lang/String.contains (Ljava/lang/CharSequence;)Z
    IFEQ L6
    GETSTATIC W.SOLARIS : LW;
    GOTO L3
   L6
    LINENUMBER 36 L6
   FRAME SAME
    ALOAD 0
    LDC "linux"
    INVOKEVIRTUAL java/lang/String.contains (Ljava/lang/CharSequence;)Z
    IFEQ L7
    GETSTATIC W.LINUX : LW;
    GOTO L3
   L7
    LINENUMBER 37 L7
   FRAME SAME
    ALOAD 0
    LDC "unix"
    INVOKEVIRTUAL java/lang/String.contains (Ljava/lang/CharSequence;)Z
    IFEQ L8
    GETSTATIC W.LINUX : LW;
    GOTO L3
   L8
    LINENUMBER 38 L8
   FRAME CHOP 1
    GETSTATIC W.UNKNOWN : LW;
   L3
    LINENUMBER 32 L3
   FRAME SAME1 W
    ARETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x100A
  private static synthetic a()[LW;
   L0
    LINENUMBER 3 L0
    BIPUSH 6
    ANEWARRAY W
    DUP
    ICONST_0
    GETSTATIC W.WINDOWS : LW;
    AASTORE
    DUP
    ICONST_1
    GETSTATIC W.LINUX : LW;
    AASTORE
    DUP
    ICONST_2
    GETSTATIC W.MACOS : LW;
    AASTORE
    DUP
    ICONST_3
    GETSTATIC W.SOLARIS : LW;
    AASTORE
    DUP
    ICONST_4
    GETSTATIC W.ANDROID : LW;
    AASTORE
    DUP
    ICONST_5
    GETSTATIC W.UNKNOWN : LW;
    AASTORE
    ARETURN
    MAXSTACK = 4
    MAXLOCALS = 0

  // access flags 0x8
  static <clinit>()V
   L0
    LINENUMBER 5 L0
    NEW W
    DUP
    LDC "WINDOWS"
    ICONST_0
    LDC "Windows"
    INVOKESPECIAL W.<init> (Ljava/lang/String;ILjava/lang/String;)V
    PUTSTATIC W.WINDOWS : LW;
   L1
    LINENUMBER 6 L1
    NEW W
    DUP
    LDC "LINUX"
    ICONST_1
    LDC "Linux"
    INVOKESPECIAL W.<init> (Ljava/lang/String;ILjava/lang/String;)V
    PUTSTATIC W.LINUX : LW;
   L2
    LINENUMBER 7 L2
    NEW W
    DUP
    LDC "MACOS"
    ICONST_2
    LDC "macOS"
    INVOKESPECIAL W.<init> (Ljava/lang/String;ILjava/lang/String;)V
    PUTSTATIC W.MACOS : LW;
   L3
    LINENUMBER 8 L3
    NEW W
    DUP
    LDC "SOLARIS"
    ICONST_3
    LDC "Solaris"
    INVOKESPECIAL W.<init> (Ljava/lang/String;ILjava/lang/String;)V
    PUTSTATIC W.SOLARIS : LW;
   L4
    LINENUMBER 9 L4
    NEW W
    DUP
    LDC "ANDROID"
    ICONST_4
    LDC "Android"
    INVOKESPECIAL W.<init> (Ljava/lang/String;ILjava/lang/String;)V
    PUTSTATIC W.ANDROID : LW;
   L5
    LINENUMBER 10 L5
    NEW W
    DUP
    LDC "UNKNOWN"
    ICONST_5
    LDC "Unknown"
    INVOKESPECIAL W.<init> (Ljava/lang/String;ILjava/lang/String;)V
    PUTSTATIC W.UNKNOWN : LW;
   L6
    LINENUMBER 3 L6
    INVOKESTATIC W.a ()[LW;
    PUTSTATIC W.a : [LW;
    RETURN
    MAXSTACK = 5
    MAXLOCALS = 0
}
