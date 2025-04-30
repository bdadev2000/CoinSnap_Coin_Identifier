package e8;

import t7.AbstractC2712a;
import t7.C2724m;
import u7.AbstractC2816g;

/* renamed from: e8.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2249y extends Y {
    public final c8.k l;
    public final C2724m m;

    public C2249y(String str, int i9) {
        super(str, null, i9);
        this.l = c8.k.f5452e;
        this.m = AbstractC2712a.d(new C2248x(i9, str, this));
    }

    @Override // e8.Y
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c8.g)) {
            return false;
        }
        c8.g gVar = (c8.g) obj;
        if (gVar.getKind() != c8.k.f5452e) {
            return false;
        }
        if (G7.j.a(this.f20144a, gVar.a()) && G7.j.a(W.b(this), W.b(gVar))) {
            return true;
        }
        return false;
    }

    @Override // e8.Y, c8.g
    public final com.bumptech.glide.c getKind() {
        return this.l;
    }

    @Override // e8.Y
    public final int hashCode() {
        int i9;
        int hashCode = this.f20144a.hashCode();
        c8.i iVar = new c8.i(this, 1);
        int i10 = 1;
        while (iVar.hasNext()) {
            int i11 = i10 * 31;
            String str = (String) iVar.next();
            if (str != null) {
                i9 = str.hashCode();
            } else {
                i9 = 0;
            }
            i10 = i11 + i9;
        }
        return (hashCode * 31) + i10;
    }

    @Override // e8.Y, c8.g
    public final c8.g j(int i9) {
        return ((c8.g[]) this.m.getValue())[i9];
    }

    @Override // e8.Y
    public final String toString() {
        return AbstractC2816g.O(new N7.k(this, 1), ", ", com.applovin.impl.L.k(new StringBuilder(), this.f20144a, '('), ")", null, 56);
    }
}
