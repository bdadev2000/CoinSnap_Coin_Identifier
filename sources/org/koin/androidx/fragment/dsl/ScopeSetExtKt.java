package org.koin.androidx.fragment.dsl;

import androidx.fragment.app.Fragment;
import org.koin.core.annotation.KoinReflectAPI;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.qualifier.Qualifier;
import org.koin.dsl.ScopeDSL;
import p0.a;
import q0.p;

/* loaded from: classes4.dex */
public final class ScopeSetExtKt {
    public static final <T extends Fragment> KoinDefinition<T> fragment(ScopeDSL scopeDSL, Qualifier qualifier, p pVar) {
        a.s(scopeDSL, "<this>");
        a.s(pVar, "definition");
        scopeDSL.getModule();
        scopeDSL.getScopeQualifier();
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    public static KoinDefinition fragment$default(ScopeDSL scopeDSL, Qualifier qualifier, p pVar, int i2, Object obj) {
        a.s(scopeDSL, "<this>");
        a.s(pVar, "definition");
        scopeDSL.getModule();
        scopeDSL.getScopeQualifier();
        Kind kind = Kind.Singleton;
        a.A0();
        throw null;
    }

    @d0.a
    @KoinReflectAPI
    public static final <T extends Fragment> KoinDefinition<T> fragment(ScopeDSL scopeDSL, Qualifier qualifier) {
        a.s(scopeDSL, "<this>");
        a.A0();
        throw null;
    }

    public static KoinDefinition fragment$default(ScopeDSL scopeDSL, Qualifier qualifier, int i2, Object obj) {
        a.s(scopeDSL, "<this>");
        a.A0();
        throw null;
    }
}
