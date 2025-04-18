package com.cooldev.gba.emulator.gameboy.features.dashboard.widgets;

import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.logic.AddGameState;
import com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.logic.AddGameViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class ItemBottomBarPortraitWidgetKt$ItemBottomBarPortraitWidget$2$1 extends r implements a {
    final /* synthetic */ AddGameState $addGameState;
    final /* synthetic */ AddGameViewModel $addGameViewModel;
    final /* synthetic */ UserGuideViewModel $userGuideViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemBottomBarPortraitWidgetKt$ItemBottomBarPortraitWidget$2$1(UserGuideViewModel userGuideViewModel, AddGameState addGameState, AddGameViewModel addGameViewModel) {
        super(0);
        this.$userGuideViewModel = userGuideViewModel;
        this.$addGameState = addGameState;
        this.$addGameViewModel = addGameViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m140invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m140invoke() {
        if (!this.$userGuideViewModel.getDataRemote()) {
            if (this.$addGameState.getShowingPopupSelect()) {
                this.$addGameViewModel.hidePopupSelect();
                return;
            } else {
                this.$addGameViewModel.showPopupSelect();
                return;
            }
        }
        this.$userGuideViewModel.endUserGuideAtDownloadGuide();
    }
}
