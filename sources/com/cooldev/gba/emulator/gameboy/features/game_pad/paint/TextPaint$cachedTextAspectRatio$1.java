package com.cooldev.gba.emulator.gameboy.features.game_pad.paint;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class TextPaint$cachedTextAspectRatio$1 extends r implements l {
    final /* synthetic */ TextPaint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextPaint$cachedTextAspectRatio$1(TextPaint textPaint) {
        super(1);
        this.this$0 = textPaint;
    }

    @Override // q0.l
    @NotNull
    public final Float invoke(@NotNull String str) {
        float computeTextAspectRatio;
        a.s(str, "text");
        computeTextAspectRatio = this.this$0.computeTextAspectRatio(str);
        return Float.valueOf(computeTextAspectRatio);
    }
}
