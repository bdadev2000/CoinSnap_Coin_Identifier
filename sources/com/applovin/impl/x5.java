package com.applovin.impl;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.impl.a7;
import com.applovin.impl.mc;
import com.applovin.impl.z6;
import com.applovin.impl.z7;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public class x5 implements z6 {

    /* renamed from: a */
    public final List f27838a;

    /* renamed from: b */
    private final z7 f27839b;

    /* renamed from: c */
    private final a f27840c;
    private final b d;
    private final int e;

    /* renamed from: f */
    private final boolean f27841f;

    /* renamed from: g */
    private final boolean f27842g;

    /* renamed from: h */
    private final HashMap f27843h;

    /* renamed from: i */
    private final u4 f27844i;

    /* renamed from: j */
    private final mc f27845j;

    /* renamed from: k */
    final qd f27846k;

    /* renamed from: l */
    final UUID f27847l;

    /* renamed from: m */
    final e f27848m;

    /* renamed from: n */
    private int f27849n;

    /* renamed from: o */
    private int f27850o;

    /* renamed from: p */
    private HandlerThread f27851p;

    /* renamed from: q */
    private c f27852q;

    /* renamed from: r */
    private z4 f27853r;

    /* renamed from: s */
    private z6.a f27854s;

    /* renamed from: t */
    private byte[] f27855t;

    /* renamed from: u */
    private byte[] f27856u;

    /* renamed from: v */
    private z7.a f27857v;
    private z7.d w;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(x5 x5Var);

        void a(Exception exc, boolean z2);
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(x5 x5Var, int i2);

        void b(x5 x5Var, int i2);
    }

    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a */
        public final long f27860a;

        /* renamed from: b */
        public final boolean f27861b;

        /* renamed from: c */
        public final long f27862c;
        public final Object d;
        public int e;

        public d(long j2, boolean z2, long j3, Object obj) {
            this.f27860a = j2;
            this.f27861b = z2;
            this.f27862c = j3;
            this.d = obj;
        }
    }

    /* loaded from: classes2.dex */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i2 = message.what;
            if (i2 == 0) {
                x5.this.b(obj, obj2);
            } else {
                if (i2 != 1) {
                    return;
                }
                x5.this.a(obj, obj2);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public x5(UUID uuid, z7 z7Var, a aVar, b bVar, List list, int i2, boolean z2, boolean z3, byte[] bArr, HashMap hashMap, qd qdVar, Looper looper, mc mcVar) {
        if (i2 == 1 || i2 == 3) {
            b1.a(bArr);
        }
        this.f27847l = uuid;
        this.f27840c = aVar;
        this.d = bVar;
        this.f27839b = z7Var;
        this.e = i2;
        this.f27841f = z2;
        this.f27842g = z3;
        if (bArr != null) {
            this.f27856u = bArr;
            this.f27838a = null;
        } else {
            this.f27838a = Collections.unmodifiableList((List) b1.a(list));
        }
        this.f27843h = hashMap;
        this.f27846k = qdVar;
        this.f27844i = new u4();
        this.f27845j = mcVar;
        this.f27849n = 2;
        this.f27848m = new e(looper);
    }

    public static /* synthetic */ void c(Exception exc, a7.a aVar) {
        aVar.a(exc);
    }

    private boolean g() {
        int i2 = this.f27849n;
        return i2 == 3 || i2 == 4;
    }

    private void h() {
        if (this.e == 0 && this.f27849n == 4) {
            xp.a((Object) this.f27855t);
            a(false);
        }
    }

    private boolean j() {
        if (g()) {
            return true;
        }
        try {
            byte[] d2 = this.f27839b.d();
            this.f27855t = d2;
            this.f27853r = this.f27839b.d(d2);
            this.f27849n = 3;
            a(new at(3));
            b1.a(this.f27855t);
            return true;
        } catch (NotProvisionedException unused) {
            this.f27840c.a(this);
            return false;
        } catch (Exception e2) {
            a(e2, 1);
            return false;
        }
    }

    private boolean l() {
        try {
            this.f27839b.a(this.f27855t, this.f27856u);
            return true;
        } catch (Exception e2) {
            a(e2, 1);
            return false;
        }
    }

    @Override // com.applovin.impl.z6
    public Map d() {
        byte[] bArr = this.f27855t;
        if (bArr == null) {
            return null;
        }
        return this.f27839b.b(bArr);
    }

    @Override // com.applovin.impl.z6
    public final UUID e() {
        return this.f27847l;
    }

    @Override // com.applovin.impl.z6
    public final z4 f() {
        return this.f27853r;
    }

    @Override // com.applovin.impl.z6
    public final z6.a getError() {
        if (this.f27849n == 1) {
            return this.f27854s;
        }
        return null;
    }

    public void i() {
        if (j()) {
            a(true);
        }
    }

    public void k() {
        this.w = this.f27839b.b();
        ((c) xp.a(this.f27852q)).a(0, b1.a(this.w), true);
    }

    @Override // com.applovin.impl.z6
    public final int b() {
        return this.f27849n;
    }

    @Override // com.applovin.impl.z6
    public boolean c() {
        return this.f27841f;
    }

    private void a(r4 r4Var) {
        Iterator it = this.f27844i.a().iterator();
        while (it.hasNext()) {
            r4Var.accept((a7.a) it.next());
        }
    }

    @Override // com.applovin.impl.z6
    public void b(a7.a aVar) {
        b1.b(this.f27850o >= 0);
        if (aVar != null) {
            this.f27844i.a(aVar);
        }
        int i2 = this.f27850o + 1;
        this.f27850o = i2;
        if (i2 == 1) {
            b1.b(this.f27849n == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f27851p = handlerThread;
            handlerThread.start();
            this.f27852q = new c(this.f27851p.getLooper());
            if (j()) {
                a(true);
            }
        } else if (aVar != null && g() && this.f27844i.b(aVar) == 1) {
            aVar.a(this.f27849n);
        }
        this.d.a(this, this.f27850o);
    }

    private void a(boolean z2) {
        if (this.f27842g) {
            return;
        }
        byte[] bArr = (byte[]) xp.a((Object) this.f27855t);
        int i2 = this.e;
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                if (this.f27856u == null || l()) {
                    a(bArr, 2, z2);
                    return;
                }
                return;
            }
            if (i2 != 3) {
                return;
            }
            b1.a(this.f27856u);
            b1.a(this.f27855t);
            a(this.f27856u, 3, z2);
            return;
        }
        if (this.f27856u == null) {
            a(bArr, 1, z2);
            return;
        }
        if (this.f27849n == 4 || l()) {
            long a2 = a();
            if (this.e == 0 && a2 <= 60) {
                pc.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + a2);
                a(bArr, 2, z2);
                return;
            }
            if (a2 <= 0) {
                a(new zb(), 2);
            } else {
                this.f27849n = 4;
                a(new ru(14));
            }
        }
    }

    public void b(Exception exc, boolean z2) {
        a(exc, z2 ? 1 : 3);
    }

    /* loaded from: classes2.dex */
    public class c extends Handler {

        /* renamed from: a */
        private boolean f27858a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, rd rdVar) {
            IOException fVar;
            d dVar = (d) message.obj;
            if (!dVar.f27861b) {
                return false;
            }
            int i2 = dVar.e + 1;
            dVar.e = i2;
            if (i2 > x5.this.f27845j.a(3)) {
                return false;
            }
            nc ncVar = new nc(dVar.f27860a, rdVar.f26286a, rdVar.f26287b, rdVar.f26288c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f27862c, rdVar.d);
            ud udVar = new ud(3);
            if (rdVar.getCause() instanceof IOException) {
                fVar = (IOException) rdVar.getCause();
            } else {
                fVar = new f(rdVar.getCause());
            }
            long a2 = x5.this.f27845j.a(new mc.a(ncVar, udVar, fVar, dVar.e));
            if (a2 == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f27858a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), a2);
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
                int i2 = message.what;
                if (i2 == 0) {
                    x5 x5Var = x5.this;
                    th = x5Var.f27846k.a(x5Var.f27847l, (z7.d) dVar.d);
                } else {
                    if (i2 != 1) {
                        throw new RuntimeException();
                    }
                    x5 x5Var2 = x5.this;
                    th = x5Var2.f27846k.a(x5Var2.f27847l, (z7.a) dVar.d);
                }
            } catch (rd e) {
                boolean a2 = a(message, e);
                th = e;
                if (a2) {
                    return;
                }
            } catch (Exception e2) {
                pc.c("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                th = e2;
            }
            x5.this.f27845j.a(dVar.f27860a);
            synchronized (this) {
                try {
                    if (!this.f27858a) {
                        x5.this.f27848m.obtainMessage(message.what, Pair.create(dVar.d, th)).sendToTarget();
                    }
                } finally {
                }
            }
        }

        public void a(int i2, Object obj, boolean z2) {
            obtainMessage(i2, new d(nc.a(), z2, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void a() {
            removeCallbacksAndMessages(null);
            this.f27858a = true;
        }
    }

    public void b(Object obj, Object obj2) {
        if (obj == this.w) {
            if (this.f27849n == 2 || g()) {
                this.w = null;
                if (obj2 instanceof Exception) {
                    this.f27840c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f27839b.a((byte[]) obj2);
                    this.f27840c.a();
                } catch (Exception e2) {
                    this.f27840c.a(e2, true);
                }
            }
        }
    }

    public boolean a(byte[] bArr) {
        return Arrays.equals(this.f27855t, bArr);
    }

    private void a(Exception exc, int i2) {
        this.f27854s = new z6.a(exc, d7.a(exc, i2));
        pc.a("DefaultDrmSession", "DRM session error", exc);
        a(new is(exc, 4));
        if (this.f27849n != 4) {
            this.f27849n = 1;
        }
    }

    public void a(Object obj, Object obj2) {
        if (obj == this.f27857v && g()) {
            this.f27857v = null;
            if (obj2 instanceof Exception) {
                a((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.e == 3) {
                    this.f27839b.b((byte[]) xp.a((Object) this.f27856u), bArr);
                    a(new ru(15));
                    return;
                }
                byte[] b2 = this.f27839b.b(this.f27855t, bArr);
                int i2 = this.e;
                if ((i2 == 2 || (i2 == 0 && this.f27856u != null)) && b2 != null && b2.length != 0) {
                    this.f27856u = b2;
                }
                this.f27849n = 4;
                a(new ru(16));
            } catch (Exception e2) {
                a(e2, true);
            }
        }
    }

    private void a(Exception exc, boolean z2) {
        if (exc instanceof NotProvisionedException) {
            this.f27840c.a(this);
        } else {
            a(exc, z2 ? 1 : 2);
        }
    }

    public void a(int i2) {
        if (i2 != 2) {
            return;
        }
        h();
    }

    private void a(byte[] bArr, int i2, boolean z2) {
        try {
            this.f27857v = this.f27839b.a(bArr, this.f27838a, i2, this.f27843h);
            ((c) xp.a(this.f27852q)).a(1, b1.a(this.f27857v), z2);
        } catch (Exception e2) {
            a(e2, true);
        }
    }

    @Override // com.applovin.impl.z6
    public void a(a7.a aVar) {
        b1.b(this.f27850o > 0);
        int i2 = this.f27850o - 1;
        this.f27850o = i2;
        if (i2 == 0) {
            this.f27849n = 0;
            ((e) xp.a(this.f27848m)).removeCallbacksAndMessages(null);
            ((c) xp.a(this.f27852q)).a();
            this.f27852q = null;
            ((HandlerThread) xp.a(this.f27851p)).quit();
            this.f27851p = null;
            this.f27853r = null;
            this.f27854s = null;
            this.f27857v = null;
            this.w = null;
            byte[] bArr = this.f27855t;
            if (bArr != null) {
                this.f27839b.c(bArr);
                this.f27855t = null;
            }
        }
        if (aVar != null) {
            this.f27844i.c(aVar);
            if (this.f27844i.b(aVar) == 0) {
                aVar.d();
            }
        }
        this.d.b(this, this.f27850o);
    }

    @Override // com.applovin.impl.z6
    public boolean a(String str) {
        return this.f27839b.a((byte[]) b1.b(this.f27855t), str);
    }

    private long a() {
        if (!t2.d.equals(this.f27847l)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) b1.a(bs.a(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }
}
