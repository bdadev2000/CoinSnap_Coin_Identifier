package org.koin.androidx.viewmodel.dsl;

import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.r;
import okio.a;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import q0.p;
import q0.s;

/* loaded from: classes3.dex */
public final class ScopeViewModelOfKt$viewModelOf$6 extends r implements p {
    final /* synthetic */ s $constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopeViewModelOfKt$viewModelOf$6(s sVar) {
        super(2);
        this.$constructor = sVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
    @Override // q0.p
    @NotNull
    public final ViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
        a.b(scope, "$this$viewModel", parametersHolder, "it");
        throw null;
    }
}
