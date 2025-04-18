package com.cooldev.gba.emulator.gameboy.features.app.logic;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import d0.b0;
import e1.g1;
import e1.i1;
import e1.m0;
import e1.o0;
import e1.t0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;
import q0.p;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PaywallNavigationViewModel extends AndroidViewModel {
    public static final int $stable = 8;

    @NotNull
    private final m0 _state;

    @NotNull
    private final AppViewModel appViewModel;

    @NotNull
    private final g1 state;

    @e(c = "com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel$1", f = "PaywallNavigationViewModel.kt", l = {44}, m = "invokeSuspend")
    /* renamed from: com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements p {
        int label;

        public AnonymousClass1(g gVar) {
            super(2, gVar);
        }

        @Override // j0.a
        @NotNull
        public final g create(@Nullable Object obj, @NotNull g gVar) {
            return new AnonymousClass1(gVar);
        }

        @Override // q0.p
        @Nullable
        public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
            return ((AnonymousClass1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.f30806a;
            int i2 = this.label;
            if (i2 == 0) {
                q.m(obj);
                g1 state = PaywallNavigationViewModel.this.appViewModel.getState();
                final PaywallNavigationViewModel paywallNavigationViewModel = PaywallNavigationViewModel.this;
                e1.i iVar = new e1.i() { // from class: com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel.1.1

                    /* renamed from: com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C01101 extends r implements l {
                        final /* synthetic */ AppState $appState;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C01101(AppState appState) {
                            super(1);
                            this.$appState = appState;
                        }

                        @Override // q0.l
                        @NotNull
                        public final PaywallNavigationState invoke(@NotNull PaywallNavigationState paywallNavigationState) {
                            p0.a.s(paywallNavigationState, "it");
                            return paywallNavigationState.copy(this.$appState.getNumberCodePaywall());
                        }
                    }

                    @Override // e1.i
                    @Nullable
                    public final Object emit(@NotNull AppState appState, @NotNull g gVar) {
                        PaywallNavigationViewModel.this.updateState(new C01101(appState));
                        return b0.f30125a;
                    }
                };
                this.label = 1;
                if (state.collect(iVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallNavigationViewModel(@NotNull Application application, @NotNull AppViewModel appViewModel) {
        super(application);
        p0.a.s(application, "application");
        p0.a.s(appViewModel, "appViewModel");
        this.appViewModel = appViewModel;
        i1 c2 = t0.c(new PaywallNavigationState(0, 1, null));
        this._state = c2;
        this.state = new o0(c2);
        kotlin.jvm.internal.e.v(ViewModelKt.a(this), null, 0, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(l lVar) {
        i1 i1Var;
        Object value;
        m0 m0Var = this._state;
        do {
            i1Var = (i1) m0Var;
            value = i1Var.getValue();
        } while (!i1Var.g(value, lVar.invoke(value)));
    }

    @NotNull
    public final g1 getState() {
        return this.state;
    }

    public final void navigateToPaywall() {
        MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().navigateTo(((PaywallNavigationState) ((i1) this._state).getValue()).getPaywallType().getRouteName());
    }
}
