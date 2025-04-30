package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class dQp implements com.bytedance.sdk.openadsdk.core.ugen.jU.lMd {
    private long zp = 0;
    private long lMd = 0;
    private int KS = 0;
    private String jU = null;
    private String COT = null;
    private final AtomicBoolean HWF = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.core.ugen.jU.lMd
    public void zp() {
        this.zp = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ugen.jU.lMd
    public void zp(int i9, String str, String str2) {
        this.KS = i9;
        this.jU = str;
        this.COT = str2;
        this.lMd = SystemClock.elapsedRealtime();
        this.HWF.set(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ugen.jU.lMd
    public void zp(String str) {
        this.COT = str;
        this.lMd = SystemClock.elapsedRealtime();
        this.HWF.set(true);
    }

    public void zp(com.bytedance.sdk.openadsdk.core.model.woN won, String str) {
        if (this.HWF.get()) {
            com.bytedance.sdk.openadsdk.lMd.KS.zp(won, str, "success", this.lMd - this.zp, this.COT, "ad", 0, (String) null);
        } else {
            com.bytedance.sdk.openadsdk.lMd.KS.zp(won, str, "fail", this.lMd - this.zp, this.COT, "ad", this.KS, this.jU);
        }
    }
}
