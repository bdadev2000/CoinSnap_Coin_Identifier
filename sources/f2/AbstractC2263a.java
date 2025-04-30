package f2;

import N1.i;
import N1.m;
import P1.l;
import W1.AbstractC0321e;
import W1.o;
import W1.t;
import a2.C0333b;
import a2.C0334c;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentTransaction;
import com.google.ar.core.ImageMetadata;
import i2.C2340c;
import j2.n;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2263a implements Cloneable {

    /* renamed from: B, reason: collision with root package name */
    public boolean f20268B;
    public int b;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f20272g;

    /* renamed from: h, reason: collision with root package name */
    public int f20273h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f20274i;

    /* renamed from: j, reason: collision with root package name */
    public int f20275j;

    /* renamed from: o, reason: collision with root package name */
    public boolean f20278o;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f20280q;

    /* renamed from: r, reason: collision with root package name */
    public int f20281r;

    /* renamed from: v, reason: collision with root package name */
    public boolean f20285v;

    /* renamed from: w, reason: collision with root package name */
    public Resources.Theme f20286w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20287x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f20288y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20289z;

    /* renamed from: c, reason: collision with root package name */
    public float f20269c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public l f20270d = l.f2354d;

    /* renamed from: f, reason: collision with root package name */
    public com.bumptech.glide.g f20271f = com.bumptech.glide.g.f12821d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20276k = true;
    public int l = -1;
    public int m = -1;

    /* renamed from: n, reason: collision with root package name */
    public N1.f f20277n = C2340c.b;

    /* renamed from: p, reason: collision with root package name */
    public boolean f20279p = true;

    /* renamed from: s, reason: collision with root package name */
    public i f20282s = new i();

    /* renamed from: t, reason: collision with root package name */
    public j2.c f20283t = new x.l();

    /* renamed from: u, reason: collision with root package name */
    public Class f20284u = Object.class;

    /* renamed from: A, reason: collision with root package name */
    public boolean f20267A = true;

    public static boolean f(int i9, int i10) {
        if ((i9 & i10) != 0) {
            return true;
        }
        return false;
    }

    public AbstractC2263a a(AbstractC2263a abstractC2263a) {
        if (this.f20287x) {
            return clone().a(abstractC2263a);
        }
        if (f(abstractC2263a.b, 2)) {
            this.f20269c = abstractC2263a.f20269c;
        }
        if (f(abstractC2263a.b, 262144)) {
            this.f20288y = abstractC2263a.f20288y;
        }
        if (f(abstractC2263a.b, 1048576)) {
            this.f20268B = abstractC2263a.f20268B;
        }
        if (f(abstractC2263a.b, 4)) {
            this.f20270d = abstractC2263a.f20270d;
        }
        if (f(abstractC2263a.b, 8)) {
            this.f20271f = abstractC2263a.f20271f;
        }
        if (f(abstractC2263a.b, 16)) {
            this.f20272g = abstractC2263a.f20272g;
            this.f20273h = 0;
            this.b &= -33;
        }
        if (f(abstractC2263a.b, 32)) {
            this.f20273h = abstractC2263a.f20273h;
            this.f20272g = null;
            this.b &= -17;
        }
        if (f(abstractC2263a.b, 64)) {
            this.f20274i = abstractC2263a.f20274i;
            this.f20275j = 0;
            this.b &= -129;
        }
        if (f(abstractC2263a.b, 128)) {
            this.f20275j = abstractC2263a.f20275j;
            this.f20274i = null;
            this.b &= -65;
        }
        if (f(abstractC2263a.b, NotificationCompat.FLAG_LOCAL_ONLY)) {
            this.f20276k = abstractC2263a.f20276k;
        }
        if (f(abstractC2263a.b, 512)) {
            this.m = abstractC2263a.m;
            this.l = abstractC2263a.l;
        }
        if (f(abstractC2263a.b, 1024)) {
            this.f20277n = abstractC2263a.f20277n;
        }
        if (f(abstractC2263a.b, 4096)) {
            this.f20284u = abstractC2263a.f20284u;
        }
        if (f(abstractC2263a.b, FragmentTransaction.TRANSIT_EXIT_MASK)) {
            this.f20280q = abstractC2263a.f20280q;
            this.f20281r = 0;
            this.b &= -16385;
        }
        if (f(abstractC2263a.b, 16384)) {
            this.f20281r = abstractC2263a.f20281r;
            this.f20280q = null;
            this.b &= -8193;
        }
        if (f(abstractC2263a.b, 32768)) {
            this.f20286w = abstractC2263a.f20286w;
        }
        if (f(abstractC2263a.b, 65536)) {
            this.f20279p = abstractC2263a.f20279p;
        }
        if (f(abstractC2263a.b, 131072)) {
            this.f20278o = abstractC2263a.f20278o;
        }
        if (f(abstractC2263a.b, 2048)) {
            this.f20283t.putAll(abstractC2263a.f20283t);
            this.f20267A = abstractC2263a.f20267A;
        }
        if (f(abstractC2263a.b, ImageMetadata.LENS_APERTURE)) {
            this.f20289z = abstractC2263a.f20289z;
        }
        if (!this.f20279p) {
            this.f20283t.clear();
            int i9 = this.b;
            this.f20278o = false;
            this.b = i9 & (-133121);
            this.f20267A = true;
        }
        this.b |= abstractC2263a.b;
        this.f20282s.b.i(abstractC2263a.f20282s.b);
        k();
        return this;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [x.l, j2.c, x.b] */
    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC2263a clone() {
        try {
            AbstractC2263a abstractC2263a = (AbstractC2263a) super.clone();
            i iVar = new i();
            abstractC2263a.f20282s = iVar;
            iVar.b.i(this.f20282s.b);
            ?? lVar = new x.l();
            abstractC2263a.f20283t = lVar;
            lVar.putAll(this.f20283t);
            abstractC2263a.f20285v = false;
            abstractC2263a.f20287x = false;
            return abstractC2263a;
        } catch (CloneNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final AbstractC2263a c(Class cls) {
        if (this.f20287x) {
            return clone().c(cls);
        }
        this.f20284u = cls;
        this.b |= 4096;
        k();
        return this;
    }

    public final AbstractC2263a d(l lVar) {
        if (this.f20287x) {
            return clone().d(lVar);
        }
        this.f20270d = lVar;
        this.b |= 4;
        k();
        return this;
    }

    public final boolean e(AbstractC2263a abstractC2263a) {
        if (Float.compare(abstractC2263a.f20269c, this.f20269c) == 0 && this.f20273h == abstractC2263a.f20273h && n.b(this.f20272g, abstractC2263a.f20272g) && this.f20275j == abstractC2263a.f20275j && n.b(this.f20274i, abstractC2263a.f20274i) && this.f20281r == abstractC2263a.f20281r && n.b(this.f20280q, abstractC2263a.f20280q) && this.f20276k == abstractC2263a.f20276k && this.l == abstractC2263a.l && this.m == abstractC2263a.m && this.f20278o == abstractC2263a.f20278o && this.f20279p == abstractC2263a.f20279p && this.f20288y == abstractC2263a.f20288y && this.f20289z == abstractC2263a.f20289z && this.f20270d.equals(abstractC2263a.f20270d) && this.f20271f == abstractC2263a.f20271f && this.f20282s.equals(abstractC2263a.f20282s) && this.f20283t.equals(abstractC2263a.f20283t) && this.f20284u.equals(abstractC2263a.f20284u) && n.b(this.f20277n, abstractC2263a.f20277n) && n.b(this.f20286w, abstractC2263a.f20286w)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC2263a) {
            return e((AbstractC2263a) obj);
        }
        return false;
    }

    public final AbstractC2263a g(o oVar, AbstractC0321e abstractC0321e) {
        if (this.f20287x) {
            return clone().g(oVar, abstractC0321e);
        }
        l(o.f3583g, oVar);
        return p(abstractC0321e, false);
    }

    public final AbstractC2263a h(int i9, int i10) {
        if (this.f20287x) {
            return clone().h(i9, i10);
        }
        this.m = i9;
        this.l = i10;
        this.b |= 512;
        k();
        return this;
    }

    public int hashCode() {
        float f9 = this.f20269c;
        char[] cArr = n.f21025a;
        return n.h(n.h(n.h(n.h(n.h(n.h(n.h(n.g(this.f20289z ? 1 : 0, n.g(this.f20288y ? 1 : 0, n.g(this.f20279p ? 1 : 0, n.g(this.f20278o ? 1 : 0, n.g(this.m, n.g(this.l, n.g(this.f20276k ? 1 : 0, n.h(n.g(this.f20281r, n.h(n.g(this.f20275j, n.h(n.g(this.f20273h, n.g(Float.floatToIntBits(f9), 17)), this.f20272g)), this.f20274i)), this.f20280q)))))))), this.f20270d), this.f20271f), this.f20282s), this.f20283t), this.f20284u), this.f20277n), this.f20286w);
    }

    public final AbstractC2263a i() {
        com.bumptech.glide.g gVar = com.bumptech.glide.g.f12822f;
        if (this.f20287x) {
            return clone().i();
        }
        this.f20271f = gVar;
        this.b |= 8;
        k();
        return this;
    }

    public final AbstractC2263a j(N1.h hVar) {
        if (this.f20287x) {
            return clone().j(hVar);
        }
        this.f20282s.b.remove(hVar);
        k();
        return this;
    }

    public final void k() {
        if (!this.f20285v) {
        } else {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final AbstractC2263a l(N1.h hVar, Object obj) {
        if (this.f20287x) {
            return clone().l(hVar, obj);
        }
        j2.g.b(hVar);
        j2.g.b(obj);
        this.f20282s.b.put(hVar, obj);
        k();
        return this;
    }

    public final AbstractC2263a m(N1.f fVar) {
        if (this.f20287x) {
            return clone().m(fVar);
        }
        this.f20277n = fVar;
        this.b |= 1024;
        k();
        return this;
    }

    public final AbstractC2263a n() {
        if (this.f20287x) {
            return clone().n();
        }
        this.f20276k = false;
        this.b |= NotificationCompat.FLAG_LOCAL_ONLY;
        k();
        return this;
    }

    public final AbstractC2263a o(Resources.Theme theme) {
        if (this.f20287x) {
            return clone().o(theme);
        }
        this.f20286w = theme;
        if (theme != null) {
            this.b |= 32768;
            return l(Y1.c.b, theme);
        }
        this.b &= -32769;
        return j(Y1.c.b);
    }

    public final AbstractC2263a p(m mVar, boolean z8) {
        if (this.f20287x) {
            return clone().p(mVar, z8);
        }
        t tVar = new t(mVar, z8);
        q(Bitmap.class, mVar, z8);
        q(Drawable.class, tVar, z8);
        q(BitmapDrawable.class, tVar, z8);
        q(C0333b.class, new C0334c(mVar), z8);
        k();
        return this;
    }

    public final AbstractC2263a q(Class cls, m mVar, boolean z8) {
        if (this.f20287x) {
            return clone().q(cls, mVar, z8);
        }
        j2.g.b(mVar);
        this.f20283t.put(cls, mVar);
        int i9 = this.b;
        this.f20279p = true;
        this.b = 67584 | i9;
        this.f20267A = false;
        if (z8) {
            this.b = i9 | 198656;
            this.f20278o = true;
        }
        k();
        return this;
    }

    public final AbstractC2263a r() {
        if (this.f20287x) {
            return clone().r();
        }
        this.f20268B = true;
        this.b |= 1048576;
        k();
        return this;
    }
}
