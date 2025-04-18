package org.koin.androidx.scope;

import androidx.lifecycle.LifecycleOwner;
import org.jetbrains.annotations.NotNull;
import org.koin.core.scope.Scope;
import p0.a;

/* loaded from: classes4.dex */
public final class LifecycleOwnerExtKt {
    @NotNull
    public static final Scope getCurrentScope(@NotNull LifecycleOwner lifecycleOwner) {
        a.s(lifecycleOwner, "<this>");
        throw new IllegalStateException("Don't use scope on a lifecycle component. Use ScopeActivity or ScopeFragment instead".toString());
    }

    @d0.a
    public static /* synthetic */ void getCurrentScope$annotations(LifecycleOwner lifecycleOwner) {
    }

    @NotNull
    public static final Scope getLifecycleScope(@NotNull LifecycleOwner lifecycleOwner) {
        a.s(lifecycleOwner, "<this>");
        throw new IllegalStateException("Don't use scope on a lifecycle component. Use ScopeActivity or ScopeFragment instead".toString());
    }

    @d0.a
    public static /* synthetic */ void getLifecycleScope$annotations(LifecycleOwner lifecycleOwner) {
    }

    @NotNull
    public static final Scope getScope(@NotNull LifecycleOwner lifecycleOwner) {
        a.s(lifecycleOwner, "<this>");
        throw new IllegalStateException("Don't use scope on a lifecycle component. Use ScopeActivity or ScopeFragment instead".toString());
    }

    @d0.a
    public static /* synthetic */ void getScope$annotations(LifecycleOwner lifecycleOwner) {
    }
}
