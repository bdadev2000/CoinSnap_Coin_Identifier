package com.cooldev.gba.emulator.gameboy.features.dialogs.cancel_sub_dialog.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class CancelSubDialogState {
    public static final int $stable = 0;
    private final boolean showingDialog;

    public CancelSubDialogState() {
        this(false, 1, null);
    }

    public static /* synthetic */ CancelSubDialogState copy$default(CancelSubDialogState cancelSubDialogState, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = cancelSubDialogState.showingDialog;
        }
        return cancelSubDialogState.copy(z2);
    }

    public final boolean component1() {
        return this.showingDialog;
    }

    @NotNull
    public final CancelSubDialogState copy(boolean z2) {
        return new CancelSubDialogState(z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CancelSubDialogState) && this.showingDialog == ((CancelSubDialogState) obj).showingDialog;
    }

    public final boolean getShowingDialog() {
        return this.showingDialog;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showingDialog);
    }

    @NotNull
    public String toString() {
        return d.s(new StringBuilder("CancelSubDialogState(showingDialog="), this.showingDialog, ')');
    }

    public CancelSubDialogState(boolean z2) {
        this.showingDialog = z2;
    }

    public /* synthetic */ CancelSubDialogState(boolean z2, int i2, k kVar) {
        this((i2 & 1) != 0 ? false : z2);
    }
}
