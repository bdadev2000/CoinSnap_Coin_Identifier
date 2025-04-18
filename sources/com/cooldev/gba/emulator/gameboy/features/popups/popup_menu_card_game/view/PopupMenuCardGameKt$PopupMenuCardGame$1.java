package com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
public final class PopupMenuCardGameKt$PopupMenuCardGame$1 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ boolean $gameIsFavorite;
    final /* synthetic */ boolean $isShowingPopup;
    final /* synthetic */ l $onClick;
    final /* synthetic */ a $onDismissRequest;
    final /* synthetic */ long $touchPoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupMenuCardGameKt$PopupMenuCardGame$1(boolean z2, boolean z3, long j2, a aVar, boolean z4, l lVar, int i2) {
        super(2);
        this.$expanded = z2;
        this.$isShowingPopup = z3;
        this.$touchPoint = j2;
        this.$onDismissRequest = aVar;
        this.$gameIsFavorite = z4;
        this.$onClick = lVar;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        PopupMenuCardGameKt.m344PopupMenuCardGameSu4bsnU(this.$expanded, this.$isShowingPopup, this.$touchPoint, this.$onDismissRequest, this.$gameIsFavorite, this.$onClick, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
