package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.av, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1163av implements C6U {
    public static String[] A05 = {"udExhBBZigXHD765", "VCbgsgLtwNII3DWSf3Df", "sJ3cSki5Ts1gkpIy0", "hudoenMQ7OfQJqKUwYviTAHkC5956B", "3GiDDKpH2PPu7", "VAV0OzmNbR17K1ZAu", "eIBPlY8UdwZIA15YBWaPzTw3Re1i6Niv", "w6ShnqqW6c5InpRu2fdQvGfdyx0XiT7r"};
    public final /* synthetic */ AbstractC1173b5 A00;
    public final /* synthetic */ InterfaceC02521h A01;
    public final /* synthetic */ C02531i A02;
    public final /* synthetic */ C1070Yn A03;
    public final /* synthetic */ boolean A04;

    public C1163av(C02531i c02531i, C1070Yn c1070Yn, boolean z10, AbstractC1173b5 abstractC1173b5, InterfaceC02521h interfaceC02521h) {
        this.A02 = c02531i;
        this.A03 = c1070Yn;
        this.A04 = z10;
        this.A00 = abstractC1173b5;
        this.A01 = interfaceC02521h;
    }

    private void A00(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            C1070Yn c1070Yn = this.A03;
            String[] strArr = A05;
            if (strArr[7].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ua1Hqbcww3qJrVJ6O";
            strArr2[2] = "2U70GzBDbPON7gkn8";
            if (C0659Ih.A1O(c1070Yn) && this.A04) {
                arrayList = this.A02.A02;
                arrayList.add(PC.A01(this.A03, this.A00, 1, new C1164aw(this)));
                return;
            } else {
                this.A01.AAf();
                return;
            }
        }
        this.A01.AAe(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.uinode.C6U
    public final void AB2() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.uinode.C6U
    public final void ABB() {
        A00(true);
    }
}
