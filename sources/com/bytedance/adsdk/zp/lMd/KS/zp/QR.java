package com.bytedance.adsdk.zp.lMd.KS.zp;

import com.bytedance.adsdk.zp.lMd.lMd.zp.dQp;
import java.util.Deque;

/* loaded from: classes.dex */
public class QR extends HWF {
    private boolean zp(String str, int i9, Deque<com.bytedance.adsdk.zp.lMd.lMd.zp> deque) {
        if ('-' == zp(i9, str)) {
            if (deque.peek() != null && !com.bytedance.adsdk.zp.lMd.jU.KS.zp(deque.peek().zp())) {
                return false;
            }
            if (com.bytedance.adsdk.zp.lMd.COT.zp.KS(zp(i9 + 1, str))) {
                return true;
            }
            throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i9));
        }
        return com.bytedance.adsdk.zp.lMd.COT.zp.KS(zp(i9, str));
    }

    @Override // com.bytedance.adsdk.zp.lMd.KS.zp.HWF
    public int zp(String str, int i9, Deque<com.bytedance.adsdk.zp.lMd.lMd.zp> deque, com.bytedance.adsdk.zp.lMd.KS.zp zpVar) {
        char zp;
        if (!zp(str, i9, deque)) {
            return zpVar.zp(str, i9, deque);
        }
        int i10 = zp(i9, str) == '-' ? i9 + 1 : i9;
        boolean z8 = false;
        while (true) {
            zp = zp(i10, str);
            if (com.bytedance.adsdk.zp.lMd.COT.zp.KS(zp) || (!z8 && zp == '.')) {
                i10++;
                if (zp == '.') {
                    z8 = true;
                }
            }
        }
        if (zp != '.') {
            deque.push(new dQp(str.substring(i9, i10)));
            return i10;
        }
        throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i9, i10));
    }
}
