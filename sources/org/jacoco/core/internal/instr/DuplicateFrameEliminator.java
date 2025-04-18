package org.jacoco.core.internal.instr;

import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

/* loaded from: classes2.dex */
class DuplicateFrameEliminator extends MethodVisitor {
    private boolean instruction;

    public DuplicateFrameEliminator(MethodVisitor methodVisitor) {
        super(589824, methodVisitor);
        this.instruction = true;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i2, String str, String str2, String str3) {
        this.instruction = true;
        this.mv.visitFieldInsn(i2, str, str2, str3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i2, int i3, Object[] objArr, int i4, Object[] objArr2) {
        if (this.instruction) {
            this.instruction = false;
            this.mv.visitFrame(i2, i3, objArr, i4, objArr2);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i2, int i3) {
        this.instruction = true;
        this.mv.visitIincInsn(i2, i3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i2) {
        this.instruction = true;
        this.mv.visitInsn(i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i2, int i3) {
        this.instruction = true;
        this.mv.visitIntInsn(i2, i3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.instruction = true;
        this.mv.visitInvokeDynamicInsn(str, str2, handle, objArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i2, Label label) {
        this.instruction = true;
        this.mv.visitJumpInsn(i2, label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        this.instruction = true;
        this.mv.visitLdcInsn(obj);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        this.instruction = true;
        this.mv.visitLookupSwitchInsn(label, iArr, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i2, String str, String str2, String str3, boolean z2) {
        this.instruction = true;
        this.mv.visitMethodInsn(i2, str, str2, str3, z2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i2) {
        this.instruction = true;
        this.mv.visitMultiANewArrayInsn(str, i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i2, int i3, Label label, Label... labelArr) {
        this.instruction = true;
        this.mv.visitTableSwitchInsn(i2, i3, label, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i2, String str) {
        this.instruction = true;
        this.mv.visitTypeInsn(i2, str);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i2, int i3) {
        this.instruction = true;
        this.mv.visitVarInsn(i2, i3);
    }
}
