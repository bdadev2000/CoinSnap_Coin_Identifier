package com.cooldev.gba.emulator.gameboy.features.dialogs.cancel_sub_dialog.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class CancelSubDialogViewModel$hideDialog$1 extends r implements l {
    public static final CancelSubDialogViewModel$hideDialog$1 INSTANCE = new CancelSubDialogViewModel$hideDialog$1();

    public CancelSubDialogViewModel$hideDialog$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final CancelSubDialogState invoke(@NotNull CancelSubDialogState cancelSubDialogState) {
        a.s(cancelSubDialogState, "it");
        return cancelSubDialogState.copy(false);
    }
}
