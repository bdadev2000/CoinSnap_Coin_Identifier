package com.cooldev.gba.emulator.gameboy.widgets.search;

import androidx.compose.foundation.text.KeyboardActionScope;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SearchKt$Search$2$1 extends r implements l {
    final /* synthetic */ a $onDone;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchKt$Search$2$1(a aVar) {
        super(1);
        this.$onDone = aVar;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((KeyboardActionScope) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull KeyboardActionScope keyboardActionScope) {
        p0.a.s(keyboardActionScope, "$this$$receiver");
        this.$onDone.invoke();
    }
}
