package t1;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import androidx.annotation.RequiresPermission;
import jb.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f extends g {

    /* renamed from: h, reason: collision with root package name */
    public final TopicsManager f25179h;

    public f(TopicsManager mTopicsManager) {
        Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
        this.f25179h = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0087 A[LOOP:0: B:11:0x0081->B:13:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @androidx.annotation.RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object M(t1.f r7, t1.a r8, kotlin.coroutines.Continuation<? super t1.b> r9) {
        /*
            boolean r0 = r9 instanceof t1.e
            if (r0 == 0) goto L13
            r0 = r9
            t1.e r0 = (t1.e) r0
            int r1 = r0.f25178f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25178f = r1
            goto L18
        L13:
            t1.e r0 = new t1.e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f25176c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f25178f
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            t1.f r7 = r0.f25175b
            kotlin.ResultKt.throwOnFailure(r9)
            goto L6a
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.ResultKt.throwOnFailure(r9)
            android.adservices.topics.GetTopicsRequest r8 = r7.L(r8)
            r0.f25175b = r7
            r0.f25178f = r3
            kotlinx.coroutines.CancellableContinuationImpl r9 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r9.<init>(r2, r3)
            r9.initCancellability()
            l.a r2 = new l.a
            r3 = 8
            r2.<init>(r3)
            android.os.OutcomeReceiver r3 = com.bumptech.glide.c.c(r9)
            android.adservices.topics.TopicsManager r4 = r7.f25179h
            r4.getTopics(r8, r2, r3)
            java.lang.Object r9 = r9.getResult()
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r9 != r8) goto L67
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L67:
            if (r9 != r1) goto L6a
            return r1
        L6a:
            android.adservices.topics.GetTopicsResponse r9 = (android.adservices.topics.GetTopicsResponse) r9
            r7.getClass()
            java.lang.String r7 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r8 = r9.getTopics()
            java.util.Iterator r8 = r8.iterator()
        L81:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto La3
            java.lang.Object r9 = r8.next()
            android.adservices.topics.Topic r9 = (android.adservices.topics.Topic) r9
            t1.c r6 = new t1.c
            long r1 = r9.getTaxonomyVersion()
            long r3 = r9.getModelVersion()
            int r5 = r9.getTopicId()
            r0 = r6
            r0.<init>(r1, r3, r5)
            r7.add(r6)
            goto L81
        La3:
            t1.b r8 = new t1.b
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.f.M(t1.f, t1.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public GetTopicsRequest L(a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        GetTopicsRequest build = new GetTopicsRequest.Builder().setAdsSdkName(request.a()).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }

    @Override // jb.g
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    public Object j(a aVar, Continuation<? super b> continuation) {
        return M(this, aVar, continuation);
    }
}
