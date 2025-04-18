package org.objectweb.asm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AnnotationWriter extends AnnotationVisitor {
    private final ByteVector annotation;
    private AnnotationWriter nextAnnotation;
    private int numElementValuePairs;
    private final int numElementValuePairsOffset;
    private final AnnotationWriter previousAnnotation;
    private final SymbolTable symbolTable;
    private final boolean useNamedValues;

    public AnnotationWriter(SymbolTable symbolTable, boolean z2, ByteVector byteVector, AnnotationWriter annotationWriter) {
        super(589824);
        this.symbolTable = symbolTable;
        this.useNamedValues = z2;
        this.annotation = byteVector;
        int i2 = byteVector.length;
        this.numElementValuePairsOffset = i2 == 0 ? -1 : i2 - 2;
        this.previousAnnotation = annotationWriter;
        if (annotationWriter != null) {
            annotationWriter.nextAnnotation = this;
        }
    }

    public static int computeParameterAnnotationsSize(String str, AnnotationWriter[] annotationWriterArr, int i2) {
        int i3 = (i2 * 2) + 7;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += annotationWriterArr[i4] == null ? 0 : r3.computeAnnotationsSize(str) - 8;
        }
        return i3;
    }

    public static AnnotationWriter create(SymbolTable symbolTable, String str, AnnotationWriter annotationWriter) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(symbolTable.addConstantUtf8(str)).putShort(0);
        return new AnnotationWriter(symbolTable, true, byteVector, annotationWriter);
    }

    public static void putParameterAnnotations(int i2, AnnotationWriter[] annotationWriterArr, int i3, ByteVector byteVector) {
        int i4 = (i3 * 2) + 1;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += annotationWriterArr[i5] == null ? 0 : r4.computeAnnotationsSize(null) - 8;
        }
        byteVector.putShort(i2);
        byteVector.putInt(i4);
        byteVector.putByte(i3);
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = 0;
            AnnotationWriter annotationWriter = null;
            for (AnnotationWriter annotationWriter2 = annotationWriterArr[i6]; annotationWriter2 != null; annotationWriter2 = annotationWriter2.previousAnnotation) {
                annotationWriter2.visitEnd();
                i7++;
                annotationWriter = annotationWriter2;
            }
            byteVector.putShort(i7);
            while (annotationWriter != null) {
                ByteVector byteVector2 = annotationWriter.annotation;
                byteVector.putByteArray(byteVector2.data, 0, byteVector2.length);
                annotationWriter = annotationWriter.nextAnnotation;
            }
        }
    }

    public int computeAnnotationsSize(String str) {
        if (str != null) {
            this.symbolTable.addConstantUtf8(str);
        }
        int i2 = 8;
        for (AnnotationWriter annotationWriter = this; annotationWriter != null; annotationWriter = annotationWriter.previousAnnotation) {
            i2 += annotationWriter.annotation.length;
        }
        return i2;
    }

    public void putAnnotations(int i2, ByteVector byteVector) {
        int i3 = 2;
        int i4 = 0;
        AnnotationWriter annotationWriter = null;
        for (AnnotationWriter annotationWriter2 = this; annotationWriter2 != null; annotationWriter2 = annotationWriter2.previousAnnotation) {
            annotationWriter2.visitEnd();
            i3 += annotationWriter2.annotation.length;
            i4++;
            annotationWriter = annotationWriter2;
        }
        byteVector.putShort(i2);
        byteVector.putInt(i3);
        byteVector.putShort(i4);
        while (annotationWriter != null) {
            ByteVector byteVector2 = annotationWriter.annotation;
            byteVector.putByteArray(byteVector2.data, 0, byteVector2.length);
            annotationWriter = annotationWriter.nextAnnotation;
        }
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visit(String str, Object obj) {
        this.numElementValuePairs++;
        if (this.useNamedValues) {
            this.annotation.putShort(this.symbolTable.addConstantUtf8(str));
        }
        if (obj instanceof String) {
            this.annotation.put12(Opcodes.DREM, this.symbolTable.addConstantUtf8((String) obj));
            return;
        }
        if (obj instanceof Byte) {
            this.annotation.put12(66, this.symbolTable.addConstantInteger(((Byte) obj).byteValue()).index);
            return;
        }
        if (obj instanceof Boolean) {
            this.annotation.put12(90, this.symbolTable.addConstantInteger(((Boolean) obj).booleanValue() ? 1 : 0).index);
            return;
        }
        if (obj instanceof Character) {
            this.annotation.put12(67, this.symbolTable.addConstantInteger(((Character) obj).charValue()).index);
            return;
        }
        if (obj instanceof Short) {
            this.annotation.put12(83, this.symbolTable.addConstantInteger(((Short) obj).shortValue()).index);
            return;
        }
        if (obj instanceof Type) {
            this.annotation.put12(99, this.symbolTable.addConstantUtf8(((Type) obj).getDescriptor()));
            return;
        }
        int i2 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            this.annotation.put12(91, bArr.length);
            int length = bArr.length;
            while (i2 < length) {
                this.annotation.put12(66, this.symbolTable.addConstantInteger(bArr[i2]).index);
                i2++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            this.annotation.put12(91, zArr.length);
            int length2 = zArr.length;
            while (i2 < length2) {
                this.annotation.put12(90, this.symbolTable.addConstantInteger(zArr[i2] ? 1 : 0).index);
                i2++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            this.annotation.put12(91, sArr.length);
            int length3 = sArr.length;
            while (i2 < length3) {
                this.annotation.put12(83, this.symbolTable.addConstantInteger(sArr[i2]).index);
                i2++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            this.annotation.put12(91, cArr.length);
            int length4 = cArr.length;
            while (i2 < length4) {
                this.annotation.put12(67, this.symbolTable.addConstantInteger(cArr[i2]).index);
                i2++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            this.annotation.put12(91, iArr.length);
            int length5 = iArr.length;
            while (i2 < length5) {
                this.annotation.put12(73, this.symbolTable.addConstantInteger(iArr[i2]).index);
                i2++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            this.annotation.put12(91, jArr.length);
            int length6 = jArr.length;
            while (i2 < length6) {
                this.annotation.put12(74, this.symbolTable.addConstantLong(jArr[i2]).index);
                i2++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            this.annotation.put12(91, fArr.length);
            int length7 = fArr.length;
            while (i2 < length7) {
                this.annotation.put12(70, this.symbolTable.addConstantFloat(fArr[i2]).index);
                i2++;
            }
            return;
        }
        if (!(obj instanceof double[])) {
            Symbol addConstant = this.symbolTable.addConstant(obj);
            this.annotation.put12(".s.IFJDCS".charAt(addConstant.tag), addConstant.index);
            return;
        }
        double[] dArr = (double[]) obj;
        this.annotation.put12(91, dArr.length);
        int length8 = dArr.length;
        while (i2 < length8) {
            this.annotation.put12(68, this.symbolTable.addConstantDouble(dArr[i2]).index);
            i2++;
        }
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public AnnotationVisitor visitAnnotation(String str, String str2) {
        this.numElementValuePairs++;
        if (this.useNamedValues) {
            this.annotation.putShort(this.symbolTable.addConstantUtf8(str));
        }
        this.annotation.put12(64, this.symbolTable.addConstantUtf8(str2)).putShort(0);
        return new AnnotationWriter(this.symbolTable, true, this.annotation, null);
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public AnnotationVisitor visitArray(String str) {
        this.numElementValuePairs++;
        if (this.useNamedValues) {
            this.annotation.putShort(this.symbolTable.addConstantUtf8(str));
        }
        this.annotation.put12(91, 0);
        return new AnnotationWriter(this.symbolTable, false, this.annotation, null);
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visitEnd() {
        int i2 = this.numElementValuePairsOffset;
        if (i2 != -1) {
            byte[] bArr = this.annotation.data;
            int i3 = this.numElementValuePairs;
            bArr[i2] = (byte) (i3 >>> 8);
            bArr[i2 + 1] = (byte) i3;
        }
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visitEnum(String str, String str2, String str3) {
        this.numElementValuePairs++;
        if (this.useNamedValues) {
            this.annotation.putShort(this.symbolTable.addConstantUtf8(str));
        }
        this.annotation.put12(101, this.symbolTable.addConstantUtf8(str2)).putShort(this.symbolTable.addConstantUtf8(str3));
    }

    public static int computeAnnotationsSize(AnnotationWriter annotationWriter, AnnotationWriter annotationWriter2, AnnotationWriter annotationWriter3, AnnotationWriter annotationWriter4) {
        int computeAnnotationsSize = annotationWriter != null ? annotationWriter.computeAnnotationsSize("RuntimeVisibleAnnotations") : 0;
        if (annotationWriter2 != null) {
            computeAnnotationsSize += annotationWriter2.computeAnnotationsSize("RuntimeInvisibleAnnotations");
        }
        if (annotationWriter3 != null) {
            computeAnnotationsSize += annotationWriter3.computeAnnotationsSize("RuntimeVisibleTypeAnnotations");
        }
        return annotationWriter4 != null ? computeAnnotationsSize + annotationWriter4.computeAnnotationsSize("RuntimeInvisibleTypeAnnotations") : computeAnnotationsSize;
    }

    public static AnnotationWriter create(SymbolTable symbolTable, int i2, TypePath typePath, String str, AnnotationWriter annotationWriter) {
        ByteVector byteVector = new ByteVector();
        TypeReference.putTarget(i2, byteVector);
        TypePath.put(typePath, byteVector);
        byteVector.putShort(symbolTable.addConstantUtf8(str)).putShort(0);
        return new AnnotationWriter(symbolTable, true, byteVector, annotationWriter);
    }

    public static void putAnnotations(SymbolTable symbolTable, AnnotationWriter annotationWriter, AnnotationWriter annotationWriter2, AnnotationWriter annotationWriter3, AnnotationWriter annotationWriter4, ByteVector byteVector) {
        if (annotationWriter != null) {
            annotationWriter.putAnnotations(symbolTable.addConstantUtf8("RuntimeVisibleAnnotations"), byteVector);
        }
        if (annotationWriter2 != null) {
            annotationWriter2.putAnnotations(symbolTable.addConstantUtf8("RuntimeInvisibleAnnotations"), byteVector);
        }
        if (annotationWriter3 != null) {
            annotationWriter3.putAnnotations(symbolTable.addConstantUtf8("RuntimeVisibleTypeAnnotations"), byteVector);
        }
        if (annotationWriter4 != null) {
            annotationWriter4.putAnnotations(symbolTable.addConstantUtf8("RuntimeInvisibleTypeAnnotations"), byteVector);
        }
    }
}
