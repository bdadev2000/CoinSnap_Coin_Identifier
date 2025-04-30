package p5;

import n1.C2475f;

/* loaded from: classes2.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public static final G f22262a = new Object();
    public static final C2475f b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p5.G] */
    static {
        I4.d dVar = new I4.d();
        dVar.a(F.class, C2556g.f22329a);
        dVar.a(N.class, C2557h.f22332a);
        dVar.a(C2559j.class, C2554e.f22322a);
        dVar.a(C2551b.class, C2553d.f22316a);
        dVar.a(C2550a.class, C2552c.f22310a);
        dVar.a(C2567s.class, C2555f.f22325a);
        dVar.f1462d = true;
        b = new C2475f(dVar, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        r3 = android.app.Application.getProcessName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p5.C2551b a(g4.C2296f r16) {
        /*
            r0 = r16
            r16.a()
            java.lang.String r1 = "firebaseApp.applicationContext"
            android.content.Context r2 = r0.f20433a
            G7.j.d(r2, r1)
            java.lang.String r4 = r2.getPackageName()
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            r3 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r4, r3)
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r5 < r6) goto L29
            long r7 = com.google.android.gms.ads.internal.util.a.c(r1)
            java.lang.String r5 = java.lang.String.valueOf(r7)
        L27:
            r7 = r5
            goto L30
        L29:
            int r5 = r1.versionCode
            java.lang.String r5 = java.lang.String.valueOf(r5)
            goto L27
        L30:
            p5.b r10 = new p5.b
            r16.a()
            g4.i r5 = r0.f20434c
            java.lang.String r11 = r5.b
            java.lang.String r5 = "firebaseApp.options.applicationId"
            G7.j.d(r11, r5)
            java.lang.String r12 = android.os.Build.MODEL
            java.lang.String r5 = "MODEL"
            G7.j.d(r12, r5)
            java.lang.String r13 = android.os.Build.VERSION.RELEASE
            java.lang.String r5 = "RELEASE"
            G7.j.d(r13, r5)
            p5.a r14 = new p5.a
            java.lang.String r5 = "packageName"
            G7.j.d(r4, r5)
            java.lang.String r1 = r1.versionName
            if (r1 != 0) goto L59
            r5 = r7
            goto L5a
        L59:
            r5 = r1
        L5a:
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r8 = "MANUFACTURER"
            G7.j.d(r1, r8)
            r16.a()
            int r8 = android.os.Process.myPid()
            java.util.ArrayList r9 = p5.y.a(r2)
            java.util.Iterator r9 = r9.iterator()
        L70:
            boolean r15 = r9.hasNext()
            if (r15 == 0) goto L84
            java.lang.Object r15 = r9.next()
            r3 = r15
            p5.s r3 = (p5.C2567s) r3
            int r3 = r3.b
            if (r3 != r8) goto L82
            goto L85
        L82:
            r3 = 0
            goto L70
        L84:
            r15 = 0
        L85:
            p5.s r15 = (p5.C2567s) r15
            if (r15 != 0) goto Lb3
            int r3 = android.os.Build.VERSION.SDK_INT
            r9 = 33
            if (r3 < r9) goto L99
            java.lang.String r3 = M3.c.k()
            java.lang.String r6 = "myProcessName()"
            G7.j.d(r3, r6)
            goto Lab
        L99:
            if (r3 < r6) goto La2
            java.lang.String r3 = com.google.android.gms.ads.internal.util.a.f()
            if (r3 == 0) goto La2
            goto Lab
        La2:
            java.lang.String r3 = com.google.android.gms.common.util.ProcessUtils.getMyProcessName()
            if (r3 == 0) goto La9
            goto Lab
        La9:
            java.lang.String r3 = ""
        Lab:
            p5.s r6 = new p5.s
            r9 = 0
            r6.<init>(r3, r8, r9, r9)
            r8 = r6
            goto Lb4
        Lb3:
            r8 = r15
        Lb4:
            r16.a()
            java.util.ArrayList r9 = p5.y.a(r2)
            r3 = r14
            r6 = r7
            r7 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.<init>(r11, r12, r13, r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.G.a(g4.f):p5.b");
    }
}
