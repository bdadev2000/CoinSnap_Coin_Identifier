package com.bytedance.sdk.component.wN.tN;

import com.bytedance.sdk.component.wN.eT;
import java.util.Map;

/* loaded from: classes.dex */
public class AlY<T> implements eT {
    private T AlY;
    private Map<String, String> DSW;
    private boolean NjR;
    private String Sg;
    private String YFl;
    private int eT;

    /* renamed from: nc, reason: collision with root package name */
    private com.bytedance.sdk.component.wN.DSW f10470nc;
    private boolean qsH;
    private T tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10471vc;
    private int wN;

    @Override // com.bytedance.sdk.component.wN.eT
    public Map<String, String> AlY() {
        return this.DSW;
    }

    @Override // com.bytedance.sdk.component.wN.eT
    public int DSW() {
        return this.eT;
    }

    @Override // com.bytedance.sdk.component.wN.eT
    public T Sg() {
        return this.tN;
    }

    public AlY YFl(tN tNVar, T t5) {
        this.tN = t5;
        this.YFl = tNVar.wN();
        this.Sg = tNVar.YFl();
        this.wN = tNVar.Sg();
        this.f10471vc = tNVar.tN();
        this.NjR = tNVar.EH();
        this.f10470nc = tNVar.rkt();
        this.eT = tNVar.lG();
        return this;
    }

    @Override // com.bytedance.sdk.component.wN.eT
    public T tN() {
        return this.AlY;
    }

    @Override // com.bytedance.sdk.component.wN.eT
    public boolean vc() {
        return this.NjR;
    }

    @Override // com.bytedance.sdk.component.wN.eT
    public boolean wN() {
        return this.qsH;
    }

    public AlY YFl(tN tNVar, T t5, Map<String, String> map, boolean z10) {
        this.DSW = map;
        this.qsH = z10;
        return YFl(tNVar, t5);
    }

    @Override // com.bytedance.sdk.component.wN.eT
    public String YFl() {
        return this.Sg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.wN.eT
    public void YFl(Object obj) {
        this.AlY = this.tN;
        this.tN = obj;
    }
}
