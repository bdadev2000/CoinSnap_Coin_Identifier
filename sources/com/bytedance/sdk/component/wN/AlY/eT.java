package com.bytedance.sdk.component.wN.AlY;

/* loaded from: classes.dex */
public class eT extends YFl {
    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public String YFl() {
        return "net_request";
    }

    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public void YFl(final com.bytedance.sdk.component.wN.tN.tN tNVar) {
        final com.bytedance.sdk.component.wN.tN.vc qO = tNVar.qO();
        com.bytedance.sdk.component.wN.AlY AlY = qO.AlY();
        tNVar.YFl(false);
        try {
            com.bytedance.sdk.component.wN.vc YFl = AlY.YFl(new com.bytedance.sdk.component.wN.Sg.tN(tNVar.YFl(), tNVar.GA(), tNVar.pDU(), tNVar.Ne()));
            int Sg = YFl.Sg();
            tNVar.YFl(YFl.YFl());
            if (YFl.Sg() == 200) {
                final byte[] bArr = (byte[]) YFl.tN();
                tNVar.YFl(new Sg(bArr, YFl));
                final String nc2 = tNVar.nc();
                final com.bytedance.sdk.component.wN.Sg aIu = tNVar.aIu();
                if (aIu.tN()) {
                    qO.Sg(tNVar.aIu()).YFl(nc2, bArr);
                }
                qO.vc().submit(new Runnable() { // from class: com.bytedance.sdk.component.wN.AlY.eT.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (aIu.AlY()) {
                            qO.tN(tNVar.aIu()).YFl(nc2, bArr);
                        }
                    }
                });
                return;
            }
            qO.qsH();
            String.valueOf(YFl);
            Object tN = YFl.tN();
            YFl(Sg, YFl.AlY(), tN instanceof Throwable ? (Throwable) tN : null, tNVar);
        } catch (Throwable th2) {
            YFl(1004, "net request failed!", th2, tNVar);
        }
    }

    private void YFl(int i10, String str, Throwable th2, com.bytedance.sdk.component.wN.tN.tN tNVar) {
        tNVar.YFl(new qsH(i10, str, th2));
    }
}
