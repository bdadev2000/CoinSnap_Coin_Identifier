package q;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.Lifecycle;
import b1.z;
import java.util.List;
import okhttp3.Headers;

/* loaded from: classes.dex */
public final class j {
    public final Lifecycle A;
    public final r.h B;
    public final r.f C;
    public final o D;
    public final o.c E;
    public final Integer F;
    public final Drawable G;
    public final Integer H;
    public final Drawable I;
    public final Integer J;
    public final Drawable K;
    public final d L;
    public final c M;

    /* renamed from: a, reason: collision with root package name */
    public final Context f31291a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f31292b;

    /* renamed from: c, reason: collision with root package name */
    public final s.a f31293c;
    public final i d;
    public final o.c e;

    /* renamed from: f, reason: collision with root package name */
    public final String f31294f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f31295g;

    /* renamed from: h, reason: collision with root package name */
    public final ColorSpace f31296h;

    /* renamed from: i, reason: collision with root package name */
    public final r.d f31297i;

    /* renamed from: j, reason: collision with root package name */
    public final d0.k f31298j;

    /* renamed from: k, reason: collision with root package name */
    public final h.i f31299k;

    /* renamed from: l, reason: collision with root package name */
    public final List f31300l;

    /* renamed from: m, reason: collision with root package name */
    public final u.b f31301m;

    /* renamed from: n, reason: collision with root package name */
    public final Headers f31302n;

    /* renamed from: o, reason: collision with root package name */
    public final s f31303o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f31304p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f31305q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f31306r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f31307s;

    /* renamed from: t, reason: collision with root package name */
    public final b f31308t;

    /* renamed from: u, reason: collision with root package name */
    public final b f31309u;

    /* renamed from: v, reason: collision with root package name */
    public final b f31310v;
    public final z w;
    public final z x;

    /* renamed from: y, reason: collision with root package name */
    public final z f31311y;

    /* renamed from: z, reason: collision with root package name */
    public final z f31312z;

    public j(Context context, Object obj, s.a aVar, i iVar, o.c cVar, String str, Bitmap.Config config, ColorSpace colorSpace, r.d dVar, d0.k kVar, h.i iVar2, List list, u.b bVar, Headers headers, s sVar, boolean z2, boolean z3, boolean z4, boolean z5, b bVar2, b bVar3, b bVar4, z zVar, z zVar2, z zVar3, z zVar4, Lifecycle lifecycle, r.h hVar, r.f fVar, o oVar, o.c cVar2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, d dVar2, c cVar3) {
        this.f31291a = context;
        this.f31292b = obj;
        this.f31293c = aVar;
        this.d = iVar;
        this.e = cVar;
        this.f31294f = str;
        this.f31295g = config;
        this.f31296h = colorSpace;
        this.f31297i = dVar;
        this.f31298j = kVar;
        this.f31299k = iVar2;
        this.f31300l = list;
        this.f31301m = bVar;
        this.f31302n = headers;
        this.f31303o = sVar;
        this.f31304p = z2;
        this.f31305q = z3;
        this.f31306r = z4;
        this.f31307s = z5;
        this.f31308t = bVar2;
        this.f31309u = bVar3;
        this.f31310v = bVar4;
        this.w = zVar;
        this.x = zVar2;
        this.f31311y = zVar3;
        this.f31312z = zVar4;
        this.A = lifecycle;
        this.B = hVar;
        this.C = fVar;
        this.D = oVar;
        this.E = cVar2;
        this.F = num;
        this.G = drawable;
        this.H = num2;
        this.I = drawable2;
        this.J = num3;
        this.K = drawable3;
        this.L = dVar2;
        this.M = cVar3;
    }

    public static h a(j jVar) {
        Context context = jVar.f31291a;
        jVar.getClass();
        return new h(jVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (p0.a.g(this.f31291a, jVar.f31291a) && p0.a.g(this.f31292b, jVar.f31292b) && p0.a.g(this.f31293c, jVar.f31293c) && p0.a.g(this.d, jVar.d) && p0.a.g(this.e, jVar.e) && p0.a.g(this.f31294f, jVar.f31294f) && this.f31295g == jVar.f31295g && p0.a.g(this.f31296h, jVar.f31296h) && this.f31297i == jVar.f31297i && p0.a.g(this.f31298j, jVar.f31298j) && p0.a.g(this.f31299k, jVar.f31299k) && p0.a.g(this.f31300l, jVar.f31300l) && p0.a.g(this.f31301m, jVar.f31301m) && p0.a.g(this.f31302n, jVar.f31302n) && p0.a.g(this.f31303o, jVar.f31303o) && this.f31304p == jVar.f31304p && this.f31305q == jVar.f31305q && this.f31306r == jVar.f31306r && this.f31307s == jVar.f31307s && this.f31308t == jVar.f31308t && this.f31309u == jVar.f31309u && this.f31310v == jVar.f31310v && p0.a.g(this.w, jVar.w) && p0.a.g(this.x, jVar.x) && p0.a.g(this.f31311y, jVar.f31311y) && p0.a.g(this.f31312z, jVar.f31312z) && p0.a.g(this.E, jVar.E) && p0.a.g(this.F, jVar.F) && p0.a.g(this.G, jVar.G) && p0.a.g(this.H, jVar.H) && p0.a.g(this.I, jVar.I) && p0.a.g(this.J, jVar.J) && p0.a.g(this.K, jVar.K) && p0.a.g(this.A, jVar.A) && p0.a.g(this.B, jVar.B) && this.C == jVar.C && p0.a.g(this.D, jVar.D) && p0.a.g(this.L, jVar.L) && p0.a.g(this.M, jVar.M)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f31292b.hashCode() + (this.f31291a.hashCode() * 31)) * 31;
        s.a aVar = this.f31293c;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        i iVar = this.d;
        int hashCode3 = (hashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        o.c cVar = this.e;
        int hashCode4 = (hashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        String str = this.f31294f;
        int hashCode5 = (this.f31295g.hashCode() + ((hashCode4 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        ColorSpace colorSpace = this.f31296h;
        int hashCode6 = (this.f31297i.hashCode() + ((hashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31;
        d0.k kVar = this.f31298j;
        int hashCode7 = (hashCode6 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        h.i iVar2 = this.f31299k;
        int f2 = android.support.v4.media.d.f(this.f31300l, (hashCode7 + (iVar2 != null ? iVar2.hashCode() : 0)) * 31, 31);
        ((u.a) this.f31301m).getClass();
        int hashCode8 = (this.D.f31328a.hashCode() + ((this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((this.f31312z.hashCode() + ((this.f31311y.hashCode() + ((this.x.hashCode() + ((this.w.hashCode() + ((this.f31310v.hashCode() + ((this.f31309u.hashCode() + ((this.f31308t.hashCode() + android.support.v4.media.d.g(this.f31307s, android.support.v4.media.d.g(this.f31306r, android.support.v4.media.d.g(this.f31305q, android.support.v4.media.d.g(this.f31304p, (this.f31303o.f31338a.hashCode() + ((this.f31302n.hashCode() + ((u.a.class.hashCode() + f2) * 31)) * 31)) * 31, 31), 31), 31), 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        o.c cVar2 = this.E;
        int hashCode9 = (hashCode8 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        Integer num = this.F;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.G;
        int hashCode11 = (hashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.H;
        int hashCode12 = (hashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.I;
        int hashCode13 = (hashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.J;
        int hashCode14 = (hashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.K;
        return this.M.hashCode() + ((this.L.hashCode() + ((hashCode14 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31);
    }
}
