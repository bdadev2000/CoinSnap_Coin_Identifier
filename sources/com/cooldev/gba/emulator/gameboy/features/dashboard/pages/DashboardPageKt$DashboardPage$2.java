package com.cooldev.gba.emulator.gameboy.features.dashboard.pages;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import com.cooldev.gba.emulator.gameboy.features.dashboard.widgets.NavigationBarPortraitKt;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeState;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes.dex */
public final class DashboardPageKt$DashboardPage$2 extends r implements p {
    final /* synthetic */ HomeState $homeState;
    final /* synthetic */ HomeViewModel $homeViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardPageKt$DashboardPage$2(HomeViewModel homeViewModel, HomeState homeState) {
        super(2);
        this.$homeViewModel = homeViewModel;
        this.$homeState = homeState;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@Nullable Composer composer, int i2) {
        if ((i2 & 11) == 2 && composer.i()) {
            composer.A();
        } else {
            NavigationBarPortraitKt.NavigationBarPortrait(!HomeViewModel.shouldNavigateToGame$default(this.$homeViewModel, false, 1, null) && this.$homeState.isShowOfferFreeTrial() && this.$homeState.isNewFlow(), composer, 0, 0);
        }
    }
}
