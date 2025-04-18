package com.cooldev.gba.emulator.gameboy.features.dashboard.widgets;

import android.app.Activity;
import androidx.compose.runtime.State;
import com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.dashboard.enums.NavigationBottomBarPortraitItem;
import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.HomeEvents;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class ItemBottomBarPortraitWidgetKt$ItemBottomBarPortraitWidget$4$1 extends r implements a {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ MultiNavigationAppState $dashboardNavigation;
    final /* synthetic */ NavigationBottomBarPortraitItem $data;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterstitialAdViewModel $interstitialAdViewModel;
    final /* synthetic */ State<Boolean> $isConnectedInternet$delegate;
    final /* synthetic */ UserGuideViewModel $userGuideViewModel;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.dashboard.widgets.ItemBottomBarPortraitWidgetKt$ItemBottomBarPortraitWidget$4$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends r implements a {
        final /* synthetic */ MultiNavigationAppState $dashboardNavigation;
        final /* synthetic */ NavigationBottomBarPortraitItem $data;
        final /* synthetic */ UserGuideViewModel $userGuideViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UserGuideViewModel userGuideViewModel, MultiNavigationAppState multiNavigationAppState, NavigationBottomBarPortraitItem navigationBottomBarPortraitItem) {
            super(0);
            this.$userGuideViewModel = userGuideViewModel;
            this.$dashboardNavigation = multiNavigationAppState;
            this.$data = navigationBottomBarPortraitItem;
        }

        @Override // q0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m142invoke();
            return b0.f30125a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m142invoke() {
            if (this.$userGuideViewModel.getDataRemote()) {
                return;
            }
            this.$dashboardNavigation.navigateWithStateRestore(this.$data.getRoute());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemBottomBarPortraitWidgetKt$ItemBottomBarPortraitWidget$4$1(boolean z2, NavigationBottomBarPortraitItem navigationBottomBarPortraitItem, InterstitialAdViewModel interstitialAdViewModel, Activity activity, State<Boolean> state, UserGuideViewModel userGuideViewModel, MultiNavigationAppState multiNavigationAppState) {
        super(0);
        this.$enabled = z2;
        this.$data = navigationBottomBarPortraitItem;
        this.$interstitialAdViewModel = interstitialAdViewModel;
        this.$activity = activity;
        this.$isConnectedInternet$delegate = state;
        this.$userGuideViewModel = userGuideViewModel;
        this.$dashboardNavigation = multiNavigationAppState;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m141invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m141invoke() {
        boolean ItemBottomBarPortraitWidget$lambda$0;
        if (this.$enabled) {
            if (this.$data == NavigationBottomBarPortraitItem.Theme) {
                HomeEvents.INSTANCE.logThemeButton();
            }
            InterstitialAdViewModel interstitialAdViewModel = this.$interstitialAdViewModel;
            Activity activity = this.$activity;
            ItemBottomBarPortraitWidget$lambda$0 = ItemBottomBarPortraitWidgetKt.ItemBottomBarPortraitWidget$lambda$0(this.$isConnectedInternet$delegate);
            interstitialAdViewModel.onClickNavigationBar(activity, ItemBottomBarPortraitWidget$lambda$0, new AnonymousClass1(this.$userGuideViewModel, this.$dashboardNavigation, this.$data));
        }
    }
}
