package com.cooldev.gba.emulator.gameboy.features.dialogs.remove_game_dialog;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class RemoveGameDialogKt$RemoveGameDialog$2$1$1$1$1$2$1 extends r implements a {
    final /* synthetic */ a $onCancel;
    final /* synthetic */ a $onRemove;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveGameDialogKt$RemoveGameDialog$2$1$1$1$1$2$1(a aVar, a aVar2) {
        super(0);
        this.$onRemove = aVar;
        this.$onCancel = aVar2;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m192invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m192invoke() {
        this.$onRemove.invoke();
        this.$onCancel.invoke();
    }
}
