package com.bytedance.sdk.openadsdk.core.qsH;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class wXo implements com.bytedance.sdk.openadsdk.core.eT.wN.tN {

    /* renamed from: vc, reason: collision with root package name */
    private String f10738vc;
    private long YFl = 0;
    private long Sg = 0;
    private int tN = 0;
    private String AlY = null;
    private String wN = null;
    private final AtomicBoolean DSW = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.core.eT.wN.tN
    public void Sg(String str) {
        this.wN = str;
        this.Sg = SystemClock.elapsedRealtime();
        this.DSW.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.eT.wN.tN
    public void YFl(String str) {
        this.f10738vc = str;
        this.YFl = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.eT.wN.tN
    public void YFl(int i10, String str, String str2) {
        this.tN = i10;
        this.AlY = str;
        this.wN = str2;
        this.Sg = SystemClock.elapsedRealtime();
        this.DSW.set(false);
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa, String str) {
        if (this.DSW.get()) {
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, false, str, "success", this.Sg - this.YFl, this.wN, this.f10738vc, 0, null);
        } else {
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, false, str, "fail", this.Sg - this.YFl, this.wN, this.f10738vc, this.tN, this.AlY);
        }
    }
}
