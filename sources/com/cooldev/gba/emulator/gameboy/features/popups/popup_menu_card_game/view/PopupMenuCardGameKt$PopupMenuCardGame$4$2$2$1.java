package com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.view;

import com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.enums.MenuCardGame;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;

/* loaded from: classes.dex */
public final class PopupMenuCardGameKt$PopupMenuCardGame$4$2$2$1 extends r implements a {
    final /* synthetic */ l $debouncedOnClick;
    final /* synthetic */ MenuCardGame $menu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupMenuCardGameKt$PopupMenuCardGame$4$2$2$1(l lVar, MenuCardGame menuCardGame) {
        super(0);
        this.$debouncedOnClick = lVar;
        this.$menu = menuCardGame;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m347invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m347invoke() {
        this.$debouncedOnClick.invoke(this.$menu);
    }
}
