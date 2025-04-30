package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public abstract class PO {
    public static byte[] A00;
    public static String[] A01 = {"xPMOoUfbkmQ5kvnU3jbgLL47OcFEjU7z", "1dodMLotzUEJucQn2MWgY64F", "Ei0kY7ZOP", "czo3jP2JN", "", "hHdeWCinA2EaAz86iaUgwk6OrkZVXmHI", "CkfkaUvdCRi5J5AIUl6JSr62iIVQ3RiE", "AT3hLPm3hPYjZ73rxoY4ER"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static PN A00(C1636Yn c1636Yn, JSONObject jSONObject, C09416c c09416c, JA ja, C1391Oy c1391Oy, boolean z8) {
        boolean z9;
        String str;
        boolean z10 = z8;
        String A012 = A01(101, 3, 106);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String optString = jSONObject.optString(A01(51, 26, 80));
        arrayList3.add(optString);
        if (z10) {
            str = c09416c.A0R(optString);
            if (optString.equals(str)) {
                z10 = false;
                z9 = false;
            } else {
                z9 = z10;
            }
        } else {
            z9 = z10;
            str = optString;
        }
        ja.A04(J9.A0P, null);
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(A01(92, 4, 1));
            if (optJSONObject != null && optJSONObject.optString(A012) != null) {
                arrayList.add(optJSONObject.optString(A012));
                if (z9) {
                    optJSONObject.put(A012, c09416c.A0Q(optJSONObject.optString(A012)));
                }
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(A01(77, 15, 126));
            if (optJSONArray != null) {
                for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                    String optString2 = optJSONArray.optString(i9);
                    arrayList.add(optString2);
                    if (z9) {
                        optJSONArray.put(i9, c09416c.A0Q(optString2));
                    }
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray(A01(43, 8, 26));
            if (optJSONArray2 != null) {
                for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                    A03(arrayList, arrayList2, optJSONArray2.optJSONObject(i10), c09416c, z9);
                }
            } else {
                A03(arrayList, arrayList2, jSONObject, c09416c, z9);
            }
        } catch (JSONException unused) {
            c1391Oy.A04(C8A.A15, A01(0, 43, 79));
        }
        return new PN(jSONObject, str, arrayList, arrayList2, arrayList3, z10);
    }

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{69, 114, 114, 111, 114, 32, 116, 114, 97, 110, 115, 102, 111, 114, 109, 105, 110, 103, 32, 74, 83, 79, 78, 32, 105, 110, 32, 117, 112, 100, 97, 116, 101, 67, 97, 99, 104, 101, 100, 85, 114, 108, 115, 54, 52, 39, 58, 32, 38, 48, 57, 123, 102, 113, 126, 114, 118, 124, 64, 108, 123, 116, 64, 115, 126, 102, 122, 109, 64, 119, 107, 114, 115, 64, 106, 109, 115, 84, 95, 85, 110, 82, 80, 67, 85, 110, 88, 92, 80, 86, 84, 66, 39, 45, 33, 32, 2, 6, 10, Ascii.FF, Ascii.SO, 80, 87, 73, 107, 116, 121, 120, 114, 66, 104, 111, 113};
    }

    static {
        A02();
    }

    public static void A03(ArrayList<String> videoUrls, ArrayList<String> arrayList, JSONObject jSONObject, C09416c c09416c, boolean z8) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(96, 5, 36));
        if (optJSONObject != null) {
            String A012 = A01(101, 3, 106);
            if (A01[1].length() == 1) {
                throw new RuntimeException();
            }
            A01[7] = "G1neCcMuoIIVUH8A2yIEObncf";
            if (optJSONObject.optString(A012) != null) {
                String optString = optJSONObject.optString(A012);
                videoUrls.add(optString);
                if (z8) {
                    optJSONObject.put(A012, c09416c.A0Q(optString));
                }
            }
        }
        String A013 = A01(104, 9, 82);
        if (!TextUtils.isEmpty(jSONObject.optString(A013))) {
            String optString2 = jSONObject.optString(A013);
            arrayList.add(optString2);
            if (z8) {
                jSONObject.put(A013, c09416c.A0R(optString2));
            }
        }
    }
}
