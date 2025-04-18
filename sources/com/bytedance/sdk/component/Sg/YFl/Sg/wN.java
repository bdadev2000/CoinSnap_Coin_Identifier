package com.bytedance.sdk.component.Sg.YFl.Sg;

/* loaded from: classes.dex */
final class wN {
    boolean AlY;
    wN DSW;
    int Sg;
    final byte[] YFl;
    int tN;

    /* renamed from: vc, reason: collision with root package name */
    wN f10333vc;
    boolean wN;

    public wN() {
        this.YFl = new byte[8192];
        this.wN = true;
        this.AlY = false;
    }

    public final wN Sg() {
        wN wNVar;
        wN wNVar2 = this.f10333vc;
        if (wNVar2 != this) {
            wNVar = wNVar2;
        } else {
            wNVar = null;
        }
        wN wNVar3 = this.DSW;
        if (wNVar3 != null) {
            wNVar3.f10333vc = wNVar2;
        }
        wN wNVar4 = this.f10333vc;
        if (wNVar4 != null) {
            wNVar4.DSW = wNVar3;
        }
        this.f10333vc = null;
        this.DSW = null;
        return wNVar;
    }

    public final wN YFl() {
        this.AlY = true;
        return new wN(this.YFl, this.Sg, this.tN, true, false);
    }

    public final wN YFl(wN wNVar) {
        wNVar.DSW = this;
        wNVar.f10333vc = this.f10333vc;
        this.f10333vc.DSW = wNVar;
        this.f10333vc = wNVar;
        return wNVar;
    }

    public wN(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.YFl = bArr;
        this.Sg = i10;
        this.tN = i11;
        this.AlY = z10;
        this.wN = z11;
    }
}
