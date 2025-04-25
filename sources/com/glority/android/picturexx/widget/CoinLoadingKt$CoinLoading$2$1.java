package com.glority.android.picturexx.widget;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CoinLoading.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.widget.CoinLoadingKt$CoinLoading$2$1", f = "CoinLoading.kt", i = {0}, l = {30}, m = "invokeSuspend", n = {"i"}, s = {"I$0"})
/* loaded from: classes5.dex */
final class CoinLoadingKt$CoinLoading$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Float> $currentProgress;
    int I$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinLoadingKt$CoinLoading$2$1(MutableState<Float> mutableState, Continuation<? super CoinLoadingKt$CoinLoading$2$1> continuation) {
        super(2, continuation);
        this.$currentProgress = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinLoadingKt$CoinLoading$2$1(this.$currentProgress, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinLoadingKt$CoinLoading$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:5:0x003f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            int r1 = r5.I$0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L3f
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            kotlin.ResultKt.throwOnFailure(r6)
            r1 = r2
        L1d:
            r6 = 1001(0x3e9, float:1.403E-42)
            if (r1 >= r6) goto L41
            androidx.compose.runtime.MutableState<java.lang.Float> r6 = r5.$currentProgress
            float r3 = (float) r1
            r4 = 500(0x1f4, float:7.0E-43)
            float r4 = (float) r4
            float r3 = r3 / r4
            java.lang.Float r3 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r3)
            r6.setValue(r3)
            r6 = r5
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r5.I$0 = r1
            r5.label = r2
            r3 = 10
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r6)
            if (r6 != r0) goto L3f
            return r0
        L3f:
            int r1 = r1 + r2
            goto L1d
        L41:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.widget.CoinLoadingKt$CoinLoading$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
