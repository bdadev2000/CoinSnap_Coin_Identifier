package com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes3.dex */
public final class LoadingDialogViewModel$showDialog$1 extends r implements l {
    public static final LoadingDialogViewModel$showDialog$1 INSTANCE = new LoadingDialogViewModel$showDialog$1();

    public LoadingDialogViewModel$showDialog$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final LoadingDialogState invoke(@NotNull LoadingDialogState loadingDialogState) {
        a.s(loadingDialogState, "it");
        return loadingDialogState.copy(true);
    }
}
