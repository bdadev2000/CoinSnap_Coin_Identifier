package org.koin.core.registry;

import android.support.v4.media.d;
import b1.f0;
import e0.q;
import e0.u;
import e0.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.InstanceContext;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.module.ModuleKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;
import p0.a;
import x0.c;

/* loaded from: classes2.dex */
public final class InstanceRegistry {

    @NotNull
    private final Map<String, InstanceFactory<?>> _instances;

    @NotNull
    private final Koin _koin;

    @NotNull
    private final HashMap<Integer, SingleInstanceFactory<?>> eagerInstances;

    public InstanceRegistry(@NotNull Koin koin) {
        a.s(koin, "_koin");
        this._koin = koin;
        this._instances = KoinPlatformTools.INSTANCE.safeHashMap();
        this.eagerInstances = new HashMap<>();
    }

    private final void addAllEagerInstances(Module module) {
        for (SingleInstanceFactory<?> singleInstanceFactory : module.getEagerInstances()) {
            this.eagerInstances.put(Integer.valueOf(singleInstanceFactory.hashCode()), singleInstanceFactory);
        }
    }

    private final void createEagerInstances(Collection<? extends SingleInstanceFactory<?>> collection) {
        InstanceContext instanceContext = new InstanceContext(this._koin.getLogger(), this._koin.getScopeRegistry().getRootScope(), null, 4, null);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            ((SingleInstanceFactory) it.next()).get(instanceContext);
        }
    }

    public static void declareRootInstance$default(InstanceRegistry instanceRegistry, Object obj, Qualifier qualifier, List list, boolean z2, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            list = w.f30218a;
        }
        a.s(list, "secondaryTypes");
        instanceRegistry.get_koin().getScopeRegistry().getRootScope().getScopeQualifier();
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    public static void declareScopedInstance$default(InstanceRegistry instanceRegistry, Object obj, Qualifier qualifier, List list, boolean z2, Qualifier qualifier2, String str, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            list = w.f30218a;
        }
        a.s(list, "secondaryTypes");
        a.s(qualifier2, "scopeQualifier");
        a.s(str, "scopeID");
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    private final void loadModule(Module module, boolean z2) {
        for (Map.Entry<String, InstanceFactory<?>> entry : module.getMappings().entrySet()) {
            saveMapping$default(this, z2, entry.getKey(), entry.getValue(), false, 8, null);
        }
    }

    public static /* synthetic */ void saveMapping$default(InstanceRegistry instanceRegistry, boolean z2, String str, InstanceFactory instanceFactory, boolean z3, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z3 = true;
        }
        instanceRegistry.saveMapping(z2, str, instanceFactory, z3);
    }

    private final void unloadModule(Module module) {
        Set<String> keySet = module.getMappings().keySet();
        a.r(keySet, "<get-keys>(...)");
        for (String str : keySet) {
            if (this._instances.containsKey(str)) {
                InstanceFactory<?> instanceFactory = this._instances.get(str);
                if (instanceFactory != null) {
                    instanceFactory.dropAll();
                }
                this._instances.remove(str);
            }
        }
    }

    public final void close$koin_core() {
        Iterator<Map.Entry<String, InstanceFactory<?>>> it = this._instances.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().dropAll();
        }
        this._instances.clear();
    }

    public final void createAllEagerInstances$koin_core() {
        Collection<SingleInstanceFactory<?>> values = this.eagerInstances.values();
        a.r(values, "<get-values>(...)");
        SingleInstanceFactory[] singleInstanceFactoryArr = (SingleInstanceFactory[]) values.toArray(new SingleInstanceFactory[0]);
        ArrayList b2 = f0.b(Arrays.copyOf(singleInstanceFactoryArr, singleInstanceFactoryArr.length));
        this.eagerInstances.clear();
        createEagerInstances(b2);
    }

    public final <T> void declareRootInstance(T t2, Qualifier qualifier, List<? extends c> list, boolean z2) {
        a.s(list, "secondaryTypes");
        get_koin().getScopeRegistry().getRootScope().getScopeQualifier();
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    public final <T> void declareScopedInstance(T t2, Qualifier qualifier, List<? extends c> list, boolean z2, Qualifier qualifier2, String str) {
        a.s(list, "secondaryTypes");
        a.s(qualifier2, "scopeQualifier");
        a.s(str, "scopeID");
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    public final void dropScopeInstances$koin_core(@NotNull Scope scope) {
        a.s(scope, "scope");
        Collection<InstanceFactory<?>> values = this._instances.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof ScopedInstanceFactory) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ScopedInstanceFactory) it.next()).drop(scope);
        }
    }

    @NotNull
    public final <T> List<T> getAll$koin_core(@NotNull c cVar, @NotNull InstanceContext instanceContext) {
        a.s(cVar, "clazz");
        a.s(instanceContext, "instanceContext");
        Collection<InstanceFactory<?>> values = this._instances.values();
        ArrayList arrayList = new ArrayList();
        for (T t2 : values) {
            if (a.g(((InstanceFactory) t2).getBeanDefinition().getScopeQualifier(), instanceContext.getScope().getScopeQualifier())) {
                arrayList.add(t2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t3 : arrayList) {
            InstanceFactory instanceFactory = (InstanceFactory) t3;
            if (a.g(instanceFactory.getBeanDefinition().getPrimaryType(), cVar) || instanceFactory.getBeanDefinition().getSecondaryTypes().contains(cVar)) {
                arrayList2.add(t3);
            }
        }
        List Z0 = u.Z0(u.d1(arrayList2));
        ArrayList arrayList3 = new ArrayList(q.M(Z0, 10));
        Iterator<T> it = Z0.iterator();
        while (it.hasNext()) {
            arrayList3.add(((InstanceFactory) it.next()).get(instanceContext));
        }
        return arrayList3;
    }

    @NotNull
    public final Map<String, InstanceFactory<?>> getInstances() {
        return this._instances;
    }

    @NotNull
    public final Koin get_koin() {
        return this._koin;
    }

    public final void loadModules$koin_core(@NotNull Set<Module> set, boolean z2) {
        a.s(set, "modules");
        for (Module module : set) {
            loadModule(module, z2);
            addAllEagerInstances(module);
        }
    }

    @Nullable
    public final InstanceFactory<?> resolveDefinition$koin_core(@NotNull c cVar, @Nullable Qualifier qualifier, @NotNull Qualifier qualifier2) {
        a.s(cVar, "clazz");
        a.s(qualifier2, "scopeQualifier");
        return this._instances.get(BeanDefinitionKt.indexKey(cVar, qualifier, qualifier2));
    }

    @Nullable
    public final <T> T resolveInstance$koin_core(@Nullable Qualifier qualifier, @NotNull c cVar, @NotNull Qualifier qualifier2, @NotNull InstanceContext instanceContext) {
        a.s(cVar, "clazz");
        a.s(qualifier2, "scopeQualifier");
        a.s(instanceContext, "instanceContext");
        InstanceFactory<?> resolveDefinition$koin_core = resolveDefinition$koin_core(cVar, qualifier, qualifier2);
        Object obj = resolveDefinition$koin_core != null ? resolveDefinition$koin_core.get(instanceContext) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }

    @KoinInternalApi
    public final void saveMapping(boolean z2, @NotNull String str, @NotNull InstanceFactory<?> instanceFactory, boolean z3) {
        a.s(str, "mapping");
        a.s(instanceFactory, "factory");
        if (this._instances.containsKey(str)) {
            if (!z2) {
                ModuleKt.overrideError(instanceFactory, str);
            } else if (z3) {
                Logger logger = this._koin.getLogger();
                StringBuilder v2 = d.v("(+) override index '", str, "' -> '");
                v2.append(instanceFactory.getBeanDefinition());
                v2.append('\'');
                logger.warn(v2.toString());
            }
        }
        Logger logger2 = this._koin.getLogger();
        StringBuilder v3 = d.v("(+) index '", str, "' -> '");
        v3.append(instanceFactory.getBeanDefinition());
        v3.append('\'');
        logger2.debug(v3.toString());
        this._instances.put(str, instanceFactory);
    }

    public final int size() {
        return this._instances.size();
    }

    public final void unloadModules$koin_core(@NotNull Set<Module> set) {
        a.s(set, "modules");
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            unloadModule((Module) it.next());
        }
    }
}
