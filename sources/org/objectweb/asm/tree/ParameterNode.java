package org.objectweb.asm.tree;

import org.objectweb.asm.MethodVisitor;

/* loaded from: classes4.dex */
public class ParameterNode {
    public int access;
    public String name;

    public ParameterNode(String str, int i2) {
        this.name = str;
        this.access = i2;
    }

    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitParameter(this.name, this.access);
    }
}
