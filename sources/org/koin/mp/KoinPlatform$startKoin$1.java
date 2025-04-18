package org.koin.mp;

import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.KoinApplication;
import org.koin.core.logger.Level;
import org.koin.core.module.Module;
import p0.a;
import q0.l;

/* loaded from: classes3.dex */
public final class KoinPlatform$startKoin$1 extends r implements l {
    final /* synthetic */ Level $level;
    final /* synthetic */ List<Module> $modules;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinPlatform$startKoin$1(Level level, List<Module> list) {
        super(1);
        this.$level = level;
        this.$modules = list;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((KoinApplication) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull KoinApplication koinApplication) {
        a.s(koinApplication, "$this$startKoin");
        koinApplication.logger(KoinPlatformTools.INSTANCE.defaultLogger(this.$level));
        koinApplication.modules(this.$modules);
    }
}
