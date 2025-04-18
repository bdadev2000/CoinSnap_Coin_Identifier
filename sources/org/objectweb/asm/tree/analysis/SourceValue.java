package org.objectweb.asm.tree.analysis;

import java.util.Set;
import org.objectweb.asm.tree.AbstractInsnNode;

/* loaded from: classes.dex */
public class SourceValue implements Value {
    public final Set<AbstractInsnNode> insns;
    public final int size;

    public SourceValue(int i2) {
        this(i2, new SmallSet());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SourceValue)) {
            return false;
        }
        SourceValue sourceValue = (SourceValue) obj;
        return this.size == sourceValue.size && this.insns.equals(sourceValue.insns);
    }

    @Override // org.objectweb.asm.tree.analysis.Value
    public int getSize() {
        return this.size;
    }

    public int hashCode() {
        return this.insns.hashCode();
    }

    public SourceValue(int i2, AbstractInsnNode abstractInsnNode) {
        this.size = i2;
        this.insns = new SmallSet(abstractInsnNode);
    }

    public SourceValue(int i2, Set<AbstractInsnNode> set) {
        this.size = i2;
        this.insns = set;
    }
}
