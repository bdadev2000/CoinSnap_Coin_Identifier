package org.jacoco.core.runtime;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public class SystemPropertiesRuntime extends AbstractRuntime {
    private static final String KEYPREFIX = "jacoco-";
    private final String key = KEYPREFIX + Integer.toHexString(hashCode());

    @Override // org.jacoco.core.runtime.IExecutionDataAccessorGenerator
    public int generateDataAccessor(long j2, String str, int i2, MethodVisitor methodVisitor) {
        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/System", "getProperties", "()Ljava/util/Properties;", false);
        methodVisitor.visitLdcInsn(this.key);
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/util/Properties", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
        RuntimeData.generateAccessCall(j2, str, i2, methodVisitor);
        return 6;
    }

    @Override // org.jacoco.core.runtime.IRuntime
    public void shutdown() {
        System.getProperties().remove(this.key);
    }

    @Override // org.jacoco.core.runtime.AbstractRuntime, org.jacoco.core.runtime.IRuntime
    public void startup(RuntimeData runtimeData) throws Exception {
        super.startup(runtimeData);
        System.getProperties().put(this.key, runtimeData);
    }
}
