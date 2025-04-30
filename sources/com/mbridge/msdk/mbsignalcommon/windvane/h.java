package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class h {
    protected Context b;

    /* renamed from: c, reason: collision with root package name */
    protected Object f16697c;

    /* renamed from: d, reason: collision with root package name */
    protected WindVaneWebView f16698d;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.b = context;
        this.f16698d = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f16697c = obj;
        this.f16698d = windVaneWebView;
    }
}
