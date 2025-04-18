package org.jacoco.core.internal.flow;

import org.objectweb.asm.ClassVisitor;

/* loaded from: classes.dex */
public abstract class ClassProbesVisitor extends ClassVisitor {
    public ClassProbesVisitor() {
        this(null);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public abstract MethodProbesVisitor visitMethod(int i2, String str, String str2, String str3, String[] strArr);

    public abstract void visitTotalProbeCount(int i2);

    public ClassProbesVisitor(ClassVisitor classVisitor) {
        super(589824, classVisitor);
    }
}
