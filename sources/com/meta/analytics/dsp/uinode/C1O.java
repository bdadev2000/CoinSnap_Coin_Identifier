package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1O, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C1O {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{43, 41, 58, 55, 61, 59, 45, 52, -39, -54, -37, -36, -46, -41, -48, 46, 33, Ascii.FS, Ascii.GS, 39, Ascii.ETB, 45, 42, 36};
    }

    public static List<C1G> A01(JSONArray jSONArray, JSONObject jSONObject, C1636Yn c1636Yn, C1S c1s) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                if (i9 == 0) {
                    A03(jSONObject2, jSONObject);
                }
                C1G A002 = C1G.A00(jSONObject2);
                c1s.A3N(A002, jSONObject2);
                arrayList.add(A002);
            } catch (JSONException e4) {
                c1636Yn.A07().A9a(A00(8, 7, 31), C8A.A2B, new C8B(e4));
            }
        }
        return arrayList;
    }

    public static void A03(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!next.equals(A00(15, 9, 110)) && !next.equals(A00(0, 8, 126)) && !jSONObject.has(next)) {
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
    }
}
