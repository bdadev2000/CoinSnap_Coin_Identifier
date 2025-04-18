package com.cooldev.gba.emulator.gameboy.features.dashboard.widgets;

import androidx.compose.runtime.State;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.logic.AddGameViewModel;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.dashboard.widgets.ItemBottomBarPortraitWidgetKt$ItemBottomBarPortraitWidget$1", f = "ItemBottomBarPortraitWidget.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ItemBottomBarPortraitWidgetKt$ItemBottomBarPortraitWidget$1 extends i implements p {
    final /* synthetic */ AddGameViewModel $addGameViewModel;
    final /* synthetic */ State<UserGuideViewModel.GuideState> $guideState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ItemBottomBarPortraitWidgetKt$ItemBottomBarPortraitWidget$1(State<? extends UserGuideViewModel.GuideState> state, AddGameViewModel addGameViewModel, g gVar) {
        super(2, gVar);
        this.$guideState = state;
        this.$addGameViewModel = addGameViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new ItemBottomBarPortraitWidgetKt$ItemBottomBarPortraitWidget$1(this.$guideState, this.$addGameViewModel, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((ItemBottomBarPortraitWidgetKt$ItemBottomBarPortraitWidget$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        UserGuideViewModel.GuideState guideState = (UserGuideViewModel.GuideState) this.$guideState.getValue();
        if (guideState instanceof UserGuideViewModel.GuideState.DownloadGuide) {
            this.$addGameViewModel.showPopupSelect();
        } else if (p0.a.g(guideState, UserGuideViewModel.GuideState.EndGuide.INSTANCE)) {
            this.$addGameViewModel.hidePopupSelect();
        } else {
            boolean z2 = guideState instanceof UserGuideViewModel.GuideState.TrialGame;
        }
        return b0.f30125a;
    }
}
