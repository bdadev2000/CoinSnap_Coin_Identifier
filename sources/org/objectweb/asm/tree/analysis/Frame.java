package org.objectweb.asm.tree.analysis;

import android.support.v4.media.d;
import java.util.ArrayList;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.IincInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.objectweb.asm.tree.analysis.Value;

/* loaded from: classes4.dex */
public class Frame<V extends Value> {
    private static final int MAX_STACK_SIZE = 65536;
    private int maxStack;
    private int numLocals;
    private int numStack;
    private V returnValue;
    private V[] values;

    public Frame(int i2, int i3) {
        this.values = (V[]) new Value[(i3 >= 0 ? i3 : 4) + i2];
        this.numLocals = i2;
        this.numStack = 0;
        this.maxStack = i3 < 0 ? 65536 : i3;
    }

    private boolean executeDupX2(AbstractInsnNode abstractInsnNode, V v2, Interpreter<V> interpreter) throws AnalyzerException {
        V pop = pop();
        if (pop.getSize() != 1) {
            push(interpreter.copyOperation(abstractInsnNode, v2));
            push(pop);
            push(v2);
            return true;
        }
        V pop2 = pop();
        if (pop2.getSize() != 1) {
            return false;
        }
        push(interpreter.copyOperation(abstractInsnNode, v2));
        push(pop2);
        push(pop);
        push(v2);
        return true;
    }

    private void executeInvokeInsn(AbstractInsnNode abstractInsnNode, String str, Interpreter<V> interpreter) throws AnalyzerException {
        ArrayList arrayList = new ArrayList();
        for (int length = Type.getArgumentTypes(str).length; length > 0; length--) {
            arrayList.add(0, pop());
        }
        if (abstractInsnNode.getOpcode() != 184 && abstractInsnNode.getOpcode() != 186) {
            arrayList.add(0, pop());
        }
        if (Type.getReturnType(str) == Type.VOID_TYPE) {
            interpreter.naryOperation(abstractInsnNode, arrayList);
        } else {
            push(interpreter.naryOperation(abstractInsnNode, arrayList));
        }
    }

    public void clearStack() {
        this.numStack = 0;
    }

    public void execute(AbstractInsnNode abstractInsnNode, Interpreter<V> interpreter) throws AnalyzerException {
        int i2;
        V local;
        int opcode = abstractInsnNode.getOpcode();
        switch (opcode) {
            case 0:
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                push(interpreter.newOperation(abstractInsnNode));
                return;
            default:
                switch (opcode) {
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                        push(interpreter.copyOperation(abstractInsnNode, getLocal(((VarInsnNode) abstractInsnNode).var)));
                        return;
                    default:
                        switch (opcode) {
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                                break;
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                                V copyOperation = interpreter.copyOperation(abstractInsnNode, pop());
                                int i3 = ((VarInsnNode) abstractInsnNode).var;
                                setLocal(i3, copyOperation);
                                if (copyOperation.getSize() == 2) {
                                    int i4 = i3 + 1;
                                    setLocal(i4, interpreter.newEmptyValue(i4));
                                }
                                if (i3 <= 0 || (local = getLocal((i2 = i3 - 1))) == null || local.getSize() != 2) {
                                    return;
                                }
                                setLocal(i2, interpreter.newEmptyValue(i2));
                                return;
                            default:
                                switch (opcode) {
                                    case Opcodes.IASTORE /* 79 */:
                                    case Opcodes.LASTORE /* 80 */:
                                    case Opcodes.FASTORE /* 81 */:
                                    case Opcodes.DASTORE /* 82 */:
                                    case Opcodes.AASTORE /* 83 */:
                                    case Opcodes.BASTORE /* 84 */:
                                    case Opcodes.CASTORE /* 85 */:
                                    case Opcodes.SASTORE /* 86 */:
                                        interpreter.ternaryOperation(abstractInsnNode, pop(), pop(), pop());
                                        return;
                                    case Opcodes.POP /* 87 */:
                                        if (pop().getSize() == 2) {
                                            throw new AnalyzerException(abstractInsnNode, "Illegal use of POP");
                                        }
                                        return;
                                    case Opcodes.POP2 /* 88 */:
                                        if (pop().getSize() == 1 && pop().getSize() != 1) {
                                            throw new AnalyzerException(abstractInsnNode, "Illegal use of POP2");
                                        }
                                        return;
                                    case Opcodes.DUP /* 89 */:
                                        V pop = pop();
                                        if (pop.getSize() != 1) {
                                            throw new AnalyzerException(abstractInsnNode, "Illegal use of DUP");
                                        }
                                        push(pop);
                                        push(interpreter.copyOperation(abstractInsnNode, pop));
                                        return;
                                    case 90:
                                        V pop2 = pop();
                                        V pop3 = pop();
                                        if (pop2.getSize() != 1 || pop3.getSize() != 1) {
                                            throw new AnalyzerException(abstractInsnNode, "Illegal use of DUP_X1");
                                        }
                                        push(interpreter.copyOperation(abstractInsnNode, pop2));
                                        push(pop3);
                                        push(pop2);
                                        return;
                                    case Opcodes.DUP_X2 /* 91 */:
                                        V pop4 = pop();
                                        if (pop4.getSize() != 1 || !executeDupX2(abstractInsnNode, pop4, interpreter)) {
                                            throw new AnalyzerException(abstractInsnNode, "Illegal use of DUP_X2");
                                        }
                                        return;
                                    case Opcodes.DUP2 /* 92 */:
                                        V pop5 = pop();
                                        if (pop5.getSize() != 1) {
                                            push(pop5);
                                            push(interpreter.copyOperation(abstractInsnNode, pop5));
                                            return;
                                        }
                                        V pop6 = pop();
                                        if (pop6.getSize() != 1) {
                                            throw new AnalyzerException(abstractInsnNode, "Illegal use of DUP2");
                                        }
                                        push(pop6);
                                        push(pop5);
                                        push(interpreter.copyOperation(abstractInsnNode, pop6));
                                        push(interpreter.copyOperation(abstractInsnNode, pop5));
                                        return;
                                    case Opcodes.DUP2_X1 /* 93 */:
                                        V pop7 = pop();
                                        if (pop7.getSize() == 1) {
                                            V pop8 = pop();
                                            if (pop8.getSize() == 1) {
                                                V pop9 = pop();
                                                if (pop9.getSize() == 1) {
                                                    push(interpreter.copyOperation(abstractInsnNode, pop8));
                                                    push(interpreter.copyOperation(abstractInsnNode, pop7));
                                                    push(pop9);
                                                    push(pop8);
                                                    push(pop7);
                                                    return;
                                                }
                                            }
                                        } else {
                                            V pop10 = pop();
                                            if (pop10.getSize() == 1) {
                                                push(interpreter.copyOperation(abstractInsnNode, pop7));
                                                push(pop10);
                                                push(pop7);
                                                return;
                                            }
                                        }
                                        throw new AnalyzerException(abstractInsnNode, "Illegal use of DUP2_X1");
                                    case Opcodes.DUP2_X2 /* 94 */:
                                        V pop11 = pop();
                                        if (pop11.getSize() == 1) {
                                            V pop12 = pop();
                                            if (pop12.getSize() == 1) {
                                                V pop13 = pop();
                                                if (pop13.getSize() != 1) {
                                                    push(interpreter.copyOperation(abstractInsnNode, pop12));
                                                    push(interpreter.copyOperation(abstractInsnNode, pop11));
                                                    push(pop13);
                                                    push(pop12);
                                                    push(pop11);
                                                    return;
                                                }
                                                V pop14 = pop();
                                                if (pop14.getSize() == 1) {
                                                    push(interpreter.copyOperation(abstractInsnNode, pop12));
                                                    push(interpreter.copyOperation(abstractInsnNode, pop11));
                                                    push(pop14);
                                                    push(pop13);
                                                    push(pop12);
                                                    push(pop11);
                                                    return;
                                                }
                                            }
                                        } else if (executeDupX2(abstractInsnNode, pop11, interpreter)) {
                                            return;
                                        }
                                        throw new AnalyzerException(abstractInsnNode, "Illegal use of DUP2_X2");
                                    case Opcodes.SWAP /* 95 */:
                                        V pop15 = pop();
                                        V pop16 = pop();
                                        if (pop16.getSize() != 1 || pop15.getSize() != 1) {
                                            throw new AnalyzerException(abstractInsnNode, "Illegal use of SWAP");
                                        }
                                        push(interpreter.copyOperation(abstractInsnNode, pop15));
                                        push(interpreter.copyOperation(abstractInsnNode, pop16));
                                        return;
                                    case 96:
                                    case Opcodes.LADD /* 97 */:
                                    case Opcodes.FADD /* 98 */:
                                    case Opcodes.DADD /* 99 */:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case Opcodes.LREM /* 113 */:
                                    case Opcodes.FREM /* 114 */:
                                    case Opcodes.DREM /* 115 */:
                                    case 120:
                                    case Opcodes.LSHL /* 121 */:
                                    case 122:
                                    case Opcodes.LSHR /* 123 */:
                                    case 124:
                                    case Opcodes.LUSHR /* 125 */:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case Opcodes.LOR /* 129 */:
                                    case 130:
                                    case Opcodes.LXOR /* 131 */:
                                    case Opcodes.LCMP /* 148 */:
                                    case Opcodes.FCMPL /* 149 */:
                                    case Opcodes.FCMPG /* 150 */:
                                    case Opcodes.DCMPL /* 151 */:
                                    case Opcodes.DCMPG /* 152 */:
                                        break;
                                    case 116:
                                    case Opcodes.LNEG /* 117 */:
                                    case Opcodes.FNEG /* 118 */:
                                    case Opcodes.DNEG /* 119 */:
                                        push(interpreter.unaryOperation(abstractInsnNode, pop()));
                                        return;
                                    case Opcodes.IINC /* 132 */:
                                        int i5 = ((IincInsnNode) abstractInsnNode).var;
                                        setLocal(i5, interpreter.unaryOperation(abstractInsnNode, getLocal(i5)));
                                        return;
                                    case Opcodes.I2L /* 133 */:
                                    case Opcodes.I2F /* 134 */:
                                    case Opcodes.I2D /* 135 */:
                                    case Opcodes.L2I /* 136 */:
                                    case Opcodes.L2F /* 137 */:
                                    case Opcodes.L2D /* 138 */:
                                    case Opcodes.F2I /* 139 */:
                                    case Opcodes.F2L /* 140 */:
                                    case Opcodes.F2D /* 141 */:
                                    case Opcodes.D2I /* 142 */:
                                    case Opcodes.D2L /* 143 */:
                                    case Opcodes.D2F /* 144 */:
                                    case Opcodes.I2B /* 145 */:
                                    case Opcodes.I2C /* 146 */:
                                    case Opcodes.I2S /* 147 */:
                                        push(interpreter.unaryOperation(abstractInsnNode, pop()));
                                        return;
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                        interpreter.unaryOperation(abstractInsnNode, pop());
                                        return;
                                    case Opcodes.IF_ICMPEQ /* 159 */:
                                    case Opcodes.IF_ICMPNE /* 160 */:
                                    case Opcodes.IF_ICMPLT /* 161 */:
                                    case Opcodes.IF_ICMPGE /* 162 */:
                                    case Opcodes.IF_ICMPGT /* 163 */:
                                    case Opcodes.IF_ICMPLE /* 164 */:
                                    case Opcodes.IF_ACMPEQ /* 165 */:
                                    case Opcodes.IF_ACMPNE /* 166 */:
                                    case Opcodes.PUTFIELD /* 181 */:
                                        interpreter.binaryOperation(abstractInsnNode, pop(), pop());
                                        return;
                                    case Opcodes.GOTO /* 167 */:
                                    case Opcodes.RET /* 169 */:
                                        return;
                                    case Opcodes.JSR /* 168 */:
                                        push(interpreter.newOperation(abstractInsnNode));
                                        return;
                                    case Opcodes.TABLESWITCH /* 170 */:
                                    case Opcodes.LOOKUPSWITCH /* 171 */:
                                        interpreter.unaryOperation(abstractInsnNode, pop());
                                        return;
                                    case Opcodes.IRETURN /* 172 */:
                                    case Opcodes.LRETURN /* 173 */:
                                    case Opcodes.FRETURN /* 174 */:
                                    case Opcodes.DRETURN /* 175 */:
                                    case Opcodes.ARETURN /* 176 */:
                                        V pop17 = pop();
                                        interpreter.unaryOperation(abstractInsnNode, pop17);
                                        interpreter.returnOperation(abstractInsnNode, pop17, this.returnValue);
                                        return;
                                    case Opcodes.RETURN /* 177 */:
                                        if (this.returnValue != null) {
                                            throw new AnalyzerException(abstractInsnNode, "Incompatible return type");
                                        }
                                        return;
                                    case Opcodes.GETSTATIC /* 178 */:
                                        push(interpreter.newOperation(abstractInsnNode));
                                        return;
                                    case Opcodes.PUTSTATIC /* 179 */:
                                        interpreter.unaryOperation(abstractInsnNode, pop());
                                        return;
                                    case Opcodes.GETFIELD /* 180 */:
                                        push(interpreter.unaryOperation(abstractInsnNode, pop()));
                                        return;
                                    case Opcodes.INVOKEVIRTUAL /* 182 */:
                                    case Opcodes.INVOKESPECIAL /* 183 */:
                                    case Opcodes.INVOKESTATIC /* 184 */:
                                    case Opcodes.INVOKEINTERFACE /* 185 */:
                                        executeInvokeInsn(abstractInsnNode, ((MethodInsnNode) abstractInsnNode).desc, interpreter);
                                        return;
                                    case Opcodes.INVOKEDYNAMIC /* 186 */:
                                        executeInvokeInsn(abstractInsnNode, ((InvokeDynamicInsnNode) abstractInsnNode).desc, interpreter);
                                        return;
                                    case Opcodes.NEW /* 187 */:
                                        push(interpreter.newOperation(abstractInsnNode));
                                        return;
                                    case Opcodes.NEWARRAY /* 188 */:
                                    case Opcodes.ANEWARRAY /* 189 */:
                                    case 190:
                                        push(interpreter.unaryOperation(abstractInsnNode, pop()));
                                        return;
                                    case Opcodes.ATHROW /* 191 */:
                                        interpreter.unaryOperation(abstractInsnNode, pop());
                                        return;
                                    case Opcodes.CHECKCAST /* 192 */:
                                    case Opcodes.INSTANCEOF /* 193 */:
                                        push(interpreter.unaryOperation(abstractInsnNode, pop()));
                                        return;
                                    case Opcodes.MONITORENTER /* 194 */:
                                    case Opcodes.MONITOREXIT /* 195 */:
                                        interpreter.unaryOperation(abstractInsnNode, pop());
                                        return;
                                    default:
                                        switch (opcode) {
                                            case Opcodes.MULTIANEWARRAY /* 197 */:
                                                ArrayList arrayList = new ArrayList();
                                                for (int i6 = ((MultiANewArrayInsnNode) abstractInsnNode).dims; i6 > 0; i6--) {
                                                    arrayList.add(0, pop());
                                                }
                                                push(interpreter.naryOperation(abstractInsnNode, arrayList));
                                                return;
                                            case Opcodes.IFNULL /* 198 */:
                                            case Opcodes.IFNONNULL /* 199 */:
                                                interpreter.unaryOperation(abstractInsnNode, pop());
                                                return;
                                            default:
                                                throw new AnalyzerException(abstractInsnNode, "Illegal opcode " + abstractInsnNode.getOpcode());
                                        }
                                }
                        }
                        push(interpreter.binaryOperation(abstractInsnNode, pop(), pop()));
                        return;
                }
        }
    }

    public V getLocal(int i2) {
        if (i2 < this.numLocals) {
            return this.values[i2];
        }
        throw new IndexOutOfBoundsException(d.i("Trying to get an inexistant local variable ", i2));
    }

    public int getLocals() {
        return this.numLocals;
    }

    public int getMaxStackSize() {
        return this.maxStack;
    }

    public V getStack(int i2) {
        return this.values[this.numLocals + i2];
    }

    public int getStackSize() {
        return this.numStack;
    }

    public Frame<V> init(Frame<? extends V> frame) {
        this.returnValue = frame.returnValue;
        V[] vArr = this.values;
        int length = vArr.length;
        Object[] objArr = frame.values;
        if (length < objArr.length) {
            this.values = (V[]) ((Value[]) objArr.clone());
        } else {
            System.arraycopy(objArr, 0, vArr, 0, objArr.length);
        }
        this.numLocals = frame.numLocals;
        this.numStack = frame.numStack;
        this.maxStack = frame.maxStack;
        return this;
    }

    public void initJumpTarget(int i2, LabelNode labelNode) {
    }

    public boolean merge(Frame<? extends V> frame, Interpreter<V> interpreter) throws AnalyzerException {
        if (this.numStack != frame.numStack) {
            throw new AnalyzerException(null, "Incompatible stack heights");
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < this.numLocals + this.numStack; i2++) {
            V merge = interpreter.merge(this.values[i2], frame.values[i2]);
            if (!merge.equals(this.values[i2])) {
                this.values[i2] = merge;
                z2 = true;
            }
        }
        return z2;
    }

    public V pop() {
        int i2 = this.numStack;
        if (i2 == 0) {
            throw new IndexOutOfBoundsException("Cannot pop operand off an empty stack.");
        }
        V[] vArr = this.values;
        int i3 = this.numLocals;
        int i4 = i2 - 1;
        this.numStack = i4;
        return vArr[i3 + i4];
    }

    public void push(V v2) {
        int i2 = this.numLocals;
        int i3 = this.numStack;
        int i4 = i2 + i3;
        V[] vArr = this.values;
        if (i4 >= vArr.length) {
            if (i2 + i3 >= this.maxStack) {
                throw new IndexOutOfBoundsException("Insufficient maximum stack size.");
            }
            V[] vArr2 = (V[]) new Value[vArr.length * 2];
            this.values = vArr2;
            System.arraycopy(vArr, 0, vArr2, 0, vArr.length);
        }
        V[] vArr3 = this.values;
        int i5 = this.numLocals;
        int i6 = this.numStack;
        this.numStack = i6 + 1;
        vArr3[i5 + i6] = v2;
    }

    public void setLocal(int i2, V v2) {
        if (i2 >= this.numLocals) {
            throw new IndexOutOfBoundsException(d.i("Trying to set an inexistant local variable ", i2));
        }
        this.values[i2] = v2;
    }

    public void setReturn(V v2) {
        this.returnValue = v2;
    }

    public void setStack(int i2, V v2) {
        this.values[this.numLocals + i2] = v2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < getLocals(); i2++) {
            sb.append(getLocal(i2));
        }
        sb.append(' ');
        for (int i3 = 0; i3 < getStackSize(); i3++) {
            sb.append(getStack(i3).toString());
        }
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Frame(org.objectweb.asm.tree.analysis.Frame<? extends V> r3) {
        /*
            r2 = this;
            int r0 = r3.numLocals
            V extends org.objectweb.asm.tree.analysis.Value[] r1 = r3.values
            int r1 = r1.length
            int r1 = r1 - r0
            r2.<init>(r0, r1)
            r2.init(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.tree.analysis.Frame.<init>(org.objectweb.asm.tree.analysis.Frame):void");
    }

    public boolean merge(Frame<? extends V> frame, boolean[] zArr) {
        boolean z2 = false;
        for (int i2 = 0; i2 < this.numLocals; i2++) {
            if (!zArr[i2] && !this.values[i2].equals(frame.values[i2])) {
                ((V[]) this.values)[i2] = ((Object[]) frame.values)[i2];
                z2 = true;
            }
        }
        return z2;
    }
}
