package org.koin.androidx.viewmodel.factory;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.androidx.viewmodel.parameter.AndroidParametersHolder;
import org.koin.core.parameter.ParametersHolder;
import q0.a;

/* loaded from: classes3.dex */
public final class KoinViewModelFactory$create$1 extends r implements a {
    final /* synthetic */ AndroidParametersHolder $androidParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinViewModelFactory$create$1(AndroidParametersHolder androidParametersHolder) {
        super(0);
        this.$androidParams = androidParametersHolder;
    }

    @Override // q0.a
    @NotNull
    public final ParametersHolder invoke() {
        return this.$androidParams;
    }
}
