package com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.widgets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.logic.RatingDialogViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes3.dex */
public final class StarRatingKt$StarRating$2 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ RatingDialogViewModel $ratingDialogViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarRatingKt$StarRating$2(RatingDialogViewModel ratingDialogViewModel, int i2) {
        super(2);
        this.$ratingDialogViewModel = ratingDialogViewModel;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        StarRatingKt.StarRating(this.$ratingDialogViewModel, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
