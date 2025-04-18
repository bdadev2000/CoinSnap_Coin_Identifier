package org.koin.core.module.dsl;

import kotlin.jvm.internal.r;
import okio.a;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import q0.i;
import q0.p;

/* loaded from: classes.dex */
public final class ScopedFactoryOfKt$factoryOf$18 extends r implements p {
    final /* synthetic */ i $constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedFactoryOfKt$factoryOf$18(i iVar) {
        super(2);
        this.$constructor = iVar;
    }

    @Override // q0.p
    public final R invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
        a.b(scope, "$this$factory", parametersHolder, "it");
        throw null;
    }
}
