package com.vungle.ads.internal.load;

import c7.I;
import c7.p1;
import com.applovin.impl.L;
import java.io.Serializable;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class b implements Serializable {
    private final I adMarkup;
    private final p1 placement;
    private final String requestAdSize;

    public b(p1 p1Var, I i9, String str) {
        G7.j.e(p1Var, "placement");
        G7.j.e(str, "requestAdSize");
        this.placement = p1Var;
        this.adMarkup = i9;
        this.requestAdSize = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !b.class.equals(obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (!G7.j.a(this.placement.getReferenceId(), bVar.placement.getReferenceId()) || !G7.j.a(this.requestAdSize, bVar.requestAdSize)) {
            return false;
        }
        I i9 = this.adMarkup;
        I i10 = bVar.adMarkup;
        if (i9 != null) {
            return G7.j.a(i9, i10);
        }
        if (i10 == null) {
            return true;
        }
        return false;
    }

    public final I getAdMarkup() {
        return this.adMarkup;
    }

    public final p1 getPlacement() {
        return this.placement;
    }

    public final String getRequestAdSize() {
        return this.requestAdSize;
    }

    public int hashCode() {
        int i9;
        int b = AbstractC2914a.b(this.placement.getReferenceId().hashCode() * 31, 31, this.requestAdSize);
        I i10 = this.adMarkup;
        if (i10 != null) {
            i9 = i10.hashCode();
        } else {
            i9 = 0;
        }
        return b + i9;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdRequest{placementId='");
        sb.append(this.placement.getReferenceId());
        sb.append("', adMarkup=");
        sb.append(this.adMarkup);
        sb.append(", requestAdSize=");
        return L.k(sb, this.requestAdSize, '}');
    }
}
