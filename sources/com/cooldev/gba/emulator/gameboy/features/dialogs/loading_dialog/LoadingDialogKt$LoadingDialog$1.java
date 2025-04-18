package com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog;

import com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog.logic.LoadingDialogViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes4.dex */
public final class LoadingDialogKt$LoadingDialog$1 extends r implements a {
    final /* synthetic */ LoadingDialogViewModel $loadingDialogViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingDialogKt$LoadingDialog$1(LoadingDialogViewModel loadingDialogViewModel) {
        super(0);
        this.$loadingDialogViewModel = loadingDialogViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m167invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m167invoke() {
        this.$loadingDialogViewModel.hideDialog();
    }
}
