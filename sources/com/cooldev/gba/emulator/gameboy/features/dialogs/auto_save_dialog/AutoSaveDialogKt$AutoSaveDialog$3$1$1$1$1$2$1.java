package com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class AutoSaveDialogKt$AutoSaveDialog$3$1$1$1$1$2$1 extends r implements a {
    final /* synthetic */ a $debouncedOnTurnOn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoSaveDialogKt$AutoSaveDialog$3$1$1$1$1$2$1(a aVar) {
        super(0);
        this.$debouncedOnTurnOn = aVar;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m149invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m149invoke() {
        this.$debouncedOnTurnOn.invoke();
    }
}
