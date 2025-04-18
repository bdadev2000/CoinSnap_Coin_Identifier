package com.bytedance.adsdk.YFl.Sg.tN.YFl;

import com.bytedance.adsdk.YFl.Sg.Sg.YFl.EH;
import java.util.Deque;

/* loaded from: classes.dex */
public class DSW extends vc {
    private boolean YFl(String str, int i10, Deque<com.bytedance.adsdk.YFl.Sg.Sg.YFl> deque) {
        if ('-' == YFl(i10, str)) {
            if (deque.peek() != null && !com.bytedance.adsdk.YFl.Sg.AlY.tN.YFl(deque.peek().YFl())) {
                return false;
            }
            if (com.bytedance.adsdk.YFl.Sg.wN.YFl.tN(YFl(i10 + 1, str))) {
                return true;
            }
            throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i10));
        }
        return com.bytedance.adsdk.YFl.Sg.wN.YFl.tN(YFl(i10, str));
    }

    @Override // com.bytedance.adsdk.YFl.Sg.tN.YFl.vc
    public int YFl(String str, int i10, Deque<com.bytedance.adsdk.YFl.Sg.Sg.YFl> deque, com.bytedance.adsdk.YFl.Sg.tN.YFl yFl) {
        char YFl;
        if (!YFl(str, i10, deque)) {
            return yFl.YFl(str, i10, deque);
        }
        int i11 = YFl(i10, str) == '-' ? i10 + 1 : i10;
        boolean z10 = false;
        while (true) {
            YFl = YFl(i11, str);
            if (com.bytedance.adsdk.YFl.Sg.wN.YFl.tN(YFl) || (!z10 && YFl == '.')) {
                i11++;
                if (YFl == '.') {
                    z10 = true;
                }
            }
        }
        if (YFl != '.') {
            deque.push(new EH(str.substring(i10, i11)));
            return i11;
        }
        throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i10, i11));
    }
}
