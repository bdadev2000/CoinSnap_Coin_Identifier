package n1;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class x0 implements l1.f, i {

    /* renamed from: a, reason: collision with root package name */
    public final String f31150a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f31151b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31152c;
    public int d;
    public final String[] e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f31153f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f31154g;

    /* renamed from: h, reason: collision with root package name */
    public Map f31155h;

    /* renamed from: i, reason: collision with root package name */
    public final d0.h f31156i;

    /* renamed from: j, reason: collision with root package name */
    public final d0.h f31157j;

    /* renamed from: k, reason: collision with root package name */
    public final d0.h f31158k;

    public x0(String str, c0 c0Var, int i2) {
        p0.a.s(str, "serialName");
        this.f31150a = str;
        this.f31151b = c0Var;
        this.f31152c = i2;
        this.d = -1;
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i4 = this.f31152c;
        this.f31153f = new List[i4];
        this.f31154g = new boolean[i4];
        this.f31155h = e0.x.f30219a;
        d0.i iVar = d0.i.f30132b;
        this.f31156i = b1.f0.s(iVar, new w0(this, 0));
        this.f31157j = b1.f0.s(iVar, new w0(this, 1));
        this.f31158k = b1.f0.s(iVar, new w0(this, 2));
    }

    @Override // n1.i
    public final Set a() {
        return this.f31155h.keySet();
    }

    @Override // l1.f
    public final boolean b() {
        return false;
    }

    @Override // l1.f
    public l1.l c() {
        return l1.c.f31020b;
    }

    @Override // l1.f
    public final int d() {
        return this.f31152c;
    }

    @Override // l1.f
    public final String e(int i2) {
        return this.e[i2];
    }

    @Override // l1.f
    public l1.f f(int i2) {
        return ((k1.a[]) this.f31156i.getValue())[i2].b();
    }

    @Override // l1.f
    public final String g() {
        return this.f31150a;
    }

    @Override // l1.f
    public final boolean h(int i2) {
        return this.f31154g[i2];
    }

    public int hashCode() {
        return ((Number) this.f31158k.getValue()).intValue();
    }

    public String toString() {
        return e0.u.K0(p0.a.F0(0, this.f31152c), ", ", android.support.v4.media.d.q(new StringBuilder(), this.f31150a, '('), ")", new t0(this, 1), 24);
    }
}
