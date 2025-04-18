package org.jacoco.core.internal.instr;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;

/* loaded from: classes4.dex */
class ProbeInserter extends MethodVisitor implements IProbeInserter {
    private int accessorStackSize;
    private final IProbeArrayStrategy arrayStrategy;
    private final Label beginLabel;
    private final boolean clinit;
    private final int variable;

    public ProbeInserter(int i2, String str, String str2, MethodVisitor methodVisitor, IProbeArrayStrategy iProbeArrayStrategy) {
        super(589824, methodVisitor);
        this.clinit = "<clinit>".equals(str);
        this.arrayStrategy = iProbeArrayStrategy;
        int i3 = (i2 & 8) == 0 ? 1 : 0;
        for (Type type : Type.getArgumentTypes(str2)) {
            i3 += type.getSize();
        }
        this.variable = i3;
        this.beginLabel = new Label();
    }

    private int map(int i2) {
        return i2 < this.variable ? i2 : i2 + 1;
    }

    @Override // org.jacoco.core.internal.instr.IProbeInserter
    public void insertProbe(int i2) {
        this.mv.visitVarInsn(25, this.variable);
        InstrSupport.push(this.mv, i2);
        this.mv.visitInsn(4);
        this.mv.visitInsn(84);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitCode() {
        this.mv.visitLabel(this.beginLabel);
        this.accessorStackSize = this.arrayStrategy.storeInstance(this.mv, this.clinit, this.variable);
        this.mv.visitCode();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public final void visitFrame(int i2, int i3, Object[] objArr, int i4, Object[] objArr2) {
        int i5;
        if (i2 != -1) {
            throw new IllegalArgumentException("ClassReader.accept() should be called with EXPAND_FRAMES flag");
        }
        Object[] objArr3 = new Object[Math.max(i3, this.variable) + 1];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i6 >= i3 && i7 > this.variable) {
                this.mv.visitFrame(i2, i8, objArr3, i4, objArr2);
                return;
            }
            if (i7 == this.variable) {
                i5 = i8 + 1;
                objArr3[i8] = InstrSupport.DATAFIELD_DESC;
            } else if (i6 < i3) {
                int i9 = i6 + 1;
                Object obj = objArr[i6];
                int i10 = i8 + 1;
                objArr3[i8] = obj;
                i7 = (obj == Opcodes.LONG || obj == Opcodes.DOUBLE) ? i7 + 2 : i7 + 1;
                i6 = i9;
                i8 = i10;
            } else {
                i5 = i8 + 1;
                objArr3[i8] = Opcodes.TOP;
            }
            i7++;
            i8 = i5;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public final void visitIincInsn(int i2, int i3) {
        this.mv.visitIincInsn(map(i2), i3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public final void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i2) {
        if (i2 < this.variable) {
            this.mv.visitLocalVariable(str, str2, str3, this.beginLabel, label2, i2);
        } else {
            this.mv.visitLocalVariable(str, str2, str3, label, label2, map(i2));
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitLocalVariableAnnotation(int i2, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z2) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr2[i3] = map(iArr[i3]);
        }
        return this.mv.visitLocalVariableAnnotation(i2, typePath, labelArr, labelArr2, iArr2, str, z2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i2, int i3) {
        this.mv.visitMaxs(Math.max(i2 + 3, this.accessorStackSize), i3 + 1);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public final void visitVarInsn(int i2, int i3) {
        this.mv.visitVarInsn(i2, map(i3));
    }
}
