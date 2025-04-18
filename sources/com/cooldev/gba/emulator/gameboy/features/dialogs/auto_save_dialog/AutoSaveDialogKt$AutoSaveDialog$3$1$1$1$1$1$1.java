package com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class AutoSaveDialogKt$AutoSaveDialog$3$1$1$1$1$1$1 extends r implements a {
    final /* synthetic */ a $debouncedOnDismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoSaveDialogKt$AutoSaveDialog$3$1$1$1$1$1$1(a aVar) {
        super(0);
        this.$debouncedOnDismiss = aVar;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m148invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m148invoke() {
        this.$debouncedOnDismiss.invoke();
    }
}
