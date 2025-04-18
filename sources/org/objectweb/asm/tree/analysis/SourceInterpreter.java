package org.objectweb.asm.tree.analysis;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;

/* loaded from: classes3.dex */
public class SourceInterpreter extends Interpreter<SourceValue> implements Opcodes {
    public SourceInterpreter() {
        super(589824);
        if (getClass() != SourceInterpreter.class) {
            throw new IllegalStateException();
        }
    }

    private static <E> boolean containsAll(Set<E> set, Set<E> set2) {
        if (set.size() < set2.size()) {
            return false;
        }
        return set.containsAll(set2);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public void returnOperation(AbstractInsnNode abstractInsnNode, SourceValue sourceValue, SourceValue sourceValue2) {
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue binaryOperation(AbstractInsnNode abstractInsnNode, SourceValue sourceValue, SourceValue sourceValue2) {
        int i2;
        switch (abstractInsnNode.getOpcode()) {
            case 47:
            case 49:
            case Opcodes.LADD /* 97 */:
            case Opcodes.DADD /* 99 */:
            case 101:
            case 103:
            case 105:
            case 107:
            case 109:
            case 111:
            case Opcodes.LREM /* 113 */:
            case Opcodes.DREM /* 115 */:
            case Opcodes.LSHL /* 121 */:
            case Opcodes.LSHR /* 123 */:
            case Opcodes.LUSHR /* 125 */:
            case 127:
            case Opcodes.LOR /* 129 */:
            case Opcodes.LXOR /* 131 */:
                i2 = 2;
                break;
            default:
                i2 = 1;
                break;
        }
        return new SourceValue(i2, abstractInsnNode);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue copyOperation(AbstractInsnNode abstractInsnNode, SourceValue sourceValue) {
        return new SourceValue(sourceValue.getSize(), abstractInsnNode);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue merge(SourceValue sourceValue, SourceValue sourceValue2) {
        Set<AbstractInsnNode> set = sourceValue.insns;
        if (set instanceof SmallSet) {
            Set<AbstractInsnNode> set2 = sourceValue2.insns;
            if (set2 instanceof SmallSet) {
                Set<AbstractInsnNode> union = ((SmallSet) set).union((SmallSet) set2);
                return (union == sourceValue.insns && sourceValue.size == sourceValue2.size) ? sourceValue : new SourceValue(Math.min(sourceValue.size, sourceValue2.size), union);
            }
        }
        if (sourceValue.size == sourceValue2.size && containsAll(set, sourceValue2.insns)) {
            return sourceValue;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(sourceValue.insns);
        hashSet.addAll(sourceValue2.insns);
        return new SourceValue(Math.min(sourceValue.size, sourceValue2.size), hashSet);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue naryOperation(AbstractInsnNode abstractInsnNode, List<? extends SourceValue> list) {
        int size;
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 197) {
            size = 1;
        } else if (opcode == 186) {
            size = Type.getReturnType(((InvokeDynamicInsnNode) abstractInsnNode).desc).getSize();
        } else {
            size = Type.getReturnType(((MethodInsnNode) abstractInsnNode).desc).getSize();
        }
        return new SourceValue(size, abstractInsnNode);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if ((r0 instanceof java.lang.Double) == false) goto L14;
     */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.objectweb.asm.tree.analysis.SourceValue newOperation(org.objectweb.asm.tree.AbstractInsnNode r5) {
        /*
            r4 = this;
            int r0 = r5.getOpcode()
            r1 = 9
            r2 = 2
            if (r0 == r1) goto L3b
            r1 = 10
            if (r0 == r1) goto L3b
            r1 = 14
            if (r0 == r1) goto L3b
            r1 = 15
            if (r0 == r1) goto L3b
            r1 = 18
            r3 = 1
            if (r0 == r1) goto L2e
            r1 = 178(0xb2, float:2.5E-43)
            if (r0 == r1) goto L20
        L1e:
            r2 = r3
            goto L3b
        L20:
            r0 = r5
            org.objectweb.asm.tree.FieldInsnNode r0 = (org.objectweb.asm.tree.FieldInsnNode) r0
            java.lang.String r0 = r0.desc
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getType(r0)
            int r2 = r0.getSize()
            goto L3b
        L2e:
            r0 = r5
            org.objectweb.asm.tree.LdcInsnNode r0 = (org.objectweb.asm.tree.LdcInsnNode) r0
            java.lang.Object r0 = r0.cst
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 != 0) goto L3b
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 == 0) goto L1e
        L3b:
            org.objectweb.asm.tree.analysis.SourceValue r0 = new org.objectweb.asm.tree.analysis.SourceValue
            r0.<init>(r2, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.tree.analysis.SourceInterpreter.newOperation(org.objectweb.asm.tree.AbstractInsnNode):org.objectweb.asm.tree.analysis.SourceValue");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue newValue(Type type) {
        if (type == Type.VOID_TYPE) {
            return null;
        }
        return new SourceValue(type == null ? 1 : type.getSize());
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue ternaryOperation(AbstractInsnNode abstractInsnNode, SourceValue sourceValue, SourceValue sourceValue2, SourceValue sourceValue3) {
        return new SourceValue(1, abstractInsnNode);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue unaryOperation(AbstractInsnNode abstractInsnNode, SourceValue sourceValue) {
        int i2;
        int opcode = abstractInsnNode.getOpcode();
        if (opcode != 117 && opcode != 119 && opcode != 133 && opcode != 135 && opcode != 138 && opcode != 143) {
            if (opcode == 180) {
                i2 = Type.getType(((FieldInsnNode) abstractInsnNode).desc).getSize();
            } else if (opcode != 140 && opcode != 141) {
                i2 = 1;
            }
            return new SourceValue(i2, abstractInsnNode);
        }
        i2 = 2;
        return new SourceValue(i2, abstractInsnNode);
    }

    public SourceInterpreter(int i2) {
        super(i2);
    }
}
