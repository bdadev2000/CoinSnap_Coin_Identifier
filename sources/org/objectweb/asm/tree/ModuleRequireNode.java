package org.objectweb.asm.tree;

import org.objectweb.asm.ModuleVisitor;

/* loaded from: classes3.dex */
public class ModuleRequireNode {
    public int access;
    public String module;
    public String version;

    public ModuleRequireNode(String str, int i2, String str2) {
        this.module = str;
        this.access = i2;
        this.version = str2;
    }

    public void accept(ModuleVisitor moduleVisitor) {
        moduleVisitor.visitRequire(this.module, this.access, this.version);
    }
}
