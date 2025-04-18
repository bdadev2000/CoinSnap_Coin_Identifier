package com.bytedance.adsdk.YFl.YFl;

/* loaded from: classes.dex */
public class Sg extends RuntimeException {
    public Sg(String str, Throwable th2) {
        super("Unable to parse expression:".concat(String.valueOf(str)), th2);
    }
}
