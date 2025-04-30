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
    private final UUID f11906c;

    /* renamed from: d */
    private final x7.c f11907d;

    /* renamed from: e */
    private final ld f11908e;

    /* renamed from: f */
    private final HashMap f11909f;

    /* renamed from: g */
    private final boolean f11910g;

    /* renamed from: h */
    private final int[] f11911h;

    /* renamed from: i */
    private final boolean f11912i;

    /* renamed from: j */
    private final g f11913j;

    /* renamed from: k */
    private final hc f11914k;
    private final h l;
    private final long m;

    /* renamed from: n */
    private final List f11915n;

    /* renamed from: o */
    private final Set f11916o;

    /* renamed from: p */
    private final Set f11917p;

    /* renamed from: q */
    private int f11918q;

    /* renamed from: r */
    private x7 f11919r;

    /* renamed from: s */
    private v5 f11920s;

    /* renamed from: t */
    private v5 f11921t;

    /* renamed from: u */
    private Looper f11922u;

    /* renamed from: v */
    private Handler f11923v;

    /* renamed from: w */
    private int f11924w;

    /* renamed from: x */
    private byte[] f11925x;

    /* renamed from: y */
    volatile d f11926y;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: d */
        private boolean f11929d;

        /* renamed from: f */
        private boolean f11931f;

        /* renamed from: a */
        private final HashMap f11927a = new HashMap();
        private UUID b = AbstractC0744r2.f10446d;

        /* renamed from: c */
        private x7.c f11928c = k9.f8610d;

        /* renamed from: g */
        private hc f11932g = new e6();

        /* renamed from: e */
        private int[] f11930e = new int[0];

        /* renamed from: h */
        private long f11933h = 300000;

        public b a(boolean z8) {
            this.f11929d = z8;
            return this;
        }

        public b b(boolean z8) {
            this.f11931f = z8;
            return this;
        }

        public b a(int... iArr) {
            for (int i9 : iArr) {
                boolean z8 = true;
                if (i9 != 2 && i9 != 1) {
                    z8 = false;
                }
                AbstractC0669a1.a(z8);
            }
            this.f11930e = (int[]) iArr.clone();
            return this;
        }

        public b a(UUID uuid, x7.c cVar) {
            this.b = (UUID) AbstractC0669a1.a(uuid);
            this.f11928c = (x7.c) AbstractC0669a1.a(cVar);
            return this;
        }

        public w5 a(ld ldVar) {
            return new w5(this.b, this.f11928c, ldVar, this.f11927a, this.f11929d, this.f11930e, this.f11931f, this.f11932g, this.f11933h);
        }
    }

    /* loaded from: classes.dex */
    public class c implements x7.b {
        private c() {
        }

        @Override // com.applovin.impl.x7.b
        public void a(x7 x7Var, byte[] bArr, int i9, int i10, byte[] bArr2) {
            ((d) AbstractC0669a1.a(w5.this.f11926y)).obtainMessage(i9, bArr).sendToTarget();
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
            for (v5 v5Var : w5.this.f11915n) {
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
        private final y6.a b;

        /* renamed from: c */
        private x6 f11936c;

        /* renamed from: d */
        private boolean f11937d;

        public f(y6.a aVar) {
            this.b = aVar;
        }

        public static /* synthetic */ void a(f fVar, d9 d9Var) {
            fVar.b(d9Var);
        }

        public /* synthetic */ void c() {
            if (this.f11937d) {
                return;
            }
            x6 x6Var = this.f11936c;
            if (x6Var != null) {
                x6Var.a(this.b);
            }
            w5.this.f11916o.remove(this);
            this.f11937d = true;
        }

        public /* synthetic */ void b(d9 d9Var) {
            if (w5.this.f11918q == 0 || this.f11937d) {
                return;
            }
            w5 w5Var = w5.this;
            this.f11936c = w5Var.a((Looper) AbstractC0669a1.a(w5Var.f11922u), this.b, d9Var, false);
            w5.this.f11916o.add(this);
        }

        public void a(d9 d9Var) {
            ((Handler) AbstractC0669a1.a(w5.this.f11923v)).post(new F(5, this, d9Var));
        }

        @Override // com.applovin.impl.z6.b
        public void a() {
            yp.a((Handler) AbstractC0669a1.a(w5.this.f11923v), (Runnable) new F0(this, 4));
        }
    }

    /* loaded from: classes.dex */
    public class h implements v5.b {
        private h() {
        }

        public /* synthetic */ h(w5 w5Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.v5.b
        public void a(v5 v5Var, int i9) {
            if (w5.this.m != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                w5.this.f11917p.remove(v5Var);
                ((Handler) AbstractC0669a1.a(w5.this.f11923v)).removeCallbacksAndMessages(v5Var);
            }
        }

        @Override // com.applovin.impl.v5.b
        public void b(v5 v5Var, int i9) {
            if (i9 == 1 && w5.this.f11918q > 0 && w5.this.m != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                w5.this.f11917p.add(v5Var);
                ((Handler) AbstractC0669a1.a(w5.this.f11923v)).postAtTime(new F0(v5Var, 5), v5Var, w5.this.m + SystemClock.uptimeMillis());
            } else if (i9 == 0) {
                w5.this.f11915n.remove(v5Var);
                if (w5.this.f11920s == v5Var) {
                    w5.this.f11920s = null;
                }
                if (w5.this.f11921t == v5Var) {
                    w5.this.f11921t = null;
                }
                w5.this.f11913j.b(v5Var);
                if (w5.this.m != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    ((Handler) AbstractC0669a1.a(w5.this.f11923v)).removeCallbacksAndMessages(v5Var);
                    w5.this.f11917p.remove(v5Var);
                }
            }
            w5.this.c();
        }
    }

    private w5(UUID uuid, x7.c cVar, ld ldVar, HashMap hashMap, boolean z8, int[] iArr, boolean z9, hc hcVar, long j7) {
        AbstractC0669a1.a(uuid);
        AbstractC0669a1.a(!AbstractC0744r2.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f11906c = uuid;
        this.f11907d = cVar;
        this.f11908e = ldVar;
        this.f11909f = hashMap;
        this.f11910g = z8;
        this.f11911h = iArr;
        this.f11912i = z9;
        this.f11914k = hcVar;
        this.f11913j = new g();
        this.l = new h();
        this.f11924w = 0;
        this.f11915n = new ArrayList();
        this.f11916o = nj.b();
        this.f11917p = nj.b();
        this.m = j7;
    }

    public void c() {
        if (this.f11919r != null && this.f11918q == 0 && this.f11915n.isEmpty() && this.f11916o.isEmpty()) {
            ((x7) AbstractC0669a1.a(this.f11919r)).a();
            this.f11919r = null;
        }
    }

    private void d() {
        qp it = eb.a((Collection) this.f11917p).iterator();
        while (it.hasNext()) {
            ((x6) it.next()).a((y6.a) null);
        }
    }

    private void e() {
        qp it = eb.a((Collection) this.f11916o).iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
    }

    private void b(Looper looper) {
        if (this.f11926y == null) {
            this.f11926y = new d(looper);
        }
    }

    @Override // com.applovin.impl.z6
    public x6 a(Looper looper, y6.a aVar, d9 d9Var) {
        AbstractC0669a1.b(this.f11918q > 0);
        a(looper);
        return a(looper, aVar, d9Var, true);
    }

    @Override // com.applovin.impl.z6
    public z6.b b(Looper looper, y6.a aVar, d9 d9Var) {
        AbstractC0669a1.b(this.f11918q > 0);
        a(looper);
        f fVar = new f(aVar);
        fVar.a(d9Var);
        return fVar;
    }

    /* loaded from: classes.dex */
    public class g implements v5.a {

        /* renamed from: a */
        private final Set f11939a = new HashSet();
        private v5 b;

        public g() {
        }

        @Override // com.applovin.impl.v5.a
        public void a() {
            this.b = null;
            ab a6 = ab.a((Collection) this.f11939a);
            this.f11939a.clear();
            qp it = a6.iterator();
            while (it.hasNext()) {
                ((v5) it.next()).i();
            }
        }

        public void b(v5 v5Var) {
            this.f11939a.remove(v5Var);
            if (this.b == v5Var) {
                this.b = null;
                if (!this.f11939a.isEmpty()) {
                    v5 v5Var2 = (v5) this.f11939a.iterator().next();
                    this.b = v5Var2;
                    v5Var2.k();
                }
            }
        }

        @Override // com.applovin.impl.v5.a
        public void a(Exception exc, boolean z8) {
            this.b = null;
            ab a6 = ab.a((Collection) this.f11939a);
            this.f11939a.clear();
            qp it = a6.iterator();
            while (it.hasNext()) {
                ((v5) it.next()).b(exc, z8);
            }
        }

        @Override // com.applovin.impl.v5.a
        public void a(v5 v5Var) {
            this.f11939a.add(v5Var);
            if (this.b != null) {
                return;
            }
            this.b = v5Var;
            v5Var.k();
        }
    }

    public x6 a(Looper looper, y6.a aVar, d9 d9Var, boolean z8) {
        List list;
        b(looper);
        w6 w6Var = d9Var.f7213p;
        if (w6Var == null) {
            return a(df.e(d9Var.m), z8);
        }
        v5 v5Var = null;
        if (this.f11925x == null) {
            list = a((w6) AbstractC0669a1.a(w6Var), this.f11906c, false);
            if (list.isEmpty()) {
                e eVar = new e(this.f11906c);
                kc.a("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.a(eVar);
                }
                return new s7(new x6.a(eVar, 6003));
            }
        } else {
            list = null;
        }
        if (!this.f11910g) {
            v5Var = this.f11921t;
        } else {
            Iterator it = this.f11915n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                v5 v5Var2 = (v5) it.next();
                if (yp.a(v5Var2.f11672a, list)) {
                    v5Var = v5Var2;
                    break;
                }
            }
        }
        if (v5Var == null) {
            v5Var = a(list, false, aVar, z8);
            if (!this.f11910g) {
                this.f11921t = v5Var;
            }
            this.f11915n.add(v5Var);
        } else {
            v5Var.b(aVar);
        }
        return v5Var;
    }

    @Override // com.applovin.impl.z6
    public final void b() {
        int i9 = this.f11918q;
        this.f11918q = i9 + 1;
        if (i9 != 0) {
            return;
        }
        if (this.f11919r == null) {
            x7 a6 = this.f11907d.a(this.f11906c);
            this.f11919r = a6;
            a6.a(new c());
        } else if (this.m != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            for (int i10 = 0; i10 < this.f11915n.size(); i10++) {
                ((v5) this.f11915n.get(i10)).b(null);
            }
        }
    }

    public /* synthetic */ w5(UUID uuid, x7.c cVar, ld ldVar, HashMap hashMap, boolean z8, int[] iArr, boolean z9, hc hcVar, long j7, a aVar) {
        this(uuid, cVar, ldVar, hashMap, z8, iArr, z9, hcVar, j7);
    }

    private static boolean a(x6 x6Var) {
        return x6Var.b() == 1 && (yp.f12451a < 19 || (((x6.a) AbstractC0669a1.a(x6Var.getError())).getCause() instanceof ResourceBusyException));
    }

    private boolean a(w6 w6Var) {
        if (this.f11925x != null) {
            return true;
        }
        if (a(w6Var, this.f11906c, true).isEmpty()) {
            if (w6Var.f11944d != 1 || !w6Var.a(0).a(AbstractC0744r2.b)) {
                return false;
            }
            kc.d("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f11906c);
        }
        String str = w6Var.f11943c;
        if (str == null || com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cenc.equals(str)) {
            return true;
        }
        return com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cbcs.equals(str) ? yp.f12451a >= 25 : (com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cbc1.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cens.equals(str)) ? false : true;
    }

    private v5 a(List list, boolean z8, y6.a aVar) {
        AbstractC0669a1.a(this.f11919r);
        v5 v5Var = new v5(this.f11906c, this.f11919r, this.f11913j, this.l, list, this.f11924w, this.f11912i | z8, z8, this.f11925x, this.f11909f, this.f11908e, (Looper) AbstractC0669a1.a(this.f11922u), this.f11914k);
        v5Var.b(aVar);
        if (this.m != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            v5Var.b(null);
        }
        return v5Var;
    }

    private v5 a(List list, boolean z8, y6.a aVar, boolean z9) {
        v5 a6 = a(list, z8, aVar);
        if (a(a6) && !this.f11917p.isEmpty()) {
            d();
            a(a6, aVar);
            a6 = a(list, z8, aVar);
        }
        if (!a(a6) || !z9 || this.f11916o.isEmpty()) {
            return a6;
        }
        e();
        if (!this.f11917p.isEmpty()) {
            d();
        }
        a(a6, aVar);
        return a(list, z8, aVar);
    }

    @Override // com.applovin.impl.z6
    public int a(d9 d9Var) {
        int c9 = ((x7) AbstractC0669a1.a(this.f11919r)).c();
        w6 w6Var = d9Var.f7213p;
        if (w6Var == null) {
            if (yp.a(this.f11911h, df.e(d9Var.m)) != -1) {
                return c9;
            }
            return 0;
        }
        if (a(w6Var)) {
            return c9;
        }
        return 1;
    }

    private synchronized void a(Looper looper) {
        try {
            Looper looper2 = this.f11922u;
            if (looper2 == null) {
                this.f11922u = looper;
                this.f11923v = new Handler(looper);
            } else {
                AbstractC0669a1.b(looper2 == looper);
                AbstractC0669a1.a(this.f11923v);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private x6 a(int i9, boolean z8) {
        x7 x7Var = (x7) AbstractC0669a1.a(this.f11919r);
        if ((x7Var.c() == 2 && j9.f8418d) || yp.a(this.f11911h, i9) == -1 || x7Var.c() == 1) {
            return null;
        }
        v5 v5Var = this.f11920s;
        if (v5Var == null) {
            v5 a6 = a((List) ab.h(), true, (y6.a) null, z8);
            this.f11915n.add(a6);
            this.f11920s = a6;
        } else {
            v5Var.b(null);
        }
        return this.f11920s;
    }

    @Override // com.applovin.impl.z6
    public final void a() {
        int i9 = this.f11918q - 1;
        this.f11918q = i9;
        if (i9 != 0) {
            return;
        }
        if (this.m != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            ArrayList arrayList = new ArrayList(this.f11915n);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((v5) arrayList.get(i10)).a((y6.a) null);
            }
        }
        e();
        c();
    }

    public void a(int i9, byte[] bArr) {
        AbstractC0669a1.b(this.f11915n.isEmpty());
        if (i9 == 1 || i9 == 3) {
            AbstractC0669a1.a(bArr);
        }
        this.f11924w = i9;
        this.f11925x = bArr;
    }

    private void a(x6 x6Var, y6.a aVar) {
        x6Var.a(aVar);
        if (this.m != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            x6Var.a((y6.a) null);
        }
    }

    private static List a(w6 w6Var, UUID uuid, boolean z8) {
        ArrayList arrayList = new ArrayList(w6Var.f11944d);
        for (int i9 = 0; i9 < w6Var.f11944d; i9++) {
            w6.b a6 = w6Var.a(i9);
            if ((a6.a(uuid) || (AbstractC0744r2.f10445c.equals(uuid) && a6.a(AbstractC0744r2.b))) && (a6.f11948f != null || z8)) {
                arrayList.add(a6);
            }
        }
        return arrayList;
    }
}
