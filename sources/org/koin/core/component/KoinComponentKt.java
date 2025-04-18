package org.koin.core.component;

import d0.h;
import d0.i;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import q0.a;

/* loaded from: classes3.dex */
public final class KoinComponentKt {
    public static final <T> T get(KoinComponent koinComponent, Qualifier qualifier, a aVar) {
        p0.a.s(koinComponent, "<this>");
        if (koinComponent instanceof KoinScopeComponent) {
            ((KoinScopeComponent) koinComponent).getScope();
            p0.a.A0();
            throw null;
        }
        koinComponent.getKoin().getScopeRegistry().getRootScope();
        p0.a.A0();
        throw null;
    }

    public static Object get$default(KoinComponent koinComponent, Qualifier qualifier, a aVar, int i2, Object obj) {
        p0.a.s(koinComponent, "<this>");
        if (koinComponent instanceof KoinScopeComponent) {
            ((KoinScopeComponent) koinComponent).getScope();
            p0.a.A0();
            throw null;
        }
        koinComponent.getKoin().getScopeRegistry().getRootScope();
        p0.a.A0();
        throw null;
    }

    public static final <T> h inject(KoinComponent koinComponent, Qualifier qualifier, i iVar, a aVar) {
        p0.a.s(koinComponent, "<this>");
        p0.a.s(iVar, "mode");
        p0.a.A0();
        throw null;
    }

    public static h inject$default(KoinComponent koinComponent, Qualifier qualifier, i iVar, a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            iVar = KoinPlatformTools.INSTANCE.defaultLazyMode();
        }
        p0.a.s(koinComponent, "<this>");
        p0.a.s(iVar, "mode");
        p0.a.A0();
        throw null;
    }
}
