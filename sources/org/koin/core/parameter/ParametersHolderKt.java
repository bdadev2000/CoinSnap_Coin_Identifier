package org.koin.core.parameter;

import e0.q;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes.dex */
public final class ParametersHolderKt {
    @NotNull
    public static final ParametersHolder emptyParametersHolder() {
        return new ParametersHolder(null, null, 3, null);
    }

    @NotNull
    public static final ParametersHolder parameterArrayOf(@NotNull Object... objArr) {
        a.s(objArr, "parameters");
        return new ParametersHolder(q.p0(objArr), Boolean.TRUE);
    }

    @NotNull
    public static final ParametersHolder parameterSetOf(@NotNull Object... objArr) {
        a.s(objArr, "parameters");
        return new ParametersHolder(q.p0(objArr), Boolean.FALSE);
    }

    @NotNull
    public static final ParametersHolder parametersOf(@NotNull Object... objArr) {
        a.s(objArr, "parameters");
        return new ParametersHolder(q.p0(objArr), null, 2, null);
    }
}
