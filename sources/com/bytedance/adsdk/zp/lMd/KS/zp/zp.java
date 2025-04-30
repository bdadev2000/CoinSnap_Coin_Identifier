package com.bytedance.adsdk.zp.lMd.KS.zp;

import com.bytedance.adsdk.zp.lMd.lMd.zp.FP;
import java.util.Deque;

/* loaded from: classes.dex */
public class zp extends HWF {
    @Override // com.bytedance.adsdk.zp.lMd.KS.zp.HWF
    public int zp(String str, int i9, Deque<com.bytedance.adsdk.zp.lMd.lMd.zp> deque, com.bytedance.adsdk.zp.lMd.KS.zp zpVar) {
        if (',' != zp(i9, str)) {
            return zpVar.zp(str, i9, deque);
        }
        deque.push(new FP(com.bytedance.adsdk.zp.lMd.jU.jU.COMMA));
        return i9 + 1;
    }
}
