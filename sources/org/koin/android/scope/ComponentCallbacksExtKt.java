package org.koin.android.scope;

import android.content.ComponentCallbacks;
import b1.f0;
import d0.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;
import p0.a;

/* loaded from: classes2.dex */
public final class ComponentCallbacksExtKt {
    @NotNull
    public static final <T extends ComponentCallbacks> Scope createScope(@NotNull T t2, @Nullable Object obj) {
        a.s(t2, "<this>");
        return ComponentCallbackExtKt.getKoin(t2).createScope(KoinScopeComponentKt.getScopeId(t2), KoinScopeComponentKt.getScopeName(t2), obj);
    }

    public static /* synthetic */ Scope createScope$default(ComponentCallbacks componentCallbacks, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        return createScope(componentCallbacks, obj);
    }

    @NotNull
    public static final <T extends ComponentCallbacks> h getOrCreateScope(@NotNull T t2) {
        a.s(t2, "<this>");
        return f0.t(new ComponentCallbacksExtKt$getOrCreateScope$1(t2));
    }

    @Nullable
    public static final <T extends ComponentCallbacks> Scope getScopeOrNull(@NotNull T t2) {
        a.s(t2, "<this>");
        return ComponentCallbackExtKt.getKoin(t2).getScopeOrNull(KoinScopeComponentKt.getScopeId(t2));
    }

    @NotNull
    public static final <T extends ComponentCallbacks> h newScope(@NotNull T t2) {
        a.s(t2, "<this>");
        return f0.t(new ComponentCallbacksExtKt$newScope$1(t2));
    }
}
