package com.bytedance.sdk.component.wN.AlY;

/* loaded from: classes.dex */
public class Sg implements NjR {
    private com.bytedance.sdk.component.wN.vc Sg;
    private byte[] YFl;

    public Sg(byte[] bArr, com.bytedance.sdk.component.wN.vc vcVar) {
        this.YFl = bArr;
        this.Sg = vcVar;
    }

    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public String YFl() {
        return "image_type";
    }

    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public void YFl(com.bytedance.sdk.component.wN.tN.tN tNVar) {
        NjR qsh;
        int YoT = tNVar.YoT();
        tNVar.YFl(this.YFl.length);
        if (YoT != 2) {
            if (YoT != 3) {
                boolean Sg = com.bytedance.sdk.component.wN.tN.tN.YFl.Sg(this.YFl);
                if (Sg) {
                    qsh = new GA(this.YFl, this.Sg, Sg);
                } else if (com.bytedance.sdk.component.wN.tN.tN.YFl.YFl(this.YFl)) {
                    qsh = new wN(this.YFl, this.Sg);
                } else {
                    qsh = new GA(this.YFl, this.Sg, Sg);
                }
            } else {
                byte[] bArr = this.YFl;
                qsh = new GA(bArr, this.Sg, com.bytedance.sdk.component.wN.tN.tN.YFl.Sg(bArr));
            }
        } else if (com.bytedance.sdk.component.wN.tN.tN.YFl.YFl(this.YFl)) {
            qsh = new wN(this.YFl, this.Sg);
        } else if (this.Sg == null) {
            qsh = new eT();
        } else {
            qsh = new qsH(1001, "not image format", null);
        }
        tNVar.YFl(qsh);
    }
}
