package org.koin.core.module.dsl;

import kotlin.jvm.internal.r;
import okio.a;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import q0.p;
import q0.w;

/* loaded from: classes3.dex */
public final class SingleOfKt$singleOf$10 extends r implements p {
    final /* synthetic */ w $constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleOfKt$singleOf$10(w wVar) {
        super(2);
        this.$constructor = wVar;
    }

    @Override // q0.p
    public final R invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
        a.b(scope, "$this$single", parametersHolder, "it");
        throw null;
    }
}
