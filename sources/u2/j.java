package u2;

import androidx.work.p;
import androidx.work.y;

/* loaded from: classes.dex */
public final class j {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public y f25452b;

    /* renamed from: c, reason: collision with root package name */
    public String f25453c;

    /* renamed from: d, reason: collision with root package name */
    public String f25454d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.work.h f25455e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.work.h f25456f;

    /* renamed from: g, reason: collision with root package name */
    public long f25457g;

    /* renamed from: h, reason: collision with root package name */
    public long f25458h;

    /* renamed from: i, reason: collision with root package name */
    public long f25459i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.work.d f25460j;

    /* renamed from: k, reason: collision with root package name */
    public int f25461k;

    /* renamed from: l, reason: collision with root package name */
    public int f25462l;

    /* renamed from: m, reason: collision with root package name */
    public long f25463m;

    /* renamed from: n, reason: collision with root package name */
    public long f25464n;

    /* renamed from: o, reason: collision with root package name */
    public long f25465o;

    /* renamed from: p, reason: collision with root package name */
    public long f25466p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25467q;

    /* renamed from: r, reason: collision with root package name */
    public int f25468r;

    static {
        p.g("WorkSpec");
    }

    public j(String str, String str2) {
        this.f25452b = y.ENQUEUED;
        androidx.work.h hVar = androidx.work.h.f2197c;
        this.f25455e = hVar;
        this.f25456f = hVar;
        this.f25460j = androidx.work.d.f2187i;
        this.f25462l = 1;
        this.f25463m = 30000L;
        this.f25466p = -1L;
        this.f25468r = 1;
        this.a = str;
        this.f25453c = str2;
    }

    public final long a() {
        boolean z10;
        long j3;
        long j10;
        long scalb;
        boolean z11 = true;
        boolean z12 = false;
        if (this.f25452b == y.ENQUEUED && this.f25461k > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f25462l == 2) {
                z12 = true;
            }
            if (z12) {
                scalb = this.f25463m * this.f25461k;
            } else {
                scalb = Math.scalb((float) this.f25463m, this.f25461k - 1);
            }
            j10 = this.f25464n;
            j3 = Math.min(18000000L, scalb);
        } else {
            long j11 = 0;
            if (c()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j12 = this.f25464n;
                if (j12 == 0) {
                    j12 = this.f25457g + currentTimeMillis;
                }
                long j13 = this.f25459i;
                long j14 = this.f25458h;
                if (j13 == j14) {
                    z11 = false;
                }
                if (z11) {
                    if (j12 == 0) {
                        j11 = j13 * (-1);
                    }
                    return j12 + j14 + j11;
                }
                if (j12 != 0) {
                    j11 = j14;
                }
                return j12 + j11;
            }
            j3 = this.f25464n;
            if (j3 == 0) {
                j3 = System.currentTimeMillis();
            }
            j10 = this.f25457g;
        }
        return j3 + j10;
    }

    public final boolean b() {
        return !androidx.work.d.f2187i.equals(this.f25460j);
    }

    public final boolean c() {
        return this.f25458h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f25457g != jVar.f25457g || this.f25458h != jVar.f25458h || this.f25459i != jVar.f25459i || this.f25461k != jVar.f25461k || this.f25463m != jVar.f25463m || this.f25464n != jVar.f25464n || this.f25465o != jVar.f25465o || this.f25466p != jVar.f25466p || this.f25467q != jVar.f25467q || !this.a.equals(jVar.a) || this.f25452b != jVar.f25452b || !this.f25453c.equals(jVar.f25453c)) {
            return false;
        }
        String str = this.f25454d;
        if (str == null ? jVar.f25454d != null : !str.equals(jVar.f25454d)) {
            return false;
        }
        if (this.f25455e.equals(jVar.f25455e) && this.f25456f.equals(jVar.f25456f) && this.f25460j.equals(jVar.f25460j) && this.f25462l == jVar.f25462l && this.f25468r == jVar.f25468r) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int c10 = vd.e.c(this.f25453c, (this.f25452b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        String str = this.f25454d;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode = (this.f25456f.hashCode() + ((this.f25455e.hashCode() + ((c10 + i10) * 31)) * 31)) * 31;
        long j3 = this.f25457g;
        int i11 = (hashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j10 = this.f25458h;
        int i12 = (i11 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f25459i;
        int b3 = (t.h.b(this.f25462l) + ((((this.f25460j.hashCode() + ((i12 + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31) + this.f25461k) * 31)) * 31;
        long j12 = this.f25463m;
        int i13 = (b3 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f25464n;
        int i14 = (i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f25465o;
        int i15 = (i14 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f25466p;
        return t.h.b(this.f25468r) + ((((i15 + ((int) (j15 ^ (j15 >>> 32)))) * 31) + (this.f25467q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return vd.e.h(new StringBuilder("{WorkSpec: "), this.a, "}");
    }

    public j(j jVar) {
        this.f25452b = y.ENQUEUED;
        androidx.work.h hVar = androidx.work.h.f2197c;
        this.f25455e = hVar;
        this.f25456f = hVar;
        this.f25460j = androidx.work.d.f2187i;
        this.f25462l = 1;
        this.f25463m = 30000L;
        this.f25466p = -1L;
        this.f25468r = 1;
        this.a = jVar.a;
        this.f25453c = jVar.f25453c;
        this.f25452b = jVar.f25452b;
        this.f25454d = jVar.f25454d;
        this.f25455e = new androidx.work.h(jVar.f25455e);
        this.f25456f = new androidx.work.h(jVar.f25456f);
        this.f25457g = jVar.f25457g;
        this.f25458h = jVar.f25458h;
        this.f25459i = jVar.f25459i;
        this.f25460j = new androidx.work.d(jVar.f25460j);
        this.f25461k = jVar.f25461k;
        this.f25462l = jVar.f25462l;
        this.f25463m = jVar.f25463m;
        this.f25464n = jVar.f25464n;
        this.f25465o = jVar.f25465o;
        this.f25466p = jVar.f25466p;
        this.f25467q = jVar.f25467q;
        this.f25468r = jVar.f25468r;
    }
}
