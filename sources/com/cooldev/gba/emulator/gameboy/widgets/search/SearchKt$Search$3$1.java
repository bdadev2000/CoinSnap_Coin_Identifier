package com.cooldev.gba.emulator.gameboy.widgets.search;

import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SearchKt$Search$3$1 extends r implements l {
    final /* synthetic */ l $onValueChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchKt$Search$3$1(l lVar) {
        super(1);
        this.$onValueChange = lVar;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull String str) {
        a.s(str, "it");
        this.$onValueChange.invoke(str);
    }
}
