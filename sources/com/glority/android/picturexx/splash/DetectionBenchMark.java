package com.glority.android.picturexx.splash;

import android.content.Context;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.picturexx.recognize.analyzer.DetSingleton;
import com.glority.base.storage.PersistKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetectionBenchMark.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0016R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/glority/android/picturexx/splash/DetectionBenchMark;", "", "<init>", "()V", "value", "", "benchMarkTime", "getBenchMarkTime", "()J", "setBenchMarkTime", "(J)V", "", "detectionSupport", "getDetectionSupport", "()Ljava/lang/Boolean;", "setDetectionSupport", "(Ljava/lang/Boolean;)V", "initDetectAgent", "", "context", "Landroid/content/Context;", "startEvaluate", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class DetectionBenchMark {
    public static final int $stable = 0;
    public static final DetectionBenchMark INSTANCE = new DetectionBenchMark();

    private DetectionBenchMark() {
    }

    public final long getBenchMarkTime() {
        return ((Number) PersistData.INSTANCE.get(PersistKey.KEY_DETECTION_BENCHMARK_TIME, 0L)).longValue();
    }

    public final void setBenchMarkTime(long j) {
        PersistData.INSTANCE.set(PersistKey.KEY_DETECTION_BENCHMARK_TIME, Long.valueOf(j));
    }

    public final Boolean getDetectionSupport() {
        if (PersistData.INSTANCE.contains(PersistKey.KEY_DETECTION_SUPPORT)) {
            return (Boolean) PersistData.INSTANCE.get(PersistKey.KEY_DETECTION_SUPPORT);
        }
        return null;
    }

    public final void setDetectionSupport(Boolean bool) {
        PersistData.INSTANCE.set(PersistKey.KEY_DETECTION_SUPPORT, bool);
    }

    public final void initDetectAgent(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DetSingleton.INSTANCE.getInstance().initInterpreter(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object startEvaluate(android.content.Context r7, kotlin.coroutines.Continuation<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.glority.android.picturexx.splash.DetectionBenchMark$startEvaluate$1
            if (r0 == 0) goto L14
            r0 = r8
            com.glority.android.picturexx.splash.DetectionBenchMark$startEvaluate$1 r0 = (com.glority.android.picturexx.splash.DetectionBenchMark$startEvaluate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            com.glority.android.picturexx.splash.DetectionBenchMark$startEvaluate$1 r0 = new com.glority.android.picturexx.splash.DetectionBenchMark$startEvaluate$1
            r0.<init>(r6, r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r1 = r0.J$0
            java.lang.Object r7 = r0.L$0
            com.glority.android.picturexx.splash.DetectionBenchMark r7 = (com.glority.android.picturexx.splash.DetectionBenchMark) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L53
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.ResultKt.throwOnFailure(r8)
            com.glority.android.picturexx.splash.DetectionEvaluator r8 = new com.glority.android.picturexx.splash.DetectionEvaluator
            r8.<init>(r7)
            long r4 = java.lang.System.currentTimeMillis()
            r0.L$0 = r6
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r8 = r8.evaluate(r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            r7 = r6
            r1 = r4
        L53:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Detection evaluate time: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DetectionBenchMark"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            com.glority.utils.stability.LogUtils.d(r0)
            r7.setBenchMarkTime(r3)
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.splash.DetectionBenchMark.startEvaluate(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
