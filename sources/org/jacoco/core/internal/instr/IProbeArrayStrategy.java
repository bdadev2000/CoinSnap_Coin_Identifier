package org.jacoco.core.internal.instr;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

/* loaded from: classes4.dex */
public interface IProbeArrayStrategy {
    void addMembers(ClassVisitor classVisitor, int i2);

    int storeInstance(MethodVisitor methodVisitor, boolean z2, int i2);
}
