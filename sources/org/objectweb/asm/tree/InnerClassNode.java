package org.objectweb.asm.tree;

import org.objectweb.asm.ClassVisitor;

/* loaded from: classes2.dex */
public class InnerClassNode {
    public int access;
    public String innerName;
    public String name;
    public String outerName;

    public InnerClassNode(String str, String str2, String str3, int i2) {
        this.name = str;
        this.outerName = str2;
        this.innerName = str3;
        this.access = i2;
    }

    public void accept(ClassVisitor classVisitor) {
        classVisitor.visitInnerClass(this.name, this.outerName, this.innerName, this.access);
    }
}
