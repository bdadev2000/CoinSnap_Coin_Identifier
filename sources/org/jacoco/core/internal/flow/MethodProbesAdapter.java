package org.jacoco.core.internal.flow;

import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.commons.AnalyzerAdapter;

/* loaded from: classes4.dex */
public final class MethodProbesAdapter extends MethodVisitor {
    private AnalyzerAdapter analyzer;
    private final IProbeIdGenerator idGenerator;
    private final MethodProbesVisitor probesVisitor;
    private final Map<Label, Label> tryCatchProbeLabels;

    public MethodProbesAdapter(MethodProbesVisitor methodProbesVisitor, IProbeIdGenerator iProbeIdGenerator) {
        super(589824, methodProbesVisitor);
        this.probesVisitor = methodProbesVisitor;
        this.idGenerator = iProbeIdGenerator;
        this.tryCatchProbeLabels = new HashMap();
    }

    private IFrame frame(int i2) {
        return FrameSnapshot.create(this.analyzer, i2);
    }

    private Label getTryCatchLabel(Label label) {
        if (this.tryCatchProbeLabels.containsKey(label)) {
            return this.tryCatchProbeLabels.get(label);
        }
        if (!LabelInfo.needsProbe(label)) {
            return label;
        }
        Label label2 = new Label();
        LabelInfo.setSuccessor(label2);
        this.tryCatchProbeLabels.put(label, label2);
        return label2;
    }

    private int jumpPopCount(int i2) {
        if (i2 == 167) {
            return 0;
        }
        if (i2 == 198 || i2 == 199) {
            return 1;
        }
        switch (i2) {
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
                return 1;
            default:
                return 2;
        }
    }

    private boolean markLabels(Label label, Label[] labelArr) {
        boolean z2;
        LabelInfo.resetDone(labelArr);
        if (LabelInfo.isMultiTarget(label)) {
            LabelInfo.setProbeId(label, this.idGenerator.nextId());
            z2 = true;
        } else {
            z2 = false;
        }
        LabelInfo.setDone(label);
        for (Label label2 : labelArr) {
            if (LabelInfo.isMultiTarget(label2) && !LabelInfo.isDone(label2)) {
                LabelInfo.setProbeId(label2, this.idGenerator.nextId());
                z2 = true;
            }
            LabelInfo.setDone(label2);
        }
        return z2;
    }

    public void setAnalyzer(AnalyzerAdapter analyzerAdapter) {
        this.analyzer = analyzerAdapter;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i2) {
        if (i2 != 191) {
            switch (i2) {
                case Opcodes.IRETURN /* 172 */:
                case Opcodes.LRETURN /* 173 */:
                case Opcodes.FRETURN /* 174 */:
                case Opcodes.DRETURN /* 175 */:
                case Opcodes.ARETURN /* 176 */:
                case Opcodes.RETURN /* 177 */:
                    break;
                default:
                    this.probesVisitor.visitInsn(i2);
                    return;
            }
        }
        this.probesVisitor.visitInsnWithProbe(i2, this.idGenerator.nextId());
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i2, Label label) {
        if (LabelInfo.isMultiTarget(label)) {
            this.probesVisitor.visitJumpInsnWithProbe(i2, label, this.idGenerator.nextId(), frame(jumpPopCount(i2)));
        } else {
            this.probesVisitor.visitJumpInsn(i2, label);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(Label label) {
        if (LabelInfo.needsProbe(label)) {
            if (this.tryCatchProbeLabels.containsKey(label)) {
                this.probesVisitor.visitLabel(this.tryCatchProbeLabels.get(label));
            }
            this.probesVisitor.visitProbe(this.idGenerator.nextId());
        }
        this.probesVisitor.visitLabel(label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        if (markLabels(label, labelArr)) {
            this.probesVisitor.visitLookupSwitchInsnWithProbes(label, iArr, labelArr, frame(1));
        } else {
            this.probesVisitor.visitLookupSwitchInsn(label, iArr, labelArr);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i2, int i3, Label label, Label... labelArr) {
        if (markLabels(label, labelArr)) {
            this.probesVisitor.visitTableSwitchInsnWithProbes(i2, i3, label, labelArr, frame(1));
        } else {
            this.probesVisitor.visitTableSwitchInsn(i2, i3, label, labelArr);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        this.probesVisitor.visitTryCatchBlock(getTryCatchLabel(label), getTryCatchLabel(label2), label3, str);
    }
}
