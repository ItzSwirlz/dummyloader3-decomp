// class version 52.0 (52)
// access flags 0x21
public class V {

  // compiled from: 

  ATTRIBUTE Code : unknown

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 5 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x9
  public static a(Ljava/io/InputStream;Ljava/io/File;)V throws java/io/IOException 
    // parameter  inputStream
    // parameter  file
    TRYCATCHBLOCK L0 L1 L2 java/lang/Throwable
    TRYCATCHBLOCK L3 L4 L5 java/lang/Throwable
    TRYCATCHBLOCK L6 L7 L8 null
    TRYCATCHBLOCK L8 L9 L8 null
   L6
    LINENUMBER 8 L6
    NEW java/io/FileOutputStream
    DUP
    ALOAD 1
    INVOKESPECIAL java/io/FileOutputStream.<init> (Ljava/io/File;)V
    ASTORE 2
   L0
    LINENUMBER 9 L0
    SIPUSH 4096
    NEWARRAY T_BYTE
    ASTORE 3
   L10
    LINENUMBER 11 L10
   FRAME FULL [java/io/InputStream T java/io/FileOutputStream [B] []
    ALOAD 0
    ALOAD 3
    INVOKEVIRTUAL java/io/InputStream.read ([B)I
    DUP
    ISTORE 4
    IFLE L11
   L12
    LINENUMBER 12 L12
    ALOAD 2
    ALOAD 3
    ICONST_0
    ILOAD 4
    INVOKEVIRTUAL java/io/FileOutputStream.write ([BII)V
    GOTO L10
   L11
    LINENUMBER 14 L11
   FRAME CHOP 1
    ALOAD 2
    INVOKEVIRTUAL java/io/FileOutputStream.flush ()V
   L1
    LINENUMBER 15 L1
    ALOAD 2
    INVOKEVIRTUAL java/io/FileOutputStream.close ()V
    GOTO L7
   L2
    LINENUMBER 8 L2
   FRAME SAME1 java/lang/Throwable
    ASTORE 3
   L3
    ALOAD 2
    INVOKEVIRTUAL java/io/FileOutputStream.close ()V
   L4
    GOTO L13
   L5
   FRAME FULL [java/io/InputStream T T java/lang/Throwable] [java/lang/Throwable]
    ASTORE 4
    ALOAD 3
    ALOAD 4
    INVOKEVIRTUAL java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
   L13
   FRAME SAME
    ALOAD 3
    ATHROW
   L7
    LINENUMBER 16 L7
   FRAME CHOP 3
    ALOAD 0
    INVOKEVIRTUAL java/io/InputStream.close ()V
   L14
    LINENUMBER 17 L14
    GOTO L15
   L8
    LINENUMBER 16 L8
   FRAME SAME1 java/lang/Throwable
    ASTORE 5
   L9
    ALOAD 0
    INVOKEVIRTUAL java/io/InputStream.close ()V
   L16
    LINENUMBER 17 L16
    ALOAD 5
    ATHROW
   L15
    LINENUMBER 18 L15
   FRAME CHOP 1
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 6
}
