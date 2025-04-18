package t7;

import java.util.HashMap;
import java.util.Random;
import s7.v2;
import s7.w2;
import s7.x2;
import v8.z;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: g, reason: collision with root package name */
    public static final s7.u f25329g = new s7.u(1);

    /* renamed from: h, reason: collision with root package name */
    public static final Random f25330h = new Random();

    /* renamed from: d, reason: collision with root package name */
    public v f25333d;

    /* renamed from: f, reason: collision with root package name */
    public String f25335f;
    public final w2 a = new w2();

    /* renamed from: b, reason: collision with root package name */
    public final v2 f25331b = new v2();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f25332c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public x2 f25334e = x2.f24864b;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r16 == r8.f25323b) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005f, code lost:
    
        r10 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t7.q a(int r16, v8.z r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            java.util.HashMap r3 = r0.f25332c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L15:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L80
            java.lang.Object r8 = r4.next()
            t7.q r8 = (t7.q) r8
            long r9 = r8.f25324c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L33
            int r9 = r8.f25323b
            if (r1 != r9) goto L33
            if (r2 == 0) goto L33
            long r9 = r2.f26320d
            r8.f25324c = r9
        L33:
            v8.z r9 = r8.f25325d
            if (r2 != 0) goto L3c
            int r10 = r8.f25323b
            if (r1 != r10) goto L61
            goto L5f
        L3c:
            long r13 = r2.f26320d
            if (r9 != 0) goto L4d
            boolean r10 = r17.a()
            if (r10 != 0) goto L61
            long r11 = r8.f25324c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L61
            goto L5f
        L4d:
            long r10 = r9.f26320d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L61
            int r10 = r2.f26318b
            int r11 = r9.f26318b
            if (r10 != r11) goto L61
            int r10 = r2.f26319c
            int r11 = r9.f26319c
            if (r10 != r11) goto L61
        L5f:
            r10 = 1
            goto L62
        L61:
            r10 = 0
        L62:
            if (r10 == 0) goto L15
            long r10 = r8.f25324c
            r12 = -1
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 == 0) goto L7d
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L71
            goto L7d
        L71:
            if (r12 != 0) goto L15
            int r10 = n9.h0.a
            v8.z r10 = r5.f25325d
            if (r10 == 0) goto L15
            if (r9 == 0) goto L15
            r5 = r8
            goto L15
        L7d:
            r5 = r8
            r6 = r10
            goto L15
        L80:
            if (r5 != 0) goto L92
            s7.u r4 = t7.r.f25329g
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            t7.q r5 = new t7.q
            r5.<init>(r15, r4, r1, r2)
            r3.put(r4, r5)
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.r.a(int, v8.z):t7.q");
    }

    public final void b(b bVar) {
        z zVar;
        if (bVar.f25287b.p()) {
            this.f25335f = null;
            return;
        }
        q qVar = (q) this.f25332c.get(this.f25335f);
        int i10 = bVar.f25288c;
        z zVar2 = bVar.f25289d;
        this.f25335f = a(i10, zVar2).a;
        c(bVar);
        if (zVar2 != null && zVar2.a()) {
            long j3 = zVar2.f26320d;
            if (qVar == null || qVar.f25324c != j3 || (zVar = qVar.f25325d) == null || zVar.f26318b != zVar2.f26318b || zVar.f26319c != zVar2.f26319c) {
                a(i10, new z(zVar2.a, j3));
                this.f25333d.getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
    
        if (r1.f26320d < r3) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void c(t7.b r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            t7.v r0 = r7.f25333d     // Catch: java.lang.Throwable -> Lc0
            r0.getClass()     // Catch: java.lang.Throwable -> Lc0
            s7.x2 r0 = r8.f25287b     // Catch: java.lang.Throwable -> Lc0
            boolean r0 = r0.p()     // Catch: java.lang.Throwable -> Lc0
            if (r0 == 0) goto L10
            monitor-exit(r7)
            return
        L10:
            java.util.HashMap r0 = r7.f25332c     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = r7.f25335f     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lc0
            t7.q r0 = (t7.q) r0     // Catch: java.lang.Throwable -> Lc0
            v8.z r1 = r8.f25289d     // Catch: java.lang.Throwable -> Lc0
            r2 = 1
            if (r1 == 0) goto L3d
            if (r0 == 0) goto L3d
            long r3 = r0.f25324c     // Catch: java.lang.Throwable -> Lc0
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L30
            int r0 = r0.f25323b     // Catch: java.lang.Throwable -> Lc0
            int r3 = r8.f25288c     // Catch: java.lang.Throwable -> Lc0
            if (r0 == r3) goto L38
            goto L36
        L30:
            long r5 = r1.f26320d     // Catch: java.lang.Throwable -> Lc0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L38
        L36:
            r0 = r2
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 == 0) goto L3d
            monitor-exit(r7)
            return
        L3d:
            int r0 = r8.f25288c     // Catch: java.lang.Throwable -> Lc0
            t7.q r0 = r7.a(r0, r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = r7.f25335f     // Catch: java.lang.Throwable -> Lc0
            if (r1 != 0) goto L4b
            java.lang.String r1 = r0.a     // Catch: java.lang.Throwable -> Lc0
            r7.f25335f = r1     // Catch: java.lang.Throwable -> Lc0
        L4b:
            v8.z r1 = r8.f25289d     // Catch: java.lang.Throwable -> Lc0
            if (r1 == 0) goto L9a
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> Lc0
            if (r1 == 0) goto L9a
            v8.z r1 = new v8.z     // Catch: java.lang.Throwable -> Lc0
            v8.z r3 = r8.f25289d     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r4 = r3.a     // Catch: java.lang.Throwable -> Lc0
            long r5 = r3.f26320d     // Catch: java.lang.Throwable -> Lc0
            int r3 = r3.f26318b     // Catch: java.lang.Throwable -> Lc0
            r1.<init>(r4, r5, r3)     // Catch: java.lang.Throwable -> Lc0
            int r3 = r8.f25288c     // Catch: java.lang.Throwable -> Lc0
            t7.q r1 = r7.a(r3, r1)     // Catch: java.lang.Throwable -> Lc0
            boolean r3 = r1.f25326e     // Catch: java.lang.Throwable -> Lc0
            if (r3 != 0) goto L9a
            r1.f25326e = r2     // Catch: java.lang.Throwable -> Lc0
            s7.x2 r1 = r8.f25287b     // Catch: java.lang.Throwable -> Lc0
            v8.z r3 = r8.f25289d     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r3 = r3.a     // Catch: java.lang.Throwable -> Lc0
            s7.v2 r4 = r7.f25331b     // Catch: java.lang.Throwable -> Lc0
            r1.g(r3, r4)     // Catch: java.lang.Throwable -> Lc0
            s7.v2 r1 = r7.f25331b     // Catch: java.lang.Throwable -> Lc0
            v8.z r3 = r8.f25289d     // Catch: java.lang.Throwable -> Lc0
            int r3 = r3.f26318b     // Catch: java.lang.Throwable -> Lc0
            long r3 = r1.d(r3)     // Catch: java.lang.Throwable -> Lc0
            long r3 = n9.h0.Q(r3)     // Catch: java.lang.Throwable -> Lc0
            s7.v2 r1 = r7.f25331b     // Catch: java.lang.Throwable -> Lc0
            long r5 = r1.f24789g     // Catch: java.lang.Throwable -> Lc0
            long r5 = n9.h0.Q(r5)     // Catch: java.lang.Throwable -> Lc0
            long r3 = r3 + r5
            r5 = 0
            java.lang.Math.max(r5, r3)     // Catch: java.lang.Throwable -> Lc0
            t7.v r1 = r7.f25333d     // Catch: java.lang.Throwable -> Lc0
            r1.getClass()     // Catch: java.lang.Throwable -> Lc0
        L9a:
            boolean r1 = r0.f25326e     // Catch: java.lang.Throwable -> Lc0
            if (r1 != 0) goto La5
            r0.f25326e = r2     // Catch: java.lang.Throwable -> Lc0
            t7.v r1 = r7.f25333d     // Catch: java.lang.Throwable -> Lc0
            r1.getClass()     // Catch: java.lang.Throwable -> Lc0
        La5:
            java.lang.String r1 = r0.a     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r3 = r7.f25335f     // Catch: java.lang.Throwable -> Lc0
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lc0
            if (r1 == 0) goto Lbe
            boolean r1 = r0.f25327f     // Catch: java.lang.Throwable -> Lc0
            if (r1 != 0) goto Lbe
            r0.f25327f = r2     // Catch: java.lang.Throwable -> Lc0
            t7.v r1 = r7.f25333d     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r0 = r0.a     // Catch: java.lang.Throwable -> Lc0
            t7.u r1 = (t7.u) r1     // Catch: java.lang.Throwable -> Lc0
            r1.e(r8, r0)     // Catch: java.lang.Throwable -> Lc0
        Lbe:
            monitor-exit(r7)
            return
        Lc0:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.r.c(t7.b):void");
    }
}
