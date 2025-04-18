package org.jacoco.core.analysis;

/* loaded from: classes3.dex */
public interface ISourceNode extends ICoverageNode {
    public static final int UNKNOWN_LINE = -1;

    int getFirstLine();

    int getLastLine();

    ILine getLine(int i2);
}
