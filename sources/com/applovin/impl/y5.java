package com.applovin.impl;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.applovin.impl.a7;
import com.applovin.impl.b7;
import com.applovin.impl.x5;
import com.applovin.impl.y6;
import com.applovin.impl.z6;
import com.applovin.impl.z7;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes2.dex */
public class y5 implements b7 {

    /* renamed from: c */
    private final UUID f28078c;
    private final z7.c d;
    private final qd e;

    /* renamed from: f */
    private final HashMap f28079f;

    /* renamed from: g */
    private final boolean f28080g;

    /* renamed from: h */
    private final int[] f28081h;

    /* renamed from: i */
    private final boolean f28082i;

    /* renamed from: j */
    private final g f28083j;

    /* renamed from: k */
    private final mc f28084k;

    /* renamed from: l */
    private final h f28085l;

    /* renamed from: m */
    private final long f28086m;

    /* renamed from: n */
    private final List f28087n;

    /* renamed from: o */
    private final Set f28088o;

    /* renamed from: p */
    private final Set f28089p;

    /* renamed from: q */
    private int f28090q;

    /* renamed from: r */
    private z7 f28091r;

    /* renamed from: s */
    private x5 f28092s;

    /* renamed from: t */
    private x5 f28093t;

    /* renamed from: u */
    private Looper f28094u;

    /* renamed from: v */
    private Handler f28095v;
    private int w;
    private byte[] x;

    /* renamed from: y */
    volatile d f28096y;

    /* loaded from: classes2.dex */
    public static final class b {
        private boolean d;

        /* renamed from: f */
        private boolean f28100f;

        /* renamed from: a */
        private final HashMap f28097a = new HashMap();

        /* renamed from: b */
        private UUID f28098b = t2.d;

        /* renamed from: c */
        private z7.c f28099c = m9.d;

        /* renamed from: g */
        private mc f28101g = new g6();
        private int[] e = new int[0];

        /* renamed from: h */
        private long f28102h = 300000;

        public b a(boolean z2) {
            this.d = z2;
            return this;
        }

        public b b(boolean z2) {
            this.f28100f = z2;
            return this;
        }

        public b a(int... iArr) {
            for (int i2 : iArr) {
                boolean z2 = true;
                if (i2 != 2 && i2 != 1) {
                    z2 = false;
                }
                b1.a(z2);
            }
            this.e = (int[]) iArr.clone();
            return this;
        }

        public b a(UUID uuid, z7.c cVar) {
            this.f28098b = (UUID) b1.a(uuid);
            this.f28099c = (z7.c) b1.a(cVar);
            return this;
        }

        public y5 a(qd qdVar) {
            return new y5(this.f28098b, this.f28099c, qdVar, this.f28097a, this.d, this.e, this.f28100f, this.f28101g, this.f28102h);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements z7.b {
        private c() {
        }

        @Override // com.applovin.impl.z7.b
        public void a(z7 z7Var, byte[] bArr, int i2, int i3, byte[] bArr2) {
            ((d) b1.a(y5.this.f28096y)).obtainMessage(i2, bArr).sendToTarget();
        }

        public /* synthetic */ c(y5 y5Var, a aVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
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
            for (x5 x5Var : y5.this.f28087n) {
                if (x5Var.a(bArr)) {
                    x5Var.a(message.what);
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends Exception {
        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }

        public /* synthetic */ e(UUID uuid, a aVar) {
            this(uuid);
        }
    }

    /* loaded from: classes2.dex */
    public class f implements b7.b {

        /* renamed from: b */
        private final a7.a f28105b;

        /* renamed from: c */
        private z6 f28106c;
        private boolean d;

        public f(a7.a aVar) {
            this.f28105b = aVar;
        }

        public static /* synthetic */ void a(f fVar, f9 f9Var) {
            fVar.b(f9Var);
        }

        public /* synthetic */ void c() {
            if (this.d) {
                return;
            }
            z6 z6Var = this.f28106c;
            if (z6Var != null) {
                z6Var.a(this.f28105b);
            }
            y5.this.f28088o.remove(this);
            this.d = true;
        }

        public /* synthetic */ void b(f9 f9Var) {
            if (y5.this.f28090q == 0 || this.d) {
                return;
            }
            y5 y5Var = y5.this;
            this.f28106c = y5Var.a((Looper) b1.a(y5Var.f28094u), this.f28105b, f9Var, false);
            y5.this.f28088o.add(this);
        }

        public void a(f9 f9Var) {
            ((Handler) b1.a(y5.this.f28095v)).post(new ms(6, this, f9Var));
        }

        @Override // com.applovin.impl.b7.b
        public void a() {
            xp.a((Handler) b1.a(y5.this.f28095v), (Runnable) new mt(this, 4));
        }
    }

    /* loaded from: classes2.dex */
    public class h implements x5.b {
        private h() {
        }

        public /* synthetic */ h(y5 y5Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.x5.b
        public void a(x5 x5Var, int i2) {
            if (y5.this.f28086m != -9223372036854775807L) {
                y5.this.f28089p.remove(x5Var);
                ((Handler) b1.a(y5.this.f28095v)).removeCallbacksAndMessages(x5Var);
            }
        }

        @Override // com.applovin.impl.x5.b
        public void b(x5 x5Var, int i2) {
            if (i2 == 1 && y5.this.f28090q > 0 && y5.this.f28086m != -9223372036854775807L) {
                y5.this.f28089p.add(x5Var);
                ((Handler) b1.a(y5.this.f28095v)).postAtTime(new mt(x5Var, 5), x5Var, y5.this.f28086m + SystemClock.uptimeMillis());
            } else if (i2 == 0) {
                y5.this.f28087n.remove(x5Var);
                if (y5.this.f28092s == x5Var) {
                    y5.this.f28092s = null;
                }
                if (y5.this.f28093t == x5Var) {
                    y5.this.f28093t = null;
                }
                y5.this.f28083j.b(x5Var);
                if (y5.this.f28086m != -9223372036854775807L) {
                    ((Handler) b1.a(y5.this.f28095v)).removeCallbacksAndMessages(x5Var);
                    y5.this.f28089p.remove(x5Var);
                }
            }
            y5.this.c();
        }
    }

    private y5(UUID uuid, z7.c cVar, qd qdVar, HashMap hashMap, boolean z2, int[] iArr, boolean z3, mc mcVar, long j2) {
        b1.a(uuid);
        b1.a(!t2.f27006b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f28078c = uuid;
        this.d = cVar;
        this.e = qdVar;
        this.f28079f = hashMap;
        this.f28080g = z2;
        this.f28081h = iArr;
        this.f28082i = z3;
        this.f28084k = mcVar;
        this.f28083j = new g();
        this.f28085l = new h();
        this.w = 0;
        this.f28087n = new ArrayList();
        this.f28088o = rj.b();
        this.f28089p = rj.b();
        this.f28086m = j2;
    }

    public void c() {
        if (this.f28091r != null && this.f28090q == 0 && this.f28087n.isEmpty() && this.f28088o.isEmpty()) {
            ((z7) b1.a(this.f28091r)).a();
            this.f28091r = null;
        }
    }

    private void d() {
        pp it = ib.a((Collection) this.f28089p).iterator();
        while (it.hasNext()) {
            ((z6) it.next()).a((a7.a) null);
        }
    }

    private void e() {
        pp it = ib.a((Collection) this.f28088o).iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
    }

    private void b(Looper looper) {
        if (this.f28096y == null) {
            this.f28096y = new d(looper);
        }
    }

    /* loaded from: classes2.dex */
    public class g implements x5.a {

        /* renamed from: a */
        private final Set f28107a = new HashSet();

        /* renamed from: b */
        private x5 f28108b;

        public g() {
        }

        @Override // com.applovin.impl.x5.a
        public void a() {
            this.f28108b = null;
            eb a2 = eb.a((Collection) this.f28107a);
            this.f28107a.clear();
            pp it = a2.iterator();
            while (it.hasNext()) {
                ((x5) it.next()).i();
            }
        }

        public void b(x5 x5Var) {
            this.f28107a.remove(x5Var);
            if (this.f28108b == x5Var) {
                this.f28108b = null;
                if (this.f28107a.isEmpty()) {
                    return;
                }
                x5 x5Var2 = (x5) this.f28107a.iterator().next();
                this.f28108b = x5Var2;
                x5Var2.k();
            }
        }

        @Override // com.applovin.impl.x5.a
        public void a(Exception exc, boolean z2) {
            this.f28108b = null;
            eb a2 = eb.a((Collection) this.f28107a);
            this.f28107a.clear();
            pp it = a2.iterator();
            while (it.hasNext()) {
                ((x5) it.next()).b(exc, z2);
            }
        }

        @Override // com.applovin.impl.x5.a
        public void a(x5 x5Var) {
            this.f28107a.add(x5Var);
            if (this.f28108b != null) {
                return;
            }
            this.f28108b = x5Var;
            x5Var.k();
        }
    }

    @Override // com.applovin.impl.b7
    public z6 a(Looper looper, a7.a aVar, f9 f9Var) {
        b1.b(this.f28090q > 0);
        a(looper);
        return a(looper, aVar, f9Var, true);
    }

    @Override // com.applovin.impl.b7
    public b7.b b(Looper looper, a7.a aVar, f9 f9Var) {
        b1.b(this.f28090q > 0);
        a(looper);
        f fVar = new f(aVar);
        fVar.a(f9Var);
        return fVar;
    }

    public z6 a(Looper looper, a7.a aVar, f9 f9Var, boolean z2) {
        List list;
        b(looper);
        y6 y6Var = f9Var.f23843p;
        if (y6Var == null) {
            return a(Cif.e(f9Var.f23840m), z2);
        }
        x5 x5Var = null;
        if (this.x == null) {
            list = a((y6) b1.a(y6Var), this.f28078c, false);
            if (list.isEmpty()) {
                e eVar = new e(this.f28078c);
                pc.a("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.a(eVar);
                }
                return new u7(new z6.a(eVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            list = null;
        }
        if (this.f28080g) {
            Iterator it = this.f28087n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                x5 x5Var2 = (x5) it.next();
                if (xp.a(x5Var2.f27838a, list)) {
                    x5Var = x5Var2;
                    break;
                }
            }
        } else {
            x5Var = this.f28093t;
        }
        if (x5Var == null) {
            x5Var = a(list, false, aVar, z2);
            if (!this.f28080g) {
                this.f28093t = x5Var;
            }
            this.f28087n.add(x5Var);
        } else {
            x5Var.b(aVar);
        }
        return x5Var;
    }

    @Override // com.applovin.impl.b7
    public final void b() {
        int i2 = this.f28090q;
        this.f28090q = i2 + 1;
        if (i2 != 0) {
            return;
        }
        if (this.f28091r == null) {
            z7 a2 = this.d.a(this.f28078c);
            this.f28091r = a2;
            a2.a(new c());
        } else if (this.f28086m != -9223372036854775807L) {
            for (int i3 = 0; i3 < this.f28087n.size(); i3++) {
                ((x5) this.f28087n.get(i3)).b(null);
            }
        }
    }

    public /* synthetic */ y5(UUID uuid, z7.c cVar, qd qdVar, HashMap hashMap, boolean z2, int[] iArr, boolean z3, mc mcVar, long j2, a aVar) {
        this(uuid, cVar, qdVar, hashMap, z2, iArr, z3, mcVar, j2);
    }

    private static boolean a(z6 z6Var) {
        return z6Var.b() == 1 && (xp.f27962a < 19 || (((z6.a) b1.a(z6Var.getError())).getCause() instanceof ResourceBusyException));
    }

    private boolean a(y6 y6Var) {
        if (this.x != null) {
            return true;
        }
        if (a(y6Var, this.f28078c, true).isEmpty()) {
            if (y6Var.d != 1 || !y6Var.a(0).a(t2.f27006b)) {
                return false;
            }
            pc.d("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f28078c);
        }
        String str = y6Var.f28113c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? xp.f27962a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private x5 a(List list, boolean z2, a7.a aVar) {
        b1.a(this.f28091r);
        x5 x5Var = new x5(this.f28078c, this.f28091r, this.f28083j, this.f28085l, list, this.w, this.f28082i | z2, z2, this.x, this.f28079f, this.e, (Looper) b1.a(this.f28094u), this.f28084k);
        x5Var.b(aVar);
        if (this.f28086m != -9223372036854775807L) {
            x5Var.b(null);
        }
        return x5Var;
    }

    private x5 a(List list, boolean z2, a7.a aVar, boolean z3) {
        x5 a2 = a(list, z2, aVar);
        if (a(a2) && !this.f28089p.isEmpty()) {
            d();
            a(a2, aVar);
            a2 = a(list, z2, aVar);
        }
        if (!a(a2) || !z3 || this.f28088o.isEmpty()) {
            return a2;
        }
        e();
        if (!this.f28089p.isEmpty()) {
            d();
        }
        a(a2, aVar);
        return a(list, z2, aVar);
    }

    @Override // com.applovin.impl.b7
    public int a(f9 f9Var) {
        int c2 = ((z7) b1.a(this.f28091r)).c();
        y6 y6Var = f9Var.f23843p;
        if (y6Var == null) {
            if (xp.a(this.f28081h, Cif.e(f9Var.f23840m)) != -1) {
                return c2;
            }
            return 0;
        }
        if (a(y6Var)) {
            return c2;
        }
        return 1;
    }

    private synchronized void a(Looper looper) {
        try {
            Looper looper2 = this.f28094u;
            if (looper2 == null) {
                this.f28094u = looper;
                this.f28095v = new Handler(looper);
            } else {
                b1.b(looper2 == looper);
                b1.a(this.f28095v);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private z6 a(int i2, boolean z2) {
        z7 z7Var = (z7) b1.a(this.f28091r);
        if ((z7Var.c() == 2 && l9.d) || xp.a(this.f28081h, i2) == -1 || z7Var.c() == 1) {
            return null;
        }
        x5 x5Var = this.f28092s;
        if (x5Var == null) {
            x5 a2 = a((List) eb.h(), true, (a7.a) null, z2);
            this.f28087n.add(a2);
            this.f28092s = a2;
        } else {
            x5Var.b(null);
        }
        return this.f28092s;
    }

    @Override // com.applovin.impl.b7
    public final void a() {
        int i2 = this.f28090q - 1;
        this.f28090q = i2;
        if (i2 != 0) {
            return;
        }
        if (this.f28086m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f28087n);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((x5) arrayList.get(i3)).a((a7.a) null);
            }
        }
        e();
        c();
    }

    public void a(int i2, byte[] bArr) {
        b1.b(this.f28087n.isEmpty());
        if (i2 == 1 || i2 == 3) {
            b1.a(bArr);
        }
        this.w = i2;
        this.x = bArr;
    }

    private void a(z6 z6Var, a7.a aVar) {
        z6Var.a(aVar);
        if (this.f28086m != -9223372036854775807L) {
            z6Var.a((a7.a) null);
        }
    }

    private static List a(y6 y6Var, UUID uuid, boolean z2) {
        ArrayList arrayList = new ArrayList(y6Var.d);
        for (int i2 = 0; i2 < y6Var.d; i2++) {
            y6.b a2 = y6Var.a(i2);
            if ((a2.a(uuid) || (t2.f27007c.equals(uuid) && a2.a(t2.f27006b))) && (a2.f28117f != null || z2)) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
