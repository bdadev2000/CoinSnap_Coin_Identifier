package com.cooldev.gba.emulator.gameboy.features.theme.page;

import androidx.compose.runtime.MutableState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class ThemePageKt$ThemePage$6$1 extends r implements a {
    final /* synthetic */ MutableState<Boolean> $showingDialogGoodLuck$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemePageKt$ThemePage$6$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$showingDialogGoodLuck$delegate = mutableState;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m362invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m362invoke() {
        ThemePageKt.ThemePage$lambda$5(this.$showingDialogGoodLuck$delegate, false);
    }
}
