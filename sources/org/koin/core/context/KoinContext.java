package org.koin.core.context;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.module.Module;
import q0.l;

/* loaded from: classes4.dex */
public interface KoinContext {

    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void loadKoinModules$default(KoinContext koinContext, Module module, boolean z2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadKoinModules");
            }
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            koinContext.loadKoinModules(module, z2);
        }

        public static /* synthetic */ void loadKoinModules$default(KoinContext koinContext, List list, boolean z2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadKoinModules");
            }
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            koinContext.loadKoinModules((List<Module>) list, z2);
        }
    }

    @NotNull
    Koin get();

    @Nullable
    Koin getOrNull();

    void loadKoinModules(@NotNull List<Module> list, boolean z2);

    void loadKoinModules(@NotNull Module module, boolean z2);

    @NotNull
    KoinApplication startKoin(@NotNull KoinApplication koinApplication);

    @NotNull
    KoinApplication startKoin(@NotNull l lVar);

    void stopKoin();

    void unloadKoinModules(@NotNull List<Module> list);

    void unloadKoinModules(@NotNull Module module);
}
