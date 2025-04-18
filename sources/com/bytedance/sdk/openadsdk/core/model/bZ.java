package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.zB;

/* loaded from: classes.dex */
public class bZ {
    private long DSW;
    private long NjR;
    public long Sg;
    public boolean YFl;
    private int eT;

    /* renamed from: nc, reason: collision with root package name */
    private long f10703nc;
    private long qsH;

    /* renamed from: vc, reason: collision with root package name */
    private long f10704vc;
    private long wN;
    private zB tN = zB.Sg();
    private zB AlY = zB.Sg();

    public long AlY() {
        return this.DSW;
    }

    public long DSW() {
        return this.f10703nc;
    }

    public void Sg(zB zBVar) {
        this.AlY = zBVar;
        this.NjR = zBVar.YFl(this.tN);
    }

    public void YFl(zB zBVar, zB zBVar2, int i10, zB zBVar3) {
        this.wN = zBVar.YFl(this.tN);
        this.f10704vc = zBVar2.YFl(zBVar);
        this.DSW = i10;
        this.qsH = zBVar3.YFl(zBVar2);
    }

    public int qsH() {
        return this.eT;
    }

    public long tN() {
        return this.f10704vc;
    }

    public long vc() {
        return this.NjR;
    }

    public long wN() {
        return this.qsH;
    }

    public long Sg() {
        return this.wN;
    }

    public void YFl(zB zBVar) {
        this.tN = zBVar;
    }

    public zB YFl() {
        return this.tN;
    }

    public void YFl(long j3) {
        this.f10703nc = j3;
    }

    public void YFl(int i10) {
        this.eT = i10;
    }
}
