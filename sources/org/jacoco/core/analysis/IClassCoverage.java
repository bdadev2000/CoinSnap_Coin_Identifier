package org.jacoco.core.analysis;

import java.util.Collection;

/* loaded from: classes2.dex */
public interface IClassCoverage extends ISourceNode {
    long getId();

    String[] getInterfaceNames();

    Collection<IMethodCoverage> getMethods();

    String getPackageName();

    String getSignature();

    String getSourceFileName();

    String getSuperName();

    boolean isNoMatch();
}
