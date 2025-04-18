package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC02310l {
    public static byte[] A00;
    public static String[] A01 = {"4Fi3cRKjKwjo", "pfwDmZC0EgnSHGG3akphHDiSxRpjxWfc", "OwKyFlCBYoW0NHpoiuFf2exuC", "FTixXnraWBf7yQ9sseM6khJqknPB2", "87lno6sBf8EnLpq9v2WrftgOrdI4V", "hcLSbPhFObKmfxN2jEGb0Jf71EM4", "MV7VLhl", "AE1L1nhQpeYYJvXkfFkincgpQRIdvuit"};

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{101, 64, 4, 77, 87, 4, 77, 74, 82, 69, 72, 77, 64, 69, 80, 65, 64, 4, 83, 77, 80, 76, 75, 81, 80, 4, 80, 75, 79, 65, 74, 10, 10, Ascii.ESC, 2, 39, 38, 55, 38, 32, 55, 42, 44, 45, Ascii.FS, 48, 55, 49, 42, 45, 36, 48, 35, 36, 60, 43, 38, 35, 46, 43, 62, 35, 37, 36, Ascii.NAK, 40, 47, 34, 43, 60, 35, 37, 56, 98, 115, 96, 97, 123, 124, 117};
    }

    static {
        A05();
    }

    public static EnumC02290j A00(JSONObject jSONObject) {
        return EnumC02290j.A00(jSONObject.optString(A02(52, 21, 114)));
    }

    public static C1204ba A01(C1070Yn c1070Yn, JSONObject jSONObject, String str) {
        return new C1204ba(jSONObject, c1070Yn, str);
    }

    public static Collection<String> A03(C1070Yn c1070Yn, JSONObject jSONObject) {
        JSONArray jSONArray = null;
        try {
            String detectionStringJSON = jSONObject.optString(A02(35, 17, 123));
            if (!TextUtils.isEmpty(detectionStringJSON)) {
                JSONArray detectionStringsArray = new JSONArray(detectionStringJSON);
                jSONArray = detectionStringsArray;
            }
        } catch (JSONException e2) {
            c1070Yn.A07().A9a(A02(73, 7, 42), C8A.A2C, new C8B(e2));
        }
        return A04(jSONArray);
    }

    public static Collection<String> A04(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            hashSet.add(jSONArray.optString(i10));
        }
        return hashSet;
    }

    public static boolean A06(C1070Yn c1070Yn, InterfaceC02300k interfaceC02300k, J2 j22) {
        EnumC02290j A7E = interfaceC02300k.A7E();
        if (A7E != null) {
            EnumC02290j invalidationBehavior = EnumC02290j.A03;
            if (A7E != invalidationBehavior) {
                boolean packageInstalled = false;
                Collection<String> A6n = interfaceC02300k.A6n();
                if (A6n == null || A6n.isEmpty()) {
                    return false;
                }
                Iterator<String> it = A6n.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (LM.A04(c1070Yn, it.next())) {
                        packageInstalled = true;
                        break;
                    }
                }
                EnumC02290j invalidationBehavior2 = EnumC02290j.A02;
                if (packageInstalled != (A7E == invalidationBehavior2)) {
                    return false;
                }
                String A6T = interfaceC02300k.A6T();
                boolean isEmpty = TextUtils.isEmpty(A6T);
                String[] strArr = A01;
                String clientToken = strArr[7];
                if (clientToken.charAt(25) != strArr[1].charAt(25)) {
                    throw new RuntimeException();
                }
                A01[2] = "Y0XUyINdugWnNFuKX72emGLWk";
                if (!isEmpty) {
                    j22.A9h(A6T, null);
                    return true;
                }
                c1070Yn.A07().A9a(A02(32, 3, 83), C8A.A0Z, new C8B(A02(0, 32, 28)));
                return true;
            }
        }
        return false;
    }
}
