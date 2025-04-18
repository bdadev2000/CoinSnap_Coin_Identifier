package com.bytedance.sdk.openadsdk.rkt;

import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.pDU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class wN implements AlY {
    private int AlY;
    private AlY Sg;
    long YFl = System.currentTimeMillis();
    private int tN;
    private int wN;

    public wN(AlY alY, int i10, int i11, int i12) {
        this.Sg = alY;
        this.tN = i10;
        this.AlY = i11;
        this.wN = i12;
    }

    @Override // com.bytedance.sdk.openadsdk.rkt.AlY
    public com.bytedance.sdk.openadsdk.rkt.Sg.YFl generatorModel() {
        com.bytedance.sdk.openadsdk.rkt.Sg.YFl generatorModel = this.Sg.generatorModel();
        generatorModel.YFl(BuildConfig.VERSION_NAME);
        generatorModel.YFl(this.tN);
        generatorModel.Sg(this.AlY);
        generatorModel.tN(this.wN);
        generatorModel.Sg(this.YFl);
        generatorModel.vc(NjR.Sg().wN());
        generatorModel.AlY(pDU.AlY());
        return generatorModel;
    }
}
