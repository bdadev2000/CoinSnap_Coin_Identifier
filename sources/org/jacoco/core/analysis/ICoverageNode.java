package org.jacoco.core.analysis;

/* loaded from: classes2.dex */
public interface ICoverageNode {

    /* loaded from: classes2.dex */
    public enum CounterEntity {
        INSTRUCTION,
        BRANCH,
        LINE,
        COMPLEXITY,
        METHOD,
        CLASS
    }

    /* loaded from: classes2.dex */
    public enum ElementType {
        METHOD,
        CLASS,
        SOURCEFILE,
        PACKAGE,
        BUNDLE,
        GROUP
    }

    boolean containsCode();

    ICounter getBranchCounter();

    ICounter getClassCounter();

    ICounter getComplexityCounter();

    ICounter getCounter(CounterEntity counterEntity);

    ElementType getElementType();

    ICounter getInstructionCounter();

    ICounter getLineCounter();

    ICounter getMethodCounter();

    String getName();

    ICoverageNode getPlainCopy();
}
