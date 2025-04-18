package com.cooldev.gba.emulator.gameboy.di;

import org.jetbrains.annotations.NotNull;
import org.koin.core.module.Module;
import org.koin.dsl.ModuleDSLKt;

/* loaded from: classes3.dex */
public final class KoinModuleKt {

    @NotNull
    private static final Module appModule = ModuleDSLKt.module$default(false, KoinModuleKt$appModule$1.INSTANCE, 1, null);

    @NotNull
    public static final Module getAppModule() {
        return appModule;
    }
}
