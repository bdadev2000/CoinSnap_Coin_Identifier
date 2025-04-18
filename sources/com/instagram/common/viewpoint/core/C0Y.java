package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0Y, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0Y {
    public static byte[] A02;
    public final C0Z A00;
    public final String A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{55, 36, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, 52, 61, 14};
    }

    public C0Y(C0Z c0z, String str) {
        this.A00 = c0z;
        this.A01 = str;
    }

    public final void A02(JSONObject jSONObject) {
        try {
            jSONObject.put(A00(0, 7, 99) + this.A00.getName(), this.A01);
        } catch (JSONException unused) {
        }
    }
}
