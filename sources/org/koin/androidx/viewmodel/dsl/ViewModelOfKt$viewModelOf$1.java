package org.koin.androidx.viewmodel.dsl;

import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import q0.a;
import q0.p;

/* loaded from: classes3.dex */
public final class ViewModelOfKt$viewModelOf$1 extends r implements p {
    final /* synthetic */ a $constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelOfKt$viewModelOf$1(a aVar) {
        super(2);
        this.$constructor = aVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
    @Override // q0.p
    @NotNull
    public final ViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
        p0.a.s(scope, "$this$viewModel");
        p0.a.s(parametersHolder, "it");
        return (ViewModel) this.$constructor.invoke();
    }
}
