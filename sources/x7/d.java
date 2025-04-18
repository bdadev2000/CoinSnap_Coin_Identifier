package x7;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import v8.u0;

/* loaded from: classes3.dex */
public final class d implements n {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f27418b;

    /* renamed from: c, reason: collision with root package name */
    public final r4.c f27419c;

    /* renamed from: d, reason: collision with root package name */
    public final fb.c f27420d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27421e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27422f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27423g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f27424h;

    /* renamed from: i, reason: collision with root package name */
    public final n9.d f27425i;

    /* renamed from: j, reason: collision with root package name */
    public final ac.e f27426j;

    /* renamed from: k, reason: collision with root package name */
    public final t7.x f27427k;

    /* renamed from: l, reason: collision with root package name */
    public final h3.a f27428l;

    /* renamed from: m, reason: collision with root package name */
    public final UUID f27429m;

    /* renamed from: n, reason: collision with root package name */
    public final Looper f27430n;

    /* renamed from: o, reason: collision with root package name */
    public final c f27431o;

    /* renamed from: p, reason: collision with root package name */
    public int f27432p;

    /* renamed from: q, reason: collision with root package name */
    public int f27433q;

    /* renamed from: r, reason: collision with root package name */
    public HandlerThread f27434r;

    /* renamed from: s, reason: collision with root package name */
    public a f27435s;

    /* renamed from: t, reason: collision with root package name */
    public w7.b f27436t;
    public m u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f27437v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f27438w;

    /* renamed from: x, reason: collision with root package name */
    public z f27439x;

    /* renamed from: y, reason: collision with root package name */
    public a0 f27440y;

    public d(UUID uuid, b0 b0Var, r4.c cVar, fb.c cVar2, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, h3.a aVar, Looper looper, ac.e eVar, t7.x xVar) {
        if (i10 == 1 || i10 == 3) {
            bArr.getClass();
        }
        this.f27429m = uuid;
        this.f27419c = cVar;
        this.f27420d = cVar2;
        this.f27418b = b0Var;
        this.f27421e = i10;
        this.f27422f = z10;
        this.f27423g = z11;
        if (bArr != null) {
            this.f27438w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.f27424h = hashMap;
        this.f27428l = aVar;
        this.f27425i = new n9.d();
        this.f27426j = eVar;
        this.f27427k = xVar;
        this.f27432p = 2;
        this.f27430n = looper;
        this.f27431o = new c(this, looper);
    }

    @Override // x7.n
    public final UUID a() {
        p();
        return this.f27429m;
    }

    @Override // x7.n
    public final boolean b() {
        p();
        return this.f27422f;
    }

    @Override // x7.n
    public final w7.b d() {
        p();
        return this.f27436t;
    }

    @Override // x7.n
    public final void e(q qVar) {
        p();
        int i10 = this.f27433q;
        if (i10 <= 0) {
            n9.o.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f27433q = i11;
        if (i11 == 0) {
            this.f27432p = 0;
            c cVar = this.f27431o;
            int i12 = n9.h0.a;
            cVar.removeCallbacksAndMessages(null);
            a aVar = this.f27435s;
            synchronized (aVar) {
                aVar.removeCallbacksAndMessages(null);
                aVar.a = true;
            }
            this.f27435s = null;
            this.f27434r.quit();
            this.f27434r = null;
            this.f27436t = null;
            this.u = null;
            this.f27439x = null;
            this.f27440y = null;
            byte[] bArr = this.f27437v;
            if (bArr != null) {
                this.f27418b.closeSession(bArr);
                this.f27437v = null;
            }
        }
        if (qVar != null) {
            n9.d dVar = this.f27425i;
            synchronized (dVar.f22524b) {
                Integer num = (Integer) dVar.f22525c.get(qVar);
                if (num != null) {
                    ArrayList arrayList = new ArrayList(dVar.f22527f);
                    arrayList.remove(qVar);
                    dVar.f22527f = Collections.unmodifiableList(arrayList);
                    if (num.intValue() == 1) {
                        dVar.f22525c.remove(qVar);
                        HashSet hashSet = new HashSet(dVar.f22526d);
                        hashSet.remove(qVar);
                        dVar.f22526d = Collections.unmodifiableSet(hashSet);
                    } else {
                        dVar.f22525c.put(qVar, Integer.valueOf(num.intValue() - 1));
                    }
                }
            }
            if (this.f27425i.a(qVar) == 0) {
                qVar.f();
            }
        }
        fb.c cVar2 = this.f27420d;
        int i13 = this.f27433q;
        if (i13 == 1) {
            i iVar = (i) cVar2.f17773c;
            if (iVar.f27471p > 0 && iVar.f27467l != C.TIME_UNSET) {
                iVar.f27470o.add(this);
                Handler handler = ((i) cVar2.f17773c).u;
                handler.getClass();
                handler.postAtTime(new androidx.activity.d(this, 29), this, SystemClock.uptimeMillis() + ((i) cVar2.f17773c).f27467l);
                ((i) cVar2.f17773c).k();
            }
        }
        if (i13 == 0) {
            ((i) cVar2.f17773c).f27468m.remove(this);
            i iVar2 = (i) cVar2.f17773c;
            if (iVar2.f27473r == this) {
                iVar2.f27473r = null;
            }
            if (iVar2.f27474s == this) {
                iVar2.f27474s = null;
            }
            r4.c cVar3 = iVar2.f27464i;
            ((Set) cVar3.f23999c).remove(this);
            if (((d) cVar3.f24000d) == this) {
                cVar3.f24000d = null;
                if (!((Set) cVar3.f23999c).isEmpty()) {
                    d dVar2 = (d) ((Set) cVar3.f23999c).iterator().next();
                    cVar3.f24000d = dVar2;
                    a0 provisionRequest = dVar2.f27418b.getProvisionRequest();
                    dVar2.f27440y = provisionRequest;
                    a aVar2 = dVar2.f27435s;
                    int i14 = n9.h0.a;
                    provisionRequest.getClass();
                    aVar2.getClass();
                    aVar2.obtainMessage(0, new b(v8.p.f26222b.getAndIncrement(), true, SystemClock.elapsedRealtime(), provisionRequest)).sendToTarget();
                }
            }
            i iVar3 = (i) cVar2.f17773c;
            if (iVar3.f27467l != C.TIME_UNSET) {
                Handler handler2 = iVar3.u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                ((i) cVar2.f17773c).f27470o.remove(this);
            }
        }
        ((i) cVar2.f17773c).k();
    }

    @Override // x7.n
    public final void f(q qVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f27433q < 0) {
            n9.o.c("DefaultDrmSession", "Session reference count less than zero: " + this.f27433q);
            this.f27433q = 0;
        }
        if (qVar != null) {
            n9.d dVar = this.f27425i;
            synchronized (dVar.f22524b) {
                ArrayList arrayList = new ArrayList(dVar.f22527f);
                arrayList.add(qVar);
                dVar.f22527f = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) dVar.f22525c.get(qVar);
                if (num == null) {
                    HashSet hashSet = new HashSet(dVar.f22526d);
                    hashSet.add(qVar);
                    dVar.f22526d = Collections.unmodifiableSet(hashSet);
                }
                HashMap hashMap = dVar.f22525c;
                if (num != null) {
                    i10 = num.intValue() + 1;
                } else {
                    i10 = 1;
                }
                hashMap.put(qVar, Integer.valueOf(i10));
            }
        }
        int i11 = this.f27433q + 1;
        this.f27433q = i11;
        if (i11 == 1) {
            if (this.f27432p == 2) {
                z10 = true;
            }
            u0.m(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f27434r = handlerThread;
            handlerThread.start();
            this.f27435s = new a(this, this.f27434r.getLooper());
            if (m()) {
                i(true);
            }
        } else if (qVar != null && j() && this.f27425i.a(qVar) == 1) {
            qVar.d(this.f27432p);
        }
        fb.c cVar = this.f27420d;
        i iVar = (i) cVar.f17773c;
        if (iVar.f27467l != C.TIME_UNSET) {
            iVar.f27470o.remove(this);
            Handler handler = ((i) cVar.f17773c).u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // x7.n
    public final boolean g(String str) {
        p();
        byte[] bArr = this.f27437v;
        u0.p(bArr);
        return this.f27418b.g(str, bArr);
    }

    @Override // x7.n
    public final m getError() {
        p();
        if (this.f27432p == 1) {
            return this.u;
        }
        return null;
    }

    @Override // x7.n
    public final int getState() {
        p();
        return this.f27432p;
    }

    public final void h(n9.c cVar) {
        Set set;
        n9.d dVar = this.f27425i;
        synchronized (dVar.f22524b) {
            set = dVar.f22526d;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            cVar.accept((q) it.next());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:50|(2:51|52)|(6:54|55|56|57|(1:59)|61)|64|55|56|57|(0)|61) */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096 A[Catch: NumberFormatException -> 0x009a, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x009a, blocks: (B:57:0x008e, B:59:0x0096), top: B:56:0x008e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(boolean r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.d.i(boolean):void");
    }

    public final boolean j() {
        int i10 = this.f27432p;
        return i10 == 3 || i10 == 4;
    }

    public final void k(int i10, Exception exc) {
        int i11;
        int i12 = n9.h0.a;
        if (i12 >= 21 && w.a(exc)) {
            i11 = w.b(exc);
        } else {
            if (i12 < 23 || !x.a(exc)) {
                if (i12 < 18 || !v.b(exc)) {
                    if (i12 >= 18 && v.a(exc)) {
                        i11 = 6007;
                    } else if (exc instanceof i0) {
                        i11 = AdError.MEDIAVIEW_MISSING_ERROR_CODE;
                    } else if (exc instanceof g) {
                        i11 = AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
                    } else if (exc instanceof g0) {
                        i11 = 6008;
                    } else if (i10 != 1) {
                        if (i10 == 2) {
                            i11 = 6004;
                        } else if (i10 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i11 = 6002;
            }
            i11 = 6006;
        }
        this.u = new m(exc, i11);
        n9.o.d("DefaultDrmSession", "DRM session error", exc);
        h(new androidx.core.app.h(exc, 22));
        if (this.f27432p != 4) {
            this.f27432p = 1;
        }
    }

    public final void l(Exception exc, boolean z10) {
        int i10;
        if (exc instanceof NotProvisionedException) {
            r4.c cVar = this.f27419c;
            ((Set) cVar.f23999c).add(this);
            if (((d) cVar.f24000d) == null) {
                cVar.f24000d = this;
                a0 provisionRequest = this.f27418b.getProvisionRequest();
                this.f27440y = provisionRequest;
                a aVar = this.f27435s;
                int i11 = n9.h0.a;
                provisionRequest.getClass();
                aVar.getClass();
                aVar.obtainMessage(0, new b(v8.p.f26222b.getAndIncrement(), true, SystemClock.elapsedRealtime(), provisionRequest)).sendToTarget();
                return;
            }
            return;
        }
        if (z10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        k(i10, exc);
    }

    public final boolean m() {
        Set set;
        if (j()) {
            return true;
        }
        try {
            byte[] openSession = this.f27418b.openSession();
            this.f27437v = openSession;
            this.f27418b.f(openSession, this.f27427k);
            this.f27436t = this.f27418b.c(this.f27437v);
            this.f27432p = 3;
            n9.d dVar = this.f27425i;
            synchronized (dVar.f22524b) {
                set = dVar.f22526d;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((q) it.next()).d(3);
            }
            this.f27437v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            r4.c cVar = this.f27419c;
            ((Set) cVar.f23999c).add(this);
            if (((d) cVar.f24000d) == null) {
                cVar.f24000d = this;
                a0 provisionRequest = this.f27418b.getProvisionRequest();
                this.f27440y = provisionRequest;
                a aVar = this.f27435s;
                int i10 = n9.h0.a;
                provisionRequest.getClass();
                aVar.getClass();
                aVar.obtainMessage(0, new b(v8.p.f26222b.getAndIncrement(), true, SystemClock.elapsedRealtime(), provisionRequest)).sendToTarget();
            }
            return false;
        } catch (Exception e2) {
            k(1, e2);
            return false;
        }
    }

    public final void n(byte[] bArr, int i10, boolean z10) {
        try {
            z e2 = this.f27418b.e(bArr, this.a, i10, this.f27424h);
            this.f27439x = e2;
            a aVar = this.f27435s;
            int i11 = n9.h0.a;
            e2.getClass();
            aVar.getClass();
            aVar.obtainMessage(1, new b(v8.p.f26222b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), e2)).sendToTarget();
        } catch (Exception e10) {
            l(e10, true);
        }
    }

    public final Map o() {
        p();
        byte[] bArr = this.f27437v;
        if (bArr == null) {
            return null;
        }
        return this.f27418b.queryKeyStatus(bArr);
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f27430n;
        if (currentThread != looper.getThread()) {
            n9.o.g("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
