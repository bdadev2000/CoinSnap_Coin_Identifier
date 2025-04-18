package org.objectweb.asm;

import android.support.v4.media.d;

/* loaded from: classes3.dex */
public abstract class FieldVisitor {
    protected final int api;
    protected FieldVisitor fv;

    public FieldVisitor(int i2) {
        this(i2, null);
    }

    public AnnotationVisitor visitAnnotation(String str, boolean z2) {
        FieldVisitor fieldVisitor = this.fv;
        if (fieldVisitor != null) {
            return fieldVisitor.visitAnnotation(str, z2);
        }
        return null;
    }

    public void visitAttribute(Attribute attribute) {
        FieldVisitor fieldVisitor = this.fv;
        if (fieldVisitor != null) {
            fieldVisitor.visitAttribute(attribute);
        }
    }

    public void visitEnd() {
        FieldVisitor fieldVisitor = this.fv;
        if (fieldVisitor != null) {
            fieldVisitor.visitEnd();
        }
    }

    public AnnotationVisitor visitTypeAnnotation(int i2, TypePath typePath, String str, boolean z2) {
        if (this.api < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        FieldVisitor fieldVisitor = this.fv;
        if (fieldVisitor != null) {
            return fieldVisitor.visitTypeAnnotation(i2, typePath, str, z2);
        }
        return null;
    }

    public FieldVisitor(int i2, FieldVisitor fieldVisitor) {
        if (i2 != 589824 && i2 != 524288 && i2 != 458752 && i2 != 393216 && i2 != 327680 && i2 != 262144 && i2 != 17432576) {
            throw new IllegalArgumentException(d.i("Unsupported api ", i2));
        }
        if (i2 == 17432576) {
            Constants.checkAsmExperimental(this);
        }
        this.api = i2;
        this.fv = fieldVisitor;
    }
}
