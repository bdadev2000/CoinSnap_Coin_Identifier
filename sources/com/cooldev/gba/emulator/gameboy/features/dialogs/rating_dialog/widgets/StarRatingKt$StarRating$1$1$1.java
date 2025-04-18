package com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.widgets;

import com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.logic.RatingDialogViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
public final class StarRatingKt$StarRating$1$1$1 extends r implements a {
    final /* synthetic */ int $index;
    final /* synthetic */ RatingDialogViewModel $ratingDialogViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarRatingKt$StarRating$1$1$1(RatingDialogViewModel ratingDialogViewModel, int i2) {
        super(0);
        this.$ratingDialogViewModel = ratingDialogViewModel;
        this.$index = i2;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m183invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m183invoke() {
        this.$ratingDialogViewModel.onTapStar(this.$index);
    }
}
