package com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog.logic;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import e1.g1;
import e1.i1;
import e1.m0;
import e1.o0;
import e1.t0;
import org.jetbrains.annotations.NotNull;
import q0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class LoadingDialogViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    private final m0 _state;

    @NotNull
    private final g1 state;

    public LoadingDialogViewModel() {
        i1 c2 = t0.c(new LoadingDialogState(false, 1, null));
        this._state = c2;
        this.state = new o0(c2);
    }

    private final void updateState(l lVar) {
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

    public final void hideDialog() {
        updateState(LoadingDialogViewModel$hideDialog$1.INSTANCE);
    }

    public final void showDialog() {
        updateState(LoadingDialogViewModel$showDialog$1.INSTANCE);
    }

    public final void withLoading(@NotNull a aVar) {
        p0.a.s(aVar, "block");
        showDialog();
        aVar.invoke();
        hideDialog();
    }
}
