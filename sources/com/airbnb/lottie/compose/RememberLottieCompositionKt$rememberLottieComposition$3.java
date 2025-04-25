package com.airbnb.lottie.compose;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: rememberLottieComposition.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", i = {0, 0, 1, 1}, l = {91, 93}, m = "invokeSuspend", n = {"exception", "failedCount", "exception", "failedCount"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes7.dex */
public final class RememberLottieCompositionKt$rememberLottieComposition$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cacheKey;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fontAssetsFolder;
    final /* synthetic */ String $fontFileExtension;
    final /* synthetic */ String $imageAssetsFolder;
    final /* synthetic */ Function3<Integer, Throwable, Continuation<? super Boolean>, Object> $onRetry;
    final /* synthetic */ MutableState<LottieCompositionResultImpl> $result$delegate;
    final /* synthetic */ LottieCompositionSpec $spec;
    int I$0;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RememberLottieCompositionKt$rememberLottieComposition$3(Function3<? super Integer, ? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function3, Context context, LottieCompositionSpec lottieCompositionSpec, String str, String str2, String str3, String str4, MutableState<LottieCompositionResultImpl> mutableState, Continuation<? super RememberLottieCompositionKt$rememberLottieComposition$3> continuation) {
        super(2, continuation);
        this.$onRetry = function3;
        this.$context = context;
        this.$spec = lottieCompositionSpec;
        this.$imageAssetsFolder = str;
        this.$fontAssetsFolder = str2;
        this.$fontFileExtension = str3;
        this.$cacheKey = str4;
        this.$result$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RememberLottieCompositionKt$rememberLottieComposition$3(this.$onRetry, this.$context, this.$spec, this.$imageAssetsFolder, this.$fontAssetsFolder, this.$fontFileExtension, this.$cacheKey, this.$result$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RememberLottieCompositionKt$rememberLottieComposition$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (((java.lang.Boolean) r13).booleanValue() == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0085 -> B:8:0x0088). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            int r1 = r12.I$0
            java.lang.Object r4 = r12.L$0
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Throwable -> L18
            goto L88
        L18:
            r13 = move-exception
            r4 = r13
            goto L94
        L1c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L24:
            int r1 = r12.I$0
            java.lang.Object r4 = r12.L$0
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            kotlin.ResultKt.throwOnFailure(r13)
            goto L58
        L2e:
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = 0
            r1 = 0
            r4 = r13
        L34:
            androidx.compose.runtime.MutableState<com.airbnb.lottie.compose.LottieCompositionResultImpl> r13 = r12.$result$delegate
            com.airbnb.lottie.compose.LottieCompositionResultImpl r13 = com.airbnb.lottie.compose.RememberLottieCompositionKt.access$rememberLottieComposition$lambda$1(r13)
            boolean r13 = r13.isSuccess()
            if (r13 != 0) goto L96
            if (r1 == 0) goto L60
            kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r13 = r12.$onRetry
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r12.L$0 = r4
            r12.I$0 = r1
            r12.label = r3
            java.lang.Object r13 = r13.invoke(r5, r4, r12)
            if (r13 != r0) goto L58
            return r0
        L58:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L96
        L60:
            android.content.Context r5 = r12.$context     // Catch: java.lang.Throwable -> L18
            com.airbnb.lottie.compose.LottieCompositionSpec r6 = r12.$spec     // Catch: java.lang.Throwable -> L18
            java.lang.String r13 = r12.$imageAssetsFolder     // Catch: java.lang.Throwable -> L18
            java.lang.String r7 = com.airbnb.lottie.compose.RememberLottieCompositionKt.access$ensureTrailingSlash(r13)     // Catch: java.lang.Throwable -> L18
            java.lang.String r13 = r12.$fontAssetsFolder     // Catch: java.lang.Throwable -> L18
            java.lang.String r8 = com.airbnb.lottie.compose.RememberLottieCompositionKt.access$ensureTrailingSlash(r13)     // Catch: java.lang.Throwable -> L18
            java.lang.String r13 = r12.$fontFileExtension     // Catch: java.lang.Throwable -> L18
            java.lang.String r9 = com.airbnb.lottie.compose.RememberLottieCompositionKt.access$ensureLeadingPeriod(r13)     // Catch: java.lang.Throwable -> L18
            java.lang.String r10 = r12.$cacheKey     // Catch: java.lang.Throwable -> L18
            r11 = r12
            kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11     // Catch: java.lang.Throwable -> L18
            r12.L$0 = r4     // Catch: java.lang.Throwable -> L18
            r12.I$0 = r1     // Catch: java.lang.Throwable -> L18
            r12.label = r2     // Catch: java.lang.Throwable -> L18
            java.lang.Object r13 = com.airbnb.lottie.compose.RememberLottieCompositionKt.access$lottieComposition(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L18
            if (r13 != r0) goto L88
            return r0
        L88:
            com.airbnb.lottie.LottieComposition r13 = (com.airbnb.lottie.LottieComposition) r13     // Catch: java.lang.Throwable -> L18
            androidx.compose.runtime.MutableState<com.airbnb.lottie.compose.LottieCompositionResultImpl> r5 = r12.$result$delegate     // Catch: java.lang.Throwable -> L18
            com.airbnb.lottie.compose.LottieCompositionResultImpl r5 = com.airbnb.lottie.compose.RememberLottieCompositionKt.access$rememberLottieComposition$lambda$1(r5)     // Catch: java.lang.Throwable -> L18
            r5.complete$lottie_compose_release(r13)     // Catch: java.lang.Throwable -> L18
            goto L34
        L94:
            int r1 = r1 + r3
            goto L34
        L96:
            androidx.compose.runtime.MutableState<com.airbnb.lottie.compose.LottieCompositionResultImpl> r13 = r12.$result$delegate
            com.airbnb.lottie.compose.LottieCompositionResultImpl r13 = com.airbnb.lottie.compose.RememberLottieCompositionKt.access$rememberLottieComposition$lambda$1(r13)
            boolean r13 = r13.isComplete()
            if (r13 != 0) goto Lad
            if (r4 == 0) goto Lad
            androidx.compose.runtime.MutableState<com.airbnb.lottie.compose.LottieCompositionResultImpl> r13 = r12.$result$delegate
            com.airbnb.lottie.compose.LottieCompositionResultImpl r13 = com.airbnb.lottie.compose.RememberLottieCompositionKt.access$rememberLottieComposition$lambda$1(r13)
            r13.completeExceptionally$lottie_compose_release(r4)
        Lad:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
