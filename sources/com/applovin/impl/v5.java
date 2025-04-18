package com.applovin.impl;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.impl.hc;
import com.applovin.impl.x6;
import com.applovin.impl.x7;
import com.applovin.impl.y6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class v5 implements x6 {
    public final List a;

    /* renamed from: b */
    private final x7 f8464b;

    /* renamed from: c */
    private final a f8465c;

    /* renamed from: d */
    private final b f8466d;

    /* renamed from: e */
    private final int f8467e;

    /* renamed from: f */
    private final boolean f8468f;

    /* renamed from: g */
    private final boolean f8469g;

    /* renamed from: h */
    private final HashMap f8470h;

    /* renamed from: i */
    private final s4 f8471i;

    /* renamed from: j */
    private final hc f8472j;

    /* renamed from: k */
    final ld f8473k;

    /* renamed from: l */
    final UUID f8474l;

    /* renamed from: m */
    final e f8475m;

    /* renamed from: n */
    private int f8476n;

    /* renamed from: o */
    private int f8477o;

    /* renamed from: p */
    private HandlerThread f8478p;

    /* renamed from: q */
    private c f8479q;

    /* renamed from: r */
    private x4 f8480r;

    /* renamed from: s */
    private x6.a f8481s;

    /* renamed from: t */
    private byte[] f8482t;
    private byte[] u;

    /* renamed from: v */
    private x7.a f8483v;

    /* renamed from: w */
    private x7.d f8484w;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(v5 v5Var);

        void a(Exception exc, boolean z10);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(v5 v5Var, int i10);

        void b(v5 v5Var, int i10);
    }

    /* loaded from: classes.dex */
    public static final class d {
        public final long a;

        /* renamed from: b */
        public final boolean f8486b;

        /* renamed from: c */
        public final long f8487c;

        /* renamed from: d */
        public final Object f8488d;

        /* renamed from: e */
        public int f8489e;

        public d(long j3, boolean z10, long j10, Object obj) {
            this.a = j3;
            this.f8486b = z10;
            this.f8487c = j10;
            this.f8488d = obj;
        }
    }

    /* loaded from: classes.dex */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                v5.this.b(obj, obj2);
            } else if (i10 == 1) {
                v5.this.a(obj, obj2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends IOException {
        public f(Throwable th2) {
            super(th2);
        }
    }

    public v5(UUID uuid, x7 x7Var, a aVar, b bVar, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, ld ldVar, Looper looper, hc hcVar) {
        if (i10 == 1 || i10 == 3) {
            a1.a(bArr);
        }
        this.f8474l = uuid;
        this.f8465c = aVar;
        this.f8466d = bVar;
        this.f8464b = x7Var;
        this.f8467e = i10;
        this.f8468f = z10;
        this.f8469g = z11;
        if (bArr != null) {
            this.u = bArr;
            this.a = null;
        } else {
            this.a = Collections.unmodifiableList((List) a1.a(list));
        }
        this.f8470h = hashMap;
        this.f8473k = ldVar;
        this.f8471i = new s4();
        this.f8472j = hcVar;
        this.f8476n = 2;
        this.f8475m = new e(looper);
    }

    public static /* synthetic */ void c(Exception exc, y6.a aVar) {
        aVar.a(exc);
    }

    private boolean g() {
        int i10 = this.f8476n;
        return i10 == 3 || i10 == 4;
    }

    private void h() {
        if (this.f8467e == 0 && this.f8476n == 4) {
            yp.a((Object) this.f8482t);
            a(false);
        }
    }

    private boolean j() {
        if (g()) {
            return true;
        }
        try {
            byte[] d10 = this.f8464b.d();
            this.f8482t = d10;
            this.f8480r = this.f8464b.d(d10);
            this.f8476n = 3;
            a(new qs(3));
            a1.a(this.f8482t);
            return true;
        } catch (NotProvisionedException unused) {
            this.f8465c.a(this);
            return false;
        } catch (Exception e2) {
            a(e2, 1);
            return false;
        }
    }

    private boolean l() {
        try {
            this.f8464b.a(this.f8482t, this.u);
            return true;
        } catch (Exception e2) {
            a(e2, 1);
            return false;
        }
    }

    @Override // com.applovin.impl.x6
    public Map d() {
        byte[] bArr = this.f8482t;
        if (bArr == null) {
            return null;
        }
        return this.f8464b.b(bArr);
    }

    @Override // com.applovin.impl.x6
    public final UUID e() {
        return this.f8474l;
    }

    @Override // com.applovin.impl.x6
    public final x4 f() {
        return this.f8480r;
    }

    @Override // com.applovin.impl.x6
    public final x6.a getError() {
        if (this.f8476n == 1) {
            return this.f8481s;
        }
        return null;
    }

    public void i() {
        if (j()) {
            a(true);
        }
    }

    public void k() {
        this.f8484w = this.f8464b.b();
        ((c) yp.a(this.f8479q)).a(0, a1.a(this.f8484w), true);
    }

    @Override // com.applovin.impl.x6
    public boolean c() {
        return this.f8468f;
    }

    private void a(p4 p4Var) {
        Iterator it = this.f8471i.a().iterator();
        while (it.hasNext()) {
            p4Var.accept((y6.a) it.next());
        }
    }

    @Override // com.applovin.impl.x6
    public void b(y6.a aVar) {
        a1.b(this.f8477o >= 0);
        if (aVar != null) {
            this.f8471i.a(aVar);
        }
        int i10 = this.f8477o + 1;
        this.f8477o = i10;
        if (i10 == 1) {
            a1.b(this.f8476n == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f8478p = handlerThread;
            handlerThread.start();
            this.f8479q = new c(this.f8478p.getLooper());
            if (j()) {
                a(true);
            }
        } else if (aVar != null && g() && this.f8471i.b(aVar) == 1) {
            aVar.a(this.f8476n);
        }
        this.f8466d.a(this, this.f8477o);
    }

    private void a(boolean z10) {
        if (this.f8469g) {
            return;
        }
        byte[] bArr = (byte[]) yp.a((Object) this.f8482t);
        int i10 = this.f8467e;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.u == null || l()) {
                    a(bArr, 2, z10);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            a1.a(this.u);
            a1.a(this.f8482t);
            a(this.u, 3, z10);
            return;
        }
        if (this.u == null) {
            a(bArr, 1, z10);
            return;
        }
        if (this.f8476n == 4 || l()) {
            long a10 = a();
            if (this.f8467e == 0 && a10 <= 60) {
                kc.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + a10);
                a(bArr, 2, z10);
                return;
            }
            if (a10 <= 0) {
                a(new ub(), 2);
            } else {
                this.f8476n = 4;
                a(new lu(11));
            }
        }
    }

    @Override // com.applovin.impl.x6
    public final int b() {
        return this.f8476n;
    }

    public void b(Exception exc, boolean z10) {
        a(exc, z10 ? 1 : 3);
    }

    public void b(Object obj, Object obj2) {
        if (obj == this.f8484w) {
            if (this.f8476n == 2 || g()) {
                this.f8484w = null;
                if (obj2 instanceof Exception) {
                    this.f8465c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f8464b.a((byte[]) obj2);
                    this.f8465c.a();
                } catch (Exception e2) {
                    this.f8465c.a(e2, true);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends Handler {
        private boolean a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, md mdVar) {
            IOException fVar;
            d dVar = (d) message.obj;
            if (!dVar.f8486b) {
                return false;
            }
            int i10 = dVar.f8489e + 1;
            dVar.f8489e = i10;
            if (i10 > v5.this.f8472j.a(3)) {
                return false;
            }
            ic icVar = new ic(dVar.a, mdVar.a, mdVar.f5956b, mdVar.f5957c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f8487c, mdVar.f5958d);
            pd pdVar = new pd(3);
            if (mdVar.getCause() instanceof IOException) {
                fVar = (IOException) mdVar.getCause();
            } else {
                fVar = new f(mdVar.getCause());
            }
            long a = v5.this.f8472j.a(new hc.a(icVar, pdVar, fVar, dVar.f8489e));
            if (a == C.TIME_UNSET) {
                return false;
            }
            synchronized (this) {
                if (this.a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), a);
                return true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Throwable th2;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 != 0) {
                    if (i10 == 1) {
                        v5 v5Var = v5.this;
                        th2 = v5Var.f8473k.a(v5Var.f8474l, (x7.a) dVar.f8488d);
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    v5 v5Var2 = v5.this;
                    th2 = v5Var2.f8473k.a(v5Var2.f8474l, (x7.d) dVar.f8488d);
                }
            } catch (md e2) {
                boolean a = a(message, e2);
                th2 = e2;
                if (a) {
                    return;
                }
            } catch (Exception e10) {
                kc.c("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e10);
                th2 = e10;
            }
            v5.this.f8472j.a(dVar.a);
            synchronized (this) {
                if (!this.a) {
                    v5.this.f8475m.obtainMessage(message.what, Pair.create(dVar.f8488d, th2)).sendToTarget();
                }
            }
        }

        public void a(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(ic.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void a() {
            removeCallbacksAndMessages(null);
            this.a = true;
        }
    }

    public boolean a(byte[] bArr) {
        return Arrays.equals(this.f8482t, bArr);
    }

    private void a(Exception exc, int i10) {
        this.f8481s = new x6.a(exc, b7.a(exc, i10));
        kc.a("DefaultDrmSession", "DRM session error", exc);
        a(new js(exc, 3));
        if (this.f8476n != 4) {
            this.f8476n = 1;
        }
    }

    public void a(Object obj, Object obj2) {
        if (obj == this.f8483v && g()) {
            this.f8483v = null;
            if (obj2 instanceof Exception) {
                a((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f8467e == 3) {
                    this.f8464b.b((byte[]) yp.a((Object) this.u), bArr);
                    a(new lu(12));
                    return;
                }
                byte[] b3 = this.f8464b.b(this.f8482t, bArr);
                int i10 = this.f8467e;
                if ((i10 == 2 || (i10 == 0 && this.u != null)) && b3 != null && b3.length != 0) {
                    this.u = b3;
                }
                this.f8476n = 4;
                a(new lu(13));
            } catch (Exception e2) {
                a(e2, true);
            }
        }
    }

    private void a(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f8465c.a(this);
        } else {
            a(exc, z10 ? 1 : 2);
        }
    }

    public void a(int i10) {
        if (i10 != 2) {
            return;
        }
        h();
    }

    private void a(byte[] bArr, int i10, boolean z10) {
        try {
            this.f8483v = this.f8464b.a(bArr, this.a, i10, this.f8470h);
            ((c) yp.a(this.f8479q)).a(1, a1.a(this.f8483v), z10);
        } catch (Exception e2) {
            a(e2, true);
        }
    }

    @Override // com.applovin.impl.x6
    public void a(y6.a aVar) {
        a1.b(this.f8477o > 0);
        int i10 = this.f8477o - 1;
        this.f8477o = i10;
        if (i10 == 0) {
            this.f8476n = 0;
            ((e) yp.a(this.f8475m)).removeCallbacksAndMessages(null);
            ((c) yp.a(this.f8479q)).a();
            this.f8479q = null;
            ((HandlerThread) yp.a(this.f8478p)).quit();
            this.f8478p = null;
            this.f8480r = null;
            this.f8481s = null;
            this.f8483v = null;
            this.f8484w = null;
            byte[] bArr = this.f8482t;
            if (bArr != null) {
                this.f8464b.c(bArr);
                this.f8482t = null;
            }
        }
        if (aVar != null) {
            this.f8471i.c(aVar);
            if (this.f8471i.b(aVar) == 0) {
                aVar.d();
            }
        }
        this.f8466d.b(this, this.f8477o);
    }

    @Override // com.applovin.impl.x6
    public boolean a(String str) {
        return this.f8464b.a((byte[]) a1.b(this.f8482t), str);
    }

    private long a() {
        if (!r2.f7312d.equals(this.f8474l)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) a1.a(cs.a(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }
}
