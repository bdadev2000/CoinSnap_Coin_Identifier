package org.objectweb.asm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class Frame {
    static final int APPEND_FRAME = 252;
    private static final int ARRAY_OF = 67108864;
    private static final int BOOLEAN = 4194313;
    private static final int BYTE = 4194314;
    private static final int CHAR = 4194315;
    static final int CHOP_FRAME = 248;
    private static final int CONSTANT_KIND = 4194304;
    private static final int DIM_MASK = -67108864;
    private static final int DIM_SHIFT = 26;
    private static final int DIM_SIZE = 6;
    private static final int DOUBLE = 4194307;
    private static final int ELEMENT_OF = -67108864;
    private static final int FLAGS_SHIFT = 20;
    private static final int FLAGS_SIZE = 2;
    private static final int FLOAT = 4194306;
    static final int FULL_FRAME = 255;
    private static final int INTEGER = 4194305;
    private static final int ITEM_ASM_BOOLEAN = 9;
    private static final int ITEM_ASM_BYTE = 10;
    private static final int ITEM_ASM_CHAR = 11;
    private static final int ITEM_ASM_SHORT = 12;
    static final int ITEM_DOUBLE = 3;
    static final int ITEM_FLOAT = 2;
    static final int ITEM_INTEGER = 1;
    static final int ITEM_LONG = 4;
    static final int ITEM_NULL = 5;
    static final int ITEM_OBJECT = 7;
    static final int ITEM_TOP = 0;
    static final int ITEM_UNINITIALIZED = 8;
    static final int ITEM_UNINITIALIZED_THIS = 6;
    private static final int KIND_MASK = 62914560;
    private static final int KIND_SHIFT = 22;
    private static final int KIND_SIZE = 4;
    private static final int LOCAL_KIND = 16777216;
    private static final int LONG = 4194308;
    private static final int NULL = 4194309;
    private static final int REFERENCE_KIND = 8388608;
    static final int RESERVED = 128;
    static final int SAME_FRAME = 0;
    static final int SAME_FRAME_EXTENDED = 251;
    static final int SAME_LOCALS_1_STACK_ITEM_FRAME = 64;
    static final int SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED = 247;
    private static final int SHORT = 4194316;
    private static final int STACK_KIND = 20971520;
    private static final int TOP = 4194304;
    private static final int TOP_IF_LONG_OR_DOUBLE_FLAG = 1048576;
    private static final int UNINITIALIZED_KIND = 12582912;
    private static final int UNINITIALIZED_THIS = 4194310;
    private static final int VALUE_MASK = 1048575;
    private static final int VALUE_SIZE = 20;
    private int initializationCount;
    private int[] initializations;
    private int[] inputLocals;
    private int[] inputStack;
    private int[] outputLocals;
    private int[] outputStack;
    private short outputStackStart;
    private short outputStackTop;
    Label owner;

    public Frame(Label label) {
        this.owner = label;
    }

    private void addInitializedType(int i2) {
        if (this.initializations == null) {
            this.initializations = new int[2];
        }
        int length = this.initializations.length;
        int i3 = this.initializationCount;
        if (i3 >= length) {
            int[] iArr = new int[Math.max(i3 + 1, length * 2)];
            System.arraycopy(this.initializations, 0, iArr, 0, length);
            this.initializations = iArr;
        }
        int[] iArr2 = this.initializations;
        int i4 = this.initializationCount;
        this.initializationCount = i4 + 1;
        iArr2[i4] = i2;
    }

    public static int getAbstractTypeFromApiFormat(SymbolTable symbolTable, Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() | 4194304 : obj instanceof String ? getAbstractTypeFromDescriptor(symbolTable, Type.getObjectType((String) obj).getDescriptor(), 0) : symbolTable.addUninitializedType("", ((Label) obj).bytecodeOffset) | UNINITIALIZED_KIND;
    }

    private static int getAbstractTypeFromDescriptor(SymbolTable symbolTable, String str, int i2) {
        char charAt = str.charAt(i2);
        int i3 = FLOAT;
        if (charAt == 'F') {
            return FLOAT;
        }
        if (charAt == 'L') {
            return symbolTable.addType(str.substring(i2 + 1, str.length() - 1)) | REFERENCE_KIND;
        }
        if (charAt != 'S') {
            if (charAt == 'V') {
                return 0;
            }
            if (charAt != 'I') {
                if (charAt == 'J') {
                    return LONG;
                }
                if (charAt != 'Z') {
                    if (charAt == '[') {
                        int i4 = i2 + 1;
                        while (str.charAt(i4) == '[') {
                            i4++;
                        }
                        char charAt2 = str.charAt(i4);
                        if (charAt2 != 'F') {
                            if (charAt2 == 'L') {
                                i3 = symbolTable.addType(str.substring(i4 + 1, str.length() - 1)) | REFERENCE_KIND;
                            } else if (charAt2 == 'S') {
                                i3 = SHORT;
                            } else if (charAt2 == 'Z') {
                                i3 = BOOLEAN;
                            } else if (charAt2 == 'I') {
                                i3 = INTEGER;
                            } else if (charAt2 != 'J') {
                                switch (charAt2) {
                                    case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                                        i3 = BYTE;
                                        break;
                                    case TypeReference.INSTANCEOF /* 67 */:
                                        i3 = CHAR;
                                        break;
                                    case TypeReference.NEW /* 68 */:
                                        i3 = DOUBLE;
                                        break;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            } else {
                                i3 = LONG;
                            }
                        }
                        return ((i4 - i2) << DIM_SHIFT) | i3;
                    }
                    switch (charAt) {
                        case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                        case TypeReference.INSTANCEOF /* 67 */:
                            break;
                        case TypeReference.NEW /* 68 */:
                            return DOUBLE;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }
        return INTEGER;
    }

    public static int getAbstractTypeFromInternalName(SymbolTable symbolTable, String str) {
        return symbolTable.addType(str) | REFERENCE_KIND;
    }

    private int getConcreteOutputType(int i2, int i3) {
        int i4 = (-67108864) & i2;
        int i5 = KIND_MASK & i2;
        if (i5 == 16777216) {
            int i6 = i4 + this.inputLocals[i2 & VALUE_MASK];
            if ((i2 & TOP_IF_LONG_OR_DOUBLE_FLAG) == 0 || !(i6 == LONG || i6 == DOUBLE)) {
                return i6;
            }
            return 4194304;
        }
        if (i5 != STACK_KIND) {
            return i2;
        }
        int i7 = i4 + this.inputStack[i3 - (i2 & VALUE_MASK)];
        if ((i2 & TOP_IF_LONG_OR_DOUBLE_FLAG) == 0 || !(i7 == LONG || i7 == DOUBLE)) {
            return i7;
        }
        return 4194304;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[LOOP:0: B:8:0x000d->B:15:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int getInitializedType(org.objectweb.asm.SymbolTable r9, int r10) {
        /*
            r8 = this;
            r0 = 4194310(0x400006, float:5.87748E-39)
            if (r10 == r0) goto Lc
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            r1 = r1 & r10
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 != r2) goto L54
        Lc:
            r1 = 0
        Ld:
            int r2 = r8.initializationCount
            if (r1 >= r2) goto L54
            int[] r2 = r8.initializations
            r2 = r2[r1]
            r3 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r3 = r3 & r2
            r4 = 62914560(0x3c00000, float:1.1284746E-36)
            r4 = r4 & r2
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2 & r5
            r7 = 16777216(0x1000000, float:2.3509887E-38)
            if (r4 != r7) goto L2a
            int[] r2 = r8.inputLocals
            r2 = r2[r6]
        L28:
            int r2 = r2 + r3
            goto L35
        L2a:
            r7 = 20971520(0x1400000, float:3.526483E-38)
            if (r4 != r7) goto L35
            int[] r2 = r8.inputStack
            int r4 = r2.length
            int r4 = r4 - r6
            r2 = r2[r4]
            goto L28
        L35:
            if (r10 != r2) goto L51
            r1 = 8388608(0x800000, float:1.1754944E-38)
            if (r10 != r0) goto L45
            java.lang.String r10 = r9.getClassName()
            int r9 = r9.addType(r10)
        L43:
            r9 = r9 | r1
            return r9
        L45:
            r10 = r10 & r5
            org.objectweb.asm.Symbol r10 = r9.getType(r10)
            java.lang.String r10 = r10.value
            int r9 = r9.addType(r10)
            goto L43
        L51:
            int r1 = r1 + 1
            goto Ld
        L54:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.Frame.getInitializedType(org.objectweb.asm.SymbolTable, int):int");
    }

    private int getLocal(int i2) {
        int[] iArr = this.outputLocals;
        if (iArr == null || i2 >= iArr.length) {
            return i2 | 16777216;
        }
        int i3 = iArr[i2];
        if (i3 != 0) {
            return i3;
        }
        int i4 = i2 | 16777216;
        iArr[i2] = i4;
        return i4;
    }

    private void pop(int i2) {
        short s2 = this.outputStackTop;
        if (s2 >= i2) {
            this.outputStackTop = (short) (s2 - i2);
        } else {
            this.outputStackStart = (short) (this.outputStackStart - (i2 - s2));
            this.outputStackTop = (short) 0;
        }
    }

    private void push(int i2) {
        if (this.outputStack == null) {
            this.outputStack = new int[10];
        }
        int length = this.outputStack.length;
        short s2 = this.outputStackTop;
        if (s2 >= length) {
            int[] iArr = new int[Math.max(s2 + 1, length * 2)];
            System.arraycopy(this.outputStack, 0, iArr, 0, length);
            this.outputStack = iArr;
        }
        int[] iArr2 = this.outputStack;
        short s3 = this.outputStackTop;
        short s4 = (short) (s3 + 1);
        this.outputStackTop = s4;
        iArr2[s3] = i2;
        short s5 = (short) (this.outputStackStart + s4);
        Label label = this.owner;
        if (s5 > label.outputStackMax) {
            label.outputStackMax = s5;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0084. Please report as an issue. */
    public static void putAbstractType(SymbolTable symbolTable, int i2, ByteVector byteVector) {
        int i3 = ((-67108864) & i2) >> DIM_SHIFT;
        if (i3 == 0) {
            int i4 = i2 & VALUE_MASK;
            int i5 = i2 & KIND_MASK;
            if (i5 == 4194304) {
                byteVector.putByte(i4);
                return;
            } else if (i5 == REFERENCE_KIND) {
                byteVector.putByte(7).putShort(symbolTable.addConstantClass(symbolTable.getType(i4).value).index);
                return;
            } else {
                if (i5 != UNINITIALIZED_KIND) {
                    throw new AssertionError();
                }
                byteVector.putByte(8).putShort((int) symbolTable.getType(i4).data);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i6 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            sb.append('[');
            i3 = i6;
        }
        if ((i2 & KIND_MASK) == REFERENCE_KIND) {
            sb.append('L');
            sb.append(symbolTable.getType(i2 & VALUE_MASK).value);
            sb.append(';');
        } else {
            int i7 = i2 & VALUE_MASK;
            if (i7 == 1) {
                sb.append('I');
            } else if (i7 == 2) {
                sb.append('F');
            } else if (i7 == 3) {
                sb.append('D');
            } else if (i7 != 4) {
                switch (i7) {
                    case 9:
                        sb.append('Z');
                        break;
                    case 10:
                        sb.append('B');
                        break;
                    case 11:
                        sb.append('C');
                        break;
                    case 12:
                        sb.append('S');
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                sb.append('J');
            }
        }
        byteVector.putByte(7).putShort(symbolTable.addConstantClass(sb.toString()).index);
    }

    private void setLocal(int i2, int i3) {
        if (this.outputLocals == null) {
            this.outputLocals = new int[10];
        }
        int length = this.outputLocals.length;
        if (i2 >= length) {
            int[] iArr = new int[Math.max(i2 + 1, length * 2)];
            System.arraycopy(this.outputLocals, 0, iArr, 0, length);
            this.outputLocals = iArr;
        }
        this.outputLocals[i2] = i3;
    }

    public final void accept(MethodWriter methodWriter) {
        int[] iArr = this.inputLocals;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = 2;
            if (i3 >= iArr.length) {
                break;
            }
            int i7 = iArr[i3];
            if (i7 != LONG && i7 != DOUBLE) {
                i6 = 1;
            }
            i3 += i6;
            if (i7 == 4194304) {
                i5++;
            } else {
                i4 += i5 + 1;
                i5 = 0;
            }
        }
        int[] iArr2 = this.inputStack;
        int i8 = 0;
        int i9 = 0;
        while (i8 < iArr2.length) {
            int i10 = iArr2[i8];
            i8 += (i10 == LONG || i10 == DOUBLE) ? 2 : 1;
            i9++;
        }
        int visitFrameStart = methodWriter.visitFrameStart(this.owner.bytecodeOffset, i4, i9);
        int i11 = 0;
        while (true) {
            int i12 = i4 - 1;
            if (i4 <= 0) {
                break;
            }
            int i13 = iArr[i11];
            i11 += (i13 == LONG || i13 == DOUBLE) ? 2 : 1;
            methodWriter.visitAbstractType(visitFrameStart, i13);
            i4 = i12;
            visitFrameStart++;
        }
        while (true) {
            int i14 = i9 - 1;
            if (i9 <= 0) {
                methodWriter.visitFrameEnd();
                return;
            }
            int i15 = iArr2[i2];
            i2 += (i15 == LONG || i15 == DOUBLE) ? 2 : 1;
            methodWriter.visitAbstractType(visitFrameStart, i15);
            visitFrameStart++;
            i9 = i14;
        }
    }

    public final void copyFrom(Frame frame) {
        this.inputLocals = frame.inputLocals;
        this.inputStack = frame.inputStack;
        this.outputStackStart = (short) 0;
        this.outputLocals = frame.outputLocals;
        this.outputStack = frame.outputStack;
        this.outputStackTop = frame.outputStackTop;
        this.initializationCount = frame.initializationCount;
        this.initializations = frame.initializations;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0027. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x034d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void execute(int r17, int r18, org.objectweb.asm.Symbol r19, org.objectweb.asm.SymbolTable r20) {
        /*
            Method dump skipped, instructions count: 1236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.Frame.execute(int, int, org.objectweb.asm.Symbol, org.objectweb.asm.SymbolTable):void");
    }

    public final int getInputStackSize() {
        return this.inputStack.length;
    }

    public final boolean merge(SymbolTable symbolTable, Frame frame, int i2) {
        boolean z2;
        int i3;
        int length = this.inputLocals.length;
        int length2 = this.inputStack.length;
        boolean z3 = true;
        if (frame.inputLocals == null) {
            frame.inputLocals = new int[length];
            z2 = true;
        } else {
            z2 = false;
        }
        for (int i4 = 0; i4 < length; i4++) {
            int[] iArr = this.outputLocals;
            if (iArr != null && i4 < iArr.length) {
                int i5 = iArr[i4];
                if (i5 == 0) {
                    i3 = this.inputLocals[i4];
                } else {
                    i3 = getConcreteOutputType(i5, length2);
                }
            } else {
                i3 = this.inputLocals[i4];
            }
            if (this.initializations != null) {
                i3 = getInitializedType(symbolTable, i3);
            }
            z2 |= merge(symbolTable, i3, frame.inputLocals, i4);
        }
        if (i2 > 0) {
            for (int i6 = 0; i6 < length; i6++) {
                z2 |= merge(symbolTable, this.inputLocals[i6], frame.inputLocals, i6);
            }
            if (frame.inputStack == null) {
                frame.inputStack = new int[1];
            } else {
                z3 = z2;
            }
            return merge(symbolTable, i2, frame.inputStack, 0) | z3;
        }
        int length3 = this.inputStack.length + this.outputStackStart;
        if (frame.inputStack == null) {
            frame.inputStack = new int[this.outputStackTop + length3];
        } else {
            z3 = z2;
        }
        for (int i7 = 0; i7 < length3; i7++) {
            int i8 = this.inputStack[i7];
            if (this.initializations != null) {
                i8 = getInitializedType(symbolTable, i8);
            }
            z3 |= merge(symbolTable, i8, frame.inputStack, i7);
        }
        for (int i9 = 0; i9 < this.outputStackTop; i9++) {
            int concreteOutputType = getConcreteOutputType(this.outputStack[i9], length2);
            if (this.initializations != null) {
                concreteOutputType = getInitializedType(symbolTable, concreteOutputType);
            }
            z3 |= merge(symbolTable, concreteOutputType, frame.inputStack, length3 + i9);
        }
        return z3;
    }

    public final void setInputFrameFromApiFormat(SymbolTable symbolTable, int i2, Object[] objArr, int i3, Object[] objArr2) {
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i4 + 1;
            this.inputLocals[i4] = getAbstractTypeFromApiFormat(symbolTable, objArr[i5]);
            Object obj = objArr[i5];
            if (obj == Opcodes.LONG || obj == Opcodes.DOUBLE) {
                i4 += 2;
                this.inputLocals[i6] = 4194304;
            } else {
                i4 = i6;
            }
        }
        while (true) {
            int[] iArr = this.inputLocals;
            if (i4 >= iArr.length) {
                break;
            }
            iArr[i4] = 4194304;
            i4++;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < i3; i8++) {
            Object obj2 = objArr2[i8];
            if (obj2 == Opcodes.LONG || obj2 == Opcodes.DOUBLE) {
                i7++;
            }
        }
        this.inputStack = new int[i7 + i3];
        int i9 = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = i9 + 1;
            this.inputStack[i9] = getAbstractTypeFromApiFormat(symbolTable, objArr2[i10]);
            Object obj3 = objArr2[i10];
            if (obj3 == Opcodes.LONG || obj3 == Opcodes.DOUBLE) {
                i9 += 2;
                this.inputStack[i11] = 4194304;
            } else {
                i9 = i11;
            }
        }
        this.outputStackTop = (short) 0;
        this.initializationCount = 0;
    }

    public final void setInputFrameFromDescriptor(SymbolTable symbolTable, int i2, String str, int i3) {
        int i4;
        int[] iArr = new int[i3];
        this.inputLocals = iArr;
        this.inputStack = new int[0];
        if ((i2 & 8) == 0) {
            i4 = 1;
            if ((i2 & Opcodes.ASM4) == 0) {
                iArr[0] = symbolTable.addType(symbolTable.getClassName()) | REFERENCE_KIND;
            } else {
                iArr[0] = UNINITIALIZED_THIS;
            }
        } else {
            i4 = 0;
        }
        for (Type type : Type.getArgumentTypes(str)) {
            int abstractTypeFromDescriptor = getAbstractTypeFromDescriptor(symbolTable, type.getDescriptor(), 0);
            int[] iArr2 = this.inputLocals;
            int i5 = i4 + 1;
            iArr2[i4] = abstractTypeFromDescriptor;
            if (abstractTypeFromDescriptor == LONG || abstractTypeFromDescriptor == DOUBLE) {
                i4 += 2;
                iArr2[i5] = 4194304;
            } else {
                i4 = i5;
            }
        }
        while (i4 < i3) {
            this.inputLocals[i4] = 4194304;
            i4++;
        }
    }

    private int pop() {
        short s2 = this.outputStackTop;
        if (s2 <= 0) {
            short s3 = (short) (this.outputStackStart - 1);
            this.outputStackStart = s3;
            return (-s3) | STACK_KIND;
        }
        int[] iArr = this.outputStack;
        short s4 = (short) (s2 - 1);
        this.outputStackTop = s4;
        return iArr[s4];
    }

    private void pop(String str) {
        char charAt = str.charAt(0);
        if (charAt == '(') {
            pop((Type.getArgumentsAndReturnSizes(str) >> 2) - 1);
        } else if (charAt != 'J' && charAt != 'D') {
            pop(1);
        } else {
            pop(2);
        }
    }

    private void push(SymbolTable symbolTable, String str) {
        int abstractTypeFromDescriptor = getAbstractTypeFromDescriptor(symbolTable, str, str.charAt(0) == '(' ? Type.getReturnTypeOffset(str) : 0);
        if (abstractTypeFromDescriptor != 0) {
            push(abstractTypeFromDescriptor);
            if (abstractTypeFromDescriptor == LONG || abstractTypeFromDescriptor == DOUBLE) {
                push(4194304);
            }
        }
    }

    private static boolean merge(SymbolTable symbolTable, int i2, int[] iArr, int i3) {
        int min;
        int addType;
        int i4 = iArr[i3];
        if (i4 == i2) {
            return false;
        }
        if ((67108863 & i2) == NULL) {
            if (i4 == NULL) {
                return false;
            }
            i2 = NULL;
        }
        if (i4 == 0) {
            iArr[i3] = i2;
            return true;
        }
        int i5 = i4 & (-67108864);
        int i6 = 4194304;
        if (i5 != 0 || (i4 & KIND_MASK) == REFERENCE_KIND) {
            if (i2 == NULL) {
                return false;
            }
            if ((i2 & (-4194304)) != ((-4194304) & i4)) {
                int i7 = i2 & (-67108864);
                if (i7 != 0 || (i2 & KIND_MASK) == REFERENCE_KIND) {
                    if (i7 != 0 && (i2 & KIND_MASK) != REFERENCE_KIND) {
                        i7 -= 67108864;
                    }
                    if (i5 != 0 && (i4 & KIND_MASK) != REFERENCE_KIND) {
                        i5 -= 67108864;
                    }
                    min = Math.min(i7, i5) | REFERENCE_KIND;
                    addType = symbolTable.addType("java/lang/Object");
                    i6 = min | addType;
                }
            } else if ((i4 & KIND_MASK) == REFERENCE_KIND) {
                i6 = (i2 & (-67108864)) | REFERENCE_KIND | symbolTable.addMergedType(i2 & VALUE_MASK, VALUE_MASK & i4);
            } else {
                min = ((i2 & (-67108864)) - 67108864) | REFERENCE_KIND;
                addType = symbolTable.addType("java/lang/Object");
                i6 = min | addType;
            }
        } else if (i4 == NULL) {
            if ((i2 & (-67108864)) == 0 && (i2 & KIND_MASK) != REFERENCE_KIND) {
                i2 = 4194304;
            }
            i6 = i2;
        }
        if (i6 == i4) {
            return false;
        }
        iArr[i3] = i6;
        return true;
    }
}
