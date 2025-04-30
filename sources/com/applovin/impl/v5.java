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

    /* renamed from: a */
    public final List f11672a;
    private final x7 b;

    /* renamed from: c */
    private final a f11673c;

    /* renamed from: d */
    private final b f11674d;

    /* renamed from: e */
    private final int f11675e;

    /* renamed from: f */
    private final boolean f11676f;

    /* renamed from: g */
    private final boolean f11677g;

    /* renamed from: h */
    private final HashMap f11678h;

    /* renamed from: i */
    private final s4 f11679i;

    /* renamed from: j */
    private final hc f11680j;

    /* renamed from: k */
    final ld f11681k;
    final UUID l;
    final e m;

    /* renamed from: n */
    private int f11682n;

    /* renamed from: o */
    private int f11683o;

    /* renamed from: p */
    private HandlerThread f11684p;

    /* renamed from: q */
    private c f11685q;

    /* renamed from: r */
    private x4 f11686r;

    /* renamed from: s */
    private x6.a f11687s;

    /* renamed from: t */
    private byte[] f11688t;

    /* renamed from: u */
    private byte[] f11689u;

    /* renamed from: v */
    private x7.a f11690v;

    /* renamed from: w */
    private x7.d f11691w;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(v5 v5Var);

        void a(Exception exc, boolean z8);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(v5 v5Var, int i9);

        void b(v5 v5Var, int i9);
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final long f11693a;
        public final boolean b;

        /* renamed from: c */
        public final long f11694c;

        /* renamed from: d */
        public final Object f11695d;

        /* renamed from: e */
        public int f11696e;

        public d(long j7, boolean z8, long j9, Object obj) {
            this.f11693a = j7;
            this.b = z8;
            this.f11694c = j9;
            this.f11695d = obj;
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
            int i9 = message.what;
            if (i9 == 0) {
                v5.this.b(obj, obj2);
            } else if (i9 == 1) {
                v5.this.a(obj, obj2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public v5(UUID uuid, x7 x7Var, a aVar, b bVar, List list, int i9, boolean z8, boolean z9, byte[] bArr, HashMap hashMap, ld ldVar, Looper looper, hc hcVar) {
        if (i9 == 1 || i9 == 3) {
            AbstractC0669a1.a(bArr);
        }
        this.l = uuid;
        this.f11673c = aVar;
        this.f11674d = bVar;
        this.b = x7Var;
        this.f11675e = i9;
        this.f11676f = z8;
        this.f11677g = z9;
        if (bArr != null) {
            this.f11689u = bArr;
            this.f11672a = null;
        } else {
            this.f11672a = Collections.unmodifiableList((List) AbstractC0669a1.a(list));
        }
        this.f11678h = hashMap;
        this.f11681k = ldVar;
        this.f11679i = new s4();
        this.f11680j = hcVar;
        this.f11682n = 2;
        this.m = new e(looper);
    }

    public static /* synthetic */ void c(y6.a aVar) {
        aVar.a(3);
    }

    public static /* synthetic */ void d(Exception exc, y6.a aVar) {
        aVar.a(exc);
    }

    private boolean g() {
        int i9 = this.f11682n;
        if (i9 != 3 && i9 != 4) {
            return false;
        }
        return true;
    }

    private void h() {
        if (this.f11675e == 0 && this.f11682n == 4) {
            yp.a((Object) this.f11688t);
            a(false);
        }
    }

    private boolean j() {
        if (g()) {
            return true;
        }
        try {
            byte[] d2 = this.b.d();
            this.f11688t = d2;
            this.f11686r = this.b.d(d2);
            this.f11682n = 3;
            a(new I(3));
            AbstractC0669a1.a(this.f11688t);
            return true;
        } catch (NotProvisionedException unused) {
            this.f11673c.a(this);
            return false;
        } catch (Exception e4) {
            a(e4, 1);
            return false;
        }
    }

    private boolean l() {
        try {
            this.b.a(this.f11688t, this.f11689u);
            return true;
        } catch (Exception e4) {
            a(e4, 1);
            return false;
        }
    }

    @Override // com.applovin.impl.x6
    public final UUID e() {
        return this.l;
    }

    @Override // com.applovin.impl.x6
    public final x4 f() {
        return this.f11686r;
    }

    @Override // com.applovin.impl.x6
    public final x6.a getError() {
        if (this.f11682n == 1) {
            return this.f11687s;
        }
        return null;
    }

    public void i() {
        if (j()) {
            a(true);
        }
    }

    public void k() {
        this.f11691w = this.b.b();
        ((c) yp.a(this.f11685q)).a(0, AbstractC0669a1.a(this.f11691w), true);
    }

    @Override // com.applovin.impl.x6
    public void b(y6.a aVar) {
        AbstractC0669a1.b(this.f11683o >= 0);
        if (aVar != null) {
            this.f11679i.a(aVar);
        }
        int i9 = this.f11683o + 1;
        this.f11683o = i9;
        if (i9 == 1) {
            AbstractC0669a1.b(this.f11682n == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f11684p = handlerThread;
            handlerThread.start();
            this.f11685q = new c(this.f11684p.getLooper());
            if (j()) {
                a(true);
            }
        } else if (aVar != null && g() && this.f11679i.b(aVar) == 1) {
            aVar.a(this.f11682n);
        }
        this.f11674d.a(this, this.f11683o);
    }

    @Override // com.applovin.impl.x6
    public boolean c() {
        return this.f11676f;
    }

    @Override // com.applovin.impl.x6
    public Map d() {
        byte[] bArr = this.f11688t;
        if (bArr == null) {
            return null;
        }
        return this.b.b(bArr);
    }

    private void a(p4 p4Var) {
        Iterator it = this.f11679i.a().iterator();
        while (it.hasNext()) {
            p4Var.accept((y6.a) it.next());
        }
    }

    private void a(boolean z8) {
        if (this.f11677g) {
            return;
        }
        byte[] bArr = (byte[]) yp.a((Object) this.f11688t);
        int i9 = this.f11675e;
        if (i9 != 0 && i9 != 1) {
            if (i9 == 2) {
                if (this.f11689u == null || l()) {
                    a(bArr, 2, z8);
                    return;
                }
                return;
            }
            if (i9 != 3) {
                return;
            }
            AbstractC0669a1.a(this.f11689u);
            AbstractC0669a1.a(this.f11688t);
            a(this.f11689u, 3, z8);
            return;
        }
        if (this.f11689u == null) {
            a(bArr, 1, z8);
            return;
        }
        if (this.f11682n == 4 || l()) {
            long a6 = a();
            if (this.f11675e == 0 && a6 <= 60) {
                kc.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + a6);
                a(bArr, 2, z8);
                return;
            }
            if (a6 <= 0) {
                a(new ub(), 2);
            } else {
                this.f11682n = 4;
                a(new C1(14));
            }
        }
    }

    @Override // com.applovin.impl.x6
    public final int b() {
        return this.f11682n;
    }

    public void b(Exception exc, boolean z8) {
        a(exc, z8 ? 1 : 3);
    }

    public void b(Object obj, Object obj2) {
        if (obj == this.f11691w) {
            if (this.f11682n == 2 || g()) {
                this.f11691w = null;
                if (obj2 instanceof Exception) {
                    this.f11673c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.b.a((byte[]) obj2);
                    this.f11673c.a();
                } catch (Exception e4) {
                    this.f11673c.a(e4, true);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends Handler {

        /* renamed from: a */
        private boolean f11692a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, md mdVar) {
            IOException fVar;
            d dVar = (d) message.obj;
            if (!dVar.b) {
                return false;
            }
            int i9 = dVar.f11696e + 1;
            dVar.f11696e = i9;
            if (i9 > v5.this.f11680j.a(3)) {
                return false;
            }
            ic icVar = new ic(dVar.f11693a, mdVar.f8906a, mdVar.b, mdVar.f8907c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f11694c, mdVar.f8908d);
            pd pdVar = new pd(3);
            if (mdVar.getCause() instanceof IOException) {
                fVar = (IOException) mdVar.getCause();
            } else {
                fVar = new f(mdVar.getCause());
            }
            long a6 = v5.this.f11680j.a(new hc.a(icVar, pdVar, fVar, dVar.f11696e));
            if (a6 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f11692a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), a6);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Throwable th;
            d dVar = (d) message.obj;
            try {
                int i9 = message.what;
                if (i9 != 0) {
                    if (i9 == 1) {
                        v5 v5Var = v5.this;
                        th = v5Var.f11681k.a(v5Var.l, (x7.a) dVar.f11695d);
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    v5 v5Var2 = v5.this;
                    th = v5Var2.f11681k.a(v5Var2.l, (x7.d) dVar.f11695d);
                }
            } catch (md e4) {
                boolean a6 = a(message, e4);
                th = e4;
                if (a6) {
                    return;
                }
            } catch (Exception e9) {
                kc.c("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e9);
                th = e9;
            }
            v5.this.f11680j.a(dVar.f11693a);
            synchronized (this) {
                try {
                    if (!this.f11692a) {
                        v5.this.m.obtainMessage(message.what, Pair.create(dVar.f11695d, th)).sendToTarget();
                    }
                } finally {
                }
            }
        }

        public void a(int i9, Object obj, boolean z8) {
            obtainMessage(i9, new d(ic.a(), z8, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void a() {
            removeCallbacksAndMessages(null);
            this.f11692a = true;
        }
    }

    public boolean a(byte[] bArr) {
        return Arrays.equals(this.f11688t, bArr);
    }

    private void a(Exception exc, int i9) {
        this.f11687s = new x6.a(exc, b7.a(exc, i9));
        kc.a("DefaultDrmSession", "DRM session error", exc);
        a(new C(exc, 3));
        if (this.f11682n != 4) {
            this.f11682n = 1;
        }
    }

    public void a(Object obj, Object obj2) {
        if (obj == this.f11690v && g()) {
            this.f11690v = null;
            if (obj2 instanceof Exception) {
                a((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f11675e == 3) {
                    this.b.b((byte[]) yp.a((Object) this.f11689u), bArr);
                    a(new C1(12));
                    return;
                }
                byte[] b8 = this.b.b(this.f11688t, bArr);
                int i9 = this.f11675e;
                if ((i9 == 2 || (i9 == 0 && this.f11689u != null)) && b8 != null && b8.length != 0) {
                    this.f11689u = b8;
                }
                this.f11682n = 4;
                a(new C1(13));
            } catch (Exception e4) {
                a(e4, true);
            }
        }
    }

    private void a(Exception exc, boolean z8) {
        if (exc instanceof NotProvisionedException) {
            this.f11673c.a(this);
        } else {
            a(exc, z8 ? 1 : 2);
        }
    }

    public void a(int i9) {
        if (i9 != 2) {
            return;
        }
        h();
    }

    private void a(byte[] bArr, int i9, boolean z8) {
        try {
            this.f11690v = this.b.a(bArr, this.f11672a, i9, this.f11678h);
            ((c) yp.a(this.f11685q)).a(1, AbstractC0669a1.a(this.f11690v), z8);
        } catch (Exception e4) {
            a(e4, true);
        }
    }

    @Override // com.applovin.impl.x6
    public void a(y6.a aVar) {
        AbstractC0669a1.b(this.f11683o > 0);
        int i9 = this.f11683o - 1;
        this.f11683o = i9;
        if (i9 == 0) {
            this.f11682n = 0;
            ((e) yp.a(this.m)).removeCallbacksAndMessages(null);
            ((c) yp.a(this.f11685q)).a();
            this.f11685q = null;
            ((HandlerThread) yp.a(this.f11684p)).quit();
            this.f11684p = null;
            this.f11686r = null;
            this.f11687s = null;
            this.f11690v = null;
            this.f11691w = null;
            byte[] bArr = this.f11688t;
            if (bArr != null) {
                this.b.c(bArr);
                this.f11688t = null;
            }
        }
        if (aVar != null) {
            this.f11679i.c(aVar);
            if (this.f11679i.b(aVar) == 0) {
                aVar.d();
            }
        }
        this.f11674d.b(this, this.f11683o);
    }

    @Override // com.applovin.impl.x6
    public boolean a(String str) {
        return this.b.a((byte[]) AbstractC0669a1.b(this.f11688t), str);
    }

    private long a() {
        if (!AbstractC0744r2.f10446d.equals(this.l)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) AbstractC0669a1.a(cs.a(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }
}
