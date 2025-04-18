package com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.widgets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes2.dex */
public final class ItemMenuCardGameKt$ImageLeading$1 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ int $resId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemMenuCardGameKt$ImageLeading$1(int i2, long j2, int i3) {
        super(2);
        this.$resId = i2;
        this.$color = j2;
        this.$$changed = i3;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        ItemMenuCardGameKt.m348ImageLeadingRPmYEkk(this.$resId, this.$color, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
