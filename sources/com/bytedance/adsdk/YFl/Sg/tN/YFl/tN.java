package com.bytedance.adsdk.YFl.Sg.tN.YFl;

import com.bytedance.adsdk.YFl.Sg.Sg.YFl.Ne;
import java.util.Deque;

/* loaded from: classes.dex */
public class tN extends vc {
    @Override // com.bytedance.adsdk.YFl.Sg.tN.YFl.vc
    public int YFl(String str, int i10, Deque<com.bytedance.adsdk.YFl.Sg.Sg.YFl> deque, com.bytedance.adsdk.YFl.Sg.tN.YFl yFl) {
        if (!com.bytedance.adsdk.YFl.Sg.wN.YFl.Sg(YFl(i10, str))) {
            return yFl.YFl(str, i10, deque);
        }
        return YFl(str, i10, deque);
    }

    private int YFl(String str, int i10, Deque<com.bytedance.adsdk.YFl.Sg.Sg.YFl> deque) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = i12 + i10;
            char YFl = YFl(i11, str);
            if (!com.bytedance.adsdk.YFl.Sg.wN.YFl.Sg(YFl) && !com.bytedance.adsdk.YFl.Sg.wN.YFl.tN(YFl) && '.' != YFl && '[' != YFl && ']' != YFl && '_' != YFl && '-' != YFl) {
                break;
            }
            i12++;
        }
        String substring = str.substring(i10, i11);
        if (com.bytedance.adsdk.YFl.Sg.AlY.YFl.YFl(substring) != null) {
            deque.push(new com.bytedance.adsdk.YFl.Sg.Sg.YFl.DSW(substring));
        } else {
            deque.push(new Ne(substring));
        }
        return i11;
    }
}
