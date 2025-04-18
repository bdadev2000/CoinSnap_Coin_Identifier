package org.koin.androidx.fragment.dsl;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import q0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class ScopeFragmentOfKt$fragmentOf$1 extends r implements p {
    final /* synthetic */ a $constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopeFragmentOfKt$fragmentOf$1(a aVar) {
        super(2);
        this.$constructor = aVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
    @Override // q0.p
    @NotNull
    public final Fragment invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
        p0.a.s(scope, "$this$fragment");
        p0.a.s(parametersHolder, "it");
        return (Fragment) this.$constructor.invoke();
    }
}
