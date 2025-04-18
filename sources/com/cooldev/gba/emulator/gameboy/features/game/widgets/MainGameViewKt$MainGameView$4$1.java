package com.cooldev.gba.emulator.gameboy.features.game.widgets;

import android.content.Context;
import com.swordfish.libretrodroid.GLRetroView;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class MainGameViewKt$MainGameView$4$1 extends r implements l {
    final /* synthetic */ GLRetroView $retroView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainGameViewKt$MainGameView$4$1(GLRetroView gLRetroView) {
        super(1);
        this.$retroView = gLRetroView;
    }

    @Override // q0.l
    @NotNull
    public final GLRetroView invoke(@NotNull Context context) {
        a.s(context, "it");
        return this.$retroView;
    }
}
