package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Is, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0612Is implements SharedViewpointManager {
    public static byte[] A07;
    public static String[] A08 = {"BoSaZzMMCoBoab6kFzr2tWGVTni5", "Vk9jbaVPkS6rtGXBWv67wEIKcLe3GnXQ", "GJsVZyBqNYZRU43kGmqANe", "Uv9MZIJr", "GbPwVrzkFOEMxWNTB1P9oG5CUgrItJXy", "gWutc4DO", "1FOrRj10jdO8", "rnakDij4LZYpzXru71B"};
    public InterfaceC1268dj A00;
    public C1255dV A01;
    public final InterfaceC1278dv A03;
    public final InterfaceC1269dk A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC1268dj A02 = new JB(this);

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A07 = new byte[]{-28};
    }

    static {
        A04();
    }

    public C0612Is(ViewpointQeConfig viewpointQeConfig, InterfaceC1278dv interfaceC1278dv, InterfaceC1269dk interfaceC1269dk) {
        this.A05 = viewpointQeConfig;
        this.A03 = interfaceC1278dv;
        this.A04 = interfaceC1269dk;
    }

    public static C0612Is A01() {
        return new C0612Is(new ViewpointQeConfig(), new JS(), null);
    }

    private void A05(AbstractC1271dm abstractC1271dm, InterfaceC1274dq interfaceC1274dq, IA ia) {
        this.A01 = C1255dV.A00(this.A05, abstractC1271dm, interfaceC1274dq, ia);
        if (0 != 0) {
            this.A01.A01(null);
        }
        this.A01.A02(this.A02);
        String[] strArr = A08;
        if (strArr[4].charAt(11) == strArr[1].charAt(11)) {
            throw new RuntimeException();
        }
        A08[7] = "2MhPhimmgHBptxasGUILH2";
    }

    private void A06(DspViewableNode dspViewableNode, C1276dt c1276dt) {
        C1255dV c1255dV = this.A01;
        if (c1255dV != null && dspViewableNode != null) {
            if (this.A05.A00 && c1276dt != null) {
                c1255dV.A04(dspViewableNode, c1276dt);
            } else {
                c1255dV.A03(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C1276dt c1276dt, Cdo cdo) {
        C1255dV c1255dV = this.A01;
        if (c1255dV != null && dspViewableNode != null && cdo != null) {
            if (this.A05.A00 && c1276dt != null) {
                cdo.A00 = dspViewableNode.hashCode() + A02(0, 1, 27) + cdo.A05 + c1276dt;
                c1255dV.A05(dspViewableNode, c1276dt, cdo);
            } else {
                c1255dV.A06(dspViewableNode, cdo);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, Cdo<?, ?> cdo) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, cdo);
    }

    public final void A0A(AbstractC1271dm abstractC1271dm, View view) {
        if (abstractC1271dm != null && view != null) {
            A05(abstractC1271dm, new JD(view, this.A03), new C03376z(null));
        }
    }
}
