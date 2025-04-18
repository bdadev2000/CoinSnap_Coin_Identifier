package org.koin.core.extension;

import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;

/* loaded from: classes4.dex */
public interface KoinExtension {
    @NotNull
    Koin getKoin();

    void onClose();

    void setKoin(@NotNull Koin koin);
}
