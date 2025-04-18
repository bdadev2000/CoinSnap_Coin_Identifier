package org.koin.ext;

import org.koin.core.Koin;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;
import p0.a;
import x0.g;

/* loaded from: classes2.dex */
public final class InjectPropertyKt {
    public static final <T> void inject(g gVar) {
        a.s(gVar, "<this>");
        KoinPlatformTools.INSTANCE.defaultContext().get().getScopeRegistry().getRootScope();
        a.A0();
        throw null;
    }

    public static final <T> void inject(g gVar, Koin koin) {
        a.s(gVar, "<this>");
        a.s(koin, "koin");
        koin.getScopeRegistry().getRootScope();
        a.A0();
        throw null;
    }

    public static final <T> void inject(g gVar, Scope scope) {
        a.s(gVar, "<this>");
        a.s(scope, "scope");
        a.A0();
        throw null;
    }
}
