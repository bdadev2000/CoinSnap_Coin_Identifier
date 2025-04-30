package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class TB extends RD {
    public static byte[] A01;
    public final /* synthetic */ PQ A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{90, 81, 88, 80, 87, 92, 93, 102, 88, 93, 102, 80, 87, 93, 92, 65};
    }

    public TB(PQ pq) {
        this.A00 = pq;
    }

    @Override // com.meta.analytics.dsp.uinode.RD
    public final void A03() {
        int i9;
        boolean z8;
        boolean z9;
        if (!this.A00.A08.A07()) {
            this.A00.A08.A05();
            if (!TextUtils.isEmpty(this.A00.A05.A12())) {
                Map<String, String> A05 = new C1349Ni().A03(this.A00.A0B).A02(this.A00.A08).A04(this.A00.A05.A0O()).A05();
                StringBuilder append = new StringBuilder().append(A00(0, 0, 11));
                i9 = this.A00.A01;
                A05.put(A00(0, 16, 10), append.append(i9).toString());
                this.A00.A07.A9g(this.A00.A05.A12(), A05);
                C1U.A07(this.A00.A05.A0y(), this.A00.A06);
                this.A00.A06.A0E().A2k();
                z8 = this.A00.A03;
                if (!z8) {
                    C2O.A00(this.A00.A05.A0N());
                }
                z9 = this.A00.A04;
                if (!z9) {
                    this.A00.A09.A43(this.A00.A0A.A7B());
                }
            }
        }
    }
}
