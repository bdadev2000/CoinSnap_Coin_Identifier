package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class YS implements C7v {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 62);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{0, 5, Ascii.DLE, 5, Ascii.ESC, Ascii.DC4, Ascii.SYN, Ascii.VT, 7, 1, Ascii.ETB, Ascii.ETB, Ascii.CR, 10, 3, Ascii.ESC, Ascii.VT, Ascii.DC4, Ascii.DLE, Ascii.CR, Ascii.VT, 10, Ascii.ETB, Ascii.ESC, 7, Ascii.VT, 17, 10, Ascii.DLE, Ascii.SYN, Ascii.GS, Ascii.ESC, Ascii.SI, 1, Ascii.GS, 39, 34, 55, 34, 60, 51, 49, 44, 32, 38, 48, 48, 42, 45, 36, 60, 44, 51, 55, 42, 44, 45, 48, 60, 40, 38, 58, 36, 33, 52, 33, 63, 48, 50, 47, 35, 37, 51, 51, 41, 46, 39, 63, 47, 48, 52, 41, 47, 46, 51, 63, 51, 52, 33, 52, 37, 63, 43, 37, 57};
    }

    @Override // com.facebook.ads.redexgen.uinode.C7v
    public final void AAQ(InterfaceC04097u interfaceC04097u) {
        String[] stringArray;
        Integer integer;
        Integer integer2;
        if (!AdInternalSettings.sDataProcessingOptionsUpdate.getAndSet(false)) {
            return;
        }
        synchronized (AdInternalSettings.sSettingsBundle) {
            stringArray = AdInternalSettings.sSettingsBundle.getStringArray(A00(35, 27, 93));
            integer = AdInternalSettings.sSettingsBundle.getInteger(A00(0, 35, 122));
            integer2 = AdInternalSettings.sSettingsBundle.getInteger(A00(62, 33, 94));
        }
        interfaceC04097u.AD5(stringArray, integer, integer2);
    }
}
