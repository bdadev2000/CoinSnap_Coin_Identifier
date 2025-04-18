package org.koin.mp;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.context.DefaultContextExtKt;
import org.koin.core.logger.Level;
import org.koin.core.module.Module;
import p0.a;

/* loaded from: classes3.dex */
public final class KoinPlatform {

    @NotNull
    public static final KoinPlatform INSTANCE = new KoinPlatform();

    private KoinPlatform() {
    }

    @NotNull
    public final Koin getKoin() {
        return KoinPlatformTools.INSTANCE.defaultContext().get();
    }

    public final void startKoin(@NotNull List<Module> list, @NotNull Level level) {
        a.s(list, "modules");
        a.s(level, "level");
        DefaultContextExtKt.startKoin(new KoinPlatform$startKoin$1(level, list));
    }

    public final void stopKoin() {
        DefaultContextExtKt.stopKoin();
    }
}
