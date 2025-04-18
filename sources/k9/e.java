package k9;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.common.collect.g0;
import com.google.common.collect.h2;
import com.google.common.collect.x1;
import com.google.common.collect.y1;
import java.util.Locale;
import n9.h0;
import s7.r0;
import v8.i1;

/* loaded from: classes3.dex */
public final class e extends m implements Comparable {

    /* renamed from: g, reason: collision with root package name */
    public final int f20405g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20406h;

    /* renamed from: i, reason: collision with root package name */
    public final String f20407i;

    /* renamed from: j, reason: collision with root package name */
    public final h f20408j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f20409k;

    /* renamed from: l, reason: collision with root package name */
    public final int f20410l;

    /* renamed from: m, reason: collision with root package name */
    public final int f20411m;

    /* renamed from: n, reason: collision with root package name */
    public final int f20412n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f20413o;

    /* renamed from: p, reason: collision with root package name */
    public final int f20414p;

    /* renamed from: q, reason: collision with root package name */
    public final int f20415q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f20416r;

    /* renamed from: s, reason: collision with root package name */
    public final int f20417s;

    /* renamed from: t, reason: collision with root package name */
    public final int f20418t;
    public final int u;

    /* renamed from: v, reason: collision with root package name */
    public final int f20419v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f20420w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f20421x;

    public e(int i10, i1 i1Var, int i11, h hVar, int i12, boolean z10, d dVar) {
        super(i10, i11, i1Var);
        int i13;
        int i14;
        int bitCount;
        boolean z11;
        boolean z12;
        boolean z13;
        String locale;
        String[] strArr;
        int i15;
        boolean z14;
        boolean z15;
        boolean z16;
        this.f20408j = hVar;
        this.f20407i = o.e(this.f20446f.f24714d);
        int i16 = 0;
        this.f20409k = o.c(i12, false);
        int i17 = 0;
        while (true) {
            i13 = Integer.MAX_VALUE;
            if (i17 < hVar.f20515p.size()) {
                i14 = o.b(this.f20446f, (String) hVar.f20515p.get(i17), false);
                if (i14 > 0) {
                    break;
                } else {
                    i17++;
                }
            } else {
                i14 = 0;
                i17 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f20411m = i17;
        this.f20410l = i14;
        int i18 = this.f20446f.f24716g;
        int i19 = hVar.f20516q;
        if (i18 != 0 && i18 == i19) {
            bitCount = Integer.MAX_VALUE;
        } else {
            bitCount = Integer.bitCount(i18 & i19);
        }
        this.f20412n = bitCount;
        r0 r0Var = this.f20446f;
        int i20 = r0Var.f24716g;
        if (i20 != 0 && (i20 & 1) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f20413o = z11;
        if ((r0Var.f24715f & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f20416r = z12;
        int i21 = r0Var.A;
        this.f20417s = i21;
        this.f20418t = r0Var.B;
        int i22 = r0Var.f24719j;
        this.u = i22;
        if ((i22 == -1 || i22 <= hVar.f20518s) && ((i21 == -1 || i21 <= hVar.f20517r) && dVar.apply(r0Var))) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f20406h = z13;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i23 = h0.a;
        if (i23 >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            String[] strArr2 = new String[1];
            Locale locale2 = configuration.locale;
            if (i23 >= 21) {
                locale = locale2.toLanguageTag();
            } else {
                locale = locale2.toString();
            }
            strArr2[0] = locale;
            strArr = strArr2;
        }
        for (int i24 = 0; i24 < strArr.length; i24++) {
            strArr[i24] = h0.I(strArr[i24]);
        }
        int i25 = 0;
        while (true) {
            if (i25 < strArr.length) {
                i15 = o.b(this.f20446f, strArr[i25], false);
                if (i15 > 0) {
                    break;
                } else {
                    i25++;
                }
            } else {
                i15 = 0;
                i25 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f20414p = i25;
        this.f20415q = i15;
        int i26 = 0;
        while (true) {
            com.google.common.collect.r0 r0Var2 = hVar.f20519t;
            if (i26 >= r0Var2.size()) {
                break;
            }
            String str = this.f20446f.f24723n;
            if (str != null && str.equals(r0Var2.get(i26))) {
                i13 = i26;
                break;
            }
            i26++;
        }
        this.f20419v = i13;
        if ((i12 & 384) == 128) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f20420w = z14;
        if ((i12 & 64) == 64) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f20421x = z15;
        h hVar2 = this.f20408j;
        if (o.c(i12, hVar2.M) && ((z16 = this.f20406h) || hVar2.G)) {
            i16 = (!o.c(i12, false) || !z16 || this.f20446f.f24719j == -1 || hVar2.f20524z || hVar2.f20523y || (!hVar2.O && z10)) ? 1 : 2;
        }
        this.f20405g = i16;
    }

    @Override // k9.m
    public final int a() {
        return this.f20405g;
    }

    @Override // k9.m
    public final boolean b(m mVar) {
        int i10;
        String str;
        int i11;
        e eVar = (e) mVar;
        h hVar = this.f20408j;
        boolean z10 = hVar.J;
        r0 r0Var = eVar.f20446f;
        r0 r0Var2 = this.f20446f;
        if ((z10 || ((i11 = r0Var2.A) != -1 && i11 == r0Var.A)) && ((hVar.H || ((str = r0Var2.f24723n) != null && TextUtils.equals(str, r0Var.f24723n))) && (hVar.I || ((i10 = r0Var2.B) != -1 && i10 == r0Var.B)))) {
            if (!hVar.K) {
                if (this.f20420w != eVar.f20420w || this.f20421x != eVar.f20421x) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e eVar) {
        y1 b3;
        y1 y1Var;
        boolean z10 = this.f20409k;
        boolean z11 = this.f20406h;
        if (z11 && z10) {
            b3 = o.f20461j;
        } else {
            b3 = o.f20461j.b();
        }
        g0 c10 = g0.a.c(z10, eVar.f20409k);
        Integer valueOf = Integer.valueOf(this.f20411m);
        Integer valueOf2 = Integer.valueOf(eVar.f20411m);
        x1.f12053b.getClass();
        h2 h2Var = h2.f11970b;
        g0 b10 = c10.b(valueOf, valueOf2, h2Var).a(this.f20410l, eVar.f20410l).a(this.f20412n, eVar.f20412n).c(this.f20416r, eVar.f20416r).c(this.f20413o, eVar.f20413o).b(Integer.valueOf(this.f20414p), Integer.valueOf(eVar.f20414p), h2Var).a(this.f20415q, eVar.f20415q).c(z11, eVar.f20406h).b(Integer.valueOf(this.f20419v), Integer.valueOf(eVar.f20419v), h2Var);
        int i10 = this.u;
        Integer valueOf3 = Integer.valueOf(i10);
        int i11 = eVar.u;
        Integer valueOf4 = Integer.valueOf(i11);
        if (this.f20408j.f20523y) {
            y1Var = o.f20461j.b();
        } else {
            y1Var = o.f20462k;
        }
        g0 b11 = b10.b(valueOf3, valueOf4, y1Var).c(this.f20420w, eVar.f20420w).c(this.f20421x, eVar.f20421x).b(Integer.valueOf(this.f20417s), Integer.valueOf(eVar.f20417s), b3).b(Integer.valueOf(this.f20418t), Integer.valueOf(eVar.f20418t), b3);
        Integer valueOf5 = Integer.valueOf(i10);
        Integer valueOf6 = Integer.valueOf(i11);
        if (!h0.a(this.f20407i, eVar.f20407i)) {
            b3 = o.f20462k;
        }
        return b11.b(valueOf5, valueOf6, b3).e();
    }
}
