package org.objectweb.asm.commons;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.TypePath;

/* loaded from: classes3.dex */
public class MethodRemapper extends MethodVisitor {
    protected final Remapper remapper;

    public MethodRemapper(MethodVisitor methodVisitor, Remapper remapper) {
        this(589824, methodVisitor, remapper);
    }

    private Object[] remapFrameTypes(int i2, Object[] objArr) {
        if (objArr == null) {
            return objArr;
        }
        Object[] objArr2 = null;
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] instanceof String) {
                if (objArr2 == null) {
                    objArr2 = new Object[i2];
                    System.arraycopy(objArr, 0, objArr2, 0, i2);
                }
                objArr2[i3] = this.remapper.mapType((String) objArr[i3]);
            }
        }
        return objArr2 == null ? objArr : objArr2;
    }

    @Deprecated
    public AnnotationVisitor createAnnotationRemapper(AnnotationVisitor annotationVisitor) {
        return new AnnotationRemapper(this.api, null, annotationVisitor, this.remapper);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z2) {
        AnnotationVisitor visitAnnotation = super.visitAnnotation(this.remapper.mapDesc(str), z2);
        return visitAnnotation == null ? visitAnnotation : createAnnotationRemapper(str, visitAnnotation);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitAnnotationDefault() {
        AnnotationVisitor visitAnnotationDefault = super.visitAnnotationDefault();
        return visitAnnotationDefault == null ? visitAnnotationDefault : createAnnotationRemapper(null, visitAnnotationDefault);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i2, String str, String str2, String str3) {
        super.visitFieldInsn(i2, this.remapper.mapType(str), this.remapper.mapFieldName(str, str2, str3), this.remapper.mapDesc(str3));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i2, int i3, Object[] objArr, int i4, Object[] objArr2) {
        super.visitFrame(i2, i3, remapFrameTypes(i3, objArr), i4, remapFrameTypes(i4, objArr2));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitInsnAnnotation(int i2, TypePath typePath, String str, boolean z2) {
        AnnotationVisitor visitInsnAnnotation = super.visitInsnAnnotation(i2, typePath, this.remapper.mapDesc(str), z2);
        return visitInsnAnnotation == null ? visitInsnAnnotation : createAnnotationRemapper(str, visitInsnAnnotation);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        Object[] objArr2 = new Object[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            objArr2[i2] = this.remapper.mapValue(objArr[i2]);
        }
        super.visitInvokeDynamicInsn(this.remapper.mapInvokeDynamicMethodName(str, str2), this.remapper.mapMethodDesc(str2), (Handle) this.remapper.mapValue(handle), objArr2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        super.visitLdcInsn(this.remapper.mapValue(obj));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i2) {
        super.visitLocalVariable(str, this.remapper.mapDesc(str2), this.remapper.mapSignature(str3, true), label, label2, i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitLocalVariableAnnotation(int i2, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z2) {
        AnnotationVisitor visitLocalVariableAnnotation = super.visitLocalVariableAnnotation(i2, typePath, labelArr, labelArr2, iArr, this.remapper.mapDesc(str), z2);
        return visitLocalVariableAnnotation == null ? visitLocalVariableAnnotation : createAnnotationRemapper(str, visitLocalVariableAnnotation);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i2, String str, String str2, String str3, boolean z2) {
        if (this.api >= 327680 || (i2 & 256) != 0) {
            super.visitMethodInsn(i2, this.remapper.mapType(str), this.remapper.mapMethodName(str, str2, str3), this.remapper.mapMethodDesc(str3), z2);
        } else {
            super.visitMethodInsn(i2, str, str2, str3, z2);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i2) {
        super.visitMultiANewArrayInsn(this.remapper.mapDesc(str), i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitParameterAnnotation(int i2, String str, boolean z2) {
        AnnotationVisitor visitParameterAnnotation = super.visitParameterAnnotation(i2, this.remapper.mapDesc(str), z2);
        return visitParameterAnnotation == null ? visitParameterAnnotation : createAnnotationRemapper(str, visitParameterAnnotation);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitTryCatchAnnotation(int i2, TypePath typePath, String str, boolean z2) {
        AnnotationVisitor visitTryCatchAnnotation = super.visitTryCatchAnnotation(i2, typePath, this.remapper.mapDesc(str), z2);
        return visitTryCatchAnnotation == null ? visitTryCatchAnnotation : createAnnotationRemapper(str, visitTryCatchAnnotation);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        super.visitTryCatchBlock(label, label2, label3, str == null ? null : this.remapper.mapType(str));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitTypeAnnotation(int i2, TypePath typePath, String str, boolean z2) {
        AnnotationVisitor visitTypeAnnotation = super.visitTypeAnnotation(i2, typePath, this.remapper.mapDesc(str), z2);
        return visitTypeAnnotation == null ? visitTypeAnnotation : createAnnotationRemapper(str, visitTypeAnnotation);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i2, String str) {
        super.visitTypeInsn(i2, this.remapper.mapType(str));
    }

    public MethodRemapper(int i2, MethodVisitor methodVisitor, Remapper remapper) {
        super(i2, methodVisitor);
        this.remapper = remapper;
    }

    public AnnotationVisitor createAnnotationRemapper(String str, AnnotationVisitor annotationVisitor) {
        return new AnnotationRemapper(this.api, str, annotationVisitor, this.remapper).orDeprecatedValue(createAnnotationRemapper(annotationVisitor));
    }
}
