package org.koin.dsl;

import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.module.Module;
import org.koin.core.qualifier.Qualifier;
import p0.a;
import q0.p;

@KoinDslMarker
/* loaded from: classes2.dex */
public final class ScopeDSL {

    @NotNull
    private final Module module;

    @NotNull
    private final Qualifier scopeQualifier;

    public ScopeDSL(@NotNull Qualifier qualifier, @NotNull Module module) {
        a.s(qualifier, "scopeQualifier");
        a.s(module, "module");
        this.scopeQualifier = qualifier;
        this.module = module;
    }

    public static KoinDefinition factory$default(ScopeDSL scopeDSL, Qualifier qualifier, p pVar, int i2, Object obj) {
        a.s(pVar, "definition");
        scopeDSL.getModule();
        scopeDSL.getScopeQualifier();
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    public static KoinDefinition scoped$default(ScopeDSL scopeDSL, Qualifier qualifier, p pVar, int i2, Object obj) {
        a.s(pVar, "definition");
        scopeDSL.getScopeQualifier();
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    public final <T> KoinDefinition<T> factory(Qualifier qualifier, p pVar) {
        a.s(pVar, "definition");
        getModule();
        getScopeQualifier();
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    @NotNull
    public final Module getModule() {
        return this.module;
    }

    @NotNull
    public final Qualifier getScopeQualifier() {
        return this.scopeQualifier;
    }

    public final <T> KoinDefinition<T> scoped(Qualifier qualifier, p pVar) {
        a.s(pVar, "definition");
        getScopeQualifier();
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }
}
