package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Wwa {
    public static void YFl(com.bytedance.sdk.component.NjR.AlY alY, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
        alY.YFl(str, hashMap);
    }
}
