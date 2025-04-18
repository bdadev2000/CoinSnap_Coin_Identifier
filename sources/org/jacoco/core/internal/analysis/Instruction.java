package org.jacoco.core.internal.analysis;

import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import org.jacoco.core.analysis.ICounter;

/* loaded from: classes3.dex */
public class Instruction {
    private int branches = 0;
    private final BitSet coveredBranches = new BitSet();
    private final int line;
    private Instruction predecessor;
    private int predecessorBranch;

    public Instruction(int i2) {
        this.line = i2;
    }

    private static void propagateExecutedBranch(Instruction instruction, int i2) {
        while (instruction != null) {
            if (!instruction.coveredBranches.isEmpty()) {
                instruction.coveredBranches.set(i2);
                return;
            } else {
                instruction.coveredBranches.set(i2);
                i2 = instruction.predecessorBranch;
                instruction = instruction.predecessor;
            }
        }
    }

    public void addBranch(Instruction instruction, int i2) {
        this.branches++;
        instruction.predecessor = this;
        instruction.predecessorBranch = i2;
        if (instruction.coveredBranches.isEmpty()) {
            return;
        }
        propagateExecutedBranch(this, i2);
    }

    public ICounter getBranchCounter() {
        if (this.branches < 2) {
            return CounterImpl.COUNTER_0_0;
        }
        int cardinality = this.coveredBranches.cardinality();
        return CounterImpl.getInstance(this.branches - cardinality, cardinality);
    }

    public ICounter getInstructionCounter() {
        return this.coveredBranches.isEmpty() ? CounterImpl.COUNTER_1_0 : CounterImpl.COUNTER_0_1;
    }

    public int getLine() {
        return this.line;
    }

    public Instruction merge(Instruction instruction) {
        Instruction instruction2 = new Instruction(this.line);
        instruction2.branches = this.branches;
        instruction2.coveredBranches.or(this.coveredBranches);
        instruction2.coveredBranches.or(instruction.coveredBranches);
        return instruction2;
    }

    public Instruction replaceBranches(Collection<Instruction> collection) {
        Instruction instruction = new Instruction(this.line);
        instruction.branches = collection.size();
        Iterator<Instruction> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (!it.next().coveredBranches.isEmpty()) {
                instruction.coveredBranches.set(i2);
                i2++;
            }
        }
        return instruction;
    }

    public void addBranch(boolean z2, int i2) {
        this.branches++;
        if (z2) {
            propagateExecutedBranch(this, i2);
        }
    }
}
