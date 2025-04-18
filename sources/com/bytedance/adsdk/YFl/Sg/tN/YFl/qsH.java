package com.bytedance.adsdk.YFl.Sg.tN.YFl;

import a4.j;
import com.bytedance.adsdk.YFl.Sg.Sg.YFl.rkt;
import java.util.Deque;

/* loaded from: classes.dex */
public class qsH extends vc {
    @Override // com.bytedance.adsdk.YFl.Sg.tN.YFl.vc
    public int YFl(String str, int i10, Deque<com.bytedance.adsdk.YFl.Sg.Sg.YFl> deque, com.bytedance.adsdk.YFl.Sg.tN.YFl yFl) {
        if (!com.bytedance.adsdk.YFl.Sg.wN.YFl.AlY(YFl(i10, str))) {
            return yFl.YFl(str, i10, deque);
        }
        int i11 = i10 + 1;
        String str2 = new String(new char[]{YFl(i10, str), YFl(i11, str)});
        if (com.bytedance.adsdk.YFl.Sg.AlY.tN.YFl(str2) != null) {
            deque.push(new rkt(com.bytedance.adsdk.YFl.Sg.AlY.tN.YFl(str2)));
            return i10 + 2;
        }
        String valueOf = String.valueOf(YFl(i10, str));
        if (com.bytedance.adsdk.YFl.Sg.AlY.tN.YFl(valueOf) != null) {
            deque.push(new rkt(com.bytedance.adsdk.YFl.Sg.AlY.tN.YFl(valueOf)));
            return i11;
        }
        StringBuilder o10 = j.o("Unrecognized:", valueOf, "examine:");
        o10.append(str.substring(0, i10));
        throw new IllegalArgumentException(o10.toString());
    }
}
