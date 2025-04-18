package com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes3.dex */
public final class RatingDialogViewModel$onTapStar$1 extends r implements l {
    final /* synthetic */ int $index;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingDialogViewModel$onTapStar$1(int i2) {
        super(1);
        this.$index = i2;
    }

    @Override // q0.l
    @NotNull
    public final RatingDialogState invoke(@NotNull RatingDialogState ratingDialogState) {
        p0.a.s(ratingDialogState, "it");
        return ratingDialogState.copy(this.$index + 1);
    }
}
