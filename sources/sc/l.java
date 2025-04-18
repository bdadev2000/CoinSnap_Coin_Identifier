package sc;

import android.content.Context;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import n0.l1;
import qc.j0;
import qc.v;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final j f24972c = new j();

    /* renamed from: d, reason: collision with root package name */
    public static final b1.b f24973d = d6.g.z(v.f23885b, new z0.a(l1.f22313i));
    public final q a;

    /* renamed from: b, reason: collision with root package name */
    public final q f24974b;

    public l(va.g firebaseApp, CoroutineContext blockingDispatcher, CoroutineContext backgroundDispatcher, dc.e firebaseInstallationsApi) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        firebaseApp.a();
        Context context = firebaseApp.a;
        Intrinsics.checkNotNullExpressionValue(context, "firebaseApp.applicationContext");
        j0 j0Var = j0.a;
        qc.b a = j0.a(firebaseApp);
        b localOverrideSettings = new b(context);
        h hVar = new h(a, blockingDispatcher);
        f24972c.getClass();
        f remoteSettings = new f(backgroundDispatcher, firebaseInstallationsApi, a, hVar, (y0.j) f24973d.getValue(context, j.a[0]));
        Intrinsics.checkNotNullParameter(localOverrideSettings, "localOverrideSettings");
        Intrinsics.checkNotNullParameter(remoteSettings, "remoteSettings");
        this.a = localOverrideSettings;
        this.f24974b = remoteSettings;
    }

    public final double a() {
        boolean z10;
        Double c10 = this.a.c();
        boolean z11 = true;
        if (c10 != null) {
            double doubleValue = c10.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return doubleValue;
            }
        }
        Double c11 = this.f24974b.c();
        if (c11 != null) {
            double doubleValue2 = c11.doubleValue();
            if (0.0d > doubleValue2 || doubleValue2 > 1.0d) {
                z11 = false;
            }
            if (z11) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof sc.k
            if (r0 == 0) goto L13
            r0 = r6
            sc.k r0 = (sc.k) r0
            int r1 = r0.f24971f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24971f = r1
            goto L18
        L13:
            sc.k r0 = new sc.k
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f24969c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f24971f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r6)
            goto L59
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            sc.l r2 = r0.f24968b
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4b
        L3a:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f24968b = r5
            r0.f24971f = r4
            sc.q r6 = r5.a
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            sc.q r6 = r2.f24974b
            r2 = 0
            r0.f24968b = r2
            r0.f24971f = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.l.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
