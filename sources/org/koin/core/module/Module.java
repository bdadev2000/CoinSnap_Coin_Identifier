package org.koin.core.module;

import b1.f0;
import e0.t;
import e0.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.ScopeDSL;
import org.koin.mp.KoinPlatformTools;
import p0.a;
import q0.l;
import q0.p;
import x0.c;

@KoinDslMarker
/* loaded from: classes2.dex */
public final class Module {
    private final boolean _createdAtStart;

    @NotNull
    private HashSet<SingleInstanceFactory<?>> eagerInstances;

    @NotNull
    private final String id;

    @NotNull
    private final List<Module> includedModules;

    @NotNull
    private final HashMap<String, InstanceFactory<?>> mappings;

    @NotNull
    private final HashSet<Qualifier> scopes;

    public Module() {
        this(false, 1, null);
    }

    public static KoinDefinition factory$default(Module module, Qualifier qualifier, p pVar, int i2, Object obj) {
        a.s(pVar, "definition");
        ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    @KoinInternalApi
    public static /* synthetic */ void getIncludedModules$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void getMappings$annotations() {
    }

    public static /* synthetic */ void getScopes$annotations() {
    }

    public static /* synthetic */ void get_createdAtStart$annotations() {
    }

    public static KoinDefinition single$default(Module module, Qualifier qualifier, boolean z2, p pVar, int i2, Object obj) {
        a.s(pVar, "definition");
        ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Module.class == obj.getClass() && a.g(this.id, ((Module) obj).id);
    }

    public final <T> KoinDefinition<T> factory(Qualifier qualifier, p pVar) {
        a.s(pVar, "definition");
        ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    @NotNull
    public final HashSet<SingleInstanceFactory<?>> getEagerInstances() {
        return this.eagerInstances;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<Module> getIncludedModules() {
        return this.includedModules;
    }

    @NotNull
    public final HashMap<String, InstanceFactory<?>> getMappings() {
        return this.mappings;
    }

    @NotNull
    public final HashSet<Qualifier> getScopes() {
        return this.scopes;
    }

    public final boolean get_createdAtStart() {
        return this._createdAtStart;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public final void includes(@NotNull Module... moduleArr) {
        a.s(moduleArr, "module");
        t.u0(this.includedModules, moduleArr);
    }

    @KoinInternalApi
    public final void indexPrimaryType(@NotNull InstanceFactory<?> instanceFactory) {
        a.s(instanceFactory, "instanceFactory");
        BeanDefinition<?> beanDefinition = instanceFactory.getBeanDefinition();
        saveMapping(BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), instanceFactory);
    }

    @KoinInternalApi
    public final void indexSecondaryTypes(@NotNull InstanceFactory<?> instanceFactory) {
        a.s(instanceFactory, "instanceFactory");
        BeanDefinition<?> beanDefinition = instanceFactory.getBeanDefinition();
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            saveMapping(BeanDefinitionKt.indexKey((c) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), instanceFactory);
        }
    }

    public final boolean isLoaded() {
        return this.mappings.size() > 0;
    }

    @NotNull
    public final List<Module> plus(@NotNull Module module) {
        a.s(module, "module");
        return f0.v(this, module);
    }

    @KoinInternalApi
    public final void prepareForCreationAtStart(@NotNull SingleInstanceFactory<?> singleInstanceFactory) {
        a.s(singleInstanceFactory, "instanceFactory");
        this.eagerInstances.add(singleInstanceFactory);
    }

    public final void saveMapping(@NotNull String str, @NotNull InstanceFactory<?> instanceFactory) {
        a.s(str, "mapping");
        a.s(instanceFactory, "factory");
        this.mappings.put(str, instanceFactory);
    }

    @KoinDslMarker
    public final void scope(@NotNull Qualifier qualifier, @NotNull l lVar) {
        a.s(qualifier, "qualifier");
        a.s(lVar, "scopeSet");
        lVar.invoke(new ScopeDSL(qualifier, this));
        this.scopes.add(qualifier);
    }

    public final void setEagerInstances$koin_core(@NotNull HashSet<SingleInstanceFactory<?>> hashSet) {
        a.s(hashSet, "<set-?>");
        this.eagerInstances = hashSet;
    }

    public final <T> KoinDefinition<T> single(Qualifier qualifier, boolean z2, p pVar) {
        a.s(pVar, "definition");
        ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    public Module(boolean z2) {
        this._createdAtStart = z2;
        this.id = KoinPlatformTools.INSTANCE.generateId();
        this.eagerInstances = new HashSet<>();
        this.mappings = new HashMap<>();
        this.scopes = new HashSet<>();
        this.includedModules = new ArrayList();
    }

    public final void includes(@NotNull Collection<Module> collection) {
        a.s(collection, "module");
        t.t0(this.includedModules, collection);
    }

    @NotNull
    public final List<Module> plus(@NotNull List<Module> list) {
        a.s(list, "modules");
        return u.P0(list, f0.u(this));
    }

    @KoinDslMarker
    public final <T> void scope(l lVar) {
        a.s(lVar, "scopeSet");
        a.A0();
        throw null;
    }

    public final <T> KoinDefinition<T> factory(Qualifier qualifier, p pVar, Qualifier qualifier2) {
        a.s(pVar, "definition");
        a.s(qualifier2, "scopeQualifier");
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    public static KoinDefinition factory$default(Module module, Qualifier qualifier, p pVar, Qualifier qualifier2, int i2, Object obj) {
        a.s(pVar, "definition");
        a.s(qualifier2, "scopeQualifier");
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    public /* synthetic */ Module(boolean z2, int i2, k kVar) {
        this((i2 & 1) != 0 ? false : z2);
    }
}
