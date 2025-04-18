package com.cooldev.gba.emulator.gameboy.features.home.utils;

import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class UtilsKt$readLines$1 extends r implements l {
    final /* synthetic */ List<String> $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$readLines$1(List<String> list) {
        super(1);
        this.$result = list;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull String str) {
        a.s(str, "it");
        this.$result.add(str);
    }
}
