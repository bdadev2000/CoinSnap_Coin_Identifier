package u7;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import s7.n2;

/* loaded from: classes3.dex */
public final class l {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f25579b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f25580c;

    /* renamed from: d, reason: collision with root package name */
    public final j f25581d;

    /* renamed from: e, reason: collision with root package name */
    public final h.c0 f25582e;

    /* renamed from: f, reason: collision with root package name */
    public final k f25583f;

    /* renamed from: g, reason: collision with root package name */
    public h f25584g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25585h;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(android.content.Context r4, u7.d0 r5) {
        /*
            r3 = this;
            r3.<init>()
            android.content.Context r4 = r4.getApplicationContext()
            r3.a = r4
            r3.f25579b = r5
            int r5 = n9.h0.a
            android.os.Looper r5 = android.os.Looper.myLooper()
            if (r5 == 0) goto L14
            goto L18
        L14:
            android.os.Looper r5 = android.os.Looper.getMainLooper()
        L18:
            android.os.Handler r0 = new android.os.Handler
            r1 = 0
            r0.<init>(r5, r1)
            r3.f25580c = r0
            int r5 = n9.h0.a
            r2 = 23
            if (r5 < r2) goto L2c
            u7.j r2 = new u7.j
            r2.<init>(r3)
            goto L2d
        L2c:
            r2 = r1
        L2d:
            r3.f25581d = r2
            r2 = 21
            if (r5 < r2) goto L39
            h.c0 r2 = new h.c0
            r2.<init>(r3)
            goto L3a
        L39:
            r2 = r1
        L3a:
            r3.f25582e = r2
            u7.h r2 = u7.h.f25558c
            r2 = 17
            if (r5 < r2) goto L56
            java.lang.String r5 = n9.h0.f22545c
            java.lang.String r2 = "Amazon"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L54
            java.lang.String r2 = "Xiaomi"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L56
        L54:
            r5 = 1
            goto L57
        L56:
            r5 = 0
        L57:
            if (r5 == 0) goto L60
            java.lang.String r5 = "external_surround_sound_enabled"
            android.net.Uri r5 = android.provider.Settings.Global.getUriFor(r5)
            goto L61
        L60:
            r5 = r1
        L61:
            if (r5 == 0) goto L6c
            u7.k r1 = new u7.k
            android.content.ContentResolver r4 = r4.getContentResolver()
            r1.<init>(r3, r0, r4, r5)
        L6c:
            r3.f25583f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.l.<init>(android.content.Context, u7.d0):void");
    }

    public static void a(l lVar, h hVar) {
        boolean z10;
        n2 n2Var;
        boolean z11;
        s7.o0 o0Var;
        if (lVar.f25585h && !hVar.equals(lVar.f25584g)) {
            lVar.f25584g = hVar;
            r0 r0Var = lVar.f25579b.a;
            if (r0Var.f25619f0 == Looper.myLooper()) {
                z10 = true;
            } else {
                z10 = false;
            }
            v8.u0.m(z10);
            if (!hVar.equals(r0Var.e())) {
                r0Var.f25635w = hVar;
                f.a aVar = r0Var.f25631r;
                if (aVar != null) {
                    u0 u0Var = (u0) aVar.f17509c;
                    synchronized (u0Var.f24358b) {
                        n2Var = u0Var.f24371p;
                    }
                    if (n2Var != null) {
                        k9.o oVar = (k9.o) n2Var;
                        synchronized (oVar.f20463c) {
                            z11 = oVar.f20467g.P;
                        }
                        if (z11 && (o0Var = oVar.a) != null) {
                            o0Var.f24620j.d(26);
                        }
                    }
                }
            }
        }
    }
}
