package com.bytedance.adsdk.zp.lMd.KS.zp;

import com.bytedance.adsdk.zp.lMd.lMd.zp.ot;
import java.util.Deque;

/* loaded from: classes.dex */
public class KS extends HWF {
    @Override // com.bytedance.adsdk.zp.lMd.KS.zp.HWF
    public int zp(String str, int i9, Deque<com.bytedance.adsdk.zp.lMd.lMd.zp> deque, com.bytedance.adsdk.zp.lMd.KS.zp zpVar) {
        if (!com.bytedance.adsdk.zp.lMd.COT.zp.lMd(zp(i9, str))) {
            return zpVar.zp(str, i9, deque);
        }
        return zp(str, i9, deque);
    }

    private int zp(String str, int i9, Deque<com.bytedance.adsdk.zp.lMd.lMd.zp> deque) {
        int i10;
        int i11 = 0;
        while (true) {
            i10 = i11 + i9;
            char zp = zp(i10, str);
            if (!com.bytedance.adsdk.zp.lMd.COT.zp.lMd(zp) && !com.bytedance.adsdk.zp.lMd.COT.zp.KS(zp) && '.' != zp && '[' != zp && ']' != zp && '_' != zp && '-' != zp) {
                break;
            }
            i11++;
        }
        String substring = str.substring(i9, i10);
        if (com.bytedance.adsdk.zp.lMd.jU.zp.zp(substring) != null) {
            deque.push(new com.bytedance.adsdk.zp.lMd.lMd.zp.QR(substring));
        } else {
            deque.push(new ot(substring));
        }
        return i10;
    }
}
