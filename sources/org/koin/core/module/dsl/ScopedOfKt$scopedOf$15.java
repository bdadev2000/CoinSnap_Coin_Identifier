package org.koin.core.module.dsl;

import kotlin.jvm.internal.r;
import okio.a;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import q0.f;
import q0.p;

/* loaded from: classes3.dex */
public final class ScopedOfKt$scopedOf$15 extends r implements p {
    final /* synthetic */ f $constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedOfKt$scopedOf$15(f fVar) {
        super(2);
        this.$constructor = fVar;
    }

    @Override // q0.p
    public final R invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
        a.b(scope, "$this$scoped", parametersHolder, "it");
        throw null;
    }
}
