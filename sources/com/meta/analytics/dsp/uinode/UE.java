package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UE implements InterfaceC1417Py {
    public static byte[] A01;
    public final /* synthetic */ UD A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.GS, Ascii.ESC, Ascii.CR, Ascii.SUB, Ascii.VT, 4, 1, Ascii.VT, 3};
    }

    public UE(UD ud) {
        this.A00 = ud;
    }

    public /* synthetic */ UE(UD ud, UK uk) {
        this(ud);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1417Py
    public final void ABD() {
        this.A00.A0U(true, A00(0, 9, 55));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1417Py
    public final void ABj() {
        AbstractC1739b5 abstractC1739b5;
        MC mc;
        InterfaceC1324Mj interfaceC1324Mj;
        J2 j22;
        AbstractC1739b5 abstractC1739b52;
        Q0 q02;
        Q0 q03;
        AbstractC1739b5 abstractC1739b53;
        C1636Yn c1636Yn;
        AbstractC1739b5 abstractC1739b54;
        C1636Yn c1636Yn2;
        abstractC1739b5 = this.A00.A0F;
        if (!TextUtils.isEmpty(abstractC1739b5.A12())) {
            j22 = this.A00.A0J;
            abstractC1739b52 = this.A00.A0F;
            String A12 = abstractC1739b52.A12();
            C1349Ni c1349Ni = new C1349Ni();
            q02 = this.A00.A07;
            C1349Ni A03 = c1349Ni.A03(q02.getViewabilityChecker());
            q03 = this.A00.A07;
            j22.A9g(A12, A03.A02(q03.getTouchDataRecorder()).A05());
            abstractC1739b53 = this.A00.A0F;
            C1U A0y = abstractC1739b53.A0y();
            c1636Yn = this.A00.A0I;
            C1U.A07(A0y, c1636Yn);
            abstractC1739b54 = this.A00.A0F;
            C2O.A00(abstractC1739b54.A0N());
            c1636Yn2 = this.A00.A0I;
            c1636Yn2.A0E().A2k();
        }
        mc = this.A00.A0N;
        interfaceC1324Mj = this.A00.A0O;
        mc.A43(interfaceC1324Mj.A7B());
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1417Py
    public final void AC4() {
        MC mc;
        InterfaceC1324Mj interfaceC1324Mj;
        mc = this.A00.A0N;
        interfaceC1324Mj = this.A00.A0O;
        mc.A43(interfaceC1324Mj.A6y());
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1417Py
    public final void ADj() {
        MC mc;
        mc = this.A00.A0N;
        mc.AB0(15);
    }
}
