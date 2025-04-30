package r5;

import U4.s;
import a.AbstractC0325a;
import android.content.Context;
import e0.InterfaceC2208i;
import g0.C2280b;
import g4.C2296f;
import p5.AbstractC2568t;
import p5.C2551b;
import p5.G;

/* renamed from: r5.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2678j {

    /* renamed from: c, reason: collision with root package name */
    public static final C2676h f22872c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final C2280b f22873d = AbstractC0325a.m(AbstractC2568t.b, new com.bumptech.glide.f(C2675g.b, 4));

    /* renamed from: a, reason: collision with root package name */
    public final o f22874a;
    public final o b;

    /* JADX WARN: Type inference failed for: r6v0, types: [l5.k, java.lang.Object] */
    public C2678j(C2296f c2296f, w7.k kVar, w7.k kVar2, O4.e eVar) {
        c2296f.a();
        Context context = c2296f.f20433a;
        G7.j.d(context, "firebaseApp.applicationContext");
        G g9 = G.f22262a;
        C2551b a6 = G.a(c2296f);
        s sVar = new s(context);
        ?? obj = new Object();
        obj.b = a6;
        obj.f21620c = kVar;
        obj.f21619a = "firebase-settings.crashlytics.com";
        f22872c.getClass();
        C2672d c2672d = new C2672d(kVar2, eVar, a6, obj, (InterfaceC2208i) f22873d.a(C2676h.f22867a[0], context));
        this.f22874a = sVar;
        this.b = c2672d;
    }

    public final double a() {
        Double c9 = this.f22874a.c();
        if (c9 != null) {
            double doubleValue = c9.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double c10 = this.b.c();
        if (c10 != null) {
            double doubleValue2 = c10.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(w7.f r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof r5.C2677i
            if (r0 == 0) goto L13
            r0 = r6
            r5.i r0 = (r5.C2677i) r0
            int r1 = r0.f22871i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22871i = r1
            goto L18
        L13:
            r5.i r0 = new r5.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f22869g
            x7.a r1 = x7.EnumC2928a.b
            int r2 = r0.f22871i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            t7.AbstractC2712a.f(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            r5.j r2 = r0.f22868f
            t7.AbstractC2712a.f(r6)
            goto L49
        L38:
            t7.AbstractC2712a.f(r6)
            r0.f22868f = r5
            r0.f22871i = r4
            r5.o r6 = r5.f22874a
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r2 = r5
        L49:
            r5.o r6 = r2.b
            r2 = 0
            r0.f22868f = r2
            r0.f22871i = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            t7.y r6 = t7.y.f23029a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.C2678j.b(w7.f):java.lang.Object");
    }
}
