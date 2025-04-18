package com.instagram.common.viewpoint.core;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.Locale;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public abstract class O4 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 82);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{11, 8, 5, 31, 30, 80, 8, 6, 11, 4, 1, 119, 107, 107, 111, 108, 37, 48, 48, 104, 104, 104, 49, 58, 108, 49, 121, 126, 124, 122, 125, 112, 112, 116, 49, 124, 112, 114, 49, 45, 45, 41, 42, 99, 118, 118, 46, 46, 46, 119, Utf8.REPLACEMENT_BYTE, 56, 58, 60, 59, 54, 54, 50, 119, 58, 54, 52, 118, 74, 92, 77, 116, 80, 65, 92, 93, 122, 86, 87, 77, 92, 87, 77, 116, 86, 93, 92};
    }

    public static String A01(String str) {
        return TextUtils.isEmpty(str) ? A00(38, 25, 11) : String.format(Locale.US, A00(11, 27, 77), str);
    }

    public static void A03(WebView webView) {
        webView.loadUrl(A00(0, 11, 56));
        webView.clearCache(true);
    }

    public static void A04(WebView webView) {
        WebSettings settings = webView.getSettings();
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        } else {
            try {
                WebSettings.class.getMethod(A00(63, 19, 107), new Class[0]).invoke(settings, 0);
            } catch (Exception unused) {
            }
        }
    }
}
