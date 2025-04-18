package com.cooldev.gba.emulator.gameboy.features.home.page;

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
public final class HomePageKt$HomePage$8$1$1$1 extends r implements l {
    final /* synthetic */ Density $localDensity;
    final /* synthetic */ MutableState<Dp> $topBarHeightDp$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePageKt$HomePage$8$1$1$1(Density density, MutableState<Dp> mutableState) {
        super(1);
        this.$localDensity = density;
        this.$topBarHeightDp$delegate = mutableState;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull LayoutCoordinates layoutCoordinates) {
        a.s(layoutCoordinates, "layoutCoordinates");
        HomePageKt.HomePage$lambda$2(this.$topBarHeightDp$delegate, this.$localDensity.H((int) (layoutCoordinates.a() & 4294967295L)));
    }
}
