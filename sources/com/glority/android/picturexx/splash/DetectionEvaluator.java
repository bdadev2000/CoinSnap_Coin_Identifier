package com.glority.android.picturexx.splash;

import android.content.Context;
import android.graphics.Bitmap;
import com.glority.android.detection.item.DetectOutput;
import com.glority.base.manager.BitmapManager;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DetectionBenchMark.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u0007H\u0087@¢\u0006\u0002\u0010\bJ$\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/glority/android/picturexx/splash/DetectionEvaluator;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "evaluate", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "evaluateDetectionTime", "Lkotlin/Pair;", "Lcom/glority/android/detection/item/DetectOutput;", "", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scaleImage", "prepareDetectionEngine", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class DetectionEvaluator {
    private final Context context;

    public DetectionEvaluator(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0129 A[LOOP:0: B:14:0x0123->B:16:0x0129, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object evaluate(kotlin.coroutines.Continuation<? super java.lang.Boolean> r20) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.splash.DetectionEvaluator.evaluate(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object evaluateDetectionTime(Bitmap bitmap, Continuation<? super Pair<DetectOutput, Long>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new DetectionEvaluator$evaluateDetectionTime$2(bitmap, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap scaleImage(Bitmap bitmap) {
        return BitmapManager.INSTANCE.resize(bitmap, 640.0f / Math.max(bitmap.getWidth(), bitmap.getHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x008b -> B:11:0x008e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object prepareDetectionEngine(android.graphics.Bitmap r11, kotlin.coroutines.Continuation<? super java.lang.Boolean> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.glority.android.picturexx.splash.DetectionEvaluator$prepareDetectionEngine$1
            if (r0 == 0) goto L14
            r0 = r12
            com.glority.android.picturexx.splash.DetectionEvaluator$prepareDetectionEngine$1 r0 = (com.glority.android.picturexx.splash.DetectionEvaluator$prepareDetectionEngine$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            com.glority.android.picturexx.splash.DetectionEvaluator$prepareDetectionEngine$1 r0 = new com.glority.android.picturexx.splash.DetectionEvaluator$prepareDetectionEngine$1
            r0.<init>(r10, r12)
        L19:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            int r11 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r5 = r0.L$1
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            java.lang.Object r6 = r0.L$0
            com.glority.android.picturexx.splash.DetectionEvaluator r6 = (com.glority.android.picturexx.splash.DetectionEvaluator) r6
            kotlin.ResultKt.throwOnFailure(r12)
            goto L8e
        L39:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L41:
            java.lang.Object r11 = r0.L$1
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            java.lang.Object r2 = r0.L$0
            com.glority.android.picturexx.splash.DetectionEvaluator r2 = (com.glority.android.picturexx.splash.DetectionEvaluator) r2
            kotlin.ResultKt.throwOnFailure(r12)
            goto L5e
        L4d:
            kotlin.ResultKt.throwOnFailure(r12)
            r0.L$0 = r10
            r0.L$1 = r11
            r0.label = r4
            java.lang.Object r12 = r10.evaluateDetectionTime(r11, r0)
            if (r12 != r1) goto L5d
            return r1
        L5d:
            r2 = r10
        L5e:
            kotlin.Pair r12 = (kotlin.Pair) r12
            java.lang.Object r12 = r12.getSecond()
            java.lang.Number r12 = (java.lang.Number) r12
            long r5 = r12.longValue()
            r7 = 500(0x1f4, double:2.47E-321)
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r5 = 0
            if (r12 <= 0) goto L76
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r11
        L76:
            r6 = r2
            r2 = r3
            r9 = r5
            r5 = r11
            r11 = r9
        L7b:
            if (r11 >= r2) goto L90
            r0.L$0 = r6
            r0.L$1 = r5
            r0.I$0 = r2
            r0.I$1 = r11
            r0.label = r3
            java.lang.Object r12 = r6.evaluateDetectionTime(r5, r0)
            if (r12 != r1) goto L8e
            return r1
        L8e:
            int r11 = r11 + r4
            goto L7b
        L90:
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.splash.DetectionEvaluator.prepareDetectionEngine(android.graphics.Bitmap, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
