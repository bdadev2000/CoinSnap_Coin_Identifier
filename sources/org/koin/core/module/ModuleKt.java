package org.koin.core.module;

import b1.f0;
import e0.u;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.definition.Kind;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.ScopeRegistry;
import p0.a;
import q0.p;

/* loaded from: classes4.dex */
public final class ModuleKt {
    @KoinInternalApi
    public static final <T> FactoryInstanceFactory<T> _factoryInstanceFactory(Qualifier qualifier, p pVar, Qualifier qualifier2) {
        a.s(pVar, "definition");
        a.s(qualifier2, "scopeQualifier");
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    public static FactoryInstanceFactory _factoryInstanceFactory$default(Qualifier qualifier, p pVar, Qualifier qualifier2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            qualifier2 = ScopeRegistry.Companion.getRootScopeQualifier();
        }
        a.s(pVar, "definition");
        a.s(qualifier2, "scopeQualifier");
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    @KoinInternalApi
    public static final <T> ScopedInstanceFactory<T> _scopedInstanceFactory(Qualifier qualifier, p pVar, Qualifier qualifier2) {
        a.s(pVar, "definition");
        a.s(qualifier2, "scopeQualifier");
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    public static ScopedInstanceFactory _scopedInstanceFactory$default(Qualifier qualifier, p pVar, Qualifier qualifier2, int i2, Object obj) {
        a.s(pVar, "definition");
        a.s(qualifier2, "scopeQualifier");
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    @KoinInternalApi
    public static final <T> SingleInstanceFactory<T> _singleInstanceFactory(Qualifier qualifier, p pVar, Qualifier qualifier2) {
        a.s(pVar, "definition");
        a.s(qualifier2, "scopeQualifier");
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    public static SingleInstanceFactory _singleInstanceFactory$default(Qualifier qualifier, p pVar, Qualifier qualifier2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            qualifier2 = ScopeRegistry.Companion.getRootScopeQualifier();
        }
        a.s(pVar, "definition");
        a.s(qualifier2, "scopeQualifier");
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    @NotNull
    public static final Set<Module> flatten(@NotNull List<Module> list) {
        a.s(list, "modules");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        flatten$flat(list, linkedHashSet);
        return linkedHashSet;
    }

    private static final void flatten$flat(List<Module> list, Set<Module> set) {
        for (Module module : list) {
            set.add(module);
            flatten$flat(module.getIncludedModules(), set);
        }
    }

    public static final void overrideError(@NotNull InstanceFactory<?> instanceFactory, @NotNull String str) {
        a.s(instanceFactory, "factory");
        a.s(str, "mapping");
        throw new DefinitionOverrideException("Already existing definition for " + instanceFactory.getBeanDefinition() + " at " + str);
    }

    @NotNull
    public static final List<Module> plus(@NotNull List<Module> list, @NotNull Module module) {
        a.s(list, "<this>");
        a.s(module, "module");
        return u.P0(f0.u(module), list);
    }
}
