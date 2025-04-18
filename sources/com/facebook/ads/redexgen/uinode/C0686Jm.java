package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Jm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0686Jm implements RJ {
    public static byte[] A04;
    public int A00;
    public String A01;
    public Map<String, List<String>> A02;
    public byte[] A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-79, -56, -41, -38, -46, -43, -50, -125, -56, -43, -43, -46, -43};
    }

    public C0686Jm(HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            this.A00 = httpURLConnection.getResponseCode();
            this.A01 = httpURLConnection.getURL().toString();
        } catch (IOException e2) {
            Log.e(getClass().getSimpleName(), A00(0, 13, 34), e2);
        }
        this.A02 = httpURLConnection.getHeaderFields();
        this.A03 = bArr;
    }

    @Override // com.facebook.ads.redexgen.uinode.RJ
    public final byte[] A68() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.uinode.RJ
    public final String A69() {
        byte[] bArr = this.A03;
        if (bArr != null) {
            return new String(bArr);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.RJ
    public final Map<String, List<String>> A79() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.RJ
    public final int A83() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.RJ
    public final String getUrl() {
        return this.A01;
    }
}
