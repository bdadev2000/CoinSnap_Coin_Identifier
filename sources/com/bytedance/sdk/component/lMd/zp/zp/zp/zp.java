package com.bytedance.sdk.component.lMd.zp.zp.zp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class zp extends com.bytedance.sdk.component.lMd.zp.jU {
    public static volatile YW zp;
    private ExecutorService jU;
    private List<com.bytedance.sdk.component.lMd.zp.lMd> lMd = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.lMd.zp.lMd> KS = new CopyOnWriteArrayList();

    public zp(ExecutorService executorService) {
        this.jU = executorService;
    }

    public boolean COT() {
        if (zp != null && zp.zp() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.jU
    public List<com.bytedance.sdk.component.lMd.zp.lMd> KS() {
        return this.lMd;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.jU
    public List<com.bytedance.sdk.component.lMd.zp.lMd> jU() {
        return this.KS;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.jU
    public ExecutorService lMd() {
        ExecutorService executorService;
        if (zp != null) {
            executorService = zp.zp();
        } else {
            executorService = null;
        }
        if (executorService != null) {
            return executorService;
        }
        return this.jU;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.jU
    public int zp() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.jU
    public void zp(int i9) {
    }

    public static void zp(YW yw) {
        zp = yw;
    }
}
