package org.objectweb.asm;

import android.support.v4.media.d;

/* loaded from: classes3.dex */
public abstract class ClassVisitor {
    protected final int api;
    protected ClassVisitor cv;

    public ClassVisitor(int i2) {
        this(i2, null);
    }

    public void visit(int i2, int i3, String str, String str2, String str3, String[] strArr) {
        if (this.api < 524288 && (65536 & i3) != 0) {
            throw new UnsupportedOperationException("Records requires ASM8");
        }
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visit(i2, i3, str, str2, str3, strArr);
        }
    }

    public AnnotationVisitor visitAnnotation(String str, boolean z2) {
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            return classVisitor.visitAnnotation(str, z2);
        }
        return null;
    }

    public void visitAttribute(Attribute attribute) {
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitAttribute(attribute);
        }
    }

    public void visitEnd() {
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitEnd();
        }
    }

    public FieldVisitor visitField(int i2, String str, String str2, String str3, Object obj) {
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            return classVisitor.visitField(i2, str, str2, str3, obj);
        }
        return null;
    }

    public void visitInnerClass(String str, String str2, String str3, int i2) {
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitInnerClass(str, str2, str3, i2);
        }
    }

    public MethodVisitor visitMethod(int i2, String str, String str2, String str3, String[] strArr) {
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            return classVisitor.visitMethod(i2, str, str2, str3, strArr);
        }
        return null;
    }

    public ModuleVisitor visitModule(String str, int i2, String str2) {
        if (this.api < 393216) {
            throw new UnsupportedOperationException("Module requires ASM6");
        }
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            return classVisitor.visitModule(str, i2, str2);
        }
        return null;
    }

    public void visitNestHost(String str) {
        if (this.api < 458752) {
            throw new UnsupportedOperationException("NestHost requires ASM7");
        }
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitNestHost(str);
        }
    }

    public void visitNestMember(String str) {
        if (this.api < 458752) {
            throw new UnsupportedOperationException("NestMember requires ASM7");
        }
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitNestMember(str);
        }
    }

    public void visitOuterClass(String str, String str2, String str3) {
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitOuterClass(str, str2, str3);
        }
    }

    public void visitPermittedSubclass(String str) {
        if (this.api < 589824) {
            throw new UnsupportedOperationException("PermittedSubclasses requires ASM9");
        }
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitPermittedSubclass(str);
        }
    }

    public RecordComponentVisitor visitRecordComponent(String str, String str2, String str3) {
        if (this.api < 524288) {
            throw new UnsupportedOperationException("Record requires ASM8");
        }
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            return classVisitor.visitRecordComponent(str, str2, str3);
        }
        return null;
    }

    public void visitSource(String str, String str2) {
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitSource(str, str2);
        }
    }

    public AnnotationVisitor visitTypeAnnotation(int i2, TypePath typePath, String str, boolean z2) {
        if (this.api < 327680) {
            throw new UnsupportedOperationException("TypeAnnotation requires ASM5");
        }
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            return classVisitor.visitTypeAnnotation(i2, typePath, str, z2);
        }
        return null;
    }

    public ClassVisitor(int i2, ClassVisitor classVisitor) {
        if (i2 != 589824 && i2 != 524288 && i2 != 458752 && i2 != 393216 && i2 != 327680 && i2 != 262144 && i2 != 17432576) {
            throw new IllegalArgumentException(d.i("Unsupported api ", i2));
        }
        if (i2 == 17432576) {
            Constants.checkAsmExperimental(this);
        }
        this.api = i2;
        this.cv = classVisitor;
    }
}
