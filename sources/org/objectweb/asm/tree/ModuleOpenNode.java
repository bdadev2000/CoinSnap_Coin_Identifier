package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.ModuleVisitor;

/* loaded from: classes4.dex */
public class ModuleOpenNode {
    public int access;
    public List<String> modules;
    public String packaze;

    public ModuleOpenNode(String str, int i2, List<String> list) {
        this.packaze = str;
        this.access = i2;
        this.modules = list;
    }

    public void accept(ModuleVisitor moduleVisitor) {
        String str = this.packaze;
        int i2 = this.access;
        List<String> list = this.modules;
        moduleVisitor.visitOpen(str, i2, list == null ? null : (String[]) list.toArray(new String[0]));
    }
}
