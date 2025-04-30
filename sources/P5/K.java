package p5;

import g4.C2296f;
import r5.C2678j;

/* loaded from: classes2.dex */
public final class K implements H {

    /* renamed from: f, reason: collision with root package name */
    public static final double f22274f = Math.random();

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f22275g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C2296f f22276a;
    public final O4.e b;

    /* renamed from: c, reason: collision with root package name */
    public final C2678j f22277c;

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.f f22278d;

    /* renamed from: e, reason: collision with root package name */
    public final w7.k f22279e;

    public K(C2296f c2296f, O4.e eVar, C2678j c2678j, com.bumptech.glide.f fVar, w7.k kVar) {
        this.f22276a = c2296f;
        this.b = eVar;
        this.f22277c = c2678j;
        this.f22278d = fVar;
        this.f22279e = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(p5.K r5, w7.f r6) {
        /*
            boolean r0 = r6 instanceof p5.J
            if (r0 == 0) goto L13
            r0 = r6
            p5.J r0 = (p5.J) r0
            int r1 = r0.f22273i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22273i = r1
            goto L18
        L13:
            p5.J r0 = new p5.J
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f22271g
            x7.a r1 = x7.EnumC2928a.b
            int r2 = r0.f22273i
            r3 = 1
            java.lang.String r4 = "SessionFirelogPublisher"
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            p5.K r5 = r0.f22270f
            t7.AbstractC2712a.f(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            t7.AbstractC2712a.f(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r4, r6)
            r0.f22270f = r5
            r0.f22273i = r3
            r5.j r6 = r5.f22277c
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L48
            goto L83
        L48:
            r5.j r6 = r5.f22277c
            r5.o r0 = r6.f22874a
            java.lang.Boolean r0 = r0.a()
            if (r0 == 0) goto L57
            boolean r3 = r0.booleanValue()
            goto L63
        L57:
            r5.o r6 = r6.b
            java.lang.Boolean r6 = r6.a()
            if (r6 == 0) goto L63
            boolean r3 = r6.booleanValue()
        L63:
            if (r3 != 0) goto L6d
            java.lang.String r5 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r4, r5)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L83
        L6d:
            r5.j r5 = r5.f22277c
            double r5 = r5.a()
            double r0 = p5.K.f22274f
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L7c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L83
        L7c:
            java.lang.String r5 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r4, r5)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.K.a(p5.K, w7.f):java.lang.Object");
    }
}
