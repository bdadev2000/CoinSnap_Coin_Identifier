package org.koin.core.component;

import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.mp.KoinPlatformTools;

/* loaded from: classes.dex */
public interface KoinComponent {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @NotNull
        public static Koin getKoin(@NotNull KoinComponent koinComponent) {
            return KoinPlatformTools.INSTANCE.defaultContext().get();
        }
    }

    @NotNull
    Koin getKoin();
}
