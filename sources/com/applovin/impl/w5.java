package com.applovin.impl;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.applovin.impl.v5;
import com.applovin.impl.w6;
import com.applovin.impl.x6;
import com.applovin.impl.x7;
import com.applovin.impl.y6;
import com.applovin.impl.z6;
import com.facebook.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public class w5 implements z6 {

    /* renamed from: c */
    private final UUID f8694c;

    /* renamed from: d */
    private final x7.c f8695d;

    /* renamed from: e */
    private final ld f8696e;

    /* renamed from: f */
    private final HashMap f8697f;

    /* renamed from: g */
    private final boolean f8698g;

    /* renamed from: h */
    private final int[] f8699h;

    /* renamed from: i */
    private final boolean f8700i;

    /* renamed from: j */
    private final g f8701j;

    /* renamed from: k */
    private final hc f8702k;

    /* renamed from: l */
    private final h f8703l;

    /* renamed from: m */
    private final long f8704m;

    /* renamed from: n */
    private final List f8705n;

    /* renamed from: o */
    private final Set f8706o;

    /* renamed from: p */
    private final Set f8707p;

    /* renamed from: q */
    private int f8708q;

    /* renamed from: r */
    private x7 f8709r;

    /* renamed from: s */
    private v5 f8710s;

    /* renamed from: t */
    private v5 f8711t;
    private Looper u;

    /* renamed from: v */
    private Handler f8712v;

    /* renamed from: w */
    private int f8713w;

    /* renamed from: x */
    private byte[] f8714x;

    /* renamed from: y */
    volatile d f8715y;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: d */
        private boolean f8718d;

        /* renamed from: f */
        private boolean f8720f;
        private final HashMap a = new HashMap();

        /* renamed from: b */
        private UUID f8716b = r2.f7312d;

        /* renamed from: c */
        private x7.c f8717c = k9.f5638d;

        /* renamed from: g */
        private hc f8721g = new e6();

        /* renamed from: e */
        private int[] f8719e = new int[0];

        /* renamed from: h */
        private long f8722h = 300000;

        public b a(boolean z10) {
            this.f8718d = z10;
            return this;
        }

        public b b(boolean z10) {
            this.f8720f = z10;
            return this;
        }

        public b a(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                a1.a(z10);
            }
            this.f8719e = (int[]) iArr.clone();
            return this;
        }

        public b a(UUID uuid, x7.c cVar) {
            this.f8716b = (UUID) a1.a(uuid);
            this.f8717c = (x7.c) a1.a(cVar);
            return this;
        }

        public w5 a(ld ldVar) {
            return new w5(this.f8716b, this.f8717c, ldVar, this.a, this.f8718d, this.f8719e, this.f8720f, this.f8721g, this.f8722h);
        }
    }

    /* loaded from: classes.dex */
    public class c implements x7.b {
        private c() {
        }

        @Override // com.applovin.impl.x7.b
        public void a(x7 x7Var, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) a1.a(w5.this.f8715y)).obtainMessage(i10, bArr).sendToTarget();
        }

        public /* synthetic */ c(w5 w5Var, a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (v5 v5Var : w5.this.f8705n) {
                if (v5Var.a(bArr)) {
                    v5Var.a(message.what);
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends Exception {
        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }

        public /* synthetic */ e(UUID uuid, a aVar) {
            this(uuid);
        }
    }

    /* loaded from: classes.dex */
    public class f implements z6.b {

        /* renamed from: b */
        private final y6.a f8723b;

        /* renamed from: c */
        private x6 f8724c;

        /* renamed from: d */
        private boolean f8725d;

        public f(y6.a aVar) {
            this.f8723b = aVar;
        }

        public static /* synthetic */ void a(f fVar, d9 d9Var) {
            fVar.b(d9Var);
        }

        public static /* synthetic */ void b(f fVar) {
            fVar.c();
        }

        public /* synthetic */ void c() {
            if (this.f8725d) {
                return;
            }
            x6 x6Var = this.f8724c;
            if (x6Var != null) {
                x6Var.a(this.f8723b);
            }
            w5.this.f8706o.remove(this);
            this.f8725d = true;
        }

        public /* synthetic */ void b(d9 d9Var) {
            if (w5.this.f8708q == 0 || this.f8725d) {
                return;
            }
            w5 w5Var = w5.this;
            this.f8724c = w5Var.a((Looper) a1.a(w5Var.u), this.f8723b, d9Var, false);
            w5.this.f8706o.add(this);
        }

        public void a(d9 d9Var) {
            ((Handler) a1.a(w5.this.f8712v)).post(new rs(5, this, d9Var));
        }

        @Override // com.applovin.impl.z6.b
        public void a() {
            yp.a((Handler) a1.a(w5.this.f8712v), (Runnable) new nt(this, 4));
        }
    }

    /* loaded from: classes.dex */
    public class h implements v5.b {
        private h() {
        }

        public static /* synthetic */ void b(v5 v5Var) {
            v5Var.a((y6.a) null);
        }

        public /* synthetic */ h(w5 w5Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.v5.b
        public void a(v5 v5Var, int i10) {
            if (w5.this.f8704m != C.TIME_UNSET) {
                w5.this.f8707p.remove(v5Var);
                ((Handler) a1.a(w5.this.f8712v)).removeCallbacksAndMessages(v5Var);
            }
        }

        @Override // com.applovin.impl.v5.b
        public void b(v5 v5Var, int i10) {
            if (i10 == 1 && w5.this.f8708q > 0 && w5.this.f8704m != C.TIME_UNSET) {
                w5.this.f8707p.add(v5Var);
                ((Handler) a1.a(w5.this.f8712v)).postAtTime(new nt(v5Var, 5), v5Var, w5.this.f8704m + SystemClock.uptimeMillis());
            } else if (i10 == 0) {
                w5.this.f8705n.remove(v5Var);
                if (w5.this.f8710s == v5Var) {
                    w5.this.f8710s = null;
                }
                if (w5.this.f8711t == v5Var) {
                    w5.this.f8711t = null;
                }
                w5.this.f8701j.b(v5Var);
                if (w5.this.f8704m != C.TIME_UNSET) {
                    ((Handler) a1.a(w5.this.f8712v)).removeCallbacksAndMessages(v5Var);
                    w5.this.f8707p.remove(v5Var);
                }
            }
            w5.this.c();
        }
    }

    private w5(UUID uuid, x7.c cVar, ld ldVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, hc hcVar, long j3) {
        a1.a(uuid);
        a1.a(!r2.f7310b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f8694c = uuid;
        this.f8695d = cVar;
        this.f8696e = ldVar;
        this.f8697f = hashMap;
        this.f8698g = z10;
        this.f8699h = iArr;
        this.f8700i = z11;
        this.f8702k = hcVar;
        this.f8701j = new g();
        this.f8703l = new h();
        this.f8713w = 0;
        this.f8705n = new ArrayList();
        this.f8706o = nj.b();
        this.f8707p = nj.b();
        this.f8704m = j3;
    }

    public void c() {
        if (this.f8709r != null && this.f8708q == 0 && this.f8705n.isEmpty() && this.f8706o.isEmpty()) {
            ((x7) a1.a(this.f8709r)).a();
            this.f8709r = null;
        }
    }

    private void d() {
        qp it = eb.a((Collection) this.f8707p).iterator();
        while (it.hasNext()) {
            ((x6) it.next()).a((y6.a) null);
        }
    }

    private void e() {
        qp it = eb.a((Collection) this.f8706o).iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
    }

    private void b(Looper looper) {
        if (this.f8715y == null) {
            this.f8715y = new d(looper);
        }
    }

    @Override // com.applovin.impl.z6
    public x6 a(Looper looper, y6.a aVar, d9 d9Var) {
        a1.b(this.f8708q > 0);
        a(looper);
        return a(looper, aVar, d9Var, true);
    }

    @Override // com.applovin.impl.z6
    public z6.b b(Looper looper, y6.a aVar, d9 d9Var) {
        a1.b(this.f8708q > 0);
        a(looper);
        f fVar = new f(aVar);
        fVar.a(d9Var);
        return fVar;
    }

    /* loaded from: classes.dex */
    public class g implements v5.a {
        private final Set a = new HashSet();

        /* renamed from: b */
        private v5 f8727b;

        public g() {
        }

        @Override // com.applovin.impl.v5.a
        public void a() {
            this.f8727b = null;
            ab a = ab.a((Collection) this.a);
            this.a.clear();
            qp it = a.iterator();
            while (it.hasNext()) {
                ((v5) it.next()).i();
            }
        }

        public void b(v5 v5Var) {
            this.a.remove(v5Var);
            if (this.f8727b == v5Var) {
                this.f8727b = null;
                if (!this.a.isEmpty()) {
                    v5 v5Var2 = (v5) this.a.iterator().next();
                    this.f8727b = v5Var2;
                    v5Var2.k();
                }
            }
        }

        @Override // com.applovin.impl.v5.a
        public void a(Exception exc, boolean z10) {
            this.f8727b = null;
            ab a = ab.a((Collection) this.a);
            this.a.clear();
            qp it = a.iterator();
            while (it.hasNext()) {
                ((v5) it.next()).b(exc, z10);
            }
        }

        @Override // com.applovin.impl.v5.a
        public void a(v5 v5Var) {
            this.a.add(v5Var);
            if (this.f8727b != null) {
                return;
            }
            this.f8727b = v5Var;
            v5Var.k();
        }
    }

    public x6 a(Looper looper, y6.a aVar, d9 d9Var, boolean z10) {
        List list;
        b(looper);
        w6 w6Var = d9Var.f4231p;
        if (w6Var == null) {
            return a(df.e(d9Var.f4228m), z10);
        }
        v5 v5Var = null;
        if (this.f8714x == null) {
            list = a((w6) a1.a(w6Var), this.f8694c, false);
            if (list.isEmpty()) {
                e eVar = new e(this.f8694c);
                kc.a("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.a(eVar);
                }
                return new s7(new x6.a(eVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            list = null;
        }
        if (!this.f8698g) {
            v5Var = this.f8711t;
        } else {
            Iterator it = this.f8705n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                v5 v5Var2 = (v5) it.next();
                if (yp.a(v5Var2.a, list)) {
                    v5Var = v5Var2;
                    break;
                }
            }
        }
        if (v5Var == null) {
            v5Var = a(list, false, aVar, z10);
            if (!this.f8698g) {
                this.f8711t = v5Var;
            }
            this.f8705n.add(v5Var);
        } else {
            v5Var.b(aVar);
        }
        return v5Var;
    }

    @Override // com.applovin.impl.z6
    public final void b() {
        int i10 = this.f8708q;
        this.f8708q = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f8709r == null) {
            x7 a10 = this.f8695d.a(this.f8694c);
            this.f8709r = a10;
            a10.a(new c());
        } else if (this.f8704m != C.TIME_UNSET) {
            for (int i11 = 0; i11 < this.f8705n.size(); i11++) {
                ((v5) this.f8705n.get(i11)).b(null);
            }
        }
    }

    public /* synthetic */ w5(UUID uuid, x7.c cVar, ld ldVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, hc hcVar, long j3, a aVar) {
        this(uuid, cVar, ldVar, hashMap, z10, iArr, z11, hcVar, j3);
    }

    private static boolean a(x6 x6Var) {
        return x6Var.b() == 1 && (yp.a < 19 || (((x6.a) a1.a(x6Var.getError())).getCause() instanceof ResourceBusyException));
    }

    private boolean a(w6 w6Var) {
        if (this.f8714x != null) {
            return true;
        }
        if (a(w6Var, this.f8694c, true).isEmpty()) {
            if (w6Var.f8731d != 1 || !w6Var.a(0).a(r2.f7310b)) {
                return false;
            }
            kc.d("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f8694c);
        }
        String str = w6Var.f8730c;
        if (str == null || C.CENC_TYPE_cenc.equals(str)) {
            return true;
        }
        return C.CENC_TYPE_cbcs.equals(str) ? yp.a >= 25 : (C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str)) ? false : true;
    }

    private v5 a(List list, boolean z10, y6.a aVar) {
        a1.a(this.f8709r);
        v5 v5Var = new v5(this.f8694c, this.f8709r, this.f8701j, this.f8703l, list, this.f8713w, this.f8700i | z10, z10, this.f8714x, this.f8697f, this.f8696e, (Looper) a1.a(this.u), this.f8702k);
        v5Var.b(aVar);
        if (this.f8704m != C.TIME_UNSET) {
            v5Var.b(null);
        }
        return v5Var;
    }

    private v5 a(List list, boolean z10, y6.a aVar, boolean z11) {
        v5 a10 = a(list, z10, aVar);
        if (a(a10) && !this.f8707p.isEmpty()) {
            d();
            a(a10, aVar);
            a10 = a(list, z10, aVar);
        }
        if (!a(a10) || !z11 || this.f8706o.isEmpty()) {
            return a10;
        }
        e();
        if (!this.f8707p.isEmpty()) {
            d();
        }
        a(a10, aVar);
        return a(list, z10, aVar);
    }

    @Override // com.applovin.impl.z6
    public int a(d9 d9Var) {
        int c10 = ((x7) a1.a(this.f8709r)).c();
        w6 w6Var = d9Var.f4231p;
        if (w6Var == null) {
            if (yp.a(this.f8699h, df.e(d9Var.f4228m)) != -1) {
                return c10;
            }
            return 0;
        }
        if (a(w6Var)) {
            return c10;
        }
        return 1;
    }

    private synchronized void a(Looper looper) {
        Looper looper2 = this.u;
        if (looper2 == null) {
            this.u = looper;
            this.f8712v = new Handler(looper);
        } else {
            a1.b(looper2 == looper);
            a1.a(this.f8712v);
        }
    }

    private x6 a(int i10, boolean z10) {
        x7 x7Var = (x7) a1.a(this.f8709r);
        if ((x7Var.c() == 2 && j9.f5460d) || yp.a(this.f8699h, i10) == -1 || x7Var.c() == 1) {
            return null;
        }
        v5 v5Var = this.f8710s;
        if (v5Var == null) {
            v5 a10 = a((List) ab.h(), true, (y6.a) null, z10);
            this.f8705n.add(a10);
            this.f8710s = a10;
        } else {
            v5Var.b(null);
        }
        return this.f8710s;
    }

    @Override // com.applovin.impl.z6
    public final void a() {
        int i10 = this.f8708q - 1;
        this.f8708q = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f8704m != C.TIME_UNSET) {
            ArrayList arrayList = new ArrayList(this.f8705n);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((v5) arrayList.get(i11)).a((y6.a) null);
            }
        }
        e();
        c();
    }

    public void a(int i10, byte[] bArr) {
        a1.b(this.f8705n.isEmpty());
        if (i10 == 1 || i10 == 3) {
            a1.a(bArr);
        }
        this.f8713w = i10;
        this.f8714x = bArr;
    }

    private void a(x6 x6Var, y6.a aVar) {
        x6Var.a(aVar);
        if (this.f8704m != C.TIME_UNSET) {
            x6Var.a((y6.a) null);
        }
    }

    private static List a(w6 w6Var, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(w6Var.f8731d);
        for (int i10 = 0; i10 < w6Var.f8731d; i10++) {
            w6.b a10 = w6Var.a(i10);
            if ((a10.a(uuid) || (r2.f7311c.equals(uuid) && a10.a(r2.f7310b))) && (a10.f8735f != null || z10)) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }
}
