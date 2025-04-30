package com.bytedance.sdk.component.adexpress.dynamic.jU;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.jU.lMd;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Bj {
    private static String lMd;
    private static final Set<String> zp = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));

    public static double lMd(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString(TtmlNode.ATTR_TTS_FONT_SIZE));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x042a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bytedance.sdk.component.adexpress.dynamic.jU.lMd.KS zp(java.lang.String r23, java.lang.String r24, java.lang.String r25, boolean r26, boolean r27, int r28, com.bytedance.sdk.component.adexpress.dynamic.KS.ku r29, double r30, int r32, double r33, java.lang.String r35, com.bytedance.sdk.component.adexpress.lMd.tG r36) {
        /*
            Method dump skipped, instructions count: 1227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.jU.Bj.zp(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, com.bytedance.sdk.component.adexpress.dynamic.KS.ku, double, int, double, java.lang.String, com.bytedance.sdk.component.adexpress.lMd.tG):com.bytedance.sdk.component.adexpress.dynamic.jU.lMd$KS");
    }

    public static int[] lMd(String str, float f9, boolean z8) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.jU.zp());
            textView.setTextSize(f9);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z8) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static boolean lMd() {
        return !TextUtils.isEmpty(lMd);
    }

    public static String zp(String str) {
        String[] split;
        return (TextUtils.isEmpty(str) || (split = str.split("adx:")) == null || split.length < 2) ? "" : split[1];
    }

    private static lMd.KS zp(lMd.KS ks, String str, String str2, String str3) {
        if (str.contains("union")) {
            ks.zp = 0.0f;
            ks.lMd = 0.0f;
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = zp(str);
            }
            if (TextUtils.isEmpty(str3)) {
                ks.zp = 0.0f;
                ks.lMd = 0.0f;
            } else {
                return zp(str3, str2);
            }
        }
        return ks;
    }

    public static lMd.KS zp(String str, String str2) {
        return zp(str, str2, false);
    }

    public static lMd.KS zp(String str, String str2, boolean z8) {
        lMd.KS ks = new lMd.KS();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] zp2 = zp(str, (float) lMd(str2), z8);
            ks.zp = zp2[0];
            ks.lMd = zp2[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == 0.0d) {
                ks.lMd = 0.0f;
            }
        } catch (Exception unused) {
        }
        return ks;
    }

    public static int[] zp(String str, float f9, boolean z8) {
        int[] lMd2 = lMd(str, f9, z8);
        return new int[]{com.bytedance.sdk.component.adexpress.jU.QR.lMd(com.bytedance.sdk.component.adexpress.jU.zp(), lMd2[0]), com.bytedance.sdk.component.adexpress.jU.QR.lMd(com.bytedance.sdk.component.adexpress.jU.zp(), lMd2[1])};
    }

    public static String zp() {
        return lMd;
    }
}
