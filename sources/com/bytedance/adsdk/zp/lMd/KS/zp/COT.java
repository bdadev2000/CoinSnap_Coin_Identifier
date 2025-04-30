package com.bytedance.adsdk.zp.lMd.KS.zp;

import java.util.Deque;

/* loaded from: classes.dex */
public class COT extends HWF {
    @Override // com.bytedance.adsdk.zp.lMd.KS.zp.HWF
    public int zp(String str, int i9, Deque<com.bytedance.adsdk.zp.lMd.lMd.zp> deque, com.bytedance.adsdk.zp.lMd.KS.zp zpVar) {
        char zp;
        int i10 = i9;
        while (true) {
            zp = zp(i10, str);
            if (!com.bytedance.adsdk.zp.lMd.COT.zp.lMd(zp) && !com.bytedance.adsdk.zp.lMd.COT.zp.KS(zp)) {
                break;
            }
            i10++;
        }
        if (zp != '(') {
            return zpVar.zp(str, i9, deque);
        }
        deque.push(new com.bytedance.adsdk.zp.lMd.lMd.zp.dT(str.substring(i9, i10)));
        return i10 + 1;
    }
}
