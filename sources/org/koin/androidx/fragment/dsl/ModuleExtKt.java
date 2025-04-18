package org.koin.androidx.fragment.dsl;

import androidx.fragment.app.Fragment;
import org.koin.core.annotation.KoinReflectAPI;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.ScopeRegistry;
import p0.a;
import q0.p;

/* loaded from: classes.dex */
public final class ModuleExtKt {
    public static final <T extends Fragment> KoinDefinition<T> fragment(Module module, Qualifier qualifier, p pVar) {
        a.s(module, "<this>");
        a.s(pVar, "definition");
        ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    public static KoinDefinition fragment$default(Module module, Qualifier qualifier, p pVar, int i2, Object obj) {
        a.s(module, "<this>");
        a.s(pVar, "definition");
        ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    @d0.a
    @KoinReflectAPI
    public static final <T extends Fragment> KoinDefinition<T> fragment(Module module, Qualifier qualifier) {
        a.s(module, "<this>");
        a.A0();
        throw null;
    }

    public static KoinDefinition fragment$default(Module module, Qualifier qualifier, int i2, Object obj) {
        a.s(module, "<this>");
        a.A0();
        throw null;
    }
}
