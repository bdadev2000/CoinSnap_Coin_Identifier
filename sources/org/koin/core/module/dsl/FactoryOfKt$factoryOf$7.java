package org.koin.core.module.dsl;

import kotlin.jvm.internal.r;
import okio.a;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import q0.p;
import q0.t;

/* loaded from: classes.dex */
public final class FactoryOfKt$factoryOf$7 extends r implements p {
    final /* synthetic */ t $constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FactoryOfKt$factoryOf$7(t tVar) {
        super(2);
        this.$constructor = tVar;
    }

    @Override // q0.p
    public final R invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
        a.b(scope, "$this$factory", parametersHolder, "it");
        throw null;
    }
}
