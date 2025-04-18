package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class PI implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ PM A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{108, 64, 90, 67, 75, Ascii.SI, 65, 64, 91, Ascii.SI, 95, 78, 93, 92, 74, Ascii.SI, 92, 74, 93, 89, 74, 93, Ascii.SI, 66, 74, 92, 92, 78, 72, 74, 123, 76, 76, 81, 76, Ascii.RS, 78, 95, 76, 77, 87, 80, 89, Ascii.RS, 116, 109, 113, 112, Ascii.RS, 87, 80, Ascii.RS, 78, 81, 77, 74, 115, 91, 77, 77, 95, 89, 91, Ascii.RS, 103, 115, 114, 110, 77, 99, Byte.MAX_VALUE, 32, Base64.padSymbol, 49, 55, 36, Ascii.SUB, 33, 36, 49, 36, 108, 97, 104, 125, Ascii.FS, Ascii.SUB};
    }

    public PI(PM pm, String str) {
        this.A00 = pm;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0825Oy c0825Oy;
        String str;
        C0825Oy c0825Oy2;
        if (KL.A02(this)) {
            return;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(this.A01);
                str = this.A00.A05;
                if (str.equals(jSONObject.optString(A00(64, 7, 47)))) {
                    this.A00.A0C(PK.A00(jSONObject.optString(A00(81, 4, 49))), jSONObject.optString(A00(71, 10, 108), A00(85, 2, 78)));
                } else {
                    c0825Oy2 = this.A00.A04;
                    c0825Oy2.A04(C8A.A11, A00(0, 30, 6));
                }
            } catch (JSONException e2) {
                c0825Oy = this.A00.A04;
                c0825Oy.A04(C8A.A15, A00(30, 34, 23) + e2.getMessage());
            }
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
