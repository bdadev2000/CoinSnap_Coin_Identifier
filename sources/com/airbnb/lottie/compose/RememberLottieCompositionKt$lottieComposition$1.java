package com.airbnb.lottie.compose;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: rememberLottieComposition.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt", f = "rememberLottieComposition.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2}, l = {126, 127, 128}, m = "lottieComposition", n = {"context", "imageAssetsFolder", "fontAssetsFolder", "fontFileExtension", "context", "fontAssetsFolder", "fontFileExtension", "composition", "composition"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
/* loaded from: classes7.dex */
public final class RememberLottieCompositionKt$lottieComposition$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RememberLottieCompositionKt$lottieComposition$1(Continuation<? super RememberLottieCompositionKt$lottieComposition$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object lottieComposition;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        lottieComposition = RememberLottieCompositionKt.lottieComposition(null, null, null, null, null, null, this);
        return lottieComposition;
    }
}
