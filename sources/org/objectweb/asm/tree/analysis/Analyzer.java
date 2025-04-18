package org.objectweb.asm.tree.analysis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.IincInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LookupSwitchInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TableSwitchInsnNode;
import org.objectweb.asm.tree.TryCatchBlockNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.objectweb.asm.tree.analysis.Value;

/* loaded from: classes4.dex */
public class Analyzer<V extends Value> implements Opcodes {
    private Frame<V>[] frames;
    private List<TryCatchBlockNode>[] handlers;
    private boolean[] inInstructionsToProcess;
    private InsnList insnList;
    private int insnListSize;
    private int[] instructionsToProcess;
    private final Interpreter<V> interpreter;
    private int numInstructionsToProcess;
    private Subroutine[] subroutines;

    public Analyzer(Interpreter<V> interpreter) {
        this.interpreter = interpreter;
    }

    private Frame<V> computeInitialFrame(String str, MethodNode methodNode) {
        Frame<V> newFrame = newFrame(methodNode.maxLocals, methodNode.maxStack);
        int i2 = 1;
        boolean z2 = (methodNode.access & 8) == 0;
        if (z2) {
            newFrame.setLocal(0, this.interpreter.newParameterValue(z2, 0, Type.getObjectType(str)));
        } else {
            i2 = 0;
        }
        for (Type type : Type.getArgumentTypes(methodNode.desc)) {
            newFrame.setLocal(i2, this.interpreter.newParameterValue(z2, i2, type));
            int i3 = i2 + 1;
            if (type.getSize() == 2) {
                newFrame.setLocal(i3, this.interpreter.newEmptyValue(i3));
                i2 += 2;
            } else {
                i2 = i3;
            }
        }
        while (i2 < methodNode.maxLocals) {
            newFrame.setLocal(i2, this.interpreter.newEmptyValue(i2));
            i2++;
        }
        newFrame.setReturn(this.interpreter.newReturnTypeValue(Type.getReturnType(methodNode.desc)));
        return newFrame;
    }

    private static int computeMaxLocals(MethodNode methodNode) {
        int argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(methodNode.desc) >> 2;
        Iterator<AbstractInsnNode> it = methodNode.instructions.iterator();
        while (it.hasNext()) {
            AbstractInsnNode next = it.next();
            if (next instanceof VarInsnNode) {
                argumentsAndReturnSizes = Math.max(argumentsAndReturnSizes, ((VarInsnNode) next).var + ((next.getOpcode() == 22 || next.getOpcode() == 24 || next.getOpcode() == 55 || next.getOpcode() == 57) ? 2 : 1));
            } else if (next instanceof IincInsnNode) {
                argumentsAndReturnSizes = Math.max(argumentsAndReturnSizes, ((IincInsnNode) next).var + 1);
            }
        }
        return argumentsAndReturnSizes;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [org.objectweb.asm.tree.analysis.Value] */
    private static int computeMaxStack(Frame<?>[] frameArr) {
        int i2 = 0;
        for (Frame<?> frame : frameArr) {
            if (frame != null) {
                int i3 = 0;
                for (int i4 = 0; i4 < frame.getStackSize(); i4++) {
                    i3 += frame.getStack(i4).getSize();
                }
                i2 = Math.max(i2, i3);
            }
        }
        return i2;
    }

    private void findSubroutine(int i2, Subroutine subroutine, List<AbstractInsnNode> list) throws AnalyzerException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i2));
        while (!arrayList.isEmpty()) {
            int intValue = ((Integer) arrayList.remove(arrayList.size() - 1)).intValue();
            if (intValue < 0 || intValue >= this.insnListSize) {
                throw new AnalyzerException(null, "Execution can fall off the end of the code");
            }
            Subroutine[] subroutineArr = this.subroutines;
            if (subroutineArr[intValue] == null) {
                subroutineArr[intValue] = new Subroutine(subroutine);
                AbstractInsnNode abstractInsnNode = this.insnList.get(intValue);
                if (abstractInsnNode instanceof JumpInsnNode) {
                    if (abstractInsnNode.getOpcode() == 168) {
                        list.add(abstractInsnNode);
                    } else {
                        arrayList.add(Integer.valueOf(this.insnList.indexOf(((JumpInsnNode) abstractInsnNode).label)));
                    }
                } else if (abstractInsnNode instanceof TableSwitchInsnNode) {
                    TableSwitchInsnNode tableSwitchInsnNode = (TableSwitchInsnNode) abstractInsnNode;
                    findSubroutine(this.insnList.indexOf(tableSwitchInsnNode.dflt), subroutine, list);
                    for (int size = tableSwitchInsnNode.labels.size() - 1; size >= 0; size--) {
                        arrayList.add(Integer.valueOf(this.insnList.indexOf(tableSwitchInsnNode.labels.get(size))));
                    }
                } else if (abstractInsnNode instanceof LookupSwitchInsnNode) {
                    LookupSwitchInsnNode lookupSwitchInsnNode = (LookupSwitchInsnNode) abstractInsnNode;
                    findSubroutine(this.insnList.indexOf(lookupSwitchInsnNode.dflt), subroutine, list);
                    for (int size2 = lookupSwitchInsnNode.labels.size() - 1; size2 >= 0; size2--) {
                        arrayList.add(Integer.valueOf(this.insnList.indexOf(lookupSwitchInsnNode.labels.get(size2))));
                    }
                }
                List<TryCatchBlockNode> list2 = this.handlers[intValue];
                if (list2 != null) {
                    Iterator<TryCatchBlockNode> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(this.insnList.indexOf(it.next().handler)));
                    }
                }
                int opcode = abstractInsnNode.getOpcode();
                if (opcode != 167 && opcode != 191) {
                    switch (opcode) {
                        case Opcodes.RET /* 169 */:
                        case Opcodes.TABLESWITCH /* 170 */:
                        case Opcodes.LOOKUPSWITCH /* 171 */:
                        case Opcodes.IRETURN /* 172 */:
                        case Opcodes.LRETURN /* 173 */:
                        case Opcodes.FRETURN /* 174 */:
                        case Opcodes.DRETURN /* 175 */:
                        case Opcodes.ARETURN /* 176 */:
                        case Opcodes.RETURN /* 177 */:
                            break;
                        default:
                            arrayList.add(Integer.valueOf(intValue + 1));
                            break;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void merge(int r4, org.objectweb.asm.tree.analysis.Frame<V> r5, org.objectweb.asm.tree.analysis.Subroutine r6) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        /*
            r3 = this;
            org.objectweb.asm.tree.analysis.Frame<V extends org.objectweb.asm.tree.analysis.Value>[] r0 = r3.frames
            r1 = r0[r4]
            r2 = 1
            if (r1 != 0) goto Lf
            org.objectweb.asm.tree.analysis.Frame r5 = r3.newFrame(r5)
            r0[r4] = r5
            r5 = r2
            goto L15
        Lf:
            org.objectweb.asm.tree.analysis.Interpreter<V extends org.objectweb.asm.tree.analysis.Value> r0 = r3.interpreter
            boolean r5 = r1.merge(r5, r0)
        L15:
            org.objectweb.asm.tree.analysis.Subroutine[] r0 = r3.subroutines
            r1 = r0[r4]
            if (r1 != 0) goto L25
            if (r6 == 0) goto L2c
            org.objectweb.asm.tree.analysis.Subroutine r5 = new org.objectweb.asm.tree.analysis.Subroutine
            r5.<init>(r6)
            r0[r4] = r5
            goto L2e
        L25:
            if (r6 == 0) goto L2c
            boolean r6 = r1.merge(r6)
            r5 = r5 | r6
        L2c:
            if (r5 == 0) goto L40
        L2e:
            boolean[] r5 = r3.inInstructionsToProcess
            boolean r6 = r5[r4]
            if (r6 != 0) goto L40
            r5[r4] = r2
            int[] r5 = r3.instructionsToProcess
            int r6 = r3.numInstructionsToProcess
            int r0 = r6 + 1
            r3.numInstructionsToProcess = r0
            r5[r6] = r4
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.tree.analysis.Analyzer.merge(int, org.objectweb.asm.tree.analysis.Frame, org.objectweb.asm.tree.analysis.Subroutine):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0230, code lost:
    
        throw new org.objectweb.asm.tree.analysis.AnalyzerException(r15, "RET instruction outside of a subroutine");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0288 A[Catch: RuntimeException -> 0x013a, AnalyzerException -> 0x013e, TryCatch #1 {AnalyzerException -> 0x013e, blocks: (B:51:0x00f0, B:54:0x00f6, B:61:0x010c, B:64:0x011f, B:66:0x0123, B:69:0x012e, B:70:0x0141, B:72:0x0150, B:73:0x0160, B:76:0x0282, B:78:0x0288, B:79:0x028c, B:81:0x0292, B:83:0x029c, B:84:0x02a7, B:87:0x02ad, B:91:0x02a3, B:95:0x015d, B:96:0x0166, B:98:0x016a, B:99:0x0181, B:101:0x0189, B:103:0x01a3, B:105:0x01a7, B:106:0x01be, B:108:0x01c6, B:114:0x01e7, B:116:0x01ef, B:118:0x0203, B:120:0x0223, B:125:0x0229, B:126:0x0230, B:135:0x0240, B:137:0x0245, B:145:0x025e, B:146:0x0263, B:148:0x0267, B:149:0x0270, B:150:0x0119, B:151:0x027a), top: B:50:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0, types: [org.objectweb.asm.tree.analysis.Analyzer<V extends org.objectweb.asm.tree.analysis.Value>, org.objectweb.asm.tree.analysis.Analyzer] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [org.objectweb.asm.tree.analysis.Subroutine] */
    /* JADX WARN: Type inference failed for: r6v3, types: [org.objectweb.asm.tree.analysis.Subroutine] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.objectweb.asm.tree.analysis.Frame<V>[] analyze(java.lang.String r20, org.objectweb.asm.tree.MethodNode r21) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.tree.analysis.Analyzer.analyze(java.lang.String, org.objectweb.asm.tree.MethodNode):org.objectweb.asm.tree.analysis.Frame[]");
    }

    public Frame<V>[] analyzeAndComputeMaxs(String str, MethodNode methodNode) throws AnalyzerException {
        methodNode.maxLocals = computeMaxLocals(methodNode);
        methodNode.maxStack = -1;
        analyze(str, methodNode);
        methodNode.maxStack = computeMaxStack(this.frames);
        return this.frames;
    }

    public Frame<V>[] getFrames() {
        return this.frames;
    }

    public List<TryCatchBlockNode> getHandlers(int i2) {
        return this.handlers[i2];
    }

    public void init(String str, MethodNode methodNode) throws AnalyzerException {
    }

    public void newControlFlowEdge(int i2, int i3) {
    }

    public boolean newControlFlowExceptionEdge(int i2, int i3) {
        return true;
    }

    public Frame<V> newFrame(int i2, int i3) {
        return new Frame<>(i2, i3);
    }

    public boolean newControlFlowExceptionEdge(int i2, TryCatchBlockNode tryCatchBlockNode) {
        return newControlFlowExceptionEdge(i2, this.insnList.indexOf(tryCatchBlockNode.handler));
    }

    public Frame<V> newFrame(Frame<? extends V> frame) {
        return new Frame<>(frame);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void merge(int i2, Frame<V> frame, Frame<V> frame2, Subroutine subroutine, boolean[] zArr) throws AnalyzerException {
        boolean merge;
        frame2.merge(frame, zArr);
        Frame<V>[] frameArr = this.frames;
        Frame<V> frame3 = frameArr[i2];
        if (frame3 == null) {
            frameArr[i2] = newFrame(frame2);
            merge = true;
        } else {
            merge = frame3.merge(frame2, this.interpreter);
        }
        Subroutine subroutine2 = this.subroutines[i2];
        if (subroutine2 != null && subroutine != null) {
            merge |= subroutine2.merge(subroutine);
        }
        if (merge) {
            boolean[] zArr2 = this.inInstructionsToProcess;
            if (zArr2[i2]) {
                return;
            }
            zArr2[i2] = true;
            int[] iArr = this.instructionsToProcess;
            int i3 = this.numInstructionsToProcess;
            this.numInstructionsToProcess = i3 + 1;
            iArr[i3] = i2;
        }
    }
}
