package org.koin.android.ext.android;

import android.content.ComponentCallbacks;
import org.jetbrains.annotations.NotNull;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;
import org.koin.core.scope.Scope;
import p0.a;

/* loaded from: classes2.dex */
public final class AndroidKoinScopeExtKt {
    @KoinInternalApi
    @NotNull
    public static final Scope getKoinScope(@NotNull ComponentCallbacks componentCallbacks) {
        a.s(componentCallbacks, "<this>");
        return componentCallbacks instanceof AndroidScopeComponent ? ((AndroidScopeComponent) componentCallbacks).getScope() : componentCallbacks instanceof KoinScopeComponent ? ((KoinScopeComponent) componentCallbacks).getScope() : componentCallbacks instanceof KoinComponent ? ((KoinComponent) componentCallbacks).getKoin().getScopeRegistry().getRootScope() : GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope();
    }
}
