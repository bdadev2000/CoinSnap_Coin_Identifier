package qc;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n0 implements k0 {

    /* renamed from: f, reason: collision with root package name */
    public static final double f23846f = Math.random();

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f23847g = 0;
    public final va.g a;

    /* renamed from: b, reason: collision with root package name */
    public final dc.e f23848b;

    /* renamed from: c, reason: collision with root package name */
    public final sc.l f23849c;

    /* renamed from: d, reason: collision with root package name */
    public final l f23850d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f23851e;

    public n0(va.g firebaseApp, dc.e firebaseInstallations, sc.l sessionSettings, k eventGDTLogger, CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(sessionSettings, "sessionSettings");
        Intrinsics.checkNotNullParameter(eventGDTLogger, "eventGDTLogger");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.a = firebaseApp;
        this.f23848b = firebaseInstallations;
        this.f23849c = sessionSettings;
        this.f23850d = eventGDTLogger;
        this.f23851e = backgroundDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(qc.n0 r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof qc.m0
            if (r0 == 0) goto L16
            r0 = r6
            qc.m0 r0 = (qc.m0) r0
            int r1 = r0.f23841f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f23841f = r1
            goto L1b
        L16:
            qc.m0 r0 = new qc.m0
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f23839c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f23841f
            r3 = 1
            java.lang.String r4 = "SessionFirelogPublisher"
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            qc.n0 r5 = r0.f23838b
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4d
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r4, r6)
            r0.f23838b = r5
            r0.f23841f = r3
            sc.l r6 = r5.f23849c
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L4d
            goto L96
        L4d:
            sc.l r6 = r5.f23849c
            sc.q r0 = r6.a
            java.lang.Boolean r0 = r0.a()
            if (r0 == 0) goto L5c
            boolean r6 = r0.booleanValue()
            goto L6a
        L5c:
            sc.q r6 = r6.f24974b
            java.lang.Boolean r6 = r6.a()
            if (r6 == 0) goto L69
            boolean r6 = r6.booleanValue()
            goto L6a
        L69:
            r6 = r3
        L6a:
            r0 = 0
            if (r6 != 0) goto L77
            java.lang.String r5 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r4, r5)
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            goto L96
        L77:
            sc.l r5 = r5.f23849c
            double r5 = r5.a()
            double r1 = qc.n0.f23846f
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 > 0) goto L85
            r5 = r3
            goto L86
        L85:
            r5 = r0
        L86:
            if (r5 != 0) goto L92
            java.lang.String r5 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r4, r5)
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            goto L96
        L92:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.n0.a(qc.n0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
