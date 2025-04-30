package com.meta.analytics.dsp.uinode;

import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ca, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1819ca<ModelType, StateType> {
    public static byte[] A06;
    public static String[] A07 = {"K3IBH5IY5D9A1s0otTNJJ1EDvo1qLs", "HR7iyfZ1MOS5huP42RSdRpCkeBunQMOf", "", "bEqFTGguyIKgMYqaAFudqvCpFKGvMgpm", "3wGEEC73gwsSkVWXWqLxZk", "wIAJ3aMEmj6qTKsV0aDgjtipvoJzkW0C", "SCvpsyQDnQo4JnEbtI83SB", "GSqpB1BwT3x"};
    public static final C1819ca A08;
    public boolean A00;
    public final C1819ca A01;
    public final ModelType A02;
    public final StateType A03;
    public final String A04;
    public final List<InterfaceC1822cd<ModelType, StateType>> A05;

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{66, 85, 81, 99, 92, 91, 85, 90, 96, 48, 77, 96, 77, Ascii.FF, 95, 84, 91, 97, 88, 80, Ascii.FF, 90, 91, 96, Ascii.FF, 79, 91, 90, 96, 77, 85, 90, Ascii.FF, 77, Ascii.FF, 98, 85, 81, 99, Ascii.FF, 77, 95, Ascii.FF, 89, 91, 80, 81, 88, 0, 8, Ascii.VT, Ascii.SI, Ascii.DC4};
    }

    static {
        A02();
        A08 = new C1819ca(null, null, A01(48, 5, 42), Collections.emptyList(), A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cb != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1819ca(com.meta.analytics.dsp.uinode.C1820cb<ModelType, StateType> r7) {
        /*
            r6 = this;
            java.lang.Object r1 = com.meta.analytics.dsp.uinode.C1820cb.A01(r7)
            java.lang.Object r2 = com.meta.analytics.dsp.uinode.C1820cb.A02(r7)
            java.lang.String r3 = com.meta.analytics.dsp.uinode.C1820cb.A03(r7)
            java.util.List r0 = com.meta.analytics.dsp.uinode.C1820cb.A04(r7)
            if (r0 != 0) goto L1f
            java.util.List r4 = java.util.Collections.emptyList()
        L16:
            com.facebook.ads.redexgen.X.ca r5 = com.meta.analytics.dsp.uinode.C1820cb.A00(r7)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L1f:
            java.util.List r4 = com.meta.analytics.dsp.uinode.C1820cb.A04(r7)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1819ca.<init>(com.facebook.ads.redexgen.X.cb):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public C1819ca(ModelType modeltype, StateType statetype, String str, List<InterfaceC1822cd<ModelType, StateType>> list, C1819ca c1819ca) {
        if (!(modeltype instanceof View)) {
            this.A02 = modeltype;
            this.A03 = statetype;
            this.A04 = str;
            this.A01 = c1819ca;
            this.A00 = false;
            this.A05 = list;
            return;
        }
        throw new IllegalArgumentException(A01(0, 48, 123));
    }

    public static <ModelType, StateType> C1820cb<ModelType, StateType> A00(ModelType model, StateType state, String str) {
        return new C1820cb<>(model, state, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cd != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final void A03(InterfaceC1809cP interfaceC1809cP) {
        Iterator<InterfaceC1822cd<ModelType, StateType>> it = this.A05.iterator();
        while (it.hasNext()) {
            it.next().A5c(this, interfaceC1809cP);
        }
        EnumC1810cQ A8J = interfaceC1809cP.A8J(this);
        String[] strArr = A07;
        if (strArr[1].charAt(23) == strArr[3].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[7] = "xMDdEaQw2xH";
        strArr2[2] = "";
        if (A8J == EnumC1810cQ.A02) {
            this.A00 = true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public final boolean A04() {
        return this.A00;
    }
}
