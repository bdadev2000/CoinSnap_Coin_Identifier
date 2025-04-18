package m9;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class f implements l {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21655b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public int f21656c;

    /* renamed from: d, reason: collision with root package name */
    public p f21657d;

    public f(boolean z10) {
        this.a = z10;
    }

    @Override // m9.l
    public final void c(w0 w0Var) {
        w0Var.getClass();
        ArrayList arrayList = this.f21655b;
        if (!arrayList.contains(w0Var)) {
            arrayList.add(w0Var);
            this.f21656c++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r4 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r9) {
        /*
            r8 = this;
            m9.p r0 = r8.f21657d
            int r1 = n9.h0.a
            r1 = 0
            r2 = r1
        L6:
            int r3 = r8.f21656c
            if (r2 >= r3) goto L3b
            java.util.ArrayList r3 = r8.f21655b
            java.lang.Object r3 = r3.get(r2)
            m9.w0 r3 = (m9.w0) r3
            boolean r4 = r8.a
            m9.t r3 = (m9.t) r3
            monitor-enter(r3)
            com.google.common.collect.z1 r5 = m9.t.f21737n     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L29
            int r4 = r0.f21713i     // Catch: java.lang.Throwable -> L38
            r5 = 8
            r4 = r4 & r5
            r6 = 1
            if (r4 != r5) goto L25
            r4 = r6
            goto L26
        L25:
            r4 = r1
        L26:
            if (r4 != 0) goto L29
            goto L2a
        L29:
            r6 = r1
        L2a:
            if (r6 != 0) goto L2e
            monitor-exit(r3)
            goto L35
        L2e:
            long r4 = r3.f21750h     // Catch: java.lang.Throwable -> L38
            long r6 = (long) r9     // Catch: java.lang.Throwable -> L38
            long r4 = r4 + r6
            r3.f21750h = r4     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
        L35:
            int r2 = r2 + 1
            goto L6
        L38:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.f.d(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f A[Catch: all -> 0x009b, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x0017, B:9:0x001c, B:19:0x002f, B:22:0x0036, B:24:0x0058, B:26:0x0071, B:28:0x0083, B:29:0x007a, B:30:0x0091), top: B:6:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r14 = this;
            m9.p r0 = r14.f21657d
            int r1 = n9.h0.a
            r1 = 0
            r2 = r1
        L6:
            int r3 = r14.f21656c
            if (r2 >= r3) goto L9e
            java.util.ArrayList r3 = r14.f21655b
            java.lang.Object r3 = r3.get(r2)
            m9.w0 r3 = (m9.w0) r3
            boolean r4 = r14.a
            m9.t r3 = (m9.t) r3
            monitor-enter(r3)
            com.google.common.collect.z1 r5 = m9.t.f21737n     // Catch: java.lang.Throwable -> L9b
            r11 = 1
            if (r4 == 0) goto L2a
            int r4 = r0.f21713i     // Catch: java.lang.Throwable -> L9b
            r5 = 8
            r4 = r4 & r5
            if (r4 != r5) goto L25
            r4 = r11
            goto L26
        L25:
            r4 = r1
        L26:
            if (r4 != 0) goto L2a
            r4 = r11
            goto L2b
        L2a:
            r4 = r1
        L2b:
            if (r4 != 0) goto L2f
            monitor-exit(r3)
            goto L97
        L2f:
            int r4 = r3.f21748f     // Catch: java.lang.Throwable -> L9b
            if (r4 <= 0) goto L35
            r4 = r11
            goto L36
        L35:
            r4 = r1
        L36:
            v8.u0.m(r4)     // Catch: java.lang.Throwable -> L9b
            n9.a r4 = r3.f21746d     // Catch: java.lang.Throwable -> L9b
            n9.c0 r4 = (n9.c0) r4     // Catch: java.lang.Throwable -> L9b
            r4.getClass()     // Catch: java.lang.Throwable -> L9b
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L9b
            long r4 = r3.f21749g     // Catch: java.lang.Throwable -> L9b
            long r4 = r12 - r4
            int r6 = (int) r4     // Catch: java.lang.Throwable -> L9b
            long r4 = r3.f21752j     // Catch: java.lang.Throwable -> L9b
            long r7 = (long) r6     // Catch: java.lang.Throwable -> L9b
            long r4 = r4 + r7
            r3.f21752j = r4     // Catch: java.lang.Throwable -> L9b
            long r4 = r3.f21753k     // Catch: java.lang.Throwable -> L9b
            long r7 = r3.f21750h     // Catch: java.lang.Throwable -> L9b
            long r4 = r4 + r7
            r3.f21753k = r4     // Catch: java.lang.Throwable -> L9b
            if (r6 <= 0) goto L91
            float r4 = (float) r7     // Catch: java.lang.Throwable -> L9b
            r5 = 1174011904(0x45fa0000, float:8000.0)
            float r4 = r4 * r5
            float r5 = (float) r6     // Catch: java.lang.Throwable -> L9b
            float r4 = r4 / r5
            m9.u0 r5 = r3.f21745c     // Catch: java.lang.Throwable -> L9b
            double r7 = (double) r7     // Catch: java.lang.Throwable -> L9b
            double r7 = java.lang.Math.sqrt(r7)     // Catch: java.lang.Throwable -> L9b
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L9b
            r5.a(r7, r4)     // Catch: java.lang.Throwable -> L9b
            long r4 = r3.f21752j     // Catch: java.lang.Throwable -> L9b
            r7 = 2000(0x7d0, double:9.88E-321)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 >= 0) goto L7a
            long r4 = r3.f21753k     // Catch: java.lang.Throwable -> L9b
            r7 = 524288(0x80000, double:2.590327E-318)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 < 0) goto L83
        L7a:
            m9.u0 r4 = r3.f21745c     // Catch: java.lang.Throwable -> L9b
            float r4 = r4.b()     // Catch: java.lang.Throwable -> L9b
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L9b
            r3.f21754l = r4     // Catch: java.lang.Throwable -> L9b
        L83:
            long r7 = r3.f21750h     // Catch: java.lang.Throwable -> L9b
            long r9 = r3.f21754l     // Catch: java.lang.Throwable -> L9b
            r5 = r3
            r5.c(r6, r7, r9)     // Catch: java.lang.Throwable -> L9b
            r3.f21749g = r12     // Catch: java.lang.Throwable -> L9b
            r4 = 0
            r3.f21750h = r4     // Catch: java.lang.Throwable -> L9b
        L91:
            int r4 = r3.f21748f     // Catch: java.lang.Throwable -> L9b
            int r4 = r4 - r11
            r3.f21748f = r4     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r3)
        L97:
            int r2 = r2 + 1
            goto L6
        L9b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L9e:
            r0 = 0
            r14.f21657d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.f.e():void");
    }

    public final void f() {
        for (int i10 = 0; i10 < this.f21656c; i10++) {
            ((w0) this.f21655b.get(i10)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x0015, B:9:0x001a, B:19:0x002d, B:21:0x0031, B:22:0x003e), top: B:6:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(m9.p r8) {
        /*
            r7 = this;
            r7.f21657d = r8
            r0 = 0
            r1 = r0
        L4:
            int r2 = r7.f21656c
            if (r1 >= r2) goto L4a
            java.util.ArrayList r2 = r7.f21655b
            java.lang.Object r2 = r2.get(r1)
            m9.w0 r2 = (m9.w0) r2
            boolean r3 = r7.a
            m9.t r2 = (m9.t) r2
            monitor-enter(r2)
            com.google.common.collect.z1 r4 = m9.t.f21737n     // Catch: java.lang.Throwable -> L47
            r4 = 1
            if (r3 == 0) goto L28
            int r3 = r8.f21713i     // Catch: java.lang.Throwable -> L47
            r5 = 8
            r3 = r3 & r5
            if (r3 != r5) goto L23
            r3 = r4
            goto L24
        L23:
            r3 = r0
        L24:
            if (r3 != 0) goto L28
            r3 = r4
            goto L29
        L28:
            r3 = r0
        L29:
            if (r3 != 0) goto L2d
            monitor-exit(r2)
            goto L44
        L2d:
            int r3 = r2.f21748f     // Catch: java.lang.Throwable -> L47
            if (r3 != 0) goto L3e
            n9.a r3 = r2.f21746d     // Catch: java.lang.Throwable -> L47
            n9.c0 r3 = (n9.c0) r3     // Catch: java.lang.Throwable -> L47
            r3.getClass()     // Catch: java.lang.Throwable -> L47
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L47
            r2.f21749g = r5     // Catch: java.lang.Throwable -> L47
        L3e:
            int r3 = r2.f21748f     // Catch: java.lang.Throwable -> L47
            int r3 = r3 + r4
            r2.f21748f = r3     // Catch: java.lang.Throwable -> L47
            monitor-exit(r2)
        L44:
            int r1 = r1 + 1
            goto L4
        L47:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.f.g(m9.p):void");
    }
}
