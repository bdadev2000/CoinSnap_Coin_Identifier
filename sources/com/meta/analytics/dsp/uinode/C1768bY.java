package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1768bY extends AbstractC07930h {
    public static byte[] A02;
    public static String[] A03 = {"jy5CHS8ciK95qvgyZPKNzTZ", "EsJYGwS5VmRo2OpDKfhEPxAAyWa", "TXamSNcIJ7UnME9", "aAqXHcETEDrJIQ0", "iKc7fPJ", "AeuUMR7bsIhvkygvb", "MOi5LCZvXht1yXQHfTxaoFALkw", "2sehTzR2RD89PLQKMZ0CUhyomJdrMDfZ"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 96);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {42, 40, 51, 53, 40, 51, 46, 35, 75, 70, 79, 90};
        String[] strArr = A03;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        A03[5] = "wR51MZdRiuTx9tajcMEJR1ABXy";
        A02 = bArr;
    }

    static {
        A01();
        A04 = C1768bY.class.getSimpleName();
    }

    public C1768bY(C1636Yn c1636Yn, J2 j22, String str, Uri uri, Map<String, String> mExtraData) {
        super(c1636Yn, j22, str);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC07930h
    public final EnumC07920g A0C() {
        J4 j42 = J4.A05;
        String queryParameter = this.A00.getQueryParameter(A00(0, 8, 58));
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                j42 = J4.values()[Integer.valueOf(queryParameter).intValue()];
            } catch (Exception unused) {
            }
        }
        J2 j22 = super.A01;
        String str = this.A02;
        String[] strArr = A03;
        String priorityString = strArr[4];
        if (priorityString.length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        A03[7] = "bcTdT52UhpG9HF3JMoKdCwsgb4e7WHJf";
        j22.A9v(str, this.A01, this.A00.getQueryParameter(A00(8, 4, 95)), j42);
        return EnumC07920g.A08;
    }
}
