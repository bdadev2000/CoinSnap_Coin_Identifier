package com.bytedance.adsdk.zp.lMd.KS.zp;

import java.util.Deque;

/* loaded from: classes.dex */
public abstract class HWF {
    public int lMd(int i9, String str) {
        while (com.bytedance.adsdk.zp.lMd.COT.zp.zp(zp(i9, str))) {
            i9++;
        }
        return i9;
    }

    public char zp(int i9, String str) {
        if (i9 >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i9);
    }

    public abstract int zp(String str, int i9, Deque<com.bytedance.adsdk.zp.lMd.lMd.zp> deque, com.bytedance.adsdk.zp.lMd.KS.zp zpVar);
}
