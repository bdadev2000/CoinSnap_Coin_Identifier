package org.jacoco.core.internal.analysis;

import org.jacoco.core.analysis.CoverageNodeImpl;
import org.jacoco.core.analysis.ICounter;
import org.jacoco.core.analysis.ICoverageNode;
import org.jacoco.core.analysis.ILine;
import org.jacoco.core.analysis.ISourceNode;

/* loaded from: classes4.dex */
public class SourceNodeImpl extends CoverageNodeImpl implements ISourceNode {
    private LineImpl[] lines;
    private int offset;

    public SourceNodeImpl(ICoverageNode.ElementType elementType, String str) {
        super(elementType, str);
        this.lines = null;
        this.offset = -1;
    }

    private void incrementLine(ICounter iCounter, ICounter iCounter2, int i2) {
        ensureCapacity(i2, i2);
        LineImpl line = getLine(i2);
        int totalCount = line.getInstructionCounter().getTotalCount();
        int coveredCount = line.getInstructionCounter().getCoveredCount();
        this.lines[i2 - this.offset] = line.increment(iCounter, iCounter2);
        if (iCounter.getTotalCount() > 0) {
            if (iCounter.getCoveredCount() == 0) {
                if (totalCount == 0) {
                    this.lineCounter = this.lineCounter.increment(CounterImpl.COUNTER_1_0);
                }
            } else if (totalCount == 0) {
                this.lineCounter = this.lineCounter.increment(CounterImpl.COUNTER_0_1);
            } else if (coveredCount == 0) {
                this.lineCounter = this.lineCounter.increment(-1, 1);
            }
        }
    }

    public void ensureCapacity(int i2, int i3) {
        if (i2 == -1 || i3 == -1) {
            return;
        }
        if (this.lines == null) {
            this.offset = i2;
            this.lines = new LineImpl[(i3 - i2) + 1];
            return;
        }
        int min = Math.min(getFirstLine(), i2);
        int max = (Math.max(getLastLine(), i3) - min) + 1;
        LineImpl[] lineImplArr = this.lines;
        if (max > lineImplArr.length) {
            LineImpl[] lineImplArr2 = new LineImpl[max];
            System.arraycopy(lineImplArr, 0, lineImplArr2, this.offset - min, lineImplArr.length);
            this.offset = min;
            this.lines = lineImplArr2;
        }
    }

    @Override // org.jacoco.core.analysis.ISourceNode
    public int getFirstLine() {
        return this.offset;
    }

    @Override // org.jacoco.core.analysis.ISourceNode
    public int getLastLine() {
        if (this.lines == null) {
            return -1;
        }
        return (this.offset + r0.length) - 1;
    }

    public void increment(ISourceNode iSourceNode) {
        this.instructionCounter = this.instructionCounter.increment(iSourceNode.getInstructionCounter());
        this.branchCounter = this.branchCounter.increment(iSourceNode.getBranchCounter());
        this.complexityCounter = this.complexityCounter.increment(iSourceNode.getComplexityCounter());
        this.methodCounter = this.methodCounter.increment(iSourceNode.getMethodCounter());
        this.classCounter = this.classCounter.increment(iSourceNode.getClassCounter());
        int firstLine = iSourceNode.getFirstLine();
        if (firstLine != -1) {
            int lastLine = iSourceNode.getLastLine();
            ensureCapacity(firstLine, lastLine);
            while (firstLine <= lastLine) {
                ILine line = iSourceNode.getLine(firstLine);
                incrementLine(line.getInstructionCounter(), line.getBranchCounter(), firstLine);
                firstLine++;
            }
        }
    }

    @Override // org.jacoco.core.analysis.ISourceNode
    public LineImpl getLine(int i2) {
        if (this.lines != null && i2 >= getFirstLine() && i2 <= getLastLine()) {
            LineImpl lineImpl = this.lines[i2 - this.offset];
            return lineImpl == null ? LineImpl.EMPTY : lineImpl;
        }
        return LineImpl.EMPTY;
    }

    public void increment(ICounter iCounter, ICounter iCounter2, int i2) {
        if (i2 != -1) {
            incrementLine(iCounter, iCounter2, i2);
        }
        this.instructionCounter = this.instructionCounter.increment(iCounter);
        this.branchCounter = this.branchCounter.increment(iCounter2);
    }
}
