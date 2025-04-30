package c8;

import G7.w;
import com.applovin.impl.L;
import e8.InterfaceC2236k;
import e8.W;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t7.AbstractC2712a;
import t7.C2720i;
import t7.C2724m;
import u7.AbstractC2816g;
import u7.AbstractC2818i;
import u7.AbstractC2829t;
import u7.C2827r;

/* loaded from: classes3.dex */
public final class h implements g, InterfaceC2236k {

    /* renamed from: a, reason: collision with root package name */
    public final String f5439a;
    public final com.bumptech.glide.c b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5440c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5441d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f5442e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f5443f;

    /* renamed from: g, reason: collision with root package name */
    public final g[] f5444g;

    /* renamed from: h, reason: collision with root package name */
    public final List[] f5445h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f5446i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f5447j;

    /* renamed from: k, reason: collision with root package name */
    public final g[] f5448k;
    public final C2724m l;

    public h(String str, com.bumptech.glide.c cVar, int i9, List list, a aVar) {
        G7.j.e(str, "serialName");
        this.f5439a = str;
        this.b = cVar;
        this.f5440c = i9;
        this.f5441d = aVar.f5422a;
        ArrayList arrayList = aVar.b;
        G7.j.e(arrayList, "<this>");
        HashSet hashSet = new HashSet(AbstractC2829t.Y(AbstractC2818i.E(arrayList, 12)));
        AbstractC2816g.S(arrayList, hashSet);
        this.f5442e = hashSet;
        int i10 = 0;
        Object[] array = arrayList.toArray(new String[0]);
        G7.j.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f5443f = (String[]) array;
        this.f5444g = W.c(aVar.f5424d);
        Object[] array2 = aVar.f5425e.toArray(new List[0]);
        G7.j.c(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f5445h = (List[]) array2;
        ArrayList arrayList2 = aVar.f5426f;
        G7.j.e(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i10] = ((Boolean) it.next()).booleanValue();
            i10++;
        }
        this.f5446i = zArr;
        String[] strArr = this.f5443f;
        G7.j.e(strArr, "<this>");
        N7.k kVar = new N7.k(new a8.e(strArr, 6), 2);
        ArrayList arrayList3 = new ArrayList(AbstractC2818i.E(kVar, 10));
        Iterator it2 = kVar.iterator();
        while (true) {
            N7.b bVar = (N7.b) it2;
            if (bVar.f2123c.hasNext()) {
                C2827r c2827r = (C2827r) bVar.next();
                arrayList3.add(new C2720i(c2827r.b, Integer.valueOf(c2827r.f23450a)));
            } else {
                this.f5447j = AbstractC2829t.b0(arrayList3);
                this.f5448k = W.c(list);
                this.l = AbstractC2712a.d(new a8.e(this, 2));
                return;
            }
        }
    }

    @Override // c8.g
    public final String a() {
        return this.f5439a;
    }

    @Override // e8.InterfaceC2236k
    public final Set b() {
        return this.f5442e;
    }

    @Override // c8.g
    public final boolean c() {
        return false;
    }

    @Override // c8.g
    public final int d(String str) {
        G7.j.e(str, "name");
        Integer num = (Integer) this.f5447j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // c8.g
    public final List e() {
        return this.f5441d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            g gVar = (g) obj;
            if (G7.j.a(a(), gVar.a()) && Arrays.equals(this.f5448k, ((h) obj).f5448k) && f() == gVar.f()) {
                int f9 = f();
                for (int i9 = 0; i9 < f9; i9++) {
                    if (G7.j.a(j(i9).a(), gVar.j(i9).a()) && G7.j.a(j(i9).getKind(), gVar.j(i9).getKind())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // c8.g
    public final int f() {
        return this.f5440c;
    }

    @Override // c8.g
    public final String g(int i9) {
        return this.f5443f[i9];
    }

    @Override // c8.g
    public final com.bumptech.glide.c getKind() {
        return this.b;
    }

    @Override // c8.g
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // c8.g
    public final List i(int i9) {
        return this.f5445h[i9];
    }

    @Override // c8.g
    public final g j(int i9) {
        return this.f5444g[i9];
    }

    @Override // c8.g
    public final boolean k(int i9) {
        return this.f5446i[i9];
    }

    public final String toString() {
        return AbstractC2816g.O(e1.f.t(0, this.f5440c), ", ", L.k(new StringBuilder(), this.f5439a, '('), ")", new w(this, 7), 24);
    }
}
