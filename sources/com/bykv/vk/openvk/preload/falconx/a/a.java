package com.bykv.vk.openvk.preload.falconx.a;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {
    public static WebResourceResponse a(InputStream inputStream, Map<String, String> map) {
        boolean z8;
        if (inputStream != null) {
            try {
                String str = map.get("content-type");
                if (TextUtils.isEmpty(str)) {
                    str = map.get("Content-Type");
                }
                if (str != null) {
                    z8 = str.contains("font/ttf");
                } else {
                    z8 = false;
                }
                if (z8) {
                    return new WebResourceResponse(null, null, 200, "OK", map, inputStream);
                }
                WebResourceResponse webResourceResponse = new WebResourceResponse(null, null, inputStream);
                webResourceResponse.setResponseHeaders(map);
                return webResourceResponse;
            } catch (Throwable th) {
                Log.e("WebResourceUtils", "getResponseWithHeaders error", th);
            }
        }
        return null;
    }
}
