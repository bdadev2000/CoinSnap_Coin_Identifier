package com.bytedance.sdk.openadsdk.component.wN;

import com.bytedance.sdk.openadsdk.core.model.Wwa;

/* loaded from: classes.dex */
public class Sg {
    private int AlY;
    private int Sg;
    private int YFl;
    private Wwa tN;

    /* renamed from: vc, reason: collision with root package name */
    private boolean f10622vc;
    private String wN;

    public Sg(int i10, int i11, Wwa wwa) {
        this.YFl = i10;
        this.Sg = i11;
        this.tN = wwa;
    }

    public Wwa AlY() {
        return this.tN;
    }

    public int Sg() {
        return this.YFl;
    }

    public void YFl(boolean z10) {
        this.f10622vc = z10;
    }

    public int tN() {
        return this.Sg;
    }

    public String vc() {
        return this.wN;
    }

    public int wN() {
        return this.AlY;
    }

    public boolean YFl() {
        return this.f10622vc;
    }

    public Sg(int i10, int i11, int i12, String str) {
        this.YFl = i10;
        this.Sg = i11;
        this.AlY = i12;
        this.wN = str;
    }
}
