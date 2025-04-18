package l1;

import b1.f0;
import d0.p;
import e0.e0;
import e0.o;
import e0.u;
import e0.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.q;
import n1.v0;

/* loaded from: classes4.dex */
public final class g implements f, n1.i {

    /* renamed from: a, reason: collision with root package name */
    public final String f31029a;

    /* renamed from: b, reason: collision with root package name */
    public final l f31030b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31031c;
    public final List d;
    public final HashSet e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f31032f;

    /* renamed from: g, reason: collision with root package name */
    public final f[] f31033g;

    /* renamed from: h, reason: collision with root package name */
    public final List[] f31034h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f31035i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f31036j;

    /* renamed from: k, reason: collision with root package name */
    public final f[] f31037k;

    /* renamed from: l, reason: collision with root package name */
    public final p f31038l;

    public g(String str, l lVar, int i2, List list, a aVar) {
        p0.a.s(str, "serialName");
        this.f31029a = str;
        this.f31030b = lVar;
        this.f31031c = i2;
        this.d = aVar.f31012b;
        ArrayList arrayList = aVar.f31013c;
        p0.a.s(arrayList, "<this>");
        HashSet hashSet = new HashSet(q.g(e0.q.M(arrayList, 12)));
        u.W0(arrayList, hashSet);
        this.e = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f31032f = strArr;
        this.f31033g = v0.b(aVar.e);
        this.f31034h = (List[]) aVar.f31014f.toArray(new List[0]);
        this.f31035i = u.V0(aVar.f31015g);
        p0.a.s(strArr, "<this>");
        o oVar = new o(new g.b(strArr, 3));
        ArrayList arrayList2 = new ArrayList(e0.q.M(oVar, 10));
        Iterator it = oVar.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            arrayList2.add(new d0.k(zVar.f30222b, Integer.valueOf(zVar.f30221a)));
        }
        this.f31036j = e0.w(arrayList2);
        this.f31037k = v0.b(list);
        this.f31038l = f0.t(new g.b(this, 6));
    }

    @Override // n1.i
    public final Set a() {
        return this.e;
    }

    @Override // l1.f
    public final boolean b() {
        return false;
    }

    @Override // l1.f
    public final l c() {
        return this.f31030b;
    }

    @Override // l1.f
    public final int d() {
        return this.f31031c;
    }

    @Override // l1.f
    public final String e(int i2) {
        return this.f31032f[i2];
    }

    public final boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            f fVar = (f) obj;
            if (p0.a.g(g(), fVar.g()) && Arrays.equals(this.f31037k, ((g) obj).f31037k) && d() == fVar.d()) {
                int d = d();
                for (0; i2 < d; i2 + 1) {
                    i2 = (p0.a.g(f(i2).g(), fVar.f(i2).g()) && p0.a.g(f(i2).c(), fVar.f(i2).c())) ? i2 + 1 : 0;
                }
                return true;
            }
        }
        return false;
    }

    @Override // l1.f
    public final f f(int i2) {
        return this.f31033g[i2];
    }

    @Override // l1.f
    public final String g() {
        return this.f31029a;
    }

    @Override // l1.f
    public final boolean h(int i2) {
        return this.f31035i[i2];
    }

    public final int hashCode() {
        return ((Number) this.f31038l.getValue()).intValue();
    }

    public final String toString() {
        return u.K0(p0.a.F0(0, this.f31031c), ", ", android.support.v4.media.d.q(new StringBuilder(), this.f31029a, '('), ")", new i.i(this, 11), 24);
    }
}
