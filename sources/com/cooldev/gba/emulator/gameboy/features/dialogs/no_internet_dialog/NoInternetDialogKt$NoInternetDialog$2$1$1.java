package com.cooldev.gba.emulator.gameboy.features.dialogs.no_internet_dialog;

import androidx.compose.runtime.MutableState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class NoInternetDialogKt$NoInternetDialog$2$1$1 extends r implements a {
    final /* synthetic */ MutableState<Boolean> $openDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoInternetDialogKt$NoInternetDialog$2$1$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$openDialog$delegate = mutableState;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m172invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m172invoke() {
        NoInternetDialogKt.NoInternetDialog$lambda$2(this.$openDialog$delegate, false);
    }
}
