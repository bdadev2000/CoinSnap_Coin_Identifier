package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class dQp {
    public static void zp(Uri uri, com.bytedance.sdk.openadsdk.core.RCv rCv) {
        if (rCv == null || !rCv.zp(uri)) {
            return;
        }
        try {
            rCv.lMd(uri);
        } catch (Exception e4) {
            e4.toString();
        }
    }

    public static String zp(WebView webView, int i9) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        return userAgentString + " open_news open_news_u_s/" + i9;
    }
}
