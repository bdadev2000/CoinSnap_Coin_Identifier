package org.koin.compose.module;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinExperimentalAPI;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.module.Module;
import p0.a;

@StabilityInferred
@KoinExperimentalAPI
@KoinInternalApi
/* loaded from: classes4.dex */
public final class CompositionKoinModuleLoader implements RememberObserver {
    public static final int $stable = 8;

    @NotNull
    private final Koin koin;

    @NotNull
    private final List<Module> modules;
    private final boolean unloadOnAbandoned;
    private final boolean unloadOnForgotten;

    public CompositionKoinModuleLoader(@NotNull List<Module> list, @NotNull Koin koin, boolean z2, boolean z3) {
        a.s(list, "modules");
        a.s(koin, "koin");
        this.modules = list;
        this.koin = koin;
        this.unloadOnForgotten = z2;
        this.unloadOnAbandoned = z3;
        koin.getLogger().debug(this + " -> load modules");
        Koin.loadModules$default(koin, list, false, false, 6, null);
    }

    private final void unloadModules() {
        this.koin.getLogger().debug(this + " -> unload modules");
        this.koin.unloadModules(this.modules);
    }

    @NotNull
    public final Koin getKoin() {
        return this.koin;
    }

    @NotNull
    public final List<Module> getModules() {
        return this.modules;
    }

    public final boolean getUnloadOnAbandoned() {
        return this.unloadOnAbandoned;
    }

    public final boolean getUnloadOnForgotten() {
        return this.unloadOnForgotten;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        if (this.unloadOnAbandoned) {
            unloadModules();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        if (this.unloadOnForgotten) {
            unloadModules();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
