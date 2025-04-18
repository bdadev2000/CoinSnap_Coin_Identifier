package org.koin.android.ext.android;

import android.content.ComponentCallbacks;
import d0.h;
import d0.i;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.Qualifier;
import q0.a;

/* loaded from: classes.dex */
public final class ComponentCallbackExtKt {
    public static final <T> T get(ComponentCallbacks componentCallbacks, Qualifier qualifier, a aVar) {
        p0.a.s(componentCallbacks, "<this>");
        AndroidKoinScopeExtKt.getKoinScope(componentCallbacks);
        p0.a.A0();
        throw null;
    }

    public static Object get$default(ComponentCallbacks componentCallbacks, Qualifier qualifier, a aVar, int i2, Object obj) {
        p0.a.s(componentCallbacks, "<this>");
        AndroidKoinScopeExtKt.getKoinScope(componentCallbacks);
        p0.a.A0();
        throw null;
    }

    @NotNull
    public static final Koin getKoin(@NotNull ComponentCallbacks componentCallbacks) {
        p0.a.s(componentCallbacks, "<this>");
        return componentCallbacks instanceof KoinComponent ? ((KoinComponent) componentCallbacks).getKoin() : GlobalContext.INSTANCE.get();
    }

    public static final <T> h inject(ComponentCallbacks componentCallbacks, Qualifier qualifier, i iVar, a aVar) {
        p0.a.s(componentCallbacks, "<this>");
        p0.a.s(iVar, "mode");
        p0.a.A0();
        throw null;
    }

    public static h inject$default(ComponentCallbacks componentCallbacks, Qualifier qualifier, i iVar, a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            iVar = i.f30131a;
        }
        p0.a.s(componentCallbacks, "<this>");
        p0.a.s(iVar, "mode");
        p0.a.A0();
        throw null;
    }
}
