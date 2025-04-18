package org.koin.core.module.dsl;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import q0.a;
import q0.p;

/* loaded from: classes3.dex */
public final class SingleOfKt$singleOf$1 extends r implements p {
    final /* synthetic */ a $constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleOfKt$singleOf$1(a aVar) {
        super(2);
        this.$constructor = aVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [R, java.lang.Object] */
    @Override // q0.p
    public final R invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
        p0.a.s(scope, "$this$single");
        p0.a.s(parametersHolder, "it");
        return this.$constructor.invoke();
    }
}
