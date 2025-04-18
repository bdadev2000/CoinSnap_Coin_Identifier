package org.koin.core.registry;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import p0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class InstanceRegistry$declareRootInstance$def$1 extends r implements p {
    final /* synthetic */ T $instance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstanceRegistry$declareRootInstance$def$1(T t2) {
        super(2);
        this.$instance = t2;
    }

    @Override // q0.p
    public final T invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
        a.s(scope, "$this$_createDefinition");
        a.s(parametersHolder, "it");
        return this.$instance;
    }
}
