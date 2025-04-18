package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.cX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1207cX extends AbstractC01810s {
    public static String[] A03 = {"bMkIe4HHzeEAIK", "wvvk6JXeoGYrQUt6QbLdYhjQYYfi53dR", "vUaO3wypQXV6NlpG4vA9ecCDTWnzdNvx", "btTnQ58GcbMs0xrA6ag", "uPcaf", "63yRelZMLNO9Px2VKweOh9y3", "uSQS7xV", "6B8EZAVNEh4nIf7eFA6RS1UfCbAYEEi0"};
    public final /* synthetic */ InterfaceC01860x A00;
    public final /* synthetic */ GK A01;
    public final /* synthetic */ C0515Ei A02;

    public C1207cX(GK gk, C0515Ei c0515Ei, InterfaceC01860x interfaceC01860x) {
        this.A01 = gk;
        this.A02 = c0515Ei;
        this.A00 = interfaceC01860x;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01810s
    public final void A00() {
        this.A02.A0E().A47(this.A00 != null);
        if (this.A00 != null) {
            InterfaceC01860x interfaceC01860x = this.A00;
            String[] strArr = A03;
            if (strArr[7].charAt(12) == strArr[2].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[7] = "cKnhjiPIAYzu4sHLc7xY44MJ7ERYjZpV";
            strArr2[2] = "VDOCXXkozOxHXBfHSThQ3rlqz7gvm39S";
            interfaceC01860x.ABP(this.A01);
        }
    }
}
