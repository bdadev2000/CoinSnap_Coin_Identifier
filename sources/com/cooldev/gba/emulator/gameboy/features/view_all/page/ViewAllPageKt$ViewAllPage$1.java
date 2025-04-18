package com.cooldev.gba.emulator.gameboy.features.view_all.page;

import com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class ViewAllPageKt$ViewAllPage$1 extends r implements a {
    final /* synthetic */ ViewAllViewModel $viewAllViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewAllPageKt$ViewAllPage$1(ViewAllViewModel viewAllViewModel) {
        super(0);
        this.$viewAllViewModel = viewAllViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m370invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m370invoke() {
        this.$viewAllViewModel.hideDialogRemoveGame();
    }
}
