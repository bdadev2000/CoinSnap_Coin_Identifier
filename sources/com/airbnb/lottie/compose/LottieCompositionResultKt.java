package com.airbnb.lottie.compose;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: LottieCompositionResult.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"awaitOrNull", "Lcom/airbnb/lottie/LottieComposition;", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "(Lcom/airbnb/lottie/compose/LottieCompositionResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottie-compose_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class LottieCompositionResultKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitOrNull(com.airbnb.lottie.compose.LottieCompositionResult r4, kotlin.coroutines.Continuation<? super com.airbnb.lottie.LottieComposition> r5) {
        /*
            boolean r0 = r5 instanceof com.airbnb.lottie.compose.LottieCompositionResultKt$awaitOrNull$1
            if (r0 == 0) goto L14
            r0 = r5
            com.airbnb.lottie.compose.LottieCompositionResultKt$awaitOrNull$1 r0 = (com.airbnb.lottie.compose.LottieCompositionResultKt$awaitOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L19
        L14:
            com.airbnb.lottie.compose.LottieCompositionResultKt$awaitOrNull$1 r0 = new com.airbnb.lottie.compose.LottieCompositionResultKt$awaitOrNull$1
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L41
            goto L3e
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.label = r3     // Catch: java.lang.Throwable -> L41
            java.lang.Object r5 = r4.await(r0)     // Catch: java.lang.Throwable -> L41
            if (r5 != r1) goto L3e
            return r1
        L3e:
            com.airbnb.lottie.LottieComposition r5 = (com.airbnb.lottie.LottieComposition) r5     // Catch: java.lang.Throwable -> L41
            goto L42
        L41:
            r5 = 0
        L42:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.LottieCompositionResultKt.awaitOrNull(com.airbnb.lottie.compose.LottieCompositionResult, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
