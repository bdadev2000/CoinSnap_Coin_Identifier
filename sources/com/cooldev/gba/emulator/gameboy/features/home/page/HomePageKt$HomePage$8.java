package com.cooldev.gba.emulator.gameboy.features.home.page;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeState;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes.dex */
public final class HomePageKt$HomePage$8 extends r implements q {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ State<UserGuideViewModel.GuideState> $guideState;
    final /* synthetic */ HomeState $homeState;
    final /* synthetic */ HomeViewModel $homeViewModel;
    final /* synthetic */ SoftwareKeyboardController $keyboardController;
    final /* synthetic */ Density $localDensity;
    final /* synthetic */ d0 $scope;
    final /* synthetic */ MutableState<Dp> $topBarHeightDp$delegate;
    final /* synthetic */ UserGuideViewModel $userGuideViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HomePageKt$HomePage$8(Density density, UserGuideViewModel userGuideViewModel, State<? extends UserGuideViewModel.GuideState> state, HomeViewModel homeViewModel, HomeState homeState, MutableState<Dp> mutableState, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController, d0 d0Var) {
        super(3);
        this.$localDensity = density;
        this.$userGuideViewModel = userGuideViewModel;
        this.$guideState = state;
        this.$homeViewModel = homeViewModel;
        this.$homeState = homeState;
        this.$topBarHeightDp$delegate = mutableState;
        this.$focusManager = focusManager;
        this.$keyboardController = softwareKeyboardController;
        this.$scope = d0Var;
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        if (p0.a.g(r28.u(), java.lang.Integer.valueOf(r15)) == false) goto L28;
     */
    @androidx.compose.runtime.ComposableTarget
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke(@org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.PaddingValues r27, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r28, int r29) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.home.page.HomePageKt$HomePage$8.invoke(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
    }
}
