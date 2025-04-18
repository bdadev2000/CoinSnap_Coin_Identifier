package com.instagram.common.viewpoint.core;

import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class WS implements InterfaceC0840Rr {
    public static byte[] A01;
    public static String[] A02 = {"tUJYxHq8rXjSvzNkaZErPg", "Hl6JSJOVoKK9bKT5jd2Pvq0tZsDPJ0dE", "oSGC6AFXBpr4lbJyv6MQNQ9waO2ute48", "z7WBfzJJ407mMZZPgmkMQfCriHOQCxec", "E0947yqUj", "IMqeF", "h4IMHr5Sq", "nmzUvfQCAff3ThOCongsk2"};
    public final /* synthetic */ C7j A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 70);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-104, -74, -61, 124, -55, 117, -71, -66, -56, -59, -74, -55, -72, -67, 117, -72, -60, -54, -61, -55, -70, -57, -56, -125, 4, 41, 51, 48, 33, 52, 35, 40, 37, 36, -32, 35, 47, 53, 46, 52, 37, 50, 51, -18, -32, 18, 37, 51, 48, 47, 46, 51, 37, -6, -32};
    }

    static {
        A01();
    }

    public WS(C7j c7j) {
        this.A00 = c7j;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0840Rr
    public final void ABa(InterfaceC0838Rp interfaceC0838Rp) {
        if (this.A00.A04().A9O() && interfaceC0838Rp != null) {
            String str = A00(24, 31, 122) + interfaceC0838Rp.A6X();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0840Rr
    public final void ABt(Exception exc) {
        String str;
        if (this.A00.A04().A9O()) {
            str = JI.A01;
            String A00 = A00(0, 24, 15);
            String[] strArr = A02;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "IahxZOLaTB1sAAwpoanyBYHnO0M02siA";
            strArr2[3] = "J682L6mt58ljZzHK0luG4OOmc7ySlZqX";
            Log.e(str, A00, exc);
        }
    }
}
