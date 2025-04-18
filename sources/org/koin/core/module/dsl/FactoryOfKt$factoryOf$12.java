package org.koin.core.module.dsl;

import kotlin.jvm.internal.r;
import okio.a;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import q0.c;
import q0.p;

/* loaded from: classes.dex */
public final class FactoryOfKt$factoryOf$12 extends r implements p {
    final /* synthetic */ c $constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FactoryOfKt$factoryOf$12(c cVar) {
        super(2);
        this.$constructor = cVar;
    }

    @Override // q0.p
    public final R invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
        a.b(scope, "$this$factory", parametersHolder, "it");
        throw null;
    }
}
