package com.bytedance.adsdk.YFl.Sg.tN.YFl;

import java.util.Deque;

/* loaded from: classes.dex */
public abstract class vc {
    public int Sg(int i10, String str) {
        while (com.bytedance.adsdk.YFl.Sg.wN.YFl.YFl(YFl(i10, str))) {
            i10++;
        }
        return i10;
    }

    public char YFl(int i10, String str) {
        if (i10 >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i10);
    }

    public abstract int YFl(String str, int i10, Deque<com.bytedance.adsdk.YFl.Sg.Sg.YFl> deque, com.bytedance.adsdk.YFl.Sg.tN.YFl yFl);
}
