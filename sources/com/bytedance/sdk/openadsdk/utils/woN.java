package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;

/* loaded from: classes.dex */
public class woN {
    public static void zp(SSWebView sSWebView, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
        sSWebView.zp(str, hashMap);
    }
}
