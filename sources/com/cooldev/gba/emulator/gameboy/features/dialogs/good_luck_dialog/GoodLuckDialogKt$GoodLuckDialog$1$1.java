package com.cooldev.gba.emulator.gameboy.features.dialogs.good_luck_dialog;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class GoodLuckDialogKt$GoodLuckDialog$1$1 extends r implements a {
    final /* synthetic */ a $onDismissRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoodLuckDialogKt$GoodLuckDialog$1$1(a aVar) {
        super(0);
        this.$onDismissRequest = aVar;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m163invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m163invoke() {
        this.$onDismissRequest.invoke();
    }
}
