package com.bytedance.sdk.component.adexpress.dynamic.KS;

import java.util.Arrays;

/* loaded from: classes.dex */
public class YW {
    public float lMd;
    public float zp;

    public YW(float f9, float f10) {
        this.zp = f9;
        this.lMd = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            YW yw = (YW) obj;
            if (Float.compare(yw.zp, this.zp) == 0 && Float.compare(yw.lMd, this.lMd) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.zp), Float.valueOf(this.lMd)});
    }
}
