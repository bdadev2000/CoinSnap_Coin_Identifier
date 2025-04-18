package org.jacoco.core.internal.instr;

import org.jacoco.core.runtime.IExecutionDataAccessorGenerator;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* loaded from: classes4.dex */
class InterfaceFieldProbeArrayStrategy implements IProbeArrayStrategy {
    private final IExecutionDataAccessorGenerator accessorGenerator;
    private final long classId;
    private final String className;
    private final int probeCount;
    private boolean seenClinit = false;
    private static final Object[] FRAME_STACK_ARRZ = {InstrSupport.DATAFIELD_DESC};
    private static final Object[] FRAME_LOCALS_EMPTY = new Object[0];

    public InterfaceFieldProbeArrayStrategy(String str, long j2, int i2, IExecutionDataAccessorGenerator iExecutionDataAccessorGenerator) {
        this.className = str;
        this.classId = j2;
        this.probeCount = i2;
        this.accessorGenerator = iExecutionDataAccessorGenerator;
    }

    private void createClinitMethod(ClassVisitor classVisitor, int i2) {
        MethodVisitor visitMethod = classVisitor.visitMethod(4104, "<clinit>", "()V", null, null);
        visitMethod.visitCode();
        int generateDataAccessor = this.accessorGenerator.generateDataAccessor(this.classId, this.className, i2, visitMethod);
        visitMethod.visitFieldInsn(Opcodes.PUTSTATIC, this.className, InstrSupport.DATAFIELD_NAME, InstrSupport.DATAFIELD_DESC);
        visitMethod.visitInsn(Opcodes.RETURN);
        visitMethod.visitMaxs(generateDataAccessor, 0);
        visitMethod.visitEnd();
    }

    private void createDataField(ClassVisitor classVisitor) {
        classVisitor.visitField(InstrSupport.DATAFIELD_INTF_ACC, InstrSupport.DATAFIELD_NAME, InstrSupport.DATAFIELD_DESC, null, null);
    }

    private void createInitMethod(ClassVisitor classVisitor, int i2) {
        MethodVisitor visitMethod = classVisitor.visitMethod(InstrSupport.INITMETHOD_ACC, InstrSupport.INITMETHOD_NAME, InstrSupport.INITMETHOD_DESC, null, null);
        visitMethod.visitCode();
        visitMethod.visitFieldInsn(Opcodes.GETSTATIC, this.className, InstrSupport.DATAFIELD_NAME, InstrSupport.DATAFIELD_DESC);
        visitMethod.visitInsn(89);
        Label label = new Label();
        visitMethod.visitJumpInsn(Opcodes.IFNONNULL, label);
        visitMethod.visitInsn(87);
        int generateDataAccessor = this.accessorGenerator.generateDataAccessor(this.classId, this.className, i2, visitMethod);
        visitMethod.visitFrame(-1, 0, FRAME_LOCALS_EMPTY, 1, FRAME_STACK_ARRZ);
        visitMethod.visitLabel(label);
        visitMethod.visitInsn(Opcodes.ARETURN);
        visitMethod.visitMaxs(Math.max(generateDataAccessor, 2), 0);
        visitMethod.visitEnd();
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public void addMembers(ClassVisitor classVisitor, int i2) {
        createDataField(classVisitor);
        createInitMethod(classVisitor, i2);
        if (this.seenClinit) {
            return;
        }
        createClinitMethod(classVisitor, i2);
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public int storeInstance(MethodVisitor methodVisitor, boolean z2, int i2) {
        if (!z2) {
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, this.className, InstrSupport.INITMETHOD_NAME, InstrSupport.INITMETHOD_DESC, true);
            methodVisitor.visitVarInsn(58, i2);
            return 1;
        }
        int generateDataAccessor = this.accessorGenerator.generateDataAccessor(this.classId, this.className, this.probeCount, methodVisitor);
        methodVisitor.visitInsn(89);
        methodVisitor.visitFieldInsn(Opcodes.PUTSTATIC, this.className, InstrSupport.DATAFIELD_NAME, InstrSupport.DATAFIELD_DESC);
        methodVisitor.visitVarInsn(58, i2);
        this.seenClinit = true;
        return Math.max(generateDataAccessor, 2);
    }
}
