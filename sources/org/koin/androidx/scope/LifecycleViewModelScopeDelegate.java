package org.koin.androidx.scope;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelLazy;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;
import p0.a;
import q0.l;
import t0.b;
import x0.n;

/* loaded from: classes2.dex */
public final class LifecycleViewModelScopeDelegate implements b {

    @Nullable
    private Scope _scope;

    @NotNull
    private final l createScope;

    @NotNull
    private final Koin koin;

    @NotNull
    private final ComponentActivity lifecycleOwner;

    /* renamed from: org.koin.androidx.scope.LifecycleViewModelScopeDelegate$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends r implements l {
        final /* synthetic */ ComponentActivity $lifecycleOwner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ComponentActivity componentActivity) {
            super(1);
            this.$lifecycleOwner = componentActivity;
        }

        @Override // q0.l
        @NotNull
        public final Scope invoke(@NotNull Koin koin) {
            a.s(koin, "k");
            return Koin.createScope$default(koin, KoinScopeComponentKt.getScopeName(this.$lifecycleOwner).getValue(), KoinScopeComponentKt.getScopeName(this.$lifecycleOwner), null, 4, null);
        }
    }

    public LifecycleViewModelScopeDelegate(@NotNull ComponentActivity componentActivity, @NotNull Koin koin, @NotNull l lVar) {
        a.s(componentActivity, "lifecycleOwner");
        a.s(koin, "koin");
        a.s(lVar, "createScope");
        this.lifecycleOwner = componentActivity;
        this.koin = koin;
        this.createScope = lVar;
        final ScopeHandlerViewModel scopeHandlerViewModel = (ScopeHandlerViewModel) new ViewModelLazy(g0.a(ScopeHandlerViewModel.class), new LifecycleViewModelScopeDelegate$special$$inlined$viewModels$default$2(componentActivity), new LifecycleViewModelScopeDelegate$special$$inlined$viewModels$default$1(componentActivity), new LifecycleViewModelScopeDelegate$special$$inlined$viewModels$default$3(null, componentActivity)).getValue();
        componentActivity.getLifecycle().a(new DefaultLifecycleObserver() { // from class: org.koin.androidx.scope.LifecycleViewModelScopeDelegate.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
                a.s(lifecycleOwner, "owner");
                if (ScopeHandlerViewModel.this.getScope() == null) {
                    ScopeHandlerViewModel.this.setScope((Scope) this.createScope.invoke(this.koin));
                }
                this._scope = ScopeHandlerViewModel.this.getScope();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
                a.s(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(@NotNull LifecycleOwner lifecycleOwner) {
                a.s(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(@NotNull LifecycleOwner lifecycleOwner) {
                a.s(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(@NotNull LifecycleOwner lifecycleOwner) {
                a.s(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(@NotNull LifecycleOwner lifecycleOwner) {
                a.s(lifecycleOwner, "owner");
            }
        });
    }

    private final boolean isActive(LifecycleOwner lifecycleOwner) {
        return lifecycleOwner.getLifecycle().b().a(Lifecycle.State.f19989c);
    }

    @Override // t0.b
    @NotNull
    public Scope getValue(@NotNull LifecycleOwner lifecycleOwner, @NotNull n nVar) {
        a.s(lifecycleOwner, "thisRef");
        a.s(nVar, "property");
        Scope scope = this._scope;
        if (scope != null) {
            a.p(scope);
            return scope;
        }
        if (isActive(lifecycleOwner)) {
            Scope scopeOrNull = this.koin.getScopeOrNull(KoinScopeComponentKt.getScopeName(this.lifecycleOwner).getValue());
            if (scopeOrNull == null) {
                scopeOrNull = (Scope) this.createScope.invoke(this.koin);
            }
            this._scope = scopeOrNull;
            this.koin.getLogger().debug("got scope: " + this._scope + " for " + this.lifecycleOwner);
            Scope scope2 = this._scope;
            a.p(scope2);
            return scope2;
        }
        throw new IllegalStateException(("can't get Scope for " + this.lifecycleOwner + " - LifecycleOwner is not Active").toString());
    }

    public /* synthetic */ LifecycleViewModelScopeDelegate(ComponentActivity componentActivity, Koin koin, l lVar, int i2, k kVar) {
        this(componentActivity, koin, (i2 & 4) != 0 ? new AnonymousClass1(componentActivity) : lVar);
    }
}
