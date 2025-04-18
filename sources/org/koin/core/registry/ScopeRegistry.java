package org.koin.core.registry;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.error.ScopeAlreadyCreatedException;
import org.koin.core.module.Module;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;
import p0.a;

/* loaded from: classes3.dex */
public final class ScopeRegistry {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String ROOT_SCOPE_ID = "_root_";

    @NotNull
    private static final StringQualifier rootScopeQualifier = QualifierKt._q(ROOT_SCOPE_ID);

    @NotNull
    private final Koin _koin;

    @NotNull
    private final HashSet<Qualifier> _scopeDefinitions;

    @NotNull
    private final Map<String, Scope> _scopes;

    @NotNull
    private final Scope rootScope;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ void getRootScopeQualifier$annotations() {
        }

        @NotNull
        public final StringQualifier getRootScopeQualifier() {
            return ScopeRegistry.rootScopeQualifier;
        }
    }

    public ScopeRegistry(@NotNull Koin koin) {
        a.s(koin, "_koin");
        this._koin = koin;
        HashSet<Qualifier> hashSet = new HashSet<>();
        this._scopeDefinitions = hashSet;
        Map<String, Scope> safeHashMap = KoinPlatformTools.INSTANCE.safeHashMap();
        this._scopes = safeHashMap;
        Scope scope = new Scope(rootScopeQualifier, ROOT_SCOPE_ID, true, koin);
        this.rootScope = scope;
        hashSet.add(scope.getScopeQualifier());
        safeHashMap.put(scope.getId(), scope);
    }

    private final void closeAllScopes() {
        Iterator<T> it = this._scopes.values().iterator();
        while (it.hasNext()) {
            ((Scope) it.next()).close();
        }
    }

    public static /* synthetic */ Scope createScope$default(ScopeRegistry scopeRegistry, String str, Qualifier qualifier, Object obj, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return scopeRegistry.createScope(str, qualifier, obj);
    }

    @KoinInternalApi
    public static /* synthetic */ void getRootScope$annotations() {
    }

    private final void loadModule(Module module) {
        this._scopeDefinitions.addAll(module.getScopes());
    }

    public final void close$koin_core() {
        closeAllScopes();
        this._scopes.clear();
        this._scopeDefinitions.clear();
    }

    @NotNull
    public final Scope createScope(@NotNull String str, @NotNull Qualifier qualifier, @Nullable Object obj) {
        a.s(str, "scopeId");
        a.s(qualifier, "qualifier");
        this._koin.getLogger().debug("|- (+) Scope - id:'" + str + "' q:" + qualifier);
        if (!this._scopeDefinitions.contains(qualifier)) {
            this._koin.getLogger().debug("| Scope '" + qualifier + "' not defined. Creating it ...");
            this._scopeDefinitions.add(qualifier);
        }
        if (this._scopes.containsKey(str)) {
            throw new ScopeAlreadyCreatedException(androidx.compose.foundation.text.input.a.A("Scope with id '", str, "' is already created"));
        }
        Scope scope = new Scope(qualifier, str, false, this._koin, 4, null);
        if (obj != null) {
            this._koin.getLogger().debug("|- Scope source set id:'" + str + "' -> " + obj);
            scope.set_source(obj);
        }
        scope.linkTo(this.rootScope);
        this._scopes.put(str, scope);
        return scope;
    }

    public final void deleteScope$koin_core(@NotNull String str) {
        a.s(str, "scopeId");
        Scope scope = this._scopes.get(str);
        if (scope != null) {
            deleteScope$koin_core(scope);
        }
    }

    @NotNull
    public final Scope getRootScope() {
        return this.rootScope;
    }

    @NotNull
    public final Set<Qualifier> getScopeDefinitions() {
        return this._scopeDefinitions;
    }

    @Nullable
    public final Scope getScopeOrNull(@NotNull String str) {
        a.s(str, "scopeId");
        return this._scopes.get(str);
    }

    public final void loadScopes(@NotNull Set<Module> set) {
        a.s(set, "modules");
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            loadModule((Module) it.next());
        }
    }

    public final void deleteScope$koin_core(@NotNull Scope scope) {
        a.s(scope, "scope");
        this._koin.getInstanceRegistry().dropScopeInstances$koin_core(scope);
        this._scopes.remove(scope.getId());
    }
}
