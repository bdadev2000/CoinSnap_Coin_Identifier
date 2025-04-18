package org.jacoco.core.internal.instr;

import org.jacoco.core.internal.flow.IFrame;
import org.jacoco.core.internal.flow.LabelInfo;
import org.jacoco.core.internal.flow.MethodProbesVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* loaded from: classes4.dex */
class MethodInstrumenter extends MethodProbesVisitor {
    private final IProbeInserter probeInserter;

    public MethodInstrumenter(MethodVisitor methodVisitor, IProbeInserter iProbeInserter) {
        super(methodVisitor);
        this.probeInserter = iProbeInserter;
    }

    private Label createIntermediate(Label label) {
        if (LabelInfo.getProbeId(label) == -1) {
            return label;
        }
        if (LabelInfo.isDone(label)) {
            return LabelInfo.getIntermediateLabel(label);
        }
        Label label2 = new Label();
        LabelInfo.setIntermediateLabel(label, label2);
        LabelInfo.setDone(label);
        return label2;
    }

    private Label[] createIntermediates(Label[] labelArr) {
        Label[] labelArr2 = new Label[labelArr.length];
        for (int i2 = 0; i2 < labelArr.length; i2++) {
            labelArr2[i2] = createIntermediate(labelArr[i2]);
        }
        return labelArr2;
    }

    private int getInverted(int i2) {
        if (i2 == 198) {
            return Opcodes.IFNONNULL;
        }
        if (i2 == 199) {
            return Opcodes.IFNULL;
        }
        switch (i2) {
            case 153:
                return 154;
            case 154:
                return 153;
            case 155:
                return 156;
            case 156:
                return 155;
            case 157:
                return 158;
            case 158:
                return 157;
            case Opcodes.IF_ICMPEQ /* 159 */:
                return Opcodes.IF_ICMPNE;
            case Opcodes.IF_ICMPNE /* 160 */:
                return Opcodes.IF_ICMPEQ;
            case Opcodes.IF_ICMPLT /* 161 */:
                return Opcodes.IF_ICMPGE;
            case Opcodes.IF_ICMPGE /* 162 */:
                return Opcodes.IF_ICMPLT;
            case Opcodes.IF_ICMPGT /* 163 */:
                return Opcodes.IF_ICMPLE;
            case Opcodes.IF_ICMPLE /* 164 */:
                return Opcodes.IF_ICMPGT;
            case Opcodes.IF_ACMPEQ /* 165 */:
                return Opcodes.IF_ACMPNE;
            case Opcodes.IF_ACMPNE /* 166 */:
                return Opcodes.IF_ACMPEQ;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void insertIntermediateProbe(Label label, IFrame iFrame) {
        int probeId = LabelInfo.getProbeId(label);
        if (probeId == -1 || LabelInfo.isDone(label)) {
            return;
        }
        this.mv.visitLabel(LabelInfo.getIntermediateLabel(label));
        iFrame.accept(this.mv);
        this.probeInserter.insertProbe(probeId);
        this.mv.visitJumpInsn(Opcodes.GOTO, label);
        LabelInfo.setDone(label);
    }

    private void insertIntermediateProbes(Label label, Label[] labelArr, IFrame iFrame) {
        LabelInfo.resetDone(label);
        LabelInfo.resetDone(labelArr);
        insertIntermediateProbe(label, iFrame);
        for (Label label2 : labelArr) {
            insertIntermediateProbe(label2, iFrame);
        }
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitInsnWithProbe(int i2, int i3) {
        this.probeInserter.insertProbe(i3);
        this.mv.visitInsn(i2);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitJumpInsnWithProbe(int i2, Label label, int i3, IFrame iFrame) {
        if (i2 == 167) {
            this.probeInserter.insertProbe(i3);
            this.mv.visitJumpInsn(Opcodes.GOTO, label);
            return;
        }
        Label label2 = new Label();
        this.mv.visitJumpInsn(getInverted(i2), label2);
        this.probeInserter.insertProbe(i3);
        this.mv.visitJumpInsn(Opcodes.GOTO, label);
        this.mv.visitLabel(label2);
        iFrame.accept(this.mv);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitLookupSwitchInsnWithProbes(Label label, int[] iArr, Label[] labelArr, IFrame iFrame) {
        LabelInfo.resetDone(label);
        LabelInfo.resetDone(labelArr);
        this.mv.visitLookupSwitchInsn(createIntermediate(label), iArr, createIntermediates(labelArr));
        insertIntermediateProbes(label, labelArr, iFrame);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitProbe(int i2) {
        this.probeInserter.insertProbe(i2);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitTableSwitchInsnWithProbes(int i2, int i3, Label label, Label[] labelArr, IFrame iFrame) {
        LabelInfo.resetDone(label);
        LabelInfo.resetDone(labelArr);
        this.mv.visitTableSwitchInsn(i2, i3, createIntermediate(label), createIntermediates(labelArr));
        insertIntermediateProbes(label, labelArr, iFrame);
    }
}
