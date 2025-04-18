package com.bytedance.adsdk.YFl.Sg.tN.YFl;

import com.bytedance.adsdk.YFl.Sg.Sg.YFl.aIu;
import java.util.Deque;

/* loaded from: classes.dex */
public class Sg extends vc {
    @Override // com.bytedance.adsdk.YFl.Sg.tN.YFl.vc
    public int YFl(String str, int i10, Deque<com.bytedance.adsdk.YFl.Sg.Sg.YFl> deque, com.bytedance.adsdk.YFl.Sg.tN.YFl yFl) {
        if ('\'' != YFl(i10, str)) {
            return yFl.YFl(str, i10, deque);
        }
        int i11 = i10 + 1;
        int length = str.length();
        int i12 = i11;
        while (i12 < length && YFl(i12, str) != '\'') {
            i12++;
        }
        if (YFl(i12, str) == '\'') {
            deque.push(new aIu(str.substring(i11, i12)));
            return i12 + 1;
        }
        throw new com.bytedance.adsdk.YFl.YFl.YFl("String expression not surrounded by '", str.substring(i11 - 1));
    }
}
