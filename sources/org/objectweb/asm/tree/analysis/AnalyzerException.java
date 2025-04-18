package org.objectweb.asm.tree.analysis;

import org.objectweb.asm.tree.AbstractInsnNode;

/* loaded from: classes3.dex */
public class AnalyzerException extends Exception {
    private static final long serialVersionUID = 3154190448018943333L;
    public final transient AbstractInsnNode node;

    public AnalyzerException(AbstractInsnNode abstractInsnNode, String str) {
        super(str);
        this.node = abstractInsnNode;
    }

    public AnalyzerException(AbstractInsnNode abstractInsnNode, String str, Throwable th) {
        super(str, th);
        this.node = abstractInsnNode;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AnalyzerException(org.objectweb.asm.tree.AbstractInsnNode r3, java.lang.String r4, java.lang.Object r5, org.objectweb.asm.tree.analysis.Value r6) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r4 != 0) goto La
            java.lang.String r4 = "Expected "
            goto L10
        La:
            java.lang.String r1 = ": expected "
            java.lang.String r4 = r4.concat(r1)
        L10:
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = ", but found "
            r0.append(r4)
            r0.append(r6)
            java.lang.String r4 = r0.toString()
            r2.<init>(r4)
            r2.node = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.tree.analysis.AnalyzerException.<init>(org.objectweb.asm.tree.AbstractInsnNode, java.lang.String, java.lang.Object, org.objectweb.asm.tree.analysis.Value):void");
    }
}
