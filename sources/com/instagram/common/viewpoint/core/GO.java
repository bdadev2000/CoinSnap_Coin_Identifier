package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class GO extends AbstractC0919Us {
    public static byte[] A02;
    public static String[] A03 = {"dvnbyrX9L5Wlup6c2JnWkpTYBAz3QIun", "ITj", "KqeTcLSx6Zay5vtxcnHqZ", "bGeXa7nDz1byFpBCq22utpLnb", "UYph9iPsD3jee8BOLuPQ6r57rjKJpmVb", "DfaYbRSw6X21pxGApii0qweOJ64z1eNB", "52vckdype7aS5lLwU46sLHF0XTMQAze7", "uuBWL9In1wjj"};
    public final /* synthetic */ GL A00;
    public final /* synthetic */ C1197cN A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 105);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{67, 116, 116, 105, 116, 38, 99, 126, 99, 101, 115, 114, 111, 104, 97, 38, 103, 101, 114, 111, 105, 104, 119, 117, 120, 120, 113, 102, 64, 109, 100, 113, 116, 112, 115, 118, 66, 77, 72, 80, 65, 86, 65, 64, 123, 71, 72, 77, 71, 79, 123, 64, 65, 72, 69, 93, 123, 73, 87, 2, 24, 52, 8, 25, 14, 10, 31, 2, 29, 14, 52, 10, 24, 52, 8, 31, 10, 52, 29, 89, 102, 125, 122, 98, 102, 118, 90, 119};
    }

    static {
        A01();
    }

    public GO(GL gl, C1197cN c1197cN) {
        this.A00 = gl;
        this.A01 = c1197cN;
    }

    @Override // com.instagram.common.viewpoint.core.O1
    public final void ABD() {
        boolean z2;
        this.A00.A0G = true;
        z2 = this.A00.A0H;
        if (z2) {
            this.A00.A0A();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0170  */
    @Override // com.instagram.common.viewpoint.core.AbstractC0919Us, com.instagram.common.viewpoint.core.O1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ABV(java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.GO.ABV(java.lang.String, java.util.Map):void");
    }

    @Override // com.instagram.common.viewpoint.core.O1
    public final void ACA() {
        C0515Ei c0515Ei;
        C1195cL c1195cL;
        C1195cL c1195cL2;
        C1195cL c1195cL3;
        c0515Ei = this.A00.A04;
        InterfaceC1229ct A0E = c0515Ei.A0E();
        c1195cL = this.A00.A02;
        A0E.A46(c1195cL != null);
        c1195cL2 = this.A00.A02;
        if (c1195cL2 != null) {
            c1195cL3 = this.A00.A02;
            c1195cL3.A03();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0919Us, com.instagram.common.viewpoint.core.O1
    public final void ACx() {
        C0515Ei c0515Ei;
        C1195cL c1195cL;
        c0515Ei = this.A00.A04;
        c0515Ei.A0E().A48();
        c1195cL = this.A00.A02;
        c1195cL.A07();
    }

    @Override // com.instagram.common.viewpoint.core.O1
    public final void AEC() {
    }
}
