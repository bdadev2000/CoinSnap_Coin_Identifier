package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class rkt {
    public static void YFl(Uri uri, com.bytedance.sdk.openadsdk.core.hQ hQVar) {
        if (hQVar == null || !hQVar.YFl(uri)) {
            return;
        }
        try {
            hQVar.Sg(uri);
        } catch (Exception e2) {
            e2.toString();
        }
    }

    public static String YFl(WebView webView, int i10) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        return userAgentString + " open_news open_news_u_s/" + i10;
    }
}
