package org.objectweb.asm;

import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import okio.Utf8;

/* loaded from: classes3.dex */
public class ClassReader {
    static final int EXPAND_ASM_INSNS = 256;
    public static final int EXPAND_FRAMES = 8;
    private static final int INPUT_STREAM_DATA_CHUNK_SIZE = 4096;
    private static final int MAX_BUFFER_SIZE = 1048576;
    public static final int SKIP_CODE = 1;
    public static final int SKIP_DEBUG = 2;
    public static final int SKIP_FRAMES = 4;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public final byte[] f31208b;
    private final int[] bootstrapMethodOffsets;
    final byte[] classFileBuffer;
    private final ConstantDynamic[] constantDynamicValues;
    private final String[] constantUtf8Values;
    private final int[] cpInfoOffsets;
    public final int header;
    private final int maxStringLength;

    public ClassReader(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    private static int calculateBufferSize(InputStream inputStream) throws IOException {
        int available = inputStream.available();
        if (available < 256) {
            return 4096;
        }
        return Math.min(available, MAX_BUFFER_SIZE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
    
        if (r0.charAt(r5) == 'L') goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006c, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0072, code lost:
    
        if (r0.charAt(r5) == ';') goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0075, code lost:
    
        r5 = r5 + 1;
        r1[r4] = r0.substring(r2, r5);
        r2 = r5;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0051, code lost:
    
        r11.currentFrameLocalCount = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0053, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void computeImplicitFrame(org.objectweb.asm.Context r11) {
        /*
            r10 = this;
            java.lang.String r0 = r11.currentMethodDescriptor
            java.lang.Object[] r1 = r11.currentFrameLocalTypes
            int r2 = r11.currentMethodAccessFlags
            r2 = r2 & 8
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L29
            java.lang.String r2 = "<init>"
            java.lang.String r5 = r11.currentMethodName
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L1c
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.UNINITIALIZED_THIS
            r1[r4] = r2
        L1a:
            r4 = r3
            goto L29
        L1c:
            int r2 = r10.header
            int r2 = r2 + 2
            char[] r5 = r11.charBuffer
            java.lang.String r2 = r10.readClass(r2, r5)
            r1[r4] = r2
            goto L1a
        L29:
            r2 = r3
        L2a:
            int r5 = r2 + 1
            char r6 = r0.charAt(r2)
            r7 = 70
            if (r6 == r7) goto La6
            r7 = 59
            r8 = 76
            if (r6 == r8) goto L8f
            r9 = 83
            if (r6 == r9) goto L88
            r9 = 73
            if (r6 == r9) goto L88
            r9 = 74
            if (r6 == r9) goto L81
            r9 = 90
            if (r6 == r9) goto L88
            r9 = 91
            if (r6 == r9) goto L5d
            switch(r6) {
                case 66: goto L88;
                case 67: goto L88;
                case 68: goto L54;
                default: goto L51;
            }
        L51:
            r11.currentFrameLocalCount = r4
            return
        L54:
            int r2 = r4 + 1
            java.lang.Integer r6 = org.objectweb.asm.Opcodes.DOUBLE
            r1[r4] = r6
        L5a:
            r4 = r2
            r2 = r5
            goto L2a
        L5d:
            char r6 = r0.charAt(r5)
            if (r6 != r9) goto L66
            int r5 = r5 + 1
            goto L5d
        L66:
            char r6 = r0.charAt(r5)
            if (r6 != r8) goto L75
        L6c:
            int r5 = r5 + 1
            char r6 = r0.charAt(r5)
            if (r6 == r7) goto L75
            goto L6c
        L75:
            int r6 = r4 + 1
            int r5 = r5 + r3
            java.lang.String r2 = r0.substring(r2, r5)
            r1[r4] = r2
            r2 = r5
            r4 = r6
            goto L2a
        L81:
            int r2 = r4 + 1
            java.lang.Integer r6 = org.objectweb.asm.Opcodes.LONG
            r1[r4] = r6
            goto L5a
        L88:
            int r2 = r4 + 1
            java.lang.Integer r6 = org.objectweb.asm.Opcodes.INTEGER
            r1[r4] = r6
            goto L5a
        L8f:
            r2 = r5
        L90:
            char r6 = r0.charAt(r2)
            if (r6 == r7) goto L99
            int r2 = r2 + 1
            goto L90
        L99:
            int r6 = r4 + 1
            int r7 = r2 + 1
            java.lang.String r2 = r0.substring(r5, r2)
            r1[r4] = r2
            r4 = r6
            r2 = r7
            goto L2a
        La6:
            int r2 = r4 + 1
            java.lang.Integer r6 = org.objectweb.asm.Opcodes.FLOAT
            r1[r4] = r6
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.ClassReader.computeImplicitFrame(org.objectweb.asm.Context):void");
    }

    private void createDebugLabel(int i2, Label[] labelArr) {
        if (labelArr[i2] == null) {
            Label readLabel = readLabel(i2, labelArr);
            readLabel.flags = (short) (readLabel.flags | 1);
        }
    }

    private Label createLabel(int i2, Label[] labelArr) {
        Label readLabel = readLabel(i2, labelArr);
        readLabel.flags = (short) (readLabel.flags & (-2));
        return readLabel;
    }

    private int getTypeAnnotationBytecodeOffset(int[] iArr, int i2) {
        if (iArr == null || i2 >= iArr.length || readByte(iArr[i2]) < 67) {
            return -1;
        }
        return readUnsignedShort(iArr[i2] + 1);
    }

    private Attribute readAttribute(Attribute[] attributeArr, String str, int i2, int i3, char[] cArr, int i4, Label[] labelArr) {
        for (Attribute attribute : attributeArr) {
            if (attribute.type.equals(str)) {
                return attribute.read(this, i2, i3, cArr, i4, labelArr);
            }
        }
        return new Attribute(str).read(this, i2, i3, null, -1, null);
    }

    private int[] readBootstrapMethodsAttribute(int i2) {
        char[] cArr = new char[i2];
        int firstAttributeOffset = getFirstAttributeOffset();
        for (int readUnsignedShort = readUnsignedShort(firstAttributeOffset - 2); readUnsignedShort > 0; readUnsignedShort--) {
            String readUTF8 = readUTF8(firstAttributeOffset, cArr);
            int readInt = readInt(firstAttributeOffset + 2);
            int i3 = firstAttributeOffset + 6;
            if ("BootstrapMethods".equals(readUTF8)) {
                int readUnsignedShort2 = readUnsignedShort(i3);
                int[] iArr = new int[readUnsignedShort2];
                int i4 = firstAttributeOffset + 8;
                for (int i5 = 0; i5 < readUnsignedShort2; i5++) {
                    iArr[i5] = i4;
                    i4 += (readUnsignedShort(i4 + 2) * 2) + 4;
                }
                return iArr;
            }
            firstAttributeOffset = i3 + readInt;
        }
        throw new IllegalArgumentException();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private void readCode(org.objectweb.asm.MethodVisitor r42, org.objectweb.asm.Context r43, int r44) {
        /*
            Method dump skipped, instructions count: 3512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.ClassReader.readCode(org.objectweb.asm.MethodVisitor, org.objectweb.asm.Context, int):void");
    }

    private ConstantDynamic readConstantDynamic(int i2, char[] cArr) {
        ConstantDynamic constantDynamic = this.constantDynamicValues[i2];
        if (constantDynamic != null) {
            return constantDynamic;
        }
        int[] iArr = this.cpInfoOffsets;
        int i3 = iArr[i2];
        int i4 = iArr[readUnsignedShort(i3 + 2)];
        String readUTF8 = readUTF8(i4, cArr);
        String readUTF82 = readUTF8(i4 + 2, cArr);
        int i5 = this.bootstrapMethodOffsets[readUnsignedShort(i3)];
        Handle handle = (Handle) readConst(readUnsignedShort(i5), cArr);
        int readUnsignedShort = readUnsignedShort(i5 + 2);
        Object[] objArr = new Object[readUnsignedShort];
        int i6 = i5 + 4;
        for (int i7 = 0; i7 < readUnsignedShort; i7++) {
            objArr[i7] = readConst(readUnsignedShort(i6), cArr);
            i6 += 2;
        }
        ConstantDynamic[] constantDynamicArr = this.constantDynamicValues;
        ConstantDynamic constantDynamic2 = new ConstantDynamic(readUTF8, readUTF82, handle, objArr);
        constantDynamicArr[i2] = constantDynamic2;
        return constantDynamic2;
    }

    private int readElementValue(AnnotationVisitor annotationVisitor, int i2, String str, char[] cArr) {
        int i3 = 0;
        if (annotationVisitor == null) {
            int i4 = this.classFileBuffer[i2] & UnsignedBytes.MAX_VALUE;
            return i4 != 64 ? i4 != 91 ? i4 != 101 ? i2 + 3 : i2 + 5 : readElementValues(null, i2 + 1, false, cArr) : readElementValues(null, i2 + 3, true, cArr);
        }
        int i5 = i2 + 1;
        int i6 = this.classFileBuffer[i2] & UnsignedBytes.MAX_VALUE;
        if (i6 == 64) {
            return readElementValues(annotationVisitor.visitAnnotation(str, readUTF8(i5, cArr)), i2 + 3, true, cArr);
        }
        if (i6 != 70) {
            if (i6 == 83) {
                annotationVisitor.visit(str, Short.valueOf((short) readInt(this.cpInfoOffsets[readUnsignedShort(i5)])));
            } else if (i6 == 99) {
                annotationVisitor.visit(str, Type.getType(readUTF8(i5, cArr)));
            } else {
                if (i6 == 101) {
                    annotationVisitor.visitEnum(str, readUTF8(i5, cArr), readUTF8(i2 + 3, cArr));
                    return i2 + 5;
                }
                if (i6 == 115) {
                    annotationVisitor.visit(str, readUTF8(i5, cArr));
                } else if (i6 != 73 && i6 != 74) {
                    if (i6 == 90) {
                        annotationVisitor.visit(str, readInt(this.cpInfoOffsets[readUnsignedShort(i5)]) == 0 ? Boolean.FALSE : Boolean.TRUE);
                    } else {
                        if (i6 == 91) {
                            int readUnsignedShort = readUnsignedShort(i5);
                            int i7 = i2 + 3;
                            if (readUnsignedShort == 0) {
                                return readElementValues(annotationVisitor.visitArray(str), i2 + 1, false, cArr);
                            }
                            int i8 = this.classFileBuffer[i7] & UnsignedBytes.MAX_VALUE;
                            if (i8 == 70) {
                                float[] fArr = new float[readUnsignedShort];
                                while (i3 < readUnsignedShort) {
                                    fArr[i3] = Float.intBitsToFloat(readInt(this.cpInfoOffsets[readUnsignedShort(i7 + 1)]));
                                    i7 += 3;
                                    i3++;
                                }
                                annotationVisitor.visit(str, fArr);
                            } else if (i8 == 83) {
                                short[] sArr = new short[readUnsignedShort];
                                while (i3 < readUnsignedShort) {
                                    sArr[i3] = (short) readInt(this.cpInfoOffsets[readUnsignedShort(i7 + 1)]);
                                    i7 += 3;
                                    i3++;
                                }
                                annotationVisitor.visit(str, sArr);
                            } else if (i8 == 90) {
                                boolean[] zArr = new boolean[readUnsignedShort];
                                for (int i9 = 0; i9 < readUnsignedShort; i9++) {
                                    zArr[i9] = readInt(this.cpInfoOffsets[readUnsignedShort(i7 + 1)]) != 0;
                                    i7 += 3;
                                }
                                annotationVisitor.visit(str, zArr);
                            } else if (i8 == 73) {
                                int[] iArr = new int[readUnsignedShort];
                                while (i3 < readUnsignedShort) {
                                    iArr[i3] = readInt(this.cpInfoOffsets[readUnsignedShort(i7 + 1)]);
                                    i7 += 3;
                                    i3++;
                                }
                                annotationVisitor.visit(str, iArr);
                            } else if (i8 != 74) {
                                switch (i8) {
                                    case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                                        byte[] bArr = new byte[readUnsignedShort];
                                        while (i3 < readUnsignedShort) {
                                            bArr[i3] = (byte) readInt(this.cpInfoOffsets[readUnsignedShort(i7 + 1)]);
                                            i7 += 3;
                                            i3++;
                                        }
                                        annotationVisitor.visit(str, bArr);
                                        break;
                                    case TypeReference.INSTANCEOF /* 67 */:
                                        char[] cArr2 = new char[readUnsignedShort];
                                        while (i3 < readUnsignedShort) {
                                            cArr2[i3] = (char) readInt(this.cpInfoOffsets[readUnsignedShort(i7 + 1)]);
                                            i7 += 3;
                                            i3++;
                                        }
                                        annotationVisitor.visit(str, cArr2);
                                        break;
                                    case TypeReference.NEW /* 68 */:
                                        double[] dArr = new double[readUnsignedShort];
                                        while (i3 < readUnsignedShort) {
                                            dArr[i3] = Double.longBitsToDouble(readLong(this.cpInfoOffsets[readUnsignedShort(i7 + 1)]));
                                            i7 += 3;
                                            i3++;
                                        }
                                        annotationVisitor.visit(str, dArr);
                                        break;
                                    default:
                                        return readElementValues(annotationVisitor.visitArray(str), i2 + 1, false, cArr);
                                }
                            } else {
                                long[] jArr = new long[readUnsignedShort];
                                while (i3 < readUnsignedShort) {
                                    jArr[i3] = readLong(this.cpInfoOffsets[readUnsignedShort(i7 + 1)]);
                                    i7 += 3;
                                    i3++;
                                }
                                annotationVisitor.visit(str, jArr);
                            }
                            return i7;
                        }
                        switch (i6) {
                            case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                                annotationVisitor.visit(str, Byte.valueOf((byte) readInt(this.cpInfoOffsets[readUnsignedShort(i5)])));
                                break;
                            case TypeReference.INSTANCEOF /* 67 */:
                                annotationVisitor.visit(str, Character.valueOf((char) readInt(this.cpInfoOffsets[readUnsignedShort(i5)])));
                                break;
                            case TypeReference.NEW /* 68 */:
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                }
            }
            return i2 + 3;
        }
        annotationVisitor.visit(str, readConst(readUnsignedShort(i5), cArr));
        return i2 + 3;
    }

    private int readElementValues(AnnotationVisitor annotationVisitor, int i2, boolean z2, char[] cArr) {
        int readUnsignedShort = readUnsignedShort(i2);
        int i3 = i2 + 2;
        if (!z2) {
            while (true) {
                int i4 = readUnsignedShort - 1;
                if (readUnsignedShort <= 0) {
                    break;
                }
                i3 = readElementValue(annotationVisitor, i3, null, cArr);
                readUnsignedShort = i4;
            }
        } else {
            while (true) {
                int i5 = readUnsignedShort - 1;
                if (readUnsignedShort <= 0) {
                    break;
                }
                i3 = readElementValue(annotationVisitor, i3 + 2, readUTF8(i3, cArr), cArr);
                readUnsignedShort = i5;
            }
        }
        if (annotationVisitor != null) {
            annotationVisitor.visitEnd();
        }
        return i3;
    }

    private int readField(ClassVisitor classVisitor, Context context, int i2) {
        int i3;
        int i4;
        Context context2 = context;
        char[] cArr = context2.charBuffer;
        int readUnsignedShort = readUnsignedShort(i2);
        String readUTF8 = readUTF8(i2 + 2, cArr);
        String readUTF82 = readUTF8(i2 + 4, cArr);
        int readUnsignedShort2 = readUnsignedShort(i2 + 6);
        int i5 = i2 + 8;
        int i6 = readUnsignedShort;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        Attribute attribute = null;
        String str = null;
        Object obj = null;
        while (true) {
            int i11 = readUnsignedShort2 - 1;
            if (readUnsignedShort2 <= 0) {
                break;
            }
            String readUTF83 = readUTF8(i5, cArr);
            int readInt = readInt(i5 + 2);
            int i12 = i5 + 6;
            if ("ConstantValue".equals(readUTF83)) {
                int readUnsignedShort3 = readUnsignedShort(i12);
                obj = readUnsignedShort3 == 0 ? null : readConst(readUnsignedShort3, cArr);
            } else if ("Signature".equals(readUTF83)) {
                str = readUTF8(i12, cArr);
            } else {
                if ("Deprecated".equals(readUTF83)) {
                    i4 = 131072 | i6;
                } else if ("Synthetic".equals(readUTF83)) {
                    i4 = i6 | 4096;
                } else {
                    if ("RuntimeVisibleAnnotations".equals(readUTF83)) {
                        i10 = i12;
                        i3 = i10;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(readUTF83)) {
                        i8 = i12;
                        i3 = i8;
                    } else if ("RuntimeInvisibleAnnotations".equals(readUTF83)) {
                        i9 = i12;
                        i3 = i9;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(readUTF83)) {
                        i7 = i12;
                        i3 = i7;
                    } else {
                        i3 = i12;
                        Attribute attribute2 = attribute;
                        attribute = readAttribute(context2.attributePrototypes, readUTF83, i3, readInt, cArr, -1, null);
                        attribute.nextAttribute = attribute2;
                        i9 = i9;
                        i10 = i10;
                        i7 = i7;
                        i8 = i8;
                    }
                    i5 = i3 + readInt;
                    context2 = context;
                    readUnsignedShort2 = i11;
                }
                i6 = i4;
            }
            i3 = i12;
            i5 = i3 + readInt;
            context2 = context;
            readUnsignedShort2 = i11;
        }
        Attribute attribute3 = attribute;
        int i13 = i7;
        int i14 = i8;
        int i15 = i9;
        int i16 = i10;
        FieldVisitor visitField = classVisitor.visitField(i6, readUTF8, readUTF82, str, obj);
        if (visitField == null) {
            return i5;
        }
        if (i16 != 0) {
            int readUnsignedShort4 = readUnsignedShort(i16);
            int i17 = i16 + 2;
            while (true) {
                int i18 = readUnsignedShort4 - 1;
                if (readUnsignedShort4 <= 0) {
                    break;
                }
                i17 = readElementValues(visitField.visitAnnotation(readUTF8(i17, cArr), true), i17 + 2, true, cArr);
                readUnsignedShort4 = i18;
            }
        }
        if (i15 != 0) {
            int readUnsignedShort5 = readUnsignedShort(i15);
            int i19 = i15 + 2;
            while (true) {
                int i20 = readUnsignedShort5 - 1;
                if (readUnsignedShort5 <= 0) {
                    break;
                }
                i19 = readElementValues(visitField.visitAnnotation(readUTF8(i19, cArr), false), i19 + 2, true, cArr);
                readUnsignedShort5 = i20;
            }
        }
        if (i14 != 0) {
            int readUnsignedShort6 = readUnsignedShort(i14);
            int i21 = i14 + 2;
            while (true) {
                int i22 = readUnsignedShort6 - 1;
                if (readUnsignedShort6 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget = readTypeAnnotationTarget(context, i21);
                i21 = readElementValues(visitField.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget, cArr), true), readTypeAnnotationTarget + 2, true, cArr);
                readUnsignedShort6 = i22;
            }
        }
        if (i13 != 0) {
            int readUnsignedShort7 = readUnsignedShort(i13);
            int i23 = i13 + 2;
            while (true) {
                int i24 = readUnsignedShort7 - 1;
                if (readUnsignedShort7 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget2 = readTypeAnnotationTarget(context, i23);
                i23 = readElementValues(visitField.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget2, cArr), false), readTypeAnnotationTarget2 + 2, true, cArr);
                readUnsignedShort7 = i24;
            }
        }
        while (true) {
            Attribute attribute4 = attribute3;
            if (attribute4 == null) {
                visitField.visitEnd();
                return i5;
            }
            attribute3 = attribute4.nextAttribute;
            attribute4.nextAttribute = null;
            visitField.visitAttribute(attribute4);
        }
    }

    private int readMethod(ClassVisitor classVisitor, Context context, int i2) {
        int i3;
        int i4;
        char[] cArr = context.charBuffer;
        context.currentMethodAccessFlags = readUnsignedShort(i2);
        context.currentMethodName = readUTF8(i2 + 2, cArr);
        int i5 = i2 + 4;
        context.currentMethodDescriptor = readUTF8(i5, cArr);
        int readUnsignedShort = readUnsignedShort(i2 + 6);
        int i6 = i2 + 8;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        Attribute attribute = null;
        boolean z2 = false;
        int i13 = 0;
        String[] strArr = null;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int i18 = readUnsignedShort - 1;
            if (readUnsignedShort <= 0) {
                break;
            }
            String readUTF8 = readUTF8(i6, cArr);
            int readInt = readInt(i6 + 2);
            int i19 = i12;
            int i20 = i6 + 6;
            int i21 = i7;
            if (!"Code".equals(readUTF8)) {
                if ("Exceptions".equals(readUTF8)) {
                    int readUnsignedShort2 = readUnsignedShort(i20);
                    String[] strArr2 = new String[readUnsignedShort2];
                    int i22 = i6 + 8;
                    int i23 = i8;
                    for (int i24 = 0; i24 < readUnsignedShort2; i24++) {
                        strArr2[i24] = readClass(i22, cArr);
                        i22 += 2;
                    }
                    strArr = strArr2;
                    i13 = i20;
                    i7 = i21;
                    i8 = i23;
                    i12 = i19;
                    i4 = i13;
                } else {
                    i3 = i8;
                    if ("Signature".equals(readUTF8)) {
                        i4 = i20;
                        i7 = i21;
                        i8 = i3;
                        i12 = readUnsignedShort(i20);
                    } else if ("Deprecated".equals(readUTF8)) {
                        context.currentMethodAccessFlags |= Opcodes.ACC_DEPRECATED;
                        i7 = i21;
                        i8 = i3;
                    } else if ("RuntimeVisibleAnnotations".equals(readUTF8)) {
                        i9 = i20;
                        i7 = i21;
                        i8 = i3;
                        i12 = i19;
                        i4 = i9;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(readUTF8)) {
                        i7 = i20;
                        i8 = i3;
                        i12 = i19;
                        i4 = i7;
                    } else if ("AnnotationDefault".equals(readUTF8)) {
                        i10 = i20;
                        i7 = i21;
                        i8 = i3;
                        i12 = i19;
                        i4 = i10;
                    } else if ("Synthetic".equals(readUTF8)) {
                        context.currentMethodAccessFlags |= 4096;
                        i7 = i21;
                        i8 = i3;
                        z2 = true;
                    } else if ("RuntimeInvisibleAnnotations".equals(readUTF8)) {
                        i8 = i20;
                        i7 = i21;
                        i12 = i19;
                        i4 = i8;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(readUTF8)) {
                        i14 = i20;
                        i7 = i21;
                        i8 = i3;
                        i12 = i19;
                        i4 = i14;
                    } else if ("RuntimeVisibleParameterAnnotations".equals(readUTF8)) {
                        i15 = i20;
                        i7 = i21;
                        i8 = i3;
                        i12 = i19;
                        i4 = i15;
                    } else if ("RuntimeInvisibleParameterAnnotations".equals(readUTF8)) {
                        i16 = i20;
                        i7 = i21;
                        i8 = i3;
                        i12 = i19;
                        i4 = i16;
                    } else if ("MethodParameters".equals(readUTF8)) {
                        i11 = i20;
                        i7 = i21;
                        i8 = i3;
                        i12 = i19;
                        i4 = i11;
                    } else {
                        i4 = i20;
                        Attribute readAttribute = readAttribute(context.attributePrototypes, readUTF8, i20, readInt, cArr, -1, null);
                        readAttribute.nextAttribute = attribute;
                        attribute = readAttribute;
                        i12 = i19;
                        i7 = i21;
                        i8 = i3;
                        i9 = i9;
                        i10 = i10;
                        i11 = i11;
                    }
                }
                i6 = i4 + readInt;
                readUnsignedShort = i18;
            } else if ((context.parsingOptions & 1) == 0) {
                i17 = i20;
                i7 = i21;
                i12 = i19;
                i4 = i17;
                i6 = i4 + readInt;
                readUnsignedShort = i18;
            } else {
                i3 = i8;
                i7 = i21;
                i8 = i3;
            }
            i4 = i20;
            i12 = i19;
            i6 = i4 + readInt;
            readUnsignedShort = i18;
        }
        int i25 = i7;
        int i26 = i8;
        int i27 = i9;
        int i28 = i10;
        int i29 = i11;
        int i30 = i12;
        MethodVisitor visitMethod = classVisitor.visitMethod(context.currentMethodAccessFlags, context.currentMethodName, context.currentMethodDescriptor, i30 == 0 ? null : readUtf(i30, cArr), strArr);
        if (visitMethod == null) {
            return i6;
        }
        if (visitMethod instanceof MethodWriter) {
            MethodWriter methodWriter = (MethodWriter) visitMethod;
            if (methodWriter.canCopyMethodAttributes(this, z2, (context.currentMethodAccessFlags & Opcodes.ACC_DEPRECATED) != 0, readUnsignedShort(i5), i30, i13)) {
                methodWriter.setMethodAttributesSource(i2, i6 - i2);
                return i6;
            }
        }
        if (i29 != 0 && (context.parsingOptions & 2) == 0) {
            int readByte = readByte(i29);
            int i31 = i29 + 1;
            while (true) {
                int i32 = readByte - 1;
                if (readByte <= 0) {
                    break;
                }
                visitMethod.visitParameter(readUTF8(i31, cArr), readUnsignedShort(i31 + 2));
                i31 += 4;
                readByte = i32;
            }
        }
        if (i28 != 0) {
            AnnotationVisitor visitAnnotationDefault = visitMethod.visitAnnotationDefault();
            readElementValue(visitAnnotationDefault, i28, null, cArr);
            if (visitAnnotationDefault != null) {
                visitAnnotationDefault.visitEnd();
            }
        }
        if (i27 != 0) {
            int readUnsignedShort3 = readUnsignedShort(i27);
            int i33 = i27 + 2;
            while (true) {
                int i34 = readUnsignedShort3 - 1;
                if (readUnsignedShort3 <= 0) {
                    break;
                }
                i33 = readElementValues(visitMethod.visitAnnotation(readUTF8(i33, cArr), true), i33 + 2, true, cArr);
                readUnsignedShort3 = i34;
            }
        }
        if (i26 != 0) {
            int readUnsignedShort4 = readUnsignedShort(i26);
            int i35 = i26 + 2;
            while (true) {
                int i36 = readUnsignedShort4 - 1;
                if (readUnsignedShort4 <= 0) {
                    break;
                }
                i35 = readElementValues(visitMethod.visitAnnotation(readUTF8(i35, cArr), false), i35 + 2, true, cArr);
                readUnsignedShort4 = i36;
            }
        }
        if (i25 != 0) {
            int readUnsignedShort5 = readUnsignedShort(i25);
            int i37 = i25 + 2;
            while (true) {
                int i38 = readUnsignedShort5 - 1;
                if (readUnsignedShort5 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget = readTypeAnnotationTarget(context, i37);
                i37 = readElementValues(visitMethod.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget, cArr), true), readTypeAnnotationTarget + 2, true, cArr);
                readUnsignedShort5 = i38;
            }
        }
        int i39 = i14;
        if (i39 != 0) {
            int readUnsignedShort6 = readUnsignedShort(i39);
            int i40 = i39 + 2;
            while (true) {
                int i41 = readUnsignedShort6 - 1;
                if (readUnsignedShort6 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget2 = readTypeAnnotationTarget(context, i40);
                i40 = readElementValues(visitMethod.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget2, cArr), false), readTypeAnnotationTarget2 + 2, true, cArr);
                readUnsignedShort6 = i41;
            }
        }
        int i42 = i15;
        if (i42 != 0) {
            readParameterAnnotations(visitMethod, context, i42, true);
        }
        int i43 = i16;
        if (i43 != 0) {
            readParameterAnnotations(visitMethod, context, i43, false);
        }
        while (attribute != null) {
            Attribute attribute2 = attribute.nextAttribute;
            attribute.nextAttribute = null;
            visitMethod.visitAttribute(attribute);
            attribute = attribute2;
        }
        int i44 = i17;
        if (i44 != 0) {
            visitMethod.visitCode();
            readCode(visitMethod, context, i44);
        }
        visitMethod.visitEnd();
        return i6;
    }

    private void readModuleAttributes(ClassVisitor classVisitor, Context context, int i2, int i3, String str) {
        String[] strArr;
        char[] cArr = context.charBuffer;
        int i4 = i2 + 6;
        ModuleVisitor visitModule = classVisitor.visitModule(readModule(i2, cArr), readUnsignedShort(i2 + 2), readUTF8(i2 + 4, cArr));
        if (visitModule == null) {
            return;
        }
        if (str != null) {
            visitModule.visitMainClass(str);
        }
        if (i3 != 0) {
            int readUnsignedShort = readUnsignedShort(i3);
            int i5 = i3 + 2;
            while (true) {
                int i6 = readUnsignedShort - 1;
                if (readUnsignedShort <= 0) {
                    break;
                }
                visitModule.visitPackage(readPackage(i5, cArr));
                i5 += 2;
                readUnsignedShort = i6;
            }
        }
        int readUnsignedShort2 = readUnsignedShort(i4);
        int i7 = i2 + 8;
        while (true) {
            int i8 = readUnsignedShort2 - 1;
            if (readUnsignedShort2 <= 0) {
                break;
            }
            String readModule = readModule(i7, cArr);
            int readUnsignedShort3 = readUnsignedShort(i7 + 2);
            String readUTF8 = readUTF8(i7 + 4, cArr);
            i7 += 6;
            visitModule.visitRequire(readModule, readUnsignedShort3, readUTF8);
            readUnsignedShort2 = i8;
        }
        int readUnsignedShort4 = readUnsignedShort(i7);
        int i9 = i7 + 2;
        while (true) {
            int i10 = readUnsignedShort4 - 1;
            String[] strArr2 = null;
            if (readUnsignedShort4 <= 0) {
                break;
            }
            String readPackage = readPackage(i9, cArr);
            int readUnsignedShort5 = readUnsignedShort(i9 + 2);
            int readUnsignedShort6 = readUnsignedShort(i9 + 4);
            i9 += 6;
            if (readUnsignedShort6 != 0) {
                strArr2 = new String[readUnsignedShort6];
                for (int i11 = 0; i11 < readUnsignedShort6; i11++) {
                    strArr2[i11] = readModule(i9, cArr);
                    i9 += 2;
                }
            }
            visitModule.visitExport(readPackage, readUnsignedShort5, strArr2);
            readUnsignedShort4 = i10;
        }
        int readUnsignedShort7 = readUnsignedShort(i9);
        int i12 = i9 + 2;
        while (true) {
            int i13 = readUnsignedShort7 - 1;
            if (readUnsignedShort7 <= 0) {
                break;
            }
            String readPackage2 = readPackage(i12, cArr);
            int readUnsignedShort8 = readUnsignedShort(i12 + 2);
            int readUnsignedShort9 = readUnsignedShort(i12 + 4);
            i12 += 6;
            if (readUnsignedShort9 != 0) {
                strArr = new String[readUnsignedShort9];
                for (int i14 = 0; i14 < readUnsignedShort9; i14++) {
                    strArr[i14] = readModule(i12, cArr);
                    i12 += 2;
                }
            } else {
                strArr = null;
            }
            visitModule.visitOpen(readPackage2, readUnsignedShort8, strArr);
            readUnsignedShort7 = i13;
        }
        int readUnsignedShort10 = readUnsignedShort(i12);
        int i15 = i12 + 2;
        while (true) {
            int i16 = readUnsignedShort10 - 1;
            if (readUnsignedShort10 <= 0) {
                break;
            }
            visitModule.visitUse(readClass(i15, cArr));
            i15 += 2;
            readUnsignedShort10 = i16;
        }
        int readUnsignedShort11 = readUnsignedShort(i15);
        int i17 = i15 + 2;
        while (true) {
            int i18 = readUnsignedShort11 - 1;
            if (readUnsignedShort11 <= 0) {
                visitModule.visitEnd();
                return;
            }
            String readClass = readClass(i17, cArr);
            int readUnsignedShort12 = readUnsignedShort(i17 + 2);
            i17 += 4;
            String[] strArr3 = new String[readUnsignedShort12];
            for (int i19 = 0; i19 < readUnsignedShort12; i19++) {
                strArr3[i19] = readClass(i17, cArr);
                i17 += 2;
            }
            visitModule.visitProvide(readClass, strArr3);
            readUnsignedShort11 = i18;
        }
    }

    private void readParameterAnnotations(MethodVisitor methodVisitor, Context context, int i2, boolean z2) {
        int i3 = i2 + 1;
        int i4 = this.classFileBuffer[i2] & UnsignedBytes.MAX_VALUE;
        methodVisitor.visitAnnotableParameterCount(i4, z2);
        char[] cArr = context.charBuffer;
        for (int i5 = 0; i5 < i4; i5++) {
            int readUnsignedShort = readUnsignedShort(i3);
            i3 += 2;
            while (true) {
                int i6 = readUnsignedShort - 1;
                if (readUnsignedShort > 0) {
                    i3 = readElementValues(methodVisitor.visitParameterAnnotation(i5, readUTF8(i3, cArr), z2), i3 + 2, true, cArr);
                    readUnsignedShort = i6;
                }
            }
        }
    }

    private int readRecordComponent(ClassVisitor classVisitor, Context context, int i2) {
        int i3;
        Context context2 = context;
        char[] cArr = context2.charBuffer;
        String readUTF8 = readUTF8(i2, cArr);
        String readUTF82 = readUTF8(i2 + 2, cArr);
        int readUnsignedShort = readUnsignedShort(i2 + 4);
        int i4 = i2 + 6;
        int i5 = 0;
        Attribute attribute = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        String str = null;
        while (true) {
            int i9 = readUnsignedShort - 1;
            if (readUnsignedShort <= 0) {
                break;
            }
            String readUTF83 = readUTF8(i4, cArr);
            int readInt = readInt(i4 + 2);
            int i10 = i4 + 6;
            if ("Signature".equals(readUTF83)) {
                str = readUTF8(i10, cArr);
                i3 = i10;
            } else if ("RuntimeVisibleAnnotations".equals(readUTF83)) {
                i8 = i10;
                i3 = i8;
            } else if ("RuntimeVisibleTypeAnnotations".equals(readUTF83)) {
                i6 = i10;
                i3 = i6;
            } else if ("RuntimeInvisibleAnnotations".equals(readUTF83)) {
                i7 = i10;
                i3 = i7;
            } else if ("RuntimeInvisibleTypeAnnotations".equals(readUTF83)) {
                i5 = i10;
                i3 = i5;
            } else {
                i3 = i10;
                Attribute attribute2 = attribute;
                attribute = readAttribute(context2.attributePrototypes, readUTF83, i3, readInt, cArr, -1, null);
                attribute.nextAttribute = attribute2;
                i8 = i8;
                i7 = i7;
                i6 = i6;
                i5 = i5;
            }
            i4 = i3 + readInt;
            context2 = context;
            readUnsignedShort = i9;
        }
        int i11 = i5;
        Attribute attribute3 = attribute;
        int i12 = i6;
        int i13 = i7;
        int i14 = i8;
        RecordComponentVisitor visitRecordComponent = classVisitor.visitRecordComponent(readUTF8, readUTF82, str);
        if (visitRecordComponent == null) {
            return i4;
        }
        if (i14 != 0) {
            int readUnsignedShort2 = readUnsignedShort(i14);
            int i15 = i14 + 2;
            while (true) {
                int i16 = readUnsignedShort2 - 1;
                if (readUnsignedShort2 <= 0) {
                    break;
                }
                i15 = readElementValues(visitRecordComponent.visitAnnotation(readUTF8(i15, cArr), true), i15 + 2, true, cArr);
                readUnsignedShort2 = i16;
            }
        }
        if (i13 != 0) {
            int readUnsignedShort3 = readUnsignedShort(i13);
            int i17 = i13 + 2;
            while (true) {
                int i18 = readUnsignedShort3 - 1;
                if (readUnsignedShort3 <= 0) {
                    break;
                }
                i17 = readElementValues(visitRecordComponent.visitAnnotation(readUTF8(i17, cArr), false), i17 + 2, true, cArr);
                readUnsignedShort3 = i18;
            }
        }
        if (i12 != 0) {
            int readUnsignedShort4 = readUnsignedShort(i12);
            int i19 = i12 + 2;
            while (true) {
                int i20 = readUnsignedShort4 - 1;
                if (readUnsignedShort4 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget = readTypeAnnotationTarget(context, i19);
                i19 = readElementValues(visitRecordComponent.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget, cArr), true), readTypeAnnotationTarget + 2, true, cArr);
                readUnsignedShort4 = i20;
            }
        }
        if (i11 != 0) {
            int readUnsignedShort5 = readUnsignedShort(i11);
            int i21 = i11 + 2;
            while (true) {
                int i22 = readUnsignedShort5 - 1;
                if (readUnsignedShort5 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget2 = readTypeAnnotationTarget(context, i21);
                i21 = readElementValues(visitRecordComponent.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget2, cArr), false), readTypeAnnotationTarget2 + 2, true, cArr);
                readUnsignedShort5 = i22;
            }
        }
        Attribute attribute4 = attribute3;
        while (attribute4 != null) {
            Attribute attribute5 = attribute4.nextAttribute;
            attribute4.nextAttribute = null;
            visitRecordComponent.visitAttribute(attribute4);
            attribute4 = attribute5;
        }
        visitRecordComponent.visitEnd();
        return i4;
    }

    private int readStackMapFrame(int i2, boolean z2, boolean z3, Context context) {
        int i3;
        int i4;
        char[] cArr = context.charBuffer;
        Label[] labelArr = context.currentMethodLabels;
        if (z2) {
            i3 = i2 + 1;
            i4 = this.classFileBuffer[i2] & UnsignedBytes.MAX_VALUE;
        } else {
            context.currentFrameOffset = -1;
            i3 = i2;
            i4 = 255;
        }
        context.currentFrameLocalCountDelta = 0;
        if (i4 < 64) {
            context.currentFrameType = 3;
            context.currentFrameStackCount = 0;
        } else if (i4 < 128) {
            i4 -= 64;
            i3 = readVerificationTypeInfo(i3, context.currentFrameStackTypes, 0, cArr, labelArr);
            context.currentFrameType = 4;
            context.currentFrameStackCount = 1;
        } else {
            if (i4 < 247) {
                throw new IllegalArgumentException();
            }
            int readUnsignedShort = readUnsignedShort(i3);
            int i5 = i3 + 2;
            if (i4 == 247) {
                i3 = readVerificationTypeInfo(i5, context.currentFrameStackTypes, 0, cArr, labelArr);
                context.currentFrameType = 4;
                context.currentFrameStackCount = 1;
            } else {
                if (i4 >= 248 && i4 < 251) {
                    context.currentFrameType = 2;
                    int i6 = 251 - i4;
                    context.currentFrameLocalCountDelta = i6;
                    context.currentFrameLocalCount -= i6;
                    context.currentFrameStackCount = 0;
                } else if (i4 == 251) {
                    context.currentFrameType = 3;
                    context.currentFrameStackCount = 0;
                } else if (i4 < 255) {
                    int i7 = i4 - 251;
                    int i8 = z3 ? context.currentFrameLocalCount : 0;
                    i3 = i5;
                    int i9 = i7;
                    while (i9 > 0) {
                        i3 = readVerificationTypeInfo(i3, context.currentFrameLocalTypes, i8, cArr, labelArr);
                        i9--;
                        i8++;
                    }
                    context.currentFrameType = 1;
                    context.currentFrameLocalCountDelta = i7;
                    context.currentFrameLocalCount += i7;
                    context.currentFrameStackCount = 0;
                } else {
                    int readUnsignedShort2 = readUnsignedShort(i5);
                    int i10 = i3 + 4;
                    context.currentFrameType = 0;
                    context.currentFrameLocalCountDelta = readUnsignedShort2;
                    context.currentFrameLocalCount = readUnsignedShort2;
                    for (int i11 = 0; i11 < readUnsignedShort2; i11++) {
                        i10 = readVerificationTypeInfo(i10, context.currentFrameLocalTypes, i11, cArr, labelArr);
                    }
                    int readUnsignedShort3 = readUnsignedShort(i10);
                    i3 = i10 + 2;
                    context.currentFrameStackCount = readUnsignedShort3;
                    for (int i12 = 0; i12 < readUnsignedShort3; i12++) {
                        i3 = readVerificationTypeInfo(i3, context.currentFrameStackTypes, i12, cArr, labelArr);
                    }
                }
                i3 = i5;
            }
            i4 = readUnsignedShort;
        }
        int i13 = i4 + 1 + context.currentFrameOffset;
        context.currentFrameOffset = i13;
        createLabel(i13, labelArr);
        return i3;
    }

    private static byte[] readStream(InputStream inputStream, boolean z2) throws IOException {
        if (inputStream == null) {
            throw new IOException("Class not found");
        }
        int calculateBufferSize = calculateBufferSize(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[calculateBufferSize];
                int i2 = 0;
                while (true) {
                    int read = inputStream.read(bArr, 0, calculateBufferSize);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                    i2++;
                }
                byteArrayOutputStream.flush();
                if (i2 == 1) {
                    byteArrayOutputStream.close();
                    return bArr;
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                if (z2) {
                    inputStream.close();
                }
                return byteArray;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } finally {
            if (z2) {
                inputStream.close();
            }
        }
    }

    private String readStringish(int i2, char[] cArr) {
        return readUTF8(this.cpInfoOffsets[readUnsignedShort(i2)], cArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int readTypeAnnotationTarget(org.objectweb.asm.Context r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.readInt(r11)
            int r1 = r0 >>> 24
            r2 = 1
            if (r1 == 0) goto L70
            if (r1 == r2) goto L70
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            switch(r1) {
                case 16: goto L6d;
                case 17: goto L6d;
                case 18: goto L6d;
                case 19: goto L6a;
                case 20: goto L6a;
                case 21: goto L6a;
                case 22: goto L70;
                case 23: goto L6d;
                default: goto L10;
            }
        L10:
            switch(r1) {
                case 64: goto L24;
                case 65: goto L24;
                case 66: goto L6d;
                case 67: goto L20;
                case 68: goto L20;
                case 69: goto L20;
                case 70: goto L20;
                case 71: goto L19;
                case 72: goto L19;
                case 73: goto L19;
                case 74: goto L19;
                case 75: goto L19;
                default: goto L13;
            }
        L13:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
        L19:
            r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r0 = r0 & r1
            int r11 = r11 + 4
            goto L75
        L20:
            r0 = r0 & r3
        L21:
            int r11 = r11 + 3
            goto L75
        L24:
            r0 = r0 & r3
            int r1 = r11 + 1
            int r1 = r9.readUnsignedShort(r1)
            int r11 = r11 + 3
            org.objectweb.asm.Label[] r3 = new org.objectweb.asm.Label[r1]
            r10.currentLocalVariableAnnotationRangeStarts = r3
            org.objectweb.asm.Label[] r3 = new org.objectweb.asm.Label[r1]
            r10.currentLocalVariableAnnotationRangeEnds = r3
            int[] r3 = new int[r1]
            r10.currentLocalVariableAnnotationRangeIndices = r3
            r3 = 0
        L3a:
            if (r3 >= r1) goto L75
            int r4 = r9.readUnsignedShort(r11)
            int r5 = r11 + 2
            int r5 = r9.readUnsignedShort(r5)
            int r6 = r11 + 4
            int r6 = r9.readUnsignedShort(r6)
            int r11 = r11 + 6
            org.objectweb.asm.Label[] r7 = r10.currentLocalVariableAnnotationRangeStarts
            org.objectweb.asm.Label[] r8 = r10.currentMethodLabels
            org.objectweb.asm.Label r8 = r9.createLabel(r4, r8)
            r7[r3] = r8
            org.objectweb.asm.Label[] r7 = r10.currentLocalVariableAnnotationRangeEnds
            int r4 = r4 + r5
            org.objectweb.asm.Label[] r5 = r10.currentMethodLabels
            org.objectweb.asm.Label r4 = r9.createLabel(r4, r5)
            r7[r3] = r4
            int[] r4 = r10.currentLocalVariableAnnotationRangeIndices
            r4[r3] = r6
            int r3 = r3 + 1
            goto L3a
        L6a:
            r0 = r0 & r3
            int r11 = r11 + r2
            goto L75
        L6d:
            r0 = r0 & (-256(0xffffffffffffff00, float:NaN))
            goto L21
        L70:
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r1
            int r11 = r11 + 2
        L75:
            r10.currentTypeAnnotationTarget = r0
            int r0 = r9.readByte(r11)
            if (r0 != 0) goto L7f
            r1 = 0
            goto L86
        L7f:
            org.objectweb.asm.TypePath r1 = new org.objectweb.asm.TypePath
            byte[] r3 = r9.classFileBuffer
            r1.<init>(r3, r11)
        L86:
            r10.currentTypeAnnotationTargetPath = r1
            int r11 = r11 + r2
            int r0 = r0 * 2
            int r0 = r0 + r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.ClassReader.readTypeAnnotationTarget(org.objectweb.asm.Context, int):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int[] readTypeAnnotations(org.objectweb.asm.MethodVisitor r11, org.objectweb.asm.Context r12, int r13, boolean r14) {
        /*
            r10 = this;
            char[] r0 = r12.charBuffer
            int r1 = r10.readUnsignedShort(r13)
            int[] r2 = new int[r1]
            int r13 = r13 + 2
            r3 = 0
        Lb:
            if (r3 >= r1) goto L86
            r2[r3] = r13
            int r4 = r10.readInt(r13)
            int r5 = r4 >>> 24
            r6 = 23
            if (r5 == r6) goto L4d
            switch(r5) {
                case 16: goto L4d;
                case 17: goto L4d;
                case 18: goto L4d;
                default: goto L1c;
            }
        L1c:
            switch(r5) {
                case 64: goto L28;
                case 65: goto L28;
                case 66: goto L4d;
                case 67: goto L4d;
                case 68: goto L4d;
                case 69: goto L4d;
                case 70: goto L4d;
                case 71: goto L25;
                case 72: goto L25;
                case 73: goto L25;
                case 74: goto L25;
                case 75: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
        L25:
            int r13 = r13 + 4
            goto L4f
        L28:
            int r6 = r13 + 1
            int r6 = r10.readUnsignedShort(r6)
            int r13 = r13 + 3
        L30:
            int r7 = r6 + (-1)
            if (r6 <= 0) goto L4f
            int r6 = r10.readUnsignedShort(r13)
            int r8 = r13 + 2
            int r8 = r10.readUnsignedShort(r8)
            int r13 = r13 + 6
            org.objectweb.asm.Label[] r9 = r12.currentMethodLabels
            r10.createLabel(r6, r9)
            int r6 = r6 + r8
            org.objectweb.asm.Label[] r8 = r12.currentMethodLabels
            r10.createLabel(r6, r8)
            r6 = r7
            goto L30
        L4d:
            int r13 = r13 + 3
        L4f:
            int r6 = r10.readByte(r13)
            r7 = 66
            r8 = 0
            r9 = 1
            if (r5 != r7) goto L79
            if (r6 != 0) goto L5c
            goto L63
        L5c:
            org.objectweb.asm.TypePath r8 = new org.objectweb.asm.TypePath
            byte[] r5 = r10.classFileBuffer
            r8.<init>(r5, r13)
        L63:
            r5 = 2
            int r13 = androidx.compose.foundation.text.input.a.a(r6, r5, r9, r13)
            java.lang.String r5 = r10.readUTF8(r13, r0)
            int r13 = r13 + 2
            r4 = r4 & (-256(0xffffffffffffff00, float:NaN))
            org.objectweb.asm.AnnotationVisitor r4 = r11.visitTryCatchAnnotation(r4, r8, r5, r14)
            int r13 = r10.readElementValues(r4, r13, r9, r0)
            goto L83
        L79:
            r4 = 2
            r5 = 3
            int r13 = androidx.compose.foundation.text.input.a.a(r6, r4, r5, r13)
            int r13 = r10.readElementValues(r8, r13, r9, r0)
        L83:
            int r3 = r3 + 1
            goto Lb
        L86:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.ClassReader.readTypeAnnotations(org.objectweb.asm.MethodVisitor, org.objectweb.asm.Context, int, boolean):int[]");
    }

    private int readVerificationTypeInfo(int i2, Object[] objArr, int i3, char[] cArr, Label[] labelArr) {
        int i4 = i2 + 1;
        switch (this.classFileBuffer[i2] & UnsignedBytes.MAX_VALUE) {
            case 0:
                objArr[i3] = Opcodes.TOP;
                return i4;
            case 1:
                objArr[i3] = Opcodes.INTEGER;
                return i4;
            case 2:
                objArr[i3] = Opcodes.FLOAT;
                return i4;
            case 3:
                objArr[i3] = Opcodes.DOUBLE;
                return i4;
            case 4:
                objArr[i3] = Opcodes.LONG;
                return i4;
            case 5:
                objArr[i3] = Opcodes.NULL;
                return i4;
            case 6:
                objArr[i3] = Opcodes.UNINITIALIZED_THIS;
                return i4;
            case 7:
                objArr[i3] = readClass(i4, cArr);
                break;
            case 8:
                objArr[i3] = createLabel(readUnsignedShort(i4), labelArr);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return i2 + 3;
    }

    public void accept(ClassVisitor classVisitor, int i2) {
        accept(classVisitor, new Attribute[0], i2);
    }

    public int getAccess() {
        return readUnsignedShort(this.header);
    }

    public String getClassName() {
        return readClass(this.header + 2, new char[this.maxStringLength]);
    }

    public final int getFirstAttributeOffset() {
        int i2 = this.header;
        int readUnsignedShort = (readUnsignedShort(i2 + 6) * 2) + i2 + 8;
        int readUnsignedShort2 = readUnsignedShort(readUnsignedShort);
        int i3 = readUnsignedShort + 2;
        while (true) {
            int i4 = readUnsignedShort2 - 1;
            if (readUnsignedShort2 <= 0) {
                break;
            }
            int readUnsignedShort3 = readUnsignedShort(i3 + 6);
            i3 += 8;
            while (true) {
                int i5 = readUnsignedShort3 - 1;
                if (readUnsignedShort3 > 0) {
                    i3 += readInt(i3 + 2) + 6;
                    readUnsignedShort3 = i5;
                }
            }
            readUnsignedShort2 = i4;
        }
        int readUnsignedShort4 = readUnsignedShort(i3);
        int i6 = i3 + 2;
        while (true) {
            int i7 = readUnsignedShort4 - 1;
            if (readUnsignedShort4 <= 0) {
                return i6 + 2;
            }
            int readUnsignedShort5 = readUnsignedShort(i6 + 6);
            i6 += 8;
            while (true) {
                int i8 = readUnsignedShort5 - 1;
                if (readUnsignedShort5 > 0) {
                    i6 += readInt(i6 + 2) + 6;
                    readUnsignedShort5 = i8;
                }
            }
            readUnsignedShort4 = i7;
        }
    }

    public String[] getInterfaces() {
        int i2 = this.header + 6;
        int readUnsignedShort = readUnsignedShort(i2);
        String[] strArr = new String[readUnsignedShort];
        if (readUnsignedShort > 0) {
            char[] cArr = new char[this.maxStringLength];
            for (int i3 = 0; i3 < readUnsignedShort; i3++) {
                i2 += 2;
                strArr[i3] = readClass(i2, cArr);
            }
        }
        return strArr;
    }

    public int getItem(int i2) {
        return this.cpInfoOffsets[i2];
    }

    public int getItemCount() {
        return this.cpInfoOffsets.length;
    }

    public int getMaxStringLength() {
        return this.maxStringLength;
    }

    public String getSuperName() {
        return readClass(this.header + 4, new char[this.maxStringLength]);
    }

    public int readByte(int i2) {
        return this.classFileBuffer[i2] & UnsignedBytes.MAX_VALUE;
    }

    public String readClass(int i2, char[] cArr) {
        return readStringish(i2, cArr);
    }

    public Object readConst(int i2, char[] cArr) {
        int i3 = this.cpInfoOffsets[i2];
        byte b2 = this.classFileBuffer[i3 - 1];
        switch (b2) {
            case 3:
                return Integer.valueOf(readInt(i3));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(readInt(i3)));
            case 5:
                return Long.valueOf(readLong(i3));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(readLong(i3)));
            case 7:
                return Type.getObjectType(readUTF8(i3, cArr));
            case 8:
                return readUTF8(i3, cArr);
            default:
                switch (b2) {
                    case 15:
                        int readByte = readByte(i3);
                        int i4 = this.cpInfoOffsets[readUnsignedShort(i3 + 1)];
                        int i5 = this.cpInfoOffsets[readUnsignedShort(i4 + 2)];
                        return new Handle(readByte, readClass(i4, cArr), readUTF8(i5, cArr), readUTF8(i5 + 2, cArr), this.classFileBuffer[i4 - 1] == 11);
                    case 16:
                        return Type.getMethodType(readUTF8(i3, cArr));
                    case 17:
                        return readConstantDynamic(i2, cArr);
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public int readInt(int i2) {
        byte[] bArr = this.classFileBuffer;
        return (bArr[i2 + 3] & UnsignedBytes.MAX_VALUE) | ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i2 + 2] & UnsignedBytes.MAX_VALUE) << 8);
    }

    public Label readLabel(int i2, Label[] labelArr) {
        if (labelArr[i2] == null) {
            labelArr[i2] = new Label();
        }
        return labelArr[i2];
    }

    public long readLong(int i2) {
        return (readInt(i2) << 32) | (readInt(i2 + 4) & 4294967295L);
    }

    public String readModule(int i2, char[] cArr) {
        return readStringish(i2, cArr);
    }

    public String readPackage(int i2, char[] cArr) {
        return readStringish(i2, cArr);
    }

    public short readShort(int i2) {
        byte[] bArr = this.classFileBuffer;
        return (short) ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) | ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 8));
    }

    public String readUTF8(int i2, char[] cArr) {
        int readUnsignedShort = readUnsignedShort(i2);
        if (i2 == 0 || readUnsignedShort == 0) {
            return null;
        }
        return readUtf(readUnsignedShort, cArr);
    }

    public int readUnsignedShort(int i2) {
        byte[] bArr = this.classFileBuffer;
        return (bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) | ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 8);
    }

    public final String readUtf(int i2, char[] cArr) {
        String[] strArr = this.constantUtf8Values;
        String str = strArr[i2];
        if (str != null) {
            return str;
        }
        int i3 = this.cpInfoOffsets[i2];
        String readUtf = readUtf(i3 + 2, readUnsignedShort(i3), cArr);
        strArr[i2] = readUtf;
        return readUtf;
    }

    public ClassReader(byte[] bArr, int i2, int i3) {
        this(bArr, i2, true);
    }

    public void accept(ClassVisitor classVisitor, Attribute[] attributeArr, int i2) {
        int i3;
        int i4;
        int i5;
        String[] strArr;
        Context context = new Context();
        context.attributePrototypes = attributeArr;
        context.parsingOptions = i2;
        char[] cArr = new char[this.maxStringLength];
        context.charBuffer = cArr;
        int i6 = this.header;
        int readUnsignedShort = readUnsignedShort(i6);
        String readClass = readClass(i6 + 2, cArr);
        String readClass2 = readClass(i6 + 4, cArr);
        int readUnsignedShort2 = readUnsignedShort(i6 + 6);
        String[] strArr2 = new String[readUnsignedShort2];
        int i7 = i6 + 8;
        for (int i8 = 0; i8 < readUnsignedShort2; i8++) {
            strArr2[i8] = readClass(i7, cArr);
            i7 += 2;
        }
        int firstAttributeOffset = getFirstAttributeOffset();
        int i9 = readUnsignedShort;
        int readUnsignedShort3 = readUnsignedShort(firstAttributeOffset - 2);
        String str = null;
        String str2 = null;
        int i10 = 0;
        String str3 = null;
        int i11 = 0;
        String str4 = null;
        String str5 = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        Attribute attribute = null;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (readUnsignedShort3 > 0) {
            String readUTF8 = readUTF8(firstAttributeOffset, cArr);
            int readInt = readInt(firstAttributeOffset + 2);
            int i21 = firstAttributeOffset + 6;
            String str6 = str;
            if ("SourceFile".equals(readUTF8)) {
                i3 = i21;
                str2 = readUTF8(i21, cArr);
            } else if ("InnerClasses".equals(readUTF8)) {
                i19 = i21;
                i3 = i19;
            } else if ("EnclosingMethod".equals(readUTF8)) {
                i12 = i21;
                i3 = i12;
            } else if ("NestHost".equals(readUTF8)) {
                i3 = i21;
                str5 = readClass(i21, cArr);
            } else if ("NestMembers".equals(readUTF8)) {
                i17 = i21;
                i3 = i17;
            } else if ("PermittedSubclasses".equals(readUTF8)) {
                i18 = i21;
                i3 = i18;
            } else {
                if ("Signature".equals(readUTF8)) {
                    str3 = readUTF8(i21, cArr);
                } else if ("RuntimeVisibleAnnotations".equals(readUTF8)) {
                    i13 = i21;
                    i3 = i13;
                } else if ("RuntimeVisibleTypeAnnotations".equals(readUTF8)) {
                    i15 = i21;
                    i3 = i15;
                } else if ("Deprecated".equals(readUTF8)) {
                    i9 |= Opcodes.ACC_DEPRECATED;
                } else if ("Synthetic".equals(readUTF8)) {
                    i9 |= 4096;
                } else if ("SourceDebugExtension".equals(readUTF8)) {
                    if (readInt <= this.classFileBuffer.length - i21) {
                        str = readUtf(i21, readInt, new char[readInt]);
                        i3 = i21;
                        i4 = i7;
                        i5 = readInt;
                        strArr = strArr2;
                        firstAttributeOffset = i3 + i5;
                        readUnsignedShort3--;
                        strArr2 = strArr;
                        i7 = i4;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else if ("RuntimeInvisibleAnnotations".equals(readUTF8)) {
                    i14 = i21;
                    i3 = i14;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(readUTF8)) {
                    i16 = i21;
                    i3 = i16;
                } else if ("Record".equals(readUTF8)) {
                    i9 |= 65536;
                    i20 = i21;
                    i3 = i20;
                } else if ("Module".equals(readUTF8)) {
                    i10 = i21;
                    i3 = i10;
                } else if ("ModuleMainClass".equals(readUTF8)) {
                    str4 = readClass(i21, cArr);
                } else if ("ModulePackages".equals(readUTF8)) {
                    i11 = i21;
                    i3 = i11;
                } else {
                    if ("BootstrapMethods".equals(readUTF8)) {
                        i3 = i21;
                        i4 = i7;
                        i5 = readInt;
                        strArr = strArr2;
                        str = str6;
                    } else {
                        i3 = i21;
                        i4 = i7;
                        i5 = readInt;
                        strArr = strArr2;
                        Attribute readAttribute = readAttribute(attributeArr, readUTF8, i3, readInt, cArr, -1, null);
                        readAttribute.nextAttribute = attribute;
                        attribute = readAttribute;
                        i9 = i9;
                        str = str6;
                        str2 = str2;
                    }
                    firstAttributeOffset = i3 + i5;
                    readUnsignedShort3--;
                    strArr2 = strArr;
                    i7 = i4;
                }
                i3 = i21;
            }
            i4 = i7;
            i5 = readInt;
            strArr = strArr2;
            str = str6;
            firstAttributeOffset = i3 + i5;
            readUnsignedShort3--;
            strArr2 = strArr;
            i7 = i4;
        }
        String str7 = str;
        String str8 = str2;
        int i22 = i7;
        String[] strArr3 = strArr2;
        Attribute attribute2 = attribute;
        classVisitor.visit(readInt(this.cpInfoOffsets[1] - 7), i9, readClass, str3, readClass2, strArr3);
        if ((i2 & 2) == 0 && (str8 != null || str7 != null)) {
            classVisitor.visitSource(str8, str7);
        }
        if (i10 != 0) {
            readModuleAttributes(classVisitor, context, i10, i11, str4);
        }
        String str9 = str5;
        if (str9 != null) {
            classVisitor.visitNestHost(str9);
        }
        int i23 = i12;
        if (i23 != 0) {
            String readClass3 = readClass(i23, cArr);
            int readUnsignedShort4 = readUnsignedShort(i23 + 2);
            classVisitor.visitOuterClass(readClass3, readUnsignedShort4 == 0 ? null : readUTF8(this.cpInfoOffsets[readUnsignedShort4], cArr), readUnsignedShort4 == 0 ? null : readUTF8(this.cpInfoOffsets[readUnsignedShort4] + 2, cArr));
        }
        int i24 = i13;
        if (i24 != 0) {
            int readUnsignedShort5 = readUnsignedShort(i24);
            int i25 = i24 + 2;
            while (true) {
                int i26 = readUnsignedShort5 - 1;
                if (readUnsignedShort5 <= 0) {
                    break;
                }
                i25 = readElementValues(classVisitor.visitAnnotation(readUTF8(i25, cArr), true), i25 + 2, true, cArr);
                readUnsignedShort5 = i26;
            }
        }
        int i27 = i14;
        if (i27 != 0) {
            int readUnsignedShort6 = readUnsignedShort(i27);
            int i28 = i27 + 2;
            while (true) {
                int i29 = readUnsignedShort6 - 1;
                if (readUnsignedShort6 <= 0) {
                    break;
                }
                i28 = readElementValues(classVisitor.visitAnnotation(readUTF8(i28, cArr), false), i28 + 2, true, cArr);
                readUnsignedShort6 = i29;
            }
        }
        int i30 = i15;
        if (i30 != 0) {
            int readUnsignedShort7 = readUnsignedShort(i30);
            int i31 = i30 + 2;
            while (true) {
                int i32 = readUnsignedShort7 - 1;
                if (readUnsignedShort7 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget = readTypeAnnotationTarget(context, i31);
                i31 = readElementValues(classVisitor.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget, cArr), true), readTypeAnnotationTarget + 2, true, cArr);
                readUnsignedShort7 = i32;
            }
        }
        int i33 = i16;
        if (i33 != 0) {
            int readUnsignedShort8 = readUnsignedShort(i33);
            int i34 = i33 + 2;
            while (true) {
                int i35 = readUnsignedShort8 - 1;
                if (readUnsignedShort8 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget2 = readTypeAnnotationTarget(context, i34);
                i34 = readElementValues(classVisitor.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget2, cArr), false), readTypeAnnotationTarget2 + 2, true, cArr);
                readUnsignedShort8 = i35;
            }
        }
        while (attribute2 != null) {
            Attribute attribute3 = attribute2.nextAttribute;
            attribute2.nextAttribute = null;
            classVisitor.visitAttribute(attribute2);
            attribute2 = attribute3;
        }
        int i36 = i17;
        if (i36 != 0) {
            int readUnsignedShort9 = readUnsignedShort(i36);
            int i37 = i36 + 2;
            while (true) {
                int i38 = readUnsignedShort9 - 1;
                if (readUnsignedShort9 <= 0) {
                    break;
                }
                classVisitor.visitNestMember(readClass(i37, cArr));
                i37 += 2;
                readUnsignedShort9 = i38;
            }
        }
        int i39 = i18;
        if (i39 != 0) {
            int readUnsignedShort10 = readUnsignedShort(i39);
            int i40 = i39 + 2;
            while (true) {
                int i41 = readUnsignedShort10 - 1;
                if (readUnsignedShort10 <= 0) {
                    break;
                }
                classVisitor.visitPermittedSubclass(readClass(i40, cArr));
                i40 += 2;
                readUnsignedShort10 = i41;
            }
        }
        int i42 = i19;
        if (i42 != 0) {
            int readUnsignedShort11 = readUnsignedShort(i42);
            int i43 = i42 + 2;
            while (true) {
                int i44 = readUnsignedShort11 - 1;
                if (readUnsignedShort11 <= 0) {
                    break;
                }
                classVisitor.visitInnerClass(readClass(i43, cArr), readClass(i43 + 2, cArr), readUTF8(i43 + 4, cArr), readUnsignedShort(i43 + 6));
                i43 += 8;
                readUnsignedShort11 = i44;
            }
        }
        int i45 = i20;
        if (i45 != 0) {
            int readUnsignedShort12 = readUnsignedShort(i45);
            int i46 = i45 + 2;
            while (true) {
                int i47 = readUnsignedShort12 - 1;
                if (readUnsignedShort12 <= 0) {
                    break;
                }
                i46 = readRecordComponent(classVisitor, context, i46);
                readUnsignedShort12 = i47;
            }
        }
        int readUnsignedShort13 = readUnsignedShort(i22);
        int i48 = i22 + 2;
        while (true) {
            int i49 = readUnsignedShort13 - 1;
            if (readUnsignedShort13 <= 0) {
                break;
            }
            i48 = readField(classVisitor, context, i48);
            readUnsignedShort13 = i49;
        }
        int readUnsignedShort14 = readUnsignedShort(i48);
        int i50 = i48 + 2;
        while (true) {
            int i51 = readUnsignedShort14 - 1;
            if (readUnsignedShort14 > 0) {
                i50 = readMethod(classVisitor, context, i50);
                readUnsignedShort14 = i51;
            } else {
                classVisitor.visitEnd();
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x004f. Please report as an issue. */
    public ClassReader(byte[] bArr, int i2, boolean z2) {
        this.classFileBuffer = bArr;
        this.f31208b = bArr;
        if (z2) {
            int i3 = i2 + 6;
            if (readShort(i3) > 62) {
                throw new IllegalArgumentException("Unsupported class file major version " + ((int) readShort(i3)));
            }
        }
        int readUnsignedShort = readUnsignedShort(i2 + 8);
        this.cpInfoOffsets = new int[readUnsignedShort];
        this.constantUtf8Values = new String[readUnsignedShort];
        int i4 = i2 + 10;
        int i5 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i6 = 1;
        while (i6 < readUnsignedShort) {
            int i7 = i6 + 1;
            int i8 = i4 + 1;
            this.cpInfoOffsets[i6] = i8;
            int i9 = 3;
            switch (bArr[i4]) {
                case 1:
                    i9 = 3 + readUnsignedShort(i8);
                    if (i9 > i5) {
                        i6 = i7;
                        i5 = i9;
                        i4 += i9;
                    }
                    i6 = i7;
                    i4 += i9;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    i6 = i7;
                    i9 = 5;
                    i4 += i9;
                case 5:
                case 6:
                    i6 += 2;
                    i9 = 9;
                    i4 += i9;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    i6 = i7;
                    i4 += i9;
                case 15:
                    i9 = 4;
                    i6 = i7;
                    i4 += i9;
                case 17:
                    z3 = true;
                    z4 = true;
                    i6 = i7;
                    i9 = 5;
                    i4 += i9;
                case 18:
                    z4 = true;
                    i6 = i7;
                    i9 = 5;
                    i4 += i9;
            }
        }
        this.maxStringLength = i5;
        this.header = i4;
        this.constantDynamicValues = z3 ? new ConstantDynamic[readUnsignedShort] : null;
        this.bootstrapMethodOffsets = z4 ? readBootstrapMethodsAttribute(i5) : null;
    }

    private String readUtf(int i2, int i3, char[] cArr) {
        int i4;
        int i5 = i3 + i2;
        byte[] bArr = this.classFileBuffer;
        int i6 = 0;
        while (i2 < i5) {
            int i7 = i2 + 1;
            byte b2 = bArr[i2];
            if ((b2 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                cArr[i6] = (char) (b2 & Byte.MAX_VALUE);
                i6++;
                i2 = i7;
            } else {
                if ((b2 & 224) == 192) {
                    i4 = i6 + 1;
                    i2 += 2;
                    cArr[i6] = (char) (((b2 & 31) << 6) + (bArr[i7] & Utf8.REPLACEMENT_BYTE));
                } else {
                    i4 = i6 + 1;
                    int i8 = i2 + 2;
                    i2 += 3;
                    cArr[i6] = (char) (((b2 & 15) << 12) + ((bArr[i7] & Utf8.REPLACEMENT_BYTE) << 6) + (bArr[i8] & Utf8.REPLACEMENT_BYTE));
                }
                i6 = i4;
            }
        }
        return new String(cArr, 0, i6);
    }

    public ClassReader(InputStream inputStream) throws IOException {
        this(readStream(inputStream, false));
    }

    public ClassReader(String str) throws IOException {
        this(readStream(ClassLoader.getSystemResourceAsStream(str.replace('.', '/') + ".class"), true));
    }
}
