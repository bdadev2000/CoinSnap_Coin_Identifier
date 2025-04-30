package com.bytedance.sdk.component.ku;

/* loaded from: classes.dex */
public abstract class ku implements Comparable<ku>, Runnable {
    private String lMd;
    private int zp;

    public ku(String str, int i9) {
        this.zp = 0;
        this.zp = i9 == 0 ? 5 : i9;
        this.lMd = str;
    }

    public String getName() {
        return this.lMd;
    }

    public int getPriority() {
        return this.zp;
    }

    public void setPriority(int i9) {
        this.zp = i9;
    }

    @Override // java.lang.Comparable
    public int compareTo(ku kuVar) {
        if (getPriority() < kuVar.getPriority()) {
            return 1;
        }
        return getPriority() >= kuVar.getPriority() ? -1 : 0;
    }

    public ku(String str) {
        this.zp = 5;
        this.lMd = str;
    }
}
