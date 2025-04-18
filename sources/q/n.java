package q;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import okhttp3.Headers;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31314a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f31315b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorSpace f31316c;
    public final r.g d;
    public final r.f e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31317f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31318g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f31319h;

    /* renamed from: i, reason: collision with root package name */
    public final String f31320i;

    /* renamed from: j, reason: collision with root package name */
    public final Headers f31321j;

    /* renamed from: k, reason: collision with root package name */
    public final s f31322k;

    /* renamed from: l, reason: collision with root package name */
    public final o f31323l;

    /* renamed from: m, reason: collision with root package name */
    public final b f31324m;

    /* renamed from: n, reason: collision with root package name */
    public final b f31325n;

    /* renamed from: o, reason: collision with root package name */
    public final b f31326o;

    public n(Context context, Bitmap.Config config, ColorSpace colorSpace, r.g gVar, r.f fVar, boolean z2, boolean z3, boolean z4, String str, Headers headers, s sVar, o oVar, b bVar, b bVar2, b bVar3) {
        this.f31314a = context;
        this.f31315b = config;
        this.f31316c = colorSpace;
        this.d = gVar;
        this.e = fVar;
        this.f31317f = z2;
        this.f31318g = z3;
        this.f31319h = z4;
        this.f31320i = str;
        this.f31321j = headers;
        this.f31322k = sVar;
        this.f31323l = oVar;
        this.f31324m = bVar;
        this.f31325n = bVar2;
        this.f31326o = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (p0.a.g(this.f31314a, nVar.f31314a) && this.f31315b == nVar.f31315b && p0.a.g(this.f31316c, nVar.f31316c) && p0.a.g(this.d, nVar.d) && this.e == nVar.e && this.f31317f == nVar.f31317f && this.f31318g == nVar.f31318g && this.f31319h == nVar.f31319h && p0.a.g(this.f31320i, nVar.f31320i) && p0.a.g(this.f31321j, nVar.f31321j) && p0.a.g(this.f31322k, nVar.f31322k) && p0.a.g(this.f31323l, nVar.f31323l) && this.f31324m == nVar.f31324m && this.f31325n == nVar.f31325n && this.f31326o == nVar.f31326o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f31315b.hashCode() + (this.f31314a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f31316c;
        int g2 = android.support.v4.media.d.g(this.f31319h, android.support.v4.media.d.g(this.f31318g, android.support.v4.media.d.g(this.f31317f, (this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31), 31), 31);
        String str = this.f31320i;
        return this.f31326o.hashCode() + ((this.f31325n.hashCode() + ((this.f31324m.hashCode() + ((this.f31323l.f31328a.hashCode() + ((this.f31322k.f31338a.hashCode() + ((this.f31321j.hashCode() + ((g2 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
