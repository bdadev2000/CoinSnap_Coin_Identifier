package org.jacoco.core.runtime;

import org.jacoco.core.JaCoCo;
import org.jacoco.core.internal.instr.InstrSupport;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public class OfflineInstrumentationAccessGenerator implements IExecutionDataAccessorGenerator {
    private final String runtimeClassName;

    public OfflineInstrumentationAccessGenerator() {
        this(JaCoCo.RUNTIMEPACKAGE.replace('.', '/') + "/Offline");
    }

    @Override // org.jacoco.core.runtime.IExecutionDataAccessorGenerator
    public int generateDataAccessor(long j2, String str, int i2, MethodVisitor methodVisitor) {
        methodVisitor.visitLdcInsn(Long.valueOf(j2));
        methodVisitor.visitLdcInsn(str);
        InstrSupport.push(methodVisitor, i2);
        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, this.runtimeClassName, "getProbes", "(JLjava/lang/String;I)[Z", false);
        return 4;
    }

    public OfflineInstrumentationAccessGenerator(String str) {
        this.runtimeClassName = str;
    }
}
