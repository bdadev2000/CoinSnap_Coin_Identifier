package com.bytedance.sdk.openadsdk.lMd.zp;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class rV {
    public static rV zp = new rV();
    private final Map<String, zp> KS = new HashMap();
    private volatile boolean jU;
    private zp lMd;

    /* loaded from: classes.dex */
    public static class zp {
        private final int lMd;
        private final int zp;

        public zp(int i9, int i10) {
            this.zp = (i9 < 0 || i9 > 5) ? 3 : i9;
            this.lMd = i10 < 10 ? 30 : i10;
        }

        public int lMd() {
            return this.lMd;
        }

        public int zp() {
            return this.zp;
        }
    }

    private int KS() {
        zp zpVar = this.lMd;
        if (zpVar != null) {
            return zpVar.lMd();
        }
        return 30;
    }

    private int lMd() {
        zp zpVar = this.lMd;
        if (zpVar != null) {
            return zpVar.zp();
        }
        return 3;
    }

    public void zp(zp zpVar) {
        this.lMd = zpVar;
    }

    public void zp(String str, zp zpVar) {
        if (TextUtils.isEmpty(str) || zpVar == null) {
            return;
        }
        this.KS.put(str, zpVar);
    }

    public int lMd(String str) {
        zp zpVar = this.KS.get(str);
        if (zpVar == null) {
            return KS();
        }
        return zpVar.lMd();
    }

    public int zp(String str) {
        if (!zp()) {
            return 4;
        }
        zp zpVar = this.KS.get(str);
        if (zpVar == null) {
            return lMd();
        }
        return zpVar.zp();
    }

    public boolean zp() {
        return this.jU;
    }

    public void zp(boolean z8) {
        this.jU = z8;
    }
}
