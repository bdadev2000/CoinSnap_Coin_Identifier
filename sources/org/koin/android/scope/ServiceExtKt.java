package org.koin.android.scope;

import android.app.Service;
import b1.f0;
import d0.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;
import p0.a;

/* loaded from: classes3.dex */
public final class ServiceExtKt {
    @KoinInternalApi
    @NotNull
    public static final Scope createScope(@NotNull Service service, @Nullable Object obj) {
        a.s(service, "<this>");
        return ComponentCallbackExtKt.getKoin(service).createScope(KoinScopeComponentKt.getScopeId(service), KoinScopeComponentKt.getScopeName(service), obj);
    }

    public static /* synthetic */ Scope createScope$default(Service service, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        return createScope(service, obj);
    }

    @NotNull
    public static final Scope createServiceScope(@NotNull Service service) {
        a.s(service, "<this>");
        if (!(service instanceof AndroidScopeComponent)) {
            throw new IllegalStateException("Service should implement AndroidScopeComponent".toString());
        }
        Koin koin = ComponentCallbackExtKt.getKoin(service);
        Scope scopeOrNull = koin.getScopeOrNull(KoinScopeComponentKt.getScopeId(service));
        return scopeOrNull == null ? koin.createScope(KoinScopeComponentKt.getScopeId(service), KoinScopeComponentKt.getScopeName(service), service) : scopeOrNull;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void destroyServiceScope(@NotNull Service service) {
        a.s(service, "<this>");
        if (!(service instanceof AndroidScopeComponent)) {
            throw new IllegalStateException("Service should implement AndroidScopeComponent".toString());
        }
        ((AndroidScopeComponent) service).getScope().close();
    }

    @KoinInternalApi
    @Nullable
    public static final Scope getScopeOrNull(@NotNull Service service) {
        a.s(service, "<this>");
        return ComponentCallbackExtKt.getKoin(service).getScopeOrNull(KoinScopeComponentKt.getScopeId(service));
    }

    @NotNull
    public static final h serviceScope(@NotNull Service service) {
        a.s(service, "<this>");
        return f0.t(new ServiceExtKt$serviceScope$1(service));
    }
}
