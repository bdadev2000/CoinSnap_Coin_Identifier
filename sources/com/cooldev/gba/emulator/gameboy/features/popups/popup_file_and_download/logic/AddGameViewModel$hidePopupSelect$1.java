package com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes3.dex */
public final class AddGameViewModel$hidePopupSelect$1 extends r implements l {
    public static final AddGameViewModel$hidePopupSelect$1 INSTANCE = new AddGameViewModel$hidePopupSelect$1();

    public AddGameViewModel$hidePopupSelect$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final AddGameState invoke(@NotNull AddGameState addGameState) {
        a.s(addGameState, "it");
        return addGameState.copy(false);
    }
}
