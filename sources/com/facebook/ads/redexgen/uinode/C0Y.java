package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
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

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-56, -41, -48, -48, -57, -50, -63};
    }

    public C0Y(C0Z c0z, String str) {
        this.A00 = c0z;
        this.A01 = str;
    }

    public final void A02(JSONObject jSONObject) {
        try {
            jSONObject.put(A00(0, 7, 21) + this.A00.getName(), this.A01);
        } catch (JSONException unused) {
        }
    }
}
