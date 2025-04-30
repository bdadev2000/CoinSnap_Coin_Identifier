package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.av, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1729av implements C6U {
    public static String[] A05 = {"udExhBBZigXHD765", "VCbgsgLtwNII3DWSf3Df", "sJ3cSki5Ts1gkpIy0", "hudoenMQ7OfQJqKUwYviTAHkC5956B", "3GiDDKpH2PPu7", "VAV0OzmNbR17K1ZAu", "eIBPlY8UdwZIA15YBWaPzTw3Re1i6Niv", "w6ShnqqW6c5InpRu2fdQvGfdyx0XiT7r"};
    public final /* synthetic */ AbstractC1739b5 A00;
    public final /* synthetic */ InterfaceC08181h A01;
    public final /* synthetic */ C08191i A02;
    public final /* synthetic */ C1636Yn A03;
    public final /* synthetic */ boolean A04;

    public C1729av(C08191i c08191i, C1636Yn c1636Yn, boolean z8, AbstractC1739b5 abstractC1739b5, InterfaceC08181h interfaceC08181h) {
        this.A02 = c08191i;
        this.A03 = c1636Yn;
        this.A04 = z8;
        this.A00 = abstractC1739b5;
        this.A01 = interfaceC08181h;
    }

    private void A00(boolean z8) {
        ArrayList arrayList;
        if (z8) {
            C1636Yn c1636Yn = this.A03;
            String[] strArr = A05;
            if (strArr[7].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ua1Hqbcww3qJrVJ6O";
            strArr2[2] = "2U70GzBDbPON7gkn8";
            if (C1225Ih.A1O(c1636Yn) && this.A04) {
                arrayList = this.A02.A02;
                arrayList.add(PC.A01(this.A03, this.A00, 1, new C1730aw(this)));
                return;
            } else {
                this.A01.AAf();
                return;
            }
        }
        this.A01.AAe(AdError.CACHE_ERROR);
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void AB2() {
        A00(false);
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void ABB() {
        A00(true);
    }
}
