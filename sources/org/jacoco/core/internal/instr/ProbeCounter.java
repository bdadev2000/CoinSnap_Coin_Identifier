package org.jacoco.core.internal.instr;

import org.jacoco.core.internal.flow.ClassProbesVisitor;
import org.jacoco.core.internal.flow.MethodProbesVisitor;

/* loaded from: classes4.dex */
class ProbeCounter extends ClassProbesVisitor {
    private int count = 0;
    private boolean methods = false;

    public int getCount() {
        return this.count;
    }

    public boolean hasMethods() {
        return this.methods;
    }

    @Override // org.jacoco.core.internal.flow.ClassProbesVisitor
    public void visitTotalProbeCount(int i2) {
        this.count = i2;
    }

    @Override // org.jacoco.core.internal.flow.ClassProbesVisitor, org.objectweb.asm.ClassVisitor
    public MethodProbesVisitor visitMethod(int i2, String str, String str2, String str3, String[] strArr) {
        if ("<clinit>".equals(str) || (i2 & 1024) != 0) {
            return null;
        }
        this.methods = true;
        return null;
    }
}
