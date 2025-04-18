package org.koin.androidx.scope;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import b1.f0;
import d0.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;
import p0.a;

/* loaded from: classes.dex */
public final class FragmentExtKt {
    @NotNull
    public static final Scope createFragmentScope(@NotNull Fragment fragment, boolean z2) {
        a.s(fragment, "<this>");
        if (!(fragment instanceof AndroidScopeComponent)) {
            throw new IllegalStateException("Fragment should implement AndroidScopeComponent".toString());
        }
        Scope scopeOrNull = ComponentCallbackExtKt.getKoin(fragment).getScopeOrNull(KoinScopeComponentKt.getScopeId(fragment));
        if (scopeOrNull == null) {
            scopeOrNull = ComponentActivityExtKt.createScopeForCurrentLifecycle(fragment, fragment);
        }
        if (z2) {
            FragmentActivity requireActivity = fragment.requireActivity();
            a.r(requireActivity, "requireActivity(...)");
            Scope scopeOrNull2 = ComponentActivityExtKt.getScopeOrNull(requireActivity);
            if (scopeOrNull2 != null) {
                scopeOrNull.linkTo(scopeOrNull2);
            } else {
                scopeOrNull.getLogger().debug("Fragment '" + fragment + "' can't be linked to parent activity scope");
            }
        }
        return scopeOrNull;
    }

    public static /* synthetic */ Scope createFragmentScope$default(Fragment fragment, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return createFragmentScope(fragment, z2);
    }

    @d0.a
    @NotNull
    public static final Scope createScope(@NotNull Fragment fragment, @Nullable Object obj) {
        a.s(fragment, "<this>");
        return ComponentCallbackExtKt.getKoin(fragment).createScope(KoinScopeComponentKt.getScopeId(fragment), KoinScopeComponentKt.getScopeName(fragment), obj);
    }

    public static /* synthetic */ Scope createScope$default(Fragment fragment, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        return createScope(fragment, obj);
    }

    @NotNull
    public static final h fragmentScope(@NotNull Fragment fragment, boolean z2) {
        a.s(fragment, "<this>");
        return f0.t(new FragmentExtKt$fragmentScope$1(fragment, z2));
    }

    public static /* synthetic */ h fragmentScope$default(Fragment fragment, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return fragmentScope(fragment, z2);
    }

    @Nullable
    public static final ScopeActivity getScopeActivity(@NotNull Fragment fragment) {
        a.s(fragment, "<this>");
        FragmentActivity activity = fragment.getActivity();
        if (activity instanceof ScopeActivity) {
            return (ScopeActivity) activity;
        }
        return null;
    }

    @Nullable
    public static final Scope getScopeOrNull(@NotNull Fragment fragment) {
        a.s(fragment, "<this>");
        return ComponentCallbackExtKt.getKoin(fragment).getScopeOrNull(KoinScopeComponentKt.getScopeId(fragment));
    }

    public static final <T extends ScopeActivity> T requireScopeActivity(Fragment fragment) {
        a.s(fragment, "<this>");
        fragment.getActivity();
        a.A0();
        throw null;
    }
}
