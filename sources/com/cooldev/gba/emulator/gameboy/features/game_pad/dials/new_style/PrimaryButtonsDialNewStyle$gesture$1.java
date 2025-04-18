package com.cooldev.gba.emulator.gameboy.features.game_pad.dials.new_style;

import com.cooldev.gba.emulator.gameboy.features.game_pad.config.ButtonConfig;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.l;

/* loaded from: classes2.dex */
public final class PrimaryButtonsDialNewStyle$gesture$1 extends r implements l {
    final /* synthetic */ PrimaryButtonsDialNewStyle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButtonsDialNewStyle$gesture$1(PrimaryButtonsDialNewStyle primaryButtonsDialNewStyle) {
        super(1);
        this.this$0 = primaryButtonsDialNewStyle;
    }

    @Nullable
    public final ButtonConfig invoke(int i2) {
        ButtonConfig buttonForId;
        buttonForId = this.this$0.getButtonForId(i2);
        return buttonForId;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
