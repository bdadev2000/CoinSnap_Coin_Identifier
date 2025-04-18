package org.koin.androidx.viewmodel.dsl;

import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.r;
import okio.a;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import q0.m;
import q0.p;

/* loaded from: classes3.dex */
public final class ScopeViewModelOfKt$viewModelOf$21 extends r implements p {
    final /* synthetic */ m $constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopeViewModelOfKt$viewModelOf$21(m mVar) {
        super(2);
        this.$constructor = mVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
    @Override // q0.p
    @NotNull
    public final ViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
        a.b(scope, "$this$viewModel", parametersHolder, "it");
        throw null;
    }
}
