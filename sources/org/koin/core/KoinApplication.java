package org.koin.core;

import b1.f0;
import e0.q;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.KoinApplicationDslMarker;
import org.koin.core.module.Module;
import org.koin.mp.KoinPlatformTimeTools;
import org.koin.mp.KoinPlatformTools;
import p0.a;

@KoinApplicationDslMarker
/* loaded from: classes3.dex */
public final class KoinApplication {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private boolean allowOverride;

    @NotNull
    private final Koin koin;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @NotNull
        public final KoinApplication init() {
            return new KoinApplication(null);
        }
    }

    public /* synthetic */ KoinApplication(k kVar) {
        this();
    }

    private final void loadModules(List<Module> list) {
        this.koin.loadModules(list, this.allowOverride, false);
    }

    public static /* synthetic */ KoinApplication printLogger$default(KoinApplication koinApplication, Level level, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            level = Level.INFO;
        }
        return koinApplication.printLogger(level);
    }

    public final void allowOverride(boolean z2) {
        this.allowOverride = z2;
    }

    public final void close() {
        this.koin.close();
    }

    public final void createEagerInstances() {
        this.koin.createEagerInstances();
    }

    @NotNull
    public final Koin getKoin() {
        return this.koin;
    }

    @NotNull
    public final KoinApplication logger(@NotNull Logger logger) {
        a.s(logger, "logger");
        this.koin.setupLogger(logger);
        return this;
    }

    @NotNull
    public final KoinApplication modules(@NotNull Module module) {
        a.s(module, "modules");
        return modules(f0.u(module));
    }

    @NotNull
    public final KoinApplication printLogger(@NotNull Level level) {
        a.s(level, "level");
        this.koin.setupLogger(KoinPlatformTools.INSTANCE.defaultLogger(level));
        return this;
    }

    @NotNull
    public final KoinApplication properties(@NotNull Map<String, ? extends Object> map) {
        a.s(map, "values");
        this.koin.getPropertyRegistry().saveProperties(map);
        return this;
    }

    public final void unloadModules$koin_core(@NotNull List<Module> list) {
        a.s(list, "modules");
        this.koin.unloadModules(list);
    }

    private KoinApplication() {
        this.koin = new Koin();
        this.allowOverride = true;
    }

    @NotNull
    public final KoinApplication modules(@NotNull Module... moduleArr) {
        a.s(moduleArr, "modules");
        return modules(q.n0(moduleArr));
    }

    public final void unloadModules$koin_core(@NotNull Module module) {
        a.s(module, "module");
        this.koin.unloadModules(f0.u(module));
    }

    @NotNull
    public final KoinApplication modules(@NotNull List<Module> list) {
        a.s(list, "modules");
        Logger logger = this.koin.getLogger();
        Level level = Level.INFO;
        if (logger.isAt(level)) {
            long timeInNanoSeconds = KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds();
            loadModules(list);
            double doubleValue = Double.valueOf((r0.getTimeInNanoSeconds() - timeInNanoSeconds) / 1000000.0d).doubleValue();
            int size = this.koin.getInstanceRegistry().size();
            this.koin.getLogger().display(level, "Started " + size + " definitions in " + doubleValue + " ms");
        } else {
            loadModules(list);
        }
        return this;
    }
}
