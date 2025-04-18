package com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LoadingDialogState {
    public static final int $stable = 0;
    private final boolean showDialog;

    public LoadingDialogState() {
        this(false, 1, null);
    }

    public static /* synthetic */ LoadingDialogState copy$default(LoadingDialogState loadingDialogState, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = loadingDialogState.showDialog;
        }
        return loadingDialogState.copy(z2);
    }

    public final boolean component1() {
        return this.showDialog;
    }

    @NotNull
    public final LoadingDialogState copy(boolean z2) {
        return new LoadingDialogState(z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoadingDialogState) && this.showDialog == ((LoadingDialogState) obj).showDialog;
    }

    public final boolean getShowDialog() {
        return this.showDialog;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showDialog);
    }

    @NotNull
    public String toString() {
        return d.s(new StringBuilder("LoadingDialogState(showDialog="), this.showDialog, ')');
    }

    public LoadingDialogState(boolean z2) {
        this.showDialog = z2;
    }

    public /* synthetic */ LoadingDialogState(boolean z2, int i2, k kVar) {
        this((i2 & 1) != 0 ? false : z2);
    }
}
