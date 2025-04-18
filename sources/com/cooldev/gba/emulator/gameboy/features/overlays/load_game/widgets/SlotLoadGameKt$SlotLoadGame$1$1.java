package com.cooldev.gba.emulator.gameboy.features.overlays.load_game.widgets;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class SlotLoadGameKt$SlotLoadGame$1$1 extends r implements a {
    final /* synthetic */ a $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotLoadGameKt$SlotLoadGame$1$1(a aVar) {
        super(0);
        this.$onClick = aVar;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m271invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m271invoke() {
        this.$onClick.invoke();
    }
}
