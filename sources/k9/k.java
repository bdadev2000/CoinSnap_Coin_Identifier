package k9;

import com.google.common.collect.g0;
import com.google.common.collect.h2;
import com.google.common.collect.r0;
import com.google.common.collect.x1;
import java.util.Comparator;
import v8.i1;

/* loaded from: classes3.dex */
public final class k extends m implements Comparable {

    /* renamed from: g, reason: collision with root package name */
    public final int f20434g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20435h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20436i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f20437j;

    /* renamed from: k, reason: collision with root package name */
    public final int f20438k;

    /* renamed from: l, reason: collision with root package name */
    public final int f20439l;

    /* renamed from: m, reason: collision with root package name */
    public final int f20440m;

    /* renamed from: n, reason: collision with root package name */
    public final int f20441n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f20442o;

    public k(int i10, i1 i1Var, int i11, h hVar, int i12, String str) {
        super(i10, i11, i1Var);
        boolean z10;
        boolean z11;
        r0 r0Var;
        int i13;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14 = 0;
        this.f20435h = o.c(i12, false);
        int i15 = this.f20446f.f24715f & (~hVar.f20521w);
        if ((i15 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20436i = z10;
        if ((i15 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f20437j = z11;
        r0 r0Var2 = hVar.u;
        if (r0Var2.isEmpty()) {
            r0Var = r0.o("");
        } else {
            r0Var = r0Var2;
        }
        int i16 = 0;
        while (true) {
            if (i16 < r0Var.size()) {
                i13 = o.b(this.f20446f, (String) r0Var.get(i16), hVar.f20522x);
                if (i13 > 0) {
                    break;
                } else {
                    i16++;
                }
            } else {
                i13 = 0;
                i16 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f20438k = i16;
        this.f20439l = i13;
        int i17 = this.f20446f.f24716g;
        int i18 = hVar.f20520v;
        int bitCount = (i17 == 0 || i17 != i18) ? Integer.bitCount(i17 & i18) : Integer.MAX_VALUE;
        this.f20440m = bitCount;
        if ((this.f20446f.f24716g & 1088) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f20442o = z12;
        if (o.e(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int b3 = o.b(this.f20446f, str, z13);
        this.f20441n = b3;
        if (i13 <= 0 && ((!r0Var2.isEmpty() || bitCount <= 0) && !this.f20436i && (!this.f20437j || b3 <= 0))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (o.c(i12, hVar.M) && z14) {
            i14 = 1;
        }
        this.f20434g = i14;
    }

    @Override // k9.m
    public final int a() {
        return this.f20434g;
    }

    @Override // k9.m
    public final /* bridge */ /* synthetic */ boolean b(m mVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k kVar) {
        g0 c10 = g0.a.c(this.f20435h, kVar.f20435h);
        Integer valueOf = Integer.valueOf(this.f20438k);
        Integer valueOf2 = Integer.valueOf(kVar.f20438k);
        Comparator comparator = x1.f12053b;
        comparator.getClass();
        h2 h2Var = h2.f11970b;
        g0 b3 = c10.b(valueOf, valueOf2, h2Var);
        int i10 = this.f20439l;
        g0 a = b3.a(i10, kVar.f20439l);
        int i11 = this.f20440m;
        g0 c11 = a.a(i11, kVar.f20440m).c(this.f20436i, kVar.f20436i);
        Boolean valueOf3 = Boolean.valueOf(this.f20437j);
        Boolean valueOf4 = Boolean.valueOf(kVar.f20437j);
        if (i10 != 0) {
            comparator = h2Var;
        }
        g0 a10 = c11.b(valueOf3, valueOf4, comparator).a(this.f20441n, kVar.f20441n);
        if (i11 == 0) {
            a10 = a10.d(this.f20442o, kVar.f20442o);
        }
        return a10.e();
    }
}
