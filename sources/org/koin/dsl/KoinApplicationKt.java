package org.koin.dsl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.KoinApplication;
import org.koin.core.module.KoinApplicationDslMarker;
import q0.l;

/* loaded from: classes4.dex */
public final class KoinApplicationKt {
    @KoinApplicationDslMarker
    @NotNull
    public static final KoinApplication koinApplication(boolean z2, @Nullable l lVar) {
        KoinApplication init = KoinApplication.Companion.init();
        if (lVar != null) {
            lVar.invoke(init);
        }
        if (z2) {
            init.createEagerInstances();
        }
        return init;
    }

    public static /* synthetic */ KoinApplication koinApplication$default(boolean z2, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        return koinApplication(z2, lVar);
    }
}
