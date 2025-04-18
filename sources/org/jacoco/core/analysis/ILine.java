package org.jacoco.core.analysis;

/* loaded from: classes3.dex */
public interface ILine {
    ICounter getBranchCounter();

    ICounter getInstructionCounter();

    int getStatus();
}
