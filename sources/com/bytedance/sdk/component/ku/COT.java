package com.bytedance.sdk.component.ku;

/* loaded from: classes.dex */
public class COT {
    private static dT zp = new dT() { // from class: com.bytedance.sdk.component.ku.COT.1
        @Override // com.bytedance.sdk.component.ku.dT
        public YW createThreadFactory(int i9, String str) {
            return new YW(i9, str);
        }
    };

    public static void zp(dT dTVar) {
        zp = dTVar;
    }

    public static dT zp() {
        return zp;
    }
}
