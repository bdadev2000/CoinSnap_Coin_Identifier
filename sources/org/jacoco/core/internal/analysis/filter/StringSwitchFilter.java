package org.jacoco.core.internal.analysis.filter;

import java.util.Iterator;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodNode;

/* loaded from: classes2.dex */
public final class StringSwitchFilter implements IFilter {

    /* loaded from: classes2.dex */
    public static class Matcher extends AbstractMatcher {
        private Matcher() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
        
            r7 = r7 + 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void match(org.objectweb.asm.tree.AbstractInsnNode r11, org.jacoco.core.internal.analysis.filter.IFilterOutput r12) {
            /*
                r10 = this;
                int r0 = r11.getOpcode()
                r1 = 58
                r2 = 25
                if (r0 == r1) goto L11
                int r0 = r11.getOpcode()
                if (r0 == r2) goto L11
                return
            L11:
                r10.cursor = r11
                java.lang.String r0 = "hashCode"
                java.lang.String r1 = "()I"
                r3 = 182(0xb6, float:2.55E-43)
                java.lang.String r4 = "java/lang/String"
                r10.nextIsInvoke(r3, r4, r0, r1)
                r10.nextIsSwitch()
                org.objectweb.asm.tree.AbstractInsnNode r0 = r10.cursor
                if (r0 != 0) goto L26
                return
            L26:
                java.util.Map<java.lang.String, org.objectweb.asm.tree.VarInsnNode> r0 = r10.vars
                org.objectweb.asm.tree.VarInsnNode r11 = (org.objectweb.asm.tree.VarInsnNode) r11
                java.lang.String r1 = "s"
                r0.put(r1, r11)
                org.objectweb.asm.tree.AbstractInsnNode r11 = r10.cursor
                int r0 = r11.getOpcode()
                r5 = 171(0xab, float:2.4E-43)
                if (r0 != r5) goto L46
                org.objectweb.asm.tree.AbstractInsnNode r0 = r10.cursor
                org.objectweb.asm.tree.LookupSwitchInsnNode r0 = (org.objectweb.asm.tree.LookupSwitchInsnNode) r0
                org.objectweb.asm.tree.LabelNode r5 = r0.dflt
                java.util.List<org.objectweb.asm.tree.LabelNode> r0 = r0.labels
                int r0 = r0.size()
                goto L52
            L46:
                org.objectweb.asm.tree.AbstractInsnNode r0 = r10.cursor
                org.objectweb.asm.tree.TableSwitchInsnNode r0 = (org.objectweb.asm.tree.TableSwitchInsnNode) r0
                org.objectweb.asm.tree.LabelNode r5 = r0.dflt
                java.util.List<org.objectweb.asm.tree.LabelNode> r0 = r0.labels
                int r0 = r0.size()
            L52:
                if (r0 != 0) goto L55
                return
            L55:
                java.util.HashSet r6 = new java.util.HashSet
                r6.<init>()
                org.objectweb.asm.tree.AbstractInsnNode r7 = org.jacoco.core.internal.analysis.filter.AbstractMatcher.skipNonOpcodes(r5)
                r6.add(r7)
                r7 = 0
            L62:
                if (r7 >= r0) goto La5
            L64:
                r10.nextIsVar(r2, r1)
                r8 = 18
                r10.nextIs(r8)
                java.lang.String r8 = "equals"
                java.lang.String r9 = "(Ljava/lang/Object;)Z"
                r10.nextIsInvoke(r3, r4, r8, r9)
                r8 = 154(0x9a, float:2.16E-43)
                r10.nextIs(r8)
                org.objectweb.asm.tree.AbstractInsnNode r8 = r10.cursor
                if (r8 != 0) goto L7d
                return
            L7d:
                org.objectweb.asm.tree.JumpInsnNode r8 = (org.objectweb.asm.tree.JumpInsnNode) r8
                org.objectweb.asm.tree.LabelNode r8 = r8.label
                org.objectweb.asm.tree.AbstractInsnNode r8 = org.jacoco.core.internal.analysis.filter.AbstractMatcher.skipNonOpcodes(r8)
                r6.add(r8)
                org.objectweb.asm.tree.AbstractInsnNode r8 = r10.cursor
                org.objectweb.asm.tree.AbstractInsnNode r8 = r8.getNext()
                int r8 = r8.getOpcode()
                r9 = 167(0xa7, float:2.34E-43)
                if (r8 != r9) goto L9a
                r10.nextIs(r9)
                goto La2
            L9a:
                org.objectweb.asm.tree.AbstractInsnNode r8 = r10.cursor
                org.objectweb.asm.tree.AbstractInsnNode r8 = r8.getNext()
                if (r8 != r5) goto L64
            La2:
                int r7 = r7 + 1
                goto L62
            La5:
                org.objectweb.asm.tree.AbstractInsnNode r0 = r11.getNext()
                org.objectweb.asm.tree.AbstractInsnNode r1 = r10.cursor
                r12.ignore(r0, r1)
                r12.replaceBranches(r11, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jacoco.core.internal.analysis.filter.StringSwitchFilter.Matcher.match(org.objectweb.asm.tree.AbstractInsnNode, org.jacoco.core.internal.analysis.filter.IFilterOutput):void");
        }
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        Matcher matcher = new Matcher();
        Iterator<AbstractInsnNode> it = methodNode.instructions.iterator();
        while (it.hasNext()) {
            matcher.match(it.next(), iFilterOutput);
        }
    }
}
