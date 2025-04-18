package org.jacoco.core.internal.analysis.filter;

import java.util.Iterator;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodNode;

/* loaded from: classes2.dex */
public final class KotlinWhenStringFilter implements IFilter {

    /* loaded from: classes2.dex */
    public static class Matcher extends AbstractMatcher {
        private Matcher() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
        
            r7 = r7 + 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void match(org.objectweb.asm.tree.AbstractInsnNode r12, org.jacoco.core.internal.analysis.filter.IFilterOutput r13) {
            /*
                r11 = this;
                int r0 = r12.getOpcode()
                r1 = 25
                if (r1 == r0) goto L9
                return
            L9:
                r11.cursor = r12
                java.lang.String r0 = "hashCode"
                java.lang.String r2 = "()I"
                r3 = 182(0xb6, float:2.55E-43)
                java.lang.String r4 = "java/lang/String"
                r11.nextIsInvoke(r3, r4, r0, r2)
                r11.nextIsSwitch()
                org.objectweb.asm.tree.AbstractInsnNode r0 = r11.cursor
                if (r0 != 0) goto L1e
                return
            L1e:
                java.util.Map<java.lang.String, org.objectweb.asm.tree.VarInsnNode> r0 = r11.vars
                org.objectweb.asm.tree.VarInsnNode r12 = (org.objectweb.asm.tree.VarInsnNode) r12
                java.lang.String r2 = "s"
                r0.put(r2, r12)
                org.objectweb.asm.tree.AbstractInsnNode r12 = r11.cursor
                int r0 = r12.getOpcode()
                r5 = 171(0xab, float:2.4E-43)
                if (r0 != r5) goto L3e
                org.objectweb.asm.tree.AbstractInsnNode r0 = r11.cursor
                org.objectweb.asm.tree.LookupSwitchInsnNode r0 = (org.objectweb.asm.tree.LookupSwitchInsnNode) r0
                org.objectweb.asm.tree.LabelNode r5 = r0.dflt
                java.util.List<org.objectweb.asm.tree.LabelNode> r0 = r0.labels
                int r0 = r0.size()
                goto L4a
            L3e:
                org.objectweb.asm.tree.AbstractInsnNode r0 = r11.cursor
                org.objectweb.asm.tree.TableSwitchInsnNode r0 = (org.objectweb.asm.tree.TableSwitchInsnNode) r0
                org.objectweb.asm.tree.LabelNode r5 = r0.dflt
                java.util.List<org.objectweb.asm.tree.LabelNode> r0 = r0.labels
                int r0 = r0.size()
            L4a:
                if (r0 != 0) goto L4d
                return
            L4d:
                java.util.HashSet r6 = new java.util.HashSet
                r6.<init>()
                org.objectweb.asm.tree.AbstractInsnNode r7 = org.jacoco.core.internal.analysis.filter.AbstractMatcher.skipNonOpcodes(r5)
                r6.add(r7)
                r7 = 1
            L5a:
                if (r7 > r0) goto La7
            L5c:
                r11.nextIsVar(r1, r2)
                r8 = 18
                r11.nextIs(r8)
                java.lang.String r8 = "equals"
                java.lang.String r9 = "(Ljava/lang/Object;)Z"
                r11.nextIsInvoke(r3, r4, r8, r9)
                r8 = 153(0x99, float:2.14E-43)
                r11.nextIs(r8)
                org.objectweb.asm.tree.AbstractInsnNode r8 = r11.cursor
                org.objectweb.asm.tree.JumpInsnNode r8 = (org.objectweb.asm.tree.JumpInsnNode) r8
                r11.next()
                org.objectweb.asm.tree.AbstractInsnNode r9 = r11.cursor
                if (r9 != 0) goto L7c
                return
            L7c:
                int r9 = r9.getOpcode()
                r10 = 167(0xa7, float:2.34E-43)
                if (r9 != r10) goto L96
                org.objectweb.asm.tree.AbstractInsnNode r9 = r11.cursor
                org.objectweb.asm.tree.JumpInsnNode r9 = (org.objectweb.asm.tree.JumpInsnNode) r9
                org.objectweb.asm.tree.LabelNode r9 = r9.label
                org.objectweb.asm.tree.AbstractInsnNode r9 = org.jacoco.core.internal.analysis.filter.AbstractMatcher.skipNonOpcodes(r9)
                r6.add(r9)
                org.objectweb.asm.tree.LabelNode r8 = r8.label
                if (r8 != r5) goto L5c
                goto La3
            L96:
                if (r7 != r0) goto La6
                org.objectweb.asm.tree.LabelNode r9 = r8.label
                if (r9 != r5) goto La6
                org.objectweb.asm.tree.AbstractInsnNode r9 = r11.cursor
                r6.add(r9)
                r11.cursor = r8
            La3:
                int r7 = r7 + 1
                goto L5a
            La6:
                return
            La7:
                org.objectweb.asm.tree.AbstractInsnNode r0 = r12.getNext()
                org.objectweb.asm.tree.AbstractInsnNode r1 = r11.cursor
                r13.ignore(r0, r1)
                r13.replaceBranches(r12, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jacoco.core.internal.analysis.filter.KotlinWhenStringFilter.Matcher.match(org.objectweb.asm.tree.AbstractInsnNode, org.jacoco.core.internal.analysis.filter.IFilterOutput):void");
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
