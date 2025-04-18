package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ui, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0965Ui implements LU {
    public int A00;
    public final LU A01;
    public final LU A02;

    public C0965Ui(LU lu, int i10, LU lu2) {
        this.A01 = lu;
        this.A00 = i10;
        this.A02 = lu2;
    }

    @Override // com.facebook.ads.redexgen.uinode.LU
    public final void AE8(String str) {
        if (this.A00 > 0) {
            this.A01.AE8(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.AE8(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.LU
    public final void flush() {
        this.A02.flush();
    }
}
