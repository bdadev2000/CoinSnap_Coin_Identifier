package org.jacoco.core.internal.analysis.filter;

import android.support.v4.media.d;
import androidx.compose.foundation.text.input.a;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TryCatchBlockNode;

/* loaded from: classes2.dex */
public final class TryWithResourcesEcjFilter implements IFilter {

    /* loaded from: classes2.dex */
    public static class Matcher extends AbstractMatcher {
        private final IFilterOutput output;
        private AbstractInsnNode start;
        private final Map<String, String> owners = new HashMap();
        private final Map<String, LabelNode> labels = new HashMap();

        public Matcher(IFilterOutput iFilterOutput) {
            this.output = iFilterOutput;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean matchEcj() {
            nextIsVar(58, "primaryExc");
            nextIsEcjCloseAndThrow("r0");
            AbstractInsnNode abstractInsnNode = this.cursor;
            String str = "r1";
            int i2 = 1;
            while (nextIsEcjClose(str)) {
                nextIsJump(Opcodes.GOTO, a.j(str, ".end"));
                nextIsEcjSuppress(str);
                nextIsEcjCloseAndThrow(str);
                i2++;
                str = d.i("r", i2);
                abstractInsnNode = this.cursor;
            }
            this.cursor = abstractInsnNode;
            nextIsEcjSuppress("last");
            nextIsVar(25, "primaryExc");
            nextIs(Opcodes.ATHROW);
            AbstractInsnNode abstractInsnNode2 = this.cursor;
            if (abstractInsnNode2 == null) {
                return false;
            }
            AbstractInsnNode previous = this.start.getPrevious();
            this.cursor = previous;
            while (!nextIsEcjClose("r0")) {
                previous = previous.getPrevious();
                this.cursor = previous;
                if (previous == null) {
                    return false;
                }
            }
            AbstractInsnNode next = previous.getNext();
            next();
            AbstractInsnNode abstractInsnNode3 = this.cursor;
            if (abstractInsnNode3 == null || abstractInsnNode3.getOpcode() != 167) {
                return false;
            }
            this.output.ignore(next, this.cursor);
            this.output.ignore(this.start, abstractInsnNode2);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean matchEcjNoFlowOut() {
            nextIsVar(58, "primaryExc");
            AbstractInsnNode abstractInsnNode = this.cursor;
            int i2 = 0;
            String str = "r0";
            while (nextIsEcjCloseAndThrow(str) && nextIsEcjSuppress(str)) {
                i2++;
                str = d.i("r", i2);
                abstractInsnNode = this.cursor;
            }
            this.cursor = abstractInsnNode;
            nextIsVar(25, "primaryExc");
            nextIs(Opcodes.ATHROW);
            AbstractInsnNode abstractInsnNode2 = this.cursor;
            if (abstractInsnNode2 == null) {
                return false;
            }
            AbstractInsnNode previous = this.start.getPrevious();
            this.cursor = previous;
            while (!nextIsEcjClose("r0")) {
                previous = previous.getPrevious();
                this.cursor = previous;
                if (previous == null) {
                    return false;
                }
            }
            AbstractInsnNode next = previous.getNext();
            for (int i3 = 1; i3 < i2; i3++) {
                if (!nextIsEcjClose(d.i("r", i3))) {
                    return false;
                }
            }
            this.output.ignore(next, this.cursor);
            this.output.ignore(this.start, abstractInsnNode2);
            return true;
        }

        private void nextIsClose(String str) {
            nextIsVar(25, str);
            next();
            AbstractInsnNode abstractInsnNode = this.cursor;
            if (abstractInsnNode == null) {
                return;
            }
            if (abstractInsnNode.getOpcode() != 185 && this.cursor.getOpcode() != 182) {
                this.cursor = null;
                return;
            }
            MethodInsnNode methodInsnNode = (MethodInsnNode) this.cursor;
            if (!"close".equals(methodInsnNode.name) || !"()V".equals(methodInsnNode.desc)) {
                this.cursor = null;
                return;
            }
            String str2 = methodInsnNode.owner;
            String str3 = this.owners.get(str);
            if (str3 == null) {
                this.owners.put(str, str2);
            } else {
                if (str3.equals(str2)) {
                    return;
                }
                this.cursor = null;
            }
        }

        private boolean nextIsEcjClose(String str) {
            nextIsVar(25, str);
            nextIsJump(Opcodes.IFNULL, a.j(str, ".end"));
            nextIsClose(str);
            return this.cursor != null;
        }

        private boolean nextIsEcjCloseAndThrow(String str) {
            nextIsVar(25, str);
            nextIsJump(Opcodes.IFNULL, str);
            nextIsClose(str);
            nextIsLabel(str);
            nextIsVar(25, "primaryExc");
            nextIs(Opcodes.ATHROW);
            return this.cursor != null;
        }

        private boolean nextIsEcjSuppress(String str) {
            String j2 = a.j(str, ".t");
            String j3 = a.j(str, ".suppressStart");
            String j4 = a.j(str, ".suppressEnd");
            nextIsVar(58, j2);
            nextIsVar(25, "primaryExc");
            nextIsJump(Opcodes.IFNONNULL, j3);
            nextIsVar(25, j2);
            nextIsVar(58, "primaryExc");
            nextIsJump(Opcodes.GOTO, j4);
            nextIsLabel(j3);
            nextIsVar(25, "primaryExc");
            nextIsVar(25, j2);
            nextIsJump(Opcodes.IF_ACMPEQ, j4);
            nextIsVar(25, "primaryExc");
            nextIsVar(25, j2);
            nextIsInvoke(Opcodes.INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V");
            nextIsLabel(j4);
            return this.cursor != null;
        }

        private void nextIsJump(int i2, String str) {
            nextIs(i2);
            AbstractInsnNode abstractInsnNode = this.cursor;
            if (abstractInsnNode == null) {
                return;
            }
            LabelNode labelNode = ((JumpInsnNode) abstractInsnNode).label;
            LabelNode labelNode2 = this.labels.get(str);
            if (labelNode2 == null) {
                this.labels.put(str, labelNode);
            } else if (labelNode2 != labelNode) {
                this.cursor = null;
            }
        }

        private void nextIsLabel(String str) {
            AbstractInsnNode abstractInsnNode = this.cursor;
            if (abstractInsnNode == null) {
                return;
            }
            AbstractInsnNode next = abstractInsnNode.getNext();
            this.cursor = next;
            if (next.getType() != 8) {
                this.cursor = null;
                return;
            }
            if (this.labels.get(str) != ((LabelNode) this.cursor)) {
                this.cursor = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void start(AbstractInsnNode abstractInsnNode) {
            this.start = abstractInsnNode;
            this.cursor = abstractInsnNode.getPrevious();
            this.vars.clear();
            this.labels.clear();
            this.owners.clear();
        }
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if (methodNode.tryCatchBlocks.isEmpty()) {
            return;
        }
        Matcher matcher = new Matcher(iFilterOutput);
        for (TryCatchBlockNode tryCatchBlockNode : methodNode.tryCatchBlocks) {
            if (tryCatchBlockNode.type == null) {
                matcher.start(tryCatchBlockNode.handler);
                if (!matcher.matchEcj()) {
                    matcher.start(tryCatchBlockNode.handler);
                    matcher.matchEcjNoFlowOut();
                }
            }
        }
    }
}
