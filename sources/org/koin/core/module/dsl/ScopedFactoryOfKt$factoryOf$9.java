package org.koin.core.module.dsl;

import kotlin.jvm.internal.r;
import okio.a;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import q0.p;
import q0.v;

/* loaded from: classes.dex */
public final class ScopedFactoryOfKt$factoryOf$9 extends r implements p {
    final /* synthetic */ v $constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedFactoryOfKt$factoryOf$9(v vVar) {
        super(2);
        this.$constructor = vVar;
    }

    @Override // q0.p
    public final R invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
        a.b(scope, "$this$factory", parametersHolder, "it");
        throw null;
    }
}
