package com.bytedance.adsdk.YFl.Sg.tN.YFl;

import java.util.Deque;

/* loaded from: classes.dex */
public class wN extends vc {
    @Override // com.bytedance.adsdk.YFl.Sg.tN.YFl.vc
    public int YFl(String str, int i10, Deque<com.bytedance.adsdk.YFl.Sg.Sg.YFl> deque, com.bytedance.adsdk.YFl.Sg.tN.YFl yFl) {
        char YFl;
        int i11 = i10;
        while (true) {
            YFl = YFl(i11, str);
            if (!com.bytedance.adsdk.YFl.Sg.wN.YFl.Sg(YFl) && !com.bytedance.adsdk.YFl.Sg.wN.YFl.tN(YFl)) {
                break;
            }
            i11++;
        }
        if (YFl != '(') {
            return yFl.YFl(str, i10, deque);
        }
        deque.push(new com.bytedance.adsdk.YFl.Sg.Sg.YFl.nc(str.substring(i10, i11)));
        return i11 + 1;
    }
}
