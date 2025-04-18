package com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.logic;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import e1.g1;
import e1.i1;
import e1.m0;
import e1.o0;
import e1.t0;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class AddGameViewModel extends AndroidViewModel {
    public static final int $stable = 8;

    @NotNull
    private final m0 _state;

    @NotNull
    private final g1 state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddGameViewModel(@NotNull Application application) {
        super(application);
        a.s(application, "application");
        i1 c2 = t0.c(new AddGameState(false, 1, null));
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

    public final void hidePopupSelect() {
        updateState(AddGameViewModel$hidePopupSelect$1.INSTANCE);
    }

    public final void showPopupSelect() {
        updateState(AddGameViewModel$showPopupSelect$1.INSTANCE);
    }
}
