package com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class AutoSaveDialogViewModel$showDialog$1 extends r implements l {
    public static final AutoSaveDialogViewModel$showDialog$1 INSTANCE = new AutoSaveDialogViewModel$showDialog$1();

    public AutoSaveDialogViewModel$showDialog$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final AutoSaveDialogState invoke(@NotNull AutoSaveDialogState autoSaveDialogState) {
        a.s(autoSaveDialogState, "it");
        return autoSaveDialogState.copy(true);
    }
}
