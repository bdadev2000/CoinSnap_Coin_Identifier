package a9;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;
import n9.h0;
import v8.u0;

/* loaded from: classes3.dex */
public final class b implements s7.i {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final n0.h L;

    /* renamed from: t, reason: collision with root package name */
    public static final b f359t;
    public static final String u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f360v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f361w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f362x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f363y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f364z;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f365b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f366c;

    /* renamed from: d, reason: collision with root package name */
    public final Layout.Alignment f367d;

    /* renamed from: f, reason: collision with root package name */
    public final Bitmap f368f;

    /* renamed from: g, reason: collision with root package name */
    public final float f369g;

    /* renamed from: h, reason: collision with root package name */
    public final int f370h;

    /* renamed from: i, reason: collision with root package name */
    public final int f371i;

    /* renamed from: j, reason: collision with root package name */
    public final float f372j;

    /* renamed from: k, reason: collision with root package name */
    public final int f373k;

    /* renamed from: l, reason: collision with root package name */
    public final float f374l;

    /* renamed from: m, reason: collision with root package name */
    public final float f375m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f376n;

    /* renamed from: o, reason: collision with root package name */
    public final int f377o;

    /* renamed from: p, reason: collision with root package name */
    public final int f378p;

    /* renamed from: q, reason: collision with root package name */
    public final float f379q;

    /* renamed from: r, reason: collision with root package name */
    public final int f380r;

    /* renamed from: s, reason: collision with root package name */
    public final float f381s;

    static {
        a aVar = new a();
        aVar.a = "";
        f359t = aVar.a();
        u = h0.E(0);
        f360v = h0.E(1);
        f361w = h0.E(2);
        f362x = h0.E(3);
        f363y = h0.E(4);
        f364z = h0.E(5);
        A = h0.E(6);
        B = h0.E(7);
        C = h0.E(8);
        D = h0.E(9);
        E = h0.E(10);
        F = h0.E(11);
        G = h0.E(12);
        H = h0.E(13);
        I = h0.E(14);
        J = h0.E(15);
        K = h0.E(16);
        L = new n0.h(4);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            u0.d(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f365b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f365b = charSequence.toString();
        } else {
            this.f365b = null;
        }
        this.f366c = alignment;
        this.f367d = alignment2;
        this.f368f = bitmap;
        this.f369g = f10;
        this.f370h = i10;
        this.f371i = i11;
        this.f372j = f11;
        this.f373k = i12;
        this.f374l = f13;
        this.f375m = f14;
        this.f376n = z10;
        this.f377o = i14;
        this.f378p = i13;
        this.f379q = f12;
        this.f380r = i15;
        this.f381s = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (TextUtils.equals(this.f365b, bVar.f365b) && this.f366c == bVar.f366c && this.f367d == bVar.f367d) {
            Bitmap bitmap = bVar.f368f;
            Bitmap bitmap2 = this.f368f;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f369g == bVar.f369g && this.f370h == bVar.f370h && this.f371i == bVar.f371i && this.f372j == bVar.f372j && this.f373k == bVar.f373k && this.f374l == bVar.f374l && this.f375m == bVar.f375m && this.f376n == bVar.f376n && this.f377o == bVar.f377o && this.f378p == bVar.f378p && this.f379q == bVar.f379q && this.f380r == bVar.f380r && this.f381s == bVar.f381s) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f365b, this.f366c, this.f367d, this.f368f, Float.valueOf(this.f369g), Integer.valueOf(this.f370h), Integer.valueOf(this.f371i), Float.valueOf(this.f372j), Integer.valueOf(this.f373k), Float.valueOf(this.f374l), Float.valueOf(this.f375m), Boolean.valueOf(this.f376n), Integer.valueOf(this.f377o), Integer.valueOf(this.f378p), Float.valueOf(this.f379q), Integer.valueOf(this.f380r), Float.valueOf(this.f381s)});
    }
}
