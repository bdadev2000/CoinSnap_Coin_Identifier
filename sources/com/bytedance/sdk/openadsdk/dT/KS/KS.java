package com.bytedance.sdk.openadsdk.dT.KS;

/* loaded from: classes.dex */
class KS implements zp {
    private static volatile KS zp;

    private KS() {
    }

    @Override // com.bytedance.sdk.openadsdk.dT.KS.zp
    public void zp(com.bytedance.sdk.openadsdk.dT.lMd lmd) {
    }

    @Override // com.bytedance.sdk.openadsdk.dT.KS.zp
    public void zp(com.bytedance.sdk.openadsdk.dT.lMd lmd, boolean z8) {
    }

    public static KS zp() {
        if (zp == null) {
            synchronized (KS.class) {
                try {
                    if (zp == null) {
                        zp = new KS();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }
}
