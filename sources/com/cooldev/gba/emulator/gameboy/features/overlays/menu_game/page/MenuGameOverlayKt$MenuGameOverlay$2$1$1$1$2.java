package com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.page;

import com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class MenuGameOverlayKt$MenuGameOverlay$2$1$1$1$2 extends r implements a {
    final /* synthetic */ GameViewModel $gameViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuGameOverlayKt$MenuGameOverlay$2$1$1$1$2(GameViewModel gameViewModel) {
        super(0);
        this.$gameViewModel = gameViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m273invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m273invoke() {
        this.$gameViewModel.onSpeedSwitchButton();
    }
}
