package x7;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.AdError;
import com.google.common.collect.b1;
import com.google.common.collect.n0;
import com.google.common.collect.q2;
import com.google.common.collect.z1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import s7.r0;
import v8.u0;

/* loaded from: classes3.dex */
public final class i implements u {

    /* renamed from: b, reason: collision with root package name */
    public final UUID f27457b;

    /* renamed from: c, reason: collision with root package name */
    public final hf.d f27458c;

    /* renamed from: d, reason: collision with root package name */
    public final h3.a f27459d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f27460e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27461f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f27462g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f27463h;

    /* renamed from: i, reason: collision with root package name */
    public final r4.c f27464i;

    /* renamed from: j, reason: collision with root package name */
    public final ac.e f27465j;

    /* renamed from: k, reason: collision with root package name */
    public final fb.c f27466k;

    /* renamed from: l, reason: collision with root package name */
    public final long f27467l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f27468m;

    /* renamed from: n, reason: collision with root package name */
    public final Set f27469n;

    /* renamed from: o, reason: collision with root package name */
    public final Set f27470o;

    /* renamed from: p, reason: collision with root package name */
    public int f27471p;

    /* renamed from: q, reason: collision with root package name */
    public b0 f27472q;

    /* renamed from: r, reason: collision with root package name */
    public d f27473r;

    /* renamed from: s, reason: collision with root package name */
    public d f27474s;

    /* renamed from: t, reason: collision with root package name */
    public Looper f27475t;
    public Handler u;

    /* renamed from: v, reason: collision with root package name */
    public int f27476v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f27477w;

    /* renamed from: x, reason: collision with root package name */
    public t7.x f27478x;

    /* renamed from: y, reason: collision with root package name */
    public volatile f f27479y;

    public i(UUID uuid, hf.d dVar, h3.a aVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, ac.e eVar, long j3) {
        uuid.getClass();
        u0.e(!s7.j.f24440b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f27457b = uuid;
        this.f27458c = dVar;
        this.f27459d = aVar;
        this.f27460e = hashMap;
        this.f27461f = z10;
        this.f27462g = iArr;
        this.f27463h = z11;
        this.f27465j = eVar;
        this.f27464i = new r4.c();
        this.f27466k = new fb.c(this);
        this.f27476v = 0;
        this.f27468m = new ArrayList();
        this.f27469n = Collections.newSetFromMap(new IdentityHashMap());
        this.f27470o = Collections.newSetFromMap(new IdentityHashMap());
        this.f27467l = j3;
    }

    public static boolean g(d dVar) {
        dVar.p();
        if (dVar.f27432p == 1) {
            if (n9.h0.a < 19) {
                return true;
            }
            m error = dVar.getError();
            error.getClass();
            if (error.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList j(l lVar, UUID uuid, boolean z10) {
        boolean z11;
        ArrayList arrayList = new ArrayList(lVar.f27490f);
        for (int i10 = 0; i10 < lVar.f27490f; i10++) {
            k kVar = lVar.f27487b[i10];
            if (!kVar.a(uuid) && (!s7.j.f24441c.equals(uuid) || !kVar.a(s7.j.f24440b))) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 && (kVar.f27486g != null || z10)) {
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    @Override // x7.u
    public final n a(q qVar, r0 r0Var) {
        boolean z10 = false;
        l(false);
        if (this.f27471p > 0) {
            z10 = true;
        }
        u0.m(z10);
        u0.p(this.f27475t);
        return f(this.f27475t, qVar, r0Var, true);
    }

    @Override // x7.u
    public final t b(q qVar, r0 r0Var) {
        boolean z10;
        if (this.f27471p > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.m(z10);
        u0.p(this.f27475t);
        h hVar = new h(this, qVar);
        Handler handler = this.u;
        handler.getClass();
        handler.post(new com.facebook.r0(17, hVar, r0Var));
        return hVar;
    }

    @Override // x7.u
    public final void c() {
        b0 cVar;
        l(true);
        int i10 = this.f27471p;
        this.f27471p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f27472q == null) {
            UUID uuid = this.f27457b;
            this.f27458c.getClass();
            try {
                try {
                    cVar = new f0(uuid);
                } catch (UnsupportedSchemeException e2) {
                    throw new i0(e2);
                } catch (Exception e10) {
                    throw new i0(e10);
                }
            } catch (i0 unused) {
                n9.o.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                cVar = new a6.c();
            }
            this.f27472q = cVar;
            cVar.b(new v3.c(this));
            return;
        }
        if (this.f27467l != C.TIME_UNSET) {
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f27468m;
                if (i11 < arrayList.size()) {
                    ((d) arrayList.get(i11)).f(null);
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // x7.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(s7.r0 r7) {
        /*
            r6 = this;
            r0 = 0
            r6.l(r0)
            x7.b0 r1 = r6.f27472q
            r1.getClass()
            int r1 = r1.a()
            x7.l r2 = r7.f24726q
            if (r2 != 0) goto L2b
            java.lang.String r7 = r7.f24723n
            int r7 = n9.q.h(r7)
            r2 = r0
        L18:
            int[] r3 = r6.f27462g
            int r4 = r3.length
            r5 = -1
            if (r2 >= r4) goto L26
            r3 = r3[r2]
            if (r3 != r7) goto L23
            goto L27
        L23:
            int r2 = r2 + 1
            goto L18
        L26:
            r2 = r5
        L27:
            if (r2 == r5) goto L2a
            r0 = r1
        L2a:
            return r0
        L2b:
            byte[] r7 = r6.f27477w
            r3 = 1
            if (r7 == 0) goto L31
            goto L8d
        L31:
            java.util.UUID r7 = r6.f27457b
            java.util.ArrayList r4 = j(r2, r7, r3)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L60
            int r4 = r2.f27490f
            if (r4 != r3) goto L8e
            x7.k[] r4 = r2.f27487b
            r4 = r4[r0]
            java.util.UUID r5 = s7.j.f24440b
            boolean r4 = r4.a(r5)
            if (r4 == 0) goto L8e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "DrmInitData only contains common PSSH SchemeData. Assuming support for: "
            r4.<init>(r5)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            java.lang.String r4 = "DefaultDrmSessionMgr"
            n9.o.f(r4, r7)
        L60:
            java.lang.String r7 = r2.f27489d
            if (r7 == 0) goto L8d
            java.lang.String r2 = "cenc"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L6d
            goto L8d
        L6d:
            java.lang.String r2 = "cbcs"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L7c
            int r7 = n9.h0.a
            r2 = 25
            if (r7 < r2) goto L8e
            goto L8d
        L7c:
            java.lang.String r2 = "cbc1"
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L8e
            java.lang.String r2 = "cens"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L8d
            goto L8e
        L8d:
            r0 = r3
        L8e:
            if (r0 == 0) goto L91
            goto L92
        L91:
            r1 = r3
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.i.d(s7.r0):int");
    }

    @Override // x7.u
    public final void e(Looper looper, t7.x xVar) {
        boolean z10;
        synchronized (this) {
            Looper looper2 = this.f27475t;
            if (looper2 == null) {
                this.f27475t = looper;
                this.u = new Handler(looper);
            } else {
                if (looper2 == looper) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u0.m(z10);
                this.u.getClass();
            }
        }
        this.f27478x = xVar;
    }

    public final n f(Looper looper, q qVar, r0 r0Var, boolean z10) {
        ArrayList arrayList;
        boolean z11;
        if (this.f27479y == null) {
            this.f27479y = new f(this, looper);
        }
        l lVar = r0Var.f24726q;
        int i10 = 0;
        d dVar = null;
        if (lVar == null) {
            int h10 = n9.q.h(r0Var.f24723n);
            b0 b0Var = this.f27472q;
            b0Var.getClass();
            if (b0Var.a() == 2 && c0.f27415d) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return null;
            }
            int[] iArr = this.f27462g;
            while (true) {
                if (i10 < iArr.length) {
                    if (iArr[i10] == h10) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1 || b0Var.a() == 1) {
                return null;
            }
            d dVar2 = this.f27473r;
            if (dVar2 == null) {
                n0 n0Var = com.google.common.collect.r0.f12026c;
                d i11 = i(z1.f12062g, true, null, z10);
                this.f27468m.add(i11);
                this.f27473r = i11;
            } else {
                dVar2.f(null);
            }
            return this.f27473r;
        }
        if (this.f27477w == null) {
            arrayList = j(lVar, this.f27457b, false);
            if (arrayList.isEmpty()) {
                g gVar = new g(this.f27457b);
                n9.o.d("DefaultDrmSessionMgr", "DRM error", gVar);
                if (qVar != null) {
                    qVar.e(gVar);
                }
                return new y(new m(gVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            arrayList = null;
        }
        if (!this.f27461f) {
            dVar = this.f27474s;
        } else {
            Iterator it = this.f27468m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d dVar3 = (d) it.next();
                if (n9.h0.a(dVar3.a, arrayList)) {
                    dVar = dVar3;
                    break;
                }
            }
        }
        if (dVar == null) {
            dVar = i(arrayList, false, qVar, z10);
            if (!this.f27461f) {
                this.f27474s = dVar;
            }
            this.f27468m.add(dVar);
        } else {
            dVar.f(qVar);
        }
        return dVar;
    }

    public final d h(List list, boolean z10, q qVar) {
        this.f27472q.getClass();
        boolean z11 = this.f27463h | z10;
        UUID uuid = this.f27457b;
        b0 b0Var = this.f27472q;
        r4.c cVar = this.f27464i;
        fb.c cVar2 = this.f27466k;
        int i10 = this.f27476v;
        byte[] bArr = this.f27477w;
        HashMap hashMap = this.f27460e;
        h3.a aVar = this.f27459d;
        Looper looper = this.f27475t;
        looper.getClass();
        ac.e eVar = this.f27465j;
        t7.x xVar = this.f27478x;
        xVar.getClass();
        d dVar = new d(uuid, b0Var, cVar, cVar2, list, i10, z11, z10, bArr, hashMap, aVar, looper, eVar, xVar);
        dVar.f(qVar);
        if (this.f27467l != C.TIME_UNSET) {
            dVar.f(null);
        }
        return dVar;
    }

    public final d i(List list, boolean z10, q qVar, boolean z11) {
        d h10 = h(list, z10, qVar);
        boolean g10 = g(h10);
        long j3 = this.f27467l;
        Set set = this.f27470o;
        if (g10 && !set.isEmpty()) {
            q2 it = b1.l(set).iterator();
            while (it.hasNext()) {
                ((n) it.next()).e(null);
            }
            h10.e(qVar);
            if (j3 != C.TIME_UNSET) {
                h10.e(null);
            }
            h10 = h(list, z10, qVar);
        }
        if (g(h10) && z11) {
            Set set2 = this.f27469n;
            if (!set2.isEmpty()) {
                q2 it2 = b1.l(set2).iterator();
                while (it2.hasNext()) {
                    ((h) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    q2 it3 = b1.l(set).iterator();
                    while (it3.hasNext()) {
                        ((n) it3.next()).e(null);
                    }
                }
                h10.e(qVar);
                if (j3 != C.TIME_UNSET) {
                    h10.e(null);
                }
                return h(list, z10, qVar);
            }
            return h10;
        }
        return h10;
    }

    public final void k() {
        if (this.f27472q != null && this.f27471p == 0 && this.f27468m.isEmpty() && this.f27469n.isEmpty()) {
            b0 b0Var = this.f27472q;
            b0Var.getClass();
            b0Var.release();
            this.f27472q = null;
        }
    }

    public final void l(boolean z10) {
        if (z10 && this.f27475t == null) {
            n9.o.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f27475t;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            n9.o.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f27475t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // x7.u
    public final void release() {
        l(true);
        int i10 = this.f27471p - 1;
        this.f27471p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f27467l != C.TIME_UNSET) {
            ArrayList arrayList = new ArrayList(this.f27468m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).e(null);
            }
        }
        q2 it = b1.l(this.f27469n).iterator();
        while (it.hasNext()) {
            ((h) it.next()).release();
        }
        k();
    }
}
