package org.jacoco.core.internal.instr;

import org.jacoco.core.runtime.IExecutionDataAccessorGenerator;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public class CondyProbeArrayStrategy implements IProbeArrayStrategy {
    public static final String B_DESC = "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/Class;)[Z";
    private final IExecutionDataAccessorGenerator accessorGenerator;
    private final long classId;
    private final String className;
    private final boolean isInterface;

    public CondyProbeArrayStrategy(String str, boolean z2, long j2, IExecutionDataAccessorGenerator iExecutionDataAccessorGenerator) {
        this.className = str;
        this.isInterface = z2;
        this.classId = j2;
        this.accessorGenerator = iExecutionDataAccessorGenerator;
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public void addMembers(ClassVisitor classVisitor, int i2) {
        MethodVisitor visitMethod = classVisitor.visitMethod(InstrSupport.INITMETHOD_ACC, InstrSupport.INITMETHOD_NAME, B_DESC, null, null);
        int generateDataAccessor = this.accessorGenerator.generateDataAccessor(this.classId, this.className, i2, visitMethod);
        visitMethod.visitInsn(Opcodes.ARETURN);
        visitMethod.visitMaxs(generateDataAccessor, 3);
        visitMethod.visitEnd();
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public int storeInstance(MethodVisitor methodVisitor, boolean z2, int i2) {
        methodVisitor.visitLdcInsn(new ConstantDynamic(InstrSupport.DATAFIELD_NAME, "Ljava/lang/Object;", new Handle(6, this.className, InstrSupport.INITMETHOD_NAME, B_DESC, this.isInterface), new Object[0]));
        methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, InstrSupport.DATAFIELD_DESC);
        methodVisitor.visitVarInsn(58, i2);
        return 1;
    }
}
