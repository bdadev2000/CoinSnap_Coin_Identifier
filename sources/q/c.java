package q;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import b1.o0;
import b1.z;
import g1.u;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final z f31238a;

    /* renamed from: b, reason: collision with root package name */
    public final z f31239b;

    /* renamed from: c, reason: collision with root package name */
    public final z f31240c;
    public final z d;
    public final u.b e;

    /* renamed from: f, reason: collision with root package name */
    public final r.d f31241f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f31242g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f31243h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f31244i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f31245j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f31246k;

    /* renamed from: l, reason: collision with root package name */
    public final Drawable f31247l;

    /* renamed from: m, reason: collision with root package name */
    public final b f31248m;

    /* renamed from: n, reason: collision with root package name */
    public final b f31249n;

    /* renamed from: o, reason: collision with root package name */
    public final b f31250o;

    public c() {
        h1.d dVar = o0.f22355a;
        c1.e eVar = ((c1.e) u.f30639a).f22411g;
        h1.c cVar = o0.f22356b;
        u.a aVar = u.b.f31367a;
        r.d dVar2 = r.d.f31344c;
        Bitmap.Config config = v.g.f31379b;
        b bVar = b.f31234c;
        this.f31238a = eVar;
        this.f31239b = cVar;
        this.f31240c = cVar;
        this.d = cVar;
        this.e = aVar;
        this.f31241f = dVar2;
        this.f31242g = config;
        this.f31243h = true;
        this.f31244i = false;
        this.f31245j = null;
        this.f31246k = null;
        this.f31247l = null;
        this.f31248m = bVar;
        this.f31249n = bVar;
        this.f31250o = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (p0.a.g(this.f31238a, cVar.f31238a) && p0.a.g(this.f31239b, cVar.f31239b) && p0.a.g(this.f31240c, cVar.f31240c) && p0.a.g(this.d, cVar.d) && p0.a.g(this.e, cVar.e) && this.f31241f == cVar.f31241f && this.f31242g == cVar.f31242g && this.f31243h == cVar.f31243h && this.f31244i == cVar.f31244i && p0.a.g(this.f31245j, cVar.f31245j) && p0.a.g(this.f31246k, cVar.f31246k) && p0.a.g(this.f31247l, cVar.f31247l) && this.f31248m == cVar.f31248m && this.f31249n == cVar.f31249n && this.f31250o == cVar.f31250o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.f31240c.hashCode() + ((this.f31239b.hashCode() + (this.f31238a.hashCode() * 31)) * 31)) * 31)) * 31;
        ((u.a) this.e).getClass();
        int g2 = android.support.v4.media.d.g(this.f31244i, android.support.v4.media.d.g(this.f31243h, (this.f31242g.hashCode() + ((this.f31241f.hashCode() + ((u.a.class.hashCode() + hashCode) * 31)) * 31)) * 31, 31), 31);
        Drawable drawable = this.f31245j;
        int hashCode2 = (g2 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f31246k;
        int hashCode3 = (hashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f31247l;
        return this.f31250o.hashCode() + ((this.f31249n.hashCode() + ((this.f31248m.hashCode() + ((hashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31)) * 31);
    }
}
