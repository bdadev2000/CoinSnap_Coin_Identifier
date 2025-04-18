package org.koin.core.instance;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import q0.a;

/* loaded from: classes4.dex */
public final class InstanceBuilderKt$getArguments$1 extends r implements a {
    final /* synthetic */ ParametersHolder $parameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstanceBuilderKt$getArguments$1(ParametersHolder parametersHolder) {
        super(0);
        this.$parameters = parametersHolder;
    }

    @Override // q0.a
    @NotNull
    public final ParametersHolder invoke() {
        return this.$parameters;
    }
}
