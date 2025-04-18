package org.objectweb.asm;

import android.support.v4.media.d;

/* loaded from: classes4.dex */
public abstract class AnnotationVisitor {
    protected final int api;
    protected AnnotationVisitor av;

    public AnnotationVisitor(int i2) {
        this(i2, null);
    }

    public void visit(String str, Object obj) {
        AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            annotationVisitor.visit(str, obj);
        }
    }

    public AnnotationVisitor visitAnnotation(String str, String str2) {
        AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            return annotationVisitor.visitAnnotation(str, str2);
        }
        return null;
    }

    public AnnotationVisitor visitArray(String str) {
        AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            return annotationVisitor.visitArray(str);
        }
        return null;
    }

    public void visitEnd() {
        AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            annotationVisitor.visitEnd();
        }
    }

    public void visitEnum(String str, String str2, String str3) {
        AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            annotationVisitor.visitEnum(str, str2, str3);
        }
    }

    public AnnotationVisitor(int i2, AnnotationVisitor annotationVisitor) {
        if (i2 != 589824 && i2 != 524288 && i2 != 458752 && i2 != 393216 && i2 != 327680 && i2 != 262144 && i2 != 17432576) {
            throw new IllegalArgumentException(d.i("Unsupported api ", i2));
        }
        if (i2 == 17432576) {
            Constants.checkAsmExperimental(this);
        }
        this.api = i2;
        this.av = annotationVisitor;
    }
}
