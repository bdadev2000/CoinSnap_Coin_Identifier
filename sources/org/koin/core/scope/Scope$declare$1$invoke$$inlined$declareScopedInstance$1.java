package org.koin.core.scope;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import p0.a;
import q0.p;

/* loaded from: classes.dex */
public final class Scope$declare$1$invoke$$inlined$declareScopedInstance$1 extends r implements p {
    final /* synthetic */ Object $instance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scope$declare$1$invoke$$inlined$declareScopedInstance$1(Object obj) {
        super(2);
        this.$instance = obj;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    @Override // q0.p
    public final T invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
        a.s(scope, "$this$_createDefinition");
        a.s(parametersHolder, "it");
        return this.$instance;
    }
}
