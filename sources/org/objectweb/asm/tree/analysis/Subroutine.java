package org.objectweb.asm.tree.analysis;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;

/* loaded from: classes.dex */
final class Subroutine {
    final List<JumpInsnNode> callers;
    final boolean[] localsUsed;
    final LabelNode start;

    public Subroutine(LabelNode labelNode, int i2, JumpInsnNode jumpInsnNode) {
        this.start = labelNode;
        this.localsUsed = new boolean[i2];
        ArrayList arrayList = new ArrayList();
        this.callers = arrayList;
        arrayList.add(jumpInsnNode);
    }

    public boolean merge(Subroutine subroutine) {
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            boolean[] zArr = this.localsUsed;
            if (i2 >= zArr.length) {
                break;
            }
            if (subroutine.localsUsed[i2] && !zArr[i2]) {
                zArr[i2] = true;
                z2 = true;
            }
            i2++;
        }
        if (subroutine.start == this.start) {
            for (int i3 = 0; i3 < subroutine.callers.size(); i3++) {
                JumpInsnNode jumpInsnNode = subroutine.callers.get(i3);
                if (!this.callers.contains(jumpInsnNode)) {
                    this.callers.add(jumpInsnNode);
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public Subroutine(Subroutine subroutine) {
        this.start = subroutine.start;
        this.localsUsed = (boolean[]) subroutine.localsUsed.clone();
        this.callers = new ArrayList(subroutine.callers);
    }
}
