package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public abstract class LH {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 3);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{58, 43, 43, 55, 50, 56, 58, 47, 50, 52, 53, 116, 43, 63, Base64.padSymbol, 119, 123, 112, 113, 45, 44, 58, 42, 59, 32, 57, Base64.padSymbol, 32, 38, 39, 9, Ascii.SO, Ascii.DLE};
    }

    public static String A01(int i10, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(15, 4, 23), i10);
            jSONObject.put(A00(19, 11, 74), str);
            JSONObject errorMsgObj = jSONObject.put(A00(30, 3, 127), str2);
            errorMsgObj.toString();
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public static String A02(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String A002 = A00(0, 0, 103);
        if (isEmpty) {
            return A002;
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
            return A002;
        }
        String extension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        return extension;
    }

    public static boolean A04(String str) {
        return A00(0, 15, 88).equalsIgnoreCase(A02(str));
    }
}
