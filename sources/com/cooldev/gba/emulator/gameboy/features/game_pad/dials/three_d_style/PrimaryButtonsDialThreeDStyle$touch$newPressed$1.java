package com.cooldev.gba.emulator.gameboy.features.game_pad.dials.three_d_style;

import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.TouchUtils;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;
import y0.j;

/* loaded from: classes3.dex */
public final class PrimaryButtonsDialThreeDStyle$touch$newPressed$1 extends r implements l {
    final /* synthetic */ PrimaryButtonsDialThreeDStyle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButtonsDialThreeDStyle$touch$newPressed$1(PrimaryButtonsDialThreeDStyle primaryButtonsDialThreeDStyle) {
        super(1);
        this.this$0 = primaryButtonsDialThreeDStyle;
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
