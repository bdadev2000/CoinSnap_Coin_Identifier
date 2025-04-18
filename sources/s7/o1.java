package s7;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class o1 {
    public final v2 a = new v2();

    /* renamed from: b, reason: collision with root package name */
    public final w2 f24636b = new w2();

    /* renamed from: c, reason: collision with root package name */
    public final t7.a f24637c;

    /* renamed from: d, reason: collision with root package name */
    public final n9.j f24638d;

    /* renamed from: e, reason: collision with root package name */
    public long f24639e;

    /* renamed from: f, reason: collision with root package name */
    public int f24640f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24641g;

    /* renamed from: h, reason: collision with root package name */
    public m1 f24642h;

    /* renamed from: i, reason: collision with root package name */
    public m1 f24643i;

    /* renamed from: j, reason: collision with root package name */
    public m1 f24644j;

    /* renamed from: k, reason: collision with root package name */
    public int f24645k;

    /* renamed from: l, reason: collision with root package name */
    public Object f24646l;

    /* renamed from: m, reason: collision with root package name */
    public long f24647m;

    public o1(t7.a aVar, n9.e0 e0Var) {
        this.f24637c = aVar;
        this.f24638d = e0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r23.f24788f <= r11) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static v8.z m(s7.x2 r16, java.lang.Object r17, long r18, long r20, s7.w2 r22, s7.v2 r23) {
        /*
            r0 = r16
            r1 = r18
            r3 = r22
            r4 = r17
            r5 = r23
            r0.g(r4, r5)
            int r6 = r5.f24787d
            r0.m(r6, r3)
            int r6 = r16.b(r17)
        L16:
            w8.b r7 = r5.f24791i
            int r7 = r7.f26926c
            r8 = -1
            r9 = 1
            r10 = 0
            if (r7 == 0) goto L63
            if (r7 != r9) goto L27
            boolean r11 = r5.g(r10)
            if (r11 != 0) goto L63
        L27:
            w8.b r11 = r5.f24791i
            int r11 = r11.f26929g
            boolean r11 = r5.h(r11)
            if (r11 == 0) goto L63
            r11 = 0
            int r13 = r5.c(r11)
            if (r13 == r8) goto L3a
            goto L63
        L3a:
            long r13 = r5.f24788f
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 != 0) goto L41
            goto L62
        L41:
            int r13 = r7 + (-1)
            boolean r13 = r5.g(r13)
            if (r13 == 0) goto L4b
            r13 = 2
            goto L4c
        L4b:
            r13 = r9
        L4c:
            int r7 = r7 - r13
            r13 = r10
        L4e:
            if (r13 > r7) goto L5c
            w8.b r14 = r5.f24791i
            w8.a r14 = r14.a(r13)
            long r14 = r14.f26916i
            long r11 = r11 + r14
            int r13 = r13 + 1
            goto L4e
        L5c:
            long r13 = r5.f24788f
            int r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r7 > 0) goto L63
        L62:
            r10 = r9
        L63:
            if (r10 == 0) goto L74
            int r7 = r3.f24854r
            if (r6 > r7) goto L74
            r0.f(r6, r5, r9)
            java.lang.Object r4 = r5.f24786c
            r4.getClass()
            int r6 = r6 + 1
            goto L16
        L74:
            r0.g(r4, r5)
            int r3 = r5.c(r1)
            if (r3 != r8) goto L89
            int r0 = r5.b(r1)
            v8.z r1 = new v8.z
            r6 = r20
            r1.<init>(r4, r6, r0)
            return r1
        L89:
            r6 = r20
            int r5 = r5.f(r3)
            v8.z r8 = new v8.z
            r0 = r8
            r1 = r4
            r2 = r3
            r3 = r5
            r4 = r20
            r0.<init>(r1, r2, r3, r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.o1.m(s7.x2, java.lang.Object, long, long, s7.w2, s7.v2):v8.z");
    }

    public final m1 a() {
        m1 m1Var = this.f24642h;
        if (m1Var == null) {
            return null;
        }
        if (m1Var == this.f24643i) {
            this.f24643i = m1Var.f24591l;
        }
        m1Var.f();
        int i10 = this.f24645k - 1;
        this.f24645k = i10;
        if (i10 == 0) {
            this.f24644j = null;
            m1 m1Var2 = this.f24642h;
            this.f24646l = m1Var2.f24581b;
            this.f24647m = m1Var2.f24585f.a.f26320d;
        }
        this.f24642h = this.f24642h.f24591l;
        k();
        return this.f24642h;
    }

    public final void b() {
        if (this.f24645k == 0) {
            return;
        }
        m1 m1Var = this.f24642h;
        v8.u0.p(m1Var);
        this.f24646l = m1Var.f24581b;
        this.f24647m = m1Var.f24585f.a.f26320d;
        while (m1Var != null) {
            m1Var.f();
            m1Var = m1Var.f24591l;
        }
        this.f24642h = null;
        this.f24644j = null;
        this.f24643i = null;
        this.f24645k = 0;
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e0, code lost:
    
        if (r0 != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final s7.n1 c(s7.x2 r26, s7.m1 r27, long r28) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.o1.c(s7.x2, s7.m1, long):s7.n1");
    }

    public final n1 d(x2 x2Var, m1 m1Var, long j3) {
        boolean z10;
        long j10;
        long j11;
        n1 n1Var = m1Var.f24585f;
        long j12 = (m1Var.f24594o + n1Var.f24602e) - j3;
        if (n1Var.f24604g) {
            return c(x2Var, m1Var, j12);
        }
        v8.z zVar = n1Var.a;
        Object obj = zVar.a;
        v2 v2Var = this.a;
        x2Var.g(obj, v2Var);
        boolean a = zVar.a();
        Object obj2 = zVar.a;
        if (a) {
            int i10 = zVar.f26318b;
            int i11 = v2Var.f24791i.a(i10).f26911c;
            if (i11 != -1) {
                int a10 = v2Var.f24791i.a(i10).a(zVar.f26319c);
                if (a10 < i11) {
                    return f(x2Var, zVar.a, i10, a10, n1Var.f24600c, zVar.f26320d);
                }
                long j13 = n1Var.f24600c;
                if (j13 == C.TIME_UNSET) {
                    Pair j14 = x2Var.j(this.f24636b, v2Var, v2Var.f24787d, C.TIME_UNSET, Math.max(0L, j12));
                    if (j14 != null) {
                        j13 = ((Long) j14.second).longValue();
                    }
                }
                x2Var.g(obj2, v2Var);
                int i12 = zVar.f26318b;
                long d10 = v2Var.d(i12);
                if (d10 == Long.MIN_VALUE) {
                    j11 = v2Var.f24788f;
                } else {
                    j11 = v2Var.f24791i.a(i12).f26916i + d10;
                }
                return g(x2Var, zVar.a, Math.max(j11, j13), n1Var.f24600c, zVar.f26320d);
            }
            return null;
        }
        int i13 = zVar.f26321e;
        if (i13 != -1 && v2Var.g(i13)) {
            return c(x2Var, m1Var, j12);
        }
        int f10 = v2Var.f(i13);
        if (v2Var.h(i13) && v2Var.e(i13, f10) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (f10 != v2Var.f24791i.a(i13).f26911c && !z10) {
            return f(x2Var, zVar.a, zVar.f26321e, f10, n1Var.f24602e, zVar.f26320d);
        }
        x2Var.g(obj2, v2Var);
        long d11 = v2Var.d(i13);
        if (d11 == Long.MIN_VALUE) {
            j10 = v2Var.f24788f;
        } else {
            j10 = v2Var.f24791i.a(i13).f26916i + d11;
        }
        return g(x2Var, zVar.a, j10, n1Var.f24602e, zVar.f26320d);
    }

    public final n1 e(x2 x2Var, v8.z zVar, long j3, long j10) {
        x2Var.g(zVar.a, this.a);
        if (zVar.a()) {
            return f(x2Var, zVar.a, zVar.f26318b, zVar.f26319c, j3, zVar.f26320d);
        }
        return g(x2Var, zVar.a, j10, j3, zVar.f26320d);
    }

    public final n1 f(x2 x2Var, Object obj, int i10, int i11, long j3, long j10) {
        long j11;
        long j12;
        v8.z zVar = new v8.z(obj, i10, i11, j10);
        v2 v2Var = this.a;
        long a = x2Var.g(obj, v2Var).a(i10, i11);
        if (i11 == v2Var.f(i10)) {
            j11 = v2Var.f24791i.f26927d;
        } else {
            j11 = 0;
        }
        boolean h10 = v2Var.h(i10);
        if (a != C.TIME_UNSET && j11 >= a) {
            j12 = Math.max(0L, a - 1);
        } else {
            j12 = j11;
        }
        return new n1(zVar, j12, j3, C.TIME_UNSET, a, h10, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final s7.n1 g(s7.x2 r27, java.lang.Object r28, long r29, long r31, long r33) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.o1.g(s7.x2, java.lang.Object, long, long, long):s7.n1");
    }

    public final n1 h(x2 x2Var, n1 n1Var) {
        boolean z10;
        long j3;
        long j10;
        boolean z11;
        v8.z zVar = n1Var.a;
        if (!zVar.a() && zVar.f26321e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean j11 = j(x2Var, zVar);
        boolean i10 = i(x2Var, zVar, z10);
        Object obj = n1Var.a.a;
        v2 v2Var = this.a;
        x2Var.g(obj, v2Var);
        boolean a = zVar.a();
        int i11 = zVar.f26321e;
        if (!a && i11 != -1) {
            j3 = v2Var.d(i11);
        } else {
            j3 = -9223372036854775807L;
        }
        boolean a10 = zVar.a();
        int i12 = zVar.f26318b;
        if (a10) {
            j10 = v2Var.a(i12, zVar.f26319c);
        } else if (j3 != C.TIME_UNSET && j3 != Long.MIN_VALUE) {
            j10 = j3;
        } else {
            j10 = v2Var.f24788f;
        }
        if (zVar.a()) {
            z11 = v2Var.h(i12);
        } else if (i11 != -1 && v2Var.h(i11)) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new n1(zVar, n1Var.f24599b, n1Var.f24600c, j3, j10, z11, z10, j11, i10);
    }

    public final boolean i(x2 x2Var, v8.z zVar, boolean z10) {
        boolean z11;
        int b3 = x2Var.b(zVar.a);
        if (x2Var.m(x2Var.f(b3, this.a, false).f24787d, this.f24636b).f24847k) {
            return false;
        }
        if (x2Var.d(b3, this.a, this.f24636b, this.f24640f, this.f24641g) == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 || !z10) {
            return false;
        }
        return true;
    }

    public final boolean j(x2 x2Var, v8.z zVar) {
        boolean z10;
        if (!zVar.a() && zVar.f26321e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        Object obj = zVar.a;
        if (x2Var.m(x2Var.g(obj, this.a).f24787d, this.f24636b).f24854r == x2Var.b(obj)) {
            return true;
        }
        return false;
    }

    public final void k() {
        v8.z zVar;
        com.google.common.collect.n0 n0Var = com.google.common.collect.r0.f12026c;
        com.google.common.collect.m0 m0Var = new com.google.common.collect.m0();
        for (m1 m1Var = this.f24642h; m1Var != null; m1Var = m1Var.f24591l) {
            m0Var.u(m1Var.f24585f.a);
        }
        m1 m1Var2 = this.f24643i;
        if (m1Var2 == null) {
            zVar = null;
        } else {
            zVar = m1Var2.f24585f.a;
        }
        ((n9.e0) this.f24638d).c(new androidx.emoji2.text.n(9, this, m0Var, zVar));
    }

    public final boolean l(m1 m1Var) {
        boolean z10;
        boolean z11 = false;
        if (m1Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        v8.u0.m(z10);
        if (m1Var.equals(this.f24644j)) {
            return false;
        }
        this.f24644j = m1Var;
        while (true) {
            m1Var = m1Var.f24591l;
            if (m1Var == null) {
                break;
            }
            if (m1Var == this.f24643i) {
                this.f24643i = this.f24642h;
                z11 = true;
            }
            m1Var.f();
            this.f24645k--;
        }
        m1 m1Var2 = this.f24644j;
        if (m1Var2.f24591l != null) {
            m1Var2.b();
            m1Var2.f24591l = null;
            m1Var2.c();
        }
        k();
        return z11;
    }

    public final v8.z n(x2 x2Var, Object obj, long j3) {
        long j10;
        int b3;
        Object obj2 = obj;
        v2 v2Var = this.a;
        int i10 = x2Var.g(obj2, v2Var).f24787d;
        Object obj3 = this.f24646l;
        if (obj3 != null && (b3 = x2Var.b(obj3)) != -1 && x2Var.f(b3, v2Var, false).f24787d == i10) {
            j10 = this.f24647m;
        } else {
            m1 m1Var = this.f24642h;
            while (true) {
                if (m1Var != null) {
                    if (m1Var.f24581b.equals(obj2)) {
                        j10 = m1Var.f24585f.a.f26320d;
                        break;
                    }
                    m1Var = m1Var.f24591l;
                } else {
                    m1 m1Var2 = this.f24642h;
                    while (true) {
                        if (m1Var2 != null) {
                            int b10 = x2Var.b(m1Var2.f24581b);
                            if (b10 != -1 && x2Var.f(b10, v2Var, false).f24787d == i10) {
                                j10 = m1Var2.f24585f.a.f26320d;
                                break;
                            }
                            m1Var2 = m1Var2.f24591l;
                        } else {
                            j10 = this.f24639e;
                            this.f24639e = 1 + j10;
                            if (this.f24642h == null) {
                                this.f24646l = obj2;
                                this.f24647m = j10;
                            }
                        }
                    }
                }
            }
        }
        long j11 = j10;
        x2Var.g(obj2, v2Var);
        int i11 = v2Var.f24787d;
        w2 w2Var = this.f24636b;
        x2Var.m(i11, w2Var);
        boolean z10 = false;
        for (int b11 = x2Var.b(obj); b11 >= w2Var.f24853q; b11--) {
            boolean z11 = true;
            x2Var.f(b11, v2Var, true);
            if (v2Var.f24791i.f26926c <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (v2Var.c(v2Var.f24788f) != -1) {
                obj2 = v2Var.f24786c;
                obj2.getClass();
            }
            if (z10 && (!z11 || v2Var.f24788f != 0)) {
                break;
            }
        }
        return m(x2Var, obj2, j3, j11, this.f24636b, this.a);
    }

    public final boolean o(x2 x2Var) {
        m1 m1Var;
        m1 m1Var2 = this.f24642h;
        if (m1Var2 == null) {
            return true;
        }
        int b3 = x2Var.b(m1Var2.f24581b);
        while (true) {
            b3 = x2Var.d(b3, this.a, this.f24636b, this.f24640f, this.f24641g);
            while (true) {
                m1Var = m1Var2.f24591l;
                if (m1Var == null || m1Var2.f24585f.f24604g) {
                    break;
                }
                m1Var2 = m1Var;
            }
            if (b3 == -1 || m1Var == null || x2Var.b(m1Var.f24581b) != b3) {
                break;
            }
            m1Var2 = m1Var;
        }
        boolean l10 = l(m1Var2);
        m1Var2.f24585f = h(x2Var, m1Var2.f24585f);
        return !l10;
    }

    public final boolean p(x2 x2Var, long j3, long j10) {
        boolean l10;
        boolean z10;
        n1 n1Var;
        boolean z11;
        long j11;
        boolean z12;
        m1 m1Var = null;
        for (m1 m1Var2 = this.f24642h; m1Var2 != null; m1Var2 = m1Var2.f24591l) {
            n1 n1Var2 = m1Var2.f24585f;
            if (m1Var == null) {
                n1Var = h(x2Var, n1Var2);
            } else {
                n1 d10 = d(x2Var, m1Var, j3);
                if (d10 == null) {
                    l10 = l(m1Var);
                } else {
                    if (n1Var2.f24599b == d10.f24599b && n1Var2.a.equals(d10.a)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        l10 = l(m1Var);
                    } else {
                        n1Var = d10;
                    }
                }
                return !l10;
            }
            m1Var2.f24585f = n1Var.a(n1Var2.f24600c);
            long j12 = n1Var2.f24602e;
            long j13 = n1Var.f24602e;
            if (j12 != C.TIME_UNSET && j12 != j13) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                m1Var2.h();
                if (j13 == C.TIME_UNSET) {
                    j11 = Long.MAX_VALUE;
                } else {
                    j11 = m1Var2.f24594o + j13;
                }
                if (m1Var2 == this.f24643i && !m1Var2.f24585f.f24603f && (j10 == Long.MIN_VALUE || j10 >= j11)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!l(m1Var2) && !z12) {
                    return true;
                }
                return false;
            }
            m1Var = m1Var2;
        }
        return true;
    }
}
