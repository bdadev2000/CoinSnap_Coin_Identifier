package com.bytedance.sdk.openadsdk.AlY.YFl;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class pDU {
    public static pDU YFl = new pDU();
    private volatile boolean AlY;
    private YFl Sg;
    private final Map<String, YFl> tN = new HashMap();

    /* loaded from: classes.dex */
    public static class YFl {
        private final int Sg;
        private final int YFl;

        public YFl(int i10, int i11) {
            this.YFl = (i10 < 0 || i10 > 5) ? 3 : i10;
            this.Sg = i11 < 10 ? 30 : i11;
        }

        public int Sg() {
            return this.Sg;
        }

        public int YFl() {
            return this.YFl;
        }
    }

    private int Sg() {
        YFl yFl = this.Sg;
        if (yFl != null) {
            return yFl.YFl();
        }
        return 3;
    }

    private int tN() {
        YFl yFl = this.Sg;
        if (yFl != null) {
            return yFl.Sg();
        }
        return 30;
    }

    public void YFl(YFl yFl) {
        this.Sg = yFl;
    }

    public void YFl(String str, YFl yFl) {
        if (TextUtils.isEmpty(str) || yFl == null) {
            return;
        }
        this.tN.put(str, yFl);
    }

    public int Sg(String str) {
        YFl yFl = this.tN.get(str);
        if (yFl == null) {
            return tN();
        }
        return yFl.Sg();
    }

    public int YFl(String str) {
        if (!YFl()) {
            return 4;
        }
        YFl yFl = this.tN.get(str);
        if (yFl == null) {
            return Sg();
        }
        return yFl.YFl();
    }

    public boolean YFl() {
        return this.AlY;
    }

    public void YFl(boolean z10) {
        this.AlY = z10;
    }
}
