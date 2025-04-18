package org.koin.core.context;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.koin.core.KoinApplication;
import org.koin.core.context.KoinContext;
import org.koin.core.module.KoinApplicationDslMarker;
import org.koin.core.module.Module;
import org.koin.mp.KoinPlatformTools;
import p0.a;
import q0.l;

/* loaded from: classes4.dex */
public final class DefaultContextExtKt {
    public static final void loadKoinModules(@NotNull Module module) {
        a.s(module, "module");
        KoinContext.DefaultImpls.loadKoinModules$default(KoinPlatformTools.INSTANCE.defaultContext(), module, false, 2, (Object) null);
    }

    @KoinApplicationDslMarker
    @NotNull
    public static final KoinApplication startKoin(@NotNull KoinApplication koinApplication) {
        a.s(koinApplication, "koinApplication");
        return KoinPlatformTools.INSTANCE.defaultContext().startKoin(koinApplication);
    }

    public static final void stopKoin() {
        KoinPlatformTools.INSTANCE.defaultContext().stopKoin();
    }

    public static final void unloadKoinModules(@NotNull Module module) {
        a.s(module, "module");
        KoinPlatformTools.INSTANCE.defaultContext().unloadKoinModules(module);
    }

    public static final void loadKoinModules(@NotNull List<Module> list) {
        a.s(list, "modules");
        KoinContext.DefaultImpls.loadKoinModules$default(KoinPlatformTools.INSTANCE.defaultContext(), (List) list, false, 2, (Object) null);
    }

    @KoinApplicationDslMarker
    @NotNull
    public static final KoinApplication startKoin(@NotNull l lVar) {
        a.s(lVar, "appDeclaration");
        return KoinPlatformTools.INSTANCE.defaultContext().startKoin(lVar);
    }

    public static final void unloadKoinModules(@NotNull List<Module> list) {
        a.s(list, "modules");
        KoinPlatformTools.INSTANCE.defaultContext().unloadKoinModules(list);
    }
}
