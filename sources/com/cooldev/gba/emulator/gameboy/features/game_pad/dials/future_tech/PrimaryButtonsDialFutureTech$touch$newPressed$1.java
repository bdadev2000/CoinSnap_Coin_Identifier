package com.cooldev.gba.emulator.gameboy.features.game_pad.dials.future_tech;

import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.TouchUtils;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;
import y0.j;

/* loaded from: classes.dex */
public final class PrimaryButtonsDialFutureTech$touch$newPressed$1 extends r implements l {
    final /* synthetic */ PrimaryButtonsDialFutureTech this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButtonsDialFutureTech$touch$newPressed$1(PrimaryButtonsDialFutureTech primaryButtonsDialFutureTech) {
        super(1);
        this.this$0 = primaryButtonsDialFutureTech;
    }

    @Override // q0.l
    @NotNull
    public final j invoke(@NotNull TouchUtils.FingerPosition fingerPosition) {
        j associatedIds;
        a.s(fingerPosition, "it");
        associatedIds = this.this$0.getAssociatedIds(fingerPosition.getX(), fingerPosition.getY());
        return associatedIds;
    }
}
