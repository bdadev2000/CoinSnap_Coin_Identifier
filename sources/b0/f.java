package B0;

import G7.j;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import androidx.annotation.RequiresPermission;
import com.vungle.ads.internal.ui.i;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final TopicsManager f261a;

    public f(TopicsManager topicsManager) {
        j.e(topicsManager, "mTopicsManager");
        this.f261a = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[LOOP:0: B:11:0x0078->B:13:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @androidx.annotation.RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object c(B0.f r7, B0.a r8, w7.f r9) {
        /*
            boolean r0 = r9 instanceof B0.e
            if (r0 == 0) goto L13
            r0 = r9
            B0.e r0 = (B0.e) r0
            int r1 = r0.f260i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260i = r1
            goto L18
        L13:
            B0.e r0 = new B0.e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f258g
            x7.a r1 = x7.EnumC2928a.b
            int r2 = r0.f260i
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            B0.f r7 = r0.f257f
            t7.AbstractC2712a.f(r9)
            goto L5f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            t7.AbstractC2712a.f(r9)
            android.adservices.topics.GetTopicsRequest r8 = r7.a(r8)
            r0.f257f = r7
            r0.f260i = r3
            Q7.f r9 = new Q7.f
            w7.f r0 = F2.h.x(r0)
            r9.<init>(r3, r0)
            r9.t()
            android.adservices.topics.TopicsManager r0 = r7.f261a
            A0.c r2 = new A0.c
            r3 = 0
            r2.<init>(r3)
            P.g r3 = new P.g
            r3.<init>(r9)
            A0.b.w(r0, r8, r2, r3)
            java.lang.Object r9 = r9.s()
            if (r9 != r1) goto L5f
            return r1
        L5f:
            android.adservices.topics.GetTopicsResponse r8 = A0.b.i(r9)
            r7.getClass()
            java.lang.String r7 = "response"
            G7.j.e(r8, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r8 = A0.b.p(r8)
            java.util.Iterator r8 = r8.iterator()
        L78:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L9c
            java.lang.Object r9 = r8.next()
            android.adservices.topics.Topic r9 = A0.b.j(r9)
            B0.c r6 = new B0.c
            long r1 = A0.b.b(r9)
            long r3 = A0.b.z(r9)
            int r5 = A0.b.a(r9)
            r0 = r6
            r0.<init>(r1, r3, r5)
            r7.add(r6)
            goto L78
        L9c:
            B0.b r8 = new B0.b
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.f.c(B0.f, B0.a, w7.f):java.lang.Object");
    }

    public GetTopicsRequest a(a aVar) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest build;
        j.e(aVar, i.REQUEST_KEY_EXTRA);
        adsSdkName = A0.b.d().setAdsSdkName(aVar.f253a);
        build = adsSdkName.build();
        j.d(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    public Object b(a aVar, w7.f fVar) {
        return c(this, aVar, fVar);
    }
}
