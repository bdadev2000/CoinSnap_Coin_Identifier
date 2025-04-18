package org.objectweb.asm.commons;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;

/* loaded from: classes2.dex */
public class LocalVariablesSorter extends MethodVisitor {
    private static final Type OBJECT_TYPE = Type.getObjectType("java/lang/Object");
    protected final int firstLocal;
    protected int nextLocal;
    private Object[] remappedLocalTypes;
    private int[] remappedVariableIndices;

    public LocalVariablesSorter(int i2, String str, MethodVisitor methodVisitor) {
        this(589824, i2, str, methodVisitor);
        if (getClass() != LocalVariablesSorter.class) {
            throw new IllegalStateException();
        }
    }

    private int remap(int i2, Type type) {
        if (type.getSize() + i2 <= this.firstLocal) {
            return i2;
        }
        int size = type.getSize() + (i2 * 2);
        int i3 = size - 1;
        int length = this.remappedVariableIndices.length;
        if (i3 >= length) {
            int[] iArr = new int[Math.max(length * 2, size)];
            System.arraycopy(this.remappedVariableIndices, 0, iArr, 0, length);
            this.remappedVariableIndices = iArr;
        }
        int i4 = this.remappedVariableIndices[i3];
        if (i4 != 0) {
            return i4 - 1;
        }
        int newLocalMapping = newLocalMapping(type);
        setLocalType(newLocalMapping, type);
        this.remappedVariableIndices[i3] = newLocalMapping + 1;
        return newLocalMapping;
    }

    private void setFrameLocal(int i2, Object obj) {
        int length = this.remappedLocalTypes.length;
        if (i2 >= length) {
            Object[] objArr = new Object[Math.max(length * 2, i2 + 1)];
            System.arraycopy(this.remappedLocalTypes, 0, objArr, 0, length);
            this.remappedLocalTypes = objArr;
        }
        this.remappedLocalTypes[i2] = obj;
    }

    public int newLocal(Type type) {
        Object obj;
        switch (type.getSort()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                obj = Opcodes.INTEGER;
                break;
            case 6:
                obj = Opcodes.FLOAT;
                break;
            case 7:
                obj = Opcodes.LONG;
                break;
            case 8:
                obj = Opcodes.DOUBLE;
                break;
            case 9:
                obj = type.getDescriptor();
                break;
            case 10:
                obj = type.getInternalName();
                break;
            default:
                throw new AssertionError();
        }
        int newLocalMapping = newLocalMapping(type);
        setLocalType(newLocalMapping, type);
        setFrameLocal(newLocalMapping, obj);
        return newLocalMapping;
    }

    public int newLocalMapping(Type type) {
        int i2 = this.nextLocal;
        this.nextLocal = type.getSize() + i2;
        return i2;
    }

    public void setLocalType(int i2, Type type) {
    }

    public void updateNewLocals(Object[] objArr) {
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i2, int i3, Object[] objArr, int i4, Object[] objArr2) {
        if (i2 != -1) {
            throw new IllegalArgumentException("LocalVariablesSorter only accepts expanded frames (see ClassReader.EXPAND_FRAMES)");
        }
        Object[] objArr3 = this.remappedLocalTypes;
        int length = objArr3.length;
        Object[] objArr4 = new Object[length];
        int i5 = 0;
        System.arraycopy(objArr3, 0, objArr4, 0, length);
        updateNewLocals(this.remappedLocalTypes);
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = 2;
            if (i6 >= i3) {
                break;
            }
            Object obj = objArr[i6];
            if (obj != Opcodes.TOP) {
                Type type = OBJECT_TYPE;
                if (obj == Opcodes.INTEGER) {
                    type = Type.INT_TYPE;
                } else if (obj == Opcodes.FLOAT) {
                    type = Type.FLOAT_TYPE;
                } else if (obj == Opcodes.LONG) {
                    type = Type.LONG_TYPE;
                } else if (obj == Opcodes.DOUBLE) {
                    type = Type.DOUBLE_TYPE;
                } else if (obj instanceof String) {
                    type = Type.getObjectType((String) obj);
                }
                setFrameLocal(remap(i7, type), obj);
            }
            if (obj != Opcodes.LONG && obj != Opcodes.DOUBLE) {
                i8 = 1;
            }
            i7 += i8;
            i6++;
        }
        int i9 = 0;
        int i10 = 0;
        while (true) {
            Object[] objArr5 = this.remappedLocalTypes;
            if (i5 >= objArr5.length) {
                super.visitFrame(i2, i10, objArr5, i4, objArr2);
                this.remappedLocalTypes = objArr4;
                return;
            }
            Object obj2 = objArr5[i5];
            i5 += (obj2 == Opcodes.LONG || obj2 == Opcodes.DOUBLE) ? 2 : 1;
            if (obj2 == null || obj2 == Opcodes.TOP) {
                objArr5[i9] = Opcodes.TOP;
                i9++;
            } else {
                i10 = i9 + 1;
                objArr5[i9] = obj2;
                i9 = i10;
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i2, int i3) {
        super.visitIincInsn(remap(i2, Type.INT_TYPE), i3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i2) {
        super.visitLocalVariable(str, str2, str3, label, label2, remap(i2, Type.getType(str2)));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitLocalVariableAnnotation(int i2, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z2) {
        Type type = Type.getType(str);
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr2[i3] = remap(iArr[i3], type);
        }
        return super.visitLocalVariableAnnotation(i2, typePath, labelArr, labelArr2, iArr2, str, z2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i2, int i3) {
        super.visitMaxs(i2, this.nextLocal);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // org.objectweb.asm.MethodVisitor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void visitVarInsn(int r2, int r3) {
        /*
            r1 = this;
            r0 = 169(0xa9, float:2.37E-43)
            if (r2 == r0) goto L22
            switch(r2) {
                case 21: goto L1f;
                case 22: goto L1c;
                case 23: goto L19;
                case 24: goto L16;
                case 25: goto L22;
                default: goto L7;
            }
        L7:
            switch(r2) {
                case 54: goto L1f;
                case 55: goto L1c;
                case 56: goto L19;
                case 57: goto L16;
                case 58: goto L22;
                default: goto La;
            }
        La:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid opcode "
            java.lang.String r2 = android.support.v4.media.d.i(r0, r2)
            r3.<init>(r2)
            throw r3
        L16:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.DOUBLE_TYPE
            goto L24
        L19:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.FLOAT_TYPE
            goto L24
        L1c:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.LONG_TYPE
            goto L24
        L1f:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.INT_TYPE
            goto L24
        L22:
            org.objectweb.asm.Type r0 = org.objectweb.asm.commons.LocalVariablesSorter.OBJECT_TYPE
        L24:
            int r3 = r1.remap(r3, r0)
            super.visitVarInsn(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.commons.LocalVariablesSorter.visitVarInsn(int, int):void");
    }

    public LocalVariablesSorter(int i2, int i3, String str, MethodVisitor methodVisitor) {
        super(i2, methodVisitor);
        this.remappedVariableIndices = new int[40];
        this.remappedLocalTypes = new Object[20];
        int i4 = i3 & 8;
        this.nextLocal = i4 == 0 ? 1 : 0;
        for (Type type : Type.getArgumentTypes(str)) {
            this.nextLocal = type.getSize() + this.nextLocal;
        }
        this.firstLocal = this.nextLocal;
    }
}
