package com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.view;

import android.content.Context;
import com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt;
import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.logic.AddGameViewModel;
import com.cooldev.gba.emulator.gameboy.local.storage.AppOpenAdPrefUtils;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class PopupFileAndDownloadKt$PopupFileAndDownload$3$3$1 extends r implements a {
    final /* synthetic */ AddGameViewModel $addGameViewModel;
    final /* synthetic */ Context $context;
    final /* synthetic */ HomeState $homeState;
    final /* synthetic */ IAPState $iapState;
    final /* synthetic */ PaywallNavigationViewModel $paywallNavigationViewModel;
    final /* synthetic */ UserGuideViewModel $userGuideViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupFileAndDownloadKt$PopupFileAndDownload$3$3$1(UserGuideViewModel userGuideViewModel, IAPState iAPState, Context context, HomeState homeState, PaywallNavigationViewModel paywallNavigationViewModel, AddGameViewModel addGameViewModel) {
        super(0);
        this.$userGuideViewModel = userGuideViewModel;
        this.$iapState = iAPState;
        this.$context = context;
        this.$homeState = homeState;
        this.$paywallNavigationViewModel = paywallNavigationViewModel;
        this.$addGameViewModel = addGameViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m340invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m340invoke() {
        try {
            this.$userGuideViewModel.moveToNextGuide();
            if (this.$iapState.isPremium()) {
                AppOpenAdPrefUtils.INSTANCE.setShowAppOpenAdOnResume(this.$context, false);
                GBAEmulatorAppKt.getLauncher().b(null);
            } else if (this.$homeState.isGameLimitReached()) {
                this.$paywallNavigationViewModel.navigateToPaywall();
            } else {
                AppOpenAdPrefUtils.INSTANCE.setShowAppOpenAdOnResume(this.$context, false);
                GBAEmulatorAppKt.getLauncher().b(null);
            }
            this.$addGameViewModel.hidePopupSelect();
        } catch (Exception e) {
            e.printStackTrace();
            b0.a.b(this.$context, "Failed to select folder. Please try again.").show();
        }
    }
}
