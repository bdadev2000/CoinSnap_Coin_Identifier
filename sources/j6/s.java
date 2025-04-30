package j6;

import android.view.View;
import java.util.List;
import u7.C2824o;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final View f21186a;
    public final List b;

    /* renamed from: c, reason: collision with root package name */
    public final n f21187c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21188d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21189e;

    /* renamed from: f, reason: collision with root package name */
    public final u f21190f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21191g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21192h;

    public s(View view, n nVar, int i9, int i10) {
        C2824o c2824o = C2824o.b;
        u uVar = u.b;
        G7.j.e(view, "anchor");
        this.f21186a = view;
        this.b = c2824o;
        this.f21187c = nVar;
        this.f21188d = i9;
        this.f21189e = i10;
        this.f21190f = uVar;
        this.f21191g = 0;
        this.f21192h = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (G7.j.a(this.f21186a, sVar.f21186a) && G7.j.a(this.b, sVar.b) && this.f21187c == sVar.f21187c && this.f21188d == sVar.f21188d && this.f21189e == sVar.f21189e && this.f21190f == sVar.f21190f && this.f21191g == sVar.f21191g && this.f21192h == sVar.f21192h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21192h) + ((Integer.hashCode(this.f21191g) + ((this.f21190f.hashCode() + ((Integer.hashCode(this.f21189e) + ((Integer.hashCode(this.f21188d) + ((this.f21187c.hashCode() + ((this.b.hashCode() + (this.f21186a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BalloonPlacement(anchor=");
        sb.append(this.f21186a);
        sb.append(", subAnchors=");
        sb.append(this.b);
        sb.append(", align=");
        sb.append(this.f21187c);
        sb.append(", xOff=");
        sb.append(this.f21188d);
        sb.append(", yOff=");
        sb.append(this.f21189e);
        sb.append(", type=");
        sb.append(this.f21190f);
        sb.append(", width=");
        sb.append(this.f21191g);
        sb.append(", height=");
        return AbstractC2914a.g(sb, this.f21192h, ")");
    }
}
