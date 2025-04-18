package com.vungle.ads.internal.load;

import bh.i0;
import bh.o3;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class b implements Serializable {
    private final i0 adMarkup;
    private final o3 placement;
    private final String requestAdSize;

    public b(o3 placement, i0 i0Var, String requestAdSize) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(requestAdSize, "requestAdSize");
        this.placement = placement;
        this.adMarkup = i0Var;
        this.requestAdSize = requestAdSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(b.class, obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (!Intrinsics.areEqual(this.placement.getReferenceId(), bVar.placement.getReferenceId()) || !Intrinsics.areEqual(this.requestAdSize, bVar.requestAdSize)) {
            return false;
        }
        i0 i0Var = this.adMarkup;
        i0 i0Var2 = bVar.adMarkup;
        if (i0Var != null) {
            return Intrinsics.areEqual(i0Var, i0Var2);
        }
        if (i0Var2 == null) {
            return true;
        }
        return false;
    }

    public final i0 getAdMarkup() {
        return this.adMarkup;
    }

    public final o3 getPlacement() {
        return this.placement;
    }

    public final String getRequestAdSize() {
        return this.requestAdSize;
    }

    public int hashCode() {
        int i10;
        int c10 = vd.e.c(this.requestAdSize, this.placement.getReferenceId().hashCode() * 31, 31);
        i0 i0Var = this.adMarkup;
        if (i0Var != null) {
            i10 = i0Var.hashCode();
        } else {
            i10 = 0;
        }
        return c10 + i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdRequest{placementId='");
        sb2.append(this.placement.getReferenceId());
        sb2.append("', adMarkup=");
        sb2.append(this.adMarkup);
        sb2.append(", requestAdSize=");
        return com.applovin.impl.mediation.ads.e.g(sb2, this.requestAdSize, AbstractJsonLexerKt.END_OBJ);
    }
}
