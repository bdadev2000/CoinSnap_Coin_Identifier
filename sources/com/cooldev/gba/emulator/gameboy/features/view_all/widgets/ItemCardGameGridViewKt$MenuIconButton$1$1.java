package com.cooldev.gba.emulator.gameboy.features.view_all.widgets;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class ItemCardGameGridViewKt$MenuIconButton$1$1 extends r implements l {
    final /* synthetic */ MutableState<Offset> $cardPosition$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemCardGameGridViewKt$MenuIconButton$1$1(MutableState<Offset> mutableState) {
        super(1);
        this.$cardPosition$delegate = mutableState;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull LayoutCoordinates layoutCoordinates) {
        a.s(layoutCoordinates, "coordinates");
        ItemCardGameGridViewKt.MenuIconButton$lambda$8(this.$cardPosition$delegate, layoutCoordinates.e0(0L));
    }
}
