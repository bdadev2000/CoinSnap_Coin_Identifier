package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.MethodVisitor;

/* loaded from: classes4.dex */
public class FrameNode extends AbstractInsnNode {
    public List<Object> local;
    public List<Object> stack;
    public int type;

    private FrameNode() {
        super(-1);
    }

    private static Object[] asArray(List<Object> list) {
        int size = list.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof LabelNode) {
                obj = ((LabelNode) obj).getLabel();
            }
            objArr[i2] = obj;
        }
        return objArr;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        int i2 = this.type;
        if (i2 == -1 || i2 == 0) {
            methodVisitor.visitFrame(i2, this.local.size(), asArray(this.local), this.stack.size(), asArray(this.stack));
            return;
        }
        if (i2 == 1) {
            methodVisitor.visitFrame(i2, this.local.size(), asArray(this.local), 0, null);
            return;
        }
        if (i2 == 2) {
            methodVisitor.visitFrame(i2, this.local.size(), null, 0, null);
        } else if (i2 == 3) {
            methodVisitor.visitFrame(i2, 0, null, 0, null);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException();
            }
            methodVisitor.visitFrame(i2, 0, null, 1, asArray(this.stack));
        }
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        FrameNode frameNode = new FrameNode();
        frameNode.type = this.type;
        if (this.local != null) {
            frameNode.local = new ArrayList();
            int size = this.local.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = this.local.get(i2);
                if (obj instanceof LabelNode) {
                    obj = map.get(obj);
                }
                frameNode.local.add(obj);
            }
        }
        if (this.stack != null) {
            frameNode.stack = new ArrayList();
            int size2 = this.stack.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Object obj2 = this.stack.get(i3);
                if (obj2 instanceof LabelNode) {
                    obj2 = map.get(obj2);
                }
                frameNode.stack.add(obj2);
            }
        }
        return frameNode;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 14;
    }

    public FrameNode(int i2, int i3, Object[] objArr, int i4, Object[] objArr2) {
        super(-1);
        this.type = i2;
        if (i2 == -1 || i2 == 0) {
            this.local = Util.asArrayList(i3, objArr);
            this.stack = Util.asArrayList(i4, objArr2);
            return;
        }
        if (i2 == 1) {
            this.local = Util.asArrayList(i3, objArr);
            return;
        }
        if (i2 == 2) {
            this.local = Util.asArrayList(i3);
        } else if (i2 != 3) {
            if (i2 == 4) {
                this.stack = Util.asArrayList(1, objArr2);
                return;
            }
            throw new IllegalArgumentException();
        }
    }
}
