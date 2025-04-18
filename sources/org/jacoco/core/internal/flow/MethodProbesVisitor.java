package org.jacoco.core.internal.flow;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.MethodNode;

/* loaded from: classes4.dex */
public abstract class MethodProbesVisitor extends MethodVisitor {
    public MethodProbesVisitor() {
        this(null);
    }

    public void accept(MethodNode methodNode, MethodVisitor methodVisitor) {
        methodNode.accept(methodVisitor);
    }

    public void visitInsnWithProbe(int i2, int i3) {
    }

    public void visitJumpInsnWithProbe(int i2, Label label, int i3, IFrame iFrame) {
    }

    public void visitLookupSwitchInsnWithProbes(Label label, int[] iArr, Label[] labelArr, IFrame iFrame) {
    }

    public void visitProbe(int i2) {
    }

    public void visitTableSwitchInsnWithProbes(int i2, int i3, Label label, Label[] labelArr, IFrame iFrame) {
    }

    public MethodProbesVisitor(MethodVisitor methodVisitor) {
        super(589824, methodVisitor);
    }
}
