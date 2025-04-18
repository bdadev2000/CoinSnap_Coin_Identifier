package q;

import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f31329a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f31330b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f31331c;

    public q(f.i iVar, v.n nVar) {
        Object obj;
        this.f31329a = iVar;
        this.f31330b = nVar;
        int i2 = Build.VERSION.SDK_INT;
        if (v.b.f31372a) {
            obj = new v.l(false);
        } else if (i2 != 26 && i2 != 27) {
            obj = new v.l(true);
        } else {
            obj = new Object();
        }
        this.f31331c = obj;
    }

    public static e a(j jVar, Throwable th) {
        Drawable b2;
        if (th instanceof m) {
            b2 = v.f.b(jVar, jVar.K, jVar.J, jVar.M.f31247l);
            if (b2 == null) {
                b2 = v.f.b(jVar, jVar.I, jVar.H, jVar.M.f31246k);
            }
        } else {
            b2 = v.f.b(jVar, jVar.I, jVar.H, jVar.M.f31246k);
        }
        return new e(b2, jVar, th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x002f, code lost:
    
        if (((v.j) r18.f31331c).a(r20) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final q.n b(q.j r19, r.g r20) {
        /*
            r18 = this;
            r0 = r19
            r4 = r20
            java.util.List r1 = r0.f31300l
            boolean r2 = r1.isEmpty()
            android.graphics.Bitmap$Config r3 = r0.f31295g
            if (r2 != 0) goto L1a
            android.graphics.Bitmap$Config[] r2 = v.g.f31378a
            boolean r2 = e0.q.N(r2, r3)
            if (r2 == 0) goto L17
            goto L1a
        L17:
            r15 = r18
            goto L32
        L1a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.HARDWARE
            if (r3 != r2) goto L35
            if (r3 != r2) goto L25
            boolean r2 = r0.f31305q
            if (r2 != 0) goto L25
            goto L17
        L25:
            r15 = r18
            java.lang.Object r2 = r15.f31331c
            v.j r2 = (v.j) r2
            boolean r2 = r2.a(r4)
            if (r2 == 0) goto L32
            goto L37
        L32:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            goto L38
        L35:
            r15 = r18
        L37:
            r2 = r3
        L38:
            p0.a r3 = r4.f31350a
            r.b r5 = r.b.f31340a
            boolean r3 = p0.a.g(r3, r5)
            if (r3 != 0) goto L4f
            p0.a r3 = r4.f31351b
            boolean r3 = p0.a.g(r3, r5)
            if (r3 == 0) goto L4b
            goto L4f
        L4b:
            r.f r3 = r0.C
        L4d:
            r5 = r3
            goto L52
        L4f:
            r.f r3 = r.f.f31347b
            goto L4d
        L52:
            boolean r3 = r0.f31306r
            if (r3 == 0) goto L63
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L63
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8
            if (r2 == r1) goto L63
            r1 = 1
        L61:
            r7 = r1
            goto L65
        L63:
            r1 = 0
            goto L61
        L65:
            q.n r16 = new q.n
            android.content.Context r1 = r0.f31291a
            android.graphics.ColorSpace r3 = r0.f31296h
            boolean r6 = v.f.a(r19)
            boolean r8 = r0.f31307s
            java.lang.String r9 = r0.f31294f
            okhttp3.Headers r10 = r0.f31302n
            q.s r11 = r0.f31303o
            q.o r12 = r0.D
            q.b r13 = r0.f31308t
            q.b r14 = r0.f31309u
            q.b r0 = r0.f31310v
            r17 = r0
            r0 = r16
            r4 = r20
            r15 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: q.q.b(q.j, r.g):q.n");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final q.n c(q.n r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            android.graphics.Bitmap$Config r2 = r0.f31315b
            q.b r3 = r0.f31326o
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.HARDWARE
            r5 = 0
            r6 = 1
            if (r2 != r4) goto L10
            r4 = r6
            goto L11
        L10:
            r4 = r5
        L11:
            if (r4 == 0) goto L23
            java.lang.Object r4 = r1.f31331c
            v.j r4 = (v.j) r4
            boolean r4 = r4.b()
            if (r4 == 0) goto L1e
            goto L23
        L1e:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r9 = r2
            r5 = r6
            goto L24
        L23:
            r9 = r2
        L24:
            q.b r2 = r0.f31326o
            boolean r2 = r2.f31236a
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.f31330b
            v.n r2 = (v.n) r2
            monitor-enter(r2)
            r2.a()     // Catch: java.lang.Throwable -> L3c
            boolean r4 = r2.f31395f     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)
            if (r4 != 0) goto L3f
            q.b r3 = q.b.d
            r22 = r3
            goto L42
        L3c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L3f:
            r22 = r3
            r6 = r5
        L42:
            if (r6 == 0) goto L72
            android.content.Context r8 = r0.f31314a
            android.graphics.ColorSpace r10 = r0.f31316c
            r.g r11 = r0.d
            r.f r12 = r0.e
            boolean r13 = r0.f31317f
            boolean r14 = r0.f31318g
            boolean r15 = r0.f31319h
            java.lang.String r2 = r0.f31320i
            okhttp3.Headers r3 = r0.f31321j
            q.s r4 = r0.f31322k
            q.o r5 = r0.f31323l
            q.b r6 = r0.f31324m
            q.b r0 = r0.f31325n
            q.n r23 = new q.n
            r7 = r23
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r23
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.q.c(q.n):q.n");
    }

    public q(Method method, Method method2, Method method3) {
        this.f31329a = method;
        this.f31330b = method2;
        this.f31331c = method3;
    }
}
