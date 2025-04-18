package org.objectweb.asm.commons;

import androidx.compose.foundation.text.input.a;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public class CodeSizeEvaluator extends MethodVisitor implements Opcodes {
    private int maxSize;
    private int minSize;

    public CodeSizeEvaluator(MethodVisitor methodVisitor) {
        this(589824, methodVisitor);
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public int getMinSize() {
        return this.minSize;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i2, String str, String str2, String str3) {
        this.minSize += 3;
        this.maxSize += 3;
        super.visitFieldInsn(i2, str, str2, str3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i2, int i3) {
        if (i2 > 255 || i3 > 127 || i3 < -128) {
            this.minSize += 6;
            this.maxSize += 6;
        } else {
            this.minSize += 3;
            this.maxSize += 3;
        }
        super.visitIincInsn(i2, i3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i2) {
        this.minSize++;
        this.maxSize++;
        super.visitInsn(i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i2, int i3) {
        if (i2 == 17) {
            this.minSize += 3;
            this.maxSize += 3;
        } else {
            this.minSize += 2;
            this.maxSize += 2;
        }
        super.visitIntInsn(i2, i3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.minSize += 5;
        this.maxSize += 5;
        super.visitInvokeDynamicInsn(str, str2, handle, objArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i2, Label label) {
        this.minSize += 3;
        if (i2 == 167 || i2 == 168) {
            this.maxSize += 5;
        } else {
            this.maxSize += 8;
        }
        super.visitJumpInsn(i2, label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        if ((obj instanceof Long) || (obj instanceof Double) || ((obj instanceof ConstantDynamic) && ((ConstantDynamic) obj).getSize() == 2)) {
            this.minSize += 3;
            this.maxSize += 3;
        } else {
            this.minSize += 2;
            this.maxSize += 3;
        }
        super.visitLdcInsn(obj);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        this.minSize = a.a(iArr.length, 8, 9, this.minSize);
        this.maxSize = a.a(iArr.length, 8, 12, this.maxSize);
        super.visitLookupSwitchInsn(label, iArr, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i2, String str, String str2, String str3, boolean z2) {
        if (this.api < 327680 && (i2 & 256) == 0) {
            super.visitMethodInsn(i2, str, str2, str3, z2);
            return;
        }
        if ((i2 & (-257)) == 185) {
            this.minSize += 5;
            this.maxSize += 5;
        } else {
            this.minSize += 3;
            this.maxSize += 3;
        }
        super.visitMethodInsn(i2, str, str2, str3, z2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i2) {
        this.minSize += 4;
        this.maxSize += 4;
        super.visitMultiANewArrayInsn(str, i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i2, int i3, Label label, Label... labelArr) {
        this.minSize = a.a(labelArr.length, 4, 13, this.minSize);
        this.maxSize = a.a(labelArr.length, 4, 16, this.maxSize);
        super.visitTableSwitchInsn(i2, i3, label, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i2, String str) {
        this.minSize += 3;
        this.maxSize += 3;
        super.visitTypeInsn(i2, str);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i2, int i3) {
        if (i3 < 4 && i2 != 169) {
            this.minSize++;
            this.maxSize++;
        } else if (i3 >= 256) {
            this.minSize += 4;
            this.maxSize += 4;
        } else {
            this.minSize += 2;
            this.maxSize += 2;
        }
        super.visitVarInsn(i2, i3);
    }

    public CodeSizeEvaluator(int i2, MethodVisitor methodVisitor) {
        super(i2, methodVisitor);
    }
}
