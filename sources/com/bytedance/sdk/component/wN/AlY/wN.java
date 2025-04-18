package com.bytedance.sdk.component.wN.AlY;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class wN extends YFl {
    private com.bytedance.sdk.component.wN.vc Sg;
    private byte[] YFl;

    public wN(byte[] bArr, com.bytedance.sdk.component.wN.vc vcVar) {
        this.YFl = bArr;
        this.Sg = vcVar;
    }

    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public String YFl() {
        return "decode";
    }

    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public void YFl(com.bytedance.sdk.component.wN.tN.tN tNVar) {
        com.bytedance.sdk.component.wN.tN.vc qO = tNVar.qO();
        com.bytedance.sdk.component.wN.tN.Sg.YFl YFl = qO.YFl(tNVar);
        try {
            tNVar.Ne();
            Bitmap YFl2 = YFl.YFl(this.YFl);
            if (YFl2 != null) {
                tNVar.YFl(new GA(YFl2, this.Sg, false));
                qO.YFl(tNVar.aIu()).YFl(tNVar.wN(), YFl2);
                return;
            }
            YFl(1002, "decode failed bitmap null", null, tNVar);
        } catch (Throwable th2) {
            YFl(1002, "decode failed:" + th2.getMessage(), th2, tNVar);
        }
    }

    private void YFl(int i10, String str, Throwable th2, com.bytedance.sdk.component.wN.tN.tN tNVar) {
        if (this.Sg == null) {
            tNVar.YFl(new eT());
        } else {
            tNVar.YFl(new qsH(i10, str, th2));
        }
    }
}
