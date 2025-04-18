package com.bytedance.sdk.component.vc.YFl.wN;

import java.util.UUID;

/* loaded from: classes.dex */
public abstract class wN implements Comparable<wN>, Runnable {
    private String tN;
    private int YFl = 5;
    private String Sg = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    public wN(String str) {
        this.tN = str;
    }

    public void YFl(int i10) {
        this.YFl = i10;
    }

    public int YFl() {
        return this.YFl;
    }

    @Override // java.lang.Comparable
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public int compareTo(wN wNVar) {
        if (YFl() < wNVar.YFl()) {
            return 1;
        }
        return YFl() >= wNVar.YFl() ? -1 : 0;
    }
}
