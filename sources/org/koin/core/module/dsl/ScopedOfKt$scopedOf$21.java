package org.koin.core.module.dsl;

import kotlin.jvm.internal.r;
import okio.a;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import q0.m;
import q0.p;

/* loaded from: classes3.dex */
public final class ScopedOfKt$scopedOf$21 extends r implements p {
    final /* synthetic */ m $constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedOfKt$scopedOf$21(m mVar) {
        super(2);
        this.$constructor = mVar;
    }

    @Override // q0.p
    public final R invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
        a.b(scope, "$this$scoped", parametersHolder, "it");
        throw null;
    }
}
