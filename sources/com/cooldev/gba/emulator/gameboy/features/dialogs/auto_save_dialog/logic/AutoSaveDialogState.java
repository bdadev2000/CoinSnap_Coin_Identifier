package com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class AutoSaveDialogState {
    public static final int $stable = 0;
    private final boolean showingDialog;

    public AutoSaveDialogState() {
        this(false, 1, null);
    }

    public static /* synthetic */ AutoSaveDialogState copy$default(AutoSaveDialogState autoSaveDialogState, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = autoSaveDialogState.showingDialog;
        }
        return autoSaveDialogState.copy(z2);
    }

    public final boolean component1() {
        return this.showingDialog;
    }

    @NotNull
    public final AutoSaveDialogState copy(boolean z2) {
        return new AutoSaveDialogState(z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoSaveDialogState) && this.showingDialog == ((AutoSaveDialogState) obj).showingDialog;
    }

    public final boolean getShowingDialog() {
        return this.showingDialog;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showingDialog);
    }

    @NotNull
    public String toString() {
        return d.s(new StringBuilder("AutoSaveDialogState(showingDialog="), this.showingDialog, ')');
    }

    public AutoSaveDialogState(boolean z2) {
        this.showingDialog = z2;
    }

    public /* synthetic */ AutoSaveDialogState(boolean z2, int i2, k kVar) {
        this((i2 & 1) != 0 ? false : z2);
    }
}
