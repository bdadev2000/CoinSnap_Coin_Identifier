package com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.view;

import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class PopupFileAndDownloadKt$PopupFileAndDownload$3$1 extends r implements a {
    final /* synthetic */ UserGuideViewModel $userGuideViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupFileAndDownloadKt$PopupFileAndDownload$3$1(UserGuideViewModel userGuideViewModel) {
        super(0);
        this.$userGuideViewModel = userGuideViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m339invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m339invoke() {
        this.$userGuideViewModel.closeUserGuide();
    }
}
