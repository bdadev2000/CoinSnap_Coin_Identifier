package com.cooldev.gba.emulator.gameboy.features.manage_sub.page;

import com.cooldev.gba.emulator.gameboy.features.dialogs.cancel_sub_dialog.logic.CancelSubDialogViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
public final class ManageSubPageKt$ManageSubPage$2 extends r implements a {
    final /* synthetic */ CancelSubDialogViewModel $cancelSubDialogViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageSubPageKt$ManageSubPage$2(CancelSubDialogViewModel cancelSubDialogViewModel) {
        super(0);
        this.$cancelSubDialogViewModel = cancelSubDialogViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m254invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m254invoke() {
        this.$cancelSubDialogViewModel.hideDialog();
    }
}
