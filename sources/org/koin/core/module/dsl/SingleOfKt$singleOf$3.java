package org.koin.core.module.dsl;

import kotlin.jvm.internal.r;
import okio.a;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import q0.p;

/* loaded from: classes3.dex */
public final class SingleOfKt$singleOf$3 extends r implements p {
    final /* synthetic */ p $constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleOfKt$singleOf$3(p pVar) {
        super(2);
        this.$constructor = pVar;
    }

    @Override // q0.p
    public final R invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
        a.b(scope, "$this$single", parametersHolder, "it");
        throw null;
    }
}
