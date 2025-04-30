package com.bytedance.adsdk.zp.lMd.KS.zp;

import com.bytedance.adsdk.zp.lMd.lMd.zp.cz;
import java.util.Deque;

/* loaded from: classes.dex */
public class lMd extends HWF {
    @Override // com.bytedance.adsdk.zp.lMd.KS.zp.HWF
    public int zp(String str, int i9, Deque<com.bytedance.adsdk.zp.lMd.lMd.zp> deque, com.bytedance.adsdk.zp.lMd.KS.zp zpVar) {
        if ('\'' != zp(i9, str)) {
            return zpVar.zp(str, i9, deque);
        }
        int i10 = i9 + 1;
        int length = str.length();
        int i11 = i10;
        while (i11 < length && zp(i11, str) != '\'') {
            i11++;
        }
        if (zp(i11, str) == '\'') {
            deque.push(new cz(str.substring(i10, i11)));
            return i11 + 1;
        }
        throw new com.bytedance.adsdk.zp.zp.zp("String expression not surrounded by '", str.substring(i9));
    }
}
