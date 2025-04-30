package c7;

import e8.C2231f;

/* loaded from: classes3.dex */
public final class L {
    public static final K Companion = new K(null);
    private final Integer diskPercentage;
    private final Long diskSize;
    private final Boolean enabled;

    public L() {
        this((Boolean) null, (Long) null, (Integer) null, 7, (G7.f) null);
    }

    public static /* synthetic */ L copy$default(L l, Boolean bool, Long l2, Integer num, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            bool = l.enabled;
        }
        if ((i9 & 2) != 0) {
            l2 = l.diskSize;
        }
        if ((i9 & 4) != 0) {
            num = l.diskPercentage;
        }
        return l.copy(bool, l2, num);
    }

    public static final void write$Self(L l, d8.b bVar, c8.g gVar) {
        Integer num;
        Long l2;
        G7.j.e(l, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || !G7.j.a(l.enabled, Boolean.FALSE)) {
            bVar.u(gVar, 0, C2231f.f20162a, l.enabled);
        }
        if (bVar.o(gVar) || (l2 = l.diskSize) == null || l2.longValue() != 1000) {
            bVar.u(gVar, 1, e8.O.f20131a, l.diskSize);
        }
        if (bVar.o(gVar) || (num = l.diskPercentage) == null || num.intValue() != 3) {
            bVar.u(gVar, 2, e8.K.f20127a, l.diskPercentage);
        }
    }

    public final Boolean component1() {
        return this.enabled;
    }

    public final Long component2() {
        return this.diskSize;
    }

    public final Integer component3() {
        return this.diskPercentage;
    }

    public final L copy(Boolean bool, Long l, Integer num) {
        return new L(bool, l, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l = (L) obj;
        if (G7.j.a(this.enabled, l.enabled) && G7.j.a(this.diskSize, l.diskSize) && G7.j.a(this.diskPercentage, l.diskPercentage)) {
            return true;
        }
        return false;
    }

    public final Integer getDiskPercentage() {
        return this.diskPercentage;
    }

    public final Long getDiskSize() {
        return this.diskSize;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Boolean bool = this.enabled;
        int i9 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i10 = hashCode * 31;
        Long l = this.diskSize;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Integer num = this.diskPercentage;
        if (num != null) {
            i9 = num.hashCode();
        }
        return i11 + i9;
    }

    public String toString() {
        return "CleverCache(enabled=" + this.enabled + ", diskSize=" + this.diskSize + ", diskPercentage=" + this.diskPercentage + ')';
    }

    public /* synthetic */ L(int i9, Boolean bool, Long l, Integer num, e8.g0 g0Var) {
        this.enabled = (i9 & 1) == 0 ? Boolean.FALSE : bool;
        if ((i9 & 2) == 0) {
            this.diskSize = 1000L;
        } else {
            this.diskSize = l;
        }
        if ((i9 & 4) == 0) {
            this.diskPercentage = 3;
        } else {
            this.diskPercentage = num;
        }
    }

    public L(Boolean bool, Long l, Integer num) {
        this.enabled = bool;
        this.diskSize = l;
        this.diskPercentage = num;
    }

    public /* synthetic */ L(Boolean bool, Long l, Integer num, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? Boolean.FALSE : bool, (i9 & 2) != 0 ? 1000L : l, (i9 & 4) != 0 ? 3 : num);
    }

    public static /* synthetic */ void getDiskPercentage$annotations() {
    }

    public static /* synthetic */ void getDiskSize$annotations() {
    }

    public static /* synthetic */ void getEnabled$annotations() {
    }
}
