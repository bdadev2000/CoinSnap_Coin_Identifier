package com.bytedance.adsdk.zp.lMd.KS.zp;

import com.bytedance.adsdk.zp.lMd.lMd.zp.KVG;
import com.mbridge.msdk.foundation.entity.o;
import java.util.Deque;

/* loaded from: classes.dex */
public class ku extends HWF {
    @Override // com.bytedance.adsdk.zp.lMd.KS.zp.HWF
    public int zp(String str, int i9, Deque<com.bytedance.adsdk.zp.lMd.lMd.zp> deque, com.bytedance.adsdk.zp.lMd.KS.zp zpVar) {
        if (!com.bytedance.adsdk.zp.lMd.COT.zp.jU(zp(i9, str))) {
            return zpVar.zp(str, i9, deque);
        }
        int i10 = i9 + 1;
        String str2 = new String(new char[]{zp(i9, str), zp(i10, str)});
        if (com.bytedance.adsdk.zp.lMd.jU.KS.zp(str2) != null) {
            deque.push(new KVG(com.bytedance.adsdk.zp.lMd.jU.KS.zp(str2)));
            return i9 + 2;
        }
        String valueOf = String.valueOf(zp(i9, str));
        if (com.bytedance.adsdk.zp.lMd.jU.KS.zp(valueOf) != null) {
            deque.push(new KVG(com.bytedance.adsdk.zp.lMd.jU.KS.zp(valueOf)));
            return i10;
        }
        StringBuilder n2 = o.n("Unrecognized:", valueOf, "examine:");
        n2.append(str.substring(0, i9));
        throw new IllegalArgumentException(n2.toString());
    }
}
