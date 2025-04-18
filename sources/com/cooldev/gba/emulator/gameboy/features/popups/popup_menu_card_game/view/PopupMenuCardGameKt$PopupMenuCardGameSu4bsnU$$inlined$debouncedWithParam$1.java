package com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.view;

import android.os.SystemClock;
import androidx.compose.runtime.MutableLongState;
import com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.enums.MenuCardGame;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;

/* renamed from: com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.view.PopupMenuCardGameKt$PopupMenuCardGame-Su4bsnU$$inlined$debouncedWithParam$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class PopupMenuCardGameKt$PopupMenuCardGameSu4bsnU$$inlined$debouncedWithParam$1 extends r implements l {
    final /* synthetic */ long $debounceTime;
    final /* synthetic */ MutableLongState $lastTimeClicked$delegate;
    final /* synthetic */ l $onClick$inlined;
    final /* synthetic */ a $onDismissRequest$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupMenuCardGameKt$PopupMenuCardGameSu4bsnU$$inlined$debouncedWithParam$1(long j2, MutableLongState mutableLongState, a aVar, l lVar) {
        super(1);
        this.$debounceTime = j2;
        this.$lastTimeClicked$delegate = mutableLongState;
        this.$onDismissRequest$inlined = aVar;
        this.$onClick$inlined = lVar;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m345invoke((MenuCardGame) obj);
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m345invoke(MenuCardGame menuCardGame) {
        long d;
        long uptimeMillis = SystemClock.uptimeMillis();
        d = this.$lastTimeClicked$delegate.d();
        if (uptimeMillis - d > this.$debounceTime) {
            this.$onDismissRequest$inlined.invoke();
            this.$onClick$inlined.invoke(menuCardGame);
        }
        this.$lastTimeClicked$delegate.o(uptimeMillis);
    }
}
