package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import h0.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@RequiresExtension
@SuppressLint({"NewApi"})
@RestrictTo
/* loaded from: classes3.dex */
public class TopicsManagerImplCommon extends TopicsManager {

    /* renamed from: a, reason: collision with root package name */
    public final android.adservices.topics.TopicsManager f20868a;

    public TopicsManagerImplCommon(android.adservices.topics.TopicsManager topicsManager) {
        a.s(topicsManager, "mTopicsManager");
        this.f20868a = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[LOOP:0: B:11:0x0078->B:13:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @androidx.annotation.RequiresPermission
    @androidx.annotation.DoNotInline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object c(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r7, androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r8, h0.g r9) {
        /*
            boolean r0 = r9 instanceof androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = new androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f20870b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r7 = r0.f20869a
            kotlin.jvm.internal.q.m(r9)
            goto L5f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.jvm.internal.q.m(r9)
            android.adservices.topics.GetTopicsRequest r8 = r7.b(r8)
            r0.f20869a = r7
            r0.d = r3
            b1.l r9 = new b1.l
            h0.g r0 = b1.f0.r(r0)
            r9.<init>(r3, r0)
            r9.p()
            androidx.arch.core.executor.a r0 = new androidx.arch.core.executor.a
            r2 = 14
            r0.<init>(r2)
            android.os.OutcomeReceiver r2 = androidx.core.os.OutcomeReceiverKt.a(r9)
            android.adservices.topics.TopicsManager r3 = r7.f20868a
            androidx.privacysandbox.ads.adservices.customaudience.a.u(r3, r8, r0, r2)
            java.lang.Object r9 = r9.o()
            if (r9 != r1) goto L5f
            return r1
        L5f:
            android.adservices.topics.GetTopicsResponse r8 = androidx.privacysandbox.ads.adservices.customaudience.a.k(r9)
            r7.getClass()
            java.lang.String r7 = "response"
            p0.a.s(r8, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r8 = androidx.privacysandbox.ads.adservices.customaudience.a.o(r8)
            java.util.Iterator r8 = r8.iterator()
        L78:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L9c
            java.lang.Object r9 = r8.next()
            android.adservices.topics.Topic r9 = androidx.privacysandbox.ads.adservices.customaudience.a.l(r9)
            androidx.privacysandbox.ads.adservices.topics.Topic r6 = new androidx.privacysandbox.ads.adservices.topics.Topic
            long r1 = androidx.privacysandbox.ads.adservices.customaudience.a.b(r9)
            long r3 = androidx.privacysandbox.ads.adservices.customaudience.a.v(r9)
            int r5 = androidx.privacysandbox.ads.adservices.customaudience.a.a(r9)
            r0 = r6
            r0.<init>(r1, r3, r5)
            r7.add(r6)
            goto L78
        L9c:
            androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse r8 = new androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.c(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon, androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest, h0.g):java.lang.Object");
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManager
    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object a(@NotNull GetTopicsRequest getTopicsRequest, @NotNull g gVar) {
        return c(this, getTopicsRequest, gVar);
    }

    public android.adservices.topics.GetTopicsRequest b(GetTopicsRequest getTopicsRequest) {
        GetTopicsRequest.Builder adsSdkName;
        android.adservices.topics.GetTopicsRequest build;
        a.s(getTopicsRequest, "request");
        adsSdkName = androidx.privacysandbox.ads.adservices.customaudience.a.g().setAdsSdkName(getTopicsRequest.f20860a);
        build = adsSdkName.build();
        a.r(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }
}
