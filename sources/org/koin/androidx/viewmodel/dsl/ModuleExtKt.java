package org.koin.androidx.viewmodel.dsl;

import androidx.lifecycle.ViewModel;
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
    public static final <T extends ViewModel> KoinDefinition<T> viewModel(Module module, Qualifier qualifier, p pVar) {
        a.s(module, "<this>");
        a.s(pVar, "definition");
        ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    public static KoinDefinition viewModel$default(Module module, Qualifier qualifier, p pVar, int i2, Object obj) {
        a.s(module, "<this>");
        a.s(pVar, "definition");
        ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    @KoinReflectAPI
    public static final <T extends ViewModel> KoinDefinition<T> viewModel(Module module, Qualifier qualifier) {
        a.s(module, "<this>");
        a.A0();
        throw null;
    }

    public static KoinDefinition viewModel$default(Module module, Qualifier qualifier, int i2, Object obj) {
        a.s(module, "<this>");
        a.A0();
        throw null;
    }
}
