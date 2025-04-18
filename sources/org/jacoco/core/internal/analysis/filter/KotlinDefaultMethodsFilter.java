package org.jacoco.core.internal.analysis.filter;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

/* loaded from: classes2.dex */
final class KotlinDefaultMethodsFilter implements IFilter {

    /* loaded from: classes2.dex */
    public static class Matcher extends AbstractMatcher {
        private Matcher() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void match(MethodNode methodNode, IFilterOutput iFilterOutput) {
            firstIsALoad0(methodNode);
            nextIs(Opcodes.INVOKESTATIC);
            AbstractInsnNode abstractInsnNode = this.cursor;
            if (abstractInsnNode == null || !((MethodInsnNode) abstractInsnNode).owner.endsWith("$DefaultImpls")) {
                return;
            }
            iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
        }
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if (KotlinGeneratedFilter.isKotlinClass(iFilterContext)) {
            new Matcher().match(methodNode, iFilterOutput);
        }
    }
}
