package com.bytedance.sdk.component.adexpress.dynamic.AlY;

import java.util.Arrays;

/* loaded from: classes.dex */
public class NjR {
    public float Sg;
    public float YFl;

    public NjR(float f10, float f11) {
        this.YFl = f10;
        this.Sg = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            NjR njR = (NjR) obj;
            if (Float.compare(njR.YFl, this.YFl) == 0 && Float.compare(njR.Sg, this.Sg) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.YFl), Float.valueOf(this.Sg)});
    }
}
