package com.bytedance.sdk.component.adexpress.dynamic.wN;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.wN.Sg;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class eT {
    private static String Sg;
    private static final Set<String> YFl = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));

    public static double Sg(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString(TtmlNode.ATTR_TTS_FONT_SIZE));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(3:178|(1:181)|182)(2:207|(5:209|184|(5:194|195|196|(3:198|(1:204)(1:201)|202)|205)|192|193))|183|184|(3:186|188|190)|194|195|196|(0)|205) */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0476 A[Catch: Exception -> 0x0487, TryCatch #3 {Exception -> 0x0487, blocks: (B:196:0x046c, B:198:0x0476, B:202:0x0480), top: B:195:0x046c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bytedance.sdk.component.adexpress.dynamic.wN.Sg.tN YFl(java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, boolean r22, int r23, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH r24, double r25, int r27, double r28, java.lang.String r30, com.bytedance.sdk.component.adexpress.Sg.GA r31) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.wN.eT.YFl(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH, double, int, double, java.lang.String, com.bytedance.sdk.component.adexpress.Sg.GA):com.bytedance.sdk.component.adexpress.dynamic.wN.Sg$tN");
    }

    public static int[] Sg(String str, float f10, boolean z10) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.AlY.YFl());
            textView.setTextSize(f10);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z10) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static boolean Sg() {
        return !TextUtils.isEmpty(Sg);
    }

    public static String YFl(String str) {
        String[] split;
        return (TextUtils.isEmpty(str) || (split = str.split("adx:")) == null || split.length < 2) ? "" : split[1];
    }

    private static Sg.tN YFl(Sg.tN tNVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            tNVar.YFl = 0.0f;
            tNVar.Sg = 0.0f;
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = YFl(str);
            }
            if (TextUtils.isEmpty(str3)) {
                tNVar.YFl = 0.0f;
                tNVar.Sg = 0.0f;
            } else {
                return YFl(str3, str2);
            }
        }
        return tNVar;
    }

    public static Sg.tN YFl(String str, String str2) {
        return YFl(str, str2, false);
    }

    public static Sg.tN YFl(String str, String str2, boolean z10) {
        Sg.tN tNVar = new Sg.tN();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] YFl2 = YFl(str, (float) Sg(str2), z10);
            tNVar.YFl = YFl2[0];
            tNVar.Sg = YFl2[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == 0.0d) {
                tNVar.Sg = 0.0f;
            }
        } catch (Exception unused) {
        }
        return tNVar;
    }

    public static int[] YFl(String str, float f10, boolean z10) {
        int[] Sg2 = Sg(str, f10, z10);
        return new int[]{com.bytedance.sdk.component.adexpress.AlY.qsH.Sg(com.bytedance.sdk.component.adexpress.AlY.YFl(), Sg2[0]), com.bytedance.sdk.component.adexpress.AlY.qsH.Sg(com.bytedance.sdk.component.adexpress.AlY.YFl(), Sg2[1])};
    }

    public static String YFl() {
        return Sg;
    }
}
