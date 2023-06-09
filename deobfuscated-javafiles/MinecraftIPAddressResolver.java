// class version 52.0 (52)
// access flags 0x21
public class MinecraftIPAddressResolver {

  // compiled from: 

  ATTRIBUTE Code : unknown

  // access flags 0x12
  private final Ljava/lang/String; a

  // access flags 0x12
  private final I a

  // access flags 0x2
  private Ljava/net/InetSocketAddress; a

  // access flags 0x2
  private <init>(Ljava/lang/String;I)V
    // parameter  string
    // parameter  integer
   L0
    LINENUMBER 18 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
   L1
    LINENUMBER 19 L1
    ALOAD 0
    ALOAD 1
    PUTFIELD MinecraftIPAddressResolver.a : Ljava/lang/String;
   L2
    LINENUMBER 20 L2
    ALOAD 0
    ILOAD 2
    PUTFIELD MinecraftIPAddressResolver.a : I
   L3
    LINENUMBER 21 L3
    ALOAD 0
    NEW java/net/InetSocketAddress
    DUP
    ALOAD 0
    GETFIELD MinecraftIPAddressResolver.a : Ljava/lang/String;
    ALOAD 0
    GETFIELD MinecraftIPAddressResolver.a : I
    INVOKESPECIAL java/net/InetSocketAddress.<init> (Ljava/lang/String;I)V
    PUTFIELD MinecraftIPAddressResolver.a : Ljava/net/InetSocketAddress;
   L4
    LINENUMBER 22 L4
    RETURN
    MAXSTACK = 5
    MAXLOCALS = 3

  // access flags 0x1
  public a()Ljava/lang/String;
    TRYCATCHBLOCK L0 L1 L2 java/lang/Exception
   L0
    LINENUMBER 27 L0
    ALOAD 0
    GETFIELD MinecraftIPAddressResolver.a : Ljava/lang/String;
    INVOKESTATIC java/net/IDN.toASCII (Ljava/lang/String;)Ljava/lang/String;
   L1
    ARETURN
   L2
    LINENUMBER 28 L2
   FRAME FULL [] [java/lang/Exception]
    ASTORE 1
   L3
    LINENUMBER 29 L3
    LDC ""
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 2

  // access flags 0x1
  public a()I
   L0
    LINENUMBER 35 L0
    ALOAD 0
    GETFIELD MinecraftIPAddressResolver.a : I
    IRETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a()Ljava/net/InetSocketAddress;
   L0
    LINENUMBER 40 L0
    ALOAD 0
    GETFIELD MinecraftIPAddressResolver.a : Ljava/net/InetSocketAddress;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x9
  public static a(Ljava/lang/String;)LMinecraftIPAddressResolver;
    // parameter  string
   L0
    LINENUMBER 45 L0
    ALOAD 0
    IFNONNULL L1
   L2
    LINENUMBER 47 L2
    ACONST_NULL
    ARETURN
   L1
    LINENUMBER 51 L1
   FRAME SAME
    ALOAD 0
    LDC ":"
    INVOKEVIRTUAL java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
    ASTORE 1
   L3
    LINENUMBER 53 L3
    ALOAD 0
    LDC "["
    INVOKEVIRTUAL java/lang/String.startsWith (Ljava/lang/String;)Z
    IFEQ L4
   L5
    LINENUMBER 55 L5
    ALOAD 0
    LDC "]"
    INVOKEVIRTUAL java/lang/String.indexOf (Ljava/lang/String;)I
    ISTORE 2
   L6
    LINENUMBER 57 L6
    ILOAD 2
    IFLE L4
   L7
    LINENUMBER 59 L7
    ALOAD 0
    ICONST_1
    ILOAD 2
    INVOKEVIRTUAL java/lang/String.substring (II)Ljava/lang/String;
    ASTORE 3
   L8
    LINENUMBER 60 L8
    ALOAD 0
    ILOAD 2
    ICONST_1
    IADD
    INVOKEVIRTUAL java/lang/String.substring (I)Ljava/lang/String;
    INVOKEVIRTUAL java/lang/String.trim ()Ljava/lang/String;
    ASTORE 4
   L9
    LINENUMBER 62 L9
    ALOAD 4
    LDC ":"
    INVOKEVIRTUAL java/lang/String.startsWith (Ljava/lang/String;)Z
    IFEQ L10
   L11
    LINENUMBER 64 L11
    ALOAD 4
    ICONST_1
    INVOKEVIRTUAL java/lang/String.substring (I)Ljava/lang/String;
    ASTORE 4
   L12
    LINENUMBER 65 L12
    ICONST_2
    ANEWARRAY java/lang/String
    DUP
    ICONST_0
    ALOAD 3
    AASTORE
    DUP
    ICONST_1
    ALOAD 4
    AASTORE
    ASTORE 1
    GOTO L4
   L10
    LINENUMBER 69 L10
   FRAME APPEND [T T java/lang/String]
    ICONST_1
    ANEWARRAY java/lang/String
    DUP
    ICONST_0
    ALOAD 3
    AASTORE
    ASTORE 1
   L4
    LINENUMBER 74 L4
   FRAME FULL [java/lang/String [Ljava/lang/String;] []
    ALOAD 1
    ARRAYLENGTH
    ICONST_2
    IF_ICMPLE L13
   L14
    LINENUMBER 76 L14
    ICONST_1
    ANEWARRAY java/lang/String
    DUP
    ICONST_0
    ALOAD 0
    AASTORE
    ASTORE 1
   L13
    LINENUMBER 79 L13
   FRAME FULL [T [Ljava/lang/String;] []
    ALOAD 1
    ICONST_0
    AALOAD
    ASTORE 2
   L15
    LINENUMBER 80 L15
    ALOAD 1
    ARRAYLENGTH
    ICONST_1
    IF_ICMPLE L16
    ALOAD 1
    ICONST_1
    AALOAD
    SIPUSH 25565
    INVOKESTATIC MinecraftIPAddressResolver.a (Ljava/lang/String;I)I
    GOTO L17
   L16
   FRAME FULL [T T java/lang/String] []
    SIPUSH 25565
   L17
   FRAME SAME1 I
    ISTORE 3
   L18
    LINENUMBER 82 L18
    ILOAD 3
    SIPUSH 25565
    IF_ICMPNE L19
   L20
    LINENUMBER 84 L20
    ALOAD 2
    INVOKESTATIC MinecraftIPAddressResolver.a (Ljava/lang/String;)[Ljava/lang/String;
    ASTORE 4
   L21
    LINENUMBER 85 L21
    ALOAD 4
    ICONST_0
    AALOAD
    ASTORE 2
   L22
    LINENUMBER 86 L22
    ALOAD 4
    ICONST_1
    AALOAD
    SIPUSH 25565
    INVOKESTATIC MinecraftIPAddressResolver.a (Ljava/lang/String;I)I
    ISTORE 3
   L19
    LINENUMBER 89 L19
   FRAME APPEND [I]
    NEW MinecraftIPAddressResolver
    DUP
    ALOAD 2
    ILOAD 3
    INVOKESPECIAL MinecraftIPAddressResolver.<init> (Ljava/lang/String;I)V
    ARETURN
    MAXSTACK = 4
    MAXLOCALS = 5

  // access flags 0xA
  private static a(Ljava/lang/String;)[Ljava/lang/String;
    // parameter  string
    TRYCATCHBLOCK L0 L1 L2 java/lang/Throwable
   L0
    LINENUMBER 101 L0
    LDC "com.sun.jndi.dns.DnsContextFactory"
    INVOKESTATIC java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
    POP
   L3
    LINENUMBER 102 L3
    NEW java/util/Hashtable
    DUP
    INVOKESPECIAL java/util/Hashtable.<init> ()V
    ASTORE 1
   L4
    LINENUMBER 103 L4
    ALOAD 1
    LDC "java.naming.factory.initial"
    LDC "com.sun.jndi.dns.DnsContextFactory"
    INVOKEVIRTUAL java/util/Hashtable.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    POP
   L5
    LINENUMBER 104 L5
    ALOAD 1
    LDC "java.naming.provider.url"
    LDC "dns:"
    INVOKEVIRTUAL java/util/Hashtable.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    POP
   L6
    LINENUMBER 105 L6
    ALOAD 1
    LDC "com.sun.jndi.dns.timeout.retries"
    LDC "1"
    INVOKEVIRTUAL java/util/Hashtable.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    POP
   L7
    LINENUMBER 106 L7
    NEW javax/naming/directory/InitialDirContext
    DUP
    ALOAD 1
    INVOKESPECIAL javax/naming/directory/InitialDirContext.<init> (Ljava/util/Hashtable;)V
    ASTORE 2
   L8
    LINENUMBER 107 L8
    ALOAD 2
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "_minecraft._tcp."
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ICONST_1
    ANEWARRAY java/lang/String
    DUP
    ICONST_0
    LDC "SRV"
    AASTORE
    INVOKEINTERFACE javax/naming/directory/DirContext.getAttributes (Ljava/lang/String;[Ljava/lang/String;)Ljavax/naming/directory/Attributes; (itf)
    ASTORE 3
   L9
    LINENUMBER 108 L9
    ALOAD 3
    LDC "srv"
    INVOKEINTERFACE javax/naming/directory/Attributes.get (Ljava/lang/String;)Ljavax/naming/directory/Attribute; (itf)
    INVOKEINTERFACE javax/naming/directory/Attribute.get ()Ljava/lang/Object; (itf)
    INVOKEVIRTUAL java/lang/Object.toString ()Ljava/lang/String;
    LDC " "
    ICONST_4
    INVOKEVIRTUAL java/lang/String.split (Ljava/lang/String;I)[Ljava/lang/String;
    ASTORE 4
   L10
    LINENUMBER 109 L10
    ICONST_2
    ANEWARRAY java/lang/String
    DUP
    ICONST_0
    ALOAD 4
    ICONST_3
    AALOAD
    AASTORE
    DUP
    ICONST_1
    ALOAD 4
    ICONST_2
    AALOAD
    AASTORE
   L1
    ARETURN
   L2
    LINENUMBER 111 L2
   FRAME SAME1 java/lang/Throwable
    ASTORE 1
   L11
    LINENUMBER 113 L11
    ICONST_2
    ANEWARRAY java/lang/String
    DUP
    ICONST_0
    ALOAD 0
    AASTORE
    DUP
    ICONST_1
    SIPUSH 25565
    INVOKESTATIC java/lang/Integer.toString (I)Ljava/lang/String;
    AASTORE
    ARETURN
    MAXSTACK = 6
    MAXLOCALS = 5

  // access flags 0xA
  private static a(Ljava/lang/String;I)I
    // parameter  string
    // parameter  integer
    TRYCATCHBLOCK L0 L1 L2 java/lang/Exception
   L0
    LINENUMBER 121 L0
    ALOAD 0
    INVOKEVIRTUAL java/lang/String.trim ()Ljava/lang/String;
    INVOKESTATIC java/lang/Integer.parseInt (Ljava/lang/String;)I
   L1
    IRETURN
   L2
    LINENUMBER 123 L2
   FRAME FULL [T I] [java/lang/Exception]
    ASTORE 2
   L3
    LINENUMBER 125 L3
    ILOAD 1
    IRETURN
    MAXSTACK = 1
    MAXLOCALS = 3
}
