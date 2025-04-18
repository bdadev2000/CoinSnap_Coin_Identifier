package s4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import e4.j;
import e4.l;
import e4.m;
import e4.q;
import g4.o;
import g4.p;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.JsonLexerKt;
import n4.n;
import n4.r;

/* loaded from: classes.dex */
public abstract class a implements Cloneable {
    public boolean B;

    /* renamed from: b, reason: collision with root package name */
    public int f24184b;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f24188g;

    /* renamed from: h, reason: collision with root package name */
    public int f24189h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f24190i;

    /* renamed from: j, reason: collision with root package name */
    public int f24191j;

    /* renamed from: o, reason: collision with root package name */
    public boolean f24196o;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f24198q;

    /* renamed from: r, reason: collision with root package name */
    public int f24199r;

    /* renamed from: v, reason: collision with root package name */
    public boolean f24202v;

    /* renamed from: w, reason: collision with root package name */
    public Resources.Theme f24203w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f24204x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f24205y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f24206z;

    /* renamed from: c, reason: collision with root package name */
    public float f24185c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public p f24186d = p.f18142c;

    /* renamed from: f, reason: collision with root package name */
    public com.bumptech.glide.h f24187f = com.bumptech.glide.h.NORMAL;

    /* renamed from: k, reason: collision with root package name */
    public boolean f24192k = true;

    /* renamed from: l, reason: collision with root package name */
    public int f24193l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f24194m = -1;

    /* renamed from: n, reason: collision with root package name */
    public j f24195n = v4.c.f26025b;

    /* renamed from: p, reason: collision with root package name */
    public boolean f24197p = true;

    /* renamed from: s, reason: collision with root package name */
    public m f24200s = new m();

    /* renamed from: t, reason: collision with root package name */
    public w4.c f24201t = new w4.c();
    public Class u = Object.class;
    public boolean A = true;

    public static boolean e(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public a a(a aVar) {
        if (this.f24204x) {
            return clone().a(aVar);
        }
        if (e(aVar.f24184b, 2)) {
            this.f24185c = aVar.f24185c;
        }
        if (e(aVar.f24184b, 262144)) {
            this.f24205y = aVar.f24205y;
        }
        if (e(aVar.f24184b, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES)) {
            this.B = aVar.B;
        }
        if (e(aVar.f24184b, 4)) {
            this.f24186d = aVar.f24186d;
        }
        if (e(aVar.f24184b, 8)) {
            this.f24187f = aVar.f24187f;
        }
        if (e(aVar.f24184b, 16)) {
            this.f24188g = aVar.f24188g;
            this.f24189h = 0;
            this.f24184b &= -33;
        }
        if (e(aVar.f24184b, 32)) {
            this.f24189h = aVar.f24189h;
            this.f24188g = null;
            this.f24184b &= -17;
        }
        if (e(aVar.f24184b, 64)) {
            this.f24190i = aVar.f24190i;
            this.f24191j = 0;
            this.f24184b &= -129;
        }
        if (e(aVar.f24184b, 128)) {
            this.f24191j = aVar.f24191j;
            this.f24190i = null;
            this.f24184b &= -65;
        }
        if (e(aVar.f24184b, NotificationCompat.FLAG_LOCAL_ONLY)) {
            this.f24192k = aVar.f24192k;
        }
        if (e(aVar.f24184b, 512)) {
            this.f24194m = aVar.f24194m;
            this.f24193l = aVar.f24193l;
        }
        if (e(aVar.f24184b, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) {
            this.f24195n = aVar.f24195n;
        }
        if (e(aVar.f24184b, 4096)) {
            this.u = aVar.u;
        }
        if (e(aVar.f24184b, 8192)) {
            this.f24198q = aVar.f24198q;
            this.f24199r = 0;
            this.f24184b &= -16385;
        }
        if (e(aVar.f24184b, JsonLexerKt.BATCH_SIZE)) {
            this.f24199r = aVar.f24199r;
            this.f24198q = null;
            this.f24184b &= -8193;
        }
        if (e(aVar.f24184b, 32768)) {
            this.f24203w = aVar.f24203w;
        }
        if (e(aVar.f24184b, C.DEFAULT_BUFFER_SEGMENT_SIZE)) {
            this.f24197p = aVar.f24197p;
        }
        if (e(aVar.f24184b, 131072)) {
            this.f24196o = aVar.f24196o;
        }
        if (e(aVar.f24184b, 2048)) {
            this.f24201t.putAll(aVar.f24201t);
            this.A = aVar.A;
        }
        if (e(aVar.f24184b, 524288)) {
            this.f24206z = aVar.f24206z;
        }
        if (!this.f24197p) {
            this.f24201t.clear();
            int i10 = this.f24184b & (-2049);
            this.f24196o = false;
            this.f24184b = i10 & (-131073);
            this.A = true;
        }
        this.f24184b |= aVar.f24184b;
        this.f24200s.f17107b.i(aVar.f24200s.f17107b);
        j();
        return this;
    }

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            m mVar = new m();
            aVar.f24200s = mVar;
            mVar.f17107b.i(this.f24200s.f17107b);
            w4.c cVar = new w4.c();
            aVar.f24201t = cVar;
            cVar.putAll(this.f24201t);
            aVar.f24202v = false;
            aVar.f24204x = false;
            return aVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final a c(Class cls) {
        if (this.f24204x) {
            return clone().c(cls);
        }
        this.u = cls;
        this.f24184b |= 4096;
        j();
        return this;
    }

    public final a d(o oVar) {
        if (this.f24204x) {
            return clone().d(oVar);
        }
        this.f24186d = oVar;
        this.f24184b |= 4;
        j();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Float.compare(aVar.f24185c, this.f24185c) == 0 && this.f24189h == aVar.f24189h && w4.m.b(this.f24188g, aVar.f24188g) && this.f24191j == aVar.f24191j && w4.m.b(this.f24190i, aVar.f24190i) && this.f24199r == aVar.f24199r && w4.m.b(this.f24198q, aVar.f24198q) && this.f24192k == aVar.f24192k && this.f24193l == aVar.f24193l && this.f24194m == aVar.f24194m && this.f24196o == aVar.f24196o && this.f24197p == aVar.f24197p && this.f24205y == aVar.f24205y && this.f24206z == aVar.f24206z && this.f24186d.equals(aVar.f24186d) && this.f24187f == aVar.f24187f && this.f24200s.equals(aVar.f24200s) && this.f24201t.equals(aVar.f24201t) && this.u.equals(aVar.u) && w4.m.b(this.f24195n, aVar.f24195n) && w4.m.b(this.f24203w, aVar.f24203w)) {
                return true;
            }
        }
        return false;
    }

    public final a f(n4.m mVar, n4.e eVar) {
        if (this.f24204x) {
            return clone().f(mVar, eVar);
        }
        k(n.f22425f, mVar);
        return o(eVar, false);
    }

    public final a g(int i10, int i11) {
        if (this.f24204x) {
            return clone().g(i10, i11);
        }
        this.f24194m = i10;
        this.f24193l = i11;
        this.f24184b |= 512;
        j();
        return this;
    }

    public final a h() {
        com.bumptech.glide.h hVar = com.bumptech.glide.h.LOW;
        if (this.f24204x) {
            return clone().h();
        }
        this.f24187f = hVar;
        this.f24184b |= 8;
        j();
        return this;
    }

    public int hashCode() {
        float f10 = this.f24185c;
        char[] cArr = w4.m.a;
        return w4.m.f(w4.m.f(w4.m.f(w4.m.f(w4.m.f(w4.m.f(w4.m.f(w4.m.g(w4.m.g(w4.m.g(w4.m.g((((w4.m.g(w4.m.f((w4.m.f((w4.m.f(((Float.floatToIntBits(f10) + 527) * 31) + this.f24189h, this.f24188g) * 31) + this.f24191j, this.f24190i) * 31) + this.f24199r, this.f24198q), this.f24192k) * 31) + this.f24193l) * 31) + this.f24194m, this.f24196o), this.f24197p), this.f24205y), this.f24206z), this.f24186d), this.f24187f), this.f24200s), this.f24201t), this.u), this.f24195n), this.f24203w);
    }

    public final a i(l lVar) {
        if (this.f24204x) {
            return clone().i(lVar);
        }
        this.f24200s.f17107b.remove(lVar);
        j();
        return this;
    }

    public final void j() {
        if (!this.f24202v) {
        } else {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a k(l lVar, Object obj) {
        if (this.f24204x) {
            return clone().k(lVar, obj);
        }
        com.bumptech.glide.c.l(lVar);
        com.bumptech.glide.c.l(obj);
        this.f24200s.f17107b.put(lVar, obj);
        j();
        return this;
    }

    public final a l(j jVar) {
        if (this.f24204x) {
            return clone().l(jVar);
        }
        this.f24195n = jVar;
        this.f24184b |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        j();
        return this;
    }

    public final a m() {
        if (this.f24204x) {
            return clone().m();
        }
        this.f24192k = false;
        this.f24184b |= NotificationCompat.FLAG_LOCAL_ONLY;
        j();
        return this;
    }

    public final a n(Resources.Theme theme) {
        if (this.f24204x) {
            return clone().n(theme);
        }
        this.f24203w = theme;
        if (theme != null) {
            this.f24184b |= 32768;
            return k(o4.d.f23133b, theme);
        }
        this.f24184b &= -32769;
        return i(o4.d.f23133b);
    }

    public final a o(q qVar, boolean z10) {
        if (this.f24204x) {
            return clone().o(qVar, z10);
        }
        r rVar = new r(qVar, z10);
        p(Bitmap.class, qVar, z10);
        p(Drawable.class, rVar, z10);
        p(BitmapDrawable.class, rVar, z10);
        p(p4.c.class, new p4.d(qVar), z10);
        j();
        return this;
    }

    public final a p(Class cls, q qVar, boolean z10) {
        if (this.f24204x) {
            return clone().p(cls, qVar, z10);
        }
        com.bumptech.glide.c.l(qVar);
        this.f24201t.put(cls, qVar);
        int i10 = this.f24184b | 2048;
        this.f24197p = true;
        int i11 = i10 | C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.f24184b = i11;
        this.A = false;
        if (z10) {
            this.f24184b = i11 | 131072;
            this.f24196o = true;
        }
        j();
        return this;
    }

    public final a q() {
        if (this.f24204x) {
            return clone().q();
        }
        this.B = true;
        this.f24184b |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        j();
        return this;
    }
}
