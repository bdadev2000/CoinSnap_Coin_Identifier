package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.bS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1196bS implements AnonymousClass61 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1191bN A01;
    public final /* synthetic */ C1191bN A02;
    public final /* synthetic */ C8T A03;

    public C1196bS(C1191bN c1191bN, int i10, C8T c8t, C1191bN c1191bN2) {
        this.A01 = c1191bN;
        this.A00 = i10;
        this.A03 = c8t;
        this.A02 = c1191bN2;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAl() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAm() {
        InterfaceC02420x interfaceC02420x;
        interfaceC02420x = this.A01.A00;
        interfaceC02420x.ABw(this.A02, C0676Jb.A00(AdErrorType.NO_FILL));
    }
}
