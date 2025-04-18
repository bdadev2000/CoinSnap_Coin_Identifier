package org.koin.core.module.dsl;

import kotlin.jvm.internal.r;
import okio.a;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import q0.n;
import q0.p;

/* loaded from: classes.dex */
public final class ScopedFactoryOfKt$factoryOf$22 extends r implements p {
    final /* synthetic */ n $constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedFactoryOfKt$factoryOf$22(n nVar) {
        super(2);
        this.$constructor = nVar;
    }

    @Override // q0.p
    public final R invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
        a.b(scope, "$this$factory", parametersHolder, "it");
        throw null;
    }
}
