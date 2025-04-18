package com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.view;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.enums.MenuCardGame;
import com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.widgets.ItemMenuCardGameKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes.dex */
public final class PopupMenuCardGameKt$PopupMenuCardGame$4$2$1 extends r implements p {
    final /* synthetic */ MenuCardGame $menu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupMenuCardGameKt$PopupMenuCardGame$4$2$1(MenuCardGame menuCardGame) {
        super(2);
        this.$menu = menuCardGame;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@Nullable Composer composer, int i2) {
        long menuColor;
        if ((i2 & 11) == 2 && composer.i()) {
            composer.A();
            return;
        }
        MenuCardGame menuCardGame = this.$menu;
        menuColor = PopupMenuCardGameKt.getMenuColor(menuCardGame);
        ItemMenuCardGameKt.m349ItemMenuCardGameRPmYEkk(menuCardGame, menuColor, composer, 0);
    }
}
