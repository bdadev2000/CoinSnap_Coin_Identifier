package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class BS extends AbstractC1413Pu {
    public static byte[] A01;
    public static String[] A02 = {"OtZHHid0c6Ryk9CDDBq47ngXcNldIUWH", "JwrlVwQ54E2WwwQvkywQUOYHwL6g1bho", "WFiM5IPZvaQ4xMZm5xgvQ3FNROoMY2Kr", "al6ZIECO6LO12zMiuvYELaWNpYKDhozx", "wYAPbQwhGVteNN6MGdL8gA6824n9AnKf", "jTihIhEYsz4XSFMEjn7OlZEBUOzI3KNS", "mXaQIkSzTCVxPQuz9HLogqhmhIjgMyMR", "pEgzTi4rZbqmTwficQat67UuNHBZNbaD"};
    public final /* synthetic */ UA A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 86);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {17, 4, -1, 0, 10, -28, 9, Ascii.SI, 0, Ascii.CR, Ascii.SO, Ascii.SI, 4, Ascii.SI, -4, 7, -32, 17, 0, 9, Ascii.SI};
        String[] strArr = A02;
        if (strArr[6].charAt(4) != strArr[3].charAt(4)) {
            throw new RuntimeException();
        }
        A02[2] = "e0kN46odqljBIthjpUkTXG9hdDsWHsKW";
        A01 = bArr;
    }

    static {
        A01();
    }

    public BS(UA ua) {
        this.A00 = ua;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C9H c9h) {
        MC mc;
        mc = this.A00.A06;
        mc.A44(A00(0, 21, 69), c9h);
    }
}
