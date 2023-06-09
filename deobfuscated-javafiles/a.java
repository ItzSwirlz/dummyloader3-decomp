// class version 52.0 (52)
// access flags 0x21
public class A implements z {

  // compiled from: 

  ATTRIBUTE Code : unknown

  // access flags 0x12
  private final [B a

  // access flags 0x2
  private Z a

  // access flags 0x2
  private Ljava/util/zip/Deflater; a

  // access flags 0x2
  private Ljava/util/zip/Inflater; a

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 10 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
   L1
    LINENUMBER 13 L1
    ALOAD 0
    SIPUSH 8192
    NEWARRAY T_BYTE
    PUTFIELD A.a : [B
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x1
  public a(ZI)V
    // parameter  boolean1
    // parameter  integer
   L0
    LINENUMBER 22 L0
    ALOAD 0
    ILOAD 1
    PUTFIELD A.a : Z
   L1
    LINENUMBER 23 L1
    ALOAD 0
    INVOKEVIRTUAL A.a ()V
   L2
    LINENUMBER 25 L2
    ILOAD 1
    IFEQ L3
   L4
    LINENUMBER 27 L4
    ALOAD 0
    NEW java/util/zip/Deflater
    DUP
    ILOAD 2
    INVOKESPECIAL java/util/zip/Deflater.<init> (I)V
    PUTFIELD A.a : Ljava/util/zip/Deflater;
    GOTO L5
   L3
    LINENUMBER 30 L3
   FRAME CHOP 2
    ALOAD 0
    NEW java/util/zip/Inflater
    DUP
    INVOKESPECIAL java/util/zip/Inflater.<init> ()V
    PUTFIELD A.a : Ljava/util/zip/Inflater;
   L5
    LINENUMBER 32 L5
   FRAME CHOP 1
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 3

  // access flags 0x1
  public a()V
   L0
    LINENUMBER 37 L0
    ALOAD 0
    GETFIELD A.a : Ljava/util/zip/Deflater;
    IFNULL L1
   L2
    LINENUMBER 39 L2
    ALOAD 0
    GETFIELD A.a : Ljava/util/zip/Deflater;
    INVOKEVIRTUAL java/util/zip/Deflater.end ()V
   L1
    LINENUMBER 41 L1
   FRAME SAME
    ALOAD 0
    GETFIELD A.a : Ljava/util/zip/Inflater;
    IFNULL L3
   L4
    LINENUMBER 43 L4
    ALOAD 0
    GETFIELD A.a : Ljava/util/zip/Inflater;
    INVOKEVIRTUAL java/util/zip/Inflater.end ()V
   L3
    LINENUMBER 45 L3
   FRAME CHOP 1
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public a(Lio/netty/buffer/ByteBuf;Lio/netty/buffer/ByteBuf;)V throws java/util/zip/DataFormatException 
    // parameter  byteBuf1
    // parameter  byteBuf2
   L0
    LINENUMBER 52 L0
    ALOAD 1
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readableBytes ()I
    NEWARRAY T_BYTE
    ASTORE 3
   L1
    LINENUMBER 53 L1
    ALOAD 1
    ALOAD 3
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.readBytes ([B)Lio/netty/buffer/ByteBuf;
    POP
   L2
    LINENUMBER 55 L2
    ALOAD 0
    GETFIELD A.a : Z
    IFEQ L3
   L4
    LINENUMBER 57 L4
    ALOAD 0
    GETFIELD A.a : Ljava/util/zip/Deflater;
    ALOAD 3
    INVOKEVIRTUAL java/util/zip/Deflater.setInput ([B)V
   L5
    LINENUMBER 58 L5
    ALOAD 0
    GETFIELD A.a : Ljava/util/zip/Deflater;
    INVOKEVIRTUAL java/util/zip/Deflater.finish ()V
   L6
    LINENUMBER 60 L6
   FRAME FULL [A T io/netty/buffer/ByteBuf] []
    ALOAD 0
    GETFIELD A.a : Ljava/util/zip/Deflater;
    INVOKEVIRTUAL java/util/zip/Deflater.finished ()Z
    IFNE L7
   L8
    LINENUMBER 62 L8
    ALOAD 0
    GETFIELD A.a : Ljava/util/zip/Deflater;
    ALOAD 0
    GETFIELD A.a : [B
    INVOKEVIRTUAL java/util/zip/Deflater.deflate ([B)I
    ISTORE 4
   L9
    LINENUMBER 63 L9
    ALOAD 2
    ALOAD 0
    GETFIELD A.a : [B
    ICONST_0
    ILOAD 4
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBytes ([BII)Lio/netty/buffer/ByteBuf;
    POP
   L10
    LINENUMBER 64 L10
    GOTO L6
   L7
    LINENUMBER 66 L7
   FRAME CHOP 2
    ALOAD 0
    GETFIELD A.a : Ljava/util/zip/Deflater;
    INVOKEVIRTUAL java/util/zip/Deflater.reset ()V
    GOTO L11
   L3
    LINENUMBER 69 L3
   FRAME APPEND [T io/netty/buffer/ByteBuf [B]
    ALOAD 0
    GETFIELD A.a : Ljava/util/zip/Inflater;
    ALOAD 3
    INVOKEVIRTUAL java/util/zip/Inflater.setInput ([B)V
   L12
    LINENUMBER 71 L12
   FRAME SAME
    ALOAD 0
    GETFIELD A.a : Ljava/util/zip/Inflater;
    INVOKEVIRTUAL java/util/zip/Inflater.finished ()Z
    IFNE L13
    ALOAD 0
    GETFIELD A.a : Ljava/util/zip/Inflater;
    INVOKEVIRTUAL java/util/zip/Inflater.getTotalIn ()I
    ALOAD 3
    ARRAYLENGTH
    IF_ICMPGE L13
   L14
    LINENUMBER 73 L14
    ALOAD 0
    GETFIELD A.a : Ljava/util/zip/Inflater;
    ALOAD 0
    GETFIELD A.a : [B
    INVOKEVIRTUAL java/util/zip/Inflater.inflate ([B)I
    ISTORE 4
   L15
    LINENUMBER 74 L15
    ALOAD 2
    ALOAD 0
    GETFIELD A.a : [B
    ICONST_0
    ILOAD 4
    INVOKEVIRTUAL io/netty/buffer/ByteBuf.writeBytes ([BII)Lio/netty/buffer/ByteBuf;
    POP
   L16
    LINENUMBER 75 L16
    GOTO L12
   L13
    LINENUMBER 77 L13
   FRAME CHOP 3
    ALOAD 0
    GETFIELD A.a : Ljava/util/zip/Inflater;
    INVOKEVIRTUAL java/util/zip/Inflater.reset ()V
   L11
    LINENUMBER 79 L11
   FRAME CHOP 1
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 5
}
