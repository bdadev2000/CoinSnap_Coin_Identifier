package org.koin.core;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import d0.h;
import d0.i;
import e0.w;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.definition.Kind;
import org.koin.core.error.ScopeNotCreatedException;
import org.koin.core.extension.ExtensionManager;
import org.koin.core.logger.EmptyLogger;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.module.ModuleKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.InstanceRegistry;
import org.koin.core.registry.PropertyRegistry;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTimeTools;
import org.koin.mp.KoinPlatformTools;
import p0.a;
import x0.c;

/* loaded from: classes3.dex */
public final class Koin {

    @NotNull
    private final ScopeRegistry scopeRegistry = new ScopeRegistry(this);

    @NotNull
    private final InstanceRegistry instanceRegistry = new InstanceRegistry(this);

    @NotNull
    private final PropertyRegistry propertyRegistry = new PropertyRegistry(this);

    @NotNull
    private final ExtensionManager extensionManager = new ExtensionManager(this);

    @NotNull
    private Logger logger = new EmptyLogger();

    public static /* synthetic */ Scope createScope$default(Koin koin, String str, Qualifier qualifier, Object obj, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return koin.createScope(str, qualifier, obj);
    }

    public static void declare$default(Koin koin, Object obj, Qualifier qualifier, List list, boolean z2, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            list = w.f30218a;
        }
        a.s(list, "secondaryTypes");
        koin.getInstanceRegistry().get_koin().getScopeRegistry().getRootScope().getScopeQualifier();
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    public static Object get$default(Koin koin, Qualifier qualifier, q0.a aVar, int i2, Object obj) {
        koin.getScopeRegistry().getRootScope();
        a.A0();
        throw null;
    }

    @KoinInternalApi
    public static /* synthetic */ void getExtensionManager$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void getInstanceRegistry$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void getLogger$annotations() {
    }

    public static /* synthetic */ Scope getOrCreateScope$default(Koin koin, String str, Qualifier qualifier, Object obj, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return koin.getOrCreateScope(str, qualifier, obj);
    }

    public static Object getOrNull$default(Koin koin, Qualifier qualifier, q0.a aVar, int i2, Object obj) {
        koin.getScopeRegistry().getRootScope();
        a.A0();
        throw null;
    }

    @KoinInternalApi
    public static /* synthetic */ void getPropertyRegistry$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void getScopeRegistry$annotations() {
    }

    public static h inject$default(Koin koin, Qualifier qualifier, i iVar, q0.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            iVar = KoinPlatformTools.INSTANCE.defaultLazyMode();
        }
        a.s(iVar, "mode");
        koin.getScopeRegistry().getRootScope();
        a.A0();
        throw null;
    }

    public static h injectOrNull$default(Koin koin, Qualifier qualifier, i iVar, q0.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            iVar = KoinPlatformTools.INSTANCE.defaultLazyMode();
        }
        a.s(iVar, "mode");
        koin.getScopeRegistry().getRootScope();
        a.A0();
        throw null;
    }

    public static /* synthetic */ void loadModules$default(Koin koin, List list, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        koin.loadModules(list, z2, z3);
    }

    public final void close() {
        this.scopeRegistry.close$koin_core();
        this.instanceRegistry.close$koin_core();
        this.propertyRegistry.close();
        this.extensionManager.close();
    }

    public final void createEagerInstances() {
        this.logger.debug("Create eager instances ...");
        long timeInNanoSeconds = KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds();
        this.instanceRegistry.createAllEagerInstances$koin_core();
        double doubleValue = Double.valueOf((r0.getTimeInNanoSeconds() - timeInNanoSeconds) / 1000000.0d).doubleValue();
        this.logger.debug("Created eager instances in " + doubleValue + " ms");
    }

    @NotNull
    public final Scope createScope(@NotNull String str, @NotNull Qualifier qualifier, @Nullable Object obj) {
        a.s(str, "scopeId");
        a.s(qualifier, "qualifier");
        return this.scopeRegistry.createScope(str, qualifier, obj);
    }

    public final <T> void declare(T t2, Qualifier qualifier, List<? extends c> list, boolean z2) {
        a.s(list, "secondaryTypes");
        getInstanceRegistry().get_koin().getScopeRegistry().getRootScope().getScopeQualifier();
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    public final void deleteProperty(@NotNull String str) {
        a.s(str, SDKConstants.PARAM_KEY);
        this.propertyRegistry.deleteProperty(str);
    }

    public final void deleteScope(@NotNull String str) {
        a.s(str, "scopeId");
        this.scopeRegistry.deleteScope$koin_core(str);
    }

    public final <T> T get(Qualifier qualifier, q0.a aVar) {
        getScopeRegistry().getRootScope();
        a.A0();
        throw null;
    }

    public final <T> List<T> getAll() {
        getScopeRegistry().getRootScope();
        a.A0();
        throw null;
    }

    @NotNull
    public final ExtensionManager getExtensionManager() {
        return this.extensionManager;
    }

    @NotNull
    public final InstanceRegistry getInstanceRegistry() {
        return this.instanceRegistry;
    }

    @NotNull
    public final Logger getLogger() {
        return this.logger;
    }

    public final <T> Scope getOrCreateScope(String str) {
        a.s(str, "scopeId");
        a.A0();
        throw null;
    }

    public final <T> T getOrNull(Qualifier qualifier, q0.a aVar) {
        getScopeRegistry().getRootScope();
        a.A0();
        throw null;
    }

    @NotNull
    public final <T> T getProperty(@NotNull String str, @NotNull T t2) {
        a.s(str, SDKConstants.PARAM_KEY);
        a.s(t2, "defaultValue");
        T t3 = (T) this.propertyRegistry.getProperty(str);
        return t3 == null ? t2 : t3;
    }

    @NotNull
    public final PropertyRegistry getPropertyRegistry() {
        return this.propertyRegistry;
    }

    @NotNull
    public final Scope getScope(@NotNull String str) {
        a.s(str, "scopeId");
        Scope scopeOrNull = this.scopeRegistry.getScopeOrNull(str);
        if (scopeOrNull != null) {
            return scopeOrNull;
        }
        throw new ScopeNotCreatedException("No scope found for id '" + str + '\'');
    }

    @Nullable
    public final Scope getScopeOrNull(@NotNull String str) {
        a.s(str, "scopeId");
        return this.scopeRegistry.getScopeOrNull(str);
    }

    @NotNull
    public final ScopeRegistry getScopeRegistry() {
        return this.scopeRegistry;
    }

    public final <T> h inject(Qualifier qualifier, i iVar, q0.a aVar) {
        a.s(iVar, "mode");
        getScopeRegistry().getRootScope();
        a.A0();
        throw null;
    }

    public final <T> h injectOrNull(Qualifier qualifier, i iVar, q0.a aVar) {
        a.s(iVar, "mode");
        getScopeRegistry().getRootScope();
        a.A0();
        throw null;
    }

    public final void loadModules(@NotNull List<Module> list, boolean z2, boolean z3) {
        a.s(list, "modules");
        Set<Module> flatten = ModuleKt.flatten(list);
        this.instanceRegistry.loadModules$koin_core(flatten, z2);
        this.scopeRegistry.loadScopes(flatten);
        if (z3) {
            createEagerInstances();
        }
    }

    public final void setProperty(@NotNull String str, @NotNull Object obj) {
        a.s(str, SDKConstants.PARAM_KEY);
        a.s(obj, "value");
        this.propertyRegistry.saveProperty$koin_core(str, obj);
    }

    @KoinInternalApi
    public final void setupLogger(@NotNull Logger logger) {
        a.s(logger, "logger");
        this.logger = logger;
    }

    public final void unloadModules(@NotNull List<Module> list) {
        a.s(list, "modules");
        this.instanceRegistry.unloadModules$koin_core(ModuleKt.flatten(list));
    }

    public static Scope createScope$default(Koin koin, String str, Object obj, int i2, Object obj2) {
        a.s(str, "scopeId");
        a.A0();
        throw null;
    }

    @NotNull
    public final <T extends KoinScopeComponent> Scope createScope(@NotNull T t2) {
        a.s(t2, "t");
        return this.scopeRegistry.createScope(KoinScopeComponentKt.getScopeId(t2), KoinScopeComponentKt.getScopeName(t2), null);
    }

    @NotNull
    public final Scope getOrCreateScope(@NotNull String str, @NotNull Qualifier qualifier, @Nullable Object obj) {
        a.s(str, "scopeId");
        a.s(qualifier, "qualifier");
        Scope scopeOrNull = this.scopeRegistry.getScopeOrNull(str);
        return scopeOrNull == null ? createScope(str, qualifier, obj) : scopeOrNull;
    }

    @Nullable
    public final <T> T getProperty(@NotNull String str) {
        a.s(str, SDKConstants.PARAM_KEY);
        return (T) this.propertyRegistry.getProperty(str);
    }

    public static /* synthetic */ Object get$default(Koin koin, c cVar, Qualifier qualifier, q0.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            qualifier = null;
        }
        if ((i2 & 4) != 0) {
            aVar = null;
        }
        return koin.get(cVar, qualifier, aVar);
    }

    public static /* synthetic */ Object getOrNull$default(Koin koin, c cVar, Qualifier qualifier, q0.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            qualifier = null;
        }
        if ((i2 & 4) != 0) {
            aVar = null;
        }
        return koin.getOrNull(cVar, qualifier, aVar);
    }

    public final <T> T get(@NotNull c cVar, @Nullable Qualifier qualifier, @Nullable q0.a aVar) {
        a.s(cVar, "clazz");
        return (T) this.scopeRegistry.getRootScope().get(cVar, qualifier, aVar);
    }

    @Nullable
    public final <T> T getOrNull(@NotNull c cVar, @Nullable Qualifier qualifier, @Nullable q0.a aVar) {
        a.s(cVar, "clazz");
        return (T) this.scopeRegistry.getRootScope().getOrNull(cVar, qualifier, aVar);
    }

    public static Scope createScope$default(Koin koin, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = KoinPlatformTools.INSTANCE.generateId();
        }
        a.s(str, "scopeId");
        a.A0();
        throw null;
    }

    public final <T> Scope createScope(String str) {
        a.s(str, "scopeId");
        a.A0();
        throw null;
    }

    public final <T> Scope createScope(String str, Object obj) {
        a.s(str, "scopeId");
        a.A0();
        throw null;
    }
}
