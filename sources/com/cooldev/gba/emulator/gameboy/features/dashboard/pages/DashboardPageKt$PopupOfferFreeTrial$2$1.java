package com.cooldev.gba.emulator.gameboy.features.dashboard.pages;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSizeKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class DashboardPageKt$PopupOfferFreeTrial$2$1 extends r implements l {
    final /* synthetic */ MutableState<Size> $boxSize$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardPageKt$PopupOfferFreeTrial$2$1(MutableState<Size> mutableState) {
        super(1);
        this.$boxSize$delegate = mutableState;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull LayoutCoordinates layoutCoordinates) {
        a.s(layoutCoordinates, "layoutCoordinates");
        DashboardPageKt.PopupOfferFreeTrial$lambda$17(this.$boxSize$delegate, IntSizeKt.c(layoutCoordinates.a()));
    }
}
