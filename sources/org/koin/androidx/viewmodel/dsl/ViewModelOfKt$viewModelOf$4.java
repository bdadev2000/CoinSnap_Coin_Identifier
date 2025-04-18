package org.koin.androidx.viewmodel.dsl;

import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.r;
import okio.a;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
public final class ViewModelOfKt$viewModelOf$4 extends r implements p {
    final /* synthetic */ q $constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelOfKt$viewModelOf$4(q qVar) {
        super(2);
        this.$constructor = qVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
    @Override // q0.p
    @NotNull
    public final ViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
        a.b(scope, "$this$viewModel", parametersHolder, "it");
        throw null;
    }
}
