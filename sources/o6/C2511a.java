package o6;

import G7.j;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentTransaction;

/* renamed from: o6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2511a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f21987a;
    public Integer b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f21988c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f21989d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f21990e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f21991f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f21992g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f21993h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21994i;

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f21995j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f21996k;
    public final Integer l;
    public final Integer m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f21997n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f21998o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f21999p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f22000q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f22001r;

    public C2511a(Integer num, Integer num2, Integer num3, Integer num4, String str, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, int i9) {
        Integer num13;
        Integer num14;
        Integer num15;
        Integer num16;
        String str2;
        Integer num17;
        Integer num18;
        Integer num19;
        Integer num20;
        Integer num21;
        Integer num22;
        Integer num23;
        if ((i9 & 1) != 0) {
            num13 = null;
        } else {
            num13 = num;
        }
        if ((i9 & 2) != 0) {
            num14 = null;
        } else {
            num14 = num2;
        }
        if ((i9 & 4) != 0) {
            num15 = null;
        } else {
            num15 = num3;
        }
        if ((i9 & 8) != 0) {
            num16 = null;
        } else {
            num16 = num4;
        }
        if ((i9 & 512) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        if ((i9 & 1024) != 0) {
            num17 = null;
        } else {
            num17 = num5;
        }
        if ((i9 & 2048) != 0) {
            num18 = null;
        } else {
            num18 = num6;
        }
        if ((i9 & 4096) != 0) {
            num19 = null;
        } else {
            num19 = num7;
        }
        if ((i9 & FragmentTransaction.TRANSIT_EXIT_MASK) != 0) {
            num20 = null;
        } else {
            num20 = num8;
        }
        if ((32768 & i9) != 0) {
            num21 = null;
        } else {
            num21 = num10;
        }
        if ((65536 & i9) != 0) {
            num22 = null;
        } else {
            num22 = num11;
        }
        if ((i9 & 131072) != 0) {
            num23 = null;
        } else {
            num23 = num12;
        }
        j.e(str2, "contentDescription");
        this.f21987a = num13;
        this.b = num14;
        this.f21988c = num15;
        this.f21989d = num16;
        this.f21990e = null;
        this.f21991f = null;
        this.f21992g = null;
        this.f21993h = null;
        this.f21994i = false;
        this.f21995j = str2;
        this.f21996k = num17;
        this.l = num18;
        this.m = num19;
        this.f21997n = num20;
        this.f21998o = num9;
        this.f21999p = num21;
        this.f22000q = num22;
        this.f22001r = num23;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2511a)) {
            return false;
        }
        C2511a c2511a = (C2511a) obj;
        if (j.a(this.f21987a, c2511a.f21987a) && j.a(this.b, c2511a.b) && j.a(this.f21988c, c2511a.f21988c) && j.a(this.f21989d, c2511a.f21989d) && j.a(this.f21990e, c2511a.f21990e) && j.a(this.f21991f, c2511a.f21991f) && j.a(this.f21992g, c2511a.f21992g) && j.a(this.f21993h, c2511a.f21993h) && this.f21994i == c2511a.f21994i && j.a(this.f21995j, c2511a.f21995j) && j.a(this.f21996k, c2511a.f21996k) && j.a(this.l, c2511a.l) && j.a(this.m, c2511a.m) && j.a(this.f21997n, c2511a.f21997n) && j.a(this.f21998o, c2511a.f21998o) && j.a(this.f21999p, c2511a.f21999p) && j.a(this.f22000q, c2511a.f22000q) && j.a(this.f22001r, c2511a.f22001r)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        Integer num = this.f21987a;
        int i9 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = hashCode * 31;
        Integer num2 = this.b;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Integer num3 = this.f21988c;
        if (num3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Integer num4 = this.f21989d;
        if (num4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Drawable drawable = this.f21990e;
        if (drawable == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = drawable.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        Drawable drawable2 = this.f21991f;
        if (drawable2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = drawable2.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        Drawable drawable3 = this.f21992g;
        if (drawable3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = drawable3.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        Drawable drawable4 = this.f21993h;
        if (drawable4 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = drawable4.hashCode();
        }
        int hashCode16 = (this.f21995j.hashCode() + ((Boolean.hashCode(this.f21994i) + ((i16 + hashCode8) * 31)) * 31)) * 31;
        Integer num5 = this.f21996k;
        if (num5 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num5.hashCode();
        }
        int i17 = (hashCode16 + hashCode9) * 31;
        Integer num6 = this.l;
        if (num6 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num6.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        Integer num7 = this.m;
        if (num7 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = num7.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        Integer num8 = this.f21997n;
        if (num8 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = num8.hashCode();
        }
        int i20 = (i19 + hashCode12) * 31;
        Integer num9 = this.f21998o;
        if (num9 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = num9.hashCode();
        }
        int i21 = (i20 + hashCode13) * 31;
        Integer num10 = this.f21999p;
        if (num10 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = num10.hashCode();
        }
        int i22 = (i21 + hashCode14) * 31;
        Integer num11 = this.f22000q;
        if (num11 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = num11.hashCode();
        }
        int i23 = (i22 + hashCode15) * 31;
        Integer num12 = this.f22001r;
        if (num12 != null) {
            i9 = num12.hashCode();
        }
        return i23 + i9;
    }

    public final String toString() {
        return "VectorTextViewParams(drawableStartRes=" + this.f21987a + ", drawableEndRes=" + this.b + ", drawableBottomRes=" + this.f21988c + ", drawableTopRes=" + this.f21989d + ", drawableStart=" + this.f21990e + ", drawableEnd=" + this.f21991f + ", drawableBottom=" + this.f21992g + ", drawableTop=" + this.f21993h + ", isRtlLayout=" + this.f21994i + ", contentDescription=" + ((Object) this.f21995j) + ", compoundDrawablePadding=" + this.f21996k + ", iconWidth=" + this.l + ", iconHeight=" + this.m + ", compoundDrawablePaddingRes=" + this.f21997n + ", tintColor=" + this.f21998o + ", widthRes=" + this.f21999p + ", heightRes=" + this.f22000q + ", squareSizeRes=" + this.f22001r + ")";
    }
}
