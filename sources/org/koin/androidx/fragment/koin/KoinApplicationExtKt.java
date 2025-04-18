package org.koin.androidx.fragment.koin;

import b1.f0;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.module.Module;
import org.koin.dsl.ModuleDSLKt;
import p0.a;

/* loaded from: classes3.dex */
public final class KoinApplicationExtKt {

    @NotNull
    private static final Module fragmentFactoryModule = ModuleDSLKt.module$default(false, KoinApplicationExtKt$fragmentFactoryModule$1.INSTANCE, 1, null);

    public static final void fragmentFactory(@NotNull KoinApplication koinApplication) {
        a.s(koinApplication, "<this>");
        Koin.loadModules$default(koinApplication.getKoin(), f0.u(fragmentFactoryModule), false, false, 6, null);
    }
}
