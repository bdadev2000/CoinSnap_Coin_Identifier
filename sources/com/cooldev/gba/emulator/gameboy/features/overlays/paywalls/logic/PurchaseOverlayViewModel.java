package com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.app.logic.AppState;
import com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel;
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
/* loaded from: classes2.dex */
public final class PurchaseOverlayViewModel extends AndroidViewModel {
    public static final int $stable = 8;

    @NotNull
    private final m0 _state;

    @NotNull
    private final AppViewModel appViewModel;

    @NotNull
    private final g1 state;

    @e(c = "com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic.PurchaseOverlayViewModel$1", f = "PurchaseOverlayViewModel.kt", l = {44}, m = "invokeSuspend")
    /* renamed from: com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic.PurchaseOverlayViewModel$1, reason: invalid class name */
    /* loaded from: classes2.dex */
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
                g1 state = PurchaseOverlayViewModel.this.appViewModel.getState();
                final PurchaseOverlayViewModel purchaseOverlayViewModel = PurchaseOverlayViewModel.this;
                e1.i iVar = new e1.i() { // from class: com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic.PurchaseOverlayViewModel.1.1

                    /* renamed from: com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic.PurchaseOverlayViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
                    /* loaded from: classes2.dex */
                    public static final class C01181 extends r implements l {
                        final /* synthetic */ AppState $appState;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C01181(AppState appState) {
                            super(1);
                            this.$appState = appState;
                        }

                        @Override // q0.l
                        @NotNull
                        public final PurchaseOverlayState invoke(@NotNull PurchaseOverlayState purchaseOverlayState) {
                            p0.a.s(purchaseOverlayState, "it");
                            return PurchaseOverlayState.copy$default(purchaseOverlayState, false, this.$appState.getNumberCodePaywall(), 1, null);
                        }
                    }

                    @Override // e1.i
                    @Nullable
                    public final Object emit(@NotNull AppState appState, @NotNull g gVar) {
                        PurchaseOverlayViewModel.this.updateState(new C01181(appState));
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
    public PurchaseOverlayViewModel(@NotNull Application application, @NotNull AppViewModel appViewModel) {
        super(application);
        p0.a.s(application, "application");
        p0.a.s(appViewModel, "appViewModel");
        this.appViewModel = appViewModel;
        i1 c2 = t0.c(new PurchaseOverlayState(false, 0, 3, null));
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

    public final void hideOverlay() {
        updateState(PurchaseOverlayViewModel$hideOverlay$1.INSTANCE);
    }

    public final void showOverlay() {
        updateState(PurchaseOverlayViewModel$showOverlay$1.INSTANCE);
    }
}
