package com.cooldev.gba.emulator.gameboy.features.overlays.save_game.widgets;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
public final class SlotSaveGameKt$SlotSaveGame$1$1 extends r implements a {
    final /* synthetic */ a $debouncedOnClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotSaveGameKt$SlotSaveGame$1$1(a aVar) {
        super(0);
        this.$debouncedOnClick = aVar;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m293invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m293invoke() {
        this.$debouncedOnClick.invoke();
    }
}
