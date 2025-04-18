package org.koin.core.context;

import b1.f0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.error.KoinAppAlreadyStartedException;
import org.koin.core.module.Module;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class GlobalContext implements KoinContext {

    @NotNull
    public static final GlobalContext INSTANCE = new GlobalContext();

    @Nullable
    private static Koin _koin;

    @Nullable
    private static KoinApplication _koinApplication;

    private GlobalContext() {
    }

    private final void register(KoinApplication koinApplication) {
        if (_koin != null) {
            throw new KoinAppAlreadyStartedException("A Koin Application has already been started");
        }
        _koinApplication = koinApplication;
        _koin = koinApplication.getKoin();
    }

    @Override // org.koin.core.context.KoinContext
    @NotNull
    public Koin get() {
        Koin koin = _koin;
        if (koin != null) {
            return koin;
        }
        throw new IllegalStateException("KoinApplication has not been started".toString());
    }

    @Nullable
    public final KoinApplication getKoinApplicationOrNull() {
        return _koinApplication;
    }

    @Override // org.koin.core.context.KoinContext
    @Nullable
    public Koin getOrNull() {
        return _koin;
    }

    @Override // org.koin.core.context.KoinContext
    public void loadKoinModules(@NotNull Module module, boolean z2) {
        a.s(module, "module");
        synchronized (this) {
            Koin.loadModules$default(INSTANCE.get(), f0.u(module), false, z2, 2, null);
        }
    }

    @Override // org.koin.core.context.KoinContext
    @NotNull
    public KoinApplication startKoin(@NotNull KoinApplication koinApplication) {
        a.s(koinApplication, "koinApplication");
        synchronized (this) {
            INSTANCE.register(koinApplication);
            koinApplication.createEagerInstances();
        }
        return koinApplication;
    }

    @Override // org.koin.core.context.KoinContext
    public void stopKoin() {
        synchronized (this) {
            try {
                Koin koin = _koin;
                if (koin != null) {
                    koin.close();
                }
                _koin = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.koin.core.context.KoinContext
    public void unloadKoinModules(@NotNull Module module) {
        a.s(module, "module");
        synchronized (this) {
            INSTANCE.get().unloadModules(f0.u(module));
        }
    }

    @Override // org.koin.core.context.KoinContext
    public void loadKoinModules(@NotNull List<Module> list, boolean z2) {
        a.s(list, "modules");
        synchronized (this) {
            Koin.loadModules$default(INSTANCE.get(), list, false, z2, 2, null);
        }
    }

    @Override // org.koin.core.context.KoinContext
    public void unloadKoinModules(@NotNull List<Module> list) {
        a.s(list, "modules");
        synchronized (this) {
            INSTANCE.get().unloadModules(list);
        }
    }

    @Override // org.koin.core.context.KoinContext
    @NotNull
    public KoinApplication startKoin(@NotNull l lVar) {
        KoinApplication init;
        a.s(lVar, "appDeclaration");
        synchronized (this) {
            init = KoinApplication.Companion.init();
            INSTANCE.register(init);
            lVar.invoke(init);
            init.createEagerInstances();
        }
        return init;
    }
}
