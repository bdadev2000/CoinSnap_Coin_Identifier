package com.bytedance.sdk.openadsdk.pDU.tN;

/* loaded from: classes.dex */
class AlY implements Sg {
    private static volatile AlY YFl;

    private AlY() {
    }

    @Override // com.bytedance.sdk.openadsdk.pDU.tN.Sg
    public void YFl(com.bytedance.sdk.openadsdk.pDU.Sg sg2) {
    }

    @Override // com.bytedance.sdk.openadsdk.pDU.tN.Sg
    public void YFl(com.bytedance.sdk.openadsdk.pDU.Sg sg2, boolean z10) {
    }

    public static AlY YFl() {
        if (YFl == null) {
            synchronized (AlY.class) {
                if (YFl == null) {
                    YFl = new AlY();
                }
            }
        }
        return YFl;
    }
}
