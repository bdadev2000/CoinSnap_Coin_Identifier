package d1;

import androidx.work.o;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* renamed from: d1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2168i {

    /* renamed from: a, reason: collision with root package name */
    public String f19801a;
    public int b = 1;

    /* renamed from: c, reason: collision with root package name */
    public String f19802c;

    /* renamed from: d, reason: collision with root package name */
    public String f19803d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.work.g f19804e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.work.g f19805f;

    /* renamed from: g, reason: collision with root package name */
    public long f19806g;

    /* renamed from: h, reason: collision with root package name */
    public long f19807h;

    /* renamed from: i, reason: collision with root package name */
    public long f19808i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.work.c f19809j;

    /* renamed from: k, reason: collision with root package name */
    public int f19810k;
    public int l;
    public long m;

    /* renamed from: n, reason: collision with root package name */
    public long f19811n;

    /* renamed from: o, reason: collision with root package name */
    public long f19812o;

    /* renamed from: p, reason: collision with root package name */
    public long f19813p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f19814q;

    /* renamed from: r, reason: collision with root package name */
    public int f19815r;

    static {
        o.g("WorkSpec");
    }

    public C2168i(String str, String str2) {
        androidx.work.g gVar = androidx.work.g.f5213c;
        this.f19804e = gVar;
        this.f19805f = gVar;
        this.f19809j = androidx.work.c.f5202i;
        this.l = 1;
        this.m = 30000L;
        this.f19813p = -1L;
        this.f19815r = 1;
        this.f19801a = str;
        this.f19802c = str2;
    }

    public final long a() {
        int i9;
        long scalb;
        if (this.b == 1 && (i9 = this.f19810k) > 0) {
            if (this.l == 2) {
                scalb = this.m * i9;
            } else {
                scalb = Math.scalb((float) this.m, i9 - 1);
            }
            return Math.min(18000000L, scalb) + this.f19811n;
        }
        long j7 = 0;
        if (c()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j9 = this.f19811n;
            if (j9 == 0) {
                j9 = this.f19806g + currentTimeMillis;
            }
            long j10 = this.f19808i;
            long j11 = this.f19807h;
            if (j10 != j11) {
                if (j9 == 0) {
                    j7 = j10 * (-1);
                }
                return j9 + j11 + j7;
            }
            if (j9 != 0) {
                j7 = j11;
            }
            return j9 + j7;
        }
        long j12 = this.f19811n;
        if (j12 == 0) {
            j12 = System.currentTimeMillis();
        }
        return j12 + this.f19806g;
    }

    public final boolean b() {
        return !androidx.work.c.f5202i.equals(this.f19809j);
    }

    public final boolean c() {
        if (this.f19807h != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2168i.class != obj.getClass()) {
            return false;
        }
        C2168i c2168i = (C2168i) obj;
        if (this.f19806g != c2168i.f19806g || this.f19807h != c2168i.f19807h || this.f19808i != c2168i.f19808i || this.f19810k != c2168i.f19810k || this.m != c2168i.m || this.f19811n != c2168i.f19811n || this.f19812o != c2168i.f19812o || this.f19813p != c2168i.f19813p || this.f19814q != c2168i.f19814q || !this.f19801a.equals(c2168i.f19801a) || this.b != c2168i.b || !this.f19802c.equals(c2168i.f19802c)) {
            return false;
        }
        String str = this.f19803d;
        if (str == null ? c2168i.f19803d != null : !str.equals(c2168i.f19803d)) {
            return false;
        }
        if (this.f19804e.equals(c2168i.f19804e) && this.f19805f.equals(c2168i.f19805f) && this.f19809j.equals(c2168i.f19809j) && this.l == c2168i.l && this.f19815r == c2168i.f19815r) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int b = AbstractC2914a.b((AbstractC2965e.d(this.b) + (this.f19801a.hashCode() * 31)) * 31, 31, this.f19802c);
        String str = this.f19803d;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int hashCode = (this.f19805f.hashCode() + ((this.f19804e.hashCode() + ((b + i9) * 31)) * 31)) * 31;
        long j7 = this.f19806g;
        int i10 = (hashCode + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j9 = this.f19807h;
        int i11 = (i10 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f19808i;
        int d2 = (AbstractC2965e.d(this.l) + ((((this.f19809j.hashCode() + ((i11 + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31) + this.f19810k) * 31)) * 31;
        long j11 = this.m;
        int i12 = (d2 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f19811n;
        int i13 = (i12 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f19812o;
        int i14 = (i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f19813p;
        return AbstractC2965e.d(this.f19815r) + ((((i14 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + (this.f19814q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return AbstractC2914a.h(new StringBuilder("{WorkSpec: "), this.f19801a, "}");
    }
}
