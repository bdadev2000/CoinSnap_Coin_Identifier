package com.cooldev.gba.emulator.gameboy.features.overlays.save_game.logic;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import e1.g1;
import e1.i1;
import e1.m0;
import e1.o0;
import e1.t0;
import org.jetbrains.annotations.NotNull;
import q0.l;

@StabilityInferred
/* loaded from: classes.dex */
public final class SaveGameViewModel extends ViewModel {
    public static final int $stable = 8;

    @SuppressLint({"StaticFieldLeak"})
    @NotNull
    private final m0 _state;

    @NotNull
    private final g1 state;

    public SaveGameViewModel() {
        i1 c2 = t0.c(new SaveGameState(false, 1, null));
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

    public final void hideSaveGameView() {
        updateState(SaveGameViewModel$hideSaveGameView$1.INSTANCE);
    }

    public final void showSaveGameView() {
        updateState(SaveGameViewModel$showSaveGameView$1.INSTANCE);
    }
}
