package com.bytedance.adsdk.YFl.Sg.tN.YFl;

import com.bytedance.adsdk.YFl.Sg.Sg.YFl.wXo;
import java.util.Deque;

/* loaded from: classes.dex */
public class AlY extends vc {
    @Override // com.bytedance.adsdk.YFl.Sg.tN.YFl.vc
    public int YFl(String str, int i10, Deque<com.bytedance.adsdk.YFl.Sg.Sg.YFl> deque, com.bytedance.adsdk.YFl.Sg.tN.YFl yFl) {
        if ('(' != YFl(i10, str)) {
            return yFl.YFl(str, i10, deque);
        }
        deque.push(new wXo(com.bytedance.adsdk.YFl.Sg.AlY.AlY.LEFT_PAREN));
        return i10 + 1;
    }
}
