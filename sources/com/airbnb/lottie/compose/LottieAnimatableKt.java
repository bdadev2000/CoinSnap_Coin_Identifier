package com.airbnb.lottie.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: LottieAnimatable.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001a\r\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\f*\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"LottieAnimatable", "Lcom/airbnb/lottie/compose/LottieAnimatable;", "defaultProgress", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "clipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", TransferTable.COLUMN_SPEED, "rememberLottieAnimatable", "(Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieAnimatable;", "resetToBeginning", "", "(Lcom/airbnb/lottie/compose/LottieAnimatable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottie-compose_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class LottieAnimatableKt {
    public static final LottieAnimatable rememberLottieAnimatable(Composer composer, int i) {
        composer.startReplaceableGroup(2024497114);
        ComposerKt.sourceInformation(composer, "C(rememberLottieAnimatable)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2024497114, i, -1, "com.airbnb.lottie.compose.rememberLottieAnimatable (LottieAnimatable.kt:28)");
        }
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = LottieAnimatable();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LottieAnimatable lottieAnimatable = (LottieAnimatable) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lottieAnimatable;
    }

    public static final LottieAnimatable LottieAnimatable() {
        return new LottieAnimatableImpl();
    }

    public static final Object resetToBeginning(LottieAnimatable lottieAnimatable, Continuation<? super Unit> continuation) {
        Object snapTo$default = LottieAnimatable.DefaultImpls.snapTo$default(lottieAnimatable, null, defaultProgress(lottieAnimatable.getComposition(), lottieAnimatable.getClipSpec(), lottieAnimatable.getSpeed()), 1, false, continuation, 9, null);
        return snapTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? snapTo$default : Unit.INSTANCE;
    }

    public static final float defaultProgress(LottieComposition lottieComposition, LottieClipSpec lottieClipSpec, float f) {
        if (f >= 0.0f || lottieComposition != null) {
            if (lottieComposition == null) {
                return 0.0f;
            }
            if (f >= 0.0f) {
                if (lottieClipSpec != null) {
                    return lottieClipSpec.getMinProgress$lottie_compose_release(lottieComposition);
                }
                return 0.0f;
            }
            if (lottieClipSpec != null) {
                return lottieClipSpec.getMaxProgress$lottie_compose_release(lottieComposition);
            }
        }
        return 1.0f;
    }
}
