package com.cooldev.gba.emulator.gameboy.features.game_pad.dials.default_style;

import java.util.Set;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class PrimaryButtonsDialDefault$sendNewActionDowns$1 extends r implements l {
    final /* synthetic */ Set<Integer> $oldPressed;
    final /* synthetic */ PrimaryButtonsDialDefault this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButtonsDialDefault$sendNewActionDowns$1(Set<Integer> set, PrimaryButtonsDialDefault primaryButtonsDialDefault) {
        super(1);
        this.$oldPressed = set;
        this.this$0 = primaryButtonsDialDefault;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r3 = r2.this$0.getButtonForId(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r3.getSupportsButtons() == true) goto L10;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean invoke(int r3) {
        /*
            r2 = this;
            java.util.Set<java.lang.Integer> r0 = r2.$oldPressed
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L1c
            com.cooldev.gba.emulator.gameboy.features.game_pad.dials.default_style.PrimaryButtonsDialDefault r0 = r2.this$0
            com.cooldev.gba.emulator.gameboy.features.game_pad.config.ButtonConfig r3 = com.cooldev.gba.emulator.gameboy.features.game_pad.dials.default_style.PrimaryButtonsDialDefault.access$getButtonForId(r0, r3)
            if (r3 == 0) goto L1c
            boolean r3 = r3.getSupportsButtons()
            r0 = 1
            if (r3 != r0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.game_pad.dials.default_style.PrimaryButtonsDialDefault$sendNewActionDowns$1.invoke(int):java.lang.Boolean");
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
