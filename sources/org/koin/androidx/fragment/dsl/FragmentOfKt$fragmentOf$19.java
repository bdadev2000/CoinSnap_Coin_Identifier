package org.koin.androidx.fragment.dsl;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.r;
import okio.a;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import q0.j;
import q0.p;

/* loaded from: classes2.dex */
public final class FragmentOfKt$fragmentOf$19 extends r implements p {
    final /* synthetic */ j $constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentOfKt$fragmentOf$19(j jVar) {
        super(2);
        this.$constructor = jVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
    @Override // q0.p
    @NotNull
    public final Fragment invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
        a.b(scope, "$this$fragment", parametersHolder, "it");
        throw null;
    }
}
