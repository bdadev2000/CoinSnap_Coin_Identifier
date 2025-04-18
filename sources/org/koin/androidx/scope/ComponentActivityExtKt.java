package org.koin.androidx.scope;

import android.content.ComponentCallbacks;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelLazy;
import b1.f0;
import d0.h;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;
import org.koin.core.scope.ScopeCallback;
import p0.a;

/* loaded from: classes.dex */
public final class ComponentActivityExtKt {
    @NotNull
    public static final h activityRetainedScope(@NotNull ComponentActivity componentActivity) {
        a.s(componentActivity, "<this>");
        return f0.t(new ComponentActivityExtKt$activityRetainedScope$1(componentActivity));
    }

    @NotNull
    public static final h activityScope(@NotNull ComponentActivity componentActivity) {
        a.s(componentActivity, "<this>");
        return f0.t(new ComponentActivityExtKt$activityScope$1(componentActivity));
    }

    @NotNull
    public static final Scope createActivityRetainedScope(@NotNull ComponentActivity componentActivity) {
        a.s(componentActivity, "<this>");
        if (!(componentActivity instanceof AndroidScopeComponent)) {
            throw new IllegalStateException("Activity should implement AndroidScopeComponent".toString());
        }
        ScopeHandlerViewModel scopeHandlerViewModel = (ScopeHandlerViewModel) new ViewModelLazy(g0.a(ScopeHandlerViewModel.class), new ComponentActivityExtKt$createActivityRetainedScope$$inlined$viewModels$default$2(componentActivity), new ComponentActivityExtKt$createActivityRetainedScope$$inlined$viewModels$default$1(componentActivity), new ComponentActivityExtKt$createActivityRetainedScope$$inlined$viewModels$default$3(null, componentActivity)).getValue();
        if (scopeHandlerViewModel.getScope() == null) {
            scopeHandlerViewModel.setScope(Koin.createScope$default(ComponentCallbackExtKt.getKoin(componentActivity), KoinScopeComponentKt.getScopeId(componentActivity), KoinScopeComponentKt.getScopeName(componentActivity), null, 4, null));
        }
        Scope scope = scopeHandlerViewModel.getScope();
        a.p(scope);
        return scope;
    }

    @NotNull
    public static final Scope createActivityScope(@NotNull ComponentActivity componentActivity) {
        a.s(componentActivity, "<this>");
        if (!(componentActivity instanceof AndroidScopeComponent)) {
            throw new IllegalStateException("Activity should implement AndroidScopeComponent".toString());
        }
        Scope scopeOrNull = ComponentCallbackExtKt.getKoin(componentActivity).getScopeOrNull(KoinScopeComponentKt.getScopeId(componentActivity));
        return scopeOrNull == null ? createScopeForCurrentLifecycle(componentActivity, componentActivity) : scopeOrNull;
    }

    @KoinInternalApi
    @NotNull
    public static final Scope createScope(@NotNull ComponentActivity componentActivity, @Nullable Object obj) {
        a.s(componentActivity, "<this>");
        return ComponentCallbackExtKt.getKoin(componentActivity).createScope(KoinScopeComponentKt.getScopeId(componentActivity), KoinScopeComponentKt.getScopeName(componentActivity), obj);
    }

    public static /* synthetic */ Scope createScope$default(ComponentActivity componentActivity, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        return createScope(componentActivity, obj);
    }

    @NotNull
    public static final Scope createScopeForCurrentLifecycle(@NotNull ComponentCallbacks componentCallbacks, @NotNull final LifecycleOwner lifecycleOwner) {
        a.s(componentCallbacks, "<this>");
        a.s(lifecycleOwner, "owner");
        Scope createScope = ComponentCallbackExtKt.getKoin(componentCallbacks).createScope(KoinScopeComponentKt.getScopeId(componentCallbacks), KoinScopeComponentKt.getScopeName(componentCallbacks), componentCallbacks);
        createScope.registerCallback(new ScopeCallback() { // from class: org.koin.androidx.scope.ComponentActivityExtKt$createScopeForCurrentLifecycle$1
            @Override // org.koin.core.scope.ScopeCallback
            public void onScopeClose(@NotNull Scope scope) {
                a.s(scope, "scope");
                LifecycleOwner lifecycleOwner2 = LifecycleOwner.this;
                a.q(lifecycleOwner2, "null cannot be cast to non-null type org.koin.android.scope.AndroidScopeComponent");
                ((AndroidScopeComponent) lifecycleOwner2).onCloseScope();
            }
        });
        registerScopeForLifecycle(lifecycleOwner, createScope);
        return createScope;
    }

    @Nullable
    public static final Scope getScopeOrNull(@NotNull ComponentActivity componentActivity) {
        a.s(componentActivity, "<this>");
        return ComponentCallbackExtKt.getKoin(componentActivity).getScopeOrNull(KoinScopeComponentKt.getScopeId(componentActivity));
    }

    public static final void registerScopeForLifecycle(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Scope scope) {
        a.s(lifecycleOwner, "<this>");
        a.s(scope, "scope");
        lifecycleOwner.getLifecycle().a(new DefaultLifecycleObserver() { // from class: org.koin.androidx.scope.ComponentActivityExtKt$registerScopeForLifecycle$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(@NotNull LifecycleOwner lifecycleOwner2) {
                a.s(lifecycleOwner2, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(@NotNull LifecycleOwner lifecycleOwner2) {
                a.s(lifecycleOwner2, "owner");
                Scope.this.close();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(@NotNull LifecycleOwner lifecycleOwner2) {
                a.s(lifecycleOwner2, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(@NotNull LifecycleOwner lifecycleOwner2) {
                a.s(lifecycleOwner2, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(@NotNull LifecycleOwner lifecycleOwner2) {
                a.s(lifecycleOwner2, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(@NotNull LifecycleOwner lifecycleOwner2) {
                a.s(lifecycleOwner2, "owner");
            }
        });
    }
}
