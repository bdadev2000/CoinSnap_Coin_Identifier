package com.bytedance.adsdk.zp.zp;

/* loaded from: classes.dex */
public class lMd extends RuntimeException {
    public lMd(String str, Throwable th) {
        super("Unable to parse expression:".concat(String.valueOf(str)), th);
    }
}
