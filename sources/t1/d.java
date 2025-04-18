package t1;

import android.adservices.topics.GetTopicsRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25174i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r3.f25174i = r5
            r0 = 1
            java.lang.String r1 = "context.getSystemService…opicsManager::class.java)"
            java.lang.String r2 = "context"
            if (r5 == r0) goto L1b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.Class<android.adservices.topics.TopicsManager> r5 = android.adservices.topics.TopicsManager.class
            java.lang.Object r4 = r4.getSystemService(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            android.adservices.topics.TopicsManager r4 = (android.adservices.topics.TopicsManager) r4
            r3.<init>(r4)
            return
        L1b:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.Class<android.adservices.topics.TopicsManager> r5 = android.adservices.topics.TopicsManager.class
            java.lang.Object r4 = r4.getSystemService(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            android.adservices.topics.TopicsManager r4 = (android.adservices.topics.TopicsManager) r4
            r3.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.d.<init>(android.content.Context, int):void");
    }

    @Override // t1.f
    public final GetTopicsRequest L(a request) {
        switch (this.f25174i) {
            case 1:
                Intrinsics.checkNotNullParameter(request, "request");
                GetTopicsRequest build = new GetTopicsRequest.Builder().setAdsSdkName(request.a()).setShouldRecordObservation(request.b()).build();
                Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…ion)\n            .build()");
                return build;
            default:
                return super.L(request);
        }
    }
}
