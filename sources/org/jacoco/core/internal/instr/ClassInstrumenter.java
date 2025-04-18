package org.jacoco.core.internal.instr;

import org.jacoco.core.internal.flow.ClassProbesVisitor;
import org.jacoco.core.internal.flow.MethodProbesVisitor;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;

/* loaded from: classes2.dex */
public class ClassInstrumenter extends ClassProbesVisitor {
    private String className;
    private final IProbeArrayStrategy probeArrayStrategy;

    public ClassInstrumenter(IProbeArrayStrategy iProbeArrayStrategy, ClassVisitor classVisitor) {
        super(classVisitor);
        this.probeArrayStrategy = iProbeArrayStrategy;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int i2, int i3, String str, String str2, String str3, String[] strArr) {
        this.className = str;
        super.visit(i2, i3, str, str2, str3, strArr);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public FieldVisitor visitField(int i2, String str, String str2, String str3, Object obj) {
        InstrSupport.assertNotInstrumented(str, this.className);
        return super.visitField(i2, str, str2, str3, obj);
    }

    @Override // org.jacoco.core.internal.flow.ClassProbesVisitor
    public void visitTotalProbeCount(int i2) {
        this.probeArrayStrategy.addMembers(this.cv, i2);
    }

    @Override // org.jacoco.core.internal.flow.ClassProbesVisitor, org.objectweb.asm.ClassVisitor
    public MethodProbesVisitor visitMethod(int i2, String str, String str2, String str3, String[] strArr) {
        InstrSupport.assertNotInstrumented(str, this.className);
        MethodVisitor visitMethod = this.cv.visitMethod(i2, str, str2, str3, strArr);
        if (visitMethod == null) {
            return null;
        }
        ProbeInserter probeInserter = new ProbeInserter(i2, str, str2, new DuplicateFrameEliminator(visitMethod), this.probeArrayStrategy);
        return new MethodInstrumenter(probeInserter, probeInserter);
    }
}
