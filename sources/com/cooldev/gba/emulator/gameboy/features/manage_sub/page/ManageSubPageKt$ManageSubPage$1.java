package com.cooldev.gba.emulator.gameboy.features.manage_sub.page;

import android.content.Context;
import com.cooldev.gba.emulator.gameboy.features.dialogs.cancel_sub_dialog.logic.CancelSubDialogViewModel;
import com.cooldev.gba.emulator.gameboy.features.setting.logic.SettingViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
public final class ManageSubPageKt$ManageSubPage$1 extends r implements a {
    final /* synthetic */ CancelSubDialogViewModel $cancelSubDialogViewModel;
    final /* synthetic */ Context $context;
    final /* synthetic */ SettingViewModel $settingViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageSubPageKt$ManageSubPage$1(CancelSubDialogViewModel cancelSubDialogViewModel, SettingViewModel settingViewModel, Context context) {
        super(0);
        this.$cancelSubDialogViewModel = cancelSubDialogViewModel;
        this.$settingViewModel = settingViewModel;
        this.$context = context;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m253invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m253invoke() {
        this.$cancelSubDialogViewModel.hideDialog();
        this.$settingViewModel.onTapSubscription(this.$context);
    }
}
