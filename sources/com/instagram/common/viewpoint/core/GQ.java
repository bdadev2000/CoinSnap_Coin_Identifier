package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class GQ extends AbstractC1222cm {
    public static byte[] A02;
    public static String[] A03 = {"FXNBCWXiStej7hPExkUYAqHU7xYJWQz0", "1k", "9V456DvY4LqOh9I9hdT7Vdo5", "hY2FptqSd7XbZZsJCz2yOGxQcUuE9Eo6", "F2N3RsuOcTrAQaEUExDI4U65CqttWDRl", "hYiRMwjZqKFmNKhRfgQ6FfhFwFErfvFO", "BBwXtDWFWjLC6NycZYUWGAP3M0YJ", ""};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-100, -73, -65, -62, -69, -70, 118, -54, -59, 118, -59, -58, -69, -60, 118, -62, -65, -60, -63, 118, -53, -56, -62, -112, 118, -45, -48, -43, -46};
        if (A03[3].charAt(0) == 'g') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[4] = "n2WgzR0RMCkX50JDMRkryQ8YygezODnU";
        strArr[5] = "Oz9myBlwI7NBoyftyrFAavzWMm25M0Ie";
    }

    static {
        A01();
        A04 = GQ.class.getSimpleName();
    }

    public GQ(C1045Zs c1045Zs, J7 j7, String str, Uri uri, Map<String, String> mExtraData, C01770o c01770o, boolean z2) {
        super(c1045Zs, j7, str, c01770o, z2);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1222cm
    public final EnumC01700g A0D() {
        EnumC01700g enumC01700g = EnumC01700g.A09;
        if (((AbstractC1222cm) this).A02) {
            enumC01700g = A0G();
        }
        if (!M3.A0g(((AbstractC01710h) this).A00, enumC01700g, this.A01)) {
            A0E(this.A01, enumC01700g);
        }
        return enumC01700g;
    }

    public final EnumC01700g A0G() {
        if (A0F(this.A00)) {
            EnumC01700g actionOutcome = EnumC01700g.A0A;
            return actionOutcome;
        }
        try {
            EnumC01700g actionOutcome2 = L2.A05(new L2(), ((AbstractC01710h) this).A00, L5.A00(this.A00.getQueryParameter(A00(25, 4, 19))), ((AbstractC01710h) this).A02, this.A01);
            return actionOutcome2;
        } catch (Exception unused) {
            String str = A00(0, 25, 2) + this.A00.toString();
            EnumC01700g actionOutcome3 = EnumC01700g.A04;
            return actionOutcome3;
        }
    }
}
