package androidx.compose.ui.graphics.vector;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import p0.a;

@Immutable
/* loaded from: classes3.dex */
public final class VectorPath extends VectorNode {

    /* renamed from: a, reason: collision with root package name */
    public final String f15478a;

    /* renamed from: b, reason: collision with root package name */
    public final List f15479b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15480c;
    public final Brush d;

    /* renamed from: f, reason: collision with root package name */
    public final float f15481f;

    /* renamed from: g, reason: collision with root package name */
    public final Brush f15482g;

    /* renamed from: h, reason: collision with root package name */
    public final float f15483h;

    /* renamed from: i, reason: collision with root package name */
    public final float f15484i;

    /* renamed from: j, reason: collision with root package name */
    public final int f15485j;

    /* renamed from: k, reason: collision with root package name */
    public final int f15486k;

    /* renamed from: l, reason: collision with root package name */
    public final float f15487l;

    /* renamed from: m, reason: collision with root package name */
    public final float f15488m;

    /* renamed from: n, reason: collision with root package name */
    public final float f15489n;

    /* renamed from: o, reason: collision with root package name */
    public final float f15490o;

    public VectorPath(String str, List list, int i2, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8) {
        this.f15478a = str;
        this.f15479b = list;
        this.f15480c = i2;
        this.d = brush;
        this.f15481f = f2;
        this.f15482g = brush2;
        this.f15483h = f3;
        this.f15484i = f4;
        this.f15485j = i3;
        this.f15486k = i4;
        this.f15487l = f5;
        this.f15488m = f6;
        this.f15489n = f7;
        this.f15490o = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && VectorPath.class == obj.getClass()) {
            VectorPath vectorPath = (VectorPath) obj;
            return a.g(this.f15478a, vectorPath.f15478a) && a.g(this.d, vectorPath.d) && this.f15481f == vectorPath.f15481f && a.g(this.f15482g, vectorPath.f15482g) && this.f15483h == vectorPath.f15483h && this.f15484i == vectorPath.f15484i && StrokeCap.a(this.f15485j, vectorPath.f15485j) && StrokeJoin.a(this.f15486k, vectorPath.f15486k) && this.f15487l == vectorPath.f15487l && this.f15488m == vectorPath.f15488m && this.f15489n == vectorPath.f15489n && this.f15490o == vectorPath.f15490o && this.f15480c == vectorPath.f15480c && a.g(this.f15479b, vectorPath.f15479b);
        }
        return false;
    }

    public final int hashCode() {
        int f2 = d.f(this.f15479b, this.f15478a.hashCode() * 31, 31);
        Brush brush = this.d;
        int b2 = d.b(this.f15481f, (f2 + (brush != null ? brush.hashCode() : 0)) * 31, 31);
        Brush brush2 = this.f15482g;
        return Integer.hashCode(this.f15480c) + d.b(this.f15490o, d.b(this.f15489n, d.b(this.f15488m, d.b(this.f15487l, d.c(this.f15486k, d.c(this.f15485j, d.b(this.f15484i, d.b(this.f15483h, (b2 + (brush2 != null ? brush2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
