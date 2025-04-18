package com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.view;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class PopupFileAndDownloadKt$PopupFileAndDownload$3$2$1 extends r implements l {
    final /* synthetic */ Density $localDensity;
    final /* synthetic */ MutableState<Dp> $rowHeightDp$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupFileAndDownloadKt$PopupFileAndDownload$3$2$1(Density density, MutableState<Dp> mutableState) {
        super(1);
        this.$localDensity = density;
        this.$rowHeightDp$delegate = mutableState;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull LayoutCoordinates layoutCoordinates) {
        a.s(layoutCoordinates, "layoutCoordinates");
        PopupFileAndDownloadKt.PopupFileAndDownload$lambda$2(this.$rowHeightDp$delegate, this.$localDensity.H((int) (layoutCoordinates.a() & 4294967295L)));
    }
}
