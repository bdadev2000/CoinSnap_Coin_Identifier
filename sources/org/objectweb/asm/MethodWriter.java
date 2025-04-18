package org.objectweb.asm;

import androidx.compose.foundation.text.input.a;
import com.google.android.gms.common.api.Api;
import org.objectweb.asm.Attribute;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class MethodWriter extends MethodVisitor {
    static final int COMPUTE_ALL_FRAMES = 4;
    static final int COMPUTE_INSERTED_FRAMES = 3;
    static final int COMPUTE_MAX_STACK_AND_LOCAL = 1;
    static final int COMPUTE_MAX_STACK_AND_LOCAL_FROM_FRAMES = 2;
    static final int COMPUTE_NOTHING = 0;
    private static final int NA = 0;
    private static final int[] STACK_SIZE_DELTA = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};
    private final int accessFlags;
    private final ByteVector code;
    private final int compute;
    private Label currentBasicBlock;
    private int[] currentFrame;
    private int currentLocals;
    private ByteVector defaultValue;
    private final String descriptor;
    private final int descriptorIndex;
    private final int[] exceptionIndexTable;
    private Attribute firstAttribute;
    private Label firstBasicBlock;
    private Attribute firstCodeAttribute;
    private Handler firstHandler;
    private boolean hasAsmInstructions;
    private boolean hasSubroutines;
    private int invisibleAnnotableParameterCount;
    private Label lastBasicBlock;
    private int lastBytecodeOffset;
    private AnnotationWriter lastCodeRuntimeInvisibleTypeAnnotation;
    private AnnotationWriter lastCodeRuntimeVisibleTypeAnnotation;
    private Handler lastHandler;
    private AnnotationWriter lastRuntimeInvisibleAnnotation;
    private AnnotationWriter[] lastRuntimeInvisibleParameterAnnotations;
    private AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
    private AnnotationWriter lastRuntimeVisibleAnnotation;
    private AnnotationWriter[] lastRuntimeVisibleParameterAnnotations;
    private AnnotationWriter lastRuntimeVisibleTypeAnnotation;
    private ByteVector lineNumberTable;
    private int lineNumberTableLength;
    private ByteVector localVariableTable;
    private int localVariableTableLength;
    private ByteVector localVariableTypeTable;
    private int localVariableTypeTableLength;
    private int maxLocals;
    private int maxRelativeStackSize;
    private int maxStack;
    private final String name;
    private final int nameIndex;
    private final int numberOfExceptions;
    private ByteVector parameters;
    private int parametersCount;
    private int[] previousFrame;
    private int previousFrameOffset;
    private int relativeStackSize;
    private final int signatureIndex;
    private int sourceLength;
    private int sourceOffset;
    private ByteVector stackMapTableEntries;
    private int stackMapTableNumberOfEntries;
    private final SymbolTable symbolTable;
    private int visibleAnnotableParameterCount;

    public MethodWriter(SymbolTable symbolTable, int i2, String str, String str2, String str3, String[] strArr, int i3) {
        super(589824);
        this.code = new ByteVector();
        this.symbolTable = symbolTable;
        this.accessFlags = "<init>".equals(str) ? 262144 | i2 : i2;
        this.nameIndex = symbolTable.addConstantUtf8(str);
        this.name = str;
        this.descriptorIndex = symbolTable.addConstantUtf8(str2);
        this.descriptor = str2;
        this.signatureIndex = str3 == null ? 0 : symbolTable.addConstantUtf8(str3);
        if (strArr == null || strArr.length <= 0) {
            this.numberOfExceptions = 0;
            this.exceptionIndexTable = null;
        } else {
            int length = strArr.length;
            this.numberOfExceptions = length;
            this.exceptionIndexTable = new int[length];
            for (int i4 = 0; i4 < this.numberOfExceptions; i4++) {
                this.exceptionIndexTable[i4] = symbolTable.addConstantClass(strArr[i4]).index;
            }
        }
        this.compute = i3;
        if (i3 != 0) {
            int argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(str2) >> 2;
            argumentsAndReturnSizes = (i2 & 8) != 0 ? argumentsAndReturnSizes - 1 : argumentsAndReturnSizes;
            this.maxLocals = argumentsAndReturnSizes;
            this.currentLocals = argumentsAndReturnSizes;
            Label label = new Label();
            this.firstBasicBlock = label;
            visitLabel(label);
        }
    }

    private void addSuccessorToCurrentBasicBlock(int i2, Label label) {
        Label label2 = this.currentBasicBlock;
        label2.outgoingEdges = new Edge(i2, label, label2.outgoingEdges);
    }

    private void computeAllFrames() {
        Handler handler = this.firstHandler;
        while (true) {
            if (handler == null) {
                break;
            }
            String str = handler.catchTypeDescriptor;
            int abstractTypeFromInternalName = Frame.getAbstractTypeFromInternalName(this.symbolTable, str != null ? str : "java/lang/Throwable");
            Label canonicalInstance = handler.handlerPc.getCanonicalInstance();
            canonicalInstance.flags = (short) (canonicalInstance.flags | 2);
            Label canonicalInstance2 = handler.endPc.getCanonicalInstance();
            for (Label canonicalInstance3 = handler.startPc.getCanonicalInstance(); canonicalInstance3 != canonicalInstance2; canonicalInstance3 = canonicalInstance3.nextBasicBlock) {
                canonicalInstance3.outgoingEdges = new Edge(abstractTypeFromInternalName, canonicalInstance, canonicalInstance3.outgoingEdges);
            }
            handler = handler.nextHandler;
        }
        Frame frame = this.firstBasicBlock.frame;
        frame.setInputFrameFromDescriptor(this.symbolTable, this.accessFlags, this.descriptor, this.maxLocals);
        frame.accept(this);
        Label label = this.firstBasicBlock;
        label.nextListElement = Label.EMPTY_LIST;
        int i2 = 0;
        while (label != Label.EMPTY_LIST) {
            Label label2 = label.nextListElement;
            label.nextListElement = null;
            label.flags = (short) (label.flags | 8);
            int inputStackSize = label.frame.getInputStackSize() + label.outputStackMax;
            if (inputStackSize > i2) {
                i2 = inputStackSize;
            }
            for (Edge edge = label.outgoingEdges; edge != null; edge = edge.nextEdge) {
                Label canonicalInstance4 = edge.successor.getCanonicalInstance();
                if (label.frame.merge(this.symbolTable, canonicalInstance4.frame, edge.info) && canonicalInstance4.nextListElement == null) {
                    canonicalInstance4.nextListElement = label2;
                    label2 = canonicalInstance4;
                }
            }
            label = label2;
        }
        for (Label label3 = this.firstBasicBlock; label3 != null; label3 = label3.nextBasicBlock) {
            if ((label3.flags & 10) == 10) {
                label3.frame.accept(this);
            }
            if ((label3.flags & 8) == 0) {
                Label label4 = label3.nextBasicBlock;
                int i3 = label3.bytecodeOffset;
                int i4 = (label4 == null ? this.code.length : label4.bytecodeOffset) - 1;
                if (i4 >= i3) {
                    for (int i5 = i3; i5 < i4; i5++) {
                        this.code.data[i5] = 0;
                    }
                    this.code.data[i4] = -65;
                    this.currentFrame[visitFrameStart(i3, 0, 1)] = Frame.getAbstractTypeFromInternalName(this.symbolTable, "java/lang/Throwable");
                    visitFrameEnd();
                    this.firstHandler = Handler.removeRange(this.firstHandler, label3, label4);
                    i2 = Math.max(i2, 1);
                }
            }
        }
        this.maxStack = i2;
    }

    private void computeMaxStackAndLocal() {
        for (Handler handler = this.firstHandler; handler != null; handler = handler.nextHandler) {
            Label label = handler.handlerPc;
            Label label2 = handler.endPc;
            for (Label label3 = handler.startPc; label3 != label2; label3 = label3.nextBasicBlock) {
                if ((label3.flags & 16) == 0) {
                    label3.outgoingEdges = new Edge(Api.BaseClientBuilder.API_PRIORITY_OTHER, label, label3.outgoingEdges);
                } else {
                    Edge edge = label3.outgoingEdges.nextEdge;
                    edge.nextEdge = new Edge(Api.BaseClientBuilder.API_PRIORITY_OTHER, label, edge.nextEdge);
                }
            }
        }
        if (this.hasSubroutines) {
            this.firstBasicBlock.markSubroutine((short) 1);
            short s2 = 1;
            for (short s3 = 1; s3 <= s2; s3 = (short) (s3 + 1)) {
                for (Label label4 = this.firstBasicBlock; label4 != null; label4 = label4.nextBasicBlock) {
                    if ((label4.flags & 16) != 0 && label4.subroutineId == s3) {
                        Label label5 = label4.outgoingEdges.nextEdge.successor;
                        if (label5.subroutineId == 0) {
                            s2 = (short) (s2 + 1);
                            label5.markSubroutine(s2);
                        }
                    }
                }
            }
            for (Label label6 = this.firstBasicBlock; label6 != null; label6 = label6.nextBasicBlock) {
                if ((label6.flags & 16) != 0) {
                    label6.outgoingEdges.nextEdge.successor.addSubroutineRetSuccessors(label6);
                }
            }
        }
        Label label7 = this.firstBasicBlock;
        label7.nextListElement = Label.EMPTY_LIST;
        int i2 = this.maxStack;
        while (label7 != Label.EMPTY_LIST) {
            Label label8 = label7.nextListElement;
            short s4 = label7.inputStackSize;
            int i3 = label7.outputStackMax + s4;
            if (i3 > i2) {
                i2 = i3;
            }
            Edge edge2 = label7.outgoingEdges;
            if ((label7.flags & 16) != 0) {
                edge2 = edge2.nextEdge;
            }
            label7 = label8;
            while (edge2 != null) {
                Label label9 = edge2.successor;
                if (label9.nextListElement == null) {
                    int i4 = edge2.info;
                    label9.inputStackSize = (short) (i4 == Integer.MAX_VALUE ? 1 : i4 + s4);
                    label9.nextListElement = label7;
                    label7 = label9;
                }
                edge2 = edge2.nextEdge;
            }
        }
        this.maxStack = i2;
    }

    private void endCurrentBasicBlockWithNoSuccessor() {
        int i2 = this.compute;
        if (i2 != 4) {
            if (i2 == 1) {
                this.currentBasicBlock.outputStackMax = (short) this.maxRelativeStackSize;
                this.currentBasicBlock = null;
                return;
            }
            return;
        }
        Label label = new Label();
        label.frame = new Frame(label);
        ByteVector byteVector = this.code;
        label.resolve(byteVector.data, byteVector.length);
        this.lastBasicBlock.nextBasicBlock = label;
        this.lastBasicBlock = label;
        this.currentBasicBlock = null;
    }

    private void putAbstractTypes(int i2, int i3) {
        while (i2 < i3) {
            Frame.putAbstractType(this.symbolTable, this.currentFrame[i2], this.stackMapTableEntries);
            i2++;
        }
    }

    private void putFrame() {
        char c2;
        int[] iArr = this.currentFrame;
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = 0;
        if (this.symbolTable.getMajorVersion() < 50) {
            this.stackMapTableEntries.putShort(this.currentFrame[0]).putShort(i2);
            int i5 = i2 + 3;
            putAbstractTypes(3, i5);
            this.stackMapTableEntries.putShort(i3);
            putAbstractTypes(i5, i3 + i5);
            return;
        }
        int i6 = this.stackMapTableNumberOfEntries == 0 ? this.currentFrame[0] : (this.currentFrame[0] - this.previousFrame[0]) - 1;
        int i7 = this.previousFrame[1];
        int i8 = i2 - i7;
        if (i3 == 0) {
            switch (i8) {
                case -3:
                case -2:
                case -1:
                    c2 = 248;
                    break;
                case 0:
                    if (i6 >= 64) {
                        c2 = 251;
                        break;
                    } else {
                        c2 = 0;
                        break;
                    }
                case 1:
                case 2:
                case 3:
                    c2 = 252;
                    break;
                default:
                    c2 = 255;
                    break;
            }
        } else {
            if (i8 == 0 && i3 == 1) {
                c2 = i6 < 63 ? '@' : (char) 247;
            }
            c2 = 255;
        }
        if (c2 != 255) {
            int i9 = 3;
            while (true) {
                if (i4 < i7 && i4 < i2) {
                    if (this.currentFrame[i9] != this.previousFrame[i9]) {
                        c2 = 255;
                    } else {
                        i9++;
                        i4++;
                    }
                }
            }
        }
        if (c2 == 0) {
            this.stackMapTableEntries.putByte(i6);
            return;
        }
        if (c2 == '@') {
            this.stackMapTableEntries.putByte(i6 + 64);
            putAbstractTypes(i2 + 3, i2 + 4);
            return;
        }
        if (c2 == 247) {
            this.stackMapTableEntries.putByte(247).putShort(i6);
            putAbstractTypes(i2 + 3, i2 + 4);
            return;
        }
        if (c2 == 248) {
            this.stackMapTableEntries.putByte(i8 + 251).putShort(i6);
            return;
        }
        if (c2 == 251) {
            this.stackMapTableEntries.putByte(251).putShort(i6);
            return;
        }
        if (c2 == 252) {
            this.stackMapTableEntries.putByte(i8 + 251).putShort(i6);
            putAbstractTypes(i7 + 3, i2 + 3);
            return;
        }
        this.stackMapTableEntries.putByte(255).putShort(i6).putShort(i2);
        int i10 = i2 + 3;
        putAbstractTypes(3, i10);
        this.stackMapTableEntries.putShort(i3);
        putAbstractTypes(i10, i3 + i10);
    }

    private void putFrameType(Object obj) {
        if (obj instanceof Integer) {
            this.stackMapTableEntries.putByte(((Integer) obj).intValue());
        } else if (obj instanceof String) {
            this.stackMapTableEntries.putByte(7).putShort(this.symbolTable.addConstantClass((String) obj).index);
        } else {
            this.stackMapTableEntries.putByte(8).putShort(((Label) obj).bytecodeOffset);
        }
    }

    private void visitSwitchInsn(Label label, Label[] labelArr) {
        Label label2 = this.currentBasicBlock;
        if (label2 != null) {
            int i2 = this.compute;
            if (i2 == 4) {
                label2.frame.execute(Opcodes.LOOKUPSWITCH, 0, null, null);
                addSuccessorToCurrentBasicBlock(0, label);
                Label canonicalInstance = label.getCanonicalInstance();
                canonicalInstance.flags = (short) (canonicalInstance.flags | 2);
                for (Label label3 : labelArr) {
                    addSuccessorToCurrentBasicBlock(0, label3);
                    Label canonicalInstance2 = label3.getCanonicalInstance();
                    canonicalInstance2.flags = (short) (canonicalInstance2.flags | 2);
                }
            } else if (i2 == 1) {
                int i3 = this.relativeStackSize - 1;
                this.relativeStackSize = i3;
                addSuccessorToCurrentBasicBlock(i3, label);
                for (Label label4 : labelArr) {
                    addSuccessorToCurrentBasicBlock(this.relativeStackSize, label4);
                }
            }
            endCurrentBasicBlockWithNoSuccessor();
        }
    }

    public boolean canCopyMethodAttributes(ClassReader classReader, boolean z2, boolean z3, int i2, int i3, int i4) {
        if (classReader == this.symbolTable.getSource() && i2 == this.descriptorIndex && i3 == this.signatureIndex) {
            if (z3 == ((this.accessFlags & Opcodes.ACC_DEPRECATED) != 0)) {
                if (z2 != (this.symbolTable.getMajorVersion() < 49 && (this.accessFlags & 4096) != 0)) {
                    return false;
                }
                if (i4 == 0) {
                    if (this.numberOfExceptions != 0) {
                        return false;
                    }
                } else if (classReader.readUnsignedShort(i4) == this.numberOfExceptions) {
                    int i5 = i4 + 2;
                    for (int i6 = 0; i6 < this.numberOfExceptions; i6++) {
                        if (classReader.readUnsignedShort(i5) != this.exceptionIndexTable[i6]) {
                            return false;
                        }
                        i5 += 2;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void collectAttributePrototypes(Attribute.Set set) {
        set.addAttributes(this.firstAttribute);
        set.addAttributes(this.firstCodeAttribute);
    }

    public int computeMethodInfoSize() {
        int i2;
        if (this.sourceOffset != 0) {
            return this.sourceLength + 6;
        }
        int i3 = this.code.length;
        if (i3 <= 0) {
            i2 = 8;
        } else {
            if (i3 > 65535) {
                throw new MethodTooLargeException(this.symbolTable.getClassName(), this.name, this.descriptor, this.code.length);
            }
            this.symbolTable.addConstantUtf8("Code");
            i2 = this.code.length + 16 + Handler.getExceptionTableSize(this.firstHandler) + 8;
            if (this.stackMapTableEntries != null) {
                this.symbolTable.addConstantUtf8(this.symbolTable.getMajorVersion() >= 50 ? "StackMapTable" : "StackMap");
                i2 += this.stackMapTableEntries.length + 8;
            }
            if (this.lineNumberTable != null) {
                this.symbolTable.addConstantUtf8("LineNumberTable");
                i2 += this.lineNumberTable.length + 8;
            }
            if (this.localVariableTable != null) {
                this.symbolTable.addConstantUtf8("LocalVariableTable");
                i2 += this.localVariableTable.length + 8;
            }
            if (this.localVariableTypeTable != null) {
                this.symbolTable.addConstantUtf8("LocalVariableTypeTable");
                i2 += this.localVariableTypeTable.length + 8;
            }
            AnnotationWriter annotationWriter = this.lastCodeRuntimeVisibleTypeAnnotation;
            if (annotationWriter != null) {
                i2 += annotationWriter.computeAnnotationsSize("RuntimeVisibleTypeAnnotations");
            }
            AnnotationWriter annotationWriter2 = this.lastCodeRuntimeInvisibleTypeAnnotation;
            if (annotationWriter2 != null) {
                i2 += annotationWriter2.computeAnnotationsSize("RuntimeInvisibleTypeAnnotations");
            }
            Attribute attribute = this.firstCodeAttribute;
            if (attribute != null) {
                SymbolTable symbolTable = this.symbolTable;
                ByteVector byteVector = this.code;
                i2 += attribute.computeAttributesSize(symbolTable, byteVector.data, byteVector.length, this.maxStack, this.maxLocals);
            }
        }
        if (this.numberOfExceptions > 0) {
            this.symbolTable.addConstantUtf8("Exceptions");
            i2 = a.a(this.numberOfExceptions, 2, 8, i2);
        }
        int computeAttributesSize = Attribute.computeAttributesSize(this.symbolTable, this.accessFlags, this.signatureIndex) + i2 + AnnotationWriter.computeAnnotationsSize(this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation);
        AnnotationWriter[] annotationWriterArr = this.lastRuntimeVisibleParameterAnnotations;
        if (annotationWriterArr != null) {
            int i4 = this.visibleAnnotableParameterCount;
            if (i4 == 0) {
                i4 = annotationWriterArr.length;
            }
            computeAttributesSize += AnnotationWriter.computeParameterAnnotationsSize("RuntimeVisibleParameterAnnotations", annotationWriterArr, i4);
        }
        AnnotationWriter[] annotationWriterArr2 = this.lastRuntimeInvisibleParameterAnnotations;
        if (annotationWriterArr2 != null) {
            int i5 = this.invisibleAnnotableParameterCount;
            if (i5 == 0) {
                i5 = annotationWriterArr2.length;
            }
            computeAttributesSize += AnnotationWriter.computeParameterAnnotationsSize("RuntimeInvisibleParameterAnnotations", annotationWriterArr2, i5);
        }
        if (this.defaultValue != null) {
            this.symbolTable.addConstantUtf8("AnnotationDefault");
            computeAttributesSize += this.defaultValue.length + 6;
        }
        if (this.parameters != null) {
            this.symbolTable.addConstantUtf8("MethodParameters");
            computeAttributesSize += this.parameters.length + 7;
        }
        Attribute attribute2 = this.firstAttribute;
        return attribute2 != null ? computeAttributesSize + attribute2.computeAttributesSize(this.symbolTable) : computeAttributesSize;
    }

    public boolean hasAsmInstructions() {
        return this.hasAsmInstructions;
    }

    public boolean hasFrames() {
        return this.stackMapTableNumberOfEntries > 0;
    }

    public void putMethodInfo(ByteVector byteVector) {
        int i2;
        boolean z2 = this.symbolTable.getMajorVersion() < 49;
        byteVector.putShort((~(z2 ? 4096 : 0)) & this.accessFlags).putShort(this.nameIndex).putShort(this.descriptorIndex);
        if (this.sourceOffset != 0) {
            byteVector.putByteArray(this.symbolTable.getSource().classFileBuffer, this.sourceOffset, this.sourceLength);
            return;
        }
        int i3 = this.code.length > 0 ? 1 : 0;
        if (this.numberOfExceptions > 0) {
            i3++;
        }
        int i4 = this.accessFlags;
        if ((i4 & 4096) != 0 && z2) {
            i3++;
        }
        if (this.signatureIndex != 0) {
            i3++;
        }
        if ((131072 & i4) != 0) {
            i3++;
        }
        if (this.lastRuntimeVisibleAnnotation != null) {
            i3++;
        }
        if (this.lastRuntimeInvisibleAnnotation != null) {
            i3++;
        }
        if (this.lastRuntimeVisibleParameterAnnotations != null) {
            i3++;
        }
        if (this.lastRuntimeInvisibleParameterAnnotations != null) {
            i3++;
        }
        if (this.lastRuntimeVisibleTypeAnnotation != null) {
            i3++;
        }
        if (this.lastRuntimeInvisibleTypeAnnotation != null) {
            i3++;
        }
        if (this.defaultValue != null) {
            i3++;
        }
        if (this.parameters != null) {
            i3++;
        }
        Attribute attribute = this.firstAttribute;
        if (attribute != null) {
            i3 += attribute.getAttributeCount();
        }
        byteVector.putShort(i3);
        int i5 = this.code.length;
        if (i5 > 0) {
            int exceptionTableSize = i5 + 10 + Handler.getExceptionTableSize(this.firstHandler);
            ByteVector byteVector2 = this.stackMapTableEntries;
            if (byteVector2 != null) {
                exceptionTableSize += byteVector2.length + 8;
                i2 = 1;
            } else {
                i2 = 0;
            }
            ByteVector byteVector3 = this.lineNumberTable;
            if (byteVector3 != null) {
                exceptionTableSize += byteVector3.length + 8;
                i2++;
            }
            ByteVector byteVector4 = this.localVariableTable;
            if (byteVector4 != null) {
                exceptionTableSize += byteVector4.length + 8;
                i2++;
            }
            ByteVector byteVector5 = this.localVariableTypeTable;
            if (byteVector5 != null) {
                exceptionTableSize += byteVector5.length + 8;
                i2++;
            }
            AnnotationWriter annotationWriter = this.lastCodeRuntimeVisibleTypeAnnotation;
            if (annotationWriter != null) {
                exceptionTableSize += annotationWriter.computeAnnotationsSize("RuntimeVisibleTypeAnnotations");
                i2++;
            }
            AnnotationWriter annotationWriter2 = this.lastCodeRuntimeInvisibleTypeAnnotation;
            if (annotationWriter2 != null) {
                exceptionTableSize += annotationWriter2.computeAnnotationsSize("RuntimeInvisibleTypeAnnotations");
                i2++;
            }
            Attribute attribute2 = this.firstCodeAttribute;
            if (attribute2 != null) {
                SymbolTable symbolTable = this.symbolTable;
                ByteVector byteVector6 = this.code;
                exceptionTableSize += attribute2.computeAttributesSize(symbolTable, byteVector6.data, byteVector6.length, this.maxStack, this.maxLocals);
                i2 += this.firstCodeAttribute.getAttributeCount();
            }
            ByteVector putInt = byteVector.putShort(this.symbolTable.addConstantUtf8("Code")).putInt(exceptionTableSize).putShort(this.maxStack).putShort(this.maxLocals).putInt(this.code.length);
            ByteVector byteVector7 = this.code;
            putInt.putByteArray(byteVector7.data, 0, byteVector7.length);
            Handler.putExceptionTable(this.firstHandler, byteVector);
            byteVector.putShort(i2);
            if (this.stackMapTableEntries != null) {
                ByteVector putShort = byteVector.putShort(this.symbolTable.addConstantUtf8(this.symbolTable.getMajorVersion() >= 50 ? "StackMapTable" : "StackMap")).putInt(this.stackMapTableEntries.length + 2).putShort(this.stackMapTableNumberOfEntries);
                ByteVector byteVector8 = this.stackMapTableEntries;
                putShort.putByteArray(byteVector8.data, 0, byteVector8.length);
            }
            if (this.lineNumberTable != null) {
                ByteVector putShort2 = byteVector.putShort(this.symbolTable.addConstantUtf8("LineNumberTable")).putInt(this.lineNumberTable.length + 2).putShort(this.lineNumberTableLength);
                ByteVector byteVector9 = this.lineNumberTable;
                putShort2.putByteArray(byteVector9.data, 0, byteVector9.length);
            }
            if (this.localVariableTable != null) {
                ByteVector putShort3 = byteVector.putShort(this.symbolTable.addConstantUtf8("LocalVariableTable")).putInt(this.localVariableTable.length + 2).putShort(this.localVariableTableLength);
                ByteVector byteVector10 = this.localVariableTable;
                putShort3.putByteArray(byteVector10.data, 0, byteVector10.length);
            }
            if (this.localVariableTypeTable != null) {
                ByteVector putShort4 = byteVector.putShort(this.symbolTable.addConstantUtf8("LocalVariableTypeTable")).putInt(this.localVariableTypeTable.length + 2).putShort(this.localVariableTypeTableLength);
                ByteVector byteVector11 = this.localVariableTypeTable;
                putShort4.putByteArray(byteVector11.data, 0, byteVector11.length);
            }
            AnnotationWriter annotationWriter3 = this.lastCodeRuntimeVisibleTypeAnnotation;
            if (annotationWriter3 != null) {
                annotationWriter3.putAnnotations(this.symbolTable.addConstantUtf8("RuntimeVisibleTypeAnnotations"), byteVector);
            }
            AnnotationWriter annotationWriter4 = this.lastCodeRuntimeInvisibleTypeAnnotation;
            if (annotationWriter4 != null) {
                annotationWriter4.putAnnotations(this.symbolTable.addConstantUtf8("RuntimeInvisibleTypeAnnotations"), byteVector);
            }
            Attribute attribute3 = this.firstCodeAttribute;
            if (attribute3 != null) {
                SymbolTable symbolTable2 = this.symbolTable;
                ByteVector byteVector12 = this.code;
                attribute3.putAttributes(symbolTable2, byteVector12.data, byteVector12.length, this.maxStack, this.maxLocals, byteVector);
            }
        }
        if (this.numberOfExceptions > 0) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("Exceptions")).putInt((this.numberOfExceptions * 2) + 2).putShort(this.numberOfExceptions);
            for (int i6 : this.exceptionIndexTable) {
                byteVector.putShort(i6);
            }
        }
        Attribute.putAttributes(this.symbolTable, this.accessFlags, this.signatureIndex, byteVector);
        AnnotationWriter.putAnnotations(this.symbolTable, this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation, byteVector);
        if (this.lastRuntimeVisibleParameterAnnotations != null) {
            int addConstantUtf8 = this.symbolTable.addConstantUtf8("RuntimeVisibleParameterAnnotations");
            AnnotationWriter[] annotationWriterArr = this.lastRuntimeVisibleParameterAnnotations;
            int i7 = this.visibleAnnotableParameterCount;
            if (i7 == 0) {
                i7 = annotationWriterArr.length;
            }
            AnnotationWriter.putParameterAnnotations(addConstantUtf8, annotationWriterArr, i7, byteVector);
        }
        if (this.lastRuntimeInvisibleParameterAnnotations != null) {
            int addConstantUtf82 = this.symbolTable.addConstantUtf8("RuntimeInvisibleParameterAnnotations");
            AnnotationWriter[] annotationWriterArr2 = this.lastRuntimeInvisibleParameterAnnotations;
            int i8 = this.invisibleAnnotableParameterCount;
            if (i8 == 0) {
                i8 = annotationWriterArr2.length;
            }
            AnnotationWriter.putParameterAnnotations(addConstantUtf82, annotationWriterArr2, i8, byteVector);
        }
        if (this.defaultValue != null) {
            ByteVector putInt2 = byteVector.putShort(this.symbolTable.addConstantUtf8("AnnotationDefault")).putInt(this.defaultValue.length);
            ByteVector byteVector13 = this.defaultValue;
            putInt2.putByteArray(byteVector13.data, 0, byteVector13.length);
        }
        if (this.parameters != null) {
            ByteVector putByte = byteVector.putShort(this.symbolTable.addConstantUtf8("MethodParameters")).putInt(this.parameters.length + 1).putByte(this.parametersCount);
            ByteVector byteVector14 = this.parameters;
            putByte.putByteArray(byteVector14.data, 0, byteVector14.length);
        }
        Attribute attribute4 = this.firstAttribute;
        if (attribute4 != null) {
            attribute4.putAttributes(this.symbolTable, byteVector);
        }
    }

    public void setMethodAttributesSource(int i2, int i3) {
        this.sourceOffset = i2 + 6;
        this.sourceLength = i3 - 6;
    }

    public void visitAbstractType(int i2, int i3) {
        this.currentFrame[i2] = i3;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitAnnotableParameterCount(int i2, boolean z2) {
        if (z2) {
            this.visibleAnnotableParameterCount = i2;
        } else {
            this.invisibleAnnotableParameterCount = i2;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z2) {
        if (z2) {
            AnnotationWriter create = AnnotationWriter.create(this.symbolTable, str, this.lastRuntimeVisibleAnnotation);
            this.lastRuntimeVisibleAnnotation = create;
            return create;
        }
        AnnotationWriter create2 = AnnotationWriter.create(this.symbolTable, str, this.lastRuntimeInvisibleAnnotation);
        this.lastRuntimeInvisibleAnnotation = create2;
        return create2;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitAnnotationDefault() {
        ByteVector byteVector = new ByteVector();
        this.defaultValue = byteVector;
        return new AnnotationWriter(this.symbolTable, false, byteVector, null);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitAttribute(Attribute attribute) {
        if (attribute.isCodeAttribute()) {
            attribute.nextAttribute = this.firstCodeAttribute;
            this.firstCodeAttribute = attribute;
        } else {
            attribute.nextAttribute = this.firstAttribute;
            this.firstAttribute = attribute;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitCode() {
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitEnd() {
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i2, String str, String str2, String str3) {
        int i3;
        int i4;
        this.lastBytecodeOffset = this.code.length;
        Symbol addConstantFieldref = this.symbolTable.addConstantFieldref(str, str2, str3);
        this.code.put12(i2, addConstantFieldref.index);
        Label label = this.currentBasicBlock;
        if (label != null) {
            int i5 = this.compute;
            if (i5 == 4 || i5 == 3) {
                label.frame.execute(i2, 0, addConstantFieldref, this.symbolTable);
                return;
            }
            char charAt = str3.charAt(0);
            int i6 = -2;
            switch (i2) {
                case Opcodes.GETSTATIC /* 178 */:
                    i3 = this.relativeStackSize + ((charAt == 'D' || charAt == 'J') ? 2 : 1);
                    break;
                case Opcodes.PUTSTATIC /* 179 */:
                    i4 = this.relativeStackSize;
                    if (charAt != 'D' && charAt != 'J') {
                        i6 = -1;
                    }
                    i3 = i4 + i6;
                    break;
                case Opcodes.GETFIELD /* 180 */:
                    i3 = this.relativeStackSize + ((charAt == 'D' || charAt == 'J') ? 1 : 0);
                    break;
                default:
                    i4 = this.relativeStackSize;
                    if (charAt == 'D' || charAt == 'J') {
                        i6 = -3;
                    }
                    i3 = i4 + i6;
                    break;
            }
            if (i3 > this.maxRelativeStackSize) {
                this.maxRelativeStackSize = i3;
            }
            this.relativeStackSize = i3;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i2, int i3, Object[] objArr, int i4, Object[] objArr2) {
        int i5;
        int i6 = this.compute;
        if (i6 == 4) {
            return;
        }
        if (i6 == 3) {
            Label label = this.currentBasicBlock;
            Frame frame = label.frame;
            if (frame == null) {
                label.frame = new CurrentFrame(label);
                this.currentBasicBlock.frame.setInputFrameFromDescriptor(this.symbolTable, this.accessFlags, this.descriptor, i3);
                this.currentBasicBlock.frame.accept(this);
            } else {
                if (i2 == -1) {
                    frame.setInputFrameFromApiFormat(this.symbolTable, i3, objArr, i4, objArr2);
                }
                this.currentBasicBlock.frame.accept(this);
            }
        } else if (i2 == -1) {
            if (this.previousFrame == null) {
                int argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(this.descriptor) >> 2;
                Frame frame2 = new Frame(new Label());
                frame2.setInputFrameFromDescriptor(this.symbolTable, this.accessFlags, this.descriptor, argumentsAndReturnSizes);
                frame2.accept(this);
            }
            this.currentLocals = i3;
            int visitFrameStart = visitFrameStart(this.code.length, i3, i4);
            int i7 = 0;
            while (i7 < i3) {
                this.currentFrame[visitFrameStart] = Frame.getAbstractTypeFromApiFormat(this.symbolTable, objArr[i7]);
                i7++;
                visitFrameStart++;
            }
            int i8 = 0;
            while (i8 < i4) {
                this.currentFrame[visitFrameStart] = Frame.getAbstractTypeFromApiFormat(this.symbolTable, objArr2[i8]);
                i8++;
                visitFrameStart++;
            }
            visitFrameEnd();
        } else {
            if (this.symbolTable.getMajorVersion() < 50) {
                throw new IllegalArgumentException("Class versions V1_5 or less must use F_NEW frames.");
            }
            if (this.stackMapTableEntries == null) {
                this.stackMapTableEntries = new ByteVector();
                i5 = this.code.length;
            } else {
                i5 = (this.code.length - this.previousFrameOffset) - 1;
                if (i5 < 0) {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    return;
                }
            }
            if (i2 == 0) {
                this.currentLocals = i3;
                this.stackMapTableEntries.putByte(255).putShort(i5).putShort(i3);
                for (int i9 = 0; i9 < i3; i9++) {
                    putFrameType(objArr[i9]);
                }
                this.stackMapTableEntries.putShort(i4);
                for (int i10 = 0; i10 < i4; i10++) {
                    putFrameType(objArr2[i10]);
                }
            } else if (i2 == 1) {
                this.currentLocals += i3;
                this.stackMapTableEntries.putByte(i3 + 251).putShort(i5);
                for (int i11 = 0; i11 < i3; i11++) {
                    putFrameType(objArr[i11]);
                }
            } else if (i2 == 2) {
                this.currentLocals -= i3;
                this.stackMapTableEntries.putByte(251 - i3).putShort(i5);
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalArgumentException();
                }
                if (i5 < 64) {
                    this.stackMapTableEntries.putByte(i5 + 64);
                } else {
                    this.stackMapTableEntries.putByte(247).putShort(i5);
                }
                putFrameType(objArr2[0]);
            } else if (i5 < 64) {
                this.stackMapTableEntries.putByte(i5);
            } else {
                this.stackMapTableEntries.putByte(251).putShort(i5);
            }
            this.previousFrameOffset = this.code.length;
            this.stackMapTableNumberOfEntries++;
        }
        if (this.compute == 2) {
            this.relativeStackSize = i4;
            for (int i12 = 0; i12 < i4; i12++) {
                Object obj = objArr2[i12];
                if (obj == Opcodes.LONG || obj == Opcodes.DOUBLE) {
                    this.relativeStackSize++;
                }
            }
            int i13 = this.relativeStackSize;
            if (i13 > this.maxRelativeStackSize) {
                this.maxRelativeStackSize = i13;
            }
        }
        this.maxStack = Math.max(this.maxStack, i4);
        this.maxLocals = Math.max(this.maxLocals, this.currentLocals);
    }

    public void visitFrameEnd() {
        if (this.previousFrame != null) {
            if (this.stackMapTableEntries == null) {
                this.stackMapTableEntries = new ByteVector();
            }
            putFrame();
            this.stackMapTableNumberOfEntries++;
        }
        this.previousFrame = this.currentFrame;
        this.currentFrame = null;
    }

    public int visitFrameStart(int i2, int i3, int i4) {
        int i5 = i3 + 3 + i4;
        int[] iArr = this.currentFrame;
        if (iArr == null || iArr.length < i5) {
            this.currentFrame = new int[i5];
        }
        int[] iArr2 = this.currentFrame;
        iArr2[0] = i2;
        iArr2[1] = i3;
        iArr2[2] = i4;
        return 3;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i2, int i3) {
        int i4;
        int i5;
        ByteVector byteVector = this.code;
        this.lastBytecodeOffset = byteVector.length;
        if (i2 > 255 || i3 > 127 || i3 < -128) {
            byteVector.putByte(196).put12(Opcodes.IINC, i2).putShort(i3);
        } else {
            byteVector.putByte(Opcodes.IINC).put11(i2, i3);
        }
        Label label = this.currentBasicBlock;
        if (label != null && ((i5 = this.compute) == 4 || i5 == 3)) {
            label.frame.execute(Opcodes.IINC, i2, null, null);
        }
        if (this.compute == 0 || (i4 = i2 + 1) <= this.maxLocals) {
            return;
        }
        this.maxLocals = i4;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i2) {
        ByteVector byteVector = this.code;
        this.lastBytecodeOffset = byteVector.length;
        byteVector.putByte(i2);
        Label label = this.currentBasicBlock;
        if (label != null) {
            int i3 = this.compute;
            if (i3 == 4 || i3 == 3) {
                label.frame.execute(i2, 0, null, null);
            } else {
                int i4 = this.relativeStackSize + STACK_SIZE_DELTA[i2];
                if (i4 > this.maxRelativeStackSize) {
                    this.maxRelativeStackSize = i4;
                }
                this.relativeStackSize = i4;
            }
            if ((i2 < 172 || i2 > 177) && i2 != 191) {
                return;
            }
            endCurrentBasicBlockWithNoSuccessor();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitInsnAnnotation(int i2, TypePath typePath, String str, boolean z2) {
        if (z2) {
            AnnotationWriter create = AnnotationWriter.create(this.symbolTable, (i2 & (-16776961)) | (this.lastBytecodeOffset << 8), typePath, str, this.lastCodeRuntimeVisibleTypeAnnotation);
            this.lastCodeRuntimeVisibleTypeAnnotation = create;
            return create;
        }
        AnnotationWriter create2 = AnnotationWriter.create(this.symbolTable, (i2 & (-16776961)) | (this.lastBytecodeOffset << 8), typePath, str, this.lastCodeRuntimeInvisibleTypeAnnotation);
        this.lastCodeRuntimeInvisibleTypeAnnotation = create2;
        return create2;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i2, int i3) {
        ByteVector byteVector = this.code;
        this.lastBytecodeOffset = byteVector.length;
        if (i2 == 17) {
            byteVector.put12(i2, i3);
        } else {
            byteVector.put11(i2, i3);
        }
        Label label = this.currentBasicBlock;
        if (label != null) {
            int i4 = this.compute;
            if (i4 == 4 || i4 == 3) {
                label.frame.execute(i2, i3, null, null);
            } else if (i2 != 188) {
                int i5 = this.relativeStackSize + 1;
                if (i5 > this.maxRelativeStackSize) {
                    this.maxRelativeStackSize = i5;
                }
                this.relativeStackSize = i5;
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.lastBytecodeOffset = this.code.length;
        Symbol addConstantInvokeDynamic = this.symbolTable.addConstantInvokeDynamic(str, str2, handle, objArr);
        this.code.put12(Opcodes.INVOKEDYNAMIC, addConstantInvokeDynamic.index);
        this.code.putShort(0);
        Label label = this.currentBasicBlock;
        if (label != null) {
            int i2 = this.compute;
            if (i2 == 4 || i2 == 3) {
                label.frame.execute(Opcodes.INVOKEDYNAMIC, 0, addConstantInvokeDynamic, this.symbolTable);
                return;
            }
            int argumentsAndReturnSizes = addConstantInvokeDynamic.getArgumentsAndReturnSizes();
            int i3 = this.relativeStackSize + ((argumentsAndReturnSizes & 3) - (argumentsAndReturnSizes >> 2)) + 1;
            if (i3 > this.maxRelativeStackSize) {
                this.maxRelativeStackSize = i3;
            }
            this.relativeStackSize = i3;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i2, Label label) {
        boolean z2;
        ByteVector byteVector = this.code;
        int i3 = byteVector.length;
        this.lastBytecodeOffset = i3;
        int i4 = i2 >= 200 ? i2 - 33 : i2;
        if ((label.flags & 4) == 0 || label.bytecodeOffset - i3 >= -32768) {
            if (i4 != i2) {
                byteVector.putByte(i2);
                ByteVector byteVector2 = this.code;
                label.put(byteVector2, byteVector2.length - 1, true);
            } else {
                byteVector.putByte(i4);
                ByteVector byteVector3 = this.code;
                label.put(byteVector3, byteVector3.length - 1, false);
            }
            z2 = false;
        } else {
            if (i4 == 167) {
                byteVector.putByte(200);
            } else if (i4 == 168) {
                byteVector.putByte(201);
            } else {
                byteVector.putByte(i4 >= 198 ? i4 ^ 1 : ((i4 + 1) ^ 1) - 1);
                this.code.putShort(8);
                this.code.putByte(220);
                this.hasAsmInstructions = true;
                z2 = true;
                ByteVector byteVector4 = this.code;
                label.put(byteVector4, byteVector4.length - 1, true);
            }
            z2 = false;
            ByteVector byteVector42 = this.code;
            label.put(byteVector42, byteVector42.length - 1, true);
        }
        Label label2 = this.currentBasicBlock;
        if (label2 != null) {
            int i5 = this.compute;
            Label label3 = null;
            if (i5 == 4) {
                label2.frame.execute(i4, 0, null, null);
                Label canonicalInstance = label.getCanonicalInstance();
                canonicalInstance.flags = (short) (canonicalInstance.flags | 2);
                addSuccessorToCurrentBasicBlock(0, label);
                if (i4 != 167) {
                    label3 = new Label();
                }
            } else if (i5 == 3) {
                label2.frame.execute(i4, 0, null, null);
            } else if (i5 == 2) {
                this.relativeStackSize += STACK_SIZE_DELTA[i4];
            } else if (i4 == 168) {
                short s2 = label.flags;
                if ((s2 & 32) == 0) {
                    label.flags = (short) (s2 | 32);
                    this.hasSubroutines = true;
                }
                label2.flags = (short) (label2.flags | 16);
                addSuccessorToCurrentBasicBlock(this.relativeStackSize + 1, label);
                label3 = new Label();
            } else {
                int i6 = this.relativeStackSize + STACK_SIZE_DELTA[i4];
                this.relativeStackSize = i6;
                addSuccessorToCurrentBasicBlock(i6, label);
            }
            if (label3 != null) {
                if (z2) {
                    label3.flags = (short) (label3.flags | 2);
                }
                visitLabel(label3);
            }
            if (i4 == 167) {
                endCurrentBasicBlockWithNoSuccessor();
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(Label label) {
        boolean z2 = this.hasAsmInstructions;
        ByteVector byteVector = this.code;
        this.hasAsmInstructions = z2 | label.resolve(byteVector.data, byteVector.length);
        short s2 = label.flags;
        if ((s2 & 1) != 0) {
            return;
        }
        int i2 = this.compute;
        if (i2 == 4) {
            Label label2 = this.currentBasicBlock;
            if (label2 != null) {
                if (label.bytecodeOffset == label2.bytecodeOffset) {
                    label2.flags = (short) ((s2 & 2) | label2.flags);
                    label.frame = label2.frame;
                    return;
                }
                addSuccessorToCurrentBasicBlock(0, label);
            }
            Label label3 = this.lastBasicBlock;
            if (label3 != null) {
                if (label.bytecodeOffset == label3.bytecodeOffset) {
                    label3.flags = (short) (label3.flags | (label.flags & 2));
                    label.frame = label3.frame;
                    this.currentBasicBlock = label3;
                    return;
                }
                label3.nextBasicBlock = label;
            }
            this.lastBasicBlock = label;
            this.currentBasicBlock = label;
            label.frame = new Frame(label);
            return;
        }
        if (i2 == 3) {
            Label label4 = this.currentBasicBlock;
            if (label4 == null) {
                this.currentBasicBlock = label;
                return;
            } else {
                label4.frame.owner = label;
                return;
            }
        }
        if (i2 != 1) {
            if (i2 == 2 && this.currentBasicBlock == null) {
                this.currentBasicBlock = label;
                return;
            }
            return;
        }
        Label label5 = this.currentBasicBlock;
        if (label5 != null) {
            label5.outputStackMax = (short) this.maxRelativeStackSize;
            addSuccessorToCurrentBasicBlock(this.relativeStackSize, label);
        }
        this.currentBasicBlock = label;
        this.relativeStackSize = 0;
        this.maxRelativeStackSize = 0;
        Label label6 = this.lastBasicBlock;
        if (label6 != null) {
            label6.nextBasicBlock = label;
        }
        this.lastBasicBlock = label;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        char charAt;
        this.lastBytecodeOffset = this.code.length;
        Symbol addConstant = this.symbolTable.addConstant(obj);
        int i2 = addConstant.index;
        int i3 = addConstant.tag;
        boolean z2 = i3 == 5 || i3 == 6 || (i3 == 17 && ((charAt = addConstant.value.charAt(0)) == 'J' || charAt == 'D'));
        if (z2) {
            this.code.put12(20, i2);
        } else if (i2 >= 256) {
            this.code.put12(19, i2);
        } else {
            this.code.put11(18, i2);
        }
        Label label = this.currentBasicBlock;
        if (label != null) {
            int i4 = this.compute;
            if (i4 == 4 || i4 == 3) {
                label.frame.execute(18, 0, addConstant, this.symbolTable);
                return;
            }
            int i5 = this.relativeStackSize + (z2 ? 2 : 1);
            if (i5 > this.maxRelativeStackSize) {
                this.maxRelativeStackSize = i5;
            }
            this.relativeStackSize = i5;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLineNumber(int i2, Label label) {
        if (this.lineNumberTable == null) {
            this.lineNumberTable = new ByteVector();
        }
        this.lineNumberTableLength++;
        this.lineNumberTable.putShort(label.bytecodeOffset);
        this.lineNumberTable.putShort(i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i2) {
        if (str3 != null) {
            if (this.localVariableTypeTable == null) {
                this.localVariableTypeTable = new ByteVector();
            }
            this.localVariableTypeTableLength++;
            this.localVariableTypeTable.putShort(label.bytecodeOffset).putShort(label2.bytecodeOffset - label.bytecodeOffset).putShort(this.symbolTable.addConstantUtf8(str)).putShort(this.symbolTable.addConstantUtf8(str3)).putShort(i2);
        }
        if (this.localVariableTable == null) {
            this.localVariableTable = new ByteVector();
        }
        this.localVariableTableLength++;
        this.localVariableTable.putShort(label.bytecodeOffset).putShort(label2.bytecodeOffset - label.bytecodeOffset).putShort(this.symbolTable.addConstantUtf8(str)).putShort(this.symbolTable.addConstantUtf8(str2)).putShort(i2);
        if (this.compute != 0) {
            char charAt = str2.charAt(0);
            int i3 = i2 + ((charAt == 'J' || charAt == 'D') ? 2 : 1);
            if (i3 > this.maxLocals) {
                this.maxLocals = i3;
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitLocalVariableAnnotation(int i2, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z2) {
        ByteVector byteVector = new ByteVector();
        byteVector.putByte(i2 >>> 24).putShort(labelArr.length);
        for (int i3 = 0; i3 < labelArr.length; i3++) {
            byteVector.putShort(labelArr[i3].bytecodeOffset).putShort(labelArr2[i3].bytecodeOffset - labelArr[i3].bytecodeOffset).putShort(iArr[i3]);
        }
        TypePath.put(typePath, byteVector);
        byteVector.putShort(this.symbolTable.addConstantUtf8(str)).putShort(0);
        if (z2) {
            AnnotationWriter annotationWriter = new AnnotationWriter(this.symbolTable, true, byteVector, this.lastCodeRuntimeVisibleTypeAnnotation);
            this.lastCodeRuntimeVisibleTypeAnnotation = annotationWriter;
            return annotationWriter;
        }
        AnnotationWriter annotationWriter2 = new AnnotationWriter(this.symbolTable, true, byteVector, this.lastCodeRuntimeInvisibleTypeAnnotation);
        this.lastCodeRuntimeInvisibleTypeAnnotation = annotationWriter2;
        return annotationWriter2;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        ByteVector byteVector = this.code;
        this.lastBytecodeOffset = byteVector.length;
        byteVector.putByte(Opcodes.LOOKUPSWITCH).putByteArray(null, 0, (4 - (this.code.length % 4)) % 4);
        label.put(this.code, this.lastBytecodeOffset, true);
        this.code.putInt(labelArr.length);
        for (int i2 = 0; i2 < labelArr.length; i2++) {
            this.code.putInt(iArr[i2]);
            labelArr[i2].put(this.code, this.lastBytecodeOffset, true);
        }
        visitSwitchInsn(label, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i2, int i3) {
        int i4 = this.compute;
        if (i4 == 4) {
            computeAllFrames();
            return;
        }
        if (i4 == 1) {
            computeMaxStackAndLocal();
        } else if (i4 == 2) {
            this.maxStack = this.maxRelativeStackSize;
        } else {
            this.maxStack = i2;
            this.maxLocals = i3;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i2, String str, String str2, String str3, boolean z2) {
        this.lastBytecodeOffset = this.code.length;
        Symbol addConstantMethodref = this.symbolTable.addConstantMethodref(str, str2, str3, z2);
        if (i2 == 185) {
            this.code.put12(Opcodes.INVOKEINTERFACE, addConstantMethodref.index).put11(addConstantMethodref.getArgumentsAndReturnSizes() >> 2, 0);
        } else {
            this.code.put12(i2, addConstantMethodref.index);
        }
        Label label = this.currentBasicBlock;
        if (label != null) {
            int i3 = this.compute;
            if (i3 == 4 || i3 == 3) {
                label.frame.execute(i2, 0, addConstantMethodref, this.symbolTable);
                return;
            }
            int argumentsAndReturnSizes = addConstantMethodref.getArgumentsAndReturnSizes();
            int i4 = (argumentsAndReturnSizes & 3) - (argumentsAndReturnSizes >> 2);
            int i5 = i2 == 184 ? this.relativeStackSize + i4 + 1 : this.relativeStackSize + i4;
            if (i5 > this.maxRelativeStackSize) {
                this.maxRelativeStackSize = i5;
            }
            this.relativeStackSize = i5;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i2) {
        this.lastBytecodeOffset = this.code.length;
        Symbol addConstantClass = this.symbolTable.addConstantClass(str);
        this.code.put12(Opcodes.MULTIANEWARRAY, addConstantClass.index).putByte(i2);
        Label label = this.currentBasicBlock;
        if (label != null) {
            int i3 = this.compute;
            if (i3 == 4 || i3 == 3) {
                label.frame.execute(Opcodes.MULTIANEWARRAY, i2, addConstantClass, this.symbolTable);
            } else {
                this.relativeStackSize = (1 - i2) + this.relativeStackSize;
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitParameter(String str, int i2) {
        if (this.parameters == null) {
            this.parameters = new ByteVector();
        }
        this.parametersCount++;
        this.parameters.putShort(str == null ? 0 : this.symbolTable.addConstantUtf8(str)).putShort(i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitParameterAnnotation(int i2, String str, boolean z2) {
        if (z2) {
            if (this.lastRuntimeVisibleParameterAnnotations == null) {
                this.lastRuntimeVisibleParameterAnnotations = new AnnotationWriter[Type.getArgumentTypes(this.descriptor).length];
            }
            AnnotationWriter[] annotationWriterArr = this.lastRuntimeVisibleParameterAnnotations;
            AnnotationWriter create = AnnotationWriter.create(this.symbolTable, str, annotationWriterArr[i2]);
            annotationWriterArr[i2] = create;
            return create;
        }
        if (this.lastRuntimeInvisibleParameterAnnotations == null) {
            this.lastRuntimeInvisibleParameterAnnotations = new AnnotationWriter[Type.getArgumentTypes(this.descriptor).length];
        }
        AnnotationWriter[] annotationWriterArr2 = this.lastRuntimeInvisibleParameterAnnotations;
        AnnotationWriter create2 = AnnotationWriter.create(this.symbolTable, str, annotationWriterArr2[i2]);
        annotationWriterArr2[i2] = create2;
        return create2;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i2, int i3, Label label, Label... labelArr) {
        ByteVector byteVector = this.code;
        this.lastBytecodeOffset = byteVector.length;
        byteVector.putByte(Opcodes.TABLESWITCH).putByteArray(null, 0, (4 - (this.code.length % 4)) % 4);
        label.put(this.code, this.lastBytecodeOffset, true);
        this.code.putInt(i2).putInt(i3);
        for (Label label2 : labelArr) {
            label2.put(this.code, this.lastBytecodeOffset, true);
        }
        visitSwitchInsn(label, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitTryCatchAnnotation(int i2, TypePath typePath, String str, boolean z2) {
        if (z2) {
            AnnotationWriter create = AnnotationWriter.create(this.symbolTable, i2, typePath, str, this.lastCodeRuntimeVisibleTypeAnnotation);
            this.lastCodeRuntimeVisibleTypeAnnotation = create;
            return create;
        }
        AnnotationWriter create2 = AnnotationWriter.create(this.symbolTable, i2, typePath, str, this.lastCodeRuntimeInvisibleTypeAnnotation);
        this.lastCodeRuntimeInvisibleTypeAnnotation = create2;
        return create2;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        Handler handler = new Handler(label, label2, label3, str != null ? this.symbolTable.addConstantClass(str).index : 0, str);
        if (this.firstHandler == null) {
            this.firstHandler = handler;
        } else {
            this.lastHandler.nextHandler = handler;
        }
        this.lastHandler = handler;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitTypeAnnotation(int i2, TypePath typePath, String str, boolean z2) {
        if (z2) {
            AnnotationWriter create = AnnotationWriter.create(this.symbolTable, i2, typePath, str, this.lastRuntimeVisibleTypeAnnotation);
            this.lastRuntimeVisibleTypeAnnotation = create;
            return create;
        }
        AnnotationWriter create2 = AnnotationWriter.create(this.symbolTable, i2, typePath, str, this.lastRuntimeInvisibleTypeAnnotation);
        this.lastRuntimeInvisibleTypeAnnotation = create2;
        return create2;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i2, String str) {
        this.lastBytecodeOffset = this.code.length;
        Symbol addConstantClass = this.symbolTable.addConstantClass(str);
        this.code.put12(i2, addConstantClass.index);
        Label label = this.currentBasicBlock;
        if (label != null) {
            int i3 = this.compute;
            if (i3 == 4 || i3 == 3) {
                label.frame.execute(i2, this.lastBytecodeOffset, addConstantClass, this.symbolTable);
            } else if (i2 == 187) {
                int i4 = this.relativeStackSize + 1;
                if (i4 > this.maxRelativeStackSize) {
                    this.maxRelativeStackSize = i4;
                }
                this.relativeStackSize = i4;
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i2, int i3) {
        ByteVector byteVector = this.code;
        this.lastBytecodeOffset = byteVector.length;
        if (i3 < 4 && i2 != 169) {
            byteVector.putByte((i2 < 54 ? ((i2 - 21) << 2) + 26 : ((i2 - 54) << 2) + 59) + i3);
        } else if (i3 >= 256) {
            byteVector.putByte(196).put12(i2, i3);
        } else {
            byteVector.put11(i2, i3);
        }
        Label label = this.currentBasicBlock;
        if (label != null) {
            int i4 = this.compute;
            if (i4 == 4 || i4 == 3) {
                label.frame.execute(i2, i3, null, null);
            } else if (i2 == 169) {
                label.flags = (short) (label.flags | 64);
                label.outputStackSize = (short) this.relativeStackSize;
                endCurrentBasicBlockWithNoSuccessor();
            } else {
                int i5 = this.relativeStackSize + STACK_SIZE_DELTA[i2];
                if (i5 > this.maxRelativeStackSize) {
                    this.maxRelativeStackSize = i5;
                }
                this.relativeStackSize = i5;
            }
        }
        int i6 = this.compute;
        if (i6 != 0) {
            int i7 = (i2 == 22 || i2 == 24 || i2 == 55 || i2 == 57) ? i3 + 2 : i3 + 1;
            if (i7 > this.maxLocals) {
                this.maxLocals = i7;
            }
        }
        if (i2 < 54 || i6 != 4 || this.firstHandler == null) {
            return;
        }
        visitLabel(new Label());
    }
}
