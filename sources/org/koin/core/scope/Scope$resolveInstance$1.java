package org.koin.core.scope;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import q0.a;

/* loaded from: classes.dex */
public final class Scope$resolveInstance$1 extends r implements a {
    final /* synthetic */ ParametersHolder $parameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scope$resolveInstance$1(ParametersHolder parametersHolder) {
        super(0);
        this.$parameters = parametersHolder;
    }

    @Override // q0.a
    @NotNull
    public final String invoke() {
        return "| >> parameters " + this.$parameters + ' ';
    }
}
