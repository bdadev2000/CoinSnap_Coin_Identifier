package com.bytedance.sdk.component.qsH.tN;

/* loaded from: classes.dex */
public abstract class Sg implements Comparable<Sg>, Runnable {
    private long AlY;
    private String Sg;
    private int YFl;
    private Runnable tN;

    /* renamed from: vc, reason: collision with root package name */
    private long f10434vc;
    private long wN;

    public Sg(String str) {
        this.YFl = 5;
        this.Sg = str;
    }

    public long AlY() {
        return this.wN;
    }

    public long DSW() {
        return this.f10434vc - this.wN;
    }

    public String Sg() {
        return this.Sg;
    }

    public void YFl(int i10) {
        this.YFl = i10;
    }

    public Runnable qsH() {
        return this.tN;
    }

    public long tN() {
        return this.AlY;
    }

    public long vc() {
        return this.wN - this.AlY;
    }

    public long wN() {
        return this.f10434vc;
    }

    public void Sg(long j3) {
        this.wN = j3;
    }

    public int YFl() {
        return this.YFl;
    }

    public void tN(long j3) {
        this.f10434vc = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public int compareTo(Sg sg2) {
        if (YFl() < sg2.YFl()) {
            return 1;
        }
        return YFl() >= sg2.YFl() ? -1 : 0;
    }

    public Sg(int i10, String str) {
        this.YFl = i10;
        this.Sg = str;
    }

    public void YFl(long j3) {
        this.AlY = j3;
    }

    public Sg(String str, Runnable runnable) {
        this.YFl = 5;
        this.Sg = str;
        this.tN = runnable;
    }
}
