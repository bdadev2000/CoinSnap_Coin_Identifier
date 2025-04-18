package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class PP {
    public static byte[] A00;
    public static String[] A01 = {"qzld4Qy39Azn7KYrj1sXbPZPr2qv6GgB", "1yyYiWnNu", "Zg1voNH89a01plQdKkVOTIE3hJJ00If9", "AO", "oO", "LhD7lTYtuMCYkgD1PnemOg5ERT23PX0", "YB3LukNHUN2DaV56yaS9yy46zwl6QYin", "pfYbPlfLNAe5pcAyURRpn9lPUi7k7Z7a"};
    public static final String A02;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 105);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        byte[] bArr = {Ascii.NAK, 51, 53, 58, 55, -14, 63, 59, 69, 69, -14, 56, 65, 68, -14, 56, 59, 62, 55, -14, 71, 68, 62, Ascii.FF, -14, -61, -31, -29, -24, -27, -96, -19, -23, -13, -13, -96, -26, -17, -14, -96, -23, -19, -31, -25, -27, -96, -11, -14, -20, -70, -96, 33, 37, 48, -46, -1, -1, -4, -1, -83, -4, -3, -14, -5, -10, -5, -12, -83, -16, -18, -16, -11, -14, -15, -83, -13, -10, -7, -14, -83, -13, -4, -1, -83, 2, -1, -7, -57, -83, -26, -30, -31, Ascii.NAK, 4, 9, 5, Ascii.SO, 3, 5, -18, 5, Ascii.DC4, Ascii.ETB, Ascii.SI, Ascii.DC2, Ascii.VT, -61, -65, -56, -22, -25, -37, -35, -21, -21, -31, -26, -33, -104, -34, -31, -28, -35, -104, -19, -22, -28, -78, -104, -2, 32, Ascii.GS, 17, 19, 33, 33, Ascii.ETB, Ascii.FS, Ascii.NAK, -50, Ascii.ETB, Ascii.ESC, Ascii.SI, Ascii.NAK, 19, -50, 35, 32, Ascii.SUB, -24, -50, -7, Ascii.ESC, Ascii.CAN, Ascii.FF, Ascii.SO, Ascii.FS, Ascii.FS, Ascii.DC2, Ascii.ETB, Ascii.DLE, -55, Ascii.US, Ascii.DC2, Ascii.CR, Ascii.SO, Ascii.CAN, -55, Ascii.RS, Ascii.ESC, Ascii.NAK, -29, -55, 73, 88, 81, -16, -5, -6, -9, -15};
        String[] strArr = A01;
        if (strArr[7].charAt(12) != strArr[2].charAt(12)) {
            throw new RuntimeException();
        }
        A01[1] = "7l6kM9ADseoG9RLfCJpKjz7J";
        A00 = bArr;
    }

    static {
        A04();
        A02 = PP.class.getSimpleName();
    }

    public static WebResourceResponse A00(C1070Yn c1070Yn, C03756c c03756c, WebResourceRequest webResourceRequest, PN pn, boolean z10) {
        String uri = webResourceRequest.getUrl().toString();
        if (pn.A05) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            String guessContentTypeFromName = URLConnection.guessContentTypeFromName(uri);
            if (pn.A01.contains(uri)) {
                StringBuilder sb2 = new StringBuilder();
                String url = A03(108, 21, 15);
                sb2.append(url).append(uri).toString();
                File cachedFile = c03756c.A0O(uri);
                if (cachedFile != null) {
                    if (z10) {
                        String url2 = pn.A00;
                        if (uri.equals(url2)) {
                            return A02(hashMap, guessContentTypeFromName, new PH(c1070Yn.A01(), new FileInputStream(cachedFile), new TC(c1070Yn, uri)));
                        }
                    }
                    return A01(hashMap, guessContentTypeFromName, cachedFile);
                }
                StringBuilder sb3 = new StringBuilder();
                String url3 = A03(0, 25, 105);
                sb3.append(url3).append(uri).toString();
            }
            if (pn.A02.contains(uri)) {
                StringBuilder sb4 = new StringBuilder();
                String url4 = A03(129, 22, 69);
                sb4.append(url4).append(uri).toString();
                File A0P = c03756c.A0P(uri);
                if (A0P != null) {
                    return A01(hashMap, guessContentTypeFromName, A0P);
                }
                StringBuilder sb5 = new StringBuilder();
                String url5 = A03(25, 26, 23);
                sb5.append(url5).append(uri).toString();
            }
            if (pn.A03.contains(uri)) {
                StringBuilder sb6 = new StringBuilder();
                String url6 = A03(151, 22, 64);
                sb6.append(url6).append(uri).toString();
                return PE.A00(c1070Yn, webResourceRequest, webResourceRequest.getUrl(), guessContentTypeFromName, hashMap);
            }
        } catch (IOException e2) {
            StringBuilder sb7 = new StringBuilder();
            String url7 = A03(54, 35, 36);
            String mimeType = sb7.append(url7).append(uri).toString();
            String url8 = A03(89, 17, 55);
            Log.e(url8, mimeType, e2);
        }
        return null;
    }

    public static WebResourceResponse A01(HashMap<String, String> responseHeaders, String str, File file) throws FileNotFoundException {
        return A02(responseHeaders, str, new FileInputStream(file));
    }

    public static WebResourceResponse A02(HashMap<String, String> responseHeaders, String str, InputStream inputStream) {
        return new WebResourceResponse(str, null, 200, A03(106, 2, 11), responseHeaders, inputStream);
    }

    public static void A05(C03987f c03987f, String str, String str2) {
        C8B c8b = new C8B(A03(51, 3, 116));
        c8b.A05(1);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A03(176, 2, 31), str);
            jSONObject.put(A03(178, 3, 28), str2);
            c8b.A07(jSONObject);
        } catch (JSONException unused) {
        }
        c03987f.A07().A9b(A03(173, 3, 124), C8A.A12, c8b);
    }
}
