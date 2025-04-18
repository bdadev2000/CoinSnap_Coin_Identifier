package v8;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class l implements y {
    public final android.support.v4.media.d a;

    /* renamed from: b, reason: collision with root package name */
    public final m9.k f26190b;

    /* renamed from: c, reason: collision with root package name */
    public ac.e f26191c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26192d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26193e;

    /* renamed from: f, reason: collision with root package name */
    public final long f26194f;

    /* renamed from: g, reason: collision with root package name */
    public final float f26195g;

    /* renamed from: h, reason: collision with root package name */
    public final float f26196h;

    public l(Context context, y7.j jVar) {
        m9.u uVar = new m9.u(context);
        this.f26190b = uVar;
        android.support.v4.media.d dVar = new android.support.v4.media.d(jVar);
        this.a = dVar;
        if (uVar != ((m9.k) dVar.f526f)) {
            dVar.f526f = uVar;
            ((Map) dVar.f523c).clear();
            ((Map) dVar.f525e).clear();
        }
        this.f26192d = C.TIME_UNSET;
        this.f26193e = C.TIME_UNSET;
        this.f26194f = C.TIME_UNSET;
        this.f26195g = -3.4028235E38f;
        this.f26196h = -3.4028235E38f;
    }

    public static y d(Class cls, m9.k kVar) {
        try {
            return (y) cls.getConstructor(m9.k.class).newInstance(kVar);
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // v8.y
    public final a a(s7.j1 j1Var) {
        j1Var.f24453c.getClass();
        s7.e1 e1Var = j1Var.f24453c;
        String scheme = e1Var.f24342b.getScheme();
        y yVar = null;
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        int C = n9.h0.C(e1Var.f24342b, e1Var.f24343c);
        android.support.v4.media.d dVar = this.a;
        y yVar2 = (y) ((Map) dVar.f525e).get(Integer.valueOf(C));
        if (yVar2 != null) {
            yVar = yVar2;
        } else {
            ra.p f10 = dVar.f(C);
            if (f10 != null) {
                yVar = (y) f10.get();
                a4.j.t(dVar.f527g);
                x7.j jVar = (x7.j) dVar.f528h;
                if (jVar != null) {
                    yVar.c(jVar);
                }
                ac.e eVar = (ac.e) dVar.f529i;
                if (eVar != null) {
                    yVar.b(eVar);
                }
                ((Map) dVar.f525e).put(Integer.valueOf(C), yVar);
            }
        }
        String i10 = eb.j.i("No suitable media source factory found for content type: ", C);
        if (yVar != null) {
            s7.d1 d1Var = j1Var.f24454d;
            d1Var.getClass();
            s7.c1 c1Var = new s7.c1(d1Var);
            if (d1Var.f24319b == C.TIME_UNSET) {
                c1Var.a = this.f26192d;
            }
            if (d1Var.f24322f == -3.4028235E38f) {
                c1Var.f24310d = this.f26195g;
            }
            if (d1Var.f24323g == -3.4028235E38f) {
                c1Var.f24311e = this.f26196h;
            }
            if (d1Var.f24320c == C.TIME_UNSET) {
                c1Var.f24308b = this.f26193e;
            }
            if (d1Var.f24321d == C.TIME_UNSET) {
                c1Var.f24309c = this.f26194f;
            }
            s7.d1 a = c1Var.a();
            if (!a.equals(d1Var)) {
                s7.w0 w0Var = new s7.w0(j1Var);
                w0Var.f24820l = new s7.c1(a);
                j1Var = w0Var.a();
            }
            a a10 = yVar.a(j1Var);
            com.google.common.collect.r0 r0Var = j1Var.f24453c.f24348i;
            if (!r0Var.isEmpty()) {
                a[] aVarArr = new a[r0Var.size() + 1];
                int i11 = 0;
                aVarArr[0] = a10;
                while (i11 < r0Var.size()) {
                    m9.k kVar = this.f26190b;
                    androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(kVar);
                    ac.e eVar2 = this.f26191c;
                    if (eVar2 != null) {
                        tVar.f1534d = eVar2;
                    }
                    int i12 = i11 + 1;
                    aVarArr[i12] = new h1((String) tVar.f1536f, (s7.i1) r0Var.get(i11), kVar, (ac.e) tVar.f1534d, tVar.f1532b, tVar.f1535e);
                    i11 = i12;
                }
                a10 = new j0(aVarArr);
            }
            a aVar = a10;
            s7.z0 z0Var = j1Var.f24456g;
            long j3 = z0Var.f24873b;
            long j10 = z0Var.f24874c;
            if (j3 != 0 || j10 != Long.MIN_VALUE || z0Var.f24876f) {
                aVar = new g(aVar, n9.h0.H(j3), n9.h0.H(j10), !z0Var.f24877g, z0Var.f24875d, z0Var.f24876f);
            }
            s7.e1 e1Var2 = j1Var.f24453c;
            e1Var2.getClass();
            if (e1Var2.f24345f != null) {
                n9.o.f("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            }
            return aVar;
        }
        throw new IllegalStateException(String.valueOf(i10));
    }

    @Override // v8.y
    public final y b(ac.e eVar) {
        if (eVar != null) {
            this.f26191c = eVar;
            android.support.v4.media.d dVar = this.a;
            dVar.f529i = eVar;
            Iterator it = ((Map) dVar.f525e).values().iterator();
            while (it.hasNext()) {
                ((y) it.next()).b(eVar);
            }
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // v8.y
    public final y c(x7.j jVar) {
        if (jVar != null) {
            android.support.v4.media.d dVar = this.a;
            dVar.f528h = jVar;
            Iterator it = ((Map) dVar.f525e).values().iterator();
            while (it.hasNext()) {
                ((y) it.next()).c(jVar);
            }
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }
}
