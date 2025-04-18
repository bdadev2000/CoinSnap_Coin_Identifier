package org.objectweb.asm.commons;

import android.support.v4.media.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/* loaded from: classes3.dex */
public class GeneratorAdapter extends LocalVariablesSorter {
    public static final int ADD = 96;
    public static final int AND = 126;
    private static final String CLASS_DESCRIPTOR = "Ljava/lang/Class;";
    public static final int DIV = 108;
    public static final int EQ = 153;
    public static final int GE = 156;
    public static final int GT = 157;
    public static final int LE = 158;
    public static final int LT = 155;
    public static final int MUL = 104;
    public static final int NE = 154;
    public static final int NEG = 116;
    public static final int OR = 128;
    public static final int REM = 112;
    public static final int SHL = 120;
    public static final int SHR = 122;
    public static final int SUB = 100;
    public static final int USHR = 124;
    public static final int XOR = 130;
    private final int access;
    private final Type[] argumentTypes;
    private final List<Type> localTypes;
    private final String name;
    private final Type returnType;
    private static final Type BYTE_TYPE = Type.getObjectType("java/lang/Byte");
    private static final Type BOOLEAN_TYPE = Type.getObjectType("java/lang/Boolean");
    private static final Type SHORT_TYPE = Type.getObjectType("java/lang/Short");
    private static final Type CHARACTER_TYPE = Type.getObjectType("java/lang/Character");
    private static final Type INTEGER_TYPE = Type.getObjectType("java/lang/Integer");
    private static final Type FLOAT_TYPE = Type.getObjectType("java/lang/Float");
    private static final Type LONG_TYPE = Type.getObjectType("java/lang/Long");
    private static final Type DOUBLE_TYPE = Type.getObjectType("java/lang/Double");
    private static final Type NUMBER_TYPE = Type.getObjectType("java/lang/Number");
    private static final Type OBJECT_TYPE = Type.getObjectType("java/lang/Object");
    private static final Method BOOLEAN_VALUE = Method.getMethod("boolean booleanValue()");
    private static final Method CHAR_VALUE = Method.getMethod("char charValue()");
    private static final Method INT_VALUE = Method.getMethod("int intValue()");
    private static final Method FLOAT_VALUE = Method.getMethod("float floatValue()");
    private static final Method LONG_VALUE = Method.getMethod("long longValue()");
    private static final Method DOUBLE_VALUE = Method.getMethod("double doubleValue()");

    public GeneratorAdapter(MethodVisitor methodVisitor, int i2, String str, String str2) {
        this(589824, methodVisitor, i2, str, str2);
        if (getClass() != GeneratorAdapter.class) {
            throw new IllegalStateException();
        }
    }

    private void fieldInsn(int i2, Type type, String str, Type type2) {
        this.mv.visitFieldInsn(i2, type.getInternalName(), str, type2.getDescriptor());
    }

    private int getArgIndex(int i2) {
        int i3 = (this.access & 8) == 0 ? 1 : 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += this.argumentTypes[i4].getSize();
        }
        return i3;
    }

    private static Type getBoxedType(Type type) {
        switch (type.getSort()) {
            case 1:
                return BOOLEAN_TYPE;
            case 2:
                return CHARACTER_TYPE;
            case 3:
                return BYTE_TYPE;
            case 4:
                return SHORT_TYPE;
            case 5:
                return INTEGER_TYPE;
            case 6:
                return FLOAT_TYPE;
            case 7:
                return LONG_TYPE;
            case 8:
                return DOUBLE_TYPE;
            default:
                return type;
        }
    }

    private static String[] getInternalNames(Type[] typeArr) {
        int length = typeArr.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = typeArr[i2].getInternalName();
        }
        return strArr;
    }

    private void invokeInsn(int i2, Type type, Method method, boolean z2) {
        this.mv.visitMethodInsn(i2, type.getSort() == 9 ? type.getDescriptor() : type.getInternalName(), method.getName(), method.getDescriptor(), z2);
    }

    private void loadInsn(Type type, int i2) {
        this.mv.visitVarInsn(type.getOpcode(21), i2);
    }

    private void storeInsn(Type type, int i2) {
        this.mv.visitVarInsn(type.getOpcode(54), i2);
    }

    private void typeInsn(int i2, Type type) {
        this.mv.visitTypeInsn(i2, type.getInternalName());
    }

    public void arrayLength() {
        this.mv.visitInsn(190);
    }

    public void arrayLoad(Type type) {
        this.mv.visitInsn(type.getOpcode(46));
    }

    public void arrayStore(Type type) {
        this.mv.visitInsn(type.getOpcode(79));
    }

    public void box(Type type) {
        if (type.getSort() == 10 || type.getSort() == 9) {
            return;
        }
        Type type2 = Type.VOID_TYPE;
        if (type == type2) {
            push((String) null);
            return;
        }
        Type boxedType = getBoxedType(type);
        newInstance(boxedType);
        if (type.getSize() == 2) {
            dupX2();
            dupX2();
            pop();
        } else {
            dupX1();
            swap();
        }
        invokeConstructor(boxedType, new Method("<init>", type2, new Type[]{type}));
    }

    public void cast(Type type, Type type2) {
        if (type != type2) {
            if (type.getSort() >= 1 && type.getSort() <= 8 && type2.getSort() >= 1 && type2.getSort() <= 8) {
                InstructionAdapter.cast(this.mv, type, type2);
                return;
            }
            throw new IllegalArgumentException("Cannot cast from " + type + " to " + type2);
        }
    }

    public void catchException(Label label, Label label2, Type type) {
        Label label3 = new Label();
        if (type == null) {
            this.mv.visitTryCatchBlock(label, label2, label3, null);
        } else {
            this.mv.visitTryCatchBlock(label, label2, label3, type.getInternalName());
        }
        mark(label3);
    }

    public void checkCast(Type type) {
        if (type.equals(OBJECT_TYPE)) {
            return;
        }
        typeInsn(Opcodes.CHECKCAST, type);
    }

    public void dup() {
        this.mv.visitInsn(89);
    }

    public void dup2() {
        this.mv.visitInsn(92);
    }

    public void dup2X1() {
        this.mv.visitInsn(93);
    }

    public void dup2X2() {
        this.mv.visitInsn(94);
    }

    public void dupX1() {
        this.mv.visitInsn(90);
    }

    public void dupX2() {
        this.mv.visitInsn(91);
    }

    public void endMethod() {
        if ((this.access & 1024) == 0) {
            this.mv.visitMaxs(0, 0);
        }
        this.mv.visitEnd();
    }

    public int getAccess() {
        return this.access;
    }

    public Type[] getArgumentTypes() {
        return (Type[]) this.argumentTypes.clone();
    }

    public void getField(Type type, String str, Type type2) {
        fieldInsn(Opcodes.GETFIELD, type, str, type2);
    }

    public Type getLocalType(int i2) {
        return this.localTypes.get(i2 - this.firstLocal);
    }

    public String getName() {
        return this.name;
    }

    public Type getReturnType() {
        return this.returnType;
    }

    public void getStatic(Type type, String str, Type type2) {
        fieldInsn(Opcodes.GETSTATIC, type, str, type2);
    }

    public void goTo(Label label) {
        this.mv.visitJumpInsn(Opcodes.GOTO, label);
    }

    public void ifCmp(Type type, int i2, Label label) {
        int i3;
        switch (type.getSort()) {
            case 6:
                this.mv.visitInsn((i2 == 156 || i2 == 157) ? Opcodes.FCMPL : Opcodes.FCMPG);
                break;
            case 7:
                this.mv.visitInsn(Opcodes.LCMP);
                break;
            case 8:
                this.mv.visitInsn((i2 == 156 || i2 == 157) ? Opcodes.DCMPL : Opcodes.DCMPG);
                break;
            case 9:
            case 10:
                if (i2 == 153) {
                    this.mv.visitJumpInsn(Opcodes.IF_ACMPEQ, label);
                    return;
                } else if (i2 == 154) {
                    this.mv.visitJumpInsn(Opcodes.IF_ACMPNE, label);
                    return;
                } else {
                    throw new IllegalArgumentException("Bad comparison for type " + type);
                }
            default:
                switch (i2) {
                    case 153:
                        i3 = Opcodes.IF_ICMPEQ;
                        break;
                    case 154:
                        i3 = Opcodes.IF_ICMPNE;
                        break;
                    case 155:
                        i3 = Opcodes.IF_ICMPLT;
                        break;
                    case 156:
                        i3 = Opcodes.IF_ICMPGE;
                        break;
                    case 157:
                        i3 = Opcodes.IF_ICMPGT;
                        break;
                    case 158:
                        i3 = Opcodes.IF_ICMPLE;
                        break;
                    default:
                        throw new IllegalArgumentException(d.i("Bad comparison mode ", i2));
                }
                this.mv.visitJumpInsn(i3, label);
                return;
        }
        this.mv.visitJumpInsn(i2, label);
    }

    public void ifICmp(int i2, Label label) {
        ifCmp(Type.INT_TYPE, i2, label);
    }

    public void ifNonNull(Label label) {
        this.mv.visitJumpInsn(Opcodes.IFNONNULL, label);
    }

    public void ifNull(Label label) {
        this.mv.visitJumpInsn(Opcodes.IFNULL, label);
    }

    public void ifZCmp(int i2, Label label) {
        this.mv.visitJumpInsn(i2, label);
    }

    public void iinc(int i2, int i3) {
        this.mv.visitIincInsn(i2, i3);
    }

    public void instanceOf(Type type) {
        typeInsn(Opcodes.INSTANCEOF, type);
    }

    public void invokeConstructor(Type type, Method method) {
        invokeInsn(Opcodes.INVOKESPECIAL, type, method, false);
    }

    public void invokeDynamic(String str, String str2, Handle handle, Object... objArr) {
        this.mv.visitInvokeDynamicInsn(str, str2, handle, objArr);
    }

    public void invokeInterface(Type type, Method method) {
        invokeInsn(Opcodes.INVOKEINTERFACE, type, method, true);
    }

    public void invokeStatic(Type type, Method method) {
        invokeInsn(Opcodes.INVOKESTATIC, type, method, false);
    }

    public void invokeVirtual(Type type, Method method) {
        invokeInsn(Opcodes.INVOKEVIRTUAL, type, method, false);
    }

    public void loadArg(int i2) {
        loadInsn(this.argumentTypes[i2], getArgIndex(i2));
    }

    public void loadArgArray() {
        push(this.argumentTypes.length);
        newArray(OBJECT_TYPE);
        for (int i2 = 0; i2 < this.argumentTypes.length; i2++) {
            dup();
            push(i2);
            loadArg(i2);
            box(this.argumentTypes[i2]);
            arrayStore(OBJECT_TYPE);
        }
    }

    public void loadArgs(int i2, int i3) {
        int argIndex = getArgIndex(i2);
        for (int i4 = 0; i4 < i3; i4++) {
            Type type = this.argumentTypes[i2 + i4];
            loadInsn(type, argIndex);
            argIndex += type.getSize();
        }
    }

    public void loadLocal(int i2) {
        loadInsn(getLocalType(i2), i2);
    }

    public void loadThis() {
        if ((this.access & 8) != 0) {
            throw new IllegalStateException("no 'this' pointer within static method");
        }
        this.mv.visitVarInsn(25, 0);
    }

    public void mark(Label label) {
        this.mv.visitLabel(label);
    }

    public void math(int i2, Type type) {
        this.mv.visitInsn(type.getOpcode(i2));
    }

    public void monitorEnter() {
        this.mv.visitInsn(Opcodes.MONITORENTER);
    }

    public void monitorExit() {
        this.mv.visitInsn(Opcodes.MONITOREXIT);
    }

    public void newArray(Type type) {
        InstructionAdapter.newarray(this.mv, type);
    }

    public void newInstance(Type type) {
        typeInsn(Opcodes.NEW, type);
    }

    public Label newLabel() {
        return new Label();
    }

    public void not() {
        this.mv.visitInsn(4);
        this.mv.visitInsn(130);
    }

    public void pop() {
        this.mv.visitInsn(87);
    }

    public void pop2() {
        this.mv.visitInsn(88);
    }

    public void push(boolean z2) {
        push(z2 ? 1 : 0);
    }

    public void putField(Type type, String str, Type type2) {
        fieldInsn(Opcodes.PUTFIELD, type, str, type2);
    }

    public void putStatic(Type type, String str, Type type2) {
        fieldInsn(Opcodes.PUTSTATIC, type, str, type2);
    }

    public void ret(int i2) {
        this.mv.visitVarInsn(Opcodes.RET, i2);
    }

    public void returnValue() {
        this.mv.visitInsn(this.returnType.getOpcode(Opcodes.IRETURN));
    }

    @Override // org.objectweb.asm.commons.LocalVariablesSorter
    public void setLocalType(int i2, Type type) {
        int i3 = i2 - this.firstLocal;
        while (this.localTypes.size() < i3 + 1) {
            this.localTypes.add(null);
        }
        this.localTypes.set(i3, type);
    }

    public void storeArg(int i2) {
        storeInsn(this.argumentTypes[i2], getArgIndex(i2));
    }

    public void storeLocal(int i2) {
        storeInsn(getLocalType(i2), i2);
    }

    public void swap() {
        this.mv.visitInsn(95);
    }

    public void tableSwitch(int[] iArr, TableSwitchGenerator tableSwitchGenerator) {
        tableSwitch(iArr, tableSwitchGenerator, (iArr.length == 0 ? 0.0f : ((float) iArr.length) / ((float) ((iArr[iArr.length - 1] - iArr[0]) + 1))) >= 0.5f);
    }

    public void throwException() {
        this.mv.visitInsn(Opcodes.ATHROW);
    }

    public void unbox(Type type) {
        Method method;
        Type type2 = NUMBER_TYPE;
        switch (type.getSort()) {
            case 0:
                return;
            case 1:
                type2 = BOOLEAN_TYPE;
                method = BOOLEAN_VALUE;
                break;
            case 2:
                type2 = CHARACTER_TYPE;
                method = CHAR_VALUE;
                break;
            case 3:
            case 4:
            case 5:
                method = INT_VALUE;
                break;
            case 6:
                method = FLOAT_VALUE;
                break;
            case 7:
                method = LONG_VALUE;
                break;
            case 8:
                method = DOUBLE_VALUE;
                break;
            default:
                method = null;
                break;
        }
        if (method == null) {
            checkCast(type);
        } else {
            checkCast(type2);
            invokeVirtual(type2, method);
        }
    }

    public void valueOf(Type type) {
        if (type.getSort() == 10 || type.getSort() == 9) {
            return;
        }
        if (type == Type.VOID_TYPE) {
            push((String) null);
        } else {
            Type boxedType = getBoxedType(type);
            invokeStatic(boxedType, new Method("valueOf", boxedType, new Type[]{type}));
        }
    }

    public void loadLocal(int i2, Type type) {
        setLocalType(i2, type);
        loadInsn(type, i2);
    }

    public Label mark() {
        Label label = new Label();
        this.mv.visitLabel(label);
        return label;
    }

    public void push(int i2) {
        if (i2 >= -1 && i2 <= 5) {
            this.mv.visitInsn(i2 + 3);
            return;
        }
        if (i2 >= -128 && i2 <= 127) {
            this.mv.visitIntInsn(16, i2);
        } else if (i2 >= -32768 && i2 <= 32767) {
            this.mv.visitIntInsn(17, i2);
        } else {
            this.mv.visitLdcInsn(Integer.valueOf(i2));
        }
    }

    public void storeLocal(int i2, Type type) {
        setLocalType(i2, type);
        storeInsn(type, i2);
    }

    public void swap(Type type, Type type2) {
        if (type2.getSize() == 1) {
            if (type.getSize() == 1) {
                swap();
                return;
            } else {
                dupX2();
                pop();
                return;
            }
        }
        if (type.getSize() == 1) {
            dup2X1();
            pop2();
        } else {
            dup2X2();
            pop2();
        }
    }

    public void throwException(Type type, String str) {
        newInstance(type);
        dup();
        push(str);
        invokeConstructor(type, Method.getMethod("void <init> (String)"));
        throwException();
    }

    public GeneratorAdapter(int i2, MethodVisitor methodVisitor, int i3, String str, String str2) {
        super(i2, i3, str2, methodVisitor);
        this.localTypes = new ArrayList();
        this.access = i3;
        this.name = str;
        this.returnType = Type.getReturnType(str2);
        this.argumentTypes = Type.getArgumentTypes(str2);
    }

    public void tableSwitch(int[] iArr, TableSwitchGenerator tableSwitchGenerator, boolean z2) {
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (iArr[i2] < iArr[i2 - 1]) {
                throw new IllegalArgumentException("keys must be sorted in ascending order");
            }
        }
        Label newLabel = newLabel();
        Label newLabel2 = newLabel();
        if (iArr.length > 0) {
            int length = iArr.length;
            int i3 = 0;
            if (z2) {
                int i4 = iArr[0];
                int i5 = iArr[length - 1];
                int i6 = (i5 - i4) + 1;
                Label[] labelArr = new Label[i6];
                Arrays.fill(labelArr, newLabel);
                for (int i7 : iArr) {
                    labelArr[i7 - i4] = newLabel();
                }
                this.mv.visitTableSwitchInsn(i4, i5, newLabel, labelArr);
                while (i3 < i6) {
                    Label label = labelArr[i3];
                    if (label != newLabel) {
                        mark(label);
                        tableSwitchGenerator.generateCase(i3 + i4, newLabel2);
                    }
                    i3++;
                }
            } else {
                Label[] labelArr2 = new Label[length];
                for (int i8 = 0; i8 < length; i8++) {
                    labelArr2[i8] = newLabel();
                }
                this.mv.visitLookupSwitchInsn(newLabel, iArr, labelArr2);
                while (i3 < length) {
                    mark(labelArr2[i3]);
                    tableSwitchGenerator.generateCase(iArr[i3], newLabel2);
                    i3++;
                }
            }
        }
        mark(newLabel);
        tableSwitchGenerator.generateDefault();
        mark(newLabel2);
    }

    public void loadArgs() {
        loadArgs(0, this.argumentTypes.length);
    }

    public void push(long j2) {
        if (j2 != 0 && j2 != 1) {
            this.mv.visitLdcInsn(Long.valueOf(j2));
        } else {
            this.mv.visitInsn(((int) j2) + 9);
        }
    }

    public GeneratorAdapter(int i2, Method method, MethodVisitor methodVisitor) {
        this(methodVisitor, i2, method.getName(), method.getDescriptor());
    }

    public void push(float f2) {
        int floatToIntBits = Float.floatToIntBits(f2);
        if (floatToIntBits != 0 && floatToIntBits != 1065353216 && floatToIntBits != 1073741824) {
            this.mv.visitLdcInsn(Float.valueOf(f2));
        } else {
            this.mv.visitInsn(((int) f2) + 11);
        }
    }

    public GeneratorAdapter(int i2, Method method, String str, Type[] typeArr, ClassVisitor classVisitor) {
        this(i2, method, classVisitor.visitMethod(i2, method.getName(), method.getDescriptor(), str, typeArr == null ? null : getInternalNames(typeArr)));
    }

    public void push(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        if (doubleToLongBits != 0 && doubleToLongBits != 4607182418800017408L) {
            this.mv.visitLdcInsn(Double.valueOf(d));
        } else {
            this.mv.visitInsn(((int) d) + 14);
        }
    }

    public void push(String str) {
        if (str == null) {
            this.mv.visitInsn(1);
        } else {
            this.mv.visitLdcInsn(str);
        }
    }

    public void push(Type type) {
        if (type == null) {
            this.mv.visitInsn(1);
            return;
        }
        switch (type.getSort()) {
            case 1:
                this.mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Boolean", "TYPE", CLASS_DESCRIPTOR);
                return;
            case 2:
                this.mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Character", "TYPE", CLASS_DESCRIPTOR);
                return;
            case 3:
                this.mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Byte", "TYPE", CLASS_DESCRIPTOR);
                return;
            case 4:
                this.mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Short", "TYPE", CLASS_DESCRIPTOR);
                return;
            case 5:
                this.mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Integer", "TYPE", CLASS_DESCRIPTOR);
                return;
            case 6:
                this.mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Float", "TYPE", CLASS_DESCRIPTOR);
                return;
            case 7:
                this.mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Long", "TYPE", CLASS_DESCRIPTOR);
                return;
            case 8:
                this.mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Double", "TYPE", CLASS_DESCRIPTOR);
                return;
            default:
                this.mv.visitLdcInsn(type);
                return;
        }
    }

    public void push(Handle handle) {
        if (handle == null) {
            this.mv.visitInsn(1);
        } else {
            this.mv.visitLdcInsn(handle);
        }
    }

    public void push(ConstantDynamic constantDynamic) {
        if (constantDynamic == null) {
            this.mv.visitInsn(1);
        } else {
            this.mv.visitLdcInsn(constantDynamic);
        }
    }
}
