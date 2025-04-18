package com.bytedance.sdk.component.qsH;

/* loaded from: classes.dex */
public abstract class qsH implements Comparable<qsH>, Runnable {
    private String Sg;
    private int YFl;

    public qsH(String str, int i10) {
        this.YFl = 0;
        this.YFl = i10 == 0 ? 5 : i10;
        this.Sg = str;
    }

    public String getName() {
        return this.Sg;
    }

    public int getPriority() {
        return this.YFl;
    }

    public void setPriority(int i10) {
        this.YFl = i10;
    }

    @Override // java.lang.Comparable
    public int compareTo(qsH qsh) {
        if (getPriority() < qsh.getPriority()) {
            return 1;
        }
        return getPriority() >= qsh.getPriority() ? -1 : 0;
    }

    public qsH(String str) {
        this.YFl = 5;
        this.Sg = str;
    }
}
