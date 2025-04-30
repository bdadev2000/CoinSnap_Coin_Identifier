package com.bytedance.sdk.openadsdk.core.model;

import Q7.n0;

/* loaded from: classes.dex */
public class ku {
    public boolean zp = true;
    public boolean lMd = true;
    public boolean KS = true;
    public boolean jU = true;
    public boolean COT = true;
    public boolean HWF = true;

    public String toString() {
        StringBuilder sb = new StringBuilder("ClickArea{clickUpperContentArea=");
        sb.append(this.zp);
        sb.append(", clickUpperNonContentArea=");
        sb.append(this.lMd);
        sb.append(", clickLowerContentArea=");
        sb.append(this.KS);
        sb.append(", clickLowerNonContentArea=");
        sb.append(this.jU);
        sb.append(", clickButtonArea=");
        sb.append(this.COT);
        sb.append(", clickVideoArea=");
        return n0.n(sb, this.HWF, '}');
    }
}
