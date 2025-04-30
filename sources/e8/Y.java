package e8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;
import u7.AbstractC2816g;
import u7.C2824o;
import u7.C2825p;

/* loaded from: classes3.dex */
public class Y implements c8.g, InterfaceC2236k {

    /* renamed from: a, reason: collision with root package name */
    public final String f20144a;
    public final D b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20145c;

    /* renamed from: d, reason: collision with root package name */
    public int f20146d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f20147e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f20148f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f20149g;

    /* renamed from: h, reason: collision with root package name */
    public Map f20150h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC2717f f20151i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC2717f f20152j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2717f f20153k;

    public Y(String str, D d2, int i9) {
        this.f20144a = str;
        this.b = d2;
        this.f20145c = i9;
        String[] strArr = new String[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            strArr[i10] = "[UNINITIALIZED]";
        }
        this.f20147e = strArr;
        int i11 = this.f20145c;
        this.f20148f = new List[i11];
        this.f20149g = new boolean[i11];
        this.f20150h = C2825p.b;
        EnumC2718g enumC2718g = EnumC2718g.f23018c;
        this.f20151i = AbstractC2712a.c(enumC2718g, new X(this, 1));
        this.f20152j = AbstractC2712a.c(enumC2718g, new X(this, 2));
        this.f20153k = AbstractC2712a.c(enumC2718g, new X(this, 0));
    }

    @Override // c8.g
    public final String a() {
        return this.f20144a;
    }

    @Override // e8.InterfaceC2236k
    public final Set b() {
        return this.f20150h.keySet();
    }

    @Override // c8.g
    public final boolean c() {
        return false;
    }

    @Override // c8.g
    public final int d(String str) {
        G7.j.e(str, "name");
        Integer num = (Integer) this.f20150h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // c8.g
    public final List e() {
        return C2824o.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Y) {
            c8.g gVar = (c8.g) obj;
            if (G7.j.a(this.f20144a, gVar.a()) && Arrays.equals((c8.g[]) this.f20152j.getValue(), (c8.g[]) ((Y) obj).f20152j.getValue())) {
                int f9 = gVar.f();
                int i9 = this.f20145c;
                if (i9 == f9) {
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (G7.j.a(j(i10).a(), gVar.j(i10).a()) && G7.j.a(j(i10).getKind(), gVar.j(i10).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // c8.g
    public final int f() {
        return this.f20145c;
    }

    @Override // c8.g
    public final String g(int i9) {
        return this.f20147e[i9];
    }

    @Override // c8.g
    public com.bumptech.glide.c getKind() {
        return c8.l.f5453d;
    }

    @Override // c8.g
    public boolean h() {
        return false;
    }

    public int hashCode() {
        return ((Number) this.f20153k.getValue()).intValue();
    }

    @Override // c8.g
    public final List i(int i9) {
        List list = this.f20148f[i9];
        if (list == null) {
            return C2824o.b;
        }
        return list;
    }

    @Override // c8.g
    public c8.g j(int i9) {
        return ((a8.b[]) this.f20151i.getValue())[i9].getDescriptor();
    }

    @Override // c8.g
    public final boolean k(int i9) {
        return this.f20149g[i9];
    }

    public final void l(String str, boolean z8) {
        G7.j.e(str, "name");
        int i9 = this.f20146d + 1;
        this.f20146d = i9;
        String[] strArr = this.f20147e;
        strArr[i9] = str;
        this.f20149g[i9] = z8;
        this.f20148f[i9] = null;
        if (i9 == this.f20145c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                hashMap.put(strArr[i10], Integer.valueOf(i10));
            }
            this.f20150h = hashMap;
        }
    }

    public String toString() {
        return AbstractC2816g.O(e1.f.t(0, this.f20145c), ", ", com.applovin.impl.L.k(new StringBuilder(), this.f20144a, '('), ")", new G7.w(this, 10), 24);
    }
}
