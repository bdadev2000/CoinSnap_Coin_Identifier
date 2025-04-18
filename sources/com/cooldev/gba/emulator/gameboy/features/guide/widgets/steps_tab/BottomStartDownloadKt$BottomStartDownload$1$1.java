package com.cooldev.gba.emulator.gameboy.features.guide.widgets.steps_tab;

import android.content.Context;
import com.cooldev.gba.emulator.gameboy.features.guide.enums.GameROMWebsite;
import com.cooldev.gba.emulator.gameboy.features.guide.logic.GuideViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class BottomStartDownloadKt$BottomStartDownload$1$1 extends r implements a {
    final /* synthetic */ Context $context;
    final /* synthetic */ GuideViewModel $guideViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomStartDownloadKt$BottomStartDownload$1$1(GuideViewModel guideViewModel, Context context) {
        super(0);
        this.$guideViewModel = guideViewModel;
        this.$context = context;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m211invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m211invoke() {
        this.$guideViewModel.onDownloadGame(this.$context, GameROMWebsite.EMULATOR_GAMES.getUrl());
    }
}
